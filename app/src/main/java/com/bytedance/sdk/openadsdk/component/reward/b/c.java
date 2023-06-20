package com.bytedance.sdk.openadsdk.component.reward.b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.b.a;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.component.reward.view.d;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: RewardFullTypeInteraction.java */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private FullInteractionStyleView f11565i;

    public c(Activity activity, n nVar, int i10, int i11) {
        super(activity, nVar, i10, i11);
    }

    private boolean e() {
        return n.c(this.f11541b);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public boolean b() {
        return e();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public boolean c() {
        return e();
    }

    public FrameLayout d() {
        FullInteractionStyleView fullInteractionStyleView = this.f11565i;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public void a(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.f11540a, this.f11546g);
        this.f11565i = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.f11547h);
        this.f11565i.a(this.f11541b, this.f11545f, this.f11544e, this.f11542c, this.f11543d);
        frameLayout.addView(this.f11565i.getInteractionStyleRootView());
    }

    public static boolean a(n nVar) {
        return (nVar == null || nVar.an() == 100.0f) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public a.InterfaceC0166a a() {
        return new a.InterfaceC0166a() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.c.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.b.a.InterfaceC0166a
            public void a(boolean z10) {
                if (c.this.f11565i != null) {
                    c.this.f11565i.setIsMute(z10);
                }
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public void a(com.bytedance.sdk.openadsdk.component.reward.a.c cVar, d dVar) {
        dVar.b(8);
        dVar.a(8);
        if (this.f11541b.l() == 2) {
            cVar.a(false);
            cVar.c(false);
            cVar.d(false);
            dVar.d(8);
            return;
        }
        cVar.a(this.f11541b.ap());
        cVar.c(e());
        cVar.d(e());
        if (e()) {
            dVar.d(8);
            return;
        }
        cVar.d();
        dVar.d(0);
    }
}
