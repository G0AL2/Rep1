package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommonDialogHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f13552a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static IListenerManager f13553b;

    /* compiled from: CommonDialogHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    static /* synthetic */ IListenerManager a() {
        return b();
    }

    public static void b(String str) {
        a(str, 2);
    }

    public static void c(String str) {
        a(str, 3);
    }

    public static a d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f13552a.remove(str);
    }

    public static void a(String str) {
        a(str, 1);
    }

    private static IListenerManager b() {
        if (f13553b == null) {
            f13553b = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(com.bytedance.sdk.openadsdk.core.m.a()).a(2));
        }
        return f13553b;
    }

    private static void a(final String str, final int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            new Thread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        c.a().broadcastDialogListener(str, i10);
                    } catch (Throwable unused) {
                    }
                }
            }).start();
            return;
        }
        a d10 = d(str);
        if (d10 == null) {
            return;
        }
        if (i10 == 1) {
            d10.a();
        } else if (i10 == 2) {
            d10.b();
        } else if (i10 != 3) {
            d10.c();
        } else {
            d10.c();
        }
    }
}
