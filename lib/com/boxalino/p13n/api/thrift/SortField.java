/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.p13n.api.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * field to be used for sorting
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-11")
public class SortField implements org.apache.thrift.TBase<SortField, SortField._Fields>, java.io.Serializable, Cloneable, Comparable<SortField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SortField");

  private static final org.apache.thrift.protocol.TField FIELD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REVERSE_FIELD_DESC = new org.apache.thrift.protocol.TField("reverse", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SortFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SortFieldTupleSchemeFactory());
  }

  public String fieldName; // required
  public boolean reverse; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_NAME((short)1, "fieldName"),
    REVERSE((short)2, "reverse");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIELD_NAME
          return FIELD_NAME;
        case 2: // REVERSE
          return REVERSE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REVERSE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD_NAME, new org.apache.thrift.meta_data.FieldMetaData("fieldName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVERSE, new org.apache.thrift.meta_data.FieldMetaData("reverse", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SortField.class, metaDataMap);
  }

  public SortField() {
  }

  public SortField(
    String fieldName,
    boolean reverse)
  {
    this();
    this.fieldName = fieldName;
    this.reverse = reverse;
    setReverseIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SortField(SortField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFieldName()) {
      this.fieldName = other.fieldName;
    }
    this.reverse = other.reverse;
  }

  public SortField deepCopy() {
    return new SortField(this);
  }

  @Override
  public void clear() {
    this.fieldName = null;
    setReverseIsSet(false);
    this.reverse = false;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public SortField setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  public void unsetFieldName() {
    this.fieldName = null;
  }

  /** Returns true if field fieldName is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldName() {
    return this.fieldName != null;
  }

  public void setFieldNameIsSet(boolean value) {
    if (!value) {
      this.fieldName = null;
    }
  }

  public boolean isReverse() {
    return this.reverse;
  }

  public SortField setReverse(boolean reverse) {
    this.reverse = reverse;
    setReverseIsSet(true);
    return this;
  }

  public void unsetReverse() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVERSE_ISSET_ID);
  }

  /** Returns true if field reverse is set (has been assigned a value) and false otherwise */
  public boolean isSetReverse() {
    return EncodingUtils.testBit(__isset_bitfield, __REVERSE_ISSET_ID);
  }

  public void setReverseIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVERSE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD_NAME:
      if (value == null) {
        unsetFieldName();
      } else {
        setFieldName((String)value);
      }
      break;

    case REVERSE:
      if (value == null) {
        unsetReverse();
      } else {
        setReverse((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_NAME:
      return getFieldName();

    case REVERSE:
      return Boolean.valueOf(isReverse());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD_NAME:
      return isSetFieldName();
    case REVERSE:
      return isSetReverse();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SortField)
      return this.equals((SortField)that);
    return false;
  }

  public boolean equals(SortField that) {
    if (that == null)
      return false;

    boolean this_present_fieldName = true && this.isSetFieldName();
    boolean that_present_fieldName = true && that.isSetFieldName();
    if (this_present_fieldName || that_present_fieldName) {
      if (!(this_present_fieldName && that_present_fieldName))
        return false;
      if (!this.fieldName.equals(that.fieldName))
        return false;
    }

    boolean this_present_reverse = true;
    boolean that_present_reverse = true;
    if (this_present_reverse || that_present_reverse) {
      if (!(this_present_reverse && that_present_reverse))
        return false;
      if (this.reverse != that.reverse)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fieldName = true && (isSetFieldName());
    list.add(present_fieldName);
    if (present_fieldName)
      list.add(fieldName);

    boolean present_reverse = true;
    list.add(present_reverse);
    if (present_reverse)
      list.add(reverse);

    return list.hashCode();
  }

  @Override
  public int compareTo(SortField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFieldName()).compareTo(other.isSetFieldName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldName, other.fieldName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReverse()).compareTo(other.isSetReverse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReverse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reverse, other.reverse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SortField(");
    boolean first = true;

    sb.append("fieldName:");
    if (this.fieldName == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reverse:");
    sb.append(this.reverse);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SortFieldStandardSchemeFactory implements SchemeFactory {
    public SortFieldStandardScheme getScheme() {
      return new SortFieldStandardScheme();
    }
  }

  private static class SortFieldStandardScheme extends StandardScheme<SortField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SortField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fieldName = iprot.readString();
              struct.setFieldNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVERSE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.reverse = iprot.readBool();
              struct.setReverseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SortField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldName != null) {
        oprot.writeFieldBegin(FIELD_NAME_FIELD_DESC);
        oprot.writeString(struct.fieldName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVERSE_FIELD_DESC);
      oprot.writeBool(struct.reverse);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SortFieldTupleSchemeFactory implements SchemeFactory {
    public SortFieldTupleScheme getScheme() {
      return new SortFieldTupleScheme();
    }
  }

  private static class SortFieldTupleScheme extends TupleScheme<SortField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SortField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFieldName()) {
        optionals.set(0);
      }
      if (struct.isSetReverse()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFieldName()) {
        oprot.writeString(struct.fieldName);
      }
      if (struct.isSetReverse()) {
        oprot.writeBool(struct.reverse);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SortField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.fieldName = iprot.readString();
        struct.setFieldNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reverse = iprot.readBool();
        struct.setReverseIsSet(true);
      }
    }
  }

}

