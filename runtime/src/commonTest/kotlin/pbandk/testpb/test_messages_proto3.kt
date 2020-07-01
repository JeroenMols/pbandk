@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is ForeignEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOREIGN_FOO : ForeignEnum(0, "FOREIGN_FOO")
    object FOREIGN_BAR : ForeignEnum(1, "FOREIGN_BAR")
    object FOREIGN_BAZ : ForeignEnum(2, "FOREIGN_BAZ")
    class UNRECOGNIZED(value: Int) : ForeignEnum(value)

    companion object : pbandk.Message.Enum.Companion<ForeignEnum> {
        val values: List<ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
    }
}

data class TestAllTypesProto3(
    val optionalInt32: Int = 0,
    val optionalInt64: Long = 0L,
    val optionalUint32: Int = 0,
    val optionalUint64: Long = 0L,
    val optionalSint32: Int = 0,
    val optionalSint64: Long = 0L,
    val optionalFixed32: Int = 0,
    val optionalFixed64: Long = 0L,
    val optionalSfixed32: Int = 0,
    val optionalSfixed64: Long = 0L,
    val optionalFloat: Float = 0.0F,
    val optionalDouble: Double = 0.0,
    val optionalBool: Boolean = false,
    val optionalString: String = "",
    val optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
    val optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
    val optionalForeignMessage: pbandk.testpb.ForeignMessage? = null,
    val optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
    val optionalForeignEnum: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
    val optionalStringPiece: String = "",
    val optionalCord: String = "",
    val recursiveMessage: pbandk.testpb.TestAllTypesProto3? = null,
    val repeatedInt32: List<Int> = emptyList(),
    val repeatedInt64: List<Long> = emptyList(),
    val repeatedUint32: List<Int> = emptyList(),
    val repeatedUint64: List<Long> = emptyList(),
    val repeatedSint32: List<Int> = emptyList(),
    val repeatedSint64: List<Long> = emptyList(),
    val repeatedFixed32: List<Int> = emptyList(),
    val repeatedFixed64: List<Long> = emptyList(),
    val repeatedSfixed32: List<Int> = emptyList(),
    val repeatedSfixed64: List<Long> = emptyList(),
    val repeatedFloat: List<Float> = emptyList(),
    val repeatedDouble: List<Double> = emptyList(),
    val repeatedBool: List<Boolean> = emptyList(),
    val repeatedString: List<String> = emptyList(),
    val repeatedBytes: List<pbandk.ByteArr> = emptyList(),
    val repeatedNestedMessage: List<pbandk.testpb.TestAllTypesProto3.NestedMessage> = emptyList(),
    val repeatedForeignMessage: List<pbandk.testpb.ForeignMessage> = emptyList(),
    val repeatedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
    val repeatedForeignEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
    val repeatedStringPiece: List<String> = emptyList(),
    val repeatedCord: List<String> = emptyList(),
    val mapInt32Int32: Map<Int, Int> = emptyMap(),
    val mapInt64Int64: Map<Long, Long> = emptyMap(),
    val mapUint32Uint32: Map<Int, Int> = emptyMap(),
    val mapUint64Uint64: Map<Long, Long> = emptyMap(),
    val mapSint32Sint32: Map<Int, Int> = emptyMap(),
    val mapSint64Sint64: Map<Long, Long> = emptyMap(),
    val mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
    val mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
    val mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
    val mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
    val mapInt32Float: Map<Int, Float> = emptyMap(),
    val mapInt32Double: Map<Int, Double> = emptyMap(),
    val mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
    val mapStringString: Map<String, String> = emptyMap(),
    val mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
    val mapStringNestedMessage: Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
    val mapStringForeignMessage: Map<String, pbandk.testpb.ForeignMessage?> = emptyMap(),
    val mapStringNestedEnum: Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyMap(),
    val mapStringForeignEnum: Map<String, pbandk.testpb.ForeignEnum> = emptyMap(),
    val optionalBoolWrapper: Boolean? = null,
    val optionalInt32Wrapper: Int? = null,
    val optionalInt64Wrapper: Long? = null,
    val optionalUint32Wrapper: Int? = null,
    val optionalUint64Wrapper: Long? = null,
    val optionalFloatWrapper: Float? = null,
    val optionalDoubleWrapper: Double? = null,
    val optionalStringWrapper: String? = null,
    val optionalBytesWrapper: pbandk.ByteArr? = null,
    val repeatedBoolWrapper: List<Boolean> = emptyList(),
    val repeatedInt32Wrapper: List<Int> = emptyList(),
    val repeatedInt64Wrapper: List<Long> = emptyList(),
    val repeatedUint32Wrapper: List<Int> = emptyList(),
    val repeatedUint64Wrapper: List<Long> = emptyList(),
    val repeatedFloatWrapper: List<Float> = emptyList(),
    val repeatedDoubleWrapper: List<Double> = emptyList(),
    val repeatedStringWrapper: List<String> = emptyList(),
    val repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
    val optionalDuration: pbandk.wkt.Duration? = null,
    val optionalTimestamp: pbandk.wkt.Timestamp? = null,
    val optionalFieldMask: pbandk.wkt.FieldMask? = null,
    val optionalStruct: pbandk.wkt.Struct? = null,
    val optionalAny: pbandk.wkt.Any? = null,
    val optionalValue: pbandk.wkt.Value? = null,
    val repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
    val repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
    val repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
    val repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
    val repeatedAny: List<pbandk.wkt.Any> = emptyList(),
    val repeatedValue: List<pbandk.wkt.Value> = emptyList(),
    val fieldname1: Int = 0,
    val fieldName2: Int = 0,
    val fieldName3: Int = 0,
    val field_name4: Int = 0,
    val field0name5: Int = 0,
    val field0Name6: Int = 0,
    val fieldName7: Int = 0,
    val fieldName8: Int = 0,
    val fieldName9: Int = 0,
    val fieldName10: Int = 0,
    val fIELDNAME11: Int = 0,
    val fIELDName12: Int = 0,
    val _fieldName13: Int = 0,
    val _FieldName14: Int = 0,
    val field_name15: Int = 0,
    val field_Name16: Int = 0,
    val fieldName17_: Int = 0,
    val fieldName18_: Int = 0,
    val oneofField: OneofField<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        class OneofNestedMessage(oneofNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage) : OneofField<pbandk.testpb.TestAllTypesProto3.NestedMessage>(oneofNestedMessage)
        class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        class OneofEnum(oneofEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)) : OneofField<pbandk.testpb.TestAllTypesProto3.NestedEnum>(oneofEnum)
    }

    val oneofUint32: Int?
        get() = (oneofField as? OneofField.OneofUint32)?.value
    val oneofNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage?
        get() = (oneofField as? OneofField.OneofNestedMessage)?.value
    val oneofString: String?
        get() = (oneofField as? OneofField.OneofString)?.value
    val oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? OneofField.OneofBytes)?.value
    val oneofBool: Boolean?
        get() = (oneofField as? OneofField.OneofBool)?.value
    val oneofUint64: Long?
        get() = (oneofField as? OneofField.OneofUint64)?.value
    val oneofFloat: Float?
        get() = (oneofField as? OneofField.OneofFloat)?.value
    val oneofDouble: Double?
        get() = (oneofField as? OneofField.OneofDouble)?.value
    val oneofEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum?
        get() = (oneofField as? OneofField.OneofEnum)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestAllTypesProto3> {
        val defaultInstance by lazy { TestAllTypesProto3() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "optional_int32",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "optionalInt32",
                    value = TestAllTypesProto3::optionalInt32
                ),
                pbandk.FieldDescriptor(
                    name = "optional_int64",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                    jsonName = "optionalInt64",
                    value = TestAllTypesProto3::optionalInt64
                ),
                pbandk.FieldDescriptor(
                    name = "optional_uint32",
                    number = 3,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                    jsonName = "optionalUint32",
                    value = TestAllTypesProto3::optionalUint32
                ),
                pbandk.FieldDescriptor(
                    name = "optional_uint64",
                    number = 4,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                    jsonName = "optionalUint64",
                    value = TestAllTypesProto3::optionalUint64
                ),
                pbandk.FieldDescriptor(
                    name = "optional_sint32",
                    number = 5,
                    type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                    jsonName = "optionalSint32",
                    value = TestAllTypesProto3::optionalSint32
                ),
                pbandk.FieldDescriptor(
                    name = "optional_sint64",
                    number = 6,
                    type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                    jsonName = "optionalSint64",
                    value = TestAllTypesProto3::optionalSint64
                ),
                pbandk.FieldDescriptor(
                    name = "optional_fixed32",
                    number = 7,
                    type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                    jsonName = "optionalFixed32",
                    value = TestAllTypesProto3::optionalFixed32
                ),
                pbandk.FieldDescriptor(
                    name = "optional_fixed64",
                    number = 8,
                    type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                    jsonName = "optionalFixed64",
                    value = TestAllTypesProto3::optionalFixed64
                ),
                pbandk.FieldDescriptor(
                    name = "optional_sfixed32",
                    number = 9,
                    type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                    jsonName = "optionalSfixed32",
                    value = TestAllTypesProto3::optionalSfixed32
                ),
                pbandk.FieldDescriptor(
                    name = "optional_sfixed64",
                    number = 10,
                    type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                    jsonName = "optionalSfixed64",
                    value = TestAllTypesProto3::optionalSfixed64
                ),
                pbandk.FieldDescriptor(
                    name = "optional_float",
                    number = 11,
                    type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                    jsonName = "optionalFloat",
                    value = TestAllTypesProto3::optionalFloat
                ),
                pbandk.FieldDescriptor(
                    name = "optional_double",
                    number = 12,
                    type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                    jsonName = "optionalDouble",
                    value = TestAllTypesProto3::optionalDouble
                ),
                pbandk.FieldDescriptor(
                    name = "optional_bool",
                    number = 13,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                    jsonName = "optionalBool",
                    value = TestAllTypesProto3::optionalBool
                ),
                pbandk.FieldDescriptor(
                    name = "optional_string",
                    number = 14,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "optionalString",
                    value = TestAllTypesProto3::optionalString
                ),
                pbandk.FieldDescriptor(
                    name = "optional_bytes",
                    number = 15,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                    jsonName = "optionalBytes",
                    value = TestAllTypesProto3::optionalBytes
                ),
                pbandk.FieldDescriptor(
                    name = "optional_nested_message",
                    number = 18,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                    jsonName = "optionalNestedMessage",
                    value = TestAllTypesProto3::optionalNestedMessage
                ),
                pbandk.FieldDescriptor(
                    name = "optional_foreign_message",
                    number = 19,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                    jsonName = "optionalForeignMessage",
                    value = TestAllTypesProto3::optionalForeignMessage
                ),
                pbandk.FieldDescriptor(
                    name = "optional_nested_enum",
                    number = 21,
                    type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion),
                    jsonName = "optionalNestedEnum",
                    value = TestAllTypesProto3::optionalNestedEnum
                ),
                pbandk.FieldDescriptor(
                    name = "optional_foreign_enum",
                    number = 22,
                    type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion),
                    jsonName = "optionalForeignEnum",
                    value = TestAllTypesProto3::optionalForeignEnum
                ),
                pbandk.FieldDescriptor(
                    name = "optional_string_piece",
                    number = 24,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "optionalStringPiece",
                    value = TestAllTypesProto3::optionalStringPiece
                ),
                pbandk.FieldDescriptor(
                    name = "optional_cord",
                    number = 25,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "optionalCord",
                    value = TestAllTypesProto3::optionalCord
                ),
                pbandk.FieldDescriptor(
                    name = "recursive_message",
                    number = 27,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.Companion),
                    jsonName = "recursiveMessage",
                    value = TestAllTypesProto3::recursiveMessage
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_int32",
                    number = 31,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                    jsonName = "repeatedInt32",
                    value = TestAllTypesProto3::repeatedInt32
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_int64",
                    number = 32,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                    jsonName = "repeatedInt64",
                    value = TestAllTypesProto3::repeatedInt64
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_uint32",
                    number = 33,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                    jsonName = "repeatedUint32",
                    value = TestAllTypesProto3::repeatedUint32
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_uint64",
                    number = 34,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                    jsonName = "repeatedUint64",
                    value = TestAllTypesProto3::repeatedUint64
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_sint32",
                    number = 35,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                    jsonName = "repeatedSint32",
                    value = TestAllTypesProto3::repeatedSint32
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_sint64",
                    number = 36,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                    jsonName = "repeatedSint64",
                    value = TestAllTypesProto3::repeatedSint64
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_fixed32",
                    number = 37,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                    jsonName = "repeatedFixed32",
                    value = TestAllTypesProto3::repeatedFixed32
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_fixed64",
                    number = 38,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                    jsonName = "repeatedFixed64",
                    value = TestAllTypesProto3::repeatedFixed64
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_sfixed32",
                    number = 39,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                    jsonName = "repeatedSfixed32",
                    value = TestAllTypesProto3::repeatedSfixed32
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_sfixed64",
                    number = 40,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                    jsonName = "repeatedSfixed64",
                    value = TestAllTypesProto3::repeatedSfixed64
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_float",
                    number = 41,
                    type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                    jsonName = "repeatedFloat",
                    value = TestAllTypesProto3::repeatedFloat
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_double",
                    number = 42,
                    type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                    jsonName = "repeatedDouble",
                    value = TestAllTypesProto3::repeatedDouble
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_bool",
                    number = 43,
                    type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                    jsonName = "repeatedBool",
                    value = TestAllTypesProto3::repeatedBool
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_string",
                    number = 44,
                    type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                    jsonName = "repeatedString",
                    value = TestAllTypesProto3::repeatedString
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_bytes",
                    number = 45,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                    jsonName = "repeatedBytes",
                    value = TestAllTypesProto3::repeatedBytes
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_nested_message",
                    number = 48,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion)),
                    jsonName = "repeatedNestedMessage",
                    value = TestAllTypesProto3::repeatedNestedMessage
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_foreign_message",
                    number = 49,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                    jsonName = "repeatedForeignMessage",
                    value = TestAllTypesProto3::repeatedForeignMessage
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_nested_enum",
                    number = 51,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                    jsonName = "repeatedNestedEnum",
                    value = TestAllTypesProto3::repeatedNestedEnum
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_foreign_enum",
                    number = 52,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion), packed = true),
                    jsonName = "repeatedForeignEnum",
                    value = TestAllTypesProto3::repeatedForeignEnum
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_string_piece",
                    number = 54,
                    type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                    jsonName = "repeatedStringPiece",
                    value = TestAllTypesProto3::repeatedStringPiece
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_cord",
                    number = 55,
                    type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                    jsonName = "repeatedCord",
                    value = TestAllTypesProto3::repeatedCord
                ),
                pbandk.FieldDescriptor(
                    name = "map_int32_int32",
                    number = 56,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                    jsonName = "mapInt32Int32",
                    value = TestAllTypesProto3::mapInt32Int32
                ),
                pbandk.FieldDescriptor(
                    name = "map_int64_int64",
                    number = 57,
                    type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                    jsonName = "mapInt64Int64",
                    value = TestAllTypesProto3::mapInt64Int64
                ),
                pbandk.FieldDescriptor(
                    name = "map_uint32_uint32",
                    number = 58,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                    jsonName = "mapUint32Uint32",
                    value = TestAllTypesProto3::mapUint32Uint32
                ),
                pbandk.FieldDescriptor(
                    name = "map_uint64_uint64",
                    number = 59,
                    type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                    jsonName = "mapUint64Uint64",
                    value = TestAllTypesProto3::mapUint64Uint64
                ),
                pbandk.FieldDescriptor(
                    name = "map_sint32_sint32",
                    number = 60,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                    jsonName = "mapSint32Sint32",
                    value = TestAllTypesProto3::mapSint32Sint32
                ),
                pbandk.FieldDescriptor(
                    name = "map_sint64_sint64",
                    number = 61,
                    type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                    jsonName = "mapSint64Sint64",
                    value = TestAllTypesProto3::mapSint64Sint64
                ),
                pbandk.FieldDescriptor(
                    name = "map_fixed32_fixed32",
                    number = 62,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                    jsonName = "mapFixed32Fixed32",
                    value = TestAllTypesProto3::mapFixed32Fixed32
                ),
                pbandk.FieldDescriptor(
                    name = "map_fixed64_fixed64",
                    number = 63,
                    type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                    jsonName = "mapFixed64Fixed64",
                    value = TestAllTypesProto3::mapFixed64Fixed64
                ),
                pbandk.FieldDescriptor(
                    name = "map_sfixed32_sfixed32",
                    number = 64,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                    jsonName = "mapSfixed32Sfixed32",
                    value = TestAllTypesProto3::mapSfixed32Sfixed32
                ),
                pbandk.FieldDescriptor(
                    name = "map_sfixed64_sfixed64",
                    number = 65,
                    type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                    jsonName = "mapSfixed64Sfixed64",
                    value = TestAllTypesProto3::mapSfixed64Sfixed64
                ),
                pbandk.FieldDescriptor(
                    name = "map_int32_float",
                    number = 66,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Float>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                    jsonName = "mapInt32Float",
                    value = TestAllTypesProto3::mapInt32Float
                ),
                pbandk.FieldDescriptor(
                    name = "map_int32_double",
                    number = 67,
                    type = pbandk.FieldDescriptor.Type.Map<Int, Double>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                    jsonName = "mapInt32Double",
                    value = TestAllTypesProto3::mapInt32Double
                ),
                pbandk.FieldDescriptor(
                    name = "map_bool_bool",
                    number = 68,
                    type = pbandk.FieldDescriptor.Type.Map<Boolean, Boolean>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                    jsonName = "mapBoolBool",
                    value = TestAllTypesProto3::mapBoolBool
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_string",
                    number = 69,
                    type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                    jsonName = "mapStringString",
                    value = TestAllTypesProto3::mapStringString
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_bytes",
                    number = 70,
                    type = pbandk.FieldDescriptor.Type.Map<String, pbandk.ByteArr>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                    jsonName = "mapStringBytes",
                    value = TestAllTypesProto3::mapStringBytes
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_nested_message",
                    number = 71,
                    type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion)),
                    jsonName = "mapStringNestedMessage",
                    value = TestAllTypesProto3::mapStringNestedMessage
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_foreign_message",
                    number = 72,
                    type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.ForeignMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                    jsonName = "mapStringForeignMessage",
                    value = TestAllTypesProto3::mapStringForeignMessage
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_nested_enum",
                    number = 73,
                    type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion)),
                    jsonName = "mapStringNestedEnum",
                    value = TestAllTypesProto3::mapStringNestedEnum
                ),
                pbandk.FieldDescriptor(
                    name = "map_string_foreign_enum",
                    number = 74,
                    type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.ForeignEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion)),
                    jsonName = "mapStringForeignEnum",
                    value = TestAllTypesProto3::mapStringForeignEnum
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_uint32",
                    number = 111,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofUint32",
                    value = TestAllTypesProto3::oneofUint32
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_nested_message",
                    number = 112,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                    oneofMember = true,
                    jsonName = "oneofNestedMessage",
                    value = TestAllTypesProto3::oneofNestedMessage
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_string",
                    number = 113,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofString",
                    value = TestAllTypesProto3::oneofString
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_bytes",
                    number = 114,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofBytes",
                    value = TestAllTypesProto3::oneofBytes
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_bool",
                    number = 115,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofBool",
                    value = TestAllTypesProto3::oneofBool
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_uint64",
                    number = 116,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofUint64",
                    value = TestAllTypesProto3::oneofUint64
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_float",
                    number = 117,
                    type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofFloat",
                    value = TestAllTypesProto3::oneofFloat
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_double",
                    number = 118,
                    type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofDouble",
                    value = TestAllTypesProto3::oneofDouble
                ),
                pbandk.FieldDescriptor(
                    name = "oneof_enum",
                    number = 119,
                    type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion, hasPresence = true),
                    oneofMember = true,
                    jsonName = "oneofEnum",
                    value = TestAllTypesProto3::oneofEnum
                ),
                pbandk.FieldDescriptor(
                    name = "optional_bool_wrapper",
                    number = 201,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion),
                    jsonName = "optionalBoolWrapper",
                    value = TestAllTypesProto3::optionalBoolWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_int32_wrapper",
                    number = 202,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion),
                    jsonName = "optionalInt32Wrapper",
                    value = TestAllTypesProto3::optionalInt32Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_int64_wrapper",
                    number = 203,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion),
                    jsonName = "optionalInt64Wrapper",
                    value = TestAllTypesProto3::optionalInt64Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_uint32_wrapper",
                    number = 204,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion),
                    jsonName = "optionalUint32Wrapper",
                    value = TestAllTypesProto3::optionalUint32Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_uint64_wrapper",
                    number = 205,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion),
                    jsonName = "optionalUint64Wrapper",
                    value = TestAllTypesProto3::optionalUint64Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_float_wrapper",
                    number = 206,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion),
                    jsonName = "optionalFloatWrapper",
                    value = TestAllTypesProto3::optionalFloatWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_double_wrapper",
                    number = 207,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion),
                    jsonName = "optionalDoubleWrapper",
                    value = TestAllTypesProto3::optionalDoubleWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_string_wrapper",
                    number = 208,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                    jsonName = "optionalStringWrapper",
                    value = TestAllTypesProto3::optionalStringWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_bytes_wrapper",
                    number = 209,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion),
                    jsonName = "optionalBytesWrapper",
                    value = TestAllTypesProto3::optionalBytesWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_bool_wrapper",
                    number = 211,
                    type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion)),
                    jsonName = "repeatedBoolWrapper",
                    value = TestAllTypesProto3::repeatedBoolWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_int32_wrapper",
                    number = 212,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion)),
                    jsonName = "repeatedInt32Wrapper",
                    value = TestAllTypesProto3::repeatedInt32Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_int64_wrapper",
                    number = 213,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion)),
                    jsonName = "repeatedInt64Wrapper",
                    value = TestAllTypesProto3::repeatedInt64Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_uint32_wrapper",
                    number = 214,
                    type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion)),
                    jsonName = "repeatedUint32Wrapper",
                    value = TestAllTypesProto3::repeatedUint32Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_uint64_wrapper",
                    number = 215,
                    type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                    jsonName = "repeatedUint64Wrapper",
                    value = TestAllTypesProto3::repeatedUint64Wrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_float_wrapper",
                    number = 216,
                    type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion)),
                    jsonName = "repeatedFloatWrapper",
                    value = TestAllTypesProto3::repeatedFloatWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_double_wrapper",
                    number = 217,
                    type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion)),
                    jsonName = "repeatedDoubleWrapper",
                    value = TestAllTypesProto3::repeatedDoubleWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_string_wrapper",
                    number = 218,
                    type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion)),
                    jsonName = "repeatedStringWrapper",
                    value = TestAllTypesProto3::repeatedStringWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_bytes_wrapper",
                    number = 219,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion)),
                    jsonName = "repeatedBytesWrapper",
                    value = TestAllTypesProto3::repeatedBytesWrapper
                ),
                pbandk.FieldDescriptor(
                    name = "optional_duration",
                    number = 301,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                    jsonName = "optionalDuration",
                    value = TestAllTypesProto3::optionalDuration
                ),
                pbandk.FieldDescriptor(
                    name = "optional_timestamp",
                    number = 302,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                    jsonName = "optionalTimestamp",
                    value = TestAllTypesProto3::optionalTimestamp
                ),
                pbandk.FieldDescriptor(
                    name = "optional_field_mask",
                    number = 303,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion),
                    jsonName = "optionalFieldMask",
                    value = TestAllTypesProto3::optionalFieldMask
                ),
                pbandk.FieldDescriptor(
                    name = "optional_struct",
                    number = 304,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                    jsonName = "optionalStruct",
                    value = TestAllTypesProto3::optionalStruct
                ),
                pbandk.FieldDescriptor(
                    name = "optional_any",
                    number = 305,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                    jsonName = "optionalAny",
                    value = TestAllTypesProto3::optionalAny
                ),
                pbandk.FieldDescriptor(
                    name = "optional_value",
                    number = 306,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                    jsonName = "optionalValue",
                    value = TestAllTypesProto3::optionalValue
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_duration",
                    number = 311,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                    jsonName = "repeatedDuration",
                    value = TestAllTypesProto3::repeatedDuration
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_timestamp",
                    number = 312,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Timestamp>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion)),
                    jsonName = "repeatedTimestamp",
                    value = TestAllTypesProto3::repeatedTimestamp
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_fieldmask",
                    number = 313,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldMask>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion)),
                    jsonName = "repeatedFieldmask",
                    value = TestAllTypesProto3::repeatedFieldmask
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_any",
                    number = 315,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Any>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion)),
                    jsonName = "repeatedAny",
                    value = TestAllTypesProto3::repeatedAny
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_value",
                    number = 316,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                    jsonName = "repeatedValue",
                    value = TestAllTypesProto3::repeatedValue
                ),
                pbandk.FieldDescriptor(
                    name = "repeated_struct",
                    number = 324,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Struct>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion)),
                    jsonName = "repeatedStruct",
                    value = TestAllTypesProto3::repeatedStruct
                ),
                pbandk.FieldDescriptor(
                    name = "fieldname1",
                    number = 401,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldname1",
                    value = TestAllTypesProto3::fieldname1
                ),
                pbandk.FieldDescriptor(
                    name = "field_name2",
                    number = 402,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName2",
                    value = TestAllTypesProto3::fieldName2
                ),
                pbandk.FieldDescriptor(
                    name = "_field_name3",
                    number = 403,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName3",
                    value = TestAllTypesProto3::fieldName3
                ),
                pbandk.FieldDescriptor(
                    name = "field__name4_",
                    number = 404,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName4",
                    value = TestAllTypesProto3::field_name4
                ),
                pbandk.FieldDescriptor(
                    name = "field0name5",
                    number = 405,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "field0name5",
                    value = TestAllTypesProto3::field0name5
                ),
                pbandk.FieldDescriptor(
                    name = "field_0_name6",
                    number = 406,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "field0Name6",
                    value = TestAllTypesProto3::field0Name6
                ),
                pbandk.FieldDescriptor(
                    name = "fieldName7",
                    number = 407,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName7",
                    value = TestAllTypesProto3::fieldName7
                ),
                pbandk.FieldDescriptor(
                    name = "FieldName8",
                    number = 408,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName8",
                    value = TestAllTypesProto3::fieldName8
                ),
                pbandk.FieldDescriptor(
                    name = "field_Name9",
                    number = 409,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName9",
                    value = TestAllTypesProto3::fieldName9
                ),
                pbandk.FieldDescriptor(
                    name = "Field_Name10",
                    number = 410,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName10",
                    value = TestAllTypesProto3::fieldName10
                ),
                pbandk.FieldDescriptor(
                    name = "FIELD_NAME11",
                    number = 411,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FIELDNAME11",
                    value = TestAllTypesProto3::fIELDNAME11
                ),
                pbandk.FieldDescriptor(
                    name = "FIELD_name12",
                    number = 412,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FIELDName12",
                    value = TestAllTypesProto3::fIELDName12
                ),
                pbandk.FieldDescriptor(
                    name = "__field_name13",
                    number = 413,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName13",
                    value = TestAllTypesProto3::_fieldName13
                ),
                pbandk.FieldDescriptor(
                    name = "__Field_name14",
                    number = 414,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName14",
                    value = TestAllTypesProto3::_FieldName14
                ),
                pbandk.FieldDescriptor(
                    name = "field__name15",
                    number = 415,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName15",
                    value = TestAllTypesProto3::field_name15
                ),
                pbandk.FieldDescriptor(
                    name = "field__Name16",
                    number = 416,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName16",
                    value = TestAllTypesProto3::field_Name16
                ),
                pbandk.FieldDescriptor(
                    name = "field_name17__",
                    number = 417,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "fieldName17",
                    value = TestAllTypesProto3::fieldName17_
                ),
                pbandk.FieldDescriptor(
                    name = "Field_name18__",
                    number = 418,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "FieldName18",
                    value = TestAllTypesProto3::fieldName18_
                )
            )
        }
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is TestAllTypesProto3.NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestAllTypesProto3.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(0, "FOO")
        object BAR : NestedEnum(1, "BAR")
        object BAZ : NestedEnum(2, "BAZ")
        object NEG : NestedEnum(-1, "NEG")
        class UNRECOGNIZED(value: Int) : TestAllTypesProto3.NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<TestAllTypesProto3.NestedEnum> {
            val values: List<TestAllTypesProto3.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    data class NestedMessage(
        val a: Int = 0,
        val corecursive: pbandk.testpb.TestAllTypesProto3? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.NestedMessage> {
            val defaultInstance by lazy { TestAllTypesProto3.NestedMessage() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.NestedMessage.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "a",
                        value = NestedMessage::a
                    ),
                    pbandk.FieldDescriptor(
                        name = "corecursive",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.Companion),
                        jsonName = "corecursive",
                        value = NestedMessage::corecursive
                    )
                )
            }
        }
    }

    data class MapInt32Int32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Int> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapInt32Int32Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapInt32Int32Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapInt32Int32Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "key",
                        value = MapInt32Int32Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "value",
                        value = MapInt32Int32Entry::value
                    )
                )
            }
        }
    }

    data class MapInt64Int64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long, Long> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapInt64Int64Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapInt64Int64Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapInt64Int64Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "key",
                        value = MapInt64Int64Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "value",
                        value = MapInt64Int64Entry::value
                    )
                )
            }
        }
    }

    data class MapUint32Uint32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Int> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapUint32Uint32Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapUint32Uint32Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapUint32Uint32Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "key",
                        value = MapUint32Uint32Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "value",
                        value = MapUint32Uint32Entry::value
                    )
                )
            }
        }
    }

    data class MapUint64Uint64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long, Long> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapUint64Uint64Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapUint64Uint64Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapUint64Uint64Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "key",
                        value = MapUint64Uint64Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "value",
                        value = MapUint64Uint64Entry::value
                    )
                )
            }
        }
    }

    data class MapSint32Sint32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Int> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapSint32Sint32Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapSint32Sint32Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapSint32Sint32Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                        jsonName = "key",
                        value = MapSint32Sint32Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                        jsonName = "value",
                        value = MapSint32Sint32Entry::value
                    )
                )
            }
        }
    }

    data class MapSint64Sint64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long, Long> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapSint64Sint64Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapSint64Sint64Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapSint64Sint64Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                        jsonName = "key",
                        value = MapSint64Sint64Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                        jsonName = "value",
                        value = MapSint64Sint64Entry::value
                    )
                )
            }
        }
    }

    data class MapFixed32Fixed32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Int> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapFixed32Fixed32Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapFixed32Fixed32Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapFixed32Fixed32Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                        jsonName = "key",
                        value = MapFixed32Fixed32Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                        jsonName = "value",
                        value = MapFixed32Fixed32Entry::value
                    )
                )
            }
        }
    }

    data class MapFixed64Fixed64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long, Long> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapFixed64Fixed64Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapFixed64Fixed64Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapFixed64Fixed64Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                        jsonName = "key",
                        value = MapFixed64Fixed64Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                        jsonName = "value",
                        value = MapFixed64Fixed64Entry::value
                    )
                )
            }
        }
    }

    data class MapSfixed32Sfixed32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Int> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapSfixed32Sfixed32Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapSfixed32Sfixed32Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapSfixed32Sfixed32Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                        jsonName = "key",
                        value = MapSfixed32Sfixed32Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                        jsonName = "value",
                        value = MapSfixed32Sfixed32Entry::value
                    )
                )
            }
        }
    }

    data class MapSfixed64Sfixed64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long, Long> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapSfixed64Sfixed64Entry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapSfixed64Sfixed64Entry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapSfixed64Sfixed64Entry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                        jsonName = "key",
                        value = MapSfixed64Sfixed64Entry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                        jsonName = "value",
                        value = MapSfixed64Sfixed64Entry::value
                    )
                )
            }
        }
    }

    data class MapInt32FloatEntry(
        override val key: Int = 0,
        override val value: Float = 0.0F,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Float> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapInt32FloatEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapInt32FloatEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapInt32FloatEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "key",
                        value = MapInt32FloatEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "value",
                        value = MapInt32FloatEntry::value
                    )
                )
            }
        }
    }

    data class MapInt32DoubleEntry(
        override val key: Int = 0,
        override val value: Double = 0.0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int, Double> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapInt32DoubleEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapInt32DoubleEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapInt32DoubleEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "key",
                        value = MapInt32DoubleEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "value",
                        value = MapInt32DoubleEntry::value
                    )
                )
            }
        }
    }

    data class MapBoolBoolEntry(
        override val key: Boolean = false,
        override val value: Boolean = false,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Boolean, Boolean> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapBoolBoolEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapBoolBoolEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapBoolBoolEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "key",
                        value = MapBoolBoolEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "value",
                        value = MapBoolBoolEntry::value
                    )
                )
            }
        }
    }

    data class MapStringStringEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringStringEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringStringEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringStringEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringStringEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = MapStringStringEntry::value
                    )
                )
            }
        }
    }

    data class MapStringBytesEntry(
        override val key: String = "",
        override val value: pbandk.ByteArr = pbandk.ByteArr.empty,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.ByteArr> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringBytesEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringBytesEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringBytesEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringBytesEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = MapStringBytesEntry::value
                    )
                )
            }
        }
    }

    data class MapStringNestedMessageEntry(
        override val key: String = "",
        override val value: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringNestedMessageEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringNestedMessageEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringNestedMessageEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringNestedMessageEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                        jsonName = "value",
                        value = MapStringNestedMessageEntry::value
                    )
                )
            }
        }
    }

    data class MapStringForeignMessageEntry(
        override val key: String = "",
        override val value: pbandk.testpb.ForeignMessage? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.ForeignMessage?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringForeignMessageEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringForeignMessageEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringForeignMessageEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringForeignMessageEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "value",
                        value = MapStringForeignMessageEntry::value
                    )
                )
            }
        }
    }

    data class MapStringNestedEnumEntry(
        override val key: String = "",
        override val value: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedEnum> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringNestedEnumEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringNestedEnumEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringNestedEnumEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringNestedEnumEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion),
                        jsonName = "value",
                        value = MapStringNestedEnumEntry::value
                    )
                )
            }
        }
    }

    data class MapStringForeignEnumEntry(
        override val key: String = "",
        override val value: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.ForeignEnum> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto3.MapStringForeignEnumEntry> {
            val defaultInstance by lazy { TestAllTypesProto3.MapStringForeignEnumEntry() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = TestAllTypesProto3.MapStringForeignEnumEntry.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = MapStringForeignEnumEntry::key
                    ),
                    pbandk.FieldDescriptor(
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion),
                        jsonName = "value",
                        value = MapStringForeignEnumEntry::value
                    )
                )
            }
        }
    }
}

