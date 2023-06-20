package i5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: JSObjects.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static Object f31543a = new C0405c();

    /* renamed from: b  reason: collision with root package name */
    private static Object f31544b = new b();

    /* compiled from: JSObjects.java */
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }
    }

    /* compiled from: JSObjects.java */
    /* renamed from: i5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0405c {
        private C0405c() {
        }
    }

    public static Object a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (hashMap.containsKey(str)) {
            Object obj2 = hashMap.get(str);
            return obj2 == null ? b() : obj2;
        }
        return d();
    }

    public static Object b() {
        return f31544b;
    }

    public static void c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object d() {
        return f31543a;
    }

    public static boolean e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map<String, Object> g(Object obj) {
        return (HashMap) obj;
    }

    public static String h(Object obj) {
        return (String) obj;
    }

    public static boolean i(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean j(Object obj) {
        return obj instanceof b;
    }

    public static boolean k(Object obj) {
        return obj instanceof Double;
    }

    public static boolean l(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean m(Object obj) {
        return obj instanceof String;
    }

    public static boolean n(Object obj) {
        return obj instanceof C0405c;
    }

    public static Object o(boolean z10) {
        return new Boolean(z10);
    }

    public static Object p(double d10) {
        return new Double(d10);
    }

    public static Object q() {
        return new HashMap();
    }

    public static Object r(String str) {
        return str;
    }
}
