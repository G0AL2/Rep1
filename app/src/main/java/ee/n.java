package ee;

import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class n<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29807a = new a(null);

    /* compiled from: Result.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f29808a;

        public b(Throwable th) {
            qe.k.f(th, "exception");
            this.f29808a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && qe.k.a(this.f29808a, ((b) obj).f29808a);
        }

        public int hashCode() {
            return this.f29808a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f29808a + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f29808a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
