package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EventDispatcherImpl.java */
/* loaded from: classes.dex */
public class e implements com.facebook.react.uimanager.events.d, LifecycleEventListener {

    /* renamed from: q  reason: collision with root package name */
    private static final Comparator<com.facebook.react.uimanager.events.c> f15801q = new a();

    /* renamed from: c  reason: collision with root package name */
    private final ReactApplicationContext f15804c;

    /* renamed from: n  reason: collision with root package name */
    private volatile ReactEventEmitter f15815n;

    /* renamed from: a  reason: collision with root package name */
    private final Object f15802a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f15803b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LongSparseArray<Integer> f15805d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Short> f15806e = h6.e.b();

    /* renamed from: f  reason: collision with root package name */
    private final c f15807f = new c(this, null);

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<com.facebook.react.uimanager.events.c> f15808g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<f> f15809h = new CopyOnWriteArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> f15810i = new CopyOnWriteArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private final d f15811j = new d(this, null);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f15812k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private com.facebook.react.uimanager.events.c[] f15813l = new com.facebook.react.uimanager.events.c[16];

    /* renamed from: m  reason: collision with root package name */
    private int f15814m = 0;

    /* renamed from: o  reason: collision with root package name */
    private short f15816o = 0;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f15817p = false;

    /* compiled from: EventDispatcherImpl.java */
    /* loaded from: classes.dex */
    class a implements Comparator<com.facebook.react.uimanager.events.c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(com.facebook.react.uimanager.events.c cVar, com.facebook.react.uimanager.events.c cVar2) {
            if (cVar == null && cVar2 == null) {
                return 0;
            }
            if (cVar == null) {
                return -1;
            }
            if (cVar2 == null) {
                return 1;
            }
            int i10 = ((cVar.getTimestampMs() - cVar2.getTimestampMs()) > 0L ? 1 : ((cVar.getTimestampMs() - cVar2.getTimestampMs()) == 0L ? 0 : -1));
            if (i10 == 0) {
                return 0;
            }
            return i10 < 0 ? -1 : 1;
        }
    }

    /* compiled from: EventDispatcherImpl.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.F();
        }
    }

    /* compiled from: EventDispatcherImpl.java */
    /* loaded from: classes.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.c(0L, "DispatchEventsRunnable");
            try {
                com.facebook.systrace.a.d(0L, "ScheduleDispatchFrameCallback", e.this.f15812k.getAndIncrement());
                e.this.f15817p = false;
                f6.a.c(e.this.f15815n);
                synchronized (e.this.f15803b) {
                    if (e.this.f15814m > 0) {
                        if (e.this.f15814m > 1) {
                            Arrays.sort(e.this.f15813l, 0, e.this.f15814m, e.f15801q);
                        }
                        for (int i10 = 0; i10 < e.this.f15814m; i10++) {
                            com.facebook.react.uimanager.events.c cVar = e.this.f15813l[i10];
                            if (cVar != null) {
                                com.facebook.systrace.a.d(0L, cVar.getEventName(), cVar.getUniqueID());
                                cVar.dispatchModern(e.this.f15815n);
                                cVar.dispose();
                            }
                        }
                        e.this.A();
                        e.this.f15805d.clear();
                    }
                }
                Iterator it = e.this.f15810i.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).a();
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }

        /* synthetic */ c(e eVar, a aVar) {
            this();
        }
    }

    public e(ReactApplicationContext reactApplicationContext) {
        this.f15804c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f15815n = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Arrays.fill(this.f15813l, 0, this.f15814m, (Object) null);
        this.f15814m = 0;
    }

    private long B(int i10, String str, short s10) {
        short s11;
        Short sh = this.f15806e.get(str);
        if (sh != null) {
            s11 = sh.shortValue();
        } else {
            short s12 = this.f15816o;
            this.f15816o = (short) (s12 + 1);
            this.f15806e.put(str, Short.valueOf(s12));
            s11 = s12;
        }
        return C(i10, s11, s10);
    }

    private static long C(int i10, short s10, short s11) {
        return ((s10 & 65535) << 32) | i10 | ((s11 & 65535) << 48);
    }

    private void D() {
        if (this.f15815n != null) {
            this.f15811j.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        synchronized (this.f15802a) {
            synchronized (this.f15803b) {
                for (int i10 = 0; i10 < this.f15808g.size(); i10++) {
                    com.facebook.react.uimanager.events.c cVar = this.f15808g.get(i10);
                    if (!cVar.canCoalesce()) {
                        z(cVar);
                    } else {
                        long B = B(cVar.getViewTag(), cVar.getEventName(), cVar.getCoalescingKey());
                        Integer num = this.f15805d.get(B);
                        com.facebook.react.uimanager.events.c cVar2 = null;
                        if (num == null) {
                            this.f15805d.put(B, Integer.valueOf(this.f15814m));
                        } else {
                            com.facebook.react.uimanager.events.c cVar3 = this.f15813l[num.intValue()];
                            com.facebook.react.uimanager.events.c coalesce = cVar.coalesce(cVar3);
                            if (coalesce != cVar3) {
                                this.f15805d.put(B, Integer.valueOf(this.f15814m));
                                this.f15813l[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = coalesce;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            z(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                    }
                }
            }
            this.f15808g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        UiThreadUtil.assertOnUiThread();
        this.f15811j.f();
    }

    private void z(com.facebook.react.uimanager.events.c cVar) {
        int i10 = this.f15814m;
        com.facebook.react.uimanager.events.c[] cVarArr = this.f15813l;
        if (i10 == cVarArr.length) {
            this.f15813l = (com.facebook.react.uimanager.events.c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.c[] cVarArr2 = this.f15813l;
        int i11 = this.f15814m;
        this.f15814m = i11 + 1;
        cVarArr2[i11] = cVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f15815n.register(i10, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void b() {
        D();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void c(com.facebook.react.uimanager.events.a aVar) {
        this.f15810i.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void d() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.d
    public void e(int i10) {
        this.f15815n.unregister(i10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void f(f fVar) {
        this.f15809h.add(fVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void g(com.facebook.react.uimanager.events.c cVar) {
        f6.a.b(cVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<f> it = this.f15809h.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        synchronized (this.f15802a) {
            this.f15808g.add(cVar);
            com.facebook.systrace.a.j(0L, cVar.getEventName(), cVar.getUniqueID());
        }
        D();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void h(com.facebook.react.uimanager.events.a aVar) {
        this.f15810i.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void i(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f15815n.register(i10, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventDispatcherImpl.java */
    /* loaded from: classes.dex */
    public class d extends a.AbstractC0209a {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f15820b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15821c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EventDispatcherImpl.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.c();
            }
        }

        private d() {
            this.f15820b = false;
            this.f15821c = false;
        }

        private void e() {
            com.facebook.react.modules.core.g.i().m(g.c.TIMERS_EVENTS, e.this.f15811j);
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0209a
        public void a(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f15821c) {
                this.f15820b = false;
            } else {
                e();
            }
            com.facebook.systrace.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                e.this.E();
                if (!e.this.f15817p) {
                    e.this.f15817p = true;
                    com.facebook.systrace.a.j(0L, "ScheduleDispatchFrameCallback", e.this.f15812k.get());
                    e.this.f15804c.runOnJSQueueThread(e.this.f15807f);
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }

        public void c() {
            if (this.f15820b) {
                return;
            }
            this.f15820b = true;
            e();
        }

        public void d() {
            if (this.f15820b) {
                return;
            }
            if (!e.this.f15804c.isOnUiQueueThread()) {
                e.this.f15804c.runOnUiQueueThread(new a());
            } else {
                c();
            }
        }

        public void f() {
            this.f15821c = true;
        }

        /* synthetic */ d(e eVar, a aVar) {
            this();
        }
    }
}
