package com.service.cpedemo.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-22T09:36:30.453Z")

@RestSchema(schemaId = "cseDemo")
@RequestMapping(path = "/CPEDemo", produces = MediaType.APPLICATION_JSON)
public class CseDemoImpl {

    @Autowired
    private CseDemoDelegate userCseDemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseDemoDelegate.helloworld(name);
    }

}
