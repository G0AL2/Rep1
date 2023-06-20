package bf;

import ee.u;
import java.io.IOException;
import mf.c0;
import mf.f;
import mf.k;
import pe.l;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes3.dex */
public class e extends k {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5287b;

    /* renamed from: c  reason: collision with root package name */
    private final l<IOException, u> f5288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(c0 c0Var, l<? super IOException, u> lVar) {
        super(c0Var);
        qe.k.f(c0Var, "delegate");
        qe.k.f(lVar, "onException");
        this.f5288c = lVar;
    }

    @Override // mf.k, mf.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5287b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f5287b = true;
            this.f5288c.b(e10);
        }
    }

    @Override // mf.k, mf.c0, java.io.Flushable
    public void flush() {
        if (this.f5287b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f5287b = true;
            this.f5288c.b(e10);
        }
    }

    @Override // mf.k, mf.c0
    public void n0(f fVar, long j10) {
        qe.k.f(fVar, "source");
        if (this.f5287b) {
            fVar.O0(j10);
            return;
        }
        try {
            super.n0(fVar, j10);
        } catch (IOException e10) {
            this.f5287b = true;
            this.f5288c.b(e10);
        }
    }
}
