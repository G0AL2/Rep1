package y3;

/* compiled from: Suppliers.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final n<Boolean> f39267a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Suppliers.java */
    /* loaded from: classes.dex */
    static class a<T> implements n<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f39268a;

        a(Object obj) {
            this.f39268a = obj;
        }

        @Override // y3.n
        public T get() {
            return (T) this.f39268a;
        }
    }

    /* compiled from: Suppliers.java */
    /* loaded from: classes.dex */
    static class b implements n<Boolean> {
        b() {
        }

        @Override // y3.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Suppliers.java */
    /* loaded from: classes.dex */
    static class c implements n<Boolean> {
        c() {
        }

        @Override // y3.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    static {
        new b();
        f39267a = new c();
    }

    public static <T> n<T> a(T t10) {
        return new a(t10);
    }
}
