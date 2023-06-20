package g0;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final g0.e f30452a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final g0.e f30453b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final g0.e f30454c;

    /* renamed from: d  reason: collision with root package name */
    public static final g0.e f30455d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f30456b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f30457a;

        private a(boolean z10) {
            this.f30457a = z10;
        }

        @Override // g0.f.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = f.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f30457a) {
                        return 1;
                    }
                } else if (this.f30457a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f30457a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f30458a = new b();

        private b() {
        }

        @Override // g0.f.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = f.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static abstract class d implements g0.e {

        /* renamed from: a  reason: collision with root package name */
        private final c f30459a;

        d(c cVar) {
            this.f30459a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f30459a.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }

        @Override // g0.e
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f30459a == null) {
                    return b();
                }
                return c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f30460b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f30460b = z10;
        }

        @Override // g0.f.d
        protected boolean b() {
            return this.f30460b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0391f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final C0391f f30461b = new C0391f();

        C0391f() {
            super(null);
        }

        @Override // g0.f.d
        protected boolean b() {
            return g.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f30458a;
        f30454c = new e(bVar, false);
        f30455d = new e(bVar, true);
        new e(a.f30456b, false);
        C0391f c0391f = C0391f.f30461b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
