package com.swrdfish.unshop.admin;

import com.swrdfish.unshop.auth.Auth;
import com.swrdfish.unshop.database.Model;
import spark.RouteGroup;

import java.util.List;


public interface Admin {

    /**
     * Sets the site name in the admin interface.
     * @param name site name
     */
    void setSiteName(String name);

    /**
     * Sets auth handler for admin interface.
     * @param auth authentication handler
     */
    void setAuth(Auth auth);

    /**
     * Registers a path where to search for admin templates.
     * @param path path to custom view directory
     */
    void registerViewPath(String path);

    /**
     * Returns the routes to be registered for the admin interface
     * @return
     */
    RouteGroup getRoutes();

    /**
     * Creates a new admin resource but does not add it.
     * @param modelClass the model to manage
     * @param configs
     * @return newly created resource
     */
    AdminResource newResource(Class<? extends Model> modelClass, AdminConfig ...configs);

    /**
     * Creates a new resource and adds it to the admin interface.
     * @param modelClass the model class to manage
     * @param configs
     * @return return the added resource instance
     */
    AdminResource addResource(Class< ? extends Model> modelClass, AdminConfig ...configs);

    /**
     * Adds the resource to the admin interface.
     * @param resource
     * @return
     */
    AdminResource addResource(AdminResource resource);

    /**
     * Get registered admin resources
     * @return
     */
    List<AdminResource> getResources();

    /**
     * Get admin resource with name
     * @param name
     * @return
     */
    AdminResource getResource(String name);
}
