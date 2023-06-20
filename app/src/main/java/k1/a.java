package k1;

import androidx.work.l;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;
import o1.u;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f33128d = l.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f33129a;

    /* renamed from: b  reason: collision with root package name */
    private final s f33130b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f33131c = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: k1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0426a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f33132a;

        RunnableC0426a(u uVar) {
            this.f33132a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l e10 = l.e();
            String str = a.f33128d;
            e10.a(str, "Scheduling work " + this.f33132a.f34905a);
            a.this.f33129a.a(this.f33132a);
        }
    }

    public a(b bVar, s sVar) {
        this.f33129a = bVar;
        this.f33130b = sVar;
    }

    public void a(u uVar) {
        Runnable remove = this.f33131c.remove(uVar.f34905a);
        if (remove != null) {
            this.f33130b.a(remove);
        }
        RunnableC0426a runnableC0426a = new RunnableC0426a(uVar);
        this.f33131c.put(uVar.f34905a, runnableC0426a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f33130b.b(uVar.c() - currentTimeMillis, runnableC0426a);
    }

    public void b(String str) {
        Runnable remove = this.f33131c.remove(str);
        if (remove != null) {
            this.f33130b.a(remove);
        }
    }
}
