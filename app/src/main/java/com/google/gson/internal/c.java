package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, com.google.gson.d<?>> f23846a;

    /* renamed from: b  reason: collision with root package name */
    private final gd.b f23847b = gd.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class a<T> implements com.google.gson.internal.h<T> {
        a(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class b<T> implements com.google.gson.internal.h<T> {
        b(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0313c<T> implements com.google.gson.internal.h<T> {
        C0313c(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class d<T> implements com.google.gson.internal.h<T> {
        d(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new com.google.gson.internal.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class e<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.internal.l f23848a = com.google.gson.internal.l.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f23849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f23850c;

        e(c cVar, Class cls, Type type) {
            this.f23849b = cls;
            this.f23850c = type;
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            try {
                return (T) this.f23848a.c(this.f23849b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f23850c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    class f<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.d f23851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f23852b;

        f(c cVar, com.google.gson.d dVar, Type type) {
            this.f23851a = dVar;
            this.f23852b = type;
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) this.f23851a.a(this.f23852b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    class g<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.d f23853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f23854b;

        g(c cVar, com.google.gson.d dVar, Type type) {
            this.f23853a = dVar;
            this.f23854b = type;
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) this.f23853a.a(this.f23854b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class h<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f23855a;

        h(c cVar, Constructor constructor) {
            this.f23855a = constructor;
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            try {
                return (T) this.f23855a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f23855a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f23855a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class i<T> implements com.google.gson.internal.h<T> {
        i(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class j<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f23856a;

        j(c cVar, Type type) {
            this.f23856a = type;
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            Type type = this.f23856a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.i("Invalid EnumSet type: " + this.f23856a.toString());
            }
            throw new com.google.gson.i("Invalid EnumSet type: " + this.f23856a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class k<T> implements com.google.gson.internal.h<T> {
        k(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class l<T> implements com.google.gson.internal.h<T> {
        l(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class m<T> implements com.google.gson.internal.h<T> {
        m(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class n<T> implements com.google.gson.internal.h<T> {
        n(c cVar) {
        }

        @Override // com.google.gson.internal.h
        public T construct() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.d<?>> map) {
        this.f23846a = map;
    }

    private <T> com.google.gson.internal.h<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f23847b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.google.gson.internal.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l(this);
            }
            return new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.google.gson.reflect.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new C0313c(this);
            }
            return new d(this);
        } else {
            return null;
        }
    }

    private <T> com.google.gson.internal.h<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> com.google.gson.internal.h<T> a(com.google.gson.reflect.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        com.google.gson.d<?> dVar = this.f23846a.get(e10);
        if (dVar != null) {
            return new f(this, dVar, e10);
        }
        com.google.gson.d<?> dVar2 = this.f23846a.get(c10);
        if (dVar2 != null) {
            return new g(this, dVar2, e10);
        }
        com.google.gson.internal.h<T> b10 = b(c10);
        if (b10 != null) {
            return b10;
        }
        com.google.gson.internal.h<T> c11 = c(e10, c10);
        return c11 != null ? c11 : d(e10, c10);
    }

    public String toString() {
        return this.f23846a.toString();
    }
}
