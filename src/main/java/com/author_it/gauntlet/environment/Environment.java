package com.author_it.gauntlet.environment;

import com.sun.javafx.runtime.SystemProperties;

public class Environment {

    private static EnvironmentDefinition environment;

    private Environment() {
    }

    public static EnvironmentDefinition getInstance() {
        if (environment == null) {
            String environmentName = SystemProperties.getProperty("env");
            environmentName = environmentName == null ? "" : environmentName;
            switch (environmentName) {
                default:
                    Environment.environment = ProductionEnvironment.getInstance();
            }
        }
        return environment;
    }
}
