package com.swrdfish.unshop.admin;

import com.swrdfish.unshop.auth.Auth;
import com.swrdfish.unshop.database.Model;
import spark.RouteGroup;

import java.util.List;

public class UnshopAdmin implements Admin {
    @Override
    public void setSiteName(String name) {

    }

    @Override
    public void setAuth(Auth auth) {

    }

    @Override
    public void registerViewPath(String path) {

    }

    @Override
    public RouteGroup getRouter() {
        return null;
    }

    @Override
    public AdminResource newResource(Model model, AdminConfig... configs) {
        return null;
    }

    @Override
    public AdminResource addResource(Model model, AdminConfig... configs) {
        return null;
    }

    @Override
    public AdminResource addResource(AdminResource resource) {
        return null;
    }

    @Override
    public List<AdminResource> getResources() {
        return null;
    }

    @Override
    public AdminResource getResource(String name) {
        return null;
    }
}
