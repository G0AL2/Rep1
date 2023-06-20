package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, a> implements r0 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile y0<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.a<StringValue, a> implements r0 {
        public a() {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        a newBuilder = newBuilder();
        newBuilder.c();
        ((StringValue) newBuilder.f19803b).setValue(str);
        return newBuilder.a();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(i iVar) {
        iVar.getClass();
        com.fyber.inneractive.sdk.protobuf.a.checkByteStringIsUtf8(iVar);
        this.value_ = iVar.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                y0<StringValue> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (StringValue.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getValue() {
        return this.value_;
    }

    public i getValueBytes() {
        return i.a(this.value_);
    }

    public static a newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static StringValue parseFrom(i iVar) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static StringValue parseFrom(i iVar, q qVar) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static StringValue parseFrom(byte[] bArr) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, q qVar) throws a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(j jVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static StringValue parseFrom(j jVar, q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
