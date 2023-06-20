package ms.bd.o.Pgl;

/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: c  reason: collision with root package name */
    private static volatile y0 f34591c;

    /* renamed from: a  reason: collision with root package name */
    private int f34592a = 0;

    /* renamed from: b  reason: collision with root package name */
    private Throwable f34593b = null;

    private y0() {
    }

    public static y0 a() {
        if (f34591c == null) {
            synchronized (y0.class) {
                if (f34591c == null) {
                    f34591c = new y0();
                }
            }
        }
        return f34591c;
    }

    public synchronized Throwable b() {
        return this.f34593b;
    }

    public synchronized void c() {
        if (this.f34593b == null) {
            int i10 = this.f34592a;
            this.f34592a = i10 + 1;
            if (i10 >= 30) {
                this.f34592a = 0;
                this.f34593b = new Throwable();
            }
        }
    }
}
