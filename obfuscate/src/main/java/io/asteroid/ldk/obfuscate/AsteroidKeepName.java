package io.asteroid.ldk.obfuscate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asteroid Keep Name Annotation, if a method is annotated with this annotation,
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface AsteroidKeepName {
    /**
     * If keepDesc is true, it will keep the method description. Include the
     * method parameter name, return type, and exception type.
     *
     * @return should keep description
     */
    boolean keepDesc() default true;
}
