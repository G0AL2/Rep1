package tb;

/* compiled from: Lazy.java */
/* loaded from: classes3.dex */
public class w<T> implements sc.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f37307c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f37308a = f37307c;

    /* renamed from: b  reason: collision with root package name */
    private volatile sc.b<T> f37309b;

    public w(sc.b<T> bVar) {
        this.f37309b = bVar;
    }

    @Override // sc.b
    public T get() {
        T t10 = (T) this.f37308a;
        Object obj = f37307c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f37308a;
                if (t10 == obj) {
                    t10 = this.f37309b.get();
                    this.f37308a = t10;
                    this.f37309b = null;
                }
            }
        }
        return t10;
    }
}
