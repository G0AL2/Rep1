package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTPathConst.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f13531a = "com.bytedance.openadsdk";

    /* renamed from: b  reason: collision with root package name */
    public static String f13532b = "content://" + f13531a + ".TTMultiProvider";

    static {
        a();
    }

    public static void a() {
        if (m.a() != null) {
            f13531a = m.a().getPackageName();
            f13532b = "content://" + f13531a + ".TTMultiProvider";
        }
    }
}
