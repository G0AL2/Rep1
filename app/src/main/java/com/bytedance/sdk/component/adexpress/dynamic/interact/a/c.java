package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SlideUpTouch.java */
/* loaded from: classes.dex */
public class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f9773a;

    /* renamed from: b  reason: collision with root package name */
    private float f9774b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9775c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.interact.c f9776d;

    /* renamed from: e  reason: collision with root package name */
    private int f9777e;

    public c(com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar, int i10) {
        this.f9776d = cVar;
        this.f9777e = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9773a = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f9774b = y10;
                if (Math.abs(y10 - this.f9773a) > 10.0f) {
                    this.f9775c = true;
                }
            }
        } else if (!this.f9775c) {
            return false;
        } else {
            int b10 = com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), Math.abs(this.f9774b - this.f9773a));
            if (this.f9774b - this.f9773a < 0.0f && b10 > this.f9777e && (cVar = this.f9776d) != null) {
                cVar.a();
            }
        }
        return true;
    }
}
