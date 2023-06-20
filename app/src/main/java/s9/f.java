package s9;

import java.util.Collections;
import java.util.List;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes2.dex */
final class f implements r9.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<r9.b> f36907a;

    public f(List<r9.b> list) {
        this.f36907a = list;
    }

    @Override // r9.f
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        return j10 >= 0 ? this.f36907a : Collections.emptyList();
    }

    @Override // r9.f
    public long c(int i10) {
        ea.a.a(i10 == 0);
        return 0L;
    }

    @Override // r9.f
    public int f() {
        return 1;
    }
}
