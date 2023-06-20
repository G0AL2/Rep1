package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.c.a;
import com.iab.omid.library.ironsrc.d.d;
import com.iab.omid.library.ironsrc.d.f;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0324a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f24323a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f24324b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f24325c = null;

    /* renamed from: j  reason: collision with root package name */
    private static final Runnable f24326j = new Runnable() { // from class: com.iab.omid.library.ironsrc.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private static final Runnable f24327k = new Runnable() { // from class: com.iab.omid.library.ironsrc.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f24325c != null) {
                TreeWalker.f24325c.post(TreeWalker.f24326j);
                TreeWalker.f24325c.postDelayed(TreeWalker.f24327k, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f24329e;

    /* renamed from: i  reason: collision with root package name */
    private long f24333i;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24328d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private a f24331g = new a();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.c.b f24330f = new com.iab.omid.library.ironsrc.c.b();

    /* renamed from: h  reason: collision with root package name */
    private b f24332h = new b(new com.iab.omid.library.ironsrc.walking.a.c());

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
        if (this.f24328d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24328d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24329e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24329e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.ironsrc.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.c.a b10 = this.f24330f.b();
        String a10 = this.f24331g.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.ironsrc.d.b.a(a11, str);
            com.iab.omid.library.ironsrc.d.b.b(a11, a10);
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f24331g.a(view);
        if (a10 != null) {
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, a10);
            this.f24331g.e();
            return true;
        }
        return false;
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0325a b10 = this.f24331g.b(view);
        if (b10 != null) {
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, b10);
        }
    }

    public static TreeWalker getInstance() {
        return f24323a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f24329e = 0;
        this.f24333i = d.a();
    }

    private void j() {
        a(d.a() - this.f24333i);
    }

    private void k() {
        if (f24325c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24325c = handler;
            handler.post(f24326j);
            f24325c.postDelayed(f24327k, 200L);
        }
    }

    private void l() {
        Handler handler = f24325c;
        if (handler != null) {
            handler.removeCallbacks(f24327k);
            f24325c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.ironsrc.c.a.InterfaceC0324a
    public void a(View view, com.iab.omid.library.ironsrc.c.a aVar, JSONObject jSONObject) {
        c c10;
        if (f.d(view) && (c10 = this.f24331g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                b(view, a10);
                a(view, aVar, a10, c10);
            }
            this.f24329e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24328d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24328d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f24328d.clear();
        f24324b.post(new Runnable() { // from class: com.iab.omid.library.ironsrc.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f24332h.a();
            }
        });
    }

    public void c() {
        l();
    }

    void d() {
        this.f24331g.c();
        long a10 = d.a();
        com.iab.omid.library.ironsrc.c.a a11 = this.f24330f.a();
        if (this.f24331g.b().size() > 0) {
            Iterator<String> it = this.f24331g.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f24331g.b(next), a12);
                com.iab.omid.library.ironsrc.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24332h.b(a12, hashSet, a10);
            }
        }
        if (this.f24331g.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW);
            com.iab.omid.library.ironsrc.d.b.a(a13);
            this.f24332h.a(a13, this.f24331g.a(), a10);
        } else {
            this.f24332h.a();
        }
        this.f24331g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24328d.contains(treeWalkerTimeLogger)) {
            this.f24328d.remove(treeWalkerTimeLogger);
        }
    }
}
