package com.bytedance.sdk.openadsdk.component.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.openadsdk.core.m;
import i3.b;
import java.io.File;

/* compiled from: TTAppOpenUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f11404a;

    public static File a(String str, int i10) {
        return a(m.a(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).a(String.valueOf(i10)), str);
    }

    public static File b(String str, int i10) {
        return a(m.a(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).h(i10), str);
    }

    public static String a() {
        if (TextUtils.isEmpty(f11404a)) {
            f11404a = b.a().getCacheDir() + File.separator + "proxy_cache";
        }
        return f11404a;
    }

    public static String a(Context context, int i10) {
        return f.a(context, com.bytedance.sdk.openadsdk.multipro.b.c(), com.bytedance.sdk.openadsdk.component.a.a(m.a()).a(String.valueOf(i10))).getAbsolutePath();
    }

    public static File a(Context context, String str, String str2) {
        return f.a(context, com.bytedance.sdk.openadsdk.multipro.b.c(), str, str2);
    }

    public static void a(File file) {
        if (file == null) {
            return;
        }
        try {
            f.b(file);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        try {
            com.bytedance.sdk.openadsdk.component.a.a(context).a();
        } catch (Throwable unused) {
        }
    }
}
