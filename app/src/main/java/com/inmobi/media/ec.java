package com.inmobi.media;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.inmobi.media.ei;
import com.inmobi.media.fq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: ImpressionTracker.java */
/* loaded from: classes3.dex */
public class ec {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25197a = "ec";

    /* renamed from: b  reason: collision with root package name */
    private final ei f25198b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<View, b> f25199c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<View, b> f25200d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f25201e;

    /* renamed from: f  reason: collision with root package name */
    private final c f25202f;

    /* renamed from: g  reason: collision with root package name */
    private final long f25203g;

    /* renamed from: h  reason: collision with root package name */
    private ei.c f25204h;

    /* renamed from: i  reason: collision with root package name */
    private a f25205i;

    /* compiled from: ImpressionTracker.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(View view, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImpressionTracker.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f25207a;

        /* renamed from: b  reason: collision with root package name */
        int f25208b;

        /* renamed from: c  reason: collision with root package name */
        int f25209c;

        /* renamed from: d  reason: collision with root package name */
        long f25210d = Long.MAX_VALUE;

        b(Object obj, int i10, int i11) {
            this.f25207a = obj;
            this.f25208b = i10;
            this.f25209c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImpressionTracker.java */
    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<View> f25211a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ec> f25212b;

        c(ec ecVar) {
            this.f25212b = new WeakReference<>(ecVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ec ecVar = this.f25212b.get();
            if (ecVar != null) {
                for (Map.Entry entry : ecVar.f25200d.entrySet()) {
                    View view = (View) entry.getKey();
                    b bVar = (b) entry.getValue();
                    if (ec.a(bVar.f25210d, bVar.f25209c) && this.f25212b.get() != null) {
                        ecVar.f25205i.a(view, bVar.f25207a);
                        this.f25211a.add(view);
                    }
                }
                Iterator<View> it = this.f25211a.iterator();
                while (it.hasNext()) {
                    ecVar.a(it.next());
                }
                this.f25211a.clear();
                if (ecVar.f25200d.isEmpty()) {
                    return;
                }
                ecVar.e();
            }
        }
    }

    public ec(fq.m mVar, ei eiVar, a aVar) {
        this(new WeakHashMap(), new WeakHashMap(), eiVar, new Handler(), mVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f25201e.hasMessages(0)) {
            return;
        }
        this.f25201e.postDelayed(this.f25202f, this.f25203g);
    }

    private ec(Map<View, b> map, Map<View, b> map2, ei eiVar, Handler handler, fq.m mVar, a aVar) {
        this.f25199c = map;
        this.f25200d = map2;
        this.f25198b = eiVar;
        this.f25203g = mVar.impressionPollIntervalMillis;
        ei.c cVar = new ei.c() { // from class: com.inmobi.media.ec.1
            @Override // com.inmobi.media.ei.c
            public final void a(List<View> list, List<View> list2) {
                for (View view : list) {
                    b bVar = (b) ec.this.f25199c.get(view);
                    if (bVar != null) {
                        b bVar2 = (b) ec.this.f25200d.get(view);
                        if (bVar2 == null || !bVar.f25207a.equals(bVar2.f25207a)) {
                            bVar.f25210d = SystemClock.uptimeMillis();
                            ec.this.f25200d.put(view, bVar);
                        }
                    } else {
                        ec.this.a(view);
                    }
                }
                for (View view2 : list2) {
                    ec.this.f25200d.remove(view2);
                }
                ec.this.e();
            }
        };
        this.f25204h = cVar;
        eiVar.f25241c = cVar;
        this.f25201e = handler;
        this.f25202f = new c(this);
        this.f25205i = aVar;
    }

    public final void a(View view, Object obj, int i10, int i11) {
        b bVar = this.f25199c.get(view);
        if (bVar == null || !bVar.f25207a.equals(obj)) {
            a(view);
            b bVar2 = new b(obj, i10, i11);
            this.f25199c.put(view, bVar2);
            this.f25198b.a(view, obj, bVar2.f25208b);
        }
    }

    public final void b() {
        for (Map.Entry<View, b> entry : this.f25199c.entrySet()) {
            this.f25198b.a(entry.getKey(), entry.getValue().f25207a, entry.getValue().f25208b);
        }
        e();
        this.f25198b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return !this.f25199c.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f25199c.clear();
        this.f25200d.clear();
        this.f25198b.f();
        this.f25201e.removeMessages(0);
        this.f25198b.e();
        this.f25204h = null;
    }

    public final void a(View view) {
        this.f25199c.remove(view);
        this.f25200d.remove(view);
        this.f25198b.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj) {
        View view;
        Iterator<Map.Entry<View, b>> it = this.f25199c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry<View, b> next = it.next();
            if (next.getValue().f25207a.equals(obj)) {
                view = next.getKey();
                break;
            }
        }
        if (view != null) {
            a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f25198b.f();
        this.f25201e.removeCallbacksAndMessages(null);
        this.f25200d.clear();
    }

    static /* synthetic */ boolean a(long j10, int i10) {
        return SystemClock.uptimeMillis() - j10 >= ((long) i10);
    }
}
