
package sdu.cbs.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * GameObject is an entity that can contain multiple components.
 */
public class GameObject {
    private final Map<Class<?>, Object> components = new HashMap<>();

    public <T> void addComponent(Class<T> type, T component) {
        components.put(type, component);
    }

    public <T> T getComponent(Class<T> type) {
        return type.cast(components.get(type));
    }
}
