package com.applovin.impl.mediation.b.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<View, Integer> f7344a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Object f7345b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f7346c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7347d = false;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<View> f7348e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7349f;

    /* renamed from: g  reason: collision with root package name */
    private a f7350g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, int i11);
    }

    public c(View view) {
        this.f7348e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f7349f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mediation.b.a.c.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                c.this.b();
                return true;
            }
        };
        this.f7349f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f7347d) {
            return;
        }
        this.f7347d = true;
        this.f7346c.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this.f7345b) {
                    c.this.f7347d = false;
                    int i10 = -1;
                    int i11 = -1;
                    for (Map.Entry entry : c.this.f7344a.entrySet()) {
                        if (c.this.b((View) entry.getKey())) {
                            Integer num = (Integer) entry.getValue();
                            if (i10 == -1 && i11 == -1) {
                                i10 = num.intValue();
                                i11 = num.intValue();
                            } else {
                                i10 = Math.min(i10, ((Integer) entry.getValue()).intValue());
                                i11 = Math.max(i11, ((Integer) entry.getValue()).intValue());
                            }
                        }
                    }
                    if (c.this.f7350g != null) {
                        c.this.f7350g.a(i10, i11);
                    }
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f7350g = null;
        View view = this.f7348e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f7349f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f7348e.clear();
        }
    }

    public void a(View view) {
        synchronized (this.f7345b) {
            this.f7344a.remove(view);
        }
    }

    public void a(View view, int i10) {
        synchronized (this.f7345b) {
            this.f7344a.put(view, Integer.valueOf(i10));
            b();
        }
    }

    public void a(a aVar) {
        this.f7350g = aVar;
    }
}
