package com.acme.statusmgr;

import com.acme.statusmgr.beans.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Controller for all web/REST requests about the status of servers
 * <p>
 * For initial school project - just handles info about this server
 * Syntax for URLS:
 * All start with /server
 * /status  will give back status of server
 * a param of 'name' specifies a requestor name to appear in response
 * <p>
 * Examples:
 * http://localhost:8080/server/status
 * <p>
 * http://localhost:8080/server/status?name=Noach
 */
@RestController
@RequestMapping("/server")
public class StatusController {

    protected static final String template = "Server Status requested by %s";
    protected final AtomicLong counter = new AtomicLong();
    private static SystemStatusRetrieverInterface ssri = new SystemStatusFacade();
    /**
     * Process a request for server status information
     *
     * @param name optional param identifying the requester
     * @return a ServerStatus object containing the info to be returned to the requestor
     */
    @RequestMapping("/status")
    public ServerStatus getStatus(@RequestParam(value = "name", defaultValue = "Anonymous") String name) {
        return new ServerStatus(counter.incrementAndGet(),
                String.format(template, name));
    }


    /**
     * Process a request for detailed server status information
     *
     * @param name    optional param identifying the requester
     * @param details optional param with a list of server status details being requested
     * @return an AbstractServerStatus object containing the info to be returned to the requestor
     */
    @RequestMapping("/status/detailed")
    public AbstractServerStatus getDetailedStatus(
            @RequestParam(value = "name", defaultValue = "Anonymous") String name,
            @RequestParam List<String> details) {

        AbstractServerStatus detailedStatus = new ServerStatus(counter.incrementAndGet(), String.format(template, name));

        if (details != null) {
            Logger logger = LoggerFactory.getLogger("StatusController");
            logger.info("Details were provided: " + Arrays.toString(details.toArray()));
            for (String detail : details) {
                switch (detail) {
                    case "availableProcessors" -> {
                        detailedStatus = new AvailableProcessorsDecorator(detailedStatus,ssri);
                    }
                    case "freeJVMMemory" -> {
                        detailedStatus = new FreeJVMMemoryDecorator(detailedStatus,ssri);
                    }
                    case "totalJVMMemory" -> {
                        detailedStatus = new TotalJVMMemoryDecorator(detailedStatus,ssri);
                    }
                    case "jreVersion" -> {
                        detailedStatus = new JreVersionDecorator(detailedStatus,ssri);
                    }
                    case "tempLocation" -> {
                        detailedStatus = new TempLocationDecorator(detailedStatus,ssri);
                    }
                    default -> {
                        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid details option: " + detail);
                    }
                }
            }


        }
        return detailedStatus;
    }

    static void setSsri(SystemStatusRetrieverInterface ssri){
        StatusController.ssri = ssri;
    }
}
