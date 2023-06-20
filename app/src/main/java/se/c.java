package se;

import qe.g;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
public final class c extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36992e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final c f36993f = new c(1, 0);

    /* compiled from: Ranges.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f36993f;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // se.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (e() != cVar.e() || f() != cVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // se.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // se.a
    public boolean isEmpty() {
        return e() > f();
    }

    public boolean j(int i10) {
        return e() <= i10 && i10 <= f();
    }

    public Integer k() {
        return Integer.valueOf(f());
    }

    public Integer l() {
        return Integer.valueOf(e());
    }

    @Override // se.a
    public String toString() {
        return e() + ".." + f();
    }
}
