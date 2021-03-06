/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.userstore;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 *  This structure describes a collection of bootstrap settings.
 * <dl>
 *  <dt>name:</dt>
 *    <dd>
 *    The unique name of the profile, which is guaranteed to remain consistent across
 *    calls to getBootstrapInfo.
 *    </dd>
 *  <dt>settings:</dt>
 *    <dd>
 *    The settings for this profile.
 *    </dd>
 *  </dl>
 */
public class BootstrapProfile implements TBase<BootstrapProfile, BootstrapProfile._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("BootstrapProfile");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField SETTINGS_FIELD_DESC = new TField("settings", TType.STRUCT, (short)2);

  private String name;
  private BootstrapSettings settings;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    SETTINGS((short)2, "settings");

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
        case 1: // NAME
          return NAME;
        case 2: // SETTINGS
          return SETTINGS;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SETTINGS, new FieldMetaData("settings", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, BootstrapSettings.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(BootstrapProfile.class, metaDataMap);
  }

  public BootstrapProfile() {
  }

  public BootstrapProfile(
    String name,
    BootstrapSettings settings)
  {
    this();
    this.name = name;
    this.settings = settings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BootstrapProfile(BootstrapProfile other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSettings()) {
      this.settings = new BootstrapSettings(other.settings);
    }
  }

  public BootstrapProfile deepCopy() {
    return new BootstrapProfile(this);
  }

  public void clear() {
    this.name = null;
    this.settings = null;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public BootstrapSettings getSettings() {
    return this.settings;
  }

  public void setSettings(BootstrapSettings settings) {
    this.settings = settings;
  }

  public void unsetSettings() {
    this.settings = null;
  }

  /** Returns true if field settings is set (has been asigned a value) and false otherwise */
  public boolean isSetSettings() {
    return this.settings != null;
  }

  public void setSettingsIsSet(boolean value) {
    if (!value) {
      this.settings = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SETTINGS:
      if (value == null) {
        unsetSettings();
      } else {
        setSettings((BootstrapSettings)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case SETTINGS:
      return getSettings();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case SETTINGS:
      return isSetSettings();
    }
    throw new IllegalStateException();
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BootstrapProfile)
      return this.equals((BootstrapProfile)that);
    return false;
  }

  public boolean equals(BootstrapProfile that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_settings = true && this.isSetSettings();
    boolean that_present_settings = true && that.isSetSettings();
    if (this_present_settings || that_present_settings) {
      if (!(this_present_settings && that_present_settings))
        return false;
      if (!this.settings.equals(that.settings))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(BootstrapProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BootstrapProfile typedOther = (BootstrapProfile)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSettings()).compareTo(typedOther.isSetSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettings()) {      lastComparison = TBaseHelper.compareTo(this.settings, typedOther.settings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SETTINGS
          if (field.type == TType.STRUCT) {
            this.settings = new BootstrapSettings();
            this.settings.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.settings != null) {
      oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
      this.settings.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("BootstrapProfile(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("settings:");
    if (this.settings == null) {
      sb.append("null");
    } else {
      sb.append(this.settings);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!isSetName()) {
      throw new TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!isSetSettings()) {
      throw new TProtocolException("Required field 'settings' is unset! Struct:" + toString());
    }

  }

}

