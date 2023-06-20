package q2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f35837a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n<?>> f35838b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f35839c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f35840d;

    /* renamed from: e  reason: collision with root package name */
    private final q2.b f35841e;

    /* renamed from: f  reason: collision with root package name */
    private final h f35842f;

    /* renamed from: g  reason: collision with root package name */
    private final q f35843g;

    /* renamed from: h  reason: collision with root package name */
    private final i[] f35844h;

    /* renamed from: i  reason: collision with root package name */
    private c f35845i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f35846j;

    /* renamed from: k  reason: collision with root package name */
    private final List<a> f35847k;

    /* compiled from: RequestQueue.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(n<?> nVar, int i10);
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(n<T> nVar);
    }

    public o(q2.b bVar, h hVar, int i10, q qVar) {
        this.f35837a = new AtomicInteger();
        this.f35838b = new HashSet();
        this.f35839c = new PriorityBlockingQueue<>();
        this.f35840d = new PriorityBlockingQueue<>();
        this.f35846j = new ArrayList();
        this.f35847k = new ArrayList();
        this.f35841e = bVar;
        this.f35842f = hVar;
        this.f35844h = new i[i10];
        this.f35843g = qVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.J(this);
        synchronized (this.f35838b) {
            this.f35838b.add(nVar);
        }
        nVar.L(d());
        nVar.b("add-to-queue");
        e(nVar, 0);
        b(nVar);
        return nVar;
    }

    <T> void b(n<T> nVar) {
        if (!nVar.M()) {
            f(nVar);
        } else {
            this.f35839c.add(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void c(n<T> nVar) {
        synchronized (this.f35838b) {
            this.f35838b.remove(nVar);
        }
        synchronized (this.f35846j) {
            for (b bVar : this.f35846j) {
                bVar.a(nVar);
            }
        }
        e(nVar, 5);
    }

    public int d() {
        return this.f35837a.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(n<?> nVar, int i10) {
        synchronized (this.f35847k) {
            for (a aVar : this.f35847k) {
                aVar.a(nVar, i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void f(n<T> nVar) {
        this.f35840d.add(nVar);
    }

    public void g() {
        h();
        c cVar = new c(this.f35839c, this.f35840d, this.f35841e, this.f35843g);
        this.f35845i = cVar;
        cVar.start();
        for (int i10 = 0; i10 < this.f35844h.length; i10++) {
            i iVar = new i(this.f35840d, this.f35842f, this.f35841e, this.f35843g);
            this.f35844h[i10] = iVar;
            iVar.start();
        }
    }

    public void h() {
        i[] iVarArr;
        c cVar = this.f35845i;
        if (cVar != null) {
            cVar.d();
        }
        for (i iVar : this.f35844h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }

    public o(q2.b bVar, h hVar, int i10) {
        this(bVar, hVar, i10, new f(new Handler(Looper.getMainLooper())));
    }

    public o(q2.b bVar, h hVar) {
        this(bVar, hVar, 4);
    }
}
