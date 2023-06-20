package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: FullScreenVideoController.java */
/* loaded from: classes.dex */
public class c extends com.bytedance.sdk.openadsdk.core.video.c.a {

    /* renamed from: z  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.b.j f11567z;

    public c(Context context, ViewGroup viewGroup, n nVar, com.bytedance.sdk.openadsdk.b.j jVar) {
        super(context, viewGroup, nVar);
        this.f11567z = jVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void a(int i10, int i11) {
        if (this.f12791e == null) {
            return;
        }
        o.a aVar = new o.a();
        aVar.b(h());
        aVar.c(j());
        aVar.a(g());
        aVar.a(i10);
        aVar.b(i11);
        com.bytedance.sdk.openadsdk.b.b.a.a.c(o(), aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected int t() {
        return 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void u() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        aVar.f(i());
        com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f12790d, aVar, this.f11567z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void v() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void w() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        com.bytedance.sdk.openadsdk.b.b.a.a.b(o(), aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void x() {
        o.a aVar = new o.a();
        aVar.a(true);
        aVar.c(j());
        com.bytedance.sdk.openadsdk.b.b.a.a.a(m.a(), this.f12790d, aVar, this.f11567z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void y() {
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12791e, this.f12790d, this.f12836x);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void z() {
    }
}
