/**
 * Autogenerated by Thrift Compiler (0.9.1)
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <dl>
 * <dt>fieldName</dt>
 * <dd>name of the facet field</dd>
 * 
 * <dt>values</dt>
 * <dd>list of facet values</dd>
 * </dl>
 */
public class FacetResponse implements org.apache.thrift.TBase<FacetResponse, FacetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FacetResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FacetResponse");

  private static final org.apache.thrift.protocol.TField FIELD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FacetResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FacetResponseTupleSchemeFactory());
  }

  public String fieldName; // required
  public List<FacetValue> values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_NAME((short)1, "fieldName"),
    VALUES((short)2, "values");

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
        case 2: // VALUES
          return VALUES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD_NAME, new org.apache.thrift.meta_data.FieldMetaData("fieldName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FacetValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FacetResponse.class, metaDataMap);
  }

  public FacetResponse() {
  }

  public FacetResponse(
    String fieldName,
    List<FacetValue> values)
  {
    this();
    this.fieldName = fieldName;
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FacetResponse(FacetResponse other) {
    if (other.isSetFieldName()) {
      this.fieldName = other.fieldName;
    }
    if (other.isSetValues()) {
      List<FacetValue> __this__values = new ArrayList<FacetValue>(other.values.size());
      for (FacetValue other_element : other.values) {
        __this__values.add(new FacetValue(other_element));
      }
      this.values = __this__values;
    }
  }

  public FacetResponse deepCopy() {
    return new FacetResponse(this);
  }

  @Override
  public void clear() {
    this.fieldName = null;
    this.values = null;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public FacetResponse setFieldName(String fieldName) {
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

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<FacetValue> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(FacetValue elem) {
    if (this.values == null) {
      this.values = new ArrayList<FacetValue>();
    }
    this.values.add(elem);
  }

  public List<FacetValue> getValues() {
    return this.values;
  }

  public FacetResponse setValues(List<FacetValue> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
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

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<FacetValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_NAME:
      return getFieldName();

    case VALUES:
      return getValues();

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
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FacetResponse)
      return this.equals((FacetResponse)that);
    return false;
  }

  public boolean equals(FacetResponse that) {
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

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FacetResponse other) {
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
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
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
    StringBuilder sb = new StringBuilder("FacetResponse(");
    boolean first = true;

    sb.append("fieldName:");
    if (this.fieldName == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FacetResponseStandardSchemeFactory implements SchemeFactory {
    public FacetResponseStandardScheme getScheme() {
      return new FacetResponseStandardScheme();
    }
  }

  private static class FacetResponseStandardScheme extends StandardScheme<FacetResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FacetResponse struct) throws org.apache.thrift.TException {
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
          case 2: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list106 = iprot.readListBegin();
                struct.values = new ArrayList<FacetValue>(_list106.size);
                for (int _i107 = 0; _i107 < _list106.size; ++_i107)
                {
                  FacetValue _elem108;
                  _elem108 = new FacetValue();
                  _elem108.read(iprot);
                  struct.values.add(_elem108);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FacetResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldName != null) {
        oprot.writeFieldBegin(FIELD_NAME_FIELD_DESC);
        oprot.writeString(struct.fieldName);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.values.size()));
          for (FacetValue _iter109 : struct.values)
          {
            _iter109.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FacetResponseTupleSchemeFactory implements SchemeFactory {
    public FacetResponseTupleScheme getScheme() {
      return new FacetResponseTupleScheme();
    }
  }

  private static class FacetResponseTupleScheme extends TupleScheme<FacetResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FacetResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFieldName()) {
        optionals.set(0);
      }
      if (struct.isSetValues()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFieldName()) {
        oprot.writeString(struct.fieldName);
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (FacetValue _iter110 : struct.values)
          {
            _iter110.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FacetResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.fieldName = iprot.readString();
        struct.setFieldNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list111 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.values = new ArrayList<FacetValue>(_list111.size);
          for (int _i112 = 0; _i112 < _list111.size; ++_i112)
          {
            FacetValue _elem113;
            _elem113 = new FacetValue();
            _elem113.read(iprot);
            struct.values.add(_elem113);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}

