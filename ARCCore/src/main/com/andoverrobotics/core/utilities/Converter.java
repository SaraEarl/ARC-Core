package com.andoverrobotics.core.utilities;

// Radians are [0, 2pi)
// Degrees are [0, 360)
public class Converter {
  private static final double TAU = 2 * Math.PI;

  public static double degreesToRadians(int degrees) {
    return normalizedRadians(degrees / 180.0 * Math.PI);
  }

  public static int radiansToDegrees(double radians) {
    return normalizedDegrees((int) Math.round(radians / Math.PI * 180));
  }

  public static double inchesToMillimeter(double inches) {
    return inches * 25.4;
  }

  public static double millimeterToInches(double millimeters) {
    return millimeters / 25.4;
  }

  public static int normalizedDegrees(int degrees) {
    while (degrees < 0)
      degrees += 360;
    while (degrees >= 360)
      degrees -= 360;

    return degrees;
  }

  public static double normalizedRadians(double radians) {
    while (radians < 0)
      radians += TAU;
    while (radians >= TAU)
      radians -= TAU;

    return radians;
  }
}
