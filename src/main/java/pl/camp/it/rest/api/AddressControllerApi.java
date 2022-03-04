package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Address;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Book API
 *
 * <p>Book store books API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface AddressControllerApi  {

    /**
     * getAddressById
     *
     */
    @GET
    @Path("/address/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getAddressById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Address.class) })
    public Address getAddressByIdUsingGET(@PathParam("id") Integer id);
}

