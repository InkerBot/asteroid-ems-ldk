package io.asteroid.ldk.license;

import io.asteroid.ldk.common.$AsteroidDevelopmentOnly;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Asteroid License SDK, provides some functions related to license.
 * <p>
 * This class will not be included in the final jar file.
 * Invoke will be inlined after obfuscate.
 */
public final class $AsteroidLicense {
    @$AsteroidDevelopmentOnly
    private static String $dev$entitlementId;
    @$AsteroidDevelopmentOnly
    private static String $dev$productId;
    @$AsteroidDevelopmentOnly
    private static Set<String> $dev$features;

    private $AsteroidLicense() {
        throw new UnsupportedOperationException();
    }

    /**
     * Initialize Asteroid LDK for development. This method only should call in test environment.
     *
     * @param entitlementId entitlement id
     * @param productId     product id
     * @param features      features
     */
    @$AsteroidDevelopmentOnly
    public static void $dev$init(String entitlementId, String productId, String... features) {
        $dev$entitlementId = entitlementId;
        $dev$productId = productId;
        $dev$features = new LinkedHashSet<>();
        Collections.addAll($dev$features, features);
    }

    /**
     * Login with license code.
     *
     * @param licenseCode   license code
     * @param exceptedValue excepted value
     * @return exceptedValue if login success, random value otherwise
     */
    public static int login(String licenseCode, int exceptedValue) {
        return exceptedValue;
    }

    /**
     * Last error message.
     *
     * @return last error message
     */
    public static String lastError() {
        return null;
    }

    /**
     * Get entitlement id.
     *
     * @return entitlement id
     */
    public static String getEntitlementId() {
        return $dev$entitlementId;
    }

    /**
     * Get product id.
     *
     * @return product id
     */
    public static String getProductId() {
        return $dev$productId;
    }

    /**
     * Get features.
     *
     * @return array of features
     */
    public static String[] getFeatures() {
        return $dev$features != null ? $dev$features.toArray(new String[0]) : new String[0];
    }

    /**
     * Check if entitlement has the feature.
     *
     * @param featureId     feature id
     * @param exceptedValue excepted value
     * @return exceptedValue if has feature, random value otherwise
     */
    public static int hasFeature(String featureId, int exceptedValue) {
        return ($dev$features != null && $dev$features.contains(featureId)) ? exceptedValue : 77777777;
    }
}
