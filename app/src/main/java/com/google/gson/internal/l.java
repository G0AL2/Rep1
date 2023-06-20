package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes3.dex */
public abstract class l {

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class a extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f23886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f23887b;

        a(Method method, Object obj) {
            this.f23886a = method;
            this.f23887b = obj;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f23886a.invoke(this.f23887b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class b extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f23888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f23889b;

        b(Method method, int i10) {
            this.f23888a = method;
            this.f23889b = i10;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f23888a.invoke(null, cls, Integer.valueOf(this.f23889b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class c extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f23890a;

        c(Method method) {
            this.f23890a = method;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f23890a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class d extends l {
        d() {
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static l b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
