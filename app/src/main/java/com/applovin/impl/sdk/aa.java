package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private final v f8040a;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f8044e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8045f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<View> f8046g;

    /* renamed from: h  reason: collision with root package name */
    private final long f8047h;

    /* renamed from: k  reason: collision with root package name */
    private int f8050k;

    /* renamed from: l  reason: collision with root package name */
    private long f8051l;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8041b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f8042c = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f8048i = new WeakReference<>(null);

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<View> f8049j = new WeakReference<>(null);

    /* renamed from: m  reason: collision with root package name */
    private long f8052m = Long.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f8043d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public aa(final View view, m mVar, a aVar) {
        this.f8040a = mVar.A();
        this.f8047h = ((Long) mVar.a(com.applovin.impl.sdk.c.b.bT)).longValue();
        this.f8046g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f8044e = new Runnable() { // from class: com.applovin.impl.sdk.aa.1
            @Override // java.lang.Runnable
            public void run() {
                View view2 = (View) aa.this.f8046g.get();
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                View view3 = (View) aa.this.f8049j.get();
                if (viewGroup == null || view3 == null) {
                    return;
                }
                if (!aa.this.b(viewGroup, view3)) {
                    aa.this.b();
                    return;
                }
                if (v.a()) {
                    aa.this.f8040a.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                }
                aa.this.a();
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.onLogVisibilityImpression();
                }
            }
        };
        this.f8045f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.aa.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                aa.this.b();
                aa.this.b(view);
                return true;
            }
        };
    }

    private void a(View view) {
        View rootView = Utils.getRootView(this.f8046g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            if (v.a()) {
                this.f8040a.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8048i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f8045f);
        } else if (v.a()) {
            this.f8040a.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    private boolean a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.f8042c) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8042c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8042c.height()))) >= ((long) this.f8050k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f8043d.postDelayed(this.f8044e, this.f8047h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        ViewTreeObserver viewTreeObserver = this.f8048i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f8045f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f8045f);
            }
        }
        this.f8048i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (a(view, view2)) {
            if (this.f8052m == Long.MIN_VALUE) {
                this.f8052m = SystemClock.uptimeMillis();
            }
            return SystemClock.uptimeMillis() - this.f8052m >= this.f8051l;
        }
        return false;
    }

    public void a() {
        synchronized (this.f8041b) {
            this.f8043d.removeMessages(0);
            b(this.f8046g.get());
            this.f8052m = Long.MIN_VALUE;
            this.f8049j.clear();
        }
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f8041b) {
            if (v.a()) {
                this.f8040a.b("VisibilityTracker", "Tracking Visibility...");
            }
            a();
            if (eVar instanceof com.applovin.impl.mediation.a.b) {
                weakReference = new WeakReference<>(((com.applovin.impl.mediation.a.b) eVar).w());
            } else if (!(eVar instanceof com.applovin.impl.mediation.a.d)) {
                return;
            } else {
                weakReference = new WeakReference<>(((com.applovin.impl.mediation.a.d) eVar).u());
            }
            this.f8049j = weakReference;
            this.f8050k = eVar.F();
            this.f8051l = eVar.H();
            a(this.f8049j.get());
        }
    }
}
