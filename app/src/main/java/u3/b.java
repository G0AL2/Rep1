package u3;

import u3.d;

/* compiled from: DefaultEntryEvictionComparatorSupplier.java */
/* loaded from: classes.dex */
public class b implements h {

    /* compiled from: DefaultEntryEvictionComparatorSupplier.java */
    /* loaded from: classes.dex */
    class a implements g {
        a(b bVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d.a aVar, d.a aVar2) {
            long a10 = aVar.a();
            long a11 = aVar2.a();
            if (a10 < a11) {
                return -1;
            }
            return a11 == a10 ? 0 : 1;
        }
    }

    @Override // u3.h
    public g get() {
        return new a(this);
    }
}
