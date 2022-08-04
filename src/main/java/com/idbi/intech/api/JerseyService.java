package com.idbi.intech.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}
