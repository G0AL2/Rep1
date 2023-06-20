package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.c.a;
import com.iab.omid.library.inmobi.d.d;
import com.iab.omid.library.inmobi.d.f;
import com.iab.omid.library.inmobi.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0321a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f24209a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f24210b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f24211c = null;

    /* renamed from: j  reason: collision with root package name */
    private static final Runnable f24212j = new Runnable() { // from class: com.iab.omid.library.inmobi.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private static final Runnable f24213k = new Runnable() { // from class: com.iab.omid.library.inmobi.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24211c != null) {
                TreeWalker.f24211c.post(TreeWalker.f24212j);
                TreeWalker.f24211c.postDelayed(TreeWalker.f24213k, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f24215e;

    /* renamed from: i  reason: collision with root package name */
    private long f24219i;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24214d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private a f24217g = new a();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.inmobi.c.b f24216f = new com.iab.omid.library.inmobi.c.b();

    /* renamed from: h  reason: collision with root package name */
    private b f24218h = new b(new com.iab.omid.library.inmobi.walking.a.c());

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
        if (this.f24214d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24214d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24215e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24215e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.inmobi.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.c.a b10 = this.f24216f.b();
        String a10 = this.f24217g.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.inmobi.d.b.a(a11, str);
            com.iab.omid.library.inmobi.d.b.b(a11, a10);
            com.iab.omid.library.inmobi.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f24217g.a(view);
        if (a10 != null) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject, a10);
            this.f24217g.e();
            return true;
        }
        return false;
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0322a b10 = this.f24217g.b(view);
        if (b10 != null) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject, b10);
        }
    }

    public static TreeWalker getInstance() {
        return f24209a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f24215e = 0;
        this.f24219i = d.a();
    }

    private void j() {
        a(d.a() - this.f24219i);
    }

    private void k() {
        if (f24211c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24211c = handler;
            handler.post(f24212j);
            f24211c.postDelayed(f24213k, 200L);
        }
    }

    private void l() {
        Handler handler = f24211c;
        if (handler != null) {
            handler.removeCallbacks(f24213k);
            f24211c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.inmobi.c.a.InterfaceC0321a
    public void a(View view, com.iab.omid.library.inmobi.c.a aVar, JSONObject jSONObject) {
        c c10;
        if (f.d(view) && (c10 = this.f24217g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.inmobi.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                b(view, a10);
                a(view, aVar, a10, c10);
            }
            this.f24215e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24214d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24214d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f24214d.clear();
        f24210b.post(new Runnable() { // from class: com.iab.omid.library.inmobi.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f24218h.a();
            }
        });
    }

    public void c() {
        l();
    }

    void d() {
        this.f24217g.c();
        long a10 = d.a();
        com.iab.omid.library.inmobi.c.a a11 = this.f24216f.a();
        if (this.f24217g.b().size() > 0) {
            Iterator<String> it = this.f24217g.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f24217g.b(next), a12);
                com.iab.omid.library.inmobi.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f24218h.b(a12, hashSet, a10);
            }
        }
        if (this.f24217g.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW);
            com.iab.omid.library.inmobi.d.b.a(a13);
            this.f24218h.a(a13, this.f24217g.a(), a10);
        } else {
            this.f24218h.a();
        }
        this.f24217g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24214d.contains(treeWalkerTimeLogger)) {
            this.f24214d.remove(treeWalkerTimeLogger);
        }
    }
}
