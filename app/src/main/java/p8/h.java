package p8;

import j8.p1;
import java.io.EOFException;
import java.io.IOException;
import p8.a0;

/* compiled from: DummyTrackOutput.java */
/* loaded from: classes2.dex */
public final class h implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f35671a = new byte[4096];

    @Override // p8.a0
    public /* synthetic */ void a(ea.a0 a0Var, int i10) {
        z.b(this, a0Var, i10);
    }

    @Override // p8.a0
    public int b(da.i iVar, int i10, boolean z10, int i11) throws IOException {
        int c10 = iVar.c(this.f35671a, 0, Math.min(this.f35671a.length, i10));
        if (c10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return c10;
    }

    @Override // p8.a0
    public /* synthetic */ int c(da.i iVar, int i10, boolean z10) {
        return z.a(this, iVar, i10, z10);
    }

    @Override // p8.a0
    public void d(p1 p1Var) {
    }

    @Override // p8.a0
    public void e(long j10, int i10, int i11, int i12, a0.a aVar) {
    }

    @Override // p8.a0
    public void f(ea.a0 a0Var, int i10, int i11) {
        a0Var.Q(i10);
    }
}
