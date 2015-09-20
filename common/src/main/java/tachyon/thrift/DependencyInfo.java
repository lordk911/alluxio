/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-20")
public class DependencyInfo implements org.apache.thrift.TBase<DependencyInfo, DependencyInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DependencyInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DependencyInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("parents", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("children", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DependencyInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DependencyInfoTupleSchemeFactory());
  }

  public int id; // required
  public List<Long> parents; // required
  public List<Long> children; // required
  public List<ByteBuffer> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    PARENTS((short)2, "parents"),
    CHILDREN((short)3, "children"),
    DATA((short)4, "data");

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
        case 1: // ID
          return ID;
        case 2: // PARENTS
          return PARENTS;
        case 3: // CHILDREN
          return CHILDREN;
        case 4: // DATA
          return DATA;
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
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARENTS, new org.apache.thrift.meta_data.FieldMetaData("parents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("children", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DependencyInfo.class, metaDataMap);
  }

  public DependencyInfo() {
  }

  public DependencyInfo(
    int id,
    List<Long> parents,
    List<Long> children,
    List<ByteBuffer> data)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.parents = parents;
    this.children = children;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DependencyInfo(DependencyInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetParents()) {
      List<Long> __this__parents = new ArrayList<Long>(other.parents);
      this.parents = __this__parents;
    }
    if (other.isSetChildren()) {
      List<Long> __this__children = new ArrayList<Long>(other.children);
      this.children = __this__children;
    }
    if (other.isSetData()) {
      List<ByteBuffer> __this__data = new ArrayList<ByteBuffer>(other.data);
      this.data = __this__data;
    }
  }

  public DependencyInfo deepCopy() {
    return new DependencyInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.parents = null;
    this.children = null;
    this.data = null;
  }

  public int getId() {
    return this.id;
  }

  public DependencyInfo setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getParentsSize() {
    return (this.parents == null) ? 0 : this.parents.size();
  }

  public java.util.Iterator<Long> getParentsIterator() {
    return (this.parents == null) ? null : this.parents.iterator();
  }

  public void addToParents(long elem) {
    if (this.parents == null) {
      this.parents = new ArrayList<Long>();
    }
    this.parents.add(elem);
  }

  public List<Long> getParents() {
    return this.parents;
  }

  public DependencyInfo setParents(List<Long> parents) {
    this.parents = parents;
    return this;
  }

  public void unsetParents() {
    this.parents = null;
  }

  /** Returns true if field parents is set (has been assigned a value) and false otherwise */
  public boolean isSetParents() {
    return this.parents != null;
  }

  public void setParentsIsSet(boolean value) {
    if (!value) {
      this.parents = null;
    }
  }

  public int getChildrenSize() {
    return (this.children == null) ? 0 : this.children.size();
  }

  public java.util.Iterator<Long> getChildrenIterator() {
    return (this.children == null) ? null : this.children.iterator();
  }

  public void addToChildren(long elem) {
    if (this.children == null) {
      this.children = new ArrayList<Long>();
    }
    this.children.add(elem);
  }

  public List<Long> getChildren() {
    return this.children;
  }

  public DependencyInfo setChildren(List<Long> children) {
    this.children = children;
    return this;
  }

  public void unsetChildren() {
    this.children = null;
  }

  /** Returns true if field children is set (has been assigned a value) and false otherwise */
  public boolean isSetChildren() {
    return this.children != null;
  }

  public void setChildrenIsSet(boolean value) {
    if (!value) {
      this.children = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<ByteBuffer> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(ByteBuffer elem) {
    if (this.data == null) {
      this.data = new ArrayList<ByteBuffer>();
    }
    this.data.add(elem);
  }

  public List<ByteBuffer> getData() {
    return this.data;
  }

  public DependencyInfo setData(List<ByteBuffer> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case PARENTS:
      if (value == null) {
        unsetParents();
      } else {
        setParents((List<Long>)value);
      }
      break;

    case CHILDREN:
      if (value == null) {
        unsetChildren();
      } else {
        setChildren((List<Long>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case PARENTS:
      return getParents();

    case CHILDREN:
      return getChildren();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case PARENTS:
      return isSetParents();
    case CHILDREN:
      return isSetChildren();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DependencyInfo)
      return this.equals((DependencyInfo)that);
    return false;
  }

  public boolean equals(DependencyInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_parents = true && this.isSetParents();
    boolean that_present_parents = true && that.isSetParents();
    if (this_present_parents || that_present_parents) {
      if (!(this_present_parents && that_present_parents))
        return false;
      if (!this.parents.equals(that.parents))
        return false;
    }

    boolean this_present_children = true && this.isSetChildren();
    boolean that_present_children = true && that.isSetChildren();
    if (this_present_children || that_present_children) {
      if (!(this_present_children && that_present_children))
        return false;
      if (!this.children.equals(that.children))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_parents = true && (isSetParents());
    list.add(present_parents);
    if (present_parents)
      list.add(parents);

    boolean present_children = true && (isSetChildren());
    list.add(present_children);
    if (present_children)
      list.add(children);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(DependencyInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParents()).compareTo(other.isSetParents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parents, other.parents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChildren()).compareTo(other.isSetChildren());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildren()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.children, other.children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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
    StringBuilder sb = new StringBuilder("DependencyInfo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parents:");
    if (this.parents == null) {
      sb.append("null");
    } else {
      sb.append(this.parents);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("children:");
    if (this.children == null) {
      sb.append("null");
    } else {
      sb.append(this.children);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
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

  private static class DependencyInfoStandardSchemeFactory implements SchemeFactory {
    public DependencyInfoStandardScheme getScheme() {
      return new DependencyInfoStandardScheme();
    }
  }

  private static class DependencyInfoStandardScheme extends StandardScheme<DependencyInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DependencyInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.parents = new ArrayList<Long>(_list24.size);
                long _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readI64();
                  struct.parents.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setParentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.children = new ArrayList<Long>(_list27.size);
                long _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = iprot.readI64();
                  struct.children.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setChildrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                struct.data = new ArrayList<ByteBuffer>(_list30.size);
                ByteBuffer _elem31;
                for (int _i32 = 0; _i32 < _list30.size; ++_i32)
                {
                  _elem31 = iprot.readBinary();
                  struct.data.add(_elem31);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DependencyInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.parents != null) {
        oprot.writeFieldBegin(PARENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.parents.size()));
          for (long _iter33 : struct.parents)
          {
            oprot.writeI64(_iter33);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.children != null) {
        oprot.writeFieldBegin(CHILDREN_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.children.size()));
          for (long _iter34 : struct.children)
          {
            oprot.writeI64(_iter34);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.data.size()));
          for (ByteBuffer _iter35 : struct.data)
          {
            oprot.writeBinary(_iter35);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DependencyInfoTupleSchemeFactory implements SchemeFactory {
    public DependencyInfoTupleScheme getScheme() {
      return new DependencyInfoTupleScheme();
    }
  }

  private static class DependencyInfoTupleScheme extends TupleScheme<DependencyInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DependencyInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetParents()) {
        optionals.set(1);
      }
      if (struct.isSetChildren()) {
        optionals.set(2);
      }
      if (struct.isSetData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetParents()) {
        {
          oprot.writeI32(struct.parents.size());
          for (long _iter36 : struct.parents)
          {
            oprot.writeI64(_iter36);
          }
        }
      }
      if (struct.isSetChildren()) {
        {
          oprot.writeI32(struct.children.size());
          for (long _iter37 : struct.children)
          {
            oprot.writeI64(_iter37);
          }
        }
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (ByteBuffer _iter38 : struct.data)
          {
            oprot.writeBinary(_iter38);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DependencyInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.parents = new ArrayList<Long>(_list39.size);
          long _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = iprot.readI64();
            struct.parents.add(_elem40);
          }
        }
        struct.setParentsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list42 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.children = new ArrayList<Long>(_list42.size);
          long _elem43;
          for (int _i44 = 0; _i44 < _list42.size; ++_i44)
          {
            _elem43 = iprot.readI64();
            struct.children.add(_elem43);
          }
        }
        struct.setChildrenIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.data = new ArrayList<ByteBuffer>(_list45.size);
          ByteBuffer _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = iprot.readBinary();
            struct.data.add(_elem46);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

