package lf;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import mf.c0;
import mf.f;
import mf.i;
import mf.j;
import qe.k;

/* compiled from: MessageDeflater.kt */
/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final mf.f f34048a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f34049b;

    /* renamed from: c  reason: collision with root package name */
    private final j f34050c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34051d;

    public a(boolean z10) {
        this.f34051d = z10;
        mf.f fVar = new mf.f();
        this.f34048a = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.f34049b = deflater;
        this.f34050c = new j((c0) fVar, deflater);
    }

    private final boolean b(mf.f fVar, i iVar) {
        return fVar.N(fVar.C0() - iVar.A(), iVar);
    }

    public final void a(mf.f fVar) throws IOException {
        i iVar;
        k.f(fVar, "buffer");
        if (this.f34048a.C0() == 0) {
            if (this.f34051d) {
                this.f34049b.reset();
            }
            this.f34050c.n0(fVar, fVar.C0());
            this.f34050c.flush();
            mf.f fVar2 = this.f34048a;
            iVar = b.f34052a;
            if (b(fVar2, iVar)) {
                long C0 = this.f34048a.C0() - 4;
                f.a d02 = mf.f.d0(this.f34048a, null, 1, null);
                try {
                    d02.b(C0);
                    ne.a.a(d02, null);
                } finally {
                }
            } else {
                this.f34048a.writeByte(0);
            }
            mf.f fVar3 = this.f34048a;
            fVar.n0(fVar3, fVar3.C0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34050c.close();
    }
}
