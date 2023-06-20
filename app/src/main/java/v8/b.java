package v8;

import ea.n0;
import ea.s;
import p8.x;
import p8.y;

/* compiled from: IndexSeeker.java */
/* loaded from: classes2.dex */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f37971a;

    /* renamed from: b  reason: collision with root package name */
    private final s f37972b;

    /* renamed from: c  reason: collision with root package name */
    private final s f37973c;

    /* renamed from: d  reason: collision with root package name */
    private long f37974d;

    public b(long j10, long j11, long j12) {
        this.f37974d = j10;
        this.f37971a = j12;
        s sVar = new s();
        this.f37972b = sVar;
        s sVar2 = new s();
        this.f37973c = sVar2;
        sVar.a(0L);
        sVar2.a(j11);
    }

    public boolean a(long j10) {
        s sVar = this.f37972b;
        return j10 - sVar.b(sVar.c() - 1) < 100000;
    }

    @Override // v8.g
    public long b(long j10) {
        return this.f37972b.b(n0.f(this.f37973c, j10, true, true));
    }

    public void c(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f37972b.a(j10);
        this.f37973c.a(j11);
    }

    @Override // p8.x
    public x.a d(long j10) {
        int f10 = n0.f(this.f37972b, j10, true, true);
        y yVar = new y(this.f37972b.b(f10), this.f37973c.b(f10));
        if (yVar.f35707a != j10 && f10 != this.f37972b.c() - 1) {
            int i10 = f10 + 1;
            return new x.a(yVar, new y(this.f37972b.b(i10), this.f37973c.b(i10)));
        }
        return new x.a(yVar);
    }

    @Override // v8.g
    public long e() {
        return this.f37971a;
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(long j10) {
        this.f37974d = j10;
    }

    @Override // p8.x
    public long i() {
        return this.f37974d;
    }
}
