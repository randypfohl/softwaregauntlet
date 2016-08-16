package com.author_it.gauntlet.environment;

public class ProductionEnvironment implements EnvironmentDefinition {

    private ProductionEnvironment() {
    }

    public static ProductionEnvironment getInstance() {
        return new ProductionEnvironment();
    }

    @Override
    public String getSiteDomain() {
        return "http://huxleyclientqa.us-east-1.elasticbeanstalk.com";
    }
}
