package ve;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* loaded from: classes3.dex */
public final class e implements ue.d<se.c> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f38083a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38084b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38085c;

    /* renamed from: d  reason: collision with root package name */
    private final pe.p<CharSequence, Integer, ee.m<Integer, Integer>> f38086d;

    /* compiled from: Strings.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<se.c>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private int f38087a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f38088b;

        /* renamed from: c  reason: collision with root package name */
        private int f38089c;

        /* renamed from: d  reason: collision with root package name */
        private se.c f38090d;

        /* renamed from: e  reason: collision with root package name */
        private int f38091e;

        a() {
            int f10;
            f10 = se.f.f(e.this.f38084b, 0, e.this.f38083a.length());
            this.f38088b = f10;
            this.f38089c = f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f38092f.f38085c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.f38089c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f38087a = r1
                r0 = 0
                r6.f38090d = r0
                goto L9e
            Lc:
                ve.e r0 = ve.e.this
                int r0 = ve.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f38091e
                int r0 = r0 + r3
                r6.f38091e = r0
                ve.e r4 = ve.e.this
                int r4 = ve.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f38089c
                ve.e r4 = ve.e.this
                java.lang.CharSequence r4 = ve.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                se.c r0 = new se.c
                int r1 = r6.f38088b
                ve.e r4 = ve.e.this
                java.lang.CharSequence r4 = ve.e.c(r4)
                int r4 = ve.q.I(r4)
                r0.<init>(r1, r4)
                r6.f38090d = r0
                r6.f38089c = r2
                goto L9c
            L47:
                ve.e r0 = ve.e.this
                pe.p r0 = ve.e.b(r0)
                ve.e r4 = ve.e.this
                java.lang.CharSequence r4 = ve.e.c(r4)
                int r5 = r6.f38089c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                ee.m r0 = (ee.m) r0
                if (r0 != 0) goto L77
                se.c r0 = new se.c
                int r1 = r6.f38088b
                ve.e r4 = ve.e.this
                java.lang.CharSequence r4 = ve.e.c(r4)
                int r4 = ve.q.I(r4)
                r0.<init>(r1, r4)
                r6.f38090d = r0
                r6.f38089c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f38088b
                se.c r4 = se.d.i(r4, r2)
                r6.f38090d = r4
                int r2 = r2 + r0
                r6.f38088b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f38089c = r2
            L9c:
                r6.f38087a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve.e.a.c():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public se.c next() {
            if (this.f38087a == -1) {
                c();
            }
            if (this.f38087a != 0) {
                se.c cVar = this.f38090d;
                qe.k.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f38090d = null;
                this.f38087a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38087a == -1) {
                c();
            }
            return this.f38087a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i10, int i11, pe.p<? super CharSequence, ? super Integer, ee.m<Integer, Integer>> pVar) {
        qe.k.f(charSequence, "input");
        qe.k.f(pVar, "getNextMatch");
        this.f38083a = charSequence;
        this.f38084b = i10;
        this.f38085c = i11;
        this.f38086d = pVar;
    }

    @Override // ue.d
    public Iterator<se.c> iterator() {
        return new a();
    }
}
