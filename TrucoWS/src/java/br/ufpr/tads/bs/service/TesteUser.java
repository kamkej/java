/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.bs.service;

import br.ufpr.tads.bs.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author julio
 */
@Path("print/myresource")
public class TesteUser {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> getIt(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrucoWSPU");
         EntityManager em = emf.createEntityManager();
         Query q = em.createQuery("SELECT u FROM Usuario u");
         List<Usuario> pl = q.getResultList();
        
         return pl;
    }
    
    @POST
   // @Produces(MediaType.APPLICATION_JSON)
  //  @Consumes(MediaType.APPLICATION_JSON)
    public String getIt(@FormParam("nome") String nome,
                        @FormParam("senha")String senha){
     
        
       return "msg,sucess";
       
    }
  /*  @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(@FormParam("nome") String nome,
                        @FormParam("senha")String senha){
     
        
       return Response.ok(nome).build();
       
    }*/
    
}