data class ForeignMessage(
    val c: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ForeignMessage> {
        val defaultInstance by lazy { ForeignMessage() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = ForeignMessage.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "c",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "c",
                    value = ForeignMessage::c
                )
            )
        }
    }
}

fun TestAllTypesProto3?.orDefault() = this ?: TestAllTypesProto3.defaultInstance

private fun TestAllTypesProto3.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3 = (plus as? TestAllTypesProto3)?.copy(
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    optionalForeignMessage = optionalForeignMessage?.plus(plus.optionalForeignMessage) ?: plus.optionalForeignMessage,
    recursiveMessage = recursiveMessage?.plus(plus.recursiveMessage) ?: plus.recursiveMessage,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    repeatedInt64 = repeatedInt64 + plus.repeatedInt64,
    repeatedUint32 = repeatedUint32 + plus.repeatedUint32,
    repeatedUint64 = repeatedUint64 + plus.repeatedUint64,
    repeatedSint32 = repeatedSint32 + plus.repeatedSint32,
    repeatedSint64 = repeatedSint64 + plus.repeatedSint64,
    repeatedFixed32 = repeatedFixed32 + plus.repeatedFixed32,
    repeatedFixed64 = repeatedFixed64 + plus.repeatedFixed64,
    repeatedSfixed32 = repeatedSfixed32 + plus.repeatedSfixed32,
    repeatedSfixed64 = repeatedSfixed64 + plus.repeatedSfixed64,
    repeatedFloat = repeatedFloat + plus.repeatedFloat,
    repeatedDouble = repeatedDouble + plus.repeatedDouble,
    repeatedBool = repeatedBool + plus.repeatedBool,
    repeatedString = repeatedString + plus.repeatedString,
    repeatedBytes = repeatedBytes + plus.repeatedBytes,
    repeatedNestedMessage = repeatedNestedMessage + plus.repeatedNestedMessage,
    repeatedForeignMessage = repeatedForeignMessage + plus.repeatedForeignMessage,
    repeatedNestedEnum = repeatedNestedEnum + plus.repeatedNestedEnum,
    repeatedForeignEnum = repeatedForeignEnum + plus.repeatedForeignEnum,
    repeatedStringPiece = repeatedStringPiece + plus.repeatedStringPiece,
    repeatedCord = repeatedCord + plus.repeatedCord,
    mapInt32Int32 = mapInt32Int32 + plus.mapInt32Int32,
    mapInt64Int64 = mapInt64Int64 + plus.mapInt64Int64,
    mapUint32Uint32 = mapUint32Uint32 + plus.mapUint32Uint32,
    mapUint64Uint64 = mapUint64Uint64 + plus.mapUint64Uint64,
    mapSint32Sint32 = mapSint32Sint32 + plus.mapSint32Sint32,
    mapSint64Sint64 = mapSint64Sint64 + plus.mapSint64Sint64,
    mapFixed32Fixed32 = mapFixed32Fixed32 + plus.mapFixed32Fixed32,
    mapFixed64Fixed64 = mapFixed64Fixed64 + plus.mapFixed64Fixed64,
    mapSfixed32Sfixed32 = mapSfixed32Sfixed32 + plus.mapSfixed32Sfixed32,
    mapSfixed64Sfixed64 = mapSfixed64Sfixed64 + plus.mapSfixed64Sfixed64,
    mapInt32Float = mapInt32Float + plus.mapInt32Float,
    mapInt32Double = mapInt32Double + plus.mapInt32Double,
    mapBoolBool = mapBoolBool + plus.mapBoolBool,
    mapStringString = mapStringString + plus.mapStringString,
    mapStringBytes = mapStringBytes + plus.mapStringBytes,
    mapStringNestedMessage = mapStringNestedMessage + plus.mapStringNestedMessage,
    mapStringForeignMessage = mapStringForeignMessage + plus.mapStringForeignMessage,
    mapStringNestedEnum = mapStringNestedEnum + plus.mapStringNestedEnum,
    mapStringForeignEnum = mapStringForeignEnum + plus.mapStringForeignEnum,
    optionalBoolWrapper = plus.optionalBoolWrapper ?: optionalBoolWrapper,
    optionalInt32Wrapper = plus.optionalInt32Wrapper ?: optionalInt32Wrapper,
    optionalInt64Wrapper = plus.optionalInt64Wrapper ?: optionalInt64Wrapper,
    optionalUint32Wrapper = plus.optionalUint32Wrapper ?: optionalUint32Wrapper,
    optionalUint64Wrapper = plus.optionalUint64Wrapper ?: optionalUint64Wrapper,
    optionalFloatWrapper = plus.optionalFloatWrapper ?: optionalFloatWrapper,
    optionalDoubleWrapper = plus.optionalDoubleWrapper ?: optionalDoubleWrapper,
    optionalStringWrapper = plus.optionalStringWrapper ?: optionalStringWrapper,
    optionalBytesWrapper = plus.optionalBytesWrapper ?: optionalBytesWrapper,
    repeatedBoolWrapper = repeatedBoolWrapper + plus.repeatedBoolWrapper,
    repeatedInt32Wrapper = repeatedInt32Wrapper + plus.repeatedInt32Wrapper,
    repeatedInt64Wrapper = repeatedInt64Wrapper + plus.repeatedInt64Wrapper,
    repeatedUint32Wrapper = repeatedUint32Wrapper + plus.repeatedUint32Wrapper,
    repeatedUint64Wrapper = repeatedUint64Wrapper + plus.repeatedUint64Wrapper,
    repeatedFloatWrapper = repeatedFloatWrapper + plus.repeatedFloatWrapper,
    repeatedDoubleWrapper = repeatedDoubleWrapper + plus.repeatedDoubleWrapper,
    repeatedStringWrapper = repeatedStringWrapper + plus.repeatedStringWrapper,
    repeatedBytesWrapper = repeatedBytesWrapper + plus.repeatedBytesWrapper,
    optionalDuration = optionalDuration?.plus(plus.optionalDuration) ?: plus.optionalDuration,
    optionalTimestamp = optionalTimestamp?.plus(plus.optionalTimestamp) ?: plus.optionalTimestamp,
    optionalFieldMask = optionalFieldMask?.plus(plus.optionalFieldMask) ?: plus.optionalFieldMask,
    optionalStruct = optionalStruct?.plus(plus.optionalStruct) ?: plus.optionalStruct,
    optionalAny = optionalAny?.plus(plus.optionalAny) ?: plus.optionalAny,
    optionalValue = optionalValue?.plus(plus.optionalValue) ?: plus.optionalValue,
    repeatedDuration = repeatedDuration + plus.repeatedDuration,
    repeatedTimestamp = repeatedTimestamp + plus.repeatedTimestamp,
    repeatedFieldmask = repeatedFieldmask + plus.repeatedFieldmask,
    repeatedStruct = repeatedStruct + plus.repeatedStruct,
    repeatedAny = repeatedAny + plus.repeatedAny,
    repeatedValue = repeatedValue + plus.repeatedValue,
    oneofField = when {
        oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
            TestAllTypesProto3.OneofField.OneofNestedMessage(oneofField.value + plus.oneofField.value)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3 {
    var optionalInt32 = 0
    var optionalInt64 = 0L
    var optionalUint32 = 0
    var optionalUint64 = 0L
    var optionalSint32 = 0
    var optionalSint64 = 0L
    var optionalFixed32 = 0
    var optionalFixed64 = 0L
    var optionalSfixed32 = 0
    var optionalSfixed64 = 0L
    var optionalFloat = 0.0F
    var optionalDouble = 0.0
    var optionalBool = false
    var optionalString = ""
    var optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty
    var optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null
    var optionalForeignMessage: pbandk.testpb.ForeignMessage? = null
    var optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)
    var optionalForeignEnum: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0)
    var optionalStringPiece = ""
    var optionalCord = ""
    var recursiveMessage: pbandk.testpb.TestAllTypesProto3? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedString: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytes: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var repeatedNestedMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedMessage>? = null
    var repeatedForeignMessage: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignMessage>? = null
    var repeatedNestedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var repeatedForeignEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null
    var repeatedStringPiece: pbandk.ListWithSize.Builder<String>? = null
    var repeatedCord: pbandk.ListWithSize.Builder<String>? = null
    var mapInt32Int32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapInt64Int64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapUint32Uint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapUint64Uint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSint32Sint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSint64Sint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapFixed32Fixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapFixed64Fixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSfixed32Sfixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSfixed64Sfixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapInt32Float: pbandk.MessageMap.Builder<Int, Float>? = null
    var mapInt32Double: pbandk.MessageMap.Builder<Int, Double>? = null
    var mapBoolBool: pbandk.MessageMap.Builder<Boolean, Boolean>? = null
    var mapStringString: pbandk.MessageMap.Builder<String, String>? = null
    var mapStringBytes: pbandk.MessageMap.Builder<String, pbandk.ByteArr>? = null
    var mapStringNestedMessage: pbandk.MessageMap.Builder<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>? = null
    var mapStringForeignMessage: pbandk.MessageMap.Builder<String, pbandk.testpb.ForeignMessage?>? = null
    var mapStringNestedEnum: pbandk.MessageMap.Builder<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var mapStringForeignEnum: pbandk.MessageMap.Builder<String, pbandk.testpb.ForeignEnum>? = null
    var optionalBoolWrapper: Boolean? = null
    var optionalInt32Wrapper: Int? = null
    var optionalInt64Wrapper: Long? = null
    var optionalUint32Wrapper: Int? = null
    var optionalUint64Wrapper: Long? = null
    var optionalFloatWrapper: Float? = null
    var optionalDoubleWrapper: Double? = null
    var optionalStringWrapper: String? = null
    var optionalBytesWrapper: pbandk.ByteArr? = null
    var repeatedBoolWrapper: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedInt32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloatWrapper: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDoubleWrapper: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedStringWrapper: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytesWrapper: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var optionalDuration: pbandk.wkt.Duration? = null
    var optionalTimestamp: pbandk.wkt.Timestamp? = null
    var optionalFieldMask: pbandk.wkt.FieldMask? = null
    var optionalStruct: pbandk.wkt.Struct? = null
    var optionalAny: pbandk.wkt.Any? = null
    var optionalValue: pbandk.wkt.Value? = null
    var repeatedDuration: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null
    var repeatedTimestamp: pbandk.ListWithSize.Builder<pbandk.wkt.Timestamp>? = null
    var repeatedFieldmask: pbandk.ListWithSize.Builder<pbandk.wkt.FieldMask>? = null
    var repeatedStruct: pbandk.ListWithSize.Builder<pbandk.wkt.Struct>? = null
    var repeatedAny: pbandk.ListWithSize.Builder<pbandk.wkt.Any>? = null
    var repeatedValue: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null
    var fieldname1 = 0
    var fieldName2 = 0
    var fieldName3 = 0
    var field_name4 = 0
    var field0name5 = 0
    var field0Name6 = 0
    var fieldName7 = 0
    var fieldName8 = 0
    var fieldName9 = 0
    var fieldName10 = 0
    var fIELDNAME11 = 0
    var fIELDName12 = 0
    var _fieldName13 = 0
    var _FieldName14 = 0
    var field_name15 = 0
    var field_Name16 = 0
    var fieldName17_ = 0
    var fieldName18_ = 0
    var oneofField: TestAllTypesProto3.OneofField<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalInt32 = _fieldValue as Int
            2 -> optionalInt64 = _fieldValue as Long
            3 -> optionalUint32 = _fieldValue as Int
            4 -> optionalUint64 = _fieldValue as Long
            5 -> optionalSint32 = _fieldValue as Int
            6 -> optionalSint64 = _fieldValue as Long
            7 -> optionalFixed32 = _fieldValue as Int
            8 -> optionalFixed64 = _fieldValue as Long
            9 -> optionalSfixed32 = _fieldValue as Int
            10 -> optionalSfixed64 = _fieldValue as Long
            11 -> optionalFloat = _fieldValue as Float
            12 -> optionalDouble = _fieldValue as Double
            13 -> optionalBool = _fieldValue as Boolean
            14 -> optionalString = _fieldValue as String
            15 -> optionalBytes = _fieldValue as pbandk.ByteArr
            18 -> optionalNestedMessage = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage
            19 -> optionalForeignMessage = _fieldValue as pbandk.testpb.ForeignMessage
            21 -> optionalNestedEnum = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum
            22 -> optionalForeignEnum = _fieldValue as pbandk.testpb.ForeignEnum
            24 -> optionalStringPiece = _fieldValue as String
            25 -> optionalCord = _fieldValue as String
            27 -> recursiveMessage = _fieldValue as pbandk.testpb.TestAllTypesProto3
            31 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            32 -> repeatedInt64 = (repeatedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            33 -> repeatedUint32 = (repeatedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            34 -> repeatedUint64 = (repeatedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            35 -> repeatedSint32 = (repeatedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            36 -> repeatedSint64 = (repeatedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            37 -> repeatedFixed32 = (repeatedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            38 -> repeatedFixed64 = (repeatedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            39 -> repeatedSfixed32 = (repeatedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            40 -> repeatedSfixed64 = (repeatedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            41 -> repeatedFloat = (repeatedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            42 -> repeatedDouble = (repeatedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            43 -> repeatedBool = (repeatedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            44 -> repeatedString = (repeatedString ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            45 -> repeatedBytes = (repeatedBytes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            48 -> repeatedNestedMessage = (repeatedNestedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedMessage> }
            49 -> repeatedForeignMessage = (repeatedForeignMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignMessage> }
            51 -> repeatedNestedEnum = (repeatedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedEnum> }
            52 -> repeatedForeignEnum = (repeatedForeignEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
            54 -> repeatedStringPiece = (repeatedStringPiece ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            55 -> repeatedCord = (repeatedCord ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            56 -> mapInt32Int32 = (mapInt32Int32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            57 -> mapInt64Int64 = (mapInt64Int64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            58 -> mapUint32Uint32 = (mapUint32Uint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            59 -> mapUint64Uint64 = (mapUint64Uint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            60 -> mapSint32Sint32 = (mapSint32Sint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            61 -> mapSint64Sint64 = (mapSint64Sint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            62 -> mapFixed32Fixed32 = (mapFixed32Fixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            63 -> mapFixed64Fixed64 = (mapFixed64Fixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            64 -> mapSfixed32Sfixed32 = (mapSfixed32Sfixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            65 -> mapSfixed64Sfixed64 = (mapSfixed64Sfixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            66 -> mapInt32Float = (mapInt32Float ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Float>> }
            67 -> mapInt32Double = (mapInt32Double ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Double>> }
            68 -> mapBoolBool = (mapBoolBool ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Boolean, Boolean>> }
            69 -> mapStringString = (mapStringString ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
            70 -> mapStringBytes = (mapStringBytes ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.ByteArr>> }
            71 -> mapStringNestedMessage = (mapStringNestedMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>> }
            72 -> mapStringForeignMessage = (mapStringForeignMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.ForeignMessage?>> }
            73 -> mapStringNestedEnum = (mapStringNestedEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>> }
            74 -> mapStringForeignEnum = (mapStringForeignEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.ForeignEnum>> }
            111 -> oneofField = TestAllTypesProto3.OneofField.OneofUint32(_fieldValue as Int)
            112 -> oneofField = TestAllTypesProto3.OneofField.OneofNestedMessage(_fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage)
            113 -> oneofField = TestAllTypesProto3.OneofField.OneofString(_fieldValue as String)
            114 -> oneofField = TestAllTypesProto3.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
            115 -> oneofField = TestAllTypesProto3.OneofField.OneofBool(_fieldValue as Boolean)
            116 -> oneofField = TestAllTypesProto3.OneofField.OneofUint64(_fieldValue as Long)
            117 -> oneofField = TestAllTypesProto3.OneofField.OneofFloat(_fieldValue as Float)
            118 -> oneofField = TestAllTypesProto3.OneofField.OneofDouble(_fieldValue as Double)
            119 -> oneofField = TestAllTypesProto3.OneofField.OneofEnum(_fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum)
            201 -> optionalBoolWrapper = _fieldValue as Boolean
            202 -> optionalInt32Wrapper = _fieldValue as Int
            203 -> optionalInt64Wrapper = _fieldValue as Long
            204 -> optionalUint32Wrapper = _fieldValue as Int
            205 -> optionalUint64Wrapper = _fieldValue as Long
            206 -> optionalFloatWrapper = _fieldValue as Float
            207 -> optionalDoubleWrapper = _fieldValue as Double
            208 -> optionalStringWrapper = _fieldValue as String
            209 -> optionalBytesWrapper = _fieldValue as pbandk.ByteArr
            211 -> repeatedBoolWrapper = (repeatedBoolWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            212 -> repeatedInt32Wrapper = (repeatedInt32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            213 -> repeatedInt64Wrapper = (repeatedInt64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            214 -> repeatedUint32Wrapper = (repeatedUint32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            215 -> repeatedUint64Wrapper = (repeatedUint64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            216 -> repeatedFloatWrapper = (repeatedFloatWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            217 -> repeatedDoubleWrapper = (repeatedDoubleWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            218 -> repeatedStringWrapper = (repeatedStringWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            219 -> repeatedBytesWrapper = (repeatedBytesWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            301 -> optionalDuration = _fieldValue as pbandk.wkt.Duration
            302 -> optionalTimestamp = _fieldValue as pbandk.wkt.Timestamp
            303 -> optionalFieldMask = _fieldValue as pbandk.wkt.FieldMask
            304 -> optionalStruct = _fieldValue as pbandk.wkt.Struct
            305 -> optionalAny = _fieldValue as pbandk.wkt.Any
            306 -> optionalValue = _fieldValue as pbandk.wkt.Value
            311 -> repeatedDuration = (repeatedDuration ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
            312 -> repeatedTimestamp = (repeatedTimestamp ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Timestamp> }
            313 -> repeatedFieldmask = (repeatedFieldmask ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldMask> }
            315 -> repeatedAny = (repeatedAny ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Any> }
            316 -> repeatedValue = (repeatedValue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
            324 -> repeatedStruct = (repeatedStruct ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Struct> }
            401 -> fieldname1 = _fieldValue as Int
            402 -> fieldName2 = _fieldValue as Int
            403 -> fieldName3 = _fieldValue as Int
            404 -> field_name4 = _fieldValue as Int
            405 -> field0name5 = _fieldValue as Int
            406 -> field0Name6 = _fieldValue as Int
            407 -> fieldName7 = _fieldValue as Int
            408 -> fieldName8 = _fieldValue as Int
            409 -> fieldName9 = _fieldValue as Int
            410 -> fieldName10 = _fieldValue as Int
            411 -> fIELDNAME11 = _fieldValue as Int
            412 -> fIELDName12 = _fieldValue as Int
            413 -> _fieldName13 = _fieldValue as Int
            414 -> _FieldName14 = _fieldValue as Int
            415 -> field_name15 = _fieldValue as Int
            416 -> field_Name16 = _fieldValue as Int
            417 -> fieldName17_ = _fieldValue as Int
            418 -> fieldName18_ = _fieldValue as Int
        }
    }
    return TestAllTypesProto3(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
        optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
        optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
        optionalBool, optionalString, optionalBytes, optionalNestedMessage,
        optionalForeignMessage, optionalNestedEnum, optionalForeignEnum, optionalStringPiece,
        optionalCord, recursiveMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(repeatedInt64),
        pbandk.ListWithSize.Builder.fixed(repeatedUint32), pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32), pbandk.ListWithSize.Builder.fixed(repeatedSint64),
        pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32), pbandk.ListWithSize.Builder.fixed(repeatedSfixed64),
        pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool), pbandk.ListWithSize.Builder.fixed(repeatedString),
        pbandk.ListWithSize.Builder.fixed(repeatedBytes), pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage), pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum),
        pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord), pbandk.MessageMap.Builder.fixed(mapInt32Int32),
        pbandk.MessageMap.Builder.fixed(mapInt64Int64), pbandk.MessageMap.Builder.fixed(mapUint32Uint32), pbandk.MessageMap.Builder.fixed(mapUint64Uint64), pbandk.MessageMap.Builder.fixed(mapSint32Sint32),
        pbandk.MessageMap.Builder.fixed(mapSint64Sint64), pbandk.MessageMap.Builder.fixed(mapFixed32Fixed32), pbandk.MessageMap.Builder.fixed(mapFixed64Fixed64), pbandk.MessageMap.Builder.fixed(mapSfixed32Sfixed32),
        pbandk.MessageMap.Builder.fixed(mapSfixed64Sfixed64), pbandk.MessageMap.Builder.fixed(mapInt32Float), pbandk.MessageMap.Builder.fixed(mapInt32Double), pbandk.MessageMap.Builder.fixed(mapBoolBool),
        pbandk.MessageMap.Builder.fixed(mapStringString), pbandk.MessageMap.Builder.fixed(mapStringBytes), pbandk.MessageMap.Builder.fixed(mapStringNestedMessage), pbandk.MessageMap.Builder.fixed(mapStringForeignMessage),
        pbandk.MessageMap.Builder.fixed(mapStringNestedEnum), pbandk.MessageMap.Builder.fixed(mapStringForeignEnum), optionalBoolWrapper, optionalInt32Wrapper,
        optionalInt64Wrapper, optionalUint32Wrapper, optionalUint64Wrapper, optionalFloatWrapper,
        optionalDoubleWrapper, optionalStringWrapper, optionalBytesWrapper, pbandk.ListWithSize.Builder.fixed(repeatedBoolWrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedInt32Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedUint32Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedUint64Wrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedFloatWrapper), pbandk.ListWithSize.Builder.fixed(repeatedDoubleWrapper), pbandk.ListWithSize.Builder.fixed(repeatedStringWrapper), pbandk.ListWithSize.Builder.fixed(repeatedBytesWrapper),
        optionalDuration, optionalTimestamp, optionalFieldMask, optionalStruct,
        optionalAny, optionalValue, pbandk.ListWithSize.Builder.fixed(repeatedDuration), pbandk.ListWithSize.Builder.fixed(repeatedTimestamp),
        pbandk.ListWithSize.Builder.fixed(repeatedFieldmask), pbandk.ListWithSize.Builder.fixed(repeatedStruct), pbandk.ListWithSize.Builder.fixed(repeatedAny), pbandk.ListWithSize.Builder.fixed(repeatedValue),
        fieldname1, fieldName2, fieldName3, field_name4,
        field0name5, field0Name6, fieldName7, fieldName8,
        fieldName9, fieldName10, fIELDNAME11, fIELDName12,
        _fieldName13, _FieldName14, field_name15, field_Name16,
        fieldName17_, fieldName18_, oneofField, unknownFields)
}

fun TestAllTypesProto3.NestedMessage?.orDefault() = this ?: TestAllTypesProto3.NestedMessage.defaultInstance

private fun TestAllTypesProto3.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.NestedMessage = (plus as? TestAllTypesProto3.NestedMessage)?.copy(
    corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.NestedMessage.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.NestedMessage {
    var a = 0
    var corecursive: pbandk.testpb.TestAllTypesProto3? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            2 -> corecursive = _fieldValue as pbandk.testpb.TestAllTypesProto3
        }
    }
    return TestAllTypesProto3.NestedMessage(a, corecursive, unknownFields)
}

fun TestAllTypesProto3.MapInt32Int32Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt32Int32Entry.defaultInstance

private fun TestAllTypesProto3.MapInt32Int32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32Int32Entry = (plus as? TestAllTypesProto3.MapInt32Int32Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32Int32Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapInt32Int32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapInt32Int32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt64Int64Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt64Int64Entry.defaultInstance

private fun TestAllTypesProto3.MapInt64Int64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt64Int64Entry = (plus as? TestAllTypesProto3.MapInt64Int64Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt64Int64Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapInt64Int64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapInt64Int64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapUint32Uint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint32Uint32Entry.defaultInstance

private fun TestAllTypesProto3.MapUint32Uint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapUint32Uint32Entry = (plus as? TestAllTypesProto3.MapUint32Uint32Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint32Uint32Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapUint32Uint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapUint32Uint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapUint64Uint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint64Uint64Entry.defaultInstance

private fun TestAllTypesProto3.MapUint64Uint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapUint64Uint64Entry = (plus as? TestAllTypesProto3.MapUint64Uint64Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint64Uint64Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapUint64Uint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapUint64Uint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSint32Sint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint32Sint32Entry.defaultInstance

private fun TestAllTypesProto3.MapSint32Sint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSint32Sint32Entry = (plus as? TestAllTypesProto3.MapSint32Sint32Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint32Sint32Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapSint32Sint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapSint32Sint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSint64Sint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint64Sint64Entry.defaultInstance

private fun TestAllTypesProto3.MapSint64Sint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSint64Sint64Entry = (plus as? TestAllTypesProto3.MapSint64Sint64Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint64Sint64Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapSint64Sint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapSint64Sint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapFixed32Fixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed32Fixed32Entry.defaultInstance

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapFixed32Fixed32Entry = (plus as? TestAllTypesProto3.MapFixed32Fixed32Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed32Fixed32Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapFixed32Fixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapFixed32Fixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapFixed64Fixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed64Fixed64Entry.defaultInstance

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapFixed64Fixed64Entry = (plus as? TestAllTypesProto3.MapFixed64Fixed64Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed64Fixed64Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapFixed64Fixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapFixed64Fixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSfixed32Sfixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed32Sfixed32Entry.defaultInstance

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSfixed32Sfixed32Entry = (plus as? TestAllTypesProto3.MapSfixed32Sfixed32Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapSfixed32Sfixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSfixed64Sfixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed64Sfixed64Entry.defaultInstance

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSfixed64Sfixed64Entry = (plus as? TestAllTypesProto3.MapSfixed64Sfixed64Entry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapSfixed64Sfixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt32FloatEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32FloatEntry.defaultInstance

private fun TestAllTypesProto3.MapInt32FloatEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32FloatEntry = (plus as? TestAllTypesProto3.MapInt32FloatEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32FloatEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapInt32FloatEntry {
    var key = 0
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Float
        }
    }
    return TestAllTypesProto3.MapInt32FloatEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt32DoubleEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32DoubleEntry.defaultInstance

private fun TestAllTypesProto3.MapInt32DoubleEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32DoubleEntry = (plus as? TestAllTypesProto3.MapInt32DoubleEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32DoubleEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapInt32DoubleEntry {
    var key = 0
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Double
        }
    }
    return TestAllTypesProto3.MapInt32DoubleEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapBoolBoolEntry?.orDefault() = this ?: TestAllTypesProto3.MapBoolBoolEntry.defaultInstance

private fun TestAllTypesProto3.MapBoolBoolEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapBoolBoolEntry = (plus as? TestAllTypesProto3.MapBoolBoolEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapBoolBoolEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapBoolBoolEntry {
    var key = false
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Boolean
            2 -> value = _fieldValue as Boolean
        }
    }
    return TestAllTypesProto3.MapBoolBoolEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringStringEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringStringEntry.defaultInstance

private fun TestAllTypesProto3.MapStringStringEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringStringEntry = (plus as? TestAllTypesProto3.MapStringStringEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringStringEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringStringEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return TestAllTypesProto3.MapStringStringEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringBytesEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringBytesEntry.defaultInstance

private fun TestAllTypesProto3.MapStringBytesEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringBytesEntry = (plus as? TestAllTypesProto3.MapStringBytesEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringBytesEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringBytesEntry {
    var key = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return TestAllTypesProto3.MapStringBytesEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringNestedMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedMessageEntry.defaultInstance

private fun TestAllTypesProto3.MapStringNestedMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringNestedMessageEntry = (plus as? TestAllTypesProto3.MapStringNestedMessageEntry)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedMessageEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringNestedMessageEntry {
    var key = ""
    var value: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage
        }
    }
    return TestAllTypesProto3.MapStringNestedMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringForeignMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignMessageEntry.defaultInstance

private fun TestAllTypesProto3.MapStringForeignMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringForeignMessageEntry = (plus as? TestAllTypesProto3.MapStringForeignMessageEntry)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignMessageEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringForeignMessageEntry {
    var key = ""
    var value: pbandk.testpb.ForeignMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.ForeignMessage
        }
    }
    return TestAllTypesProto3.MapStringForeignMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringNestedEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedEnumEntry.defaultInstance

private fun TestAllTypesProto3.MapStringNestedEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringNestedEnumEntry = (plus as? TestAllTypesProto3.MapStringNestedEnumEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedEnumEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringNestedEnumEntry {
    var key = ""
    var value: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum
        }
    }
    return TestAllTypesProto3.MapStringNestedEnumEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringForeignEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignEnumEntry.defaultInstance

private fun TestAllTypesProto3.MapStringForeignEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringForeignEnumEntry = (plus as? TestAllTypesProto3.MapStringForeignEnumEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignEnumEntry.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): TestAllTypesProto3.MapStringForeignEnumEntry {
    var key = ""
    var value: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.ForeignEnum
        }
    }
    return TestAllTypesProto3.MapStringForeignEnumEntry(key, value, unknownFields)
}

fun ForeignMessage?.orDefault() = this ?: ForeignMessage.defaultInstance

private fun ForeignMessage.protoMergeImpl(plus: pbandk.Message?): ForeignMessage = (plus as? ForeignMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ForeignMessage.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): ForeignMessage {
    var c = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
        }
    }
    return ForeignMessage(c, unknownFields)
}
