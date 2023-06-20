package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.e0;
import androidx.work.impl.r;
import androidx.work.impl.w;
import androidx.work.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o1.m;
import p1.a0;
import p1.u;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class g implements androidx.work.impl.e {

    /* renamed from: k  reason: collision with root package name */
    static final String f4511k = l.i("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f4512a;

    /* renamed from: b  reason: collision with root package name */
    final q1.c f4513b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f4514c;

    /* renamed from: d  reason: collision with root package name */
    private final r f4515d;

    /* renamed from: e  reason: collision with root package name */
    private final e0 f4516e;

    /* renamed from: f  reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f4517f;

    /* renamed from: g  reason: collision with root package name */
    final List<Intent> f4518g;

    /* renamed from: h  reason: collision with root package name */
    Intent f4519h;

    /* renamed from: i  reason: collision with root package name */
    private c f4520i;

    /* renamed from: j  reason: collision with root package name */
    private w f4521j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor a10;
            d dVar;
            synchronized (g.this.f4518g) {
                g gVar = g.this;
                gVar.f4519h = gVar.f4518g.get(0);
            }
            Intent intent = g.this.f4519h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f4519h.getIntExtra("KEY_START_ID", 0);
                l e10 = l.e();
                String str = g.f4511k;
                e10.a(str, "Processing command " + g.this.f4519h + ", " + intExtra);
                Context context = g.this.f4512a;
                PowerManager.WakeLock b10 = u.b(context, action + " (" + intExtra + ")");
                try {
                    l e11 = l.e();
                    e11.a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    g gVar2 = g.this;
                    gVar2.f4517f.q(gVar2.f4519h, intExtra, gVar2);
                    l e12 = l.e();
                    e12.a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = g.this.f4513b.a();
                    dVar = new d(g.this);
                } catch (Throwable th) {
                    try {
                        l e13 = l.e();
                        String str2 = g.f4511k;
                        e13.d(str2, "Unexpected error in onHandleIntent", th);
                        l e14 = l.e();
                        e14.a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        a10 = g.this.f4513b.a();
                        dVar = new d(g.this);
                    } catch (Throwable th2) {
                        l e15 = l.e();
                        String str3 = g.f4511k;
                        e15.a(str3, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        g.this.f4513b.a().execute(new d(g.this));
                        throw th2;
                    }
                }
                a10.execute(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f4523a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f4524b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4525c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(g gVar, Intent intent, int i10) {
            this.f4523a = gVar;
            this.f4524b = intent;
            this.f4525c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4523a.a(this.f4524b, this.f4525c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f4526a;

        d(g gVar) {
            this.f4526a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4526a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f4518g) {
            for (Intent intent : this.f4518g) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock b10 = u.b(this.f4512a, "ProcessCommand");
        try {
            b10.acquire();
            this.f4516e.t().c(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        l e10 = l.e();
        String str = f4511k;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f4518g) {
                boolean z10 = this.f4518g.isEmpty() ? false : true;
                this.f4518g.add(intent);
                if (!z10) {
                    k();
                }
            }
            return true;
        }
    }

    void c() {
        l e10 = l.e();
        String str = f4511k;
        e10.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f4518g) {
            if (this.f4519h != null) {
                l e11 = l.e();
                e11.a(str, "Removing command " + this.f4519h);
                if (this.f4518g.remove(0).equals(this.f4519h)) {
                    this.f4519h = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            q1.a b10 = this.f4513b.b();
            if (!this.f4517f.p() && this.f4518g.isEmpty() && !b10.U()) {
                l.e().a(str, "No more commands & intents.");
                c cVar = this.f4520i;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f4518g.isEmpty()) {
                k();
            }
        }
    }

    @Override // androidx.work.impl.e
    public void d(m mVar, boolean z10) {
        this.f4513b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f4512a, mVar, z10), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r e() {
        return this.f4515d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1.c f() {
        return this.f4513b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 g() {
        return this.f4516e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 h() {
        return this.f4514c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        l.e().a(f4511k, "Destroying SystemAlarmDispatcher");
        this.f4515d.n(this);
        this.f4520i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(c cVar) {
        if (this.f4520i != null) {
            l.e().c(f4511k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f4520i = cVar;
        }
    }

    g(Context context, r rVar, e0 e0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f4512a = applicationContext;
        this.f4521j = new w();
        this.f4517f = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f4521j);
        e0Var = e0Var == null ? e0.n(context) : e0Var;
        this.f4516e = e0Var;
        this.f4514c = new a0(e0Var.l().k());
        rVar = rVar == null ? e0Var.p() : rVar;
        this.f4515d = rVar;
        this.f4513b = e0Var.t();
        rVar.g(this);
        this.f4518g = new ArrayList();
        this.f4519h = null;
    }
}
