package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    final m f6850a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f6851b;

    /* renamed from: c  reason: collision with root package name */
    final e f6852c;

    /* renamed from: d  reason: collision with root package name */
    final ViewGroup f6853d;

    /* renamed from: e  reason: collision with root package name */
    final FrameLayout.LayoutParams f6854e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(e eVar, Activity activity, m mVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f6854e = layoutParams;
        this.f6852c = eVar;
        this.f6850a = mVar;
        this.f6851b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f6853d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(e.c cVar, int i10, com.applovin.impl.adview.m mVar) {
        mVar.a(cVar.f8106a, cVar.f8110e, cVar.f8109d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        int i11 = cVar.f8108c;
        layoutParams.setMargins(i11, cVar.f8107b, i11, 0);
        layoutParams.gravity = i10;
        this.f6853d.addView(mVar, layoutParams);
    }
}
