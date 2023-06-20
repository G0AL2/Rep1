package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* compiled from: RNGestureHandlerRootView.java */
/* loaded from: classes3.dex */
public class h extends com.facebook.react.views.view.g {

    /* renamed from: t  reason: collision with root package name */
    private boolean f28440t;

    /* renamed from: u  reason: collision with root package name */
    private g f28441u;

    public h(Context context) {
        super(context);
    }

    private static boolean A(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof a) || (parent instanceof h)) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        g gVar = this.f28441u;
        if (gVar != null) {
            gVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28440t && ((g) f6.a.c(this.f28441u)).d(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = !A(this);
        this.f28440t = z10;
        if (!z10) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f28440t && this.f28441u == null) {
            this.f28441u = new g((ReactContext) getContext(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f28440t) {
            ((g) f6.a.c(this.f28441u)).h(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
