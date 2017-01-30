/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.p13n.admin.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-01-25")
public class Choice implements org.apache.thrift.TBase<Choice, Choice._Fields>, java.io.Serializable, Cloneable, Comparable<Choice> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Choice");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField SELECTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("selections", org.apache.thrift.protocol.TType.MAP, (short)21);
  private static final org.apache.thrift.protocol.TField VARIANT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("variantIds", org.apache.thrift.protocol.TType.MAP, (short)31);
  private static final org.apache.thrift.protocol.TField STICKY_FIELD_DESC = new org.apache.thrift.protocol.TField("sticky", org.apache.thrift.protocol.TType.BOOL, (short)41);
  private static final org.apache.thrift.protocol.TField TRACED_FIELD_DESC = new org.apache.thrift.protocol.TField("traced", org.apache.thrift.protocol.TType.BOOL, (short)51);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ChoiceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ChoiceTupleSchemeFactory();

  public java.lang.String id; // required
  public java.util.Map<java.lang.String,java.lang.String> selections; // required
  public java.util.Map<java.lang.String,java.lang.Integer> variantIds; // required
  public boolean sticky; // required
  public boolean traced; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)11, "id"),
    SELECTIONS((short)21, "selections"),
    VARIANT_IDS((short)31, "variantIds"),
    STICKY((short)41, "sticky"),
    TRACED((short)51, "traced");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 11: // ID
          return ID;
        case 21: // SELECTIONS
          return SELECTIONS;
        case 31: // VARIANT_IDS
          return VARIANT_IDS;
        case 41: // STICKY
          return STICKY;
        case 51: // TRACED
          return TRACED;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STICKY_ISSET_ID = 0;
  private static final int __TRACED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SELECTIONS, new org.apache.thrift.meta_data.FieldMetaData("selections", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.VARIANT_IDS, new org.apache.thrift.meta_data.FieldMetaData("variantIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.STICKY, new org.apache.thrift.meta_data.FieldMetaData("sticky", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TRACED, new org.apache.thrift.meta_data.FieldMetaData("traced", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Choice.class, metaDataMap);
  }

  public Choice() {
  }

  public Choice(
    java.lang.String id,
    java.util.Map<java.lang.String,java.lang.String> selections,
    java.util.Map<java.lang.String,java.lang.Integer> variantIds,
    boolean sticky,
    boolean traced)
  {
    this();
    this.id = id;
    this.selections = selections;
    this.variantIds = variantIds;
    this.sticky = sticky;
    setStickyIsSet(true);
    this.traced = traced;
    setTracedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Choice(Choice other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetSelections()) {
      java.util.Map<java.lang.String,java.lang.String> __this__selections = new java.util.HashMap<java.lang.String,java.lang.String>(other.selections);
      this.selections = __this__selections;
    }
    if (other.isSetVariantIds()) {
      java.util.Map<java.lang.String,java.lang.Integer> __this__variantIds = new java.util.HashMap<java.lang.String,java.lang.Integer>(other.variantIds);
      this.variantIds = __this__variantIds;
    }
    this.sticky = other.sticky;
    this.traced = other.traced;
  }

  public Choice deepCopy() {
    return new Choice(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.selections = null;
    this.variantIds = null;
    setStickyIsSet(false);
    this.sticky = false;
    setTracedIsSet(false);
    this.traced = false;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public Choice setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public int getSelectionsSize() {
    return (this.selections == null) ? 0 : this.selections.size();
  }

  public void putToSelections(java.lang.String key, java.lang.String val) {
    if (this.selections == null) {
      this.selections = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.selections.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getSelections() {
    return this.selections;
  }

  public Choice setSelections(java.util.Map<java.lang.String,java.lang.String> selections) {
    this.selections = selections;
    return this;
  }

  public void unsetSelections() {
    this.selections = null;
  }

  /** Returns true if field selections is set (has been assigned a value) and false otherwise */
  public boolean isSetSelections() {
    return this.selections != null;
  }

  public void setSelectionsIsSet(boolean value) {
    if (!value) {
      this.selections = null;
    }
  }

  public int getVariantIdsSize() {
    return (this.variantIds == null) ? 0 : this.variantIds.size();
  }

  public void putToVariantIds(java.lang.String key, int val) {
    if (this.variantIds == null) {
      this.variantIds = new java.util.HashMap<java.lang.String,java.lang.Integer>();
    }
    this.variantIds.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.Integer> getVariantIds() {
    return this.variantIds;
  }

  public Choice setVariantIds(java.util.Map<java.lang.String,java.lang.Integer> variantIds) {
    this.variantIds = variantIds;
    return this;
  }

  public void unsetVariantIds() {
    this.variantIds = null;
  }

  /** Returns true if field variantIds is set (has been assigned a value) and false otherwise */
  public boolean isSetVariantIds() {
    return this.variantIds != null;
  }

  public void setVariantIdsIsSet(boolean value) {
    if (!value) {
      this.variantIds = null;
    }
  }

  public boolean isSticky() {
    return this.sticky;
  }

  public Choice setSticky(boolean sticky) {
    this.sticky = sticky;
    setStickyIsSet(true);
    return this;
  }

  public void unsetSticky() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STICKY_ISSET_ID);
  }

  /** Returns true if field sticky is set (has been assigned a value) and false otherwise */
  public boolean isSetSticky() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STICKY_ISSET_ID);
  }

  public void setStickyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STICKY_ISSET_ID, value);
  }

  public boolean isTraced() {
    return this.traced;
  }

  public Choice setTraced(boolean traced) {
    this.traced = traced;
    setTracedIsSet(true);
    return this;
  }

  public void unsetTraced() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRACED_ISSET_ID);
  }

  /** Returns true if field traced is set (has been assigned a value) and false otherwise */
  public boolean isSetTraced() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRACED_ISSET_ID);
  }

  public void setTracedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRACED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case SELECTIONS:
      if (value == null) {
        unsetSelections();
      } else {
        setSelections((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case VARIANT_IDS:
      if (value == null) {
        unsetVariantIds();
      } else {
        setVariantIds((java.util.Map<java.lang.String,java.lang.Integer>)value);
      }
      break;

    case STICKY:
      if (value == null) {
        unsetSticky();
      } else {
        setSticky((java.lang.Boolean)value);
      }
      break;

    case TRACED:
      if (value == null) {
        unsetTraced();
      } else {
        setTraced((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case SELECTIONS:
      return getSelections();

    case VARIANT_IDS:
      return getVariantIds();

    case STICKY:
      return isSticky();

    case TRACED:
      return isTraced();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case SELECTIONS:
      return isSetSelections();
    case VARIANT_IDS:
      return isSetVariantIds();
    case STICKY:
      return isSetSticky();
    case TRACED:
      return isSetTraced();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Choice)
      return this.equals((Choice)that);
    return false;
  }

  public boolean equals(Choice that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_selections = true && this.isSetSelections();
    boolean that_present_selections = true && that.isSetSelections();
    if (this_present_selections || that_present_selections) {
      if (!(this_present_selections && that_present_selections))
        return false;
      if (!this.selections.equals(that.selections))
        return false;
    }

    boolean this_present_variantIds = true && this.isSetVariantIds();
    boolean that_present_variantIds = true && that.isSetVariantIds();
    if (this_present_variantIds || that_present_variantIds) {
      if (!(this_present_variantIds && that_present_variantIds))
        return false;
      if (!this.variantIds.equals(that.variantIds))
        return false;
    }

    boolean this_present_sticky = true;
    boolean that_present_sticky = true;
    if (this_present_sticky || that_present_sticky) {
      if (!(this_present_sticky && that_present_sticky))
        return false;
      if (this.sticky != that.sticky)
        return false;
    }

    boolean this_present_traced = true;
    boolean that_present_traced = true;
    if (this_present_traced || that_present_traced) {
      if (!(this_present_traced && that_present_traced))
        return false;
      if (this.traced != that.traced)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetSelections()) ? 131071 : 524287);
    if (isSetSelections())
      hashCode = hashCode * 8191 + selections.hashCode();

    hashCode = hashCode * 8191 + ((isSetVariantIds()) ? 131071 : 524287);
    if (isSetVariantIds())
      hashCode = hashCode * 8191 + variantIds.hashCode();

    hashCode = hashCode * 8191 + ((sticky) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((traced) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Choice other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSelections()).compareTo(other.isSetSelections());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelections()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selections, other.selections);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVariantIds()).compareTo(other.isSetVariantIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVariantIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.variantIds, other.variantIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSticky()).compareTo(other.isSetSticky());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSticky()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sticky, other.sticky);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTraced()).compareTo(other.isSetTraced());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraced()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traced, other.traced);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Choice(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("selections:");
    if (this.selections == null) {
      sb.append("null");
    } else {
      sb.append(this.selections);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("variantIds:");
    if (this.variantIds == null) {
      sb.append("null");
    } else {
      sb.append(this.variantIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sticky:");
    sb.append(this.sticky);
    first = false;
    if (!first) sb.append(", ");
    sb.append("traced:");
    sb.append(this.traced);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ChoiceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChoiceStandardScheme getScheme() {
      return new ChoiceStandardScheme();
    }
  }

  private static class ChoiceStandardScheme extends org.apache.thrift.scheme.StandardScheme<Choice> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Choice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 11: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // SELECTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.selections = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                java.lang.String _key1;
                java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.selections.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setSelectionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // VARIANT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.variantIds = new java.util.HashMap<java.lang.String,java.lang.Integer>(2*_map4.size);
                java.lang.String _key5;
                int _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readString();
                  _val6 = iprot.readI32();
                  struct.variantIds.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setVariantIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 41: // STICKY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sticky = iprot.readBool();
              struct.setStickyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 51: // TRACED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.traced = iprot.readBool();
              struct.setTracedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Choice struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.selections != null) {
        oprot.writeFieldBegin(SELECTIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.selections.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter8 : struct.selections.entrySet())
          {
            oprot.writeString(_iter8.getKey());
            oprot.writeString(_iter8.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.variantIds != null) {
        oprot.writeFieldBegin(VARIANT_IDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.variantIds.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.Integer> _iter9 : struct.variantIds.entrySet())
          {
            oprot.writeString(_iter9.getKey());
            oprot.writeI32(_iter9.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STICKY_FIELD_DESC);
      oprot.writeBool(struct.sticky);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TRACED_FIELD_DESC);
      oprot.writeBool(struct.traced);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChoiceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChoiceTupleScheme getScheme() {
      return new ChoiceTupleScheme();
    }
  }

  private static class ChoiceTupleScheme extends org.apache.thrift.scheme.TupleScheme<Choice> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Choice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetSelections()) {
        optionals.set(1);
      }
      if (struct.isSetVariantIds()) {
        optionals.set(2);
      }
      if (struct.isSetSticky()) {
        optionals.set(3);
      }
      if (struct.isSetTraced()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetSelections()) {
        {
          oprot.writeI32(struct.selections.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter10 : struct.selections.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
      if (struct.isSetVariantIds()) {
        {
          oprot.writeI32(struct.variantIds.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.Integer> _iter11 : struct.variantIds.entrySet())
          {
            oprot.writeString(_iter11.getKey());
            oprot.writeI32(_iter11.getValue());
          }
        }
      }
      if (struct.isSetSticky()) {
        oprot.writeBool(struct.sticky);
      }
      if (struct.isSetTraced()) {
        oprot.writeBool(struct.traced);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Choice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map12 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.selections = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map12.size);
          java.lang.String _key13;
          java.lang.String _val14;
          for (int _i15 = 0; _i15 < _map12.size; ++_i15)
          {
            _key13 = iprot.readString();
            _val14 = iprot.readString();
            struct.selections.put(_key13, _val14);
          }
        }
        struct.setSelectionsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.variantIds = new java.util.HashMap<java.lang.String,java.lang.Integer>(2*_map16.size);
          java.lang.String _key17;
          int _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readI32();
            struct.variantIds.put(_key17, _val18);
          }
        }
        struct.setVariantIdsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sticky = iprot.readBool();
        struct.setStickyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.traced = iprot.readBool();
        struct.setTracedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

