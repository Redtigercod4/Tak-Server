// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

/**
 * Protobuf type {@code com.atakmap.FederateProvenance}
 */
public  final class FederateProvenance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.atakmap.FederateProvenance)
    FederateProvenanceOrBuilder {
  // Use FederateProvenance.newBuilder() to construct.
  private FederateProvenance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FederateProvenance() {
    federationServerId_ = "";
    federationServerName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FederateProvenance(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            federationServerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            federationServerName_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.atakmap.Tak.FigProto.internal_static_com_atakmap_FederateProvenance_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.atakmap.Tak.FigProto.internal_static_com_atakmap_FederateProvenance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.atakmap.Tak.FederateProvenance.class, com.atakmap.Tak.FederateProvenance.Builder.class);
  }

  public static final int FEDERATIONSERVERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object federationServerId_;
  /**
   * <code>optional string federationServerId = 1;</code>
   */
  public java.lang.String getFederationServerId() {
    java.lang.Object ref = federationServerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      federationServerId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string federationServerId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFederationServerIdBytes() {
    java.lang.Object ref = federationServerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      federationServerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEDERATIONSERVERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object federationServerName_;
  /**
   * <code>optional string federationServerName = 2;</code>
   */
  public java.lang.String getFederationServerName() {
    java.lang.Object ref = federationServerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      federationServerName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string federationServerName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFederationServerNameBytes() {
    java.lang.Object ref = federationServerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      federationServerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFederationServerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, federationServerId_);
    }
    if (!getFederationServerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, federationServerName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFederationServerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, federationServerId_);
    }
    if (!getFederationServerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, federationServerName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.atakmap.Tak.FederateProvenance)) {
      return super.equals(obj);
    }
    com.atakmap.Tak.FederateProvenance other = (com.atakmap.Tak.FederateProvenance) obj;

    boolean result = true;
    result = result && getFederationServerId()
        .equals(other.getFederationServerId());
    result = result && getFederationServerName()
        .equals(other.getFederationServerName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + FEDERATIONSERVERID_FIELD_NUMBER;
    hash = (53 * hash) + getFederationServerId().hashCode();
    hash = (37 * hash) + FEDERATIONSERVERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFederationServerName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.atakmap.Tak.FederateProvenance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.FederateProvenance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.FederateProvenance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.FederateProvenance parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.atakmap.Tak.FederateProvenance prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.atakmap.FederateProvenance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.atakmap.FederateProvenance)
      com.atakmap.Tak.FederateProvenanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_FederateProvenance_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_FederateProvenance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.atakmap.Tak.FederateProvenance.class, com.atakmap.Tak.FederateProvenance.Builder.class);
    }

    // Construct using com.atakmap.Tak.FederateProvenance.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      federationServerId_ = "";

      federationServerName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_FederateProvenance_descriptor;
    }

    public com.atakmap.Tak.FederateProvenance getDefaultInstanceForType() {
      return com.atakmap.Tak.FederateProvenance.getDefaultInstance();
    }

    public com.atakmap.Tak.FederateProvenance build() {
      com.atakmap.Tak.FederateProvenance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.atakmap.Tak.FederateProvenance buildPartial() {
      com.atakmap.Tak.FederateProvenance result = new com.atakmap.Tak.FederateProvenance(this);
      result.federationServerId_ = federationServerId_;
      result.federationServerName_ = federationServerName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.atakmap.Tak.FederateProvenance) {
        return mergeFrom((com.atakmap.Tak.FederateProvenance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.atakmap.Tak.FederateProvenance other) {
      if (other == com.atakmap.Tak.FederateProvenance.getDefaultInstance()) return this;
      if (!other.getFederationServerId().isEmpty()) {
        federationServerId_ = other.federationServerId_;
        onChanged();
      }
      if (!other.getFederationServerName().isEmpty()) {
        federationServerName_ = other.federationServerName_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.atakmap.Tak.FederateProvenance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.atakmap.Tak.FederateProvenance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object federationServerId_ = "";
    /**
     * <code>optional string federationServerId = 1;</code>
     */
    public java.lang.String getFederationServerId() {
      java.lang.Object ref = federationServerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        federationServerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string federationServerId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFederationServerIdBytes() {
      java.lang.Object ref = federationServerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        federationServerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string federationServerId = 1;</code>
     */
    public Builder setFederationServerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      federationServerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string federationServerId = 1;</code>
     */
    public Builder clearFederationServerId() {
      
      federationServerId_ = getDefaultInstance().getFederationServerId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string federationServerId = 1;</code>
     */
    public Builder setFederationServerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      federationServerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object federationServerName_ = "";
    /**
     * <code>optional string federationServerName = 2;</code>
     */
    public java.lang.String getFederationServerName() {
      java.lang.Object ref = federationServerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        federationServerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string federationServerName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFederationServerNameBytes() {
      java.lang.Object ref = federationServerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        federationServerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string federationServerName = 2;</code>
     */
    public Builder setFederationServerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      federationServerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string federationServerName = 2;</code>
     */
    public Builder clearFederationServerName() {
      
      federationServerName_ = getDefaultInstance().getFederationServerName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string federationServerName = 2;</code>
     */
    public Builder setFederationServerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      federationServerName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.atakmap.FederateProvenance)
  }

  // @@protoc_insertion_point(class_scope:com.atakmap.FederateProvenance)
  private static final com.atakmap.Tak.FederateProvenance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.atakmap.Tak.FederateProvenance();
  }

  public static com.atakmap.Tak.FederateProvenance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FederateProvenance>
      PARSER = new com.google.protobuf.AbstractParser<FederateProvenance>() {
    public FederateProvenance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FederateProvenance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FederateProvenance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FederateProvenance> getParserForType() {
    return PARSER;
  }

  public com.atakmap.Tak.FederateProvenance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

