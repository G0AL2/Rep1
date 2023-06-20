package com.google.gson.reflect;

import com.google.gson.internal.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* loaded from: classes3.dex */
public class a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        Type d10 = d(getClass());
        this.type = d10;
        this.rawType = (Class<? super T>) b.k(d10);
        this.hashCode = d10.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.rawType;
    }

    public final Type e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.type, ((a) obj).type);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return b.u(this.type);
    }

    a(Type type) {
        Type b10 = b.b((Type) com.google.gson.internal.a.b(type));
        this.type = b10;
        this.rawType = (Class<? super T>) b.k(b10);
        this.hashCode = b10.hashCode();
    }
}
