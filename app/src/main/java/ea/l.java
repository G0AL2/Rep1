package ea;

import android.util.SparseBooleanArray;

/* compiled from: FlagSet.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f29697a;

    /* compiled from: FlagSet.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f29698a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f29699b;

        public b a(int i10) {
            ea.a.f(!this.f29699b);
            this.f29698a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.d(); i10++) {
                a(lVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            ea.a.f(!this.f29699b);
            this.f29699b = true;
            return new l(this.f29698a);
        }
    }

    public boolean a(int i10) {
        return this.f29697a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        ea.a.c(i10, 0, d());
        return this.f29697a.keyAt(i10);
    }

    public int d() {
        return this.f29697a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (n0.f29709a < 24) {
                if (d() != lVar.d()) {
                    return false;
                }
                for (int i10 = 0; i10 < d(); i10++) {
                    if (c(i10) != lVar.c(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return this.f29697a.equals(lVar.f29697a);
        }
        return false;
    }

    public int hashCode() {
        if (n0.f29709a < 24) {
            int d10 = d();
            for (int i10 = 0; i10 < d(); i10++) {
                d10 = (d10 * 31) + c(i10);
            }
            return d10;
        }
        return this.f29697a.hashCode();
    }

    private l(SparseBooleanArray sparseBooleanArray) {
        this.f29697a = sparseBooleanArray;
    }
}
