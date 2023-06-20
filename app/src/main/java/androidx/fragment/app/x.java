package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class x implements androidx.savedstate.c, h0 {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f3277a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.lifecycle.q f3278b = null;

    /* renamed from: c  reason: collision with root package name */
    private androidx.savedstate.b f3279c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Fragment fragment, g0 g0Var) {
        this.f3277a = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i.b bVar) {
        this.f3278b.h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f3278b == null) {
            this.f3278b = new androidx.lifecycle.q(this);
            this.f3279c = androidx.savedstate.b.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f3278b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f3279c.c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f3279c.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(i.c cVar) {
        this.f3278b.o(cVar);
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        b();
        return this.f3278b;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f3279c.b();
    }

    @Override // androidx.lifecycle.h0
    public g0 getViewModelStore() {
        b();
        return this.f3277a;
    }
}
