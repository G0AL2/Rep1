package com.bytedance.sdk.openadsdk.multipro.d;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.g;
import com.bytedance.sdk.openadsdk.multipro.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SPMultiHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f13528a;

    public static boolean a() {
        if (f13528a == null || m.a() == null) {
            l.b("The context of SPHelper is null, please initialize sdk in main process");
            return false;
        }
        return true;
    }

    private static IListenerManager b() {
        try {
            if (a()) {
                if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    return g.a();
                }
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String c() {
        return e.f13532b + "/t_sp/";
    }

    public static void a(Context context) {
        f13528a = context == null ? m.a() : context.getApplicationContext();
    }

    public static synchronized void a(String str, String str2, Boolean bool) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "boolean/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    public static String b(String str, String str2, String str3) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "string/" + str2 + b(str)));
                    if (type != null) {
                        if (!type.equals("null")) {
                            return type;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return str3;
        }
        return str3;
    }

    public static synchronized void a(String str, String str2) {
        synchronized (a.class) {
            a((String) null, str, str2);
        }
    }

    @TargetApi(11)
    public static Set<String> b(String str, String str2, Set<String> set) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "string_set/" + str2 + b(str)));
                    if (type == null || type.equals("null") || !type.matches("\\[.*\\]")) {
                        return set;
                    }
                    String[] split = type.substring(1, type.length() - 1).split(", ");
                    HashSet hashSet = new HashSet();
                    for (String str3 : split) {
                        hashSet.add(str3.replace("__COMMA__", ", "));
                    }
                    return hashSet;
                }
            } catch (Throwable unused) {
            }
            return set;
        }
        return set;
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "string/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Integer num) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "int/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void b(String str, String str2) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    b10.delete(Uri.parse(c() + "long/" + str2 + b(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void a(String str, String str2, Long l10) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "long/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l10);
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Float f10) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "float/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f10);
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Set<String> set) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b10 = b();
                    if (b10 != null) {
                        Uri parse = Uri.parse(c() + "string_set/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        HashSet hashSet = new HashSet();
                        for (String str3 : set) {
                            hashSet.add(str3.replace(",", "__COMMA__"));
                        }
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, hashSet.toString());
                        b10.update(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int a(String str, String str2, int i10) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "int/" + str2 + b(str)));
                    if (type != null && !type.equals("null")) {
                        return Integer.parseInt(type);
                    }
                }
            } catch (Throwable unused) {
            }
            return i10;
        }
        return i10;
    }

    public static float a(String str, String str2, float f10) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "float/" + str2 + b(str)));
                    if (type != null && !type.equals("null")) {
                        return Float.parseFloat(type);
                    }
                }
            } catch (Throwable unused) {
            }
            return f10;
        }
        return f10;
    }

    public static boolean a(String str, String str2, boolean z10) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "boolean/" + str2 + b(str)));
                    if (type != null && !type.equals("null")) {
                        return Boolean.parseBoolean(type);
                    }
                }
            } catch (Throwable unused) {
            }
            return z10;
        }
        return z10;
    }

    public static long a(String str, String str2, long j10) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    String type = b10.getType(Uri.parse(c() + "long/" + str2 + b(str)));
                    if (type != null && !type.equals("null")) {
                        return Long.parseLong(type);
                    }
                }
            } catch (Throwable unused) {
            }
            return j10;
        }
        return j10;
    }

    public static void a(String str) {
        if (a()) {
            try {
                IListenerManager b10 = b();
                if (b10 != null) {
                    b10.delete(Uri.parse(c() + "clean" + b(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
