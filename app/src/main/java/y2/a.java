package y2;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import y2.i;
import y2.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsTask.java */
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicLong f39128n = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    protected volatile z2.a f39129a;

    /* renamed from: b  reason: collision with root package name */
    protected final a3.c f39130b;

    /* renamed from: e  reason: collision with root package name */
    protected c3.a f39133e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile List<i.b> f39134f;

    /* renamed from: g  reason: collision with root package name */
    protected volatile String f39135g;

    /* renamed from: h  reason: collision with root package name */
    protected volatile String f39136h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile i f39137i;

    /* renamed from: j  reason: collision with root package name */
    protected volatile k f39138j;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicInteger f39140l;

    /* renamed from: m  reason: collision with root package name */
    private int f39141m;

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicInteger f39131c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicLong f39132d = new AtomicLong();

    /* renamed from: k  reason: collision with root package name */
    protected volatile boolean f39139k = false;

    /* compiled from: AbsTask.java */
    /* renamed from: y2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0542a implements Runnable {
        RunnableC0542a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            c3.a aVar2 = aVar.f39133e;
            if (aVar2 != null) {
                aVar2.a(aVar.f39138j, a.this.f39141m);
            }
        }
    }

    public a(z2.a aVar, a3.c cVar) {
        f39128n.incrementAndGet();
        this.f39140l = new AtomicInteger(0);
        this.f39141m = -1;
        this.f39129a = aVar;
        this.f39130b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d3.a b(k.a aVar, int i10, int i11, String str) throws IOException {
        d3.b b10 = d3.c.a().b();
        d3.e eVar = new d3.e();
        HashMap hashMap = new HashMap();
        eVar.f29053a = aVar.f39256a;
        VersionInfo.GIT_BRANCH.equalsIgnoreCase(str);
        List<i.b> list = this.f39134f;
        if (list != null && !list.isEmpty()) {
            for (i.b bVar : list) {
                if (!"Range".equalsIgnoreCase(bVar.f39240a) && !"Connection".equalsIgnoreCase(bVar.f39240a) && !"Proxy-Connection".equalsIgnoreCase(bVar.f39240a) && !"Host".equalsIgnoreCase(bVar.f39240a)) {
                    hashMap.put(bVar.f39240a, bVar.f39241b);
                }
            }
        }
        String e10 = f3.a.e(i10, i11);
        if (e10 != null) {
            hashMap.put("Range", e10);
        }
        if (e.f39194h) {
            hashMap.put("Cache-Control", "no-cache");
        }
        d o10 = d.o();
        f e11 = f.e();
        boolean z10 = this.f39137i == null;
        if (z10) {
            o10.c();
        } else {
            e11.k();
        }
        if (z10) {
            o10.m();
        } else {
            e11.m();
        }
        eVar.f29054b = hashMap;
        if (this.f39139k) {
            this.f39139k = false;
            return null;
        }
        return b10.a(eVar);
    }

    public void c() {
        this.f39140l.compareAndSet(0, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i10, int i11) {
        if (i10 <= 0 || i11 < 0) {
            return;
        }
        int i12 = e.f39195i;
        int j10 = j();
        if (i12 == 1 || (i12 == 2 && j10 == 1)) {
            int i13 = (int) ((i11 / i10) * 100.0f);
            if (i13 > 100) {
                i13 = 100;
            }
            synchronized (this) {
                if (i13 <= this.f39141m) {
                    return;
                }
                this.f39141m = i13;
                f3.a.o(new RunnableC0542a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Boolean bool, String str, Throwable th) {
    }

    public boolean f() {
        return this.f39140l.get() == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        this.f39140l.compareAndSet(0, 2);
    }

    public boolean h() {
        return this.f39140l.get() == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() throws b3.a {
        if (f()) {
            throw new b3.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j() {
        if (this.f39137i != null) {
            return this.f39137i.f39233c.f39234a;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k() {
        return j() == 1;
    }
}
