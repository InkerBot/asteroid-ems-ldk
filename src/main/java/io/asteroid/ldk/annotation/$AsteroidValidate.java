package io.asteroid.ldk.annotation;

import io.asteroid.ldk.$Asteroid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asteroid Validate Annotation, if a method is annotated with this annotation,
 * it only can be invoked after validate. If value is not empty, it will check
 * if entitlement has the feature.
 *
 * If check failed, it will generate unexpected behavior, so you must check
 * entitlement has this feature by {@link $Asteroid#hasFeature(String)} manually.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface $AsteroidValidate {
  /**
   * If value is not empty, it will check if entitlement has the feature.
   *
   * @return feature id
   */
  String value() default "";
}
