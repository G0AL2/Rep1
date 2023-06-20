package com.bytedance.sdk.openadsdk.multipro.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SPMultiHelperImpl.java */
/* loaded from: classes.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f13529a;

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static void b(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f13529a;
        if (softReference == null || softReference.get() == null || (map = f13529a.get().get(a(str))) == null) {
            return;
        }
        map.clear();
    }

    private static SharedPreferences c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(a(str), 0);
    }

    private static Object a(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f13529a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(a(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static String c(Context context, String str, String str2, String str3) {
        SharedPreferences c10 = c(context, str);
        return c10 == null ? str3 : c10.getString(str2, str3);
    }

    private static Object b(Context context, String str, String str2, String str3) {
        String a10 = a(str);
        if (a(context, a10, str2)) {
            if (str3.equalsIgnoreCase("string")) {
                return c(context, a10, str2, null);
            }
            if (str3.equalsIgnoreCase("boolean")) {
                return Boolean.valueOf(a(context, a10, str2, false));
            }
            if (str3.equalsIgnoreCase("int")) {
                return Integer.valueOf(a(context, a10, str2, 0));
            }
            if (str3.equalsIgnoreCase("long")) {
                return Long.valueOf(a(context, a10, str2, 0L));
            }
            if (str3.equalsIgnoreCase("float")) {
                return Float.valueOf(a(context, a10, str2, 0.0f));
            }
            if (str3.equalsIgnoreCase("string_set")) {
                return c(context, a10, str2, null);
            }
            return null;
        }
        return null;
    }

    private static void a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f13529a;
        if (softReference == null || softReference.get() == null) {
            f13529a = new SoftReference<>(new ConcurrentHashMap());
        }
        String a10 = a(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = f13529a.get();
        if (concurrentHashMap.get(a10) == null) {
            concurrentHashMap.put(a10, new HashMap());
        }
        concurrentHashMap.get(a10).put(str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized <T> void a(Context context, String str, String str2, T t10) {
        synchronized (b.class) {
            SharedPreferences c10 = c(context, str);
            if (c10 == null) {
                return;
            }
            if (t10.equals(a(str, str2))) {
                return;
            }
            SharedPreferences.Editor edit = c10.edit();
            if (t10 instanceof Boolean) {
                edit.putBoolean(str2, ((Boolean) t10).booleanValue());
            }
            if (t10 instanceof String) {
                edit.putString(str2, (String) t10);
            }
            if (t10 instanceof Integer) {
                edit.putInt(str2, ((Integer) t10).intValue());
            }
            if (t10 instanceof Long) {
                edit.putLong(str2, ((Long) t10).longValue());
            }
            if (t10 instanceof Float) {
                edit.putFloat(str2, ((Float) t10).floatValue());
            }
            edit.apply();
            a(str, str2, t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, String str, String str2) {
        try {
            SharedPreferences c10 = c(context, str);
            if (c10 == null) {
                return;
            }
            SharedPreferences.Editor edit = c10.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f13529a;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = f13529a.get().get(a(str));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> b(Context context, String str) {
        return c(context, str).getAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, String str, String str2, String str3) {
        Object a10 = a(str, str2);
        if (a10 != null) {
            return a10 + "";
        }
        Object b10 = b(context, str, str2, str3);
        a(str, str2, b10);
        return b10 + "";
    }

    private static int a(Context context, String str, String str2, int i10) {
        SharedPreferences c10 = c(context, str);
        return c10 == null ? i10 : c10.getInt(str2, i10);
    }

    private static float a(Context context, String str, String str2, float f10) {
        SharedPreferences c10 = c(context, str);
        return c10 == null ? f10 : c10.getFloat(str2, f10);
    }

    private static boolean a(Context context, String str, String str2, boolean z10) {
        SharedPreferences c10 = c(context, str);
        return c10 == null ? z10 : c10.getBoolean(str2, z10);
    }

    private static long a(Context context, String str, String str2, long j10) {
        SharedPreferences c10 = c(context, str);
        return c10 == null ? j10 : c10.getLong(str2, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, String str, String str2) {
        SharedPreferences c10 = c(context, str);
        return c10 != null && c10.contains(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = c(context, str).edit();
        edit.clear();
        edit.apply();
        b(str);
    }
}
