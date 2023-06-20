package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: ReactDelegate.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f15663a;

    /* renamed from: b  reason: collision with root package name */
    private x f15664b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f15665c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.react.devsupport.d f15666d = new com.facebook.react.devsupport.d();

    /* renamed from: e  reason: collision with root package name */
    private s f15667e;

    public n(Activity activity, s sVar, String str, Bundle bundle) {
        this.f15663a = activity;
        this.f15665c = bundle;
        this.f15667e = sVar;
    }

    private s c() {
        return this.f15667e;
    }

    protected x a() {
        throw null;
    }

    public p b() {
        return c().getReactInstanceManager();
    }

    public x d() {
        return this.f15664b;
    }

    public void e(String str) {
        if (this.f15664b == null) {
            x a10 = a();
            this.f15664b = a10;
            a10.s(c().getReactInstanceManager(), str, this.f15665c);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    public void f(int i10, int i11, Intent intent, boolean z10) {
        if (c().hasInstance() && z10) {
            c().getReactInstanceManager().L(this.f15663a, i10, i11, intent);
        }
    }

    public boolean g() {
        if (c().hasInstance()) {
            c().getReactInstanceManager().M();
            return true;
        }
        return false;
    }

    public void h() {
        x xVar = this.f15664b;
        if (xVar != null) {
            xVar.u();
            this.f15664b = null;
        }
        if (c().hasInstance()) {
            c().getReactInstanceManager().P(this.f15663a);
        }
    }

    public void i() {
        if (c().hasInstance()) {
            c().getReactInstanceManager().R(this.f15663a);
        }
    }

    public void j() {
        if (c().hasInstance()) {
            if (this.f15663a instanceof com.facebook.react.modules.core.b) {
                p reactInstanceManager = c().getReactInstanceManager();
                Activity activity = this.f15663a;
                reactInstanceManager.T(activity, (com.facebook.react.modules.core.b) activity);
                return;
            }
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
    }

    public boolean k(int i10, KeyEvent keyEvent) {
        if (c().hasInstance() && c().getUseDeveloperSupport()) {
            if (i10 == 82) {
                c().getReactInstanceManager().g0();
                return true;
            } else if (((com.facebook.react.devsupport.d) f6.a.c(this.f15666d)).b(i10, this.f15663a.getCurrentFocus())) {
                c().getReactInstanceManager().A().s();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
