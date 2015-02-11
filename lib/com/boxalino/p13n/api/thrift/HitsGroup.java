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
 * grouped item found
 * 
 * <dl>
 * <dt>groupValue</dt>
 * <dd>value of the groupBy field</dd>
 * 
 * <dt>totalHitCount</dt>
 * <dd>total hits count within the group</dd>
 * 
 * <dt>hits</dt>
 * <dd>group hits</dd>
 * </dl>
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-2-11")
public class HitsGroup implements org.apache.thrift.TBase<HitsGroup, HitsGroup._Fields>, java.io.Serializable, Cloneable, Comparable<HitsGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HitsGroup");

  private static final org.apache.thrift.protocol.TField GROUP_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("groupValue", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField TOTAL_HIT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalHitCount", org.apache.thrift.protocol.TType.I64, (short)20);
  private static final org.apache.thrift.protocol.TField HITS_FIELD_DESC = new org.apache.thrift.protocol.TField("hits", org.apache.thrift.protocol.TType.LIST, (short)30);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HitsGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HitsGroupTupleSchemeFactory());
  }

  public String groupValue; // required
  public long totalHitCount; // required
  public List<Hit> hits; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_VALUE((short)10, "groupValue"),
    TOTAL_HIT_COUNT((short)20, "totalHitCount"),
    HITS((short)30, "hits");

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
        case 10: // GROUP_VALUE
          return GROUP_VALUE;
        case 20: // TOTAL_HIT_COUNT
          return TOTAL_HIT_COUNT;
        case 30: // HITS
          return HITS;
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
  private static final int __TOTALHITCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_VALUE, new org.apache.thrift.meta_data.FieldMetaData("groupValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOTAL_HIT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalHitCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HITS, new org.apache.thrift.meta_data.FieldMetaData("hits", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Hit.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HitsGroup.class, metaDataMap);
  }

  public HitsGroup() {
  }

  public HitsGroup(
    String groupValue,
    long totalHitCount,
    List<Hit> hits)
  {
    this();
    this.groupValue = groupValue;
    this.totalHitCount = totalHitCount;
    setTotalHitCountIsSet(true);
    this.hits = hits;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HitsGroup(HitsGroup other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetGroupValue()) {
      this.groupValue = other.groupValue;
    }
    this.totalHitCount = other.totalHitCount;
    if (other.isSetHits()) {
      List<Hit> __this__hits = new ArrayList<Hit>(other.hits.size());
      for (Hit other_element : other.hits) {
        __this__hits.add(new Hit(other_element));
      }
      this.hits = __this__hits;
    }
  }

  public HitsGroup deepCopy() {
    return new HitsGroup(this);
  }

  @Override
  public void clear() {
    this.groupValue = null;
    setTotalHitCountIsSet(false);
    this.totalHitCount = 0;
    this.hits = null;
  }

  public String getGroupValue() {
    return this.groupValue;
  }

  public HitsGroup setGroupValue(String groupValue) {
    this.groupValue = groupValue;
    return this;
  }

  public void unsetGroupValue() {
    this.groupValue = null;
  }

  /** Returns true if field groupValue is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupValue() {
    return this.groupValue != null;
  }

  public void setGroupValueIsSet(boolean value) {
    if (!value) {
      this.groupValue = null;
    }
  }

  public long getTotalHitCount() {
    return this.totalHitCount;
  }

  public HitsGroup setTotalHitCount(long totalHitCount) {
    this.totalHitCount = totalHitCount;
    setTotalHitCountIsSet(true);
    return this;
  }

  public void unsetTotalHitCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID);
  }

  /** Returns true if field totalHitCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalHitCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID);
  }

  public void setTotalHitCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID, value);
  }

  public int getHitsSize() {
    return (this.hits == null) ? 0 : this.hits.size();
  }

  public java.util.Iterator<Hit> getHitsIterator() {
    return (this.hits == null) ? null : this.hits.iterator();
  }

  public void addToHits(Hit elem) {
    if (this.hits == null) {
      this.hits = new ArrayList<Hit>();
    }
    this.hits.add(elem);
  }

  public List<Hit> getHits() {
    return this.hits;
  }

  public HitsGroup setHits(List<Hit> hits) {
    this.hits = hits;
    return this;
  }

  public void unsetHits() {
    this.hits = null;
  }

  /** Returns true if field hits is set (has been assigned a value) and false otherwise */
  public boolean isSetHits() {
    return this.hits != null;
  }

  public void setHitsIsSet(boolean value) {
    if (!value) {
      this.hits = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GROUP_VALUE:
      if (value == null) {
        unsetGroupValue();
      } else {
        setGroupValue((String)value);
      }
      break;

    case TOTAL_HIT_COUNT:
      if (value == null) {
        unsetTotalHitCount();
      } else {
        setTotalHitCount((Long)value);
      }
      break;

    case HITS:
      if (value == null) {
        unsetHits();
      } else {
        setHits((List<Hit>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP_VALUE:
      return getGroupValue();

    case TOTAL_HIT_COUNT:
      return Long.valueOf(getTotalHitCount());

    case HITS:
      return getHits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GROUP_VALUE:
      return isSetGroupValue();
    case TOTAL_HIT_COUNT:
      return isSetTotalHitCount();
    case HITS:
      return isSetHits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HitsGroup)
      return this.equals((HitsGroup)that);
    return false;
  }

  public boolean equals(HitsGroup that) {
    if (that == null)
      return false;

    boolean this_present_groupValue = true && this.isSetGroupValue();
    boolean that_present_groupValue = true && that.isSetGroupValue();
    if (this_present_groupValue || that_present_groupValue) {
      if (!(this_present_groupValue && that_present_groupValue))
        return false;
      if (!this.groupValue.equals(that.groupValue))
        return false;
    }

    boolean this_present_totalHitCount = true;
    boolean that_present_totalHitCount = true;
    if (this_present_totalHitCount || that_present_totalHitCount) {
      if (!(this_present_totalHitCount && that_present_totalHitCount))
        return false;
      if (this.totalHitCount != that.totalHitCount)
        return false;
    }

    boolean this_present_hits = true && this.isSetHits();
    boolean that_present_hits = true && that.isSetHits();
    if (this_present_hits || that_present_hits) {
      if (!(this_present_hits && that_present_hits))
        return false;
      if (!this.hits.equals(that.hits))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_groupValue = true && (isSetGroupValue());
    list.add(present_groupValue);
    if (present_groupValue)
      list.add(groupValue);

    boolean present_totalHitCount = true;
    list.add(present_totalHitCount);
    if (present_totalHitCount)
      list.add(totalHitCount);

    boolean present_hits = true && (isSetHits());
    list.add(present_hits);
    if (present_hits)
      list.add(hits);

    return list.hashCode();
  }

  @Override
  public int compareTo(HitsGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGroupValue()).compareTo(other.isSetGroupValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupValue, other.groupValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalHitCount()).compareTo(other.isSetTotalHitCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalHitCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalHitCount, other.totalHitCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHits()).compareTo(other.isSetHits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hits, other.hits);
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
    StringBuilder sb = new StringBuilder("HitsGroup(");
    boolean first = true;

    sb.append("groupValue:");
    if (this.groupValue == null) {
      sb.append("null");
    } else {
      sb.append(this.groupValue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalHitCount:");
    sb.append(this.totalHitCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hits:");
    if (this.hits == null) {
      sb.append("null");
    } else {
      sb.append(this.hits);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HitsGroupStandardSchemeFactory implements SchemeFactory {
    public HitsGroupStandardScheme getScheme() {
      return new HitsGroupStandardScheme();
    }
  }

  private static class HitsGroupStandardScheme extends StandardScheme<HitsGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HitsGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 10: // GROUP_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupValue = iprot.readString();
              struct.setGroupValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // TOTAL_HIT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalHitCount = iprot.readI64();
              struct.setTotalHitCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 30: // HITS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list132 = iprot.readListBegin();
                struct.hits = new ArrayList<Hit>(_list132.size);
                Hit _elem133;
                for (int _i134 = 0; _i134 < _list132.size; ++_i134)
                {
                  _elem133 = new Hit();
                  _elem133.read(iprot);
                  struct.hits.add(_elem133);
                }
                iprot.readListEnd();
              }
              struct.setHitsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HitsGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupValue != null) {
        oprot.writeFieldBegin(GROUP_VALUE_FIELD_DESC);
        oprot.writeString(struct.groupValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_HIT_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalHitCount);
      oprot.writeFieldEnd();
      if (struct.hits != null) {
        oprot.writeFieldBegin(HITS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.hits.size()));
          for (Hit _iter135 : struct.hits)
          {
            _iter135.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HitsGroupTupleSchemeFactory implements SchemeFactory {
    public HitsGroupTupleScheme getScheme() {
      return new HitsGroupTupleScheme();
    }
  }

  private static class HitsGroupTupleScheme extends TupleScheme<HitsGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HitsGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroupValue()) {
        optionals.set(0);
      }
      if (struct.isSetTotalHitCount()) {
        optionals.set(1);
      }
      if (struct.isSetHits()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetGroupValue()) {
        oprot.writeString(struct.groupValue);
      }
      if (struct.isSetTotalHitCount()) {
        oprot.writeI64(struct.totalHitCount);
      }
      if (struct.isSetHits()) {
        {
          oprot.writeI32(struct.hits.size());
          for (Hit _iter136 : struct.hits)
          {
            _iter136.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HitsGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.groupValue = iprot.readString();
        struct.setGroupValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalHitCount = iprot.readI64();
        struct.setTotalHitCountIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list137 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.hits = new ArrayList<Hit>(_list137.size);
          Hit _elem138;
          for (int _i139 = 0; _i139 < _list137.size; ++_i139)
          {
            _elem138 = new Hit();
            _elem138.read(iprot);
            struct.hits.add(_elem138);
          }
        }
        struct.setHitsIsSet(true);
      }
    }
  }

}

