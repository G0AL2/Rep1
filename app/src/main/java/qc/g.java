package qc;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import qc.k;
import tb.q;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes3.dex */
public class g implements j, k {

    /* renamed from: f */
    private static final ThreadFactory f36067f = new ThreadFactory() { // from class: qc.d
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return g.f(runnable);
        }
    };

    /* renamed from: a */
    private final sc.b<l> f36068a;

    /* renamed from: b */
    private final Context f36069b;

    /* renamed from: c */
    private final sc.b<cd.i> f36070c;

    /* renamed from: d */
    private final Set<h> f36071d;

    /* renamed from: e */
    private final Executor f36072e;

    private g(final Context context, final String str, Set<h> set, sc.b<cd.i> bVar) {
        this(new sc.b() { // from class: qc.e
            @Override // sc.b
            public final Object get() {
                return g.c(context, str);
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f36067f), bVar, context);
    }

    public static /* synthetic */ l c(Context context, String str) {
        return k(context, str);
    }

    public static /* synthetic */ g d(tb.e eVar) {
        return i(eVar);
    }

    public static /* synthetic */ String e(g gVar) {
        return gVar.j();
    }

    public static /* synthetic */ Thread f(Runnable runnable) {
        return m(runnable);
    }

    public static /* synthetic */ Void g(g gVar) {
        return gVar.l();
    }

    public static tb.d<g> h() {
        return tb.d.d(g.class, j.class, k.class).b(q.j(Context.class)).b(q.j(ob.e.class)).b(q.l(h.class)).b(q.k(cd.i.class)).f(new tb.h() { // from class: qc.f
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return g.d(eVar);
            }
        }).d();
    }

    public static /* synthetic */ g i(tb.e eVar) {
        return new g((Context) eVar.a(Context.class), ((ob.e) eVar.a(ob.e.class)).r(), eVar.c(h.class), eVar.d(cd.i.class));
    }

    public /* synthetic */ String j() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            l lVar = this.f36068a.get();
            List<m> c10 = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                m mVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(MediationMetaData.KEY_VERSION, "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ l k(Context context, String str) {
        return new l(context, str);
    }

    public /* synthetic */ Void l() throws Exception {
        synchronized (this) {
            this.f36068a.get().k(System.currentTimeMillis(), this.f36070c.get().a());
        }
        return null;
    }

    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // qc.j
    public Task<String> a() {
        if (!e0.k.a(this.f36069b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f36072e, new Callable() { // from class: qc.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.e(g.this);
            }
        });
    }

    @Override // qc.k
    public synchronized k.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.f36068a.get();
        if (lVar.i(currentTimeMillis)) {
            lVar.g();
            return k.a.GLOBAL;
        }
        return k.a.NONE;
    }

    public Task<Void> n() {
        if (this.f36071d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!e0.k.a(this.f36069b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f36072e, new Callable() { // from class: qc.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.g(g.this);
            }
        });
    }

    g(sc.b<l> bVar, Set<h> set, Executor executor, sc.b<cd.i> bVar2, Context context) {
        this.f36068a = bVar;
        this.f36071d = set;
        this.f36072e = executor;
        this.f36070c = bVar2;
        this.f36069b = context;
    }
}
