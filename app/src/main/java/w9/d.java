package w9;

import ea.n0;
import java.util.Collections;
import java.util.List;
import r9.f;

/* compiled from: SsaSubtitle.java */
/* loaded from: classes2.dex */
final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<List<r9.b>> f38522a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Long> f38523b;

    public d(List<List<r9.b>> list, List<Long> list2) {
        this.f38522a = list;
        this.f38523b = list2;
    }

    @Override // r9.f
    public int a(long j10) {
        int d10 = n0.d(this.f38523b, Long.valueOf(j10), false, false);
        if (d10 < this.f38523b.size()) {
            return d10;
        }
        return -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        int g10 = n0.g(this.f38523b, Long.valueOf(j10), true, false);
        if (g10 == -1) {
            return Collections.emptyList();
        }
        return this.f38522a.get(g10);
    }

    @Override // r9.f
    public long c(int i10) {
        ea.a.a(i10 >= 0);
        ea.a.a(i10 < this.f38523b.size());
        return this.f38523b.get(i10).longValue();
    }

    @Override // r9.f
    public int f() {
        return this.f38523b.size();
    }
}
