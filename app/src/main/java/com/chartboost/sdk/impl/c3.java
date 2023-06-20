package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.SurfaceView;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class c3 extends e1 {

    /* renamed from: l  reason: collision with root package name */
    private SurfaceView f13946l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f13947m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Context context, String str, h1 h1Var, k3 k3Var, com.chartboost.sdk.d dVar, Handler handler, String str2, SurfaceView surfaceView, FrameLayout frameLayout) {
        super(context, str, h1Var, k3Var, dVar, handler, str2);
        qe.k.f(context, "context");
        qe.k.f(h1Var, "callback");
        qe.k.f(k3Var, "viewBaseCallback");
        qe.k.f(dVar, "protocol");
        qe.k.f(handler, "uiHandler");
        qe.k.f(frameLayout, "videoBackground");
        this.f13946l = surfaceView;
        this.f13947m = frameLayout;
        if (surfaceView != null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(-16777216);
            addView(this.f13947m);
            this.f13947m.addView(this.f13946l);
            addView(this.f14099d);
            h1Var.b();
            h1Var.a();
            return;
        }
        throw new IllegalStateException("SurfaceView is not ready. Cannot display video.".toString());
    }

    public void c() {
        SurfaceView surfaceView = this.f13946l;
        if (surfaceView == null || this.f13947m == null) {
            return;
        }
        surfaceView.setVisibility(8);
        this.f13947m.removeView(this.f13946l);
    }

    public /* synthetic */ c3(Context context, String str, h1 h1Var, k3 k3Var, com.chartboost.sdk.d dVar, Handler handler, String str2, SurfaceView surfaceView, FrameLayout frameLayout, int i10, qe.g gVar) {
        this(context, str, h1Var, k3Var, dVar, handler, str2, surfaceView, (i10 & 256) != 0 ? new FrameLayout(context) : frameLayout);
    }
}
