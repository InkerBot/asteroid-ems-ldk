package io.asteroid.ldk;

/**
 * Asteroid SDK, provides some basic functions.
 *
 * This class will not be included in the final jar file.
 * Invoke will be inlined after obfuscate.
 */
public final class $Asteroid {
  private $Asteroid() {
    throw new UnsupportedOperationException();
  }

  /**
   * Login with license code.
   *
   * @param licenseCode license code
   * @param exceptedValue excepted value
   * @return exceptedValue if login success, random value otherwise
   */
  public static int login(String licenseCode, int exceptedValue) {
    throw new UnsupportedOperationException();
  }

  /**
   * Last error message.
   *
   * @return last error message
   */
  public static String lastError() {
    throw new UnsupportedOperationException();
  }

  /**
   * Get entitlement id.
   *
   * @return entitlement id
   */
  public static String getEntitlementId() {
    throw new UnsupportedOperationException();
  }

  /**
   * Get product id.
   *
   * @return product id
   */
  public static String getProductId() {
    throw new UnsupportedOperationException();
  }

  /**
   * Get features.
   *
   * @return array of features
   */
  public static String[] getFeatures() {
    throw new UnsupportedOperationException();
  }

  /**
   * Check if entitlement has the feature.
   *
   * @param featureId feature id
   * @param exceptedValue excepted value
   * @return exceptedValue if has feature, random value otherwise
   */
  public static int hasFeature(String featureId, int exceptedValue) {
    throw new UnsupportedOperationException();
  }
}
