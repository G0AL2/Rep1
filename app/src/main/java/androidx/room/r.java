package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.j;
import androidx.room.k;
import androidx.room.o;
import androidx.room.r;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    private final String f4019a;

    /* renamed from: b */
    private final o f4020b;

    /* renamed from: c */
    private final Executor f4021c;

    /* renamed from: d */
    private final Context f4022d;

    /* renamed from: e */
    private int f4023e;

    /* renamed from: f */
    public o.c f4024f;

    /* renamed from: g */
    private k f4025g;

    /* renamed from: h */
    private final j f4026h;

    /* renamed from: i */
    private final AtomicBoolean f4027i;

    /* renamed from: j */
    private final ServiceConnection f4028j;

    /* renamed from: k */
    private final Runnable f4029k;

    /* renamed from: l */
    private final Runnable f4030l;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class a extends o.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr) {
            super(strArr);
            r.this = r1;
        }

        @Override // androidx.room.o.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.o.c
        public void c(Set<String> set) {
            qe.k.f(set, "tables");
            if (r.this.j().get()) {
                return;
            }
            try {
                k h10 = r.this.h();
                if (h10 != null) {
                    int c10 = r.this.c();
                    Object[] array = set.toArray(new String[0]);
                    qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    h10.k(c10, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class b extends j.a {
        b() {
            r.this = r1;
        }

        public static /* synthetic */ void Y(r rVar, String[] strArr) {
            Z(rVar, strArr);
        }

        public static final void Z(r rVar, String[] strArr) {
            qe.k.f(rVar, "this$0");
            qe.k.f(strArr, "$tables");
            rVar.e().l((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // androidx.room.j
        public void d(final String[] strArr) {
            qe.k.f(strArr, "tables");
            Executor d10 = r.this.d();
            final r rVar = r.this;
            d10.execute(new Runnable() { // from class: androidx.room.s
                @Override // java.lang.Runnable
                public final void run() {
                    r.b.Y(r.this, strArr);
                }
            });
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        c() {
            r.this = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            qe.k.f(componentName, "name");
            qe.k.f(iBinder, "service");
            r.this.m(k.a.X(iBinder));
            r.this.d().execute(r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            qe.k.f(componentName, "name");
            r.this.d().execute(r.this.g());
            r.this.m(null);
        }
    }

    public r(Context context, String str, Intent intent, o oVar, Executor executor) {
        qe.k.f(context, "context");
        qe.k.f(str, "name");
        qe.k.f(intent, "serviceIntent");
        qe.k.f(oVar, "invalidationTracker");
        qe.k.f(executor, "executor");
        this.f4019a = str;
        this.f4020b = oVar;
        this.f4021c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f4022d = applicationContext;
        this.f4026h = new b();
        this.f4027i = new AtomicBoolean(false);
        c cVar = new c();
        this.f4028j = cVar;
        this.f4029k = new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                r.b(r.this);
            }
        };
        this.f4030l = new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this);
            }
        };
        Object[] array = oVar.j().keySet().toArray(new String[0]);
        qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    public static /* synthetic */ void a(r rVar) {
        k(rVar);
    }

    public static /* synthetic */ void b(r rVar) {
        n(rVar);
    }

    public static final void k(r rVar) {
        qe.k.f(rVar, "this$0");
        rVar.f4020b.o(rVar.f());
    }

    public static final void n(r rVar) {
        qe.k.f(rVar, "this$0");
        try {
            k kVar = rVar.f4025g;
            if (kVar != null) {
                rVar.f4023e = kVar.D(rVar.f4026h, rVar.f4019a);
                rVar.f4020b.b(rVar.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f4023e;
    }

    public final Executor d() {
        return this.f4021c;
    }

    public final o e() {
        return this.f4020b;
    }

    public final o.c f() {
        o.c cVar = this.f4024f;
        if (cVar != null) {
            return cVar;
        }
        qe.k.s("observer");
        return null;
    }

    public final Runnable g() {
        return this.f4030l;
    }

    public final k h() {
        return this.f4025g;
    }

    public final Runnable i() {
        return this.f4029k;
    }

    public final AtomicBoolean j() {
        return this.f4027i;
    }

    public final void l(o.c cVar) {
        qe.k.f(cVar, "<set-?>");
        this.f4024f = cVar;
    }

    public final void m(k kVar) {
        this.f4025g = kVar;
    }

    public final void o() {
        if (this.f4027i.compareAndSet(false, true)) {
            this.f4020b.o(f());
            try {
                k kVar = this.f4025g;
                if (kVar != null) {
                    kVar.V(this.f4026h, this.f4023e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f4022d.unbindService(this.f4028j);
        }
    }
}
