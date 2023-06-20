package e3;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import y2.d;
import y2.e;
import y2.f;

/* compiled from: VideoCachePreloader.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private b f29553a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCachePreloader.java */
    /* loaded from: classes.dex */
    public class b extends Thread {

        /* renamed from: c  reason: collision with root package name */
        private final Queue<C0371a> f29556c = new ArrayBlockingQueue(10);

        /* renamed from: a  reason: collision with root package name */
        private Queue<C0371a> f29554a = new LinkedBlockingQueue();

        /* renamed from: b  reason: collision with root package name */
        private boolean f29555b = true;

        /* renamed from: d  reason: collision with root package name */
        private Queue<C0371a> f29557d = new LinkedBlockingQueue();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: VideoCachePreloader.java */
        /* renamed from: e3.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0371a {

            /* renamed from: a  reason: collision with root package name */
            public int f29558a;

            /* renamed from: b  reason: collision with root package name */
            public String f29559b;

            /* renamed from: c  reason: collision with root package name */
            public String[] f29560c;

            /* renamed from: d  reason: collision with root package name */
            public int f29561d;

            /* renamed from: e  reason: collision with root package name */
            public String f29562e;

            /* renamed from: f  reason: collision with root package name */
            public l3.c f29563f;

            public C0371a(b bVar) {
            }
        }

        public b(a aVar) {
        }

        private C0371a a(int i10, l3.c cVar) {
            e();
            l.b("VideoCachePreloader", "pool: " + this.f29556c.size());
            C0371a poll = this.f29556c.poll();
            if (poll == null) {
                poll = new C0371a(this);
            }
            poll.f29558a = i10;
            poll.f29563f = cVar;
            return poll;
        }

        private void b() {
        }

        private void c(C0371a c0371a) {
            b();
            c0371a.f29560c = null;
            c0371a.f29559b = null;
            c0371a.f29558a = -1;
            c0371a.f29563f = null;
            this.f29556c.offer(c0371a);
        }

        private void e() {
        }

        private synchronized void f(C0371a c0371a) {
            e();
            this.f29557d.add(c0371a);
            notify();
        }

        private void g() {
            b();
            while (true) {
                C0371a poll = this.f29557d.poll();
                if (poll == null) {
                    return;
                }
                poll.f29559b = poll.f29563f.z();
                poll.f29560c = new String[]{poll.f29563f.z()};
                poll.f29561d = poll.f29563f.h();
                poll.f29562e = poll.f29563f.A();
                if (!TextUtils.isEmpty(poll.f29563f.A())) {
                    poll.f29559b = poll.f29563f.A();
                }
                poll.f29563f = null;
                h(poll);
            }
        }

        private void h(C0371a c0371a) {
            b();
            if (c0371a == null) {
                return;
            }
            this.f29554a.offer(c0371a);
            notify();
        }

        public void d(l3.c cVar) {
            f(a(0, cVar));
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String[] strArr;
            while (this.f29555b) {
                synchronized (this) {
                    if (!this.f29557d.isEmpty()) {
                        g();
                    }
                    while (!this.f29554a.isEmpty()) {
                        C0371a poll = this.f29554a.poll();
                        if (poll != null) {
                            int i10 = poll.f29558a;
                            if (i10 == 0) {
                                String[] strArr2 = poll.f29560c;
                                if (strArr2 != null && strArr2.length > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str : poll.f29560c) {
                                        if (f3.a.r(str)) {
                                            arrayList.add(str);
                                        }
                                    }
                                    d.o().k(false, !TextUtils.isEmpty(poll.f29562e), poll.f29561d, poll.f29559b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                                }
                            } else if (i10 == 1) {
                                d.o().g(poll.f29559b);
                            } else if (i10 == 2) {
                                d.o().p();
                            } else if (i10 == 3) {
                                d.o().p();
                                e.g();
                                if (e.e() != null) {
                                    e.e().g();
                                }
                            } else if (i10 == 4) {
                                d.o().p();
                                this.f29555b = false;
                            }
                            c(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: VideoCachePreloader.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private static final a f29564a = new a();
    }

    static {
        o3.c.k();
    }

    public static a a() {
        return c.f29564a;
    }

    private static z2.c e() {
        File file = new File(i3.b.a().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        z2.c cVar = null;
        try {
            z2.c cVar2 = new z2.c(file);
            try {
                cVar2.h(104857600L);
                return cVar2;
            } catch (IOException e10) {
                e = e10;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public boolean b(l3.c cVar) {
        if (d()) {
            this.f29553a.d(cVar);
            return true;
        }
        return false;
    }

    public String c(l3.c cVar) {
        if (cVar == null) {
            return null;
        }
        boolean z10 = !TextUtils.isEmpty(cVar.A());
        return f.e().c(false, z10, z10 ? cVar.A() : cVar.z(), cVar.z());
    }

    public boolean d() {
        if (this.f29553a != null) {
            return true;
        }
        z2.c e10 = e();
        if (e10 == null) {
            return false;
        }
        e.d(true);
        e.f(true);
        e.b(1);
        f.e().p();
        try {
            b bVar = new b(this);
            this.f29553a = bVar;
            bVar.setName("tt_pangle_thread_video_cache_preloader");
            this.f29553a.start();
            e.c(e10, i3.b.a());
            d.o().e(30000L, 30000L, 30000L);
            d.o().d(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private a() {
        new HashMap();
        d();
    }
}
