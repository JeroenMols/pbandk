@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class DoubleValue(
    val value: Double = 0.0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<DoubleValue> {
        val defaultInstance by lazy { DoubleValue() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = DoubleValue.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                    jsonName = "value",
                    value = DoubleValue::value
                )
            )
        }
    }
}

data class FloatValue(
    val value: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FloatValue> {
        val defaultInstance by lazy { FloatValue() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = FloatValue.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                    jsonName = "value",
                    value = FloatValue::value
                )
            )
        }
    }
}

data class Int64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int64Value> {
        val defaultInstance by lazy { Int64Value() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Int64Value.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                    jsonName = "value",
                    value = Int64Value::value
                )
            )
        }
    }
}

data class UInt64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<UInt64Value> {
        val defaultInstance by lazy { UInt64Value() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = UInt64Value.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                    jsonName = "value",
                    value = UInt64Value::value
                )
            )
        }
    }
}

data class Int32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int32Value> {
        val defaultInstance by lazy { Int32Value() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Int32Value.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "value",
                    value = Int32Value::value
                )
            )
        }
    }
}

data class UInt32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<UInt32Value> {
        val defaultInstance by lazy { UInt32Value() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = UInt32Value.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                    jsonName = "value",
                    value = UInt32Value::value
                )
            )
        }
    }
}

data class BoolValue(
    val value: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BoolValue> {
        val defaultInstance by lazy { BoolValue() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = BoolValue.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                    jsonName = "value",
                    value = BoolValue::value
                )
            )
        }
    }
}

data class StringValue(
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<StringValue> {
        val defaultInstance by lazy { StringValue() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = StringValue.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "value",
                    value = StringValue::value
                )
            )
        }
    }
}

data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BytesValue> {
        val defaultInstance by lazy { BytesValue() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = BytesValue.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                    jsonName = "value",
                    value = BytesValue::value
                )
            )
        }
    }
}

fun DoubleValue?.orDefault() = this ?: DoubleValue.defaultInstance

private fun DoubleValue.protoMergeImpl(plus: pbandk.Message?): DoubleValue = (plus as? DoubleValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun DoubleValue.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): DoubleValue {
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Double
        }
    }
    return DoubleValue(value, unknownFields)
}

fun FloatValue?.orDefault() = this ?: FloatValue.defaultInstance

private fun FloatValue.protoMergeImpl(plus: pbandk.Message?): FloatValue = (plus as? FloatValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FloatValue.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): FloatValue {
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Float
        }
    }
    return FloatValue(value, unknownFields)
}

fun Int64Value?.orDefault() = this ?: Int64Value.defaultInstance

private fun Int64Value.protoMergeImpl(plus: pbandk.Message?): Int64Value = (plus as? Int64Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Int64Value.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Int64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return Int64Value(value, unknownFields)
}

fun UInt64Value?.orDefault() = this ?: UInt64Value.defaultInstance

private fun UInt64Value.protoMergeImpl(plus: pbandk.Message?): UInt64Value = (plus as? UInt64Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt64Value.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): UInt64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return UInt64Value(value, unknownFields)
}

fun Int32Value?.orDefault() = this ?: Int32Value.defaultInstance

private fun Int32Value.protoMergeImpl(plus: pbandk.Message?): Int32Value = (plus as? Int32Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Int32Value.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Int32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return Int32Value(value, unknownFields)
}

fun UInt32Value?.orDefault() = this ?: UInt32Value.defaultInstance

private fun UInt32Value.protoMergeImpl(plus: pbandk.Message?): UInt32Value = (plus as? UInt32Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt32Value.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): UInt32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return UInt32Value(value, unknownFields)
}

fun BoolValue?.orDefault() = this ?: BoolValue.defaultInstance

private fun BoolValue.protoMergeImpl(plus: pbandk.Message?): BoolValue = (plus as? BoolValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun BoolValue.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): BoolValue {
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Boolean
        }
    }
    return BoolValue(value, unknownFields)
}

fun StringValue?.orDefault() = this ?: StringValue.defaultInstance

private fun StringValue.protoMergeImpl(plus: pbandk.Message?): StringValue = (plus as? StringValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun StringValue.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): StringValue {
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
        }
    }
    return StringValue(value, unknownFields)
}

fun BytesValue?.orDefault() = this ?: BytesValue.defaultInstance

private fun BytesValue.protoMergeImpl(plus: pbandk.Message?): BytesValue = (plus as? BytesValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun BytesValue.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return BytesValue(value, unknownFields)
}
