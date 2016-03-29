/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author julio
 */
@Path("/user")
public class UserResource {
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(){
        User user = new User();
        user.setNome("Julio");
        user.setIdade(26);
        return user;
    }
}
