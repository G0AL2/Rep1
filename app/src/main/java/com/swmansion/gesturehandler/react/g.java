package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.x;

/* compiled from: RNGestureHandlerRootHelper.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final ReactContext f28433a;

    /* renamed from: b  reason: collision with root package name */
    private final nd.d f28434b;

    /* renamed from: c  reason: collision with root package name */
    private final nd.b f28435c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f28436d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28437e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28438f = false;

    /* compiled from: RNGestureHandlerRootHelper.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.j();
        }
    }

    /* compiled from: RNGestureHandlerRootHelper.java */
    /* loaded from: classes3.dex */
    private class b extends nd.b {
        private b() {
        }

        @Override // nd.b
        protected void B() {
            g.this.f28437e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (g.this.f28436d instanceof x) {
                ((x) g.this.f28436d).o(obtain);
            } else {
                com.facebook.react.views.modal.c.a(g.this.f28436d, obtain);
            }
        }

        @Override // nd.b
        protected void C(MotionEvent motionEvent) {
            if (p() == 0) {
                c();
                g.this.f28437e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                g();
            }
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }
    }

    public g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        if (id2 >= 1) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            f registry = rNGestureHandlerModule.getRegistry();
            ViewGroup e10 = e(viewGroup);
            this.f28436d = e10;
            Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + e10);
            this.f28433a = reactContext;
            nd.d dVar = new nd.d(viewGroup, registry, new j());
            this.f28434b = dVar;
            dVar.w(0.1f);
            b bVar = new b(this, null);
            this.f28435c = bVar;
            bVar.M(-id2);
            registry.h(bVar);
            registry.b(bVar.q(), id2);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        return (android.view.ViewGroup) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.ViewGroup e(android.view.ViewGroup r3) {
        /*
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r0 = r3
        L4:
            if (r0 == 0) goto L15
            boolean r1 = r0 instanceof com.facebook.react.x
            if (r1 != 0) goto L15
            boolean r1 = com.facebook.react.views.modal.c.b(r0)
            if (r1 != 0) goto L15
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L15:
            if (r0 == 0) goto L1a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " has not been mounted under ReactRootView"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.g.e(android.view.ViewGroup):android.view.ViewGroup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        nd.b bVar = this.f28435c;
        if (bVar == null || bVar.p() != 2) {
            return;
        }
        this.f28435c.a();
        this.f28435c.g();
    }

    public boolean d(MotionEvent motionEvent) {
        this.f28438f = true;
        this.f28434b.s(motionEvent);
        this.f28438f = false;
        return this.f28437e;
    }

    public ViewGroup f() {
        return this.f28436d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    public void h(boolean z10) {
        if (this.f28434b == null || this.f28438f) {
            return;
        }
        j();
    }

    public void i() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f28436d);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f28433a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().e(this.f28435c.q());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
