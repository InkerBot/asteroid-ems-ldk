package io.asteroid.ldk.common;

/**
 * Asteroid SDK, provides some functions related to environment.
 * <p>
 * This class will not be included in the final jar file.
 * Invoke will be inlined after obfuscate.
 */
public class $Asteroid {
    private $Asteroid() {
        throw new UnsupportedOperationException();
    }

    /**
     * Check if the application is in development mode.
     *
     * @return true if in development mode
     */
    public static boolean inDevelopmentMode() {
        return true;
    }

    /**
     * Check the application is running without modification.
     * If the application is modified, it will return a random number,
     * otherwise, it will return the expected value.
     * <p>
     * It useful for checking native library unpacked or not. If detected
     * the application is modified, you can do some magic things. For example,
     * generate a exception after long time.
     * <p>
     * WIP: It only works on Windows. In other platforms, it will always return
     * the expected value.
     *
     * @param expected expected value
     * @return expected value if not modified, random value otherwise
     */
    public static int checkCrcImage(int expected) {
        return expected;
    }

    /**
     * Check the application is running with debugger. If detected, it will
     * return a random number, otherwise, it will return the expected value.
     * <p>
     * WIP: It only works on Windows. In other platforms, it will always return
     * the expected value.
     *
     * @param expected expected value
     * @return expected value if not running with debugger, random value otherwise
     */
    public static int checkDebugger(int expected) {
        return expected;
    }

    /**
     * Check the application is running on emulator. If detected, it will
     * return a random number, otherwise, it will return the expected value.
     * <p>
     * WIP: It only works on Windows. In other platforms, it will always return
     * the expected value.
     *
     * @param expected expected value
     * @return expected value if not running on emulator, random value otherwise
     */
    public static int checkEmulator(int expected) {
        return expected;
    }
}
