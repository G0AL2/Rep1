package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f19840c = new b1();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, f1<?>> f19842b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final g1 f19841a = new i0();

    public <T> f1<T> a(Class<T> cls) {
        f1 a10;
        f1 f1Var;
        f1 u0Var;
        Charset charset = z.f20078a;
        Objects.requireNonNull(cls, "messageType");
        f1<T> f1Var2 = (f1<T>) this.f19842b.get(cls);
        if (f1Var2 == null) {
            i0 i0Var = (i0) this.f19841a;
            i0Var.getClass();
            Class<?> cls2 = h1.f19877a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o0 b10 = i0Var.f19891a.b(cls);
            if (b10.c()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    u0Var = new u0(h1.f19880d, t.f19989a, b10.b());
                } else {
                    m1<?, ?> m1Var = h1.f19878b;
                    r<?> rVar = t.f19990b;
                    if (rVar != null) {
                        u0Var = new u0(m1Var, rVar, b10.b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                f1Var = u0Var;
            } else {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    if (b10.a() == a1.PROTO2) {
                        a10 = t0.a(b10, x0.f20074b, g0.f19872b, h1.f19880d, t.f19989a, n0.f19961b);
                    } else {
                        a10 = t0.a(b10, x0.f20074b, g0.f19872b, h1.f19880d, (r) null, n0.f19961b);
                    }
                } else {
                    if (b10.a() == a1.PROTO2) {
                        v0 v0Var = x0.f20073a;
                        g0 g0Var = g0.f19871a;
                        m1<?, ?> m1Var2 = h1.f19878b;
                        r<?> rVar2 = t.f19990b;
                        if (rVar2 != null) {
                            a10 = t0.a(b10, v0Var, g0Var, m1Var2, rVar2, n0.f19960a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        a10 = t0.a(b10, x0.f20073a, g0.f19871a, h1.f19879c, (r) null, n0.f19960a);
                    }
                }
                f1Var = a10;
            }
            f1<T> f1Var3 = (f1<T>) this.f19842b.putIfAbsent(cls, f1Var);
            return f1Var3 != null ? f1Var3 : f1Var;
        }
        return f1Var2;
    }
}
