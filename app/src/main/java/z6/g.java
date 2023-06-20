package z6;

/* compiled from: LayoutAnimationType.java */
/* loaded from: classes.dex */
enum g {
    CREATE,
    UPDATE,
    DELETE;

    /* compiled from: LayoutAnimationType.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40093a;

        static {
            int[] iArr = new int[g.values().length];
            f40093a = iArr;
            try {
                iArr[g.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40093a[g.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40093a[g.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(g gVar) {
        int i10 = a.f40093a[gVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "delete";
                }
                throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + gVar);
            }
            return "update";
        }
        return "create";
    }
}
