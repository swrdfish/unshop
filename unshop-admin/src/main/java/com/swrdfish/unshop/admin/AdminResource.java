package com.swrdfish.unshop.admin;

import com.swrdfish.unshop.database.Model;


public interface AdminResource {
    public AdminConfig[] getConfig();

    public Class<? extends Model> getModelClass();
}
