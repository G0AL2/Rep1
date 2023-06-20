package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullTopProxyManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    TopProxyLayout f11435a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.c f11436b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f11437c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11438d = false;

    public c(Activity activity) {
        this.f11437c = activity;
    }

    private void e() {
        Activity activity = this.f11437c;
        this.f11435a = (TopProxyLayout) activity.findViewById(t.e(activity, "tt_top_layout_proxy"));
    }

    public void a() {
        if (this.f11438d) {
            return;
        }
        this.f11438d = true;
        e();
    }

    public void b(boolean z10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.c cVar = this.f11436b;
        if (cVar != null) {
            cVar.setSoundMute(z10);
        }
    }

    public void c(boolean z10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z10);
        }
    }

    public void d(boolean z10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z10);
        }
    }

    public void e(boolean z10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z10);
        }
    }

    public void c() {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.b();
        }
    }

    public void d() {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.c();
        }
    }

    public void a(boolean z10, n nVar) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.a(z10, nVar);
        }
    }

    public void b() {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.a();
        }
    }

    public void c(int i10) {
        this.f11435a.setVisibility(i10);
    }

    public void a(boolean z10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z10);
        }
    }

    public void b(int i10) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout == null || topProxyLayout.getITopLayout() == null || (findViewById = this.f11435a.getITopLayout().findViewById(t.e(m.a(), "tt_top_dislike"))) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i10 - (iArr[0] + findViewById.getWidth());
        if (width < v.e(this.f11437c, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += v.e(this.f11437c, 16.0f) - width;
            findViewById.requestLayout();
        }
    }

    public void a(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.a(String.valueOf(str), charSequence);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.component.reward.top.b bVar) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(bVar);
        }
    }

    public void a(com.bytedance.sdk.component.adexpress.dynamic.c cVar) {
        this.f11436b = cVar;
    }

    public void a(int i10) {
        TopProxyLayout topProxyLayout = this.f11435a;
        if (topProxyLayout == null || !(topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.f11435a.getLayoutParams()).topMargin = i10 - v.e(this.f11437c, 20.0f);
    }
}
