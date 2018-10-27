package com.ast.jobsonthemapemployer;

/**
 * Created by AST on 11/24/2017.
 */

public class PostJob_class {
    String name;
    String type;
    String version_number;
    String feature;

    public PostJob_class(String name, String type, String version_number, String feature ) {
        this.name=name;
        this.type=type;
        this.version_number=version_number;
        this.feature=feature;

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
