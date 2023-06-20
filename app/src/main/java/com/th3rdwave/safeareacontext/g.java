package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SafeAreaView.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class g extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: t  reason: collision with root package name */
    private j f28459t;

    /* renamed from: u  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f28460u;

    /* renamed from: v  reason: collision with root package name */
    private EnumSet<h> f28461v;

    /* renamed from: w  reason: collision with root package name */
    private View f28462w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeAreaView.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f28463a;

        a(g gVar, AtomicBoolean atomicBoolean) {
            this.f28463a = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f28463a) {
                if (this.f28463a.compareAndSet(false, true)) {
                    this.f28463a.notify();
                }
            }
        }
    }

    public g(Context context) {
        super(context);
        this.f28459t = j.PADDING;
    }

    private View A() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof e) {
                return (View) parent;
            }
        }
        return this;
    }

    private static ReactContext B(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private boolean C() {
        com.th3rdwave.safeareacontext.a c10;
        com.th3rdwave.safeareacontext.a aVar;
        View view = this.f28462w;
        if (view == null || (c10 = f.c(view)) == null || ((aVar = this.f28460u) != null && aVar.a(c10))) {
            return false;
        }
        this.f28460u = c10;
        D();
        return true;
    }

    private void D() {
        if (this.f28460u != null) {
            EnumSet<h> enumSet = this.f28461v;
            if (enumSet == null) {
                enumSet = EnumSet.allOf(h.class);
            }
            i iVar = new i(this.f28460u, this.f28459t, enumSet);
            UIManagerModule uIManagerModule = (UIManagerModule) B(this).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), iVar);
                E();
            }
        }
    }

    private void E() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long nanoTime = System.nanoTime();
        B(this).runOnNativeModulesQueueThread(new a(this, atomicBoolean));
        synchronized (atomicBoolean) {
            long j10 = 0;
            while (!atomicBoolean.get() && j10 < 500000000) {
                try {
                    atomicBoolean.wait(500L);
                } catch (InterruptedException unused) {
                    atomicBoolean.set(true);
                }
                j10 += System.nanoTime() - nanoTime;
            }
            if (j10 >= 500000000) {
                Log.w("SafeAreaView", "Timed out waiting for layout.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View A = A();
        this.f28462w = A;
        A.getViewTreeObserver().addOnPreDrawListener(this);
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.f28462w;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f28462w = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean C = C();
        if (C) {
            requestLayout();
        }
        return !C;
    }

    public void setEdges(EnumSet<h> enumSet) {
        this.f28461v = enumSet;
        D();
    }

    public void setMode(j jVar) {
        this.f28459t = jVar;
        D();
    }
}
