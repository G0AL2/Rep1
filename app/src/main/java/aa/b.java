package aa;

import java.util.Collections;
import java.util.List;

/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: classes2.dex */
final class b implements r9.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<r9.b> f161a;

    public b(List<r9.b> list) {
        this.f161a = Collections.unmodifiableList(list);
    }

    @Override // r9.f
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        return j10 >= 0 ? this.f161a : Collections.emptyList();
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
