package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.c.a;
import com.iab.omid.library.applovin.d.d;
import com.iab.omid.library.applovin.d.f;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0315a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f23975a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f23976b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f23977c = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f23978l = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f23979m = new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f23977c != null) {
                TreeWalker.f23977c.post(TreeWalker.f23978l);
                TreeWalker.f23977c.postDelayed(TreeWalker.f23979m, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f23981e;

    /* renamed from: k  reason: collision with root package name */
    private long f23987k;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f23980d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f23982f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.e.a> f23983g = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private a f23985i = new a();

    /* renamed from: h  reason: collision with root package name */
    private com.iab.omid.library.applovin.c.b f23984h = new com.iab.omid.library.applovin.c.b();

    /* renamed from: j  reason: collision with root package name */
    private b f23986j = new b(new com.iab.omid.library.applovin.walking.a.c());

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
        if (this.f23980d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23980d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23981e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23981e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.c.a aVar, JSONObject jSONObject, c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.c.a b10 = this.f23984h.b();
        String a10 = this.f23985i.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.applovin.d.b.a(a11, str);
            com.iab.omid.library.applovin.d.b.b(a11, a10);
            com.iab.omid.library.applovin.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f23985i.a(view);
        if (a10 != null) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, a10);
            com.iab.omid.library.applovin.d.b.a(jSONObject, Boolean.valueOf(this.f23985i.d(view)));
            this.f23985i.e();
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0316a b10 = this.f23985i.b(view);
        if (b10 != null) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, b10);
            return true;
        }
        return false;
    }

    public static TreeWalker getInstance() {
        return f23975a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f23981e = 0;
        this.f23983g.clear();
        this.f23982f = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.b.a.a().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b()) {
                this.f23982f = true;
                break;
            }
        }
        this.f23987k = d.a();
    }

    private void j() {
        a(d.a() - this.f23987k);
    }

    private void k() {
        if (f23977c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23977c = handler;
            handler.post(f23978l);
            f23977c.postDelayed(f23979m, 200L);
        }
    }

    private void l() {
        Handler handler = f23977c;
        if (handler != null) {
            handler.removeCallbacks(f23979m);
            f23977c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.applovin.c.a.InterfaceC0315a
    public void a(View view, com.iab.omid.library.applovin.c.a aVar, JSONObject jSONObject, boolean z10) {
        c c10;
        if (f.d(view) && (c10 = this.f23985i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.applovin.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                boolean z11 = z10 || b(view, a10);
                if (this.f23982f && c10 == c.OBSTRUCTION_VIEW && !z11) {
                    this.f23983g.add(new com.iab.omid.library.applovin.e.a(view));
                }
                a(view, aVar, a10, c10, z11);
            }
            this.f23981e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23980d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23980d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f23980d.clear();
        f23976b.post(new Runnable() { // from class: com.iab.omid.library.applovin.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f23986j.a();
            }
        });
    }

    public void c() {
        l();
    }

    void d() {
        this.f23985i.c();
        long a10 = d.a();
        com.iab.omid.library.applovin.c.a a11 = this.f23984h.a();
        if (this.f23985i.b().size() > 0) {
            Iterator<String> it = this.f23985i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f23985i.b(next), a12);
                com.iab.omid.library.applovin.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f23986j.b(a12, hashSet, a10);
            }
        }
        if (this.f23985i.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.d.b.a(a13);
            this.f23986j.a(a13, this.f23985i.a(), a10);
            if (this.f23982f) {
                for (com.iab.omid.library.applovin.adsession.a aVar : com.iab.omid.library.applovin.b.a.a().c()) {
                    aVar.a(this.f23983g);
                }
            }
        } else {
            this.f23986j.a();
        }
        this.f23985i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23980d.contains(treeWalkerTimeLogger)) {
            this.f23980d.remove(treeWalkerTimeLogger);
        }
    }
}
