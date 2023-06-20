package androidx.room;

import androidx.room.k0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorStatement.kt */
/* loaded from: classes.dex */
public final class i0 implements z0.k {

    /* renamed from: a */
    private final z0.k f3911a;

    /* renamed from: b */
    private final String f3912b;

    /* renamed from: c */
    private final Executor f3913c;

    /* renamed from: d */
    private final k0.g f3914d;

    /* renamed from: e */
    private final List<Object> f3915e;

    public i0(z0.k kVar, String str, Executor executor, k0.g gVar) {
        qe.k.f(kVar, "delegate");
        qe.k.f(str, "sqlStatement");
        qe.k.f(executor, "queryCallbackExecutor");
        qe.k.f(gVar, "queryCallback");
        this.f3911a = kVar;
        this.f3912b = str;
        this.f3913c = executor;
        this.f3914d = gVar;
        this.f3915e = new ArrayList();
    }

    public static /* synthetic */ void a(i0 i0Var) {
        e(i0Var);
    }

    public static /* synthetic */ void b(i0 i0Var) {
        d(i0Var);
    }

    public static final void d(i0 i0Var) {
        qe.k.f(i0Var, "this$0");
        i0Var.f3914d.a(i0Var.f3912b, i0Var.f3915e);
    }

    public static final void e(i0 i0Var) {
        qe.k.f(i0Var, "this$0");
        i0Var.f3914d.a(i0Var.f3912b, i0Var.f3915e);
    }

    private final void h(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f3915e.size()) {
            int size = (i11 - this.f3915e.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                this.f3915e.add(null);
            }
        }
        this.f3915e.set(i11, obj);
    }

    @Override // z0.i
    public void A0(int i10, long j10) {
        h(i10, Long.valueOf(j10));
        this.f3911a.A0(i10, j10);
    }

    @Override // z0.i
    public void D0(int i10, byte[] bArr) {
        qe.k.f(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        h(i10, bArr);
        this.f3911a.D0(i10, bArr);
    }

    @Override // z0.i
    public void P0(int i10) {
        Object[] array = this.f3915e.toArray(new Object[0]);
        qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        h(i10, Arrays.copyOf(array, array.length));
        this.f3911a.P0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3911a.close();
    }

    @Override // z0.i
    public void g(int i10, double d10) {
        h(i10, Double.valueOf(d10));
        this.f3911a.g(i10, d10);
    }

    @Override // z0.k
    public long l0() {
        this.f3913c.execute(new Runnable() { // from class: androidx.room.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.b(i0.this);
            }
        });
        return this.f3911a.l0();
    }

    @Override // z0.i
    public void p0(int i10, String str) {
        qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        h(i10, str);
        this.f3911a.p0(i10, str);
    }

    @Override // z0.k
    public int v() {
        this.f3913c.execute(new Runnable() { // from class: androidx.room.g0
            @Override // java.lang.Runnable
            public final void run() {
                i0.a(i0.this);
            }
        });
        return this.f3911a.v();
    }
}
