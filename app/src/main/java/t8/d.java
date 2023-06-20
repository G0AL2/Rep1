package t8;

import p8.a0;
import p8.k;
import p8.x;
import p8.y;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes2.dex */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    private final long f37179a;

    /* renamed from: b  reason: collision with root package name */
    private final k f37180b;

    /* compiled from: StartOffsetExtractorOutput.java */
    /* loaded from: classes2.dex */
    class a implements x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f37181a;

        a(x xVar) {
            this.f37181a = xVar;
        }

        @Override // p8.x
        public x.a d(long j10) {
            x.a d10 = this.f37181a.d(j10);
            y yVar = d10.f35702a;
            y yVar2 = new y(yVar.f35707a, yVar.f35708b + d.this.f37179a);
            y yVar3 = d10.f35703b;
            return new x.a(yVar2, new y(yVar3.f35707a, yVar3.f35708b + d.this.f37179a));
        }

        @Override // p8.x
        public boolean f() {
            return this.f37181a.f();
        }

        @Override // p8.x
        public long i() {
            return this.f37181a.i();
        }
    }

    public d(long j10, k kVar) {
        this.f37179a = j10;
        this.f37180b = kVar;
    }

    @Override // p8.k
    public a0 f(int i10, int i11) {
        return this.f37180b.f(i10, i11);
    }

    @Override // p8.k
    public void n(x xVar) {
        this.f37180b.n(new a(xVar));
    }

    @Override // p8.k
    public void r() {
        this.f37180b.r();
    }
}
