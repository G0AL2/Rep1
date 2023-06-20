package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullExpressVideoLayout.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    r3.c f11750a;

    /* renamed from: b  reason: collision with root package name */
    Handler f11751b;

    /* renamed from: c  reason: collision with root package name */
    boolean f11752c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f11753d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f11754e = false;

    /* renamed from: f  reason: collision with root package name */
    private Activity f11755f;

    /* renamed from: g  reason: collision with root package name */
    private n f11756g;

    /* renamed from: h  reason: collision with root package name */
    private String f11757h;

    /* renamed from: i  reason: collision with root package name */
    private FullRewardExpressView f11758i;

    public b(Activity activity) {
        this.f11755f = activity;
    }

    public void a(n nVar, AdSlot adSlot, String str, boolean z10) {
        if (this.f11754e) {
            return;
        }
        this.f11754e = true;
        this.f11756g = nVar;
        this.f11757h = str;
        this.f11758i = new FullRewardExpressView(this.f11755f, nVar, adSlot, str, z10);
    }

    public FrameLayout b() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView != null) {
            FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
            if (this.f11758i.n()) {
                a(videoFrameLayout);
            }
            return videoFrameLayout;
        }
        return null;
    }

    public boolean c() {
        return this.f11752c;
    }

    public boolean d() {
        return this.f11753d;
    }

    public Handler e() {
        if (this.f11751b == null) {
            this.f11751b = new Handler(Looper.getMainLooper());
        }
        return this.f11751b;
    }

    public void f() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.l();
        }
        Handler handler = this.f11751b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void g() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.k();
        }
    }

    public boolean h() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.n();
    }

    public int i() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public void j() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.i();
    }

    public void k() {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.j();
        this.f11758i.k();
    }

    public void b(boolean z10) {
        this.f11753d = z10;
    }

    public FullRewardExpressView a() {
        return this.f11758i;
    }

    public void a(boolean z10) {
        this.f11752c = z10;
    }

    public void a(f fVar, e eVar) {
        n nVar;
        if (this.f11758i == null || (nVar = this.f11756g) == null) {
            return;
        }
        this.f11750a = a(nVar);
        com.bytedance.sdk.openadsdk.b.e.a(this.f11756g);
        EmptyView a10 = a((ViewGroup) this.f11758i);
        if (a10 == null) {
            a10 = new EmptyView(this.f11755f, this.f11758i);
            this.f11758i.addView(a10);
        }
        fVar.a(this.f11758i);
        fVar.a(this.f11750a);
        this.f11758i.setClickListener(fVar);
        eVar.a(this.f11758i);
        eVar.a(this.f11750a);
        this.f11758i.setClickCreativeListener(eVar);
        a10.setNeedCheckingShow(false);
    }

    private r3.c a(n nVar) {
        if (nVar.L() == 4) {
            return r3.d.a(this.f11755f, nVar, this.f11757h);
        }
        return null;
    }

    private EmptyView a(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    public void a(j jVar) {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressVideoListenerProxy(jVar);
    }

    public void a(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        FullRewardExpressView fullRewardExpressView = this.f11758i;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressInteractionListener(expressAdInteractionListener);
    }

    public void a(FrameLayout frameLayout) {
        n nVar = this.f11756g;
        if (nVar != null && n.c(nVar) && this.f11756g.t() == 3 && this.f11756g.v() == 0) {
            try {
                if (this.f11756g.am() == 1) {
                    int e10 = v.e(m.a(), 90.0f);
                    FrameLayout frameLayout2 = (FrameLayout) this.f11758i.getBackupContainerBackgroundView();
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.bottomMargin = e10;
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
