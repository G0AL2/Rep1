package g4;

/* compiled from: TriState.java */
/* loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    /* compiled from: TriState.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30595a;

        static {
            int[] iArr = new int[e.values().length];
            f30595a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30595a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30595a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e h(boolean z10) {
        return z10 ? YES : NO;
    }

    public boolean f() {
        int i10 = a.f30595a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unrecognized TriState value: " + this);
                }
                throw new IllegalStateException("No boolean equivalent for UNSET");
            }
            return false;
        }
        return true;
    }

    public boolean g() {
        return this != UNSET;
    }
}
