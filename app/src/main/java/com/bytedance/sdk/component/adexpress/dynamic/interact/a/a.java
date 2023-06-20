package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;

/* compiled from: LongPressTouch.java */
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f9763a;

    /* renamed from: b  reason: collision with root package name */
    private float f9764b;

    /* renamed from: c  reason: collision with root package name */
    private long f9765c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9766d;

    /* renamed from: e  reason: collision with root package name */
    private InteractViewContainer f9767e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.interact.c f9768f;

    public a(InteractViewContainer interactViewContainer, com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar) {
        this.f9767e = interactViewContainer;
        this.f9768f = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9765c = System.currentTimeMillis();
            this.f9763a = motionEvent.getX();
            this.f9764b = motionEvent.getY();
            this.f9767e.c();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.f9763a) >= com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), 10.0f) || Math.abs(y10 - this.f9764b) >= com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), 10.0f)) {
                    this.f9766d = true;
                    this.f9767e.d();
                }
            }
        } else if (this.f9766d) {
            return false;
        } else {
            if (System.currentTimeMillis() - this.f9765c >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar = this.f9768f;
                if (cVar != null) {
                    cVar.a();
                }
            } else {
                this.f9767e.d();
            }
        }
        return true;
    }
}
