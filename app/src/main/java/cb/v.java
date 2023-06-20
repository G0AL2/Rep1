package cb;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class v extends u {

    /* renamed from: a  reason: collision with root package name */
    private final u f5459a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5460b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5461c;

    public v(u uVar, long j10, long j11) {
        this.f5459a = uVar;
        long e10 = e(j10);
        this.f5460b = e10;
        this.f5461c = e(e10 + j11);
    }

    private final long e(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 > this.f5459a.a() ? this.f5459a.a() : j10;
    }

    @Override // cb.u
    public final long a() {
        return this.f5461c - this.f5460b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cb.u
    public final InputStream b(long j10, long j11) throws IOException {
        long e10 = e(this.f5460b);
        return this.f5459a.b(e10, e(j11 + e10) - e10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
