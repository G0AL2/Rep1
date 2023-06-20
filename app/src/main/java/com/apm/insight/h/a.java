package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f6357a;

    /* renamed from: com.apm.insight.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0103a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f6358a;

        /* renamed from: b  reason: collision with root package name */
        public final T f6359b;
    }

    static {
        HashMap hashMap = new HashMap();
        f6357a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return (T) a(cls, str, a(objArr)).invoke(null, b(objArr));
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(Class.forName(str), str2, objArr);
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e10);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a10 = a(cls.getDeclaredMethods(), str, clsArr);
        if (a10 != null) {
            a10.setAccessible(true);
            return a10;
        } else if (cls.getSuperclass() != null) {
            return a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        } else if (clsArr2 == null) {
            return clsArr.length == 0;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i10 = 0; i10 < clsArr.length; i10++) {
                if (!clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                    Map<Class<?>, Class<?>> map = f6357a;
                    if (!map.containsKey(clsArr[i10]) || !map.get(clsArr[i10]).equals(map.get(clsArr2[i10]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof C0103a)) {
                clsArr[i10] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i10] = ((C0103a) obj).f6358a;
            }
        }
        return clsArr;
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null || !(obj instanceof C0103a)) {
                objArr2[i10] = obj;
            } else {
                objArr2[i10] = ((C0103a) obj).f6359b;
            }
        }
        return objArr2;
    }
}
