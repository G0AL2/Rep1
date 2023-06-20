package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.p;
import com.facebook.react.x;

/* compiled from: RNGestureHandlerEnabledRootView.java */
/* loaded from: classes3.dex */
public class a extends x {

    /* renamed from: u  reason: collision with root package name */
    private p f28422u;

    /* renamed from: v  reason: collision with root package name */
    private g f28423v;

    public a(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar = this.f28423v;
        if (gVar == null || !gVar.d(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.facebook.react.x, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        g gVar = this.f28423v;
        if (gVar != null) {
            gVar.h(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // com.facebook.react.x
    public void s(p pVar, String str, Bundle bundle) {
        super.s(pVar, str, bundle);
        this.f28422u = pVar;
    }

    public void w() {
        if (this.f28423v == null) {
            this.f28423v = new g(this.f28422u.z(), this);
            return;
        }
        throw new IllegalStateException("GestureHandler already initialized for root view " + this);
    }

    public void x() {
        g gVar = this.f28423v;
        if (gVar != null) {
            gVar.i();
            this.f28423v = null;
        }
    }
}
