package com.example.framework;

import java.util.HashMap;
import java.util.Map;

public class ComponentRegistry {
    private static final Map<Class<?>, Object> components = new HashMap<>();

    public static void registerComponent(Class<?> interfaceClass, Object instance) {
        components.put(interfaceClass, instance);
    }

    public static Object fetchComponent(Class<?> interfaceClass) {
        return components.get(interfaceClass);
    }
}
