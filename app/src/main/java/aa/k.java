package aa;

import ea.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes2.dex */
final class k implements r9.f {

    /* renamed from: a */
    private final List<e> f215a;

    /* renamed from: b */
    private final long[] f216b;

    /* renamed from: c */
    private final long[] f217c;

    public k(List<e> list) {
        this.f215a = Collections.unmodifiableList(new ArrayList(list));
        this.f216b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f216b;
            jArr[i11] = eVar.f184b;
            jArr[i11 + 1] = eVar.f185c;
        }
        long[] jArr2 = this.f216b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f217c = copyOf;
        Arrays.sort(copyOf);
    }

    public static /* synthetic */ int d(e eVar, e eVar2) {
        return e(eVar, eVar2);
    }

    public static /* synthetic */ int e(e eVar, e eVar2) {
        return Long.compare(eVar.f184b, eVar2.f184b);
    }

    @Override // r9.f
    public int a(long j10) {
        int e10 = n0.e(this.f217c, j10, false, false);
        if (e10 < this.f217c.length) {
            return e10;
        }
        return -1;
    }

    @Override // r9.f
    public List<r9.b> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f215a.size(); i10++) {
            long[] jArr = this.f216b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f215a.get(i10);
                r9.b bVar = eVar.f183a;
                if (bVar.f36487e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: aa.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.d((e) obj, (e) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f183a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // r9.f
    public long c(int i10) {
        ea.a.a(i10 >= 0);
        ea.a.a(i10 < this.f217c.length);
        return this.f217c[i10];
    }

    @Override // r9.f
    public int f() {
        return this.f217c.length;
    }
}
