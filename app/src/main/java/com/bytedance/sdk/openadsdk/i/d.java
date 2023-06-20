package com.bytedance.sdk.openadsdk.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.e.a;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.concurrent.TimeUnit;

/* compiled from: TTNetClient.java */
/* loaded from: classes.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f13343a;

    /* renamed from: b  reason: collision with root package name */
    private Context f13344b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.sdk.component.e.a f13345c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.i.a.c f13346d;

    private d(Context context) {
        this.f13344b = context == null ? m.a() : context.getApplicationContext();
        a.C0158a c0158a = new a.C0158a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.e.a a10 = c0158a.a(10000L, timeUnit).b(10000L, timeUnit).c(10000L, timeUnit).a(true).a();
        this.f13345c = a10;
        com.bytedance.sdk.component.b.a.d a11 = a10.e().a();
        if (a11 != null) {
            a11.a(32);
        }
    }

    public static d a() {
        if (f13343a == null) {
            synchronized (d.class) {
                if (f13343a == null) {
                    f13343a = new d(m.a());
                }
            }
        }
        return f13343a;
    }

    private void d() {
        if (this.f13346d == null) {
            this.f13346d = new com.bytedance.sdk.openadsdk.i.a.c();
        }
    }

    public com.bytedance.sdk.component.e.a b() {
        return this.f13345c;
    }

    public com.bytedance.sdk.openadsdk.i.a.c c() {
        d();
        return this.f13346d;
    }

    public void a(String str, ImageView imageView) {
        com.bytedance.sdk.openadsdk.d.a.a(str).a(imageView);
    }

    public void a(k kVar, ImageView imageView) {
        if (kVar == null || TextUtils.isEmpty(kVar.a()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.d.a.a(kVar).a(imageView);
    }
}
