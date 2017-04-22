package com.vacoola.booking.web.ajax;

import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.sql.*;

@Path("")
public class bookingAjaxController {

    @GET
    @Path("/init")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTestResults() {
//        return Response.ok(JsonUtil.writeValue(result)).header(HttpHeaders.CONTENT_TYPE, mediaType).build();
        return Response.ok("").build();
    }


    @POST
    @Path("/propperties")
    @Produces(MediaType.APPLICATION_JSON)
    public Response auth(
            @QueryParam("location") Integer location,
            @QueryParam("owner") Integer owner,
            @QueryParam("dateFrom") Date dateFrom,
            @QueryParam("dateTo") Date dateTo) {

//        return Response.ok(JsonUtil.writeValue(result)).header(HttpHeaders.CONTENT_TYPE, mediaType).build();
        return Response.ok("").build();
    }
}