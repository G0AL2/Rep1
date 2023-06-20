package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import n1.o;
import o1.m;
import o1.u;
import o1.x;
import p1.a0;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class f implements l1.c, a0.a {

    /* renamed from: m */
    private static final String f4498m = l.i("DelayMetCommandHandler");

    /* renamed from: a */
    private final Context f4499a;

    /* renamed from: b */
    private final int f4500b;

    /* renamed from: c */
    private final m f4501c;

    /* renamed from: d */
    private final g f4502d;

    /* renamed from: e */
    private final l1.e f4503e;

    /* renamed from: f */
    private final Object f4504f;

    /* renamed from: g */
    private int f4505g;

    /* renamed from: h */
    private final Executor f4506h;

    /* renamed from: i */
    private final Executor f4507i;

    /* renamed from: j */
    private PowerManager.WakeLock f4508j;

    /* renamed from: k */
    private boolean f4509k;

    /* renamed from: l */
    private final v f4510l;

    public f(Context context, int i10, g gVar, v vVar) {
        this.f4499a = context;
        this.f4500b = i10;
        this.f4502d = gVar;
        this.f4501c = vVar.a();
        this.f4510l = vVar;
        o r10 = gVar.g().r();
        this.f4506h = gVar.f().b();
        this.f4507i = gVar.f().a();
        this.f4503e = new l1.e(r10, this);
        this.f4509k = false;
        this.f4505g = 0;
        this.f4504f = new Object();
    }

    public static /* synthetic */ void c(f fVar) {
        fVar.i();
    }

    private void e() {
        synchronized (this.f4504f) {
            this.f4503e.reset();
            this.f4502d.h().b(this.f4501c);
            PowerManager.WakeLock wakeLock = this.f4508j;
            if (wakeLock != null && wakeLock.isHeld()) {
                l e10 = l.e();
                String str = f4498m;
                e10.a(str, "Releasing wakelock " + this.f4508j + "for WorkSpec " + this.f4501c);
                this.f4508j.release();
            }
        }
    }

    public void i() {
        if (this.f4505g == 0) {
            this.f4505g = 1;
            l e10 = l.e();
            String str = f4498m;
            e10.a(str, "onAllConstraintsMet for " + this.f4501c);
            if (this.f4502d.e().p(this.f4510l)) {
                this.f4502d.h().a(this.f4501c, TTAdConstant.AD_MAX_EVENT_TIME, this);
                return;
            } else {
                e();
                return;
            }
        }
        l e11 = l.e();
        String str2 = f4498m;
        e11.a(str2, "Already started work for " + this.f4501c);
    }

    public void j() {
        String b10 = this.f4501c.b();
        if (this.f4505g < 2) {
            this.f4505g = 2;
            l e10 = l.e();
            String str = f4498m;
            e10.a(str, "Stopping work for WorkSpec " + b10);
            this.f4507i.execute(new g.b(this.f4502d, b.h(this.f4499a, this.f4501c), this.f4500b));
            if (this.f4502d.e().k(this.f4501c.b())) {
                l e11 = l.e();
                e11.a(str, "WorkSpec " + b10 + " needs to be rescheduled");
                this.f4507i.execute(new g.b(this.f4502d, b.f(this.f4499a, this.f4501c), this.f4500b));
                return;
            }
            l e12 = l.e();
            e12.a(str, "Processor does not have WorkSpec " + b10 + ". No need to reschedule");
            return;
        }
        l e13 = l.e();
        String str2 = f4498m;
        e13.a(str2, "Already stopped work for " + b10);
    }

    @Override // p1.a0.a
    public void a(m mVar) {
        l e10 = l.e();
        String str = f4498m;
        e10.a(str, "Exceeded time limits on execution for " + mVar);
        this.f4506h.execute(new e(this));
    }

    @Override // l1.c
    public void b(List<u> list) {
        this.f4506h.execute(new e(this));
    }

    @Override // l1.c
    public void f(List<u> list) {
        for (u uVar : list) {
            if (x.a(uVar).equals(this.f4501c)) {
                this.f4506h.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.c(f.this);
                    }
                });
                return;
            }
        }
    }

    public void g() {
        String b10 = this.f4501c.b();
        Context context = this.f4499a;
        this.f4508j = p1.u.b(context, b10 + " (" + this.f4500b + ")");
        l e10 = l.e();
        String str = f4498m;
        e10.a(str, "Acquiring wakelock " + this.f4508j + "for WorkSpec " + b10);
        this.f4508j.acquire();
        u h10 = this.f4502d.g().s().h().h(b10);
        if (h10 == null) {
            this.f4506h.execute(new e(this));
            return;
        }
        boolean h11 = h10.h();
        this.f4509k = h11;
        if (!h11) {
            l e11 = l.e();
            e11.a(str, "No constraints for " + b10);
            f(Collections.singletonList(h10));
            return;
        }
        this.f4503e.a(Collections.singletonList(h10));
    }

    public void h(boolean z10) {
        l e10 = l.e();
        String str = f4498m;
        e10.a(str, "onExecuted " + this.f4501c + ", " + z10);
        e();
        if (z10) {
            this.f4507i.execute(new g.b(this.f4502d, b.f(this.f4499a, this.f4501c), this.f4500b));
        }
        if (this.f4509k) {
            this.f4507i.execute(new g.b(this.f4502d, b.a(this.f4499a), this.f4500b));
        }
    }
}
