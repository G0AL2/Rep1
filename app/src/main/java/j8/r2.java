package j8;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    private final b f32775a;

    /* renamed from: b  reason: collision with root package name */
    private final a f32776b;

    /* renamed from: c  reason: collision with root package name */
    private final ea.c f32777c;

    /* renamed from: d  reason: collision with root package name */
    private final j3 f32778d;

    /* renamed from: e  reason: collision with root package name */
    private int f32779e;

    /* renamed from: f  reason: collision with root package name */
    private Object f32780f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f32781g;

    /* renamed from: h  reason: collision with root package name */
    private int f32782h;

    /* renamed from: i  reason: collision with root package name */
    private long f32783i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f32784j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32785k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32786l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f32787m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f32788n;

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(r2 r2Var);
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes2.dex */
    public interface b {
        void k(int i10, Object obj) throws n;
    }

    public r2(a aVar, b bVar, j3 j3Var, int i10, ea.c cVar, Looper looper) {
        this.f32776b = aVar;
        this.f32775a = bVar;
        this.f32778d = j3Var;
        this.f32781g = looper;
        this.f32777c = cVar;
        this.f32782h = i10;
    }

    public synchronized boolean a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        ea.a.f(this.f32785k);
        ea.a.f(this.f32781g.getThread() != Thread.currentThread());
        long elapsedRealtime = this.f32777c.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f32787m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f32777c.c();
            wait(j10);
            j10 = elapsedRealtime - this.f32777c.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f32786l;
    }

    public boolean b() {
        return this.f32784j;
    }

    public Looper c() {
        return this.f32781g;
    }

    public int d() {
        return this.f32782h;
    }

    public Object e() {
        return this.f32780f;
    }

    public long f() {
        return this.f32783i;
    }

    public b g() {
        return this.f32775a;
    }

    public j3 h() {
        return this.f32778d;
    }

    public int i() {
        return this.f32779e;
    }

    public synchronized boolean j() {
        return this.f32788n;
    }

    public synchronized void k(boolean z10) {
        this.f32786l = z10 | this.f32786l;
        this.f32787m = true;
        notifyAll();
    }

    public r2 l() {
        ea.a.f(!this.f32785k);
        if (this.f32783i == -9223372036854775807L) {
            ea.a.a(this.f32784j);
        }
        this.f32785k = true;
        this.f32776b.a(this);
        return this;
    }

    public r2 m(Object obj) {
        ea.a.f(!this.f32785k);
        this.f32780f = obj;
        return this;
    }

    public r2 n(int i10) {
        ea.a.f(!this.f32785k);
        this.f32779e = i10;
        return this;
    }
}
