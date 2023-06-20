package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: LockFreeEventDispatcherImpl.java */
/* loaded from: classes.dex */
public class h implements d, LifecycleEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f15824a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<f> f15825b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> f15826c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final b f15827d = new b(this, null);

    /* renamed from: e  reason: collision with root package name */
    private volatile ReactEventEmitter f15828e;

    /* compiled from: LockFreeEventDispatcherImpl.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.p();
        }
    }

    public h(ReactApplicationContext reactApplicationContext) {
        this.f15824a = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f15828e = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Iterator<com.facebook.react.uimanager.events.a> it = this.f15826c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void o() {
        if (this.f15828e != null) {
            this.f15827d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        UiThreadUtil.assertOnUiThread();
        this.f15827d.f();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f15828e.register(i10, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void b() {
        o();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void c(com.facebook.react.uimanager.events.a aVar) {
        this.f15826c.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void d() {
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.uimanager.events.d
    public void e(int i10) {
        this.f15828e.unregister(i10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void f(f fVar) {
        this.f15825b.add(fVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void g(c cVar) {
        f6.a.b(cVar.isInitialized(), "Dispatched event hasn't been initialized");
        f6.a.c(this.f15828e);
        Iterator<f> it = this.f15825b.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        cVar.dispatchModern(this.f15828e);
        cVar.dispose();
    }

    @Override // com.facebook.react.uimanager.events.d
    public void h(com.facebook.react.uimanager.events.a aVar) {
        this.f15826c.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void i(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f15828e.register(i10, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockFreeEventDispatcherImpl.java */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0209a {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f15830b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15831c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LockFreeEventDispatcherImpl.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
            }
        }

        private b() {
            this.f15830b = false;
            this.f15831c = false;
        }

        private void e() {
            com.facebook.react.modules.core.g.i().m(g.c.TIMERS_EVENTS, h.this.f15827d);
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0209a
        public void a(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f15831c) {
                this.f15830b = false;
            } else {
                e();
            }
            h.this.n();
        }

        public void c() {
            if (this.f15830b) {
                return;
            }
            this.f15830b = true;
            e();
        }

        public void d() {
            if (this.f15830b) {
                return;
            }
            if (!h.this.f15824a.isOnUiQueueThread()) {
                h.this.f15824a.runOnUiQueueThread(new a());
            } else {
                c();
            }
        }

        public void f() {
            this.f15831c = true;
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }
    }
}
