package com.cadastro.app.controller;



import com.cadastro.app.dto.restaurante.RestauranteDtoRequest;
import com.cadastro.app.dto.restaurante.RestauranteDtoResponse;
import com.cadastro.app.service.RestauranteService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.SimplyTimed;
import org.eclipse.microprofile.metrics.annotation.Timed;

import java.net.URI;

@Path("/restaurante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class RestauranteController {
    @Inject
    RestauranteService restauranteService;

    @Counted(name = "Quantidade de buscas de restaurante")
    @SimplyTimed(name = "tempo simples de busca")
    @Timed(name = "Tempo completo de busca")
    @POST
    public Response criarRestaurante (RestauranteDtoRequest restauranteDtoRequest){
        restauranteService.cadastrarRestaurante(restauranteDtoRequest);

        return Response.created(URI.create("/restaurante")).build();
    }

    @Counted(name = "Quantidade de buscas de restaurante")
    @SimplyTimed(name = "tempo simples de busca")
    @Timed(name = "Tempo completo de busca")
    @GET
    @Path("{id}")
    public Response buscarTodosRestaurantePorId(@PathParam("id") Long id){
        RestauranteDtoResponse restauranteDtoResponse = restauranteService.buscarRestaurantePorId(id);
        return Response.ok(restauranteDtoResponse).build();
    }


}

