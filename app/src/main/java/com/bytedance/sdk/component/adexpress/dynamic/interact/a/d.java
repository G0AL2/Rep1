package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: TapTouch.java */
/* loaded from: classes.dex */
public class d implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    private static int f9778c = 10;

    /* renamed from: a  reason: collision with root package name */
    private float f9779a;

    /* renamed from: b  reason: collision with root package name */
    private float f9780b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9781d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.interact.c f9782e;

    public d(com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar) {
        this.f9782e = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9779a = motionEvent.getX();
            this.f9780b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.f9779a) >= f9778c || Math.abs(y10 - this.f9780b) >= f9778c) {
                    this.f9781d = true;
                }
            } else if (action == 3) {
                this.f9781d = false;
            }
        } else if (this.f9781d) {
            this.f9781d = false;
            return false;
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.f9779a) < f9778c && Math.abs(y11 - this.f9780b) < f9778c) {
                com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar = this.f9782e;
                if (cVar != null) {
                    cVar.a();
                }
            } else {
                this.f9781d = false;
            }
        }
        return true;
    }
}
