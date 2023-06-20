package n1;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ee.u;
import fe.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: ConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class h<T> {

    /* renamed from: a */
    private final q1.c f34608a;

    /* renamed from: b */
    private final Context f34609b;

    /* renamed from: c */
    private final Object f34610c;

    /* renamed from: d */
    private final LinkedHashSet<l1.a<T>> f34611d;

    /* renamed from: e */
    private T f34612e;

    public h(Context context, q1.c cVar) {
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        this.f34608a = cVar;
        Context applicationContext = context.getApplicationContext();
        qe.k.e(applicationContext, "context.applicationContext");
        this.f34609b = applicationContext;
        this.f34610c = new Object();
        this.f34611d = new LinkedHashSet<>();
    }

    public static /* synthetic */ void a(List list, h hVar) {
        b(list, hVar);
    }

    public static final void b(List list, h hVar) {
        qe.k.f(list, "$listenersList");
        qe.k.f(hVar, "this$0");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((l1.a) it.next()).a(hVar.f34612e);
        }
    }

    public final void c(l1.a<T> aVar) {
        String str;
        qe.k.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f34610c) {
            if (this.f34611d.add(aVar)) {
                if (this.f34611d.size() == 1) {
                    this.f34612e = e();
                    androidx.work.l e10 = androidx.work.l.e();
                    str = i.f34613a;
                    e10.a(str, getClass().getSimpleName() + ": initial state = " + this.f34612e);
                    h();
                }
                aVar.a(this.f34612e);
            }
            u uVar = u.f29813a;
        }
    }

    public final Context d() {
        return this.f34609b;
    }

    public abstract T e();

    public final void f(l1.a<T> aVar) {
        qe.k.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f34610c) {
            if (this.f34611d.remove(aVar) && this.f34611d.isEmpty()) {
                i();
            }
            u uVar = u.f29813a;
        }
    }

    public final void g(T t10) {
        final List N;
        synchronized (this.f34610c) {
            T t11 = this.f34612e;
            if (t11 == null || !qe.k.a(t11, t10)) {
                this.f34612e = t10;
                N = x.N(this.f34611d);
                this.f34608a.a().execute(new Runnable() { // from class: n1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a(N, this);
                    }
                });
                u uVar = u.f29813a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
