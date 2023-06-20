package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.fyber.c.a;
import com.iab.omid.library.fyber.d.d;
import com.iab.omid.library.fyber.d.f;
import com.iab.omid.library.fyber.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0318a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f24093a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f24094b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f24095c = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f24096l = new Runnable() { // from class: com.iab.omid.library.fyber.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f24097m = new Runnable() { // from class: com.iab.omid.library.fyber.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24095c != null) {
                TreeWalker.f24095c.post(TreeWalker.f24096l);
                TreeWalker.f24095c.postDelayed(TreeWalker.f24097m, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f24099e;

    /* renamed from: k  reason: collision with root package name */
    private long f24105k;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24098d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f24100f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.fyber.e.a> f24101g = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private a f24103i = new a();

    /* renamed from: h  reason: collision with root package name */
    private com.iab.omid.library.fyber.c.b f24102h = new com.iab.omid.library.fyber.c.b();

    /* renamed from: j  reason: collision with root package name */
    private b f24104j = new b(new com.iab.omid.library.fyber.walking.a.c());

    /* loaded from: classes3.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: classes3.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    TreeWalker() {
    }

    private void a(long j10) {
        if (this.f24098d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24098d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24099e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24099e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.fyber.c.a aVar, JSONObject jSONObject, c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.fyber.c.a b10 = this.f24102h.b();
        String a10 = this.f24103i.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.fyber.d.b.a(a11, str);
            com.iab.omid.library.fyber.d.b.b(a11, a10);
            com.iab.omid.library.fyber.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f24103i.a(view);
        if (a10 != null) {
            com.iab.omid.library.fyber.d.b.a(jSONObject, a10);
            com.iab.omid.library.fyber.d.b.a(jSONObject, Boolean.valueOf(this.f24103i.d(view)));
            this.f24103i.e();
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0319a b10 = this.f24103i.b(view);
        if (b10 != null) {
            com.iab.omid.library.fyber.d.b.a(jSONObject, b10);
            return true;
        }
        return false;
    }

    public static TreeWalker getInstance() {
        return f24093a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f24099e = 0;
        this.f24101g.clear();
        this.f24100f = false;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.b.a.a().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b()) {
                this.f24100f = true;
                break;
            }
        }
        this.f24105k = d.a();
    }

    private void j() {
        a(d.a() - this.f24105k);
    }

    private void k() {
        if (f24095c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24095c = handler;
            handler.post(f24096l);
            f24095c.postDelayed(f24097m, 200L);
        }
    }

    private void l() {
        Handler handler = f24095c;
        if (handler != null) {
            handler.removeCallbacks(f24097m);
            f24095c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.fyber.c.a.InterfaceC0318a
    public void a(View view, com.iab.omid.library.fyber.c.a aVar, JSONObject jSONObject, boolean z10) {
        c c10;
        if (f.d(view) && (c10 = this.f24103i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.fyber.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                boolean z11 = z10 || b(view, a10);
                if (this.f24100f && c10 == c.OBSTRUCTION_VIEW && !z11) {
                    this.f24101g.add(new com.iab.omid.library.fyber.e.a(view));
                }
                a(view, aVar, a10, c10, z11);
            }
            this.f24099e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24098d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24098d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f24098d.clear();
        f24094b.post(new Runnable() { // from class: com.iab.omid.library.fyber.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f24104j.a();
            }
        });
    }

    public void c() {
        l();
    }

    void d() {
        this.f24103i.c();
        long a10 = d.a();
        com.iab.omid.library.fyber.c.a a11 = this.f24102h.a();
        if (this.f24103i.b().size() > 0) {
            Iterator<String> it = this.f24103i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f24103i.b(next), a12);
                com.iab.omid.library.fyber.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24104j.b(a12, hashSet, a10);
            }
        }
        if (this.f24103i.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW, false);
            com.iab.omid.library.fyber.d.b.a(a13);
            this.f24104j.a(a13, this.f24103i.a(), a10);
            if (this.f24100f) {
                for (com.iab.omid.library.fyber.adsession.a aVar : com.iab.omid.library.fyber.b.a.a().c()) {
                    aVar.a(this.f24101g);
                }
            }
        } else {
            this.f24104j.a();
        }
        this.f24103i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24098d.contains(treeWalkerTimeLogger)) {
            this.f24098d.remove(treeWalkerTimeLogger);
        }
    }
}
