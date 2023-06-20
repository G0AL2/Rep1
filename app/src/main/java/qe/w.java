package qe;

import java.util.List;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes3.dex */
public class w {
    public static List a(Object obj) {
        if ((obj instanceof re.a) && !(obj instanceof re.b)) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i10) {
        if (obj != null && !e(obj, i10)) {
            h(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw g(e10);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof pe.a) {
            return 0;
        }
        if (obj instanceof pe.l) {
            return 1;
        }
        if (obj instanceof pe.p) {
            return 2;
        }
        if (obj instanceof pe.q) {
            return 3;
        }
        if (obj instanceof pe.r) {
            return 4;
        }
        if (obj instanceof pe.s) {
            return 5;
        }
        if (obj instanceof pe.t) {
            return 6;
        }
        if (obj instanceof pe.u) {
            return 7;
        }
        if (obj instanceof pe.v) {
            return 8;
        }
        if (obj instanceof pe.w) {
            return 9;
        }
        if (obj instanceof pe.b) {
            return 10;
        }
        if (obj instanceof pe.c) {
            return 11;
        }
        if (obj instanceof pe.d) {
            return 12;
        }
        if (obj instanceof pe.e) {
            return 13;
        }
        if (obj instanceof pe.f) {
            return 14;
        }
        if (obj instanceof pe.g) {
            return 15;
        }
        if (obj instanceof pe.h) {
            return 16;
        }
        if (obj instanceof pe.i) {
            return 17;
        }
        if (obj instanceof pe.j) {
            return 18;
        }
        if (obj instanceof pe.k) {
            return 19;
        }
        if (obj instanceof pe.m) {
            return 20;
        }
        if (obj instanceof pe.n) {
            return 21;
        }
        return obj instanceof pe.o ? 22 : -1;
    }

    public static boolean e(Object obj, int i10) {
        return (obj instanceof ee.c) && d(obj) == i10;
    }

    private static <T extends Throwable> T f(T t10) {
        return (T) k.k(t10, w.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        i(name + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
