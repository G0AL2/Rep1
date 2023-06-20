package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorDatabase.kt */
/* loaded from: classes.dex */
public final class c0 implements z0.g {

    /* renamed from: a */
    private final z0.g f3854a;

    /* renamed from: b */
    private final Executor f3855b;

    /* renamed from: c */
    private final k0.g f3856c;

    public c0(z0.g gVar, Executor executor, k0.g gVar2) {
        qe.k.f(gVar, "delegate");
        qe.k.f(executor, "queryCallbackExecutor");
        qe.k.f(gVar2, "queryCallback");
        this.f3854a = gVar;
        this.f3855b = executor;
        this.f3856c = gVar2;
    }

    public static final void A(c0 c0Var) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a("BEGIN DEFERRED TRANSACTION", h10);
    }

    public static final void C(c0 c0Var) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a("END TRANSACTION", h10);
    }

    public static final void L(c0 c0Var, String str) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        qe.k.f(str, "$sql");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a(str, h10);
    }

    public static final void O(c0 c0Var, String str, List list) {
        qe.k.f(c0Var, "this$0");
        qe.k.f(str, "$sql");
        qe.k.f(list, "$inputArguments");
        c0Var.f3856c.a(str, list);
    }

    public static final void T(c0 c0Var, String str) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        qe.k.f(str, "$query");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a(str, h10);
    }

    public static final void U(c0 c0Var, z0.j jVar, f0 f0Var) {
        qe.k.f(c0Var, "this$0");
        qe.k.f(jVar, "$query");
        qe.k.f(f0Var, "$queryInterceptorProgram");
        c0Var.f3856c.a(jVar.b(), f0Var.a());
    }

    public static final void Z(c0 c0Var, z0.j jVar, f0 f0Var) {
        qe.k.f(c0Var, "this$0");
        qe.k.f(jVar, "$query");
        qe.k.f(f0Var, "$queryInterceptorProgram");
        c0Var.f3856c.a(jVar.b(), f0Var.a());
    }

    public static /* synthetic */ void a(c0 c0Var) {
        C(c0Var);
    }

    public static /* synthetic */ void b(c0 c0Var, String str) {
        T(c0Var, str);
    }

    public static /* synthetic */ void d(c0 c0Var) {
        A(c0Var);
    }

    public static final void d0(c0 c0Var) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a("TRANSACTION SUCCESSFUL", h10);
    }

    public static /* synthetic */ void e(c0 c0Var, z0.j jVar, f0 f0Var) {
        U(c0Var, jVar, f0Var);
    }

    public static /* synthetic */ void h(c0 c0Var, String str, List list) {
        O(c0Var, str, list);
    }

    public static /* synthetic */ void l(c0 c0Var) {
        d0(c0Var);
    }

    public static /* synthetic */ void q(c0 c0Var, z0.j jVar, f0 f0Var) {
        Z(c0Var, jVar, f0Var);
    }

    public static /* synthetic */ void w(c0 c0Var, String str) {
        L(c0Var, str);
    }

    public static /* synthetic */ void y(c0 c0Var) {
        z(c0Var);
    }

    public static final void z(c0 c0Var) {
        List<? extends Object> h10;
        qe.k.f(c0Var, "this$0");
        k0.g gVar = c0Var.f3856c;
        h10 = fe.p.h();
        gVar.a("BEGIN EXCLUSIVE TRANSACTION", h10);
    }

    @Override // z0.g
    public int B0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        qe.k.f(str, "table");
        qe.k.f(contentValues, "values");
        return this.f3854a.B0(str, i10, contentValues, str2, objArr);
    }

    @Override // z0.g
    public Cursor E(final z0.j jVar, CancellationSignal cancellationSignal) {
        qe.k.f(jVar, "query");
        final f0 f0Var = new f0();
        jVar.a(f0Var);
        this.f3855b.execute(new Runnable() { // from class: androidx.room.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.q(c0.this, jVar, f0Var);
            }
        });
        return this.f3854a.x(jVar);
    }

    @Override // z0.g
    public void H() {
        this.f3855b.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                c0.l(c0.this);
            }
        });
        this.f3854a.H();
    }

    @Override // z0.g
    public void I(final String str, Object[] objArr) {
        List d10;
        qe.k.f(str, "sql");
        qe.k.f(objArr, "bindArgs");
        final ArrayList arrayList = new ArrayList();
        d10 = fe.o.d(objArr);
        arrayList.addAll(d10);
        this.f3855b.execute(new Runnable() { // from class: androidx.room.z
            @Override // java.lang.Runnable
            public final void run() {
                c0.h(c0.this, str, arrayList);
            }
        });
        this.f3854a.I(str, new Object[]{arrayList});
    }

    @Override // z0.g
    public Cursor I0(final String str) {
        qe.k.f(str, "query");
        this.f3855b.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.b(c0.this, str);
            }
        });
        return this.f3854a.I0(str);
    }

    @Override // z0.g
    public void J() {
        this.f3855b.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                c0.d(c0.this);
            }
        });
        this.f3854a.J();
    }

    @Override // z0.g
    public void Q() {
        this.f3855b.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                c0.a(c0.this);
            }
        });
        this.f3854a.Q();
    }

    @Override // z0.g
    public boolean S0() {
        return this.f3854a.S0();
    }

    @Override // z0.g
    public boolean a1() {
        return this.f3854a.a1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3854a.close();
    }

    @Override // z0.g
    public String getPath() {
        return this.f3854a.getPath();
    }

    @Override // z0.g
    public boolean isOpen() {
        return this.f3854a.isOpen();
    }

    @Override // z0.g
    public void m() {
        this.f3855b.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                c0.y(c0.this);
            }
        });
        this.f3854a.m();
    }

    @Override // z0.g
    public List<Pair<String, String>> o() {
        return this.f3854a.o();
    }

    @Override // z0.g
    public void s(final String str) {
        qe.k.f(str, "sql");
        this.f3855b.execute(new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.w(c0.this, str);
            }
        });
        this.f3854a.s(str);
    }

    @Override // z0.g
    public z0.k t0(String str) {
        qe.k.f(str, "sql");
        return new i0(this.f3854a.t0(str), str, this.f3855b, this.f3856c);
    }

    @Override // z0.g
    public Cursor x(final z0.j jVar) {
        qe.k.f(jVar, "query");
        final f0 f0Var = new f0();
        jVar.a(f0Var);
        this.f3855b.execute(new Runnable() { // from class: androidx.room.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.e(c0.this, jVar, f0Var);
            }
        });
        return this.f3854a.x(jVar);
    }
}
