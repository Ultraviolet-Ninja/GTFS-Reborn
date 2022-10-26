package jasmine.jragon.gtfsreborn.function;

public class ValidationUtil {
    public static void checkNotNull(Object[] objects) throws IllegalArgumentException {
        for (Object object : objects) {
            if (object == null) {
                throw new IllegalArgumentException("Element cannot be null");
            }
        }
    }
}
