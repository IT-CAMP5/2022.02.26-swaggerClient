package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Book;
import pl.camp.it.rest.model.GetAllBooksResponse;

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
public interface BookControllerApi  {

    /**
     * addBook
     *
     */
    @POST
    @Path("/book")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "addBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class) })
    public Book addBookUsingPOST(Book book);

    /**
     * deleteBook
     *
     */
    @DELETE
    @Path("/book/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "deleteBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class) })
    public void deleteBookUsingDELETE(@PathParam("id") Integer id);

    /**
     * getAllBooks
     *
     */
    @GET
    @Path("/book")
    @Produces({ "*/*" })
    @ApiOperation(value = "getAllBooks", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GetAllBooksResponse.class) })
    public GetAllBooksResponse getAllBooksUsingGET(@QueryParam("isbn")String isbn);

    /**
     * Find book by ID
     *
     * Returns book according to given id
     *
     */
    @GET
    @Path("/book/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Find book by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class) })
    public Book getBookByIdUsingGET(@PathParam("id") Integer id);

    /**
     * updateBook
     *
     */
    @PUT
    @Path("/book/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class) })
    public Book updateBookUsingPUT(Book book, @PathParam("id") Integer id);
}

