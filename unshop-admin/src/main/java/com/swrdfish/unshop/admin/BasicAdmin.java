package com.swrdfish.unshop.admin;

import com.swrdfish.unshop.auth.Auth;
import com.swrdfish.unshop.database.Model;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.RouteGroup;
import spark.Spark;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class BasicAdmin implements Admin {
    Set<AdminResource> resources = new HashSet<>();
    Map<String, Route> routes = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSiteName(String name) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAuth(Auth auth) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerViewPath(String path) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteGroup getRoutes() {
        generateRoutes();
        return () -> {
            for(Map.Entry<String, Route> entry : routes.entrySet()) {
                Spark.get(entry.getKey(), entry.getValue());
            }
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminResource newResource(Class<? extends Model> modelClass, AdminConfig... configs) {
        return new BasicAdminResource(modelClass, configs);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminResource addResource(Class<? extends Model> modelClass, AdminConfig... configs) {
        AdminResource resource = newResource(modelClass, configs);
        resources.add(resource);
        return resource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminResource addResource(AdminResource resource) {
        resources.add(resource);
        return resource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<AdminResource> getResources() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminResource getResource(String name) {
        return null;
    }

    /**
     * Generate routes for every resource.
     */
    private void generateRoutes() {
        RouteGenerator.generate(resources, routes);
    }
}
