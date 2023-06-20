package com.bytedance.sdk.openadsdk.multipro.a;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.g;
import com.bytedance.sdk.openadsdk.multipro.e;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.List;
import java.util.Map;

/* compiled from: DBMultiAdapter.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static IListenerManager f13448a;

    public static IListenerManager a(Context context) {
        if (context == null) {
            try {
                context = m.a();
            } catch (Throwable unused) {
                u.l("binder error");
            }
        }
        if (f13448a == null) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                f13448a = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(context).a(5));
            } else {
                f13448a = g.a();
            }
        }
        return f13448a;
    }

    private static String a() {
        return e.f13532b + "/t_db/ttopensdk.db/";
    }

    public static synchronized void a(Context context, String str, ContentValues contentValues) {
        synchronized (a.class) {
            if (contentValues != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        IListenerManager a10 = a(context);
                        if (a10 != null) {
                            a10.insert(Uri.parse(a() + str), contentValues);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static synchronized int a(Context context, String str, String str2, String[] strArr) {
        synchronized (a.class) {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                IListenerManager a10 = a(context);
                if (a10 != null) {
                    return a10.delete(Uri.parse(a() + str), str2, strArr);
                }
            } catch (Throwable unused) {
            }
            return 0;
        }
    }

    public static synchronized int a(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        synchronized (a.class) {
            if (contentValues != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        IListenerManager a10 = a(context);
                        if (a10 != null) {
                            return a10.update(Uri.parse(a() + str), contentValues, str2, strArr);
                        }
                    } catch (Throwable unused) {
                    }
                    return 0;
                }
            }
            return 0;
        }
    }

    public static synchronized Map<String, List<String>> a(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        synchronized (a.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                IListenerManager a10 = a(context);
                if (a10 != null) {
                    return a10.query(Uri.parse(a() + str), strArr, str2, strArr2, str5);
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (a.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                IListenerManager a10 = a(context);
                if (a10 != null) {
                    a10.getType(Uri.parse(a() + DtbDeviceDataRetriever.ORIENTATION_UNKNOWN + "/execSQL?sql=" + Uri.encode(str)));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
