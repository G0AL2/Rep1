package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class UInt32Value extends GeneratedMessageLite<UInt32Value, a> implements r0 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile y0<UInt32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.a<UInt32Value, a> implements r0 {
        public a() {
            super(UInt32Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        GeneratedMessageLite.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i10) {
        a newBuilder = newBuilder();
        newBuilder.c();
        ((UInt32Value) newBuilder.f19803b).setValue(i10);
        return newBuilder.a();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0<UInt32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i10) {
        this.value_ = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 3:
                return new UInt32Value();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                y0<UInt32Value> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (UInt32Value.class) {
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

    public int getValue() {
        return this.value_;
    }

    public static a newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, q qVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, q qVar) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static UInt32Value parseFrom(i iVar) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static UInt32Value parseFrom(i iVar, q qVar) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, q qVar) throws a0 {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, q qVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt32Value parseFrom(j jVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static UInt32Value parseFrom(j jVar, q qVar) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
