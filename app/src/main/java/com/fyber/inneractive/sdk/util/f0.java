package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, WeakHashMap<View, e>> f20265b = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> f20264a = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final j<Rect> f20266c = new j<>(16, new a(this));

    /* renamed from: d  reason: collision with root package name */
    public final j<HashSet<View>> f20267d = new j<>(16, new b(this));

    /* loaded from: classes2.dex */
    public class a implements j.a<Rect> {
        public a(f0 f0Var) {
        }

        @Override // com.fyber.inneractive.sdk.util.j.a
        public Rect a() {
            return new Rect();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements j.a<HashSet<View>> {
        public b(f0 f0Var) {
        }

        @Override // com.fyber.inneractive.sdk.util.j.a
        public HashSet<View> a() {
            return new HashSet<>();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20268a;

        public c(Context context) {
            this.f20268a = context;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakHashMap<View, e> weakHashMap;
            f0 f0Var = f0.this;
            Context context = this.f20268a;
            f0Var.getClass();
            if (context == null || (weakHashMap = f0Var.f20265b.get(context)) == null) {
                return true;
            }
            HashSet<View> a10 = f0Var.f20267d.a();
            a10.addAll(weakHashMap.keySet());
            Iterator<View> it = a10.iterator();
            while (it.hasNext()) {
                View next = it.next();
                e eVar = weakHashMap.get(next);
                if (eVar != null) {
                    float f10 = 0.0f;
                    Rect a11 = f0Var.f20266c.a();
                    if (next != null && next.getParent() != null && next.isShown() && next.getGlobalVisibleRect(a11)) {
                        f10 = (a11.height() * a11.width()) / (next.getHeight() * next.getWidth());
                    }
                    eVar.a(next, f10, a11);
                    f0Var.f20266c.f20290a.offer(a11);
                }
            }
            a10.clear();
            f0Var.f20267d.f20290a.offer(a10);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f20270a = new f0();
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(View view, float f10, Rect rect);
    }

    public static f0 a() {
        return d.f20270a;
    }

    public final String b() {
        return "IAVisibilityTracker: ";
    }

    public final void c() {
        for (Context context : this.f20265b.keySet()) {
            IAlog.a("%stracking context: %s", b(), context);
            WeakHashMap<View, e> weakHashMap = this.f20265b.get(context);
            if (weakHashMap != null) {
                Iterator<View> it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", b(), it.next());
                }
            }
        }
    }

    public void a(Context context, View view, e eVar) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.a("%strackView called with context: %s view: %s", b(), context, view);
        if (context != null) {
            WeakHashMap<View, e> weakHashMap = this.f20265b.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.f20265b.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        rootView = activity.getWindow().getDecorView();
                        viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            c cVar = new c(context);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.f20264a.put(context, new Pair<>(viewTreeObserver, cVar));
                        }
                    }
                }
                rootView = view.getRootView();
                viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    c cVar2 = new c(context);
                    viewTreeObserver.addOnPreDrawListener(cVar2);
                    this.f20264a.put(context, new Pair<>(viewTreeObserver, cVar2));
                }
            }
            weakHashMap.put(view, eVar);
            c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    public void a(View view) {
        IAlog.a("%sunTrackView called with view", b());
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", b());
            return;
        }
        WeakHashMap<View, e> weakHashMap = this.f20265b.get(context);
        if (weakHashMap != null) {
            a(context, weakHashMap, view);
        } else {
            Iterator it = new HashSet(this.f20265b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap<View, e> weakHashMap2 = this.f20265b.get(context2);
                if (weakHashMap2 != null) {
                    a(context2, weakHashMap2, view);
                }
            }
        }
        c();
    }

    public final void a(Context context, Map<View, e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f20222a <= 2) {
                IAlog.d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f20265b.remove(context);
                Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = this.f20264a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f20264a.remove(context);
                }
            }
        }
    }
}
