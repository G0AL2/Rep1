package we;

import ie.g;

/* compiled from: CoroutineName.kt */
/* loaded from: classes3.dex */
public final class d0 extends ie.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38594b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38595a;

    /* compiled from: CoroutineName.kt */
    /* loaded from: classes3.dex */
    public static final class a implements g.c<d0> {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d0) && qe.k.a(this.f38595a, ((d0) obj).f38595a);
        }
        return true;
    }

    public final String g0() {
        return this.f38595a;
    }

    public int hashCode() {
        String str = this.f38595a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CoroutineName(" + this.f38595a + ')';
    }
}
