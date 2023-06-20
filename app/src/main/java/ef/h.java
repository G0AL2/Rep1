package ef;

import ye.e0;
import ye.x;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes3.dex */
public final class h extends e0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f29831b;

    /* renamed from: c  reason: collision with root package name */
    private final long f29832c;

    /* renamed from: d  reason: collision with root package name */
    private final mf.h f29833d;

    public h(String str, long j10, mf.h hVar) {
        qe.k.f(hVar, "source");
        this.f29831b = str;
        this.f29832c = j10;
        this.f29833d = hVar;
    }

    @Override // ye.e0
    public long e() {
        return this.f29832c;
    }

    @Override // ye.e0
    public x h() {
        String str = this.f29831b;
        if (str != null) {
            return x.f39779f.b(str);
        }
        return null;
    }

    @Override // ye.e0
    public mf.h q() {
        return this.f29833d;
    }
}
