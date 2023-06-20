package da;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
/* loaded from: classes2.dex */
public final class l0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f29207a;

    /* renamed from: b  reason: collision with root package name */
    private long f29208b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f29209c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f29210d = Collections.emptyMap();

    public l0(l lVar) {
        this.f29207a = (l) ea.a.e(lVar);
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws IOException {
        int c10 = this.f29207a.c(bArr, i10, i11);
        if (c10 != -1) {
            this.f29208b += c10;
        }
        return c10;
    }

    @Override // da.l
    public void close() throws IOException {
        this.f29207a.close();
    }

    @Override // da.l
    public Map<String, List<String>> e() {
        return this.f29207a.e();
    }

    @Override // da.l
    public long g(p pVar) throws IOException {
        this.f29209c = pVar.f29227a;
        this.f29210d = Collections.emptyMap();
        long g10 = this.f29207a.g(pVar);
        this.f29209c = (Uri) ea.a.e(o());
        this.f29210d = e();
        return g10;
    }

    @Override // da.l
    public void l(m0 m0Var) {
        ea.a.e(m0Var);
        this.f29207a.l(m0Var);
    }

    @Override // da.l
    public Uri o() {
        return this.f29207a.o();
    }

    public long q() {
        return this.f29208b;
    }

    public Uri r() {
        return this.f29209c;
    }

    public Map<String, List<String>> s() {
        return this.f29210d;
    }

    public void t() {
        this.f29208b = 0L;
    }
}
