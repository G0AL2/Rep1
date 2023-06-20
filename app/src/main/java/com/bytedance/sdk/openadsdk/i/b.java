package com.bytedance.sdk.openadsdk.i;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.openadsdk.core.g;

/* compiled from: StatsImageListener.java */
/* loaded from: classes.dex */
public class b implements n<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13339a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.h.a.b f13340b;

    public b(boolean z10) {
        this.f13339a = z10;
        if (z10) {
            this.f13340b = com.bytedance.sdk.openadsdk.h.a.b.b();
        }
    }

    public void a(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.c(str);
    }

    public void b(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.e(str);
    }

    public void c(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.d(str);
    }

    public void d(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.g(str);
    }

    public void a(int i10) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.a(i10);
    }

    @Override // com.bytedance.sdk.component.d.n
    public void a(j<Bitmap> jVar) {
        if (!this.f13339a || this.f13340b == null) {
            return;
        }
        if (jVar == null || jVar.b() == null) {
            this.f13340b.b(202).f(g.a(202));
            com.bytedance.sdk.openadsdk.h.b.a().e(this.f13340b);
        }
    }

    @Override // com.bytedance.sdk.component.d.n
    public void a(int i10, String str, Throwable th) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (!this.f13339a || (bVar = this.f13340b) == null) {
            return;
        }
        bVar.b(201).f(g.a(201));
        com.bytedance.sdk.openadsdk.h.b.a().e(this.f13340b);
    }
}
