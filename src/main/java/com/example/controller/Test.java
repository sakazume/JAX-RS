package com.example.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by gyutr20 on 2015/07/08.
 */
@Path("test")
public class Test extends AbstractController {

    @GET
    public String template() {
        return render("/index.jade");
    }

}
