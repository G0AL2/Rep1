package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommonPermissionUtils.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f13556a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static IListenerManager f13557b;

    /* compiled from: CommonPermissionUtils.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(String str);
    }

    static /* synthetic */ IListenerManager a() {
        return b();
    }

    private static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f13556a.remove(str);
    }

    public static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            new Thread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.d.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "handleYes-1，key=" + str);
                        d.a().broadcastPermissionListener(str, null);
                    } catch (Throwable unused) {
                    }
                }
            }).start();
            return;
        }
        a b10 = b(str);
        if (b10 == null) {
            return;
        }
        b10.a();
    }

    private static IListenerManager b() {
        if (f13557b == null) {
            f13557b = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(com.bytedance.sdk.openadsdk.core.m.a()).a(4));
        }
        return f13557b;
    }

    public static void a(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            new Thread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.d.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "handleNo-1，key=" + str + "，permission=" + str2);
                        d.a().broadcastPermissionListener(str, str2);
                    } catch (Throwable unused) {
                    }
                }
            }).start();
            return;
        }
        a b10 = b(str);
        if (b10 == null) {
            return;
        }
        b10.a(str2);
    }
}
