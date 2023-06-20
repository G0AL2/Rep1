package d2;

import com.airbnb.lottie.d0;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f28968a;

    /* renamed from: b  reason: collision with root package name */
    private final a f28969b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28970c;

    /* compiled from: MergePaths.java */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public i(String str, a aVar, boolean z10) {
        this.f28968a = str;
        this.f28969b = aVar;
        this.f28970c = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        if (!d0Var.A()) {
            i2.d.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new y1.l(this);
    }

    public a b() {
        return this.f28969b;
    }

    public String c() {
        return this.f28968a;
    }

    public boolean d() {
        return this.f28970c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f28969b + '}';
    }
}
