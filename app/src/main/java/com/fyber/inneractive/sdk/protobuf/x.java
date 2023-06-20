package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public class x implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x f20072a = new x();

    @Override // com.fyber.inneractive.sdk.protobuf.p0
    public boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.p0
    public o0 b(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (o0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }
}
