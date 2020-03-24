package com.forcademy.tutorial.restapi;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "cats" path)
 */
@Path("cats")
public class CatResource {
	
	/**
	 * A repository containing Cats.
	 */
	static CatRepository repository = new CatRepository();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     * @return Cats that will be returned as a "JSON" response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Cat> getCats() {
        return repository.getCats();
    }
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     * @param index of the Cat
     * @return Cat that will be returned as a "JSON" response.
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cat getCat(@PathParam("id") int index) {
        return repository.getCat(index);
    }
    
    /**
     * Method handling HTTP POST requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     * @return Cats that will be returned as a "JSON" response.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Cat createCat(Cat cat) {
        repository.addCat(cat);
        return cat;
    }
    
    /**
     * Method handling HTTP PUT requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     * @param index of the Cat
     * @param the new Cat instance for that index
     * @return Cat that will be returned as a "JSON" response.
     */
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Cat updateCat(@PathParam("id") int index, Cat cat) {
        repository.setCat(index, cat);
        return cat;
    }
    
    /**
     * Method handling HTTP DELETE requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     * @param index of the Cat to be deleted
     */
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cat deleteCat(@PathParam("id") int index) {
    	Cat cat = repository.getCat(index);
        repository.deleteCat(index);
        return cat;
    }
}
