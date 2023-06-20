package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import q4.c;
import u4.t;
import u4.u;
import x4.b;
import y3.j;
import y3.k;

/* compiled from: DraweeHolder.java */
/* loaded from: classes.dex */
public class b<DH extends x4.b> implements u {

    /* renamed from: d  reason: collision with root package name */
    private DH f14512d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14509a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14510b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14511c = true;

    /* renamed from: e  reason: collision with root package name */
    private x4.a f14513e = null;

    /* renamed from: f  reason: collision with root package name */
    private final q4.c f14514f = q4.c.a();

    public b(DH dh) {
        if (dh != null) {
            p(dh);
        }
    }

    private void c() {
        if (this.f14509a) {
            return;
        }
        this.f14514f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f14509a = true;
        x4.a aVar = this.f14513e;
        if (aVar == null || aVar.d() == null) {
            return;
        }
        this.f14513e.b();
    }

    private void d() {
        if (this.f14510b && this.f14511c) {
            c();
        } else {
            f();
        }
    }

    public static <DH extends x4.b> b<DH> e(DH dh, Context context) {
        b<DH> bVar = new b<>(dh);
        bVar.n(context);
        return bVar;
    }

    private void f() {
        if (this.f14509a) {
            this.f14514f.b(c.a.ON_DETACH_CONTROLLER);
            this.f14509a = false;
            if (j()) {
                this.f14513e.c();
            }
        }
    }

    private void q(u uVar) {
        Drawable i10 = i();
        if (i10 instanceof t) {
            ((t) i10).k(uVar);
        }
    }

    @Override // u4.u
    public void a() {
        if (this.f14509a) {
            return;
        }
        z3.a.E(q4.c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f14513e)), toString());
        this.f14510b = true;
        this.f14511c = true;
        d();
    }

    @Override // u4.u
    public void b(boolean z10) {
        if (this.f14511c == z10) {
            return;
        }
        this.f14514f.b(z10 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f14511c = z10;
        d();
    }

    public x4.a g() {
        return this.f14513e;
    }

    public DH h() {
        return (DH) k.g(this.f14512d);
    }

    public Drawable i() {
        DH dh = this.f14512d;
        if (dh == null) {
            return null;
        }
        return dh.e();
    }

    public boolean j() {
        x4.a aVar = this.f14513e;
        return aVar != null && aVar.d() == this.f14512d;
    }

    public void k() {
        this.f14514f.b(c.a.ON_HOLDER_ATTACH);
        this.f14510b = true;
        d();
    }

    public void l() {
        this.f14514f.b(c.a.ON_HOLDER_DETACH);
        this.f14510b = false;
        d();
    }

    public boolean m(MotionEvent motionEvent) {
        if (j()) {
            return this.f14513e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void n(Context context) {
    }

    public void o(x4.a aVar) {
        boolean z10 = this.f14509a;
        if (z10) {
            f();
        }
        if (j()) {
            this.f14514f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f14513e.e(null);
        }
        this.f14513e = aVar;
        if (aVar != null) {
            this.f14514f.b(c.a.ON_SET_CONTROLLER);
            this.f14513e.e(this.f14512d);
        } else {
            this.f14514f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            c();
        }
    }

    public void p(DH dh) {
        this.f14514f.b(c.a.ON_SET_HIERARCHY);
        boolean j10 = j();
        q(null);
        DH dh2 = (DH) k.g(dh);
        this.f14512d = dh2;
        Drawable e10 = dh2.e();
        b(e10 == null || e10.isVisible());
        q(this);
        if (j10) {
            this.f14513e.e(dh);
        }
    }

    public String toString() {
        return j.c(this).c("controllerAttached", this.f14509a).c("holderAttached", this.f14510b).c("drawableVisible", this.f14511c).b("events", this.f14514f.toString()).toString();
    }
}
