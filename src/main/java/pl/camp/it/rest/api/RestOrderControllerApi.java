package pl.camp.it.rest.api;

import pl.camp.it.rest.model.OrderDTO;

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
public interface RestOrderControllerApi  {

    /**
     * getOrderById
     *
     */
    @GET
    @Path("/api/order/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class) })
    public OrderDTO getOrderByIdUsingGET(@PathParam("id") Integer id);
}

