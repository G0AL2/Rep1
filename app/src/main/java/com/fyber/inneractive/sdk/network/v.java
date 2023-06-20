package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b  reason: collision with root package name */
    public static final v f17702b = new v();

    /* renamed from: a  reason: collision with root package name */
    public final g f17703a;

    public v() {
        this.f17703a = c() ? new p0() : new i();
    }

    public static v b() {
        return f17702b;
    }

    public g a() {
        return this.f17703a;
    }

    public final boolean c() {
        try {
            if (TextUtils.equals("okhttp", System.getProperty("fyber.marketplace.http_executor_stack_name"))) {
                Class.forName("ye.z");
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
