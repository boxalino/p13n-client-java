/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.p13n.api.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Whether facets should be order by population descending or by collation
 */
public enum FacetSortOrder implements org.apache.thrift.TEnum {
  POPULATION(1),
  COLLATION(2);

  private final int value;

  private FacetSortOrder(int value) {
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
  public static FacetSortOrder findByValue(int value) { 
    switch (value) {
      case 1:
        return POPULATION;
      case 2:
        return COLLATION;
      default:
        return null;
    }
  }
}
