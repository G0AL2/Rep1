package i9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.k;
import i9.b0;
import i9.u;
import j8.j3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k8.o1;

/* compiled from: BaseMediaSource.java */
/* loaded from: classes2.dex */
public abstract class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<u.c> f31549a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<u.c> f31550b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final b0.a f31551c = new b0.a();

    /* renamed from: d  reason: collision with root package name */
    private final k.a f31552d = new k.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f31553e;

    /* renamed from: f  reason: collision with root package name */
    private j3 f31554f;

    /* renamed from: g  reason: collision with root package name */
    private o1 f31555g;

    /* JADX INFO: Access modifiers changed from: protected */
    public final o1 A() {
        return (o1) ea.a.h(this.f31555g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        return !this.f31550b.isEmpty();
    }

    protected abstract void C(da.m0 m0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(j3 j3Var) {
        this.f31554f = j3Var;
        Iterator<u.c> it = this.f31549a.iterator();
        while (it.hasNext()) {
            it.next().a(this, j3Var);
        }
    }

    protected abstract void E();

    @Override // i9.u
    public final void a(Handler handler, b0 b0Var) {
        ea.a.e(handler);
        ea.a.e(b0Var);
        this.f31551c.g(handler, b0Var);
    }

    @Override // i9.u
    public final void b(u.c cVar, da.m0 m0Var, o1 o1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f31553e;
        ea.a.a(looper == null || looper == myLooper);
        this.f31555g = o1Var;
        j3 j3Var = this.f31554f;
        this.f31549a.add(cVar);
        if (this.f31553e == null) {
            this.f31553e = myLooper;
            this.f31550b.add(cVar);
            C(m0Var);
        } else if (j3Var != null) {
            g(cVar);
            cVar.a(this, j3Var);
        }
    }

    @Override // i9.u
    public final void c(b0 b0Var) {
        this.f31551c.C(b0Var);
    }

    @Override // i9.u
    public final void g(u.c cVar) {
        ea.a.e(this.f31553e);
        boolean isEmpty = this.f31550b.isEmpty();
        this.f31550b.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // i9.u
    public final void h(u.c cVar) {
        this.f31549a.remove(cVar);
        if (this.f31549a.isEmpty()) {
            this.f31553e = null;
            this.f31554f = null;
            this.f31555g = null;
            this.f31550b.clear();
            E();
            return;
        }
        k(cVar);
    }

    @Override // i9.u
    public final void k(u.c cVar) {
        boolean z10 = !this.f31550b.isEmpty();
        this.f31550b.remove(cVar);
        if (z10 && this.f31550b.isEmpty()) {
            y();
        }
    }

    @Override // i9.u
    public final void n(Handler handler, com.google.android.exoplayer2.drm.k kVar) {
        ea.a.e(handler);
        ea.a.e(kVar);
        this.f31552d.g(handler, kVar);
    }

    @Override // i9.u
    public final void o(com.google.android.exoplayer2.drm.k kVar) {
        this.f31552d.t(kVar);
    }

    @Override // i9.u
    public /* synthetic */ boolean q() {
        return t.b(this);
    }

    @Override // i9.u
    public /* synthetic */ j3 r() {
        return t.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a t(int i10, u.b bVar) {
        return this.f31552d.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a u(u.b bVar) {
        return this.f31552d.u(0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a v(int i10, u.b bVar, long j10) {
        return this.f31551c.F(i10, bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a w(u.b bVar) {
        return this.f31551c.F(0, bVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a x(u.b bVar, long j10) {
        ea.a.e(bVar);
        return this.f31551c.F(0, bVar, j10);
    }

    protected void y() {
    }

    protected void z() {
    }
}
