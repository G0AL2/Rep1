package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.eb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VisibilityTracker.java */
/* loaded from: classes3.dex */
public abstract class ei {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25239a = "ei";

    /* renamed from: b  reason: collision with root package name */
    boolean f25240b;

    /* renamed from: c  reason: collision with root package name */
    c f25241c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<View> f25242d;

    /* renamed from: e  reason: collision with root package name */
    private long f25243e;

    /* renamed from: f  reason: collision with root package name */
    private final byte f25244f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<View, d> f25245g;

    /* renamed from: h  reason: collision with root package name */
    private final a f25246h;

    /* renamed from: i  reason: collision with root package name */
    private final b f25247i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f25248j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25249k;

    /* compiled from: VisibilityTracker.java */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(View view, View view2, int i10);

        boolean a(View view, View view2, int i10, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VisibilityTracker.java */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<ei> f25252c;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<View> f25251b = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<View> f25250a = new ArrayList<>();

        b(ei eiVar) {
            this.f25252c = new WeakReference<>(eiVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            ei eiVar = this.f25252c.get();
            if (eiVar != null) {
                ei.a(eiVar);
                for (Map.Entry entry : eiVar.f25245g.entrySet()) {
                    View view = (View) entry.getKey();
                    int i10 = ((d) entry.getValue()).f25253a;
                    View view2 = ((d) entry.getValue()).f25255c;
                    Object obj = ((d) entry.getValue()).f25256d;
                    if (eiVar.f25244f != 2) {
                        a aVar = eiVar.f25246h;
                        if (aVar.a(view2, view, i10, obj) && aVar.a(view, view, i10)) {
                            this.f25250a.add(view);
                        } else {
                            this.f25251b.add(view);
                        }
                    } else {
                        eb.a aVar2 = (eb.a) eiVar.f25246h;
                        if (aVar2.a(view2, view, i10, obj) && aVar2.a(view, view, i10) && aVar2.a(view)) {
                            this.f25250a.add(view);
                        } else {
                            this.f25251b.add(view);
                        }
                    }
                }
            }
            if (eiVar != null && (cVar = eiVar.f25241c) != null) {
                cVar.a(this.f25250a, this.f25251b);
            }
            this.f25250a.clear();
            this.f25251b.clear();
            if (eiVar != null) {
                eiVar.b();
            }
        }
    }

    /* compiled from: VisibilityTracker.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(List<View> list, List<View> list2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VisibilityTracker.java */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f25253a;

        /* renamed from: b  reason: collision with root package name */
        long f25254b;

        /* renamed from: c  reason: collision with root package name */
        View f25255c;

        /* renamed from: d  reason: collision with root package name */
        Object f25256d;

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ei(a aVar, byte b10) {
        this(new WeakHashMap(10), aVar, new Handler(Looper.getMainLooper()), b10);
    }

    static /* synthetic */ boolean a(ei eiVar) {
        eiVar.f25249k = false;
        return false;
    }

    protected abstract int a();

    protected abstract void b();

    public final void f() {
        this.f25245g.clear();
        this.f25248j.removeMessages(0);
        this.f25249k = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return !this.f25245g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (this.f25249k || this.f25240b) {
            return;
        }
        this.f25249k = true;
        this.f25248j.postDelayed(this.f25247i, a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(View view, Object obj, int i10) {
        a(view, view, obj, i10);
    }

    public void c() {
        this.f25247i.run();
        this.f25248j.removeCallbacksAndMessages(null);
        this.f25249k = false;
        this.f25240b = true;
    }

    public void d() {
        this.f25240b = false;
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        f();
        this.f25241c = null;
        this.f25240b = true;
    }

    private void a(View view, View view2, Object obj, int i10) {
        d dVar = this.f25245g.get(view2);
        if (dVar == null) {
            dVar = new d();
            this.f25245g.put(view2, dVar);
            this.f25243e++;
        }
        dVar.f25253a = i10;
        long j10 = this.f25243e;
        dVar.f25254b = j10;
        dVar.f25255c = view;
        dVar.f25256d = obj;
        if (j10 % 50 == 0) {
            a(j10 - 50);
        }
        if (1 == this.f25245g.size()) {
            d();
        }
    }

    private ei(Map<View, d> map, a aVar, Handler handler, byte b10) {
        this.f25243e = 0L;
        this.f25240b = true;
        this.f25245g = map;
        this.f25246h = aVar;
        this.f25248j = handler;
        this.f25247i = new b(this);
        this.f25242d = new ArrayList<>(50);
        this.f25244f = b10;
    }

    private void a(long j10) {
        for (Map.Entry<View, d> entry : this.f25245g.entrySet()) {
            if (entry.getValue().f25254b < j10) {
                this.f25242d.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f25242d.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f25242d.clear();
    }

    public final void a(View view) {
        if (this.f25245g.remove(view) != null) {
            this.f25243e--;
            if (this.f25245g.size() == 0) {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        View view = null;
        Iterator<Map.Entry<View, d>> it = this.f25245g.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<View, d> next = it.next();
            if (next.getValue().f25256d.equals(obj)) {
                view = next.getKey();
                break;
            }
        }
        if (view != null) {
            a(view);
        }
    }
}
