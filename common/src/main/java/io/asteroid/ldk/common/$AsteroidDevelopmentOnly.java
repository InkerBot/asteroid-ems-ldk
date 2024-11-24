package io.asteroid.ldk.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asteroid Development Only Annotation, if a class, method, or
 * field is annotated with this annotation, it will only be
 * available in development mode. It will be removed in the
 * production mode.
 *
 * All calls to the annotated class, method, or field will be
 * replaced with a dummy implementation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface $AsteroidDevelopmentOnly {
}
