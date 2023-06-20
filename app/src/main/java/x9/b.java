package x9;

import ea.n0;
import java.util.Collections;
import java.util.List;
import r9.f;

/* compiled from: SubripSubtitle.java */
/* loaded from: classes2.dex */
final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final r9.b[] f38768a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f38769b;

    public b(r9.b[] bVarArr, long[] jArr) {
        this.f38768a = bVarArr;
        this.f38769b = jArr;
    }

    @Override // r9.f
    public int a(long j10) {
        int e10 = n0.e(this.f38769b, j10, false, false);
        if (e10 < this.f38769b.length) {
            return e10;
        }
        return -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        int i10 = n0.i(this.f38769b, j10, true, false);
        if (i10 != -1) {
            r9.b[] bVarArr = this.f38768a;
            if (bVarArr[i10] != r9.b.f36481r) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    @Override // r9.f
    public long c(int i10) {
        ea.a.a(i10 >= 0);
        ea.a.a(i10 < this.f38769b.length);
        return this.f38769b[i10];
    }

    @Override // r9.f
    public int f() {
        return this.f38769b.length;
    }
}
