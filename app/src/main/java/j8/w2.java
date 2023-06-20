package j8;

import j8.r2;
import java.io.IOException;

/* compiled from: Renderer.java */
/* loaded from: classes2.dex */
public interface w2 extends r2.b {

    /* compiled from: Renderer.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(long j10);
    }

    boolean d();

    void disable();

    int e();

    i9.o0 f();

    boolean g();

    String getName();

    int getState();

    void h();

    void i(int i10, k8.o1 o1Var);

    boolean isReady();

    void j(p1[] p1VarArr, i9.o0 o0Var, long j10, long j11) throws n;

    void l() throws IOException;

    boolean m();

    y2 n();

    void p(float f10, float f11) throws n;

    void r(long j10, long j11) throws n;

    void reset();

    void s(z2 z2Var, p1[] p1VarArr, i9.o0 o0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws n;

    void start() throws n;

    void stop();

    long t();

    void u(long j10) throws n;

    ea.t v();
}
