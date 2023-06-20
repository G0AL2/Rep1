package y2;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y2.b;
import y2.i;

/* compiled from: Preloader.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: n  reason: collision with root package name */
    private static volatile d f39159n;

    /* renamed from: a  reason: collision with root package name */
    private volatile int f39160a = 163840;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Map<String, y2.b>> f39161b;

    /* renamed from: c  reason: collision with root package name */
    private final g<Runnable> f39162c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f39163d;

    /* renamed from: e  reason: collision with root package name */
    private volatile a3.c f39164e;

    /* renamed from: f  reason: collision with root package name */
    private volatile z2.c f39165f;

    /* renamed from: g  reason: collision with root package name */
    private volatile z2.b f39166g;

    /* renamed from: h  reason: collision with root package name */
    private final HashSet<f> f39167h;

    /* renamed from: i  reason: collision with root package name */
    private final b.InterfaceC0543b f39168i;

    /* renamed from: j  reason: collision with root package name */
    private volatile y2.c f39169j;

    /* renamed from: k  reason: collision with root package name */
    private volatile y2.c f39170k;

    /* renamed from: l  reason: collision with root package name */
    private volatile String f39171l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f39172m;

    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    class a implements b.InterfaceC0543b {
        a() {
        }

        @Override // y2.b.InterfaceC0543b
        public void a(y2.b bVar) {
            int j10 = bVar.j();
            synchronized (d.this.f39161b) {
                Map map = (Map) d.this.f39161b.get(j10);
                if (map != null) {
                    map.remove(bVar.f39136h);
                }
            }
            if (y2.e.f39190d) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + bVar.f39136h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public class b extends com.bytedance.sdk.component.f.g {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39174d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f39175e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f39176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z10, boolean z11, String str2) {
            super(str);
            this.f39174d = z10;
            this.f39175e = z11;
            this.f39176f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            y2.b bVar;
            synchronized (d.this.f39161b) {
                Map map = (Map) d.this.f39161b.get(a3.b.a(this.f39174d));
                if (map != null) {
                    bVar = (y2.b) map.remove(this.f39175e ? this.f39176f : o3.b.a(this.f39176f));
                } else {
                    bVar = null;
                }
            }
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    class c extends com.bytedance.sdk.component.f.g {
        c(String str) {
            super(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<y2.b> arrayList = new ArrayList();
            synchronized (d.this.f39161b) {
                int size = d.this.f39161b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Map map = (Map) d.this.f39161b.get(d.this.f39161b.keyAt(i10));
                    if (map != null) {
                        arrayList.addAll(map.values());
                        map.clear();
                    }
                }
                d.this.f39162c.clear();
            }
            for (y2.b bVar : arrayList) {
                bVar.c();
                if (y2.e.f39190d) {
                    Log.w("TAG_PROXY_Preloader", "PreloadTask: " + bVar + ", canceled!!!");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Preloader.java */
    /* renamed from: y2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0544d implements ThreadFactory {

        /* compiled from: Preloader.java */
        /* renamed from: y2.d$d$a */
        /* loaded from: classes.dex */
        class a extends Thread {
            a(ThreadFactoryC0544d threadFactoryC0544d, Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                super.run();
            }
        }

        ThreadFactoryC0544d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            a aVar = new a(this, runnable);
            aVar.setName("tt_pangle_thread_video_preload_" + aVar.getId());
            aVar.setDaemon(true);
            if (y2.e.f39190d) {
                Log.i("TAG_PROXY_Preloader", "new preload thead: " + aVar.getName());
            }
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public static class e implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f39179a;

        e(g gVar) {
            this.f39179a = gVar;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                this.f39179a.offerFirst(runnable);
                if (y2.e.f39190d) {
                    Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f39180a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f39181b;

        /* renamed from: c  reason: collision with root package name */
        final int f39182c;

        /* renamed from: d  reason: collision with root package name */
        final String f39183d;

        /* renamed from: e  reason: collision with root package name */
        final Map<String, String> f39184e;

        /* renamed from: f  reason: collision with root package name */
        final String[] f39185f;

        f(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String[] strArr) {
            this.f39180a = z10;
            this.f39181b = z11;
            this.f39182c = i10;
            this.f39183d = str;
            this.f39184e = map;
            this.f39185f = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f39180a == fVar.f39180a && this.f39181b == fVar.f39181b && this.f39182c == fVar.f39182c) {
                return this.f39183d.equals(fVar.f39183d);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f39180a ? 1 : 0) * 31) + (this.f39181b ? 1 : 0)) * 31) + this.f39182c) * 31) + this.f39183d.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Preloader.java */
    /* loaded from: classes.dex */
    public static final class g<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a  reason: collision with root package name */
        private ThreadPoolExecutor f39186a;

        private g() {
        }

        public void a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f39186a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
                if (threadPoolExecutor != null) {
                    this.f39186a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t10) {
            synchronized (this) {
                int poolSize = this.f39186a.getPoolSize();
                int activeCount = this.f39186a.getActiveCount();
                int maximumPoolSize = this.f39186a.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    if (y2.e.f39190d) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
                return offerFirst(t10);
            }
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private d() {
        SparseArray<Map<String, y2.b>> sparseArray = new SparseArray<>(2);
        this.f39161b = sparseArray;
        this.f39167h = new HashSet<>();
        this.f39168i = new a();
        g<Runnable> gVar = new g<>(null);
        this.f39162c = gVar;
        ExecutorService b10 = b(gVar);
        this.f39163d = b10;
        gVar.a((ThreadPoolExecutor) b10);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    private static ExecutorService b(g<Runnable> gVar) {
        int a10 = f3.a.a();
        return new ThreadPoolExecutor(0, a10 < 1 ? 1 : a10 > 4 ? 4 : a10, 60L, TimeUnit.SECONDS, gVar, new ThreadFactoryC0544d(), new e(gVar));
    }

    public static d o() {
        if (f39159n == null) {
            synchronized (d.class) {
                if (f39159n == null) {
                    f39159n = new d();
                }
            }
        }
        return f39159n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2.c c() {
        return this.f39169j;
    }

    public void d(int i10) {
        if (i10 > 0) {
            this.f39160a = i10;
        }
        if (y2.e.f39190d) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + i10);
        }
    }

    public synchronized void e(long j10, long j11, long j12) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a3.c cVar) {
        this.f39164e = cVar;
    }

    public void g(String str) {
        l(false, false, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(z2.c cVar) {
        this.f39165f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z10, String str) {
        y2.b remove;
        this.f39171l = str;
        this.f39172m = z10;
        if (y2.e.f39190d) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, " + str);
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.f39167h) {
                if (!this.f39167h.isEmpty()) {
                    hashSet2 = new HashSet(this.f39167h);
                    this.f39167h.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    j(fVar.f39180a, fVar.f39181b, fVar.f39182c, fVar.f39183d, fVar.f39184e, fVar.f39185f);
                    if (y2.e.f39190d) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + fVar.f39183d);
                    }
                }
                return;
            }
            return;
        }
        int i10 = y2.e.f39196j;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 1) {
                synchronized (this.f39161b) {
                    Map<String, y2.b> map = this.f39161b.get(a3.b.a(z10));
                    remove = map != null ? map.remove(str) : null;
                }
                if (remove != null) {
                    remove.c();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.f39161b) {
            int size = this.f39161b.size();
            for (int i11 = 0; i11 < size; i11++) {
                SparseArray<Map<String, y2.b>> sparseArray = this.f39161b;
                Map<String, y2.b> map2 = sparseArray.get(sparseArray.keyAt(i11));
                if (map2 != null) {
                    Collection<y2.b> values = map2.values();
                    if (values != null && !values.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(values);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            y2.b bVar = (y2.b) it2.next();
            bVar.c();
            if (y2.e.f39190d) {
                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + bVar.f39135g);
            }
        }
        if (i10 == 3) {
            synchronized (this.f39167h) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    f fVar2 = (f) ((y2.b) it3.next()).f39146r;
                    if (fVar2 != null) {
                        this.f39167h.add(fVar2);
                    }
                }
            }
        }
    }

    public void j(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String... strArr) {
        boolean z12 = y2.e.f39190d;
        if (z12) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        z2.a aVar = z10 ? this.f39166g : this.f39165f;
        a3.c cVar = this.f39164e;
        if (aVar == null || cVar == null) {
            if (z12) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
            }
        } else if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            int i11 = i10 <= 0 ? this.f39160a : i10;
            String a10 = z11 ? str : o3.b.a(str);
            File d10 = aVar.d(a10);
            if (d10 != null && d10.length() >= i11) {
                if (z12) {
                    Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + d10.length() + ", need preload size: " + i11);
                }
            } else if (y2.f.e().i(a3.b.a(z10), a10)) {
                if (z12) {
                    Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: " + str);
                }
            } else {
                synchronized (this.f39161b) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        Map<String, y2.b> map2 = this.f39161b.get(z10 ? 1 : 0);
                        if (map2.containsKey(a10)) {
                            return;
                        }
                        int i12 = i11;
                        f fVar = new f(z10, z11, i11, str, map, strArr);
                        String str2 = this.f39171l;
                        if (str2 != null) {
                            int i13 = y2.e.f39196j;
                            if (i13 == 3) {
                                synchronized (this.f39167h) {
                                    this.f39167h.add(fVar);
                                }
                                if (z12) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                                }
                                return;
                            } else if (i13 == 2) {
                                if (z12) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + str);
                                }
                                return;
                            } else if (i13 == 1 && this.f39172m == z10 && str2.equals(a10)) {
                                if (z12) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                                }
                                return;
                            }
                        }
                        ArrayList arrayList = null;
                        List<i.b> i14 = f3.a.i(f3.a.j(map));
                        if (i14 != null) {
                            arrayList = new ArrayList(i14.size());
                            int size = i14.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                i.b bVar = i14.get(i15);
                                if (bVar != null) {
                                    arrayList.add(new i.b(bVar.f39240a, bVar.f39241b));
                                }
                            }
                        }
                        y2.b j10 = new b.a().i(aVar).b(cVar).d(str).k(a10).h(new k(f3.a.k(strArr))).e(arrayList).a(i12).f(this.f39168i).c(fVar).j();
                        map2.put(a10, j10);
                        this.f39163d.execute(j10);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
    }

    public void k(boolean z10, boolean z11, int i10, String str, String... strArr) {
        j(z10, z11, i10, str, null, strArr);
    }

    public void l(boolean z10, boolean z11, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3.a.l(new b("cancel b b S", z10, z11, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2.c m() {
        return this.f39170k;
    }

    public void p() {
        f3.a.l(new c("cancelAll"));
    }
}
