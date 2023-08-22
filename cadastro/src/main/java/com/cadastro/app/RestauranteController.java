package com.cadastro.app;

import com.cadastro.infra.RestauranteEntidade;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/restaurante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteController {
    @POST
    public Response criarRestaurante (RestauranteEntidade restauranteEntidade){
        return Response.ok().build();
    }

    @GET
    public List<RestauranteEntidade> buscarTodosRestaurantes(){
        return RestauranteEntidade.listAll();
    }
}
