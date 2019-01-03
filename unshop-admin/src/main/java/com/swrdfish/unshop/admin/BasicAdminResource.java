package com.swrdfish.unshop.admin;

import com.swrdfish.unshop.database.Model;

public class BasicAdminResource implements AdminResource {
    private final Class<? extends Model> modelClass;
    private final AdminConfig[] config;

    BasicAdminResource(Class<? extends Model> modelClass, AdminConfig ...config) {
        this.modelClass = modelClass;
        this.config = config;
    }

    public AdminConfig[] getConfig() {
        return config;
    }

    public Class<? extends Model> getModelClass() {
        return modelClass;
    }
}
