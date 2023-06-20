package t8;

import p8.j;
import p8.s;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes2.dex */
final class c extends s {

    /* renamed from: b  reason: collision with root package name */
    private final long f37178b;

    public c(j jVar, long j10) {
        super(jVar);
        ea.a.a(jVar.getPosition() >= j10);
        this.f37178b = j10;
    }

    @Override // p8.s, p8.j
    public long b() {
        return super.b() - this.f37178b;
    }

    @Override // p8.s, p8.j
    public long getPosition() {
        return super.getPosition() - this.f37178b;
    }

    @Override // p8.s, p8.j
    public long i() {
        return super.i() - this.f37178b;
    }
}
