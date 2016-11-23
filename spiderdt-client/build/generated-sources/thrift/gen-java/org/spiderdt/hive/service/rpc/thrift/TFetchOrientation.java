/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.spiderdt.hive.service.rpc.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TFetchOrientation implements org.apache.thrift.TEnum {
  FETCH_NEXT(0),
  FETCH_PRIOR(1),
  FETCH_RELATIVE(2),
  FETCH_ABSOLUTE(3),
  FETCH_FIRST(4),
  FETCH_LAST(5);

  private final int value;

  private TFetchOrientation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TFetchOrientation findByValue(int value) { 
    switch (value) {
      case 0:
        return FETCH_NEXT;
      case 1:
        return FETCH_PRIOR;
      case 2:
        return FETCH_RELATIVE;
      case 3:
        return FETCH_ABSOLUTE;
      case 4:
        return FETCH_FIRST;
      case 5:
        return FETCH_LAST;
      default:
        return null;
    }
  }
}
