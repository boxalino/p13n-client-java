/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.p13n.admin.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-01-25")
public class AuthEntry implements org.apache.thrift.TBase<AuthEntry, AuthEntry._Fields>, java.io.Serializable, Cloneable, Comparable<AuthEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthEntry");

  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField API_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("apiKey", org.apache.thrift.protocol.TType.STRING, (short)21);
  private static final org.apache.thrift.protocol.TField API_SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField("apiSecret", org.apache.thrift.protocol.TType.STRING, (short)31);
  private static final org.apache.thrift.protocol.TField SOLR_INDEX_PATTERNS_FIELD_DESC = new org.apache.thrift.protocol.TField("solrIndexPatterns", org.apache.thrift.protocol.TType.LIST, (short)41);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AuthEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AuthEntryTupleSchemeFactory();

  public java.lang.String username; // required
  public java.lang.String apiKey; // required
  public java.lang.String apiSecret; // required
  public java.util.List<java.lang.String> solrIndexPatterns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERNAME((short)11, "username"),
    API_KEY((short)21, "apiKey"),
    API_SECRET((short)31, "apiSecret"),
    SOLR_INDEX_PATTERNS((short)41, "solrIndexPatterns");

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
        case 11: // USERNAME
          return USERNAME;
        case 21: // API_KEY
          return API_KEY;
        case 31: // API_SECRET
          return API_SECRET;
        case 41: // SOLR_INDEX_PATTERNS
          return SOLR_INDEX_PATTERNS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.API_KEY, new org.apache.thrift.meta_data.FieldMetaData("apiKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.API_SECRET, new org.apache.thrift.meta_data.FieldMetaData("apiSecret", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOLR_INDEX_PATTERNS, new org.apache.thrift.meta_data.FieldMetaData("solrIndexPatterns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthEntry.class, metaDataMap);
  }

  public AuthEntry() {
  }

  public AuthEntry(
    java.lang.String username,
    java.lang.String apiKey,
    java.lang.String apiSecret,
    java.util.List<java.lang.String> solrIndexPatterns)
  {
    this();
    this.username = username;
    this.apiKey = apiKey;
    this.apiSecret = apiSecret;
    this.solrIndexPatterns = solrIndexPatterns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthEntry(AuthEntry other) {
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetApiKey()) {
      this.apiKey = other.apiKey;
    }
    if (other.isSetApiSecret()) {
      this.apiSecret = other.apiSecret;
    }
    if (other.isSetSolrIndexPatterns()) {
      java.util.List<java.lang.String> __this__solrIndexPatterns = new java.util.ArrayList<java.lang.String>(other.solrIndexPatterns);
      this.solrIndexPatterns = __this__solrIndexPatterns;
    }
  }

  public AuthEntry deepCopy() {
    return new AuthEntry(this);
  }

  @Override
  public void clear() {
    this.username = null;
    this.apiKey = null;
    this.apiSecret = null;
    this.solrIndexPatterns = null;
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public AuthEntry setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public java.lang.String getApiKey() {
    return this.apiKey;
  }

  public AuthEntry setApiKey(java.lang.String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public void unsetApiKey() {
    this.apiKey = null;
  }

  /** Returns true if field apiKey is set (has been assigned a value) and false otherwise */
  public boolean isSetApiKey() {
    return this.apiKey != null;
  }

  public void setApiKeyIsSet(boolean value) {
    if (!value) {
      this.apiKey = null;
    }
  }

  public java.lang.String getApiSecret() {
    return this.apiSecret;
  }

  public AuthEntry setApiSecret(java.lang.String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }

  public void unsetApiSecret() {
    this.apiSecret = null;
  }

  /** Returns true if field apiSecret is set (has been assigned a value) and false otherwise */
  public boolean isSetApiSecret() {
    return this.apiSecret != null;
  }

  public void setApiSecretIsSet(boolean value) {
    if (!value) {
      this.apiSecret = null;
    }
  }

  public int getSolrIndexPatternsSize() {
    return (this.solrIndexPatterns == null) ? 0 : this.solrIndexPatterns.size();
  }

  public java.util.Iterator<java.lang.String> getSolrIndexPatternsIterator() {
    return (this.solrIndexPatterns == null) ? null : this.solrIndexPatterns.iterator();
  }

  public void addToSolrIndexPatterns(java.lang.String elem) {
    if (this.solrIndexPatterns == null) {
      this.solrIndexPatterns = new java.util.ArrayList<java.lang.String>();
    }
    this.solrIndexPatterns.add(elem);
  }

  public java.util.List<java.lang.String> getSolrIndexPatterns() {
    return this.solrIndexPatterns;
  }

  public AuthEntry setSolrIndexPatterns(java.util.List<java.lang.String> solrIndexPatterns) {
    this.solrIndexPatterns = solrIndexPatterns;
    return this;
  }

  public void unsetSolrIndexPatterns() {
    this.solrIndexPatterns = null;
  }

  /** Returns true if field solrIndexPatterns is set (has been assigned a value) and false otherwise */
  public boolean isSetSolrIndexPatterns() {
    return this.solrIndexPatterns != null;
  }

  public void setSolrIndexPatternsIsSet(boolean value) {
    if (!value) {
      this.solrIndexPatterns = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((java.lang.String)value);
      }
      break;

    case API_KEY:
      if (value == null) {
        unsetApiKey();
      } else {
        setApiKey((java.lang.String)value);
      }
      break;

    case API_SECRET:
      if (value == null) {
        unsetApiSecret();
      } else {
        setApiSecret((java.lang.String)value);
      }
      break;

    case SOLR_INDEX_PATTERNS:
      if (value == null) {
        unsetSolrIndexPatterns();
      } else {
        setSolrIndexPatterns((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USERNAME:
      return getUsername();

    case API_KEY:
      return getApiKey();

    case API_SECRET:
      return getApiSecret();

    case SOLR_INDEX_PATTERNS:
      return getSolrIndexPatterns();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USERNAME:
      return isSetUsername();
    case API_KEY:
      return isSetApiKey();
    case API_SECRET:
      return isSetApiSecret();
    case SOLR_INDEX_PATTERNS:
      return isSetSolrIndexPatterns();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthEntry)
      return this.equals((AuthEntry)that);
    return false;
  }

  public boolean equals(AuthEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_apiKey = true && this.isSetApiKey();
    boolean that_present_apiKey = true && that.isSetApiKey();
    if (this_present_apiKey || that_present_apiKey) {
      if (!(this_present_apiKey && that_present_apiKey))
        return false;
      if (!this.apiKey.equals(that.apiKey))
        return false;
    }

    boolean this_present_apiSecret = true && this.isSetApiSecret();
    boolean that_present_apiSecret = true && that.isSetApiSecret();
    if (this_present_apiSecret || that_present_apiSecret) {
      if (!(this_present_apiSecret && that_present_apiSecret))
        return false;
      if (!this.apiSecret.equals(that.apiSecret))
        return false;
    }

    boolean this_present_solrIndexPatterns = true && this.isSetSolrIndexPatterns();
    boolean that_present_solrIndexPatterns = true && that.isSetSolrIndexPatterns();
    if (this_present_solrIndexPatterns || that_present_solrIndexPatterns) {
      if (!(this_present_solrIndexPatterns && that_present_solrIndexPatterns))
        return false;
      if (!this.solrIndexPatterns.equals(that.solrIndexPatterns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUsername()) ? 131071 : 524287);
    if (isSetUsername())
      hashCode = hashCode * 8191 + username.hashCode();

    hashCode = hashCode * 8191 + ((isSetApiKey()) ? 131071 : 524287);
    if (isSetApiKey())
      hashCode = hashCode * 8191 + apiKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetApiSecret()) ? 131071 : 524287);
    if (isSetApiSecret())
      hashCode = hashCode * 8191 + apiSecret.hashCode();

    hashCode = hashCode * 8191 + ((isSetSolrIndexPatterns()) ? 131071 : 524287);
    if (isSetSolrIndexPatterns())
      hashCode = hashCode * 8191 + solrIndexPatterns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AuthEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApiKey()).compareTo(other.isSetApiKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApiKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apiKey, other.apiKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApiSecret()).compareTo(other.isSetApiSecret());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApiSecret()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apiSecret, other.apiSecret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSolrIndexPatterns()).compareTo(other.isSetSolrIndexPatterns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSolrIndexPatterns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.solrIndexPatterns, other.solrIndexPatterns);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthEntry(");
    boolean first = true;

    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("apiKey:");
    if (this.apiKey == null) {
      sb.append("null");
    } else {
      sb.append(this.apiKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("apiSecret:");
    if (this.apiSecret == null) {
      sb.append("null");
    } else {
      sb.append(this.apiSecret);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("solrIndexPatterns:");
    if (this.solrIndexPatterns == null) {
      sb.append("null");
    } else {
      sb.append(this.solrIndexPatterns);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AuthEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthEntryStandardScheme getScheme() {
      return new AuthEntryStandardScheme();
    }
  }

  private static class AuthEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<AuthEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 11: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // API_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.apiKey = iprot.readString();
              struct.setApiKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // API_SECRET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.apiSecret = iprot.readString();
              struct.setApiSecretIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 41: // SOLR_INDEX_PATTERNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list38 = iprot.readListBegin();
                struct.solrIndexPatterns = new java.util.ArrayList<java.lang.String>(_list38.size);
                java.lang.String _elem39;
                for (int _i40 = 0; _i40 < _list38.size; ++_i40)
                {
                  _elem39 = iprot.readString();
                  struct.solrIndexPatterns.add(_elem39);
                }
                iprot.readListEnd();
              }
              struct.setSolrIndexPatternsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.apiKey != null) {
        oprot.writeFieldBegin(API_KEY_FIELD_DESC);
        oprot.writeString(struct.apiKey);
        oprot.writeFieldEnd();
      }
      if (struct.apiSecret != null) {
        oprot.writeFieldBegin(API_SECRET_FIELD_DESC);
        oprot.writeString(struct.apiSecret);
        oprot.writeFieldEnd();
      }
      if (struct.solrIndexPatterns != null) {
        oprot.writeFieldBegin(SOLR_INDEX_PATTERNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.solrIndexPatterns.size()));
          for (java.lang.String _iter41 : struct.solrIndexPatterns)
          {
            oprot.writeString(_iter41);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthEntryTupleScheme getScheme() {
      return new AuthEntryTupleScheme();
    }
  }

  private static class AuthEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<AuthEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUsername()) {
        optionals.set(0);
      }
      if (struct.isSetApiKey()) {
        optionals.set(1);
      }
      if (struct.isSetApiSecret()) {
        optionals.set(2);
      }
      if (struct.isSetSolrIndexPatterns()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetApiKey()) {
        oprot.writeString(struct.apiKey);
      }
      if (struct.isSetApiSecret()) {
        oprot.writeString(struct.apiSecret);
      }
      if (struct.isSetSolrIndexPatterns()) {
        {
          oprot.writeI32(struct.solrIndexPatterns.size());
          for (java.lang.String _iter42 : struct.solrIndexPatterns)
          {
            oprot.writeString(_iter42);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.apiKey = iprot.readString();
        struct.setApiKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.apiSecret = iprot.readString();
        struct.setApiSecretIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list43 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.solrIndexPatterns = new java.util.ArrayList<java.lang.String>(_list43.size);
          java.lang.String _elem44;
          for (int _i45 = 0; _i45 < _list43.size; ++_i45)
          {
            _elem44 = iprot.readString();
            struct.solrIndexPatterns.add(_elem44);
          }
        }
        struct.setSolrIndexPatternsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
