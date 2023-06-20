package com.bytedance.sdk.openadsdk.component.g;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: TTAppOpenVideoController.java */
/* loaded from: classes.dex */
public class a extends com.bytedance.sdk.openadsdk.core.video.c.a {

    /* renamed from: z  reason: collision with root package name */
    private boolean f11405z;

    public a(Context context, ViewGroup viewGroup, n nVar) {
        super(context, viewGroup, nVar);
        this.f11405z = false;
        M();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void a(int i10, int i11) {
        if (this.f12794h == null) {
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
        return 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void u() {
        if (this.f11405z) {
            return;
        }
        this.f11405z = true;
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        aVar.f(i());
        com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f12790d, aVar, null);
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
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12794h.get(), this.f12790d, aVar, (j) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    protected void y() {
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12791e, this.f12790d, this.f12836x);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.a
    public void z() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        aVar.f(i());
        com.bytedance.sdk.openadsdk.b.b.a.a.e(this.f12790d, aVar);
    }

    public void a(o.a aVar) {
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar, (j) null);
    }
}
