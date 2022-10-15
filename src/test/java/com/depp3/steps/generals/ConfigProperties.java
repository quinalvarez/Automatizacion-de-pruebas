package com.depp3.steps.generals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Properties;

public class ConfigProperties {

    private static Properties props = null;

    private ConfigProperties() {}

    public static String getProp(String prop) {
        getProps();
        return props.getProperty(prop);
    }
    private static Properties getProps() {
        if (Objects.isNull(props)) {
            props = new Properties();
            loadProps();
        }
        return props;
    }

    private static void loadProps() {
        try {
            props.load(Files.newInputStream(new File("src/test/resources/application-test.properties").toPath()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
