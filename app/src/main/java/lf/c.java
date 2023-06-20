package lf;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import mf.e0;
import mf.p;
import qe.k;

/* compiled from: MessageInflater.kt */
/* loaded from: classes3.dex */
public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final mf.f f34053a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f34054b;

    /* renamed from: c  reason: collision with root package name */
    private final p f34055c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34056d;

    public c(boolean z10) {
        this.f34056d = z10;
        mf.f fVar = new mf.f();
        this.f34053a = fVar;
        Inflater inflater = new Inflater(true);
        this.f34054b = inflater;
        this.f34055c = new p((e0) fVar, inflater);
    }

    public final void a(mf.f fVar) throws IOException {
        k.f(fVar, "buffer");
        if (this.f34053a.C0() == 0) {
            if (this.f34056d) {
                this.f34054b.reset();
            }
            this.f34053a.t(fVar);
            this.f34053a.writeInt(65535);
            long bytesRead = this.f34054b.getBytesRead() + this.f34053a.C0();
            do {
                this.f34055c.a(fVar, Long.MAX_VALUE);
            } while (this.f34054b.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34055c.close();
    }
}
