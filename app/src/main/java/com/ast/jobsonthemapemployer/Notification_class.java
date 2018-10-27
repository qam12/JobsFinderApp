package com.ast.jobsonthemapemployer;

/**
 * Created by AST on 12/9/2017.
 */

public class Notification_class {

    String name;
    String type;
    String version_number;
    String feature;

    public Notification_class() {
    }

    public Notification_class(String name, String type, String version_number, String feature) {
        this.name = name;
        this.type = type;
        this.version_number = version_number;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVersion_number() {
        return version_number;
    }

    public String getFeature() {
        return feature;
    }
}