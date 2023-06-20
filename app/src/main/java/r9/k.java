package r9;

import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes2.dex */
public abstract class k extends m8.h implements f {

    /* renamed from: c  reason: collision with root package name */
    private f f36528c;

    /* renamed from: d  reason: collision with root package name */
    private long f36529d;

    @Override // r9.f
    public int a(long j10) {
        return ((f) ea.a.e(this.f36528c)).a(j10 - this.f36529d);
    }

    @Override // r9.f
    public List<b> b(long j10) {
        return ((f) ea.a.e(this.f36528c)).b(j10 - this.f36529d);
    }

    @Override // r9.f
    public long c(int i10) {
        return ((f) ea.a.e(this.f36528c)).c(i10) + this.f36529d;
    }

    @Override // r9.f
    public int f() {
        return ((f) ea.a.e(this.f36528c)).f();
    }

    @Override // m8.a
    public void g() {
        super.g();
        this.f36528c = null;
    }

    public void p(long j10, f fVar, long j11) {
        this.f34296b = j10;
        this.f36528c = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f36529d = j10;
    }
}
