package vn.test.quanlyvattu.utils;

import java.util.UUID;

public class RandomStringGenerator {
    public static String generateRandomString() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 5);
    }
}
