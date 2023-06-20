package z9;

import java.util.Collections;
import java.util.List;
import r9.f;

/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes2.dex */
final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final b f40481b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<r9.b> f40482a;

    public b(r9.b bVar) {
        this.f40482a = Collections.singletonList(bVar);
    }

    @Override // r9.f
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        return j10 >= 0 ? this.f40482a : Collections.emptyList();
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

    private b() {
        this.f40482a = Collections.emptyList();
    }
}
