package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;

/* compiled from: ReactChoreographer.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static g f15501g;

    /* renamed from: a  reason: collision with root package name */
    private volatile com.facebook.react.modules.core.a f15502a;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15504c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f15506e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15507f = false;

    /* renamed from: b  reason: collision with root package name */
    private final d f15503b = new d(this, null);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<a.AbstractC0209a>[] f15505d = new ArrayDeque[c.values().length];

    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f15509a;

        b(Runnable runnable) {
            this.f15509a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.class) {
                if (g.this.f15502a == null) {
                    g.this.f15502a = com.facebook.react.modules.core.a.d();
                }
            }
            Runnable runnable = this.f15509a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    public enum c {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f15517a;

        c(int i10) {
            this.f15517a = i10;
        }

        int f() {
            return this.f15517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactChoreographer.java */
    /* loaded from: classes.dex */
    public class d extends a.AbstractC0209a {
        private d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0209a
        public void a(long j10) {
            synchronized (g.this.f15504c) {
                g.this.f15507f = false;
                for (int i10 = 0; i10 < g.this.f15505d.length; i10++) {
                    ArrayDeque arrayDeque = g.this.f15505d[i10];
                    int size = arrayDeque.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        a.AbstractC0209a abstractC0209a = (a.AbstractC0209a) arrayDeque.pollFirst();
                        if (abstractC0209a != null) {
                            abstractC0209a.a(j10);
                            g.g(g.this);
                        } else {
                            z3.a.j("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                g.this.l();
            }
        }

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }
    }

    private g() {
        int i10 = 0;
        while (true) {
            ArrayDeque<a.AbstractC0209a>[] arrayDequeArr = this.f15505d;
            if (i10 < arrayDequeArr.length) {
                arrayDequeArr[i10] = new ArrayDeque<>();
                i10++;
            } else {
                k(null);
                return;
            }
        }
    }

    static /* synthetic */ int g(g gVar) {
        int i10 = gVar.f15506e;
        gVar.f15506e = i10 - 1;
        return i10;
    }

    public static g i() {
        f6.a.d(f15501g, "ReactChoreographer needs to be initialized.");
        return f15501g;
    }

    public static void j() {
        if (f15501g == null) {
            f15501g = new g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        f6.a.a(this.f15506e >= 0);
        if (this.f15506e == 0 && this.f15507f) {
            if (this.f15502a != null) {
                this.f15502a.f(this.f15503b);
            }
            this.f15507f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f15502a.e(this.f15503b);
        this.f15507f = true;
    }

    public void k(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new b(runnable));
    }

    public void m(c cVar, a.AbstractC0209a abstractC0209a) {
        synchronized (this.f15504c) {
            this.f15505d[cVar.f()].addLast(abstractC0209a);
            boolean z10 = true;
            int i10 = this.f15506e + 1;
            this.f15506e = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            f6.a.a(z10);
            if (!this.f15507f) {
                if (this.f15502a == null) {
                    k(new a());
                } else {
                    n();
                }
            }
        }
    }

    public void o(c cVar, a.AbstractC0209a abstractC0209a) {
        synchronized (this.f15504c) {
            if (this.f15505d[cVar.f()].removeFirstOccurrence(abstractC0209a)) {
                this.f15506e--;
                l();
            } else {
                z3.a.j("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }
}
