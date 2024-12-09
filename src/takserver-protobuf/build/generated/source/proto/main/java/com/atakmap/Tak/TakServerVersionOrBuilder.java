// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

public interface TakServerVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.atakmap.TakServerVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * major version number
   * </pre>
   *
   * <code>optional int64 major = 1;</code>
   */
  long getMajor();

  /**
   * <pre>
   * minor version number
   * </pre>
   *
   * <code>optional int64 minor = 2;</code>
   */
  long getMinor();

  /**
   * <pre>
   * patch version number
   * </pre>
   *
   * <code>optional int64 patch = 3;</code>
   */
  long getPatch();

  /**
   * <pre>
   * branch name
   * </pre>
   *
   * <code>optional string branch = 4;</code>
   */
  java.lang.String getBranch();
  /**
   * <pre>
   * branch name
   * </pre>
   *
   * <code>optional string branch = 4;</code>
   */
  com.google.protobuf.ByteString
      getBranchBytes();

  /**
   * <pre>
   * variant name
   * </pre>
   *
   * <code>optional string variant = 5;</code>
   */
  java.lang.String getVariant();
  /**
   * <pre>
   * variant name
   * </pre>
   *
   * <code>optional string variant = 5;</code>
   */
  com.google.protobuf.ByteString
      getVariantBytes();
}
