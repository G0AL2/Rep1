package y2;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y2.g;

/* compiled from: ProxyServer.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: m  reason: collision with root package name */
    private static volatile f f39198m;

    /* renamed from: a  reason: collision with root package name */
    private volatile ServerSocket f39199a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f39200b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f39201c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private volatile a3.c f39202d;

    /* renamed from: e  reason: collision with root package name */
    private volatile z2.c f39203e;

    /* renamed from: f  reason: collision with root package name */
    private volatile z2.b f39204f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<Set<g>> f39205g;

    /* renamed from: h  reason: collision with root package name */
    private final g.e f39206h;

    /* renamed from: i  reason: collision with root package name */
    private volatile y2.c f39207i;

    /* renamed from: j  reason: collision with root package name */
    private volatile y2.c f39208j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f39209k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f39210l;

    /* compiled from: ProxyServer.java */
    /* loaded from: classes.dex */
    class a implements g.e {
        a() {
        }

        @Override // y2.g.e
        public void a(g gVar) {
            if (e.f39190d) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + gVar);
            }
            int j10 = gVar.j();
            synchronized (f.this.f39205g) {
                Set set = (Set) f.this.f39205g.get(j10);
                if (set != null) {
                    set.remove(gVar);
                }
            }
        }

        @Override // y2.g.e
        public void b(g gVar) {
            synchronized (f.this.f39205g) {
                Set set = (Set) f.this.f39205g.get(gVar.j());
                if (set != null) {
                    set.add(gVar);
                }
            }
        }
    }

    /* compiled from: ProxyServer.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* compiled from: ProxyServer.java */
        /* loaded from: classes.dex */
        class a extends com.bytedance.sdk.component.f.g {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f39213d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, String str, int i10, g gVar) {
                super(str, i10);
                this.f39213d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f39213d.run();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int i10 = 0;
                f.this.f39199a = new ServerSocket(0, 50, InetAddress.getByName(f.this.y()));
                f fVar = f.this;
                fVar.f39200b = fVar.f39199a.getLocalPort();
                if (f.this.f39200b == -1) {
                    f.l("socket not bound", "");
                    f.this.r();
                    return;
                }
                j.a(f.this.y(), f.this.f39200b);
                if (f.this.v()) {
                    o3.c.j("ProxyServer", "run:  state = ", f.this.f39201c);
                    if (f.this.f39201c.compareAndSet(0, 1)) {
                        o3.c.j("ProxyServer", "run:  state = ", f.this.f39201c);
                        if (e.f39190d) {
                            o3.c.h("ProxyServer", "proxy server start!");
                        }
                        while (f.this.f39201c.get() == 1) {
                            try {
                                try {
                                    Socket accept = f.this.f39199a.accept();
                                    a3.c cVar = f.this.f39202d;
                                    if (cVar != null) {
                                        com.bytedance.sdk.component.f.e.a().execute(new a(this, "ProxyTask", 10, new g.c().a(cVar).b(accept).c(f.this.f39206h).d()));
                                    } else {
                                        f3.a.q(accept);
                                    }
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    f.l("accept error", Log.getStackTraceString(e10));
                                    i10++;
                                    if (i10 > 3) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                Log.e("ProxyServer", "proxy server crashed!  " + stackTraceString);
                                f.l("error", stackTraceString);
                            }
                        }
                        if (e.f39190d) {
                            o3.c.h("ProxyServer", "proxy server closed!");
                        }
                        f.this.r();
                    }
                }
            } catch (IOException e11) {
                if (e.f39190d) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e11));
                }
                f.l("create ServerSocket error", Log.getStackTraceString(e11));
                f.this.r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyServer.java */
    /* loaded from: classes.dex */
    public static final class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final String f39214a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39215b;

        c(String str, int i10) {
            this.f39214a = str;
            this.f39215b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                o3.c.h("ProxyServer", "call: ");
                socket = new Socket(this.f39214a, this.f39215b);
            } catch (Throwable th2) {
                socket = null;
                th = th2;
            }
            try {
                socket.setSoTimeout(2000);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("Ping\n".getBytes(f3.a.f30091b));
                outputStream.flush();
                if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    return Boolean.TRUE;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.printStackTrace();
                    o3.c.h("ProxyServer", "call: " + th.getMessage());
                    f.l("ping error", Log.getStackTraceString(th));
                    f3.a.q(socket);
                    return Boolean.FALSE;
                } finally {
                    f3.a.q(socket);
                }
            }
            f3.a.q(socket);
            return Boolean.FALSE;
        }
    }

    private f() {
        SparseArray<Set<g>> sparseArray = new SparseArray<>(2);
        this.f39205g = sparseArray;
        this.f39206h = new a();
        this.f39209k = new b();
        this.f39210l = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static f e() {
        if (f39198m == null) {
            synchronized (f.class) {
                if (f39198m == null) {
                    f39198m = new f();
                }
            }
        }
        return f39198m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f39201c.compareAndSet(1, 2) || this.f39201c.compareAndSet(0, 2)) {
            f3.a.p(this.f39199a);
            s();
        }
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f39205g) {
            int size = this.f39205g.size();
            for (int i10 = 0; i10 < size; i10++) {
                SparseArray<Set<g>> sparseArray = this.f39205g;
                Set<g> set = sparseArray.get(sparseArray.keyAt(i10));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
        com.bytedance.sdk.component.f.f fVar = new com.bytedance.sdk.component.f.f(new c(y(), this.f39200b), 5, 1);
        com.bytedance.sdk.component.f.e.a().submit(fVar);
        x();
        try {
            if (!((Boolean) fVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                l("ping error", "");
                r();
                return false;
            }
            o3.c.h("ProxyServer", "pingTest: ");
            if (e.f39190d) {
                o3.c.h("ProxyServer", "Ping OK!");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            l("ping error", Log.getStackTraceString(th));
            r();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private void x() {
        Socket socket;
        ?? r02 = 0;
        r02 = 0;
        try {
            try {
                r02 = this.f39199a.accept();
                r02.setSoTimeout(2000);
                boolean equals = "Ping".equals(new BufferedReader(new InputStreamReader(r02.getInputStream())).readLine());
                socket = r02;
                if (equals) {
                    OutputStream outputStream = r02.getOutputStream();
                    outputStream.write("OK\n".getBytes(f3.a.f30091b));
                    outputStream.flush();
                    socket = r02;
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                l("ping error", Log.getStackTraceString(e10));
                socket = r02;
            }
            f3.a.q(socket);
            r02 = "ProxyServer";
            o3.c.h("ProxyServer", "answerPing: ");
        } catch (Throwable th) {
            f3.a.q(r02);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String y() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    public String c(boolean z10, boolean z11, String str, String... strArr) {
        String str2;
        if (strArr != null && strArr.length != 0) {
            if (TextUtils.isEmpty(str)) {
                l("key", "key is empty");
                return strArr[0];
            } else if (this.f39202d == null) {
                l("db", "VideoProxyDB is null");
                return strArr[0];
            } else {
                if ((z10 ? this.f39204f : this.f39203e) == null) {
                    l("cache", "Cache is null");
                    return strArr[0];
                }
                int i10 = this.f39201c.get();
                if (i10 != 1) {
                    l("state", "ProxyServer is not running, " + i10);
                    return strArr[0];
                }
                List<String> k10 = f3.a.k(strArr);
                if (k10 == null) {
                    l(ImagesContract.URL, "url not start with http/https");
                    return strArr[0];
                }
                String a10 = i.a(str, z11 ? str : o3.b.a(str), k10);
                if (a10 == null) {
                    l(ImagesContract.URL, "combine proxy url error");
                    return strArr[0];
                }
                if (z10) {
                    str2 = "https://" + y() + ":" + this.f39200b + "?f=1&" + a10;
                } else {
                    str2 = "https://" + y() + ":" + this.f39200b + "?" + a10;
                }
                return str2.replaceFirst("s", "");
            }
        }
        l(ImagesContract.URL, "url is empty");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a3.c cVar) {
        this.f39202d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(z2.c cVar) {
        this.f39203e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(int i10, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.f39205g) {
            Set<g> set = this.f39205g.get(i10);
            if (set != null) {
                for (g gVar : set) {
                    if (gVar != null && str.equals(gVar.f39136h)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2.c k() {
        return this.f39207i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2.c m() {
        return this.f39208j;
    }

    public void p() {
        if (this.f39210l.compareAndSet(false, true)) {
            Thread thread = new Thread(this.f39209k);
            thread.setName("tt_pangle_thread_proxy_server");
            thread.start();
        }
    }
}
