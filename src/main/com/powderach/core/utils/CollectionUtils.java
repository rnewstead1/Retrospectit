package core.utils;

import java.util.Random;

public class CollectionUtils {
    public static <E extends Enum<E>> E pickOneOf(Class<E> enumClass) {
        E[] values = enumClass.getEnumConstants();
        return values[new Random().nextInt(values.length)];
    }
}
