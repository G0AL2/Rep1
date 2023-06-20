package y9;

import ea.n0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes2.dex */
final class h implements r9.f {

    /* renamed from: a  reason: collision with root package name */
    private final d f39355a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f39356b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f39357c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f39358d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f39359e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f39355a = dVar;
        this.f39358d = map2;
        this.f39359e = map3;
        this.f39357c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f39356b = dVar.j();
    }

    @Override // r9.f
    public int a(long j10) {
        int e10 = n0.e(this.f39356b, j10, false, false);
        if (e10 < this.f39356b.length) {
            return e10;
        }
        return -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        return this.f39355a.h(j10, this.f39357c, this.f39358d, this.f39359e);
    }

    @Override // r9.f
    public long c(int i10) {
        return this.f39356b[i10];
    }

    @Override // r9.f
    public int f() {
        return this.f39356b.length;
    }
}
