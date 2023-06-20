package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.i;

/* compiled from: ReactDrawerLayout.java */
/* loaded from: classes.dex */
class a extends DrawerLayout {
    private int O;
    private int P;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.O = 8388611;
        this.P = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        d(this.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        I(this.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(int i10) {
        this.O = i10;
        Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            DrawerLayout.e eVar = (DrawerLayout.e) childAt.getLayoutParams();
            eVar.f2861a = this.O;
            ((ViewGroup.MarginLayoutParams) eVar).width = this.P;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(int i10) {
        this.P = i10;
        Y();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                i.a(this, motionEvent);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            z3.a.H("ReactNative", "Error intercepting touch event.", e10);
            return false;
        }
    }
}
