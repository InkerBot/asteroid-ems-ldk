package io.asteroid.ldk.obfuscate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asteroid Override Side Effect Annotation, if a method is annotated with this annotation,
 * it will override the side effect analysis result.
 * <p>
 * In Asteroid obfuscate, if a method has no side effect, instructions order may be changed,
 * even some method will call multiple times.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AsteroidOverrideSideEffect {
    /**
     * If value is true, side effect analysis result will be overridden by has side effect.
     * If value is false, side effect analysis result will be overridden by no side effect.
     *
     * @return should override side effect
     */
    boolean value() default false;
}
