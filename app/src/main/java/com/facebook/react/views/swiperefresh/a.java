package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.r;

/* compiled from: ReactSwipeRefreshLayout.java */
/* loaded from: classes.dex */
public class a extends SwipeRefreshLayout {
    private boolean S;
    private boolean T;
    private float U;
    private int V;
    private float W;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f16180g0;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.S = false;
        this.T = false;
        this.U = 0.0f;
        this.V = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.W = motionEvent.getX();
            this.f16180g0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            if (this.f16180g0 || abs > this.V) {
                this.f16180g0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (B(motionEvent) && super.onInterceptTouchEvent(motionEvent)) {
            i.a(this, motionEvent);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.S) {
            return;
        }
        this.S = true;
        setProgressViewOffset(this.U);
        setRefreshing(this.T);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setProgressViewOffset(float f10) {
        this.U = f10;
        if (this.S) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(r.c(f10)) - progressCircleDiameter, Math.round(r.c(f10 + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z10) {
        this.T = z10;
        if (this.S) {
            super.setRefreshing(z10);
        }
    }
}
