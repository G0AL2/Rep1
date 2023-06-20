package com.facebook.hermes.intl;

import java.util.Arrays;

/* compiled from: OptionHelpers.java */
/* loaded from: classes.dex */
public class m {

    /* compiled from: OptionHelpers.java */
    /* loaded from: classes.dex */
    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(Object obj, Object obj2, Object obj3, Object obj4) throws i5.d {
        if (i5.c.n(obj)) {
            return obj4;
        }
        if (i5.c.k(obj)) {
            double f10 = i5.c.f(obj);
            if (Double.isNaN(f10) || f10 > i5.c.f(obj3) || f10 < i5.c.f(obj2)) {
                throw new i5.d("Invalid number value !");
            }
            return obj;
        }
        throw new i5.d("Invalid number value !");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) throws i5.d {
        return a(i5.c.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws i5.d {
        Object a10 = i5.c.a(obj, str);
        if (i5.c.n(a10)) {
            return obj3;
        }
        if (i5.c.j(a10)) {
            a10 = "";
        }
        if (aVar == a.BOOLEAN && !i5.c.i(a10)) {
            throw new i5.d("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !i5.c.m(a10)) {
            throw new i5.d("String option expected but not found");
        }
        if (i5.c.n(obj2) || Arrays.asList((Object[]) obj2).contains(a10)) {
            return a10;
        }
        throw new i5.d("String option expected but not found");
    }

    public static <T extends Enum<T>> T d(Class<T> cls, Object obj) {
        T[] enumConstants;
        if (i5.c.n(obj)) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (i5.c.j(obj)) {
            return null;
        }
        String h10 = i5.c.h(obj);
        if (h10.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t10 : cls.getEnumConstants()) {
            if (t10.name().compareToIgnoreCase(h10) == 0) {
                return t10;
            }
        }
        return null;
    }
}
