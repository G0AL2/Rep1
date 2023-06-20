package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: HackTouchDelegate.java */
/* loaded from: classes.dex */
public class g extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    private View f10448a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f10449b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f10450c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10451d;

    /* renamed from: e  reason: collision with root package name */
    private int f10452e;

    public g(Rect rect, View view) {
        super(rect, view);
        this.f10449b = rect;
        this.f10452e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.f10450c = rect2;
        int i10 = this.f10452e;
        rect2.inset(-i10, -i10);
        this.f10448a = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z12 = this.f10451d;
                if (z12) {
                    z10 = this.f10450c.contains(x10, y10);
                    z11 = z12;
                } else {
                    z11 = z12;
                }
            } else {
                if (action == 3) {
                    boolean z13 = this.f10451d;
                    this.f10451d = false;
                    z11 = z13;
                }
                z10 = true;
                z11 = false;
            }
            z10 = true;
        } else if (this.f10449b.contains(x10, y10)) {
            this.f10451d = true;
            z10 = true;
        } else {
            this.f10451d = false;
            z10 = true;
            z11 = false;
        }
        if (z11) {
            View view = this.f10448a;
            if (z10) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                float f10 = -(this.f10452e * 2);
                motionEvent.setLocation(f10, f10);
            }
            if (view.getVisibility() == 0) {
                return view.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }
}
