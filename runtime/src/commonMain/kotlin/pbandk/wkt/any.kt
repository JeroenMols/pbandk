@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class Any(
    val typeUrl: String = "",
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Any> {
        val defaultInstance by lazy { Any() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Any.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "type_url",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "typeUrl",
                    value = Any::typeUrl
                ),
                pbandk.FieldDescriptor(
                    name = "value",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                    jsonName = "value",
                    value = Any::value
                )
            )
        }
    }
}

fun Any?.orDefault() = this ?: Any.defaultInstance

private fun Any.protoMergeImpl(plus: pbandk.Message?): Any = (plus as? Any)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return Any(typeUrl, value, unknownFields)
}
