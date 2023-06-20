package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SlideRightTouch.java */
/* loaded from: classes.dex */
public class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f9769a;

    /* renamed from: b  reason: collision with root package name */
    private float f9770b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9771c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.interact.c f9772d;

    public b(com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar) {
        this.f9772d = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9769a = motionEvent.getX();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                this.f9770b = x10;
                if (Math.abs(x10 - this.f9769a) > 10.0f) {
                    this.f9771c = true;
                }
            }
        } else if (!this.f9771c) {
            return false;
        } else {
            int b10 = com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), Math.abs(this.f9770b - this.f9769a));
            if (this.f9770b > this.f9769a && b10 > 5 && (cVar = this.f9772d) != null) {
                cVar.a();
            }
        }
        return true;
    }
}
