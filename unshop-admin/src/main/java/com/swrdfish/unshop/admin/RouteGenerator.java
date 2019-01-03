package com.swrdfish.unshop.admin;

import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;
import spark.Route;

import java.util.Map;
import java.util.Set;


class RouteGenerator {
    public static void generate(Set<AdminResource> resources, Map<String, Route> routes) {
        for(AdminResource resource: resources) {
            String modelName = resource.getModelClass().getSimpleName();

            //skip anonymous model classes
            if(Strings.isNullOrEmpty(modelName)) continue;

            String pathName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, modelName);
            routes.put("/" + pathName, (req, res) -> modelName);
        }
    }
}
