package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
final class b {

    /* renamed from: c  reason: collision with root package name */
    static b f3350c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f3351a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f3352b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<i.b, List<C0061b>> f3353a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0061b, i.b> f3354b;

        a(Map<C0061b, i.b> map) {
            this.f3354b = map;
            for (Map.Entry<C0061b, i.b> entry : map.entrySet()) {
                i.b value = entry.getValue();
                List<C0061b> list = this.f3353a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3353a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<C0061b> list, p pVar, i.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(pVar, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(p pVar, i.b bVar, Object obj) {
            b(this.f3353a.get(bVar), pVar, bVar, obj);
            b(this.f3353a.get(i.b.ON_ANY), pVar, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0061b {

        /* renamed from: a  reason: collision with root package name */
        final int f3355a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3356b;

        C0061b(int i10, Method method) {
            this.f3355a = i10;
            this.f3356b = method;
            method.setAccessible(true);
        }

        void a(p pVar, i.b bVar, Object obj) {
            try {
                int i10 = this.f3355a;
                if (i10 == 0) {
                    this.f3356b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3356b.invoke(obj, pVar);
                } else if (i10 != 2) {
                } else {
                    this.f3356b.invoke(obj, pVar, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0061b) {
                C0061b c0061b = (C0061b) obj;
                return this.f3355a == c0061b.f3355a && this.f3356b.getName().equals(c0061b.f3356b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f3355a * 31) + this.f3356b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f3354b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0061b, i.b> entry : c(cls2).f3354b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(p.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                i.b value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(i.b.class)) {
                        if (value != i.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0061b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3351a.put(cls, aVar);
        this.f3352b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<C0061b, i.b> map, C0061b c0061b, i.b bVar, Class<?> cls) {
        i.b bVar2 = map.get(c0061b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0061b, bVar);
                return;
            }
            return;
        }
        Method method = c0061b.f3356b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f3351a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f3352b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((y) method.getAnnotation(y.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f3352b.put(cls, Boolean.FALSE);
        return false;
    }
}
