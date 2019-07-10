package manawa.micronaut.poc.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        log.debug("debug");
        log.info("info");
        return "Hello World!";
    }

}
