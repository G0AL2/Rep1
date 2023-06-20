package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.core.nativeexpress.o;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class FullRewardExpressView extends NativeExpressView {

    /* renamed from: c  reason: collision with root package name */
    public static float f11728c = 100.0f;

    /* renamed from: a  reason: collision with root package name */
    j f11729a;

    /* renamed from: b  reason: collision with root package name */
    FullRewardExpressBackupView f11730b;

    public FullRewardExpressView(Context context, n nVar, AdSlot adSlot, String str, boolean z10) {
        super(context, nVar, adSlot, str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(m mVar) {
        if (mVar == null) {
            return;
        }
        double d10 = mVar.d();
        double e10 = mVar.e();
        double f10 = mVar.f();
        double g10 = mVar.g();
        int b10 = (int) v.b(this.f12563f, (float) d10);
        int b11 = (int) v.b(this.f12563f, (float) e10);
        int b12 = (int) v.b(this.f12563f, (float) f10);
        int b13 = (int) v.b(this.f12563f, (float) g10);
        l.b("ExpressView", "videoWidth:" + f10);
        l.b("ExpressView", "videoHeight:" + g10);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12568k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(b12, b13);
        }
        layoutParams.width = b12;
        layoutParams.height = b13;
        layoutParams.topMargin = b11;
        layoutParams.leftMargin = b10;
        this.f12568k.setLayoutParams(layoutParams);
        this.f12568k.removeAllViews();
    }

    private void h() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.b.c() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.1
            @Override // com.bytedance.sdk.component.adexpress.b.c
            public boolean a(ViewGroup viewGroup, int i10) {
                try {
                    ((NativeExpressView) viewGroup).m();
                    FullRewardExpressView.this.f11730b = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView fullRewardExpressView = FullRewardExpressView.this;
                    fullRewardExpressView.f11730b.a(((NativeExpressView) fullRewardExpressView).f12566i, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public long c() {
        l.b("FullRewardExpressView", "onGetCurrentPlayTime");
        j jVar = this.f11729a;
        if (jVar != null) {
            return jVar.c();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public int d() {
        l.b("FullRewardExpressView", "onGetVideoState");
        j jVar = this.f11729a;
        if (jVar != null) {
            return jVar.d();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void e() {
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    protected void g() {
        this.f12570m = true;
        FrameLayout frameLayout = new FrameLayout(this.f12563f);
        this.f12568k = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        super.g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        h();
    }

    public View getBackupContainerBackgroundView() {
        if (n()) {
            return this.f11730b.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        if (n()) {
            return this.f11730b.getVideoContainer();
        }
        return this.f12568k;
    }

    public void setExpressVideoListenerProxy(j jVar) {
        this.f11729a = jVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.b.n
    public void a(com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar, m mVar) {
        if (dVar instanceof o) {
            o oVar = (o) dVar;
            if (oVar.p() != null) {
                oVar.p().a((j) this);
            }
        }
        if (mVar != null && mVar.a()) {
            a(mVar);
        }
        super.a(dVar, mVar);
    }

    private void a(final m mVar) {
        if (mVar == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(mVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.2
                @Override // java.lang.Runnable
                public void run() {
                    FullRewardExpressView.this.b(mVar);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a(boolean z10) {
        l.b("FullRewardExpressView", "onMuteVideo,mute:" + z10);
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.a(z10);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a() {
        l.b("FullRewardExpressView", "onSkipVideo");
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void a(int i10) {
        l.b("FullRewardExpressView", "onChangeVideoState,stateType:" + i10);
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.a(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void b() {
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.b.g
    public void a(View view, int i10, com.bytedance.sdk.component.adexpress.b bVar) {
        if (i10 != -1 && bVar != null && i10 == 3) {
            e();
        } else {
            super.a(view, i10, bVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.j
    public void b(int i10) {
        j jVar = this.f11729a;
        if (jVar != null) {
            jVar.b(i10);
        }
    }
}
