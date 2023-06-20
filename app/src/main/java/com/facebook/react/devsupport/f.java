package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: LogBoxDialogSurfaceDelegate.java */
/* loaded from: classes.dex */
public class f implements h6.h {

    /* renamed from: a  reason: collision with root package name */
    private View f15369a;

    /* renamed from: b  reason: collision with root package name */
    private e f15370b;

    /* renamed from: c  reason: collision with root package name */
    private final k6.d f15371c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(k6.d dVar) {
        this.f15371c = dVar;
    }

    private boolean e() {
        return this.f15370b != null;
    }

    @Override // h6.h
    public boolean a() {
        return this.f15369a != null;
    }

    @Override // h6.h
    public void b(String str) {
        f6.a.b(str.equals(LogBoxModule.NAME), "This surface manager can only create LogBox React application");
        View c10 = this.f15371c.c(LogBoxModule.NAME);
        this.f15369a = c10;
        if (c10 == null) {
            b7.c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // h6.h
    public void c() {
        View view = this.f15369a;
        if (view != null) {
            this.f15371c.l(view);
            this.f15369a = null;
        }
    }

    @Override // h6.h
    public void d() {
        if (e()) {
            View view = this.f15369a;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.f15369a.getParent()).removeView(this.f15369a);
            }
            this.f15370b.dismiss();
            this.f15370b = null;
        }
    }

    @Override // h6.h
    public void show() {
        if (e() || !a()) {
            return;
        }
        Activity p10 = this.f15371c.p();
        if (p10 != null && !p10.isFinishing()) {
            e eVar = new e(p10, this.f15369a);
            this.f15370b = eVar;
            eVar.setCancelable(false);
            this.f15370b.show();
            return;
        }
        b7.c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
    }
}
