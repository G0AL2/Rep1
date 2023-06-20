package ea;

/* compiled from: ConditionVariable.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f29667a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29668b;

    public f() {
        this(c.f29651a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f29668b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f29668b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f29668b;
        this.f29668b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f29668b;
    }

    public synchronized boolean e() {
        if (this.f29668b) {
            return false;
        }
        this.f29668b = true;
        notifyAll();
        return true;
    }

    public f(c cVar) {
        this.f29667a = cVar;
    }
}
