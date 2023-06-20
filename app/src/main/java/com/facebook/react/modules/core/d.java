package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import h6.j;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: JavaTimerManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f15473a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.c f15474b;

    /* renamed from: c  reason: collision with root package name */
    private final g f15475c;

    /* renamed from: d  reason: collision with root package name */
    private final k6.d f15476d;

    /* renamed from: m  reason: collision with root package name */
    private c f15485m;

    /* renamed from: e  reason: collision with root package name */
    private final Object f15477e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f15478f = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f15481i = new AtomicBoolean(true);

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f15482j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    private final f f15483k = new f(this, null);

    /* renamed from: l  reason: collision with root package name */
    private final C0211d f15484l = new C0211d(this, null);

    /* renamed from: n  reason: collision with root package name */
    private boolean f15486n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15487o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15488p = false;

    /* renamed from: g  reason: collision with root package name */
    private final PriorityQueue<e> f15479g = new PriorityQueue<>(11, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<e> f15480h = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JavaTimerManager.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<e> {
        a(d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            int i10 = ((eVar.f15498d - eVar2.f15498d) > 0L ? 1 : ((eVar.f15498d - eVar2.f15498d) == 0L ? 0 : -1));
            if (i10 == 0) {
                return 0;
            }
            return i10 < 0 ? -1 : 1;
        }
    }

    /* compiled from: JavaTimerManager.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f15489a;

        b(boolean z10) {
            this.f15489a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f15478f) {
                if (this.f15489a) {
                    d.this.C();
                } else {
                    d.this.o();
                }
            }
        }
    }

    /* compiled from: JavaTimerManager.java */
    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f15491a = false;

        /* renamed from: b  reason: collision with root package name */
        private final long f15492b;

        public c(long j10) {
            this.f15492b = j10;
        }

        public void a() {
            this.f15491a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            if (this.f15491a) {
                return;
            }
            long c10 = j.c() - (this.f15492b / 1000000);
            long a10 = j.a() - c10;
            if (16.666666f - ((float) c10) < 1.0f) {
                return;
            }
            synchronized (d.this.f15478f) {
                z10 = d.this.f15488p;
            }
            if (z10) {
                d.this.f15474b.callIdleCallbacks(a10);
            }
            d.this.f15485m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JavaTimerManager.java */
    /* renamed from: com.facebook.react.modules.core.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0211d extends a.AbstractC0209a {
        private C0211d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0209a
        public void a(long j10) {
            if (!d.this.f15481i.get() || d.this.f15482j.get()) {
                if (d.this.f15485m != null) {
                    d.this.f15485m.a();
                }
                d dVar = d.this;
                dVar.f15485m = new c(j10);
                d.this.f15473a.runOnJSQueueThread(d.this.f15485m);
                d.this.f15475c.m(g.c.IDLE_EVENT, this);
            }
        }

        /* synthetic */ C0211d(d dVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JavaTimerManager.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f15495a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15496b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15497c;

        /* renamed from: d  reason: collision with root package name */
        private long f15498d;

        /* synthetic */ e(int i10, long j10, int i11, boolean z10, a aVar) {
            this(i10, j10, i11, z10);
        }

        private e(int i10, long j10, int i11, boolean z10) {
            this.f15495a = i10;
            this.f15498d = j10;
            this.f15497c = i11;
            this.f15496b = z10;
        }
    }

    public d(ReactApplicationContext reactApplicationContext, com.facebook.react.modules.core.c cVar, g gVar, k6.d dVar) {
        this.f15473a = reactApplicationContext;
        this.f15474b = cVar;
        this.f15475c = gVar;
        this.f15476d = dVar;
    }

    private void B() {
        if (this.f15486n) {
            return;
        }
        this.f15475c.m(g.c.TIMERS_EVENTS, this.f15483k);
        this.f15486n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f15487o) {
            return;
        }
        this.f15475c.m(g.c.IDLE_EVENT, this.f15484l);
        this.f15487o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f15487o) {
            this.f15475c.o(g.c.IDLE_EVENT, this.f15484l);
            this.f15487o = false;
        }
    }

    private void p() {
        n6.b e10 = n6.b.e(this.f15473a);
        if (this.f15486n && this.f15481i.get() && !e10.f()) {
            this.f15475c.o(g.c.TIMERS_EVENTS, this.f15483k);
            this.f15486n = false;
        }
    }

    private static boolean s(e eVar, long j10) {
        return !eVar.f15496b && ((long) eVar.f15497c) < j10;
    }

    private void t() {
        if (!this.f15481i.get() || this.f15482j.get()) {
            return;
        }
        p();
    }

    private void u() {
        synchronized (this.f15478f) {
            if (this.f15488p) {
                C();
            }
        }
    }

    public void A() {
        p();
        o();
    }

    @g6.a
    public void createTimer(int i10, long j10, boolean z10) {
        e eVar = new e(i10, (j.b() / 1000000) + j10, (int) j10, z10, null);
        synchronized (this.f15477e) {
            this.f15479g.add(eVar);
            this.f15480h.put(i10, eVar);
        }
    }

    @g6.a
    public void deleteTimer(int i10) {
        synchronized (this.f15477e) {
            e eVar = this.f15480h.get(i10);
            if (eVar == null) {
                return;
            }
            this.f15480h.remove(i10);
            this.f15479g.remove(eVar);
        }
    }

    public void q(int i10, int i11, double d10, boolean z10) {
        long a10 = j.a();
        long j10 = (long) d10;
        if (this.f15476d.e() && Math.abs(j10 - a10) > 60000) {
            this.f15474b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j10 - a10) + i11);
        if (i11 == 0 && !z10) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i10);
            this.f15474b.callTimers(createArray);
            return;
        }
        createTimer(i10, max, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(long j10) {
        synchronized (this.f15477e) {
            e peek = this.f15479g.peek();
            if (peek == null) {
                return false;
            }
            if (s(peek, j10)) {
                return true;
            }
            Iterator<e> it = this.f15479g.iterator();
            while (it.hasNext()) {
                if (s(it.next(), j10)) {
                    return true;
                }
            }
            return false;
        }
    }

    @g6.a
    public void setSendIdleEvents(boolean z10) {
        synchronized (this.f15478f) {
            this.f15488p = z10;
        }
        UiThreadUtil.runOnUiThread(new b(z10));
    }

    public void v(int i10) {
        if (n6.b.e(this.f15473a).f()) {
            return;
        }
        this.f15482j.set(false);
        p();
        t();
    }

    public void w(int i10) {
        if (this.f15482j.getAndSet(true)) {
            return;
        }
        B();
        u();
    }

    public void x() {
        p();
        t();
    }

    public void y() {
        this.f15481i.set(true);
        p();
        t();
    }

    public void z() {
        this.f15481i.set(false);
        B();
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JavaTimerManager.java */
    /* loaded from: classes.dex */
    public class f extends a.AbstractC0209a {

        /* renamed from: b  reason: collision with root package name */
        private WritableArray f15499b;

        private f() {
            this.f15499b = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0209a
        public void a(long j10) {
            if (!d.this.f15481i.get() || d.this.f15482j.get()) {
                long j11 = j10 / 1000000;
                synchronized (d.this.f15477e) {
                    while (!d.this.f15479g.isEmpty() && ((e) d.this.f15479g.peek()).f15498d < j11) {
                        e eVar = (e) d.this.f15479g.poll();
                        if (this.f15499b == null) {
                            this.f15499b = Arguments.createArray();
                        }
                        this.f15499b.pushInt(eVar.f15495a);
                        if (eVar.f15496b) {
                            eVar.f15498d = eVar.f15497c + j11;
                            d.this.f15479g.add(eVar);
                        } else {
                            d.this.f15480h.remove(eVar.f15495a);
                        }
                    }
                }
                if (this.f15499b != null) {
                    d.this.f15474b.callTimers(this.f15499b);
                    this.f15499b = null;
                }
                d.this.f15475c.m(g.c.TIMERS_EVENTS, this);
            }
        }

        /* synthetic */ f(d dVar, a aVar) {
            this();
        }
    }
}
