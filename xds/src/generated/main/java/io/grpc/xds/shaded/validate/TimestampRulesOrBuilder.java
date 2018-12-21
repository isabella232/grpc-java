// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.grpc.xds.shaded.validate;

public interface TimestampRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:validate.TimestampRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1;</code>
   */
  boolean hasRequired();
  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1;</code>
   */
  boolean getRequired();

  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2;</code>
   */
  boolean hasConst();
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2;</code>
   */
  com.google.protobuf.Timestamp getConst();
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp const = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getConstOrBuilder();

  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lt = 3;</code>
   */
  boolean hasLt();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lt = 3;</code>
   */
  com.google.protobuf.Timestamp getLt();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lt = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLtOrBuilder();

  /**
   * <pre>
   * Lte specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lte = 4;</code>
   */
  boolean hasLte();
  /**
   * <pre>
   * Lte specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lte = 4;</code>
   */
  com.google.protobuf.Timestamp getLte();
  /**
   * <pre>
   * Lte specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp lte = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLteOrBuilder();

  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gt = 5;</code>
   */
  boolean hasGt();
  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gt = 5;</code>
   */
  com.google.protobuf.Timestamp getGt();
  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gt = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getGtOrBuilder();

  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gte = 6;</code>
   */
  boolean hasGte();
  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gte = 6;</code>
   */
  com.google.protobuf.Timestamp getGte();
  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp gte = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getGteOrBuilder();

  /**
   * <pre>
   * LtNow specifies that this must be less than the current time. LtNow
   * can only be used with the Within rule.
   * </pre>
   *
   * <code>optional bool lt_now = 7;</code>
   */
  boolean hasLtNow();
  /**
   * <pre>
   * LtNow specifies that this must be less than the current time. LtNow
   * can only be used with the Within rule.
   * </pre>
   *
   * <code>optional bool lt_now = 7;</code>
   */
  boolean getLtNow();

  /**
   * <pre>
   * GtNow specifies that this must be greater than the current time. GtNow
   * can only be used with the Within rule.
   * </pre>
   *
   * <code>optional bool gt_now = 8;</code>
   */
  boolean hasGtNow();
  /**
   * <pre>
   * GtNow specifies that this must be greater than the current time. GtNow
   * can only be used with the Within rule.
   * </pre>
   *
   * <code>optional bool gt_now = 8;</code>
   */
  boolean getGtNow();

  /**
   * <pre>
   * Within specifies that this field must be within this duration of the
   * current time. This constraint can be used alone or with the LtNow and
   * GtNow rules.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9;</code>
   */
  boolean hasWithin();
  /**
   * <pre>
   * Within specifies that this field must be within this duration of the
   * current time. This constraint can be used alone or with the LtNow and
   * GtNow rules.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9;</code>
   */
  com.google.protobuf.Duration getWithin();
  /**
   * <pre>
   * Within specifies that this field must be within this duration of the
   * current time. This constraint can be used alone or with the LtNow and
   * GtNow rules.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getWithinOrBuilder();
}