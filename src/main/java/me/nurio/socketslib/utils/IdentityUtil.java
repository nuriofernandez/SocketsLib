package me.nurio.socketslib.utils;

import java.util.Random;

/**
 * This class manages identity numbers generation.
 */
public class IdentityUtil {

    private static Random random = new Random();

    /**
     * Generates a new identity number based on current time millis and random number.
     *
     * @return New identity number.
     */
    public static long timeBasedId() {
        long time = System.currentTimeMillis() * 10_000;
        int randomInt = random.nextInt(9000) + 1000;

        return time + randomInt;
    }

}