package com.depp3.steps.generals.runner.browser_manager;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public abstract class DriverManagerFactory {

    private static Map<DriverType, Supplier<DriverManager>> factoryMap = new HashMap<>();

    public static DriverManager create(DriverType type) {
        return factoryMap.get(type).get();
    }

    static {
        factoryMap.put(DriverType.CHROME, ChromeDriverManager::new);
        factoryMap.put(DriverType.FIREFOX, FirefoxDriverManager::new);
    }
}
