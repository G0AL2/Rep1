package k1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.impl.t;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.l;
import androidx.work.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l1.c;
import l1.d;
import n1.o;
import o1.m;
import o1.u;
import o1.x;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public class b implements t, c, e {

    /* renamed from: j  reason: collision with root package name */
    private static final String f33134j = l.i("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f33135a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f33136b;

    /* renamed from: c  reason: collision with root package name */
    private final d f33137c;

    /* renamed from: e  reason: collision with root package name */
    private a f33139e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33140f;

    /* renamed from: i  reason: collision with root package name */
    Boolean f33143i;

    /* renamed from: d  reason: collision with root package name */
    private final Set<u> f33138d = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private final w f33142h = new w();

    /* renamed from: g  reason: collision with root package name */
    private final Object f33141g = new Object();

    public b(Context context, androidx.work.b bVar, o oVar, e0 e0Var) {
        this.f33135a = context;
        this.f33136b = e0Var;
        this.f33137c = new l1.e(oVar, this);
        this.f33139e = new a(this, bVar.k());
    }

    private void g() {
        this.f33143i = Boolean.valueOf(p1.o.b(this.f33135a, this.f33136b.l()));
    }

    private void h() {
        if (this.f33140f) {
            return;
        }
        this.f33136b.p().g(this);
        this.f33140f = true;
    }

    private void i(m mVar) {
        synchronized (this.f33141g) {
            Iterator<u> it = this.f33138d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u next = it.next();
                if (x.a(next).equals(mVar)) {
                    l e10 = l.e();
                    String str = f33134j;
                    e10.a(str, "Stopping tracking for " + mVar);
                    this.f33138d.remove(next);
                    this.f33137c.a(this.f33138d);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.t
    public void a(u... uVarArr) {
        if (this.f33143i == null) {
            g();
        }
        if (!this.f33143i.booleanValue()) {
            l.e().f(f33134j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f33142h.a(x.a(uVar))) {
                long c10 = uVar.c();
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar.f34906b == u.a.ENQUEUED) {
                    if (currentTimeMillis < c10) {
                        a aVar = this.f33139e;
                        if (aVar != null) {
                            aVar.a(uVar);
                        }
                    } else if (uVar.h()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 23 && uVar.f34914j.h()) {
                            l.e().a(f33134j, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (i10 >= 24 && uVar.f34914j.e()) {
                            l.e().a(f33134j, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f34905a);
                        }
                    } else if (!this.f33142h.a(x.a(uVar))) {
                        l.e().a(f33134j, "Starting work for " + uVar.f34905a);
                        this.f33136b.y(this.f33142h.e(uVar));
                    }
                }
            }
        }
        synchronized (this.f33141g) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                l.e().a(f33134j, "Starting tracking for " + join);
                this.f33138d.addAll(hashSet);
                this.f33137c.a(this.f33138d);
            }
        }
    }

    @Override // l1.c
    public void b(List<o1.u> list) {
        for (o1.u uVar : list) {
            m a10 = x.a(uVar);
            l e10 = l.e();
            String str = f33134j;
            e10.a(str, "Constraints not met: Cancelling work ID " + a10);
            v b10 = this.f33142h.b(a10);
            if (b10 != null) {
                this.f33136b.B(b10);
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        if (this.f33143i == null) {
            g();
        }
        if (!this.f33143i.booleanValue()) {
            l.e().f(f33134j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        l e10 = l.e();
        String str2 = f33134j;
        e10.a(str2, "Cancelling work ID " + str);
        a aVar = this.f33139e;
        if (aVar != null) {
            aVar.b(str);
        }
        for (v vVar : this.f33142h.c(str)) {
            this.f33136b.B(vVar);
        }
    }

    @Override // androidx.work.impl.e
    public void d(m mVar, boolean z10) {
        this.f33142h.b(mVar);
        i(mVar);
    }

    @Override // androidx.work.impl.t
    public boolean e() {
        return false;
    }

    @Override // l1.c
    public void f(List<o1.u> list) {
        for (o1.u uVar : list) {
            m a10 = x.a(uVar);
            if (!this.f33142h.a(a10)) {
                l e10 = l.e();
                String str = f33134j;
                e10.a(str, "Constraints met: Scheduling work ID " + a10);
                this.f33136b.y(this.f33142h.d(a10));
            }
        }
    }
}
