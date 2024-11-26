package io.asteroid.ldk.obfuscate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asteroid Heavy Duty Annotation, if a method is annotated with this annotation,
 * it will be obfuscated with more complex algorithm. It will take more time to
 * execute, but the obfuscation result will be more secure.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AsteroidHeavyDuty {
    /**
     * If value is not empty, it will obfuscate with the specified virtual machine.
     * Otherwise, it will obfuscate with the default virtual machine.
     *
     * @return virtual machine, empty means default for heavy duty
     */
    String virtualMachine() default "";

    /**
     * If value is not empty, it will obfuscate with the specified polynomial ring level.
     * Otherwise, it will obfuscate with the default polynomial ring level.
     * <p>
     * Polynomial ring is a mathematical structure that is used to define the operations
     * of addition, subtraction, multiplication, and division.
     * <p>
     * level 0: no polynomial ring
     * level 1: 8-bit polynomial ring (byte)
     * level 2: 16-bit polynomial ring (short)
     * level 3: 32-bit polynomial ring (int, float) -- default
     * level 4: 64-bit polynomial ring (long, double) -- WARN: it will lost precision
     *
     * @return polynomial ring level, -1 means default for heavy duty
     */
    int polynomialRingLevel() default -1;

    /**
     * If value is not empty, it will obfuscate with the specified string obfuscation level.
     * Otherwise, it will obfuscate with the default string obfuscation level.
     *
     * @return string obfuscation level, -1 means default for heavy duty
     */
    int stringObfuscationLevel() default -1;

    /**
     * If value is true, dangerous flow behavior will be allowed. If flow key is not same as
     * expected, dangerous flow behavior will be triggered. Likes Unsafe memory access,
     * infinite loop, and so on.
     *
     * @return enable dangerous flow behavior
     */
    boolean dangerousFlow() default true;
}
