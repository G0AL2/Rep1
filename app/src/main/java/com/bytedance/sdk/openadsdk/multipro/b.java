package com.bytedance.sdk.openadsdk.multipro;

/* compiled from: MultiGlobalInfo.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13511a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f13512b;

    public static void a() {
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_info", "is_support_multi_process", Boolean.TRUE);
        f13511a = true;
        f13512b = true;
    }

    public static void b() {
        f13511a = false;
        f13512b = true;
    }

    public static boolean c() {
        if (!f13512b) {
            f13511a = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_info", "is_support_multi_process", false);
            f13512b = true;
        }
        return f13511a;
    }
}
