package com.cadastro.cross;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class Exceptions implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        if(exception instanceof EntityNotFoundException){
            return   Response.status(Response.Status.NOT_FOUND).entity(exception.getMessage()).build();
        } else if (exception instanceof BadRequestException) {

            return   Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();

        } else if (exception instanceof ValidationItemExist) {
            return   Response.status(Response.Status.CONFLICT).entity(exception.getMessage()).build();


        }
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("erro por favor entrar em contato com suporte").build();
    }
}
