package k9;

import com.google.android.gms.common.api.Api;
import j8.p1;
import java.io.IOException;
import p8.a0;

/* compiled from: SingleSampleMediaChunk.java */
/* loaded from: classes2.dex */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f33438o;

    /* renamed from: p  reason: collision with root package name */
    private final p1 f33439p;

    /* renamed from: q  reason: collision with root package name */
    private long f33440q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f33441r;

    public p(da.l lVar, da.p pVar, p1 p1Var, int i10, Object obj, long j10, long j11, long j12, int i11, p1 p1Var2) {
        super(lVar, pVar, p1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f33438o = i11;
        this.f33439p = p1Var2;
    }

    @Override // da.e0.e
    public void b() {
    }

    @Override // k9.n
    public boolean g() {
        return this.f33441r;
    }

    @Override // da.e0.e
    public void load() throws IOException {
        c i10 = i();
        i10.b(0L);
        a0 f10 = i10.f(0, this.f33438o);
        f10.d(this.f33439p);
        try {
            long g10 = this.f33393i.g(this.f33386b.e(this.f33440q));
            if (g10 != -1) {
                g10 += this.f33440q;
            }
            p8.f fVar = new p8.f(this.f33393i, this.f33440q, g10);
            for (int i11 = 0; i11 != -1; i11 = f10.c(fVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true)) {
                this.f33440q += i11;
            }
            f10.e(this.f33391g, 1, (int) this.f33440q, 0, null);
            da.o.a(this.f33393i);
            this.f33441r = true;
        } catch (Throwable th) {
            da.o.a(this.f33393i);
            throw th;
        }
    }
}
