package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class u2 {

    /* renamed from: e  reason: collision with root package name */
    private static final cb.e f23053e = new cb.e("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23054a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.d0<d3> f23055b;

    /* renamed from: c  reason: collision with root package name */
    private final u f23056c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.d0<Executor> f23057d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(a0 a0Var, cb.d0<d3> d0Var, u uVar, fb.a aVar, k1 k1Var, w0 w0Var, k0 k0Var, cb.d0<Executor> d0Var2) {
        new Handler(Looper.getMainLooper());
        this.f23054a = a0Var;
        this.f23055b = d0Var;
        this.f23056c = uVar;
        this.f23057d = d0Var2;
    }

    private final void d() {
        this.f23057d.a().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.r2

            /* renamed from: a  reason: collision with root package name */
            private final u2 f23003a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f23003a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23003a.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z10) {
        boolean d10 = this.f23056c.d();
        this.f23056c.c(z10);
        if (!z10 || d10) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        a0 a0Var = this.f23054a;
        a0Var.getClass();
        this.f23055b.a().a(this.f23054a.l()).c(this.f23057d.a(), s2.a(a0Var)).b(this.f23057d.a(), t2.f23034a);
    }
}
