package com.example;

import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.glassfish.jersey.server.ChunkedOutput;

/**
 * Root resource (exposed at "statictweets" path)
 */
@Path("stuckthread")
public class StuckThreadController {
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as an application/json response.
     */
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {

    	String response = "Payload PH TEST!!"
    	
    	return Response.ok()
    			.entity(response)
    			.header("Access-Control-Allow-Origin", "*")
    			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
    			.build();
    }
	
}