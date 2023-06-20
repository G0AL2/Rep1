package y2;

import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import y2.b;
import y2.h;
import y2.i;
import y2.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProxyTask.java */
/* loaded from: classes.dex */
public class g extends y2.a {

    /* renamed from: o  reason: collision with root package name */
    private final Socket f39216o;

    /* renamed from: p  reason: collision with root package name */
    private final e f39217p;

    /* renamed from: q  reason: collision with root package name */
    private final y2.d f39218q;

    /* renamed from: r  reason: collision with root package name */
    private volatile y2.b f39219r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f39220s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0543b {
        a() {
        }

        @Override // y2.b.InterfaceC0543b
        public void a(y2.b bVar) {
            g.this.f39131c.addAndGet(bVar.f39131c.get());
            g.this.f39132d.addAndGet(bVar.f39132d.get());
            synchronized (bVar.f39145q) {
                bVar.f39145q.notifyAll();
            }
            if (bVar.h()) {
                g.this.f39218q.i(g.this.k(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public class b extends com.bytedance.sdk.component.f.g {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.component.f.f f39222d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, String str, com.bytedance.sdk.component.f.f fVar) {
            super(str);
            this.f39222d = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39222d.run();
        }
    }

    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        z2.a f39223a;

        /* renamed from: b  reason: collision with root package name */
        a3.c f39224b;

        /* renamed from: c  reason: collision with root package name */
        Socket f39225c;

        /* renamed from: d  reason: collision with root package name */
        e f39226d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c a(a3.c cVar) {
            if (cVar != null) {
                this.f39224b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c b(Socket socket) {
            if (socket != null) {
                this.f39225c = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c c(e eVar) {
            this.f39226d = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g d() {
            if (this.f39224b != null && this.f39225c != null) {
                return new g(this);
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f39227a;

        /* renamed from: b  reason: collision with root package name */
        private int f39228b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f39229c;

        d(OutputStream outputStream, int i10) {
            this.f39227a = outputStream;
            this.f39228b = i10;
        }

        void a(byte[] bArr, int i10, int i11) throws b3.d {
            if (this.f39229c) {
                return;
            }
            try {
                this.f39227a.write(bArr, i10, i11);
                this.f39229c = true;
            } catch (IOException e10) {
                throw new b3.d(e10);
            }
        }

        boolean b() {
            return this.f39229c;
        }

        int c() {
            return this.f39228b;
        }

        void d(byte[] bArr, int i10, int i11) throws b3.d {
            try {
                this.f39227a.write(bArr, i10, i11);
                this.f39228b += i11;
            } catch (IOException e10) {
                throw new b3.d(e10);
            }
        }
    }

    /* compiled from: ProxyTask.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(g gVar);

        void b(g gVar);
    }

    g(c cVar) {
        super(cVar.f39223a, cVar.f39224b);
        this.f39220s = true;
        this.f39216o = cVar.f39225c;
        this.f39217p = cVar.f39226d;
        this.f39218q = y2.d.o();
    }

    private void m(a3.a aVar, File file, d dVar, k.a aVar2) throws IOException, b3.d, h.a, b3.a, b3.b {
        com.bytedance.sdk.component.f.f fVar;
        h hVar;
        y2.b bVar;
        if (!dVar.b()) {
            byte[] q10 = q(aVar, dVar, aVar2);
            i();
            if (q10 == null) {
                return;
            }
            dVar.a(q10, 0, q10.length);
        }
        h hVar2 = null;
        if (aVar == null && (aVar = this.f39130b.a(this.f39136h, this.f39137i.f39233c.f39234a)) == null) {
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
            }
            q(null, dVar, aVar2);
            aVar = this.f39130b.a(this.f39136h, this.f39137i.f39233c.f39234a);
            if (aVar == null) {
                throw new b3.c("failed to get header, rawKey: " + this.f39135g + ", url: " + aVar2);
            }
        }
        if (file.length() >= aVar.f53c || !((bVar = this.f39219r) == null || bVar.f() || bVar.h())) {
            fVar = null;
        } else {
            y2.b j10 = new b.a().i(this.f39129a).b(this.f39130b).d(this.f39135g).k(this.f39136h).h(new k(aVar2.f39256a)).e(this.f39134f).g(this.f39137i).f(new a()).j();
            this.f39219r = j10;
            fVar = new com.bytedance.sdk.component.f.f(j10, null, 10, 1);
            com.bytedance.sdk.component.f.e.a(new b(this, "processCacheNetWorkConcurrent", fVar));
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
            }
        }
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        try {
            hVar = new h(file, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            hVar.c(dVar.c());
            int min = this.f39137i.f39233c.f39238e > 0 ? Math.min(aVar.f53c, this.f39137i.f39233c.f39238e) : aVar.f53c;
            while (dVar.c() < min) {
                i();
                int a10 = hVar.a(bArr);
                if (a10 <= 0) {
                    y2.b bVar2 = this.f39219r;
                    if (bVar2 != null) {
                        b3.b n10 = bVar2.n();
                        if (n10 == null) {
                            h.a m10 = bVar2.m();
                            if (m10 != null) {
                                throw m10;
                            }
                        } else {
                            throw n10;
                        }
                    }
                    if (bVar2 != null && !bVar2.f() && !bVar2.h()) {
                        i();
                        synchronized (bVar2.f39145q) {
                            try {
                                bVar2.f39145q.wait(1000L);
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (y2.e.f39190d) {
                        Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                    }
                    throw new b3.c("illegal state download task has finished, rawKey: " + this.f39135g + ", url: " + aVar2);
                }
                dVar.d(bArr, 0, a10);
                i();
            }
            if (y2.e.f39190d) {
                Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + dVar.c() + ", " + min);
            }
            g();
            hVar.b();
            if (fVar != null) {
                try {
                    fVar.get();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            hVar2 = hVar;
            if (hVar2 != null) {
                hVar2.b();
            }
            if (fVar != null) {
                try {
                    fVar.get();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            }
            throw th;
        }
    }

    private void n(d dVar, k.a aVar) throws b3.d, IOException, h.a, b3.a, b3.b {
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(this.f39137i.f39231a.f39242a)) {
            r(dVar, aVar);
        } else {
            s(dVar, aVar);
        }
    }

    private void o(boolean z10, int i10, int i11, int i12, int i13) {
    }

    private boolean p(d dVar) throws b3.a {
        while (this.f39138j.a()) {
            i();
            k.a b10 = this.f39138j.b();
            try {
                n(dVar, b10);
                return true;
            } catch (b3.b e10) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
                }
                return false;
            } catch (b3.c e11) {
                b10.a();
                e(Boolean.valueOf(k()), this.f39135g, e11);
            } catch (b3.d e12) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e12));
                }
                return true;
            } catch (IOException e13) {
                if (e13 instanceof SocketTimeoutException) {
                    b10.b();
                }
                if (f()) {
                    if (y2.e.f39190d) {
                        if ("Canceled".equalsIgnoreCase(e13.getMessage())) {
                            Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                        } else {
                            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e13));
                        }
                    }
                } else {
                    e(Boolean.valueOf(k()), this.f39135g, e13);
                }
            } catch (h.a e14) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e14));
                }
                this.f39220s = false;
                e(Boolean.valueOf(k()), this.f39135g, e14);
            } catch (Exception e15) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e15));
                }
            }
        }
        return false;
    }

    private byte[] q(a3.a aVar, d dVar, k.a aVar2) throws IOException {
        if (aVar != null) {
            if (y2.e.f39190d) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return f3.a.f(aVar, dVar.c()).getBytes(f3.a.f30091b);
        }
        d3.a b10 = b(aVar2, 0, -1, VersionInfo.GIT_BRANCH);
        if (b10 == null) {
            return null;
        }
        try {
            String h10 = f3.a.h(b10, false, false);
            if (h10 == null) {
                a3.a d10 = f3.a.d(b10, this.f39130b, this.f39136h, this.f39137i.f39233c.f39234a);
                if (y2.e.f39190d) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return f3.a.f(d10, dVar.c()).getBytes(f3.a.f30091b);
            }
            throw new b3.c(h10 + ", rawKey: " + this.f39135g + ", url: " + aVar2);
        } finally {
            f3.a.m(b10.g());
        }
    }

    private void r(d dVar, k.a aVar) throws IOException, b3.d {
        byte[] q10 = q(this.f39130b.a(this.f39136h, this.f39137i.f39233c.f39234a), dVar, aVar);
        if (q10 == null) {
            return;
        }
        dVar.a(q10, 0, q10.length);
    }

    private void s(d dVar, k.a aVar) throws h.a, b3.d, IOException, b3.a, b3.b {
        if (this.f39220s) {
            File c10 = this.f39129a.c(this.f39136h);
            long length = c10.length();
            a3.a a10 = this.f39130b.a(this.f39136h, this.f39137i.f39233c.f39234a);
            int c11 = dVar.c();
            long j10 = length - c11;
            int i10 = (int) j10;
            int i11 = a10 == null ? -1 : a10.f53c;
            if (length > dVar.c()) {
                if (y2.e.f39190d) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + j10);
                }
                o(true, i10, i11, (int) length, c11);
                m(a10, c10, dVar, aVar);
                return;
            }
            o(false, i10, i11, (int) length, c11);
        } else {
            o(false, 0, 0, 0, dVar.c());
        }
        t(dVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad A[EDGE_INSN: B:100:0x01ad->B:70:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #4 {all -> 0x01d9, blocks: (B:30:0x00ef, B:37:0x0100, B:39:0x0104, B:45:0x014e, B:49:0x0160, B:48:0x015e, B:36:0x00fc), top: B:96:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e A[Catch: all -> 0x01d9, TryCatch #4 {all -> 0x01d9, blocks: (B:30:0x00ef, B:37:0x0100, B:39:0x0104, B:45:0x014e, B:49:0x0160, B:48:0x015e, B:36:0x00fc), top: B:96:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f A[Catch: all -> 0x01d5, TryCatch #2 {all -> 0x01d5, blocks: (B:51:0x0169, B:53:0x016f, B:55:0x0174, B:68:0x01a2, B:69:0x01a9, B:70:0x01ad, B:72:0x01b1, B:73:0x01b6, B:58:0x017a), top: B:94:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1 A[Catch: all -> 0x01d5, TryCatch #2 {all -> 0x01d5, blocks: (B:51:0x0169, B:53:0x016f, B:55:0x0174, B:68:0x01a2, B:69:0x01a9, B:70:0x01ad, B:72:0x01b1, B:73:0x01b6, B:58:0x017a), top: B:94:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t(y2.g.d r13, y2.k.a r14) throws b3.d, java.io.IOException, b3.a, b3.b {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.g.t(y2.g$d, y2.k$a):void");
    }

    private d u() {
        try {
            this.f39137i = i.c(this.f39216o.getInputStream());
            OutputStream outputStream = this.f39216o.getOutputStream();
            z2.a aVar = this.f39137i.f39233c.f39234a == 1 ? y2.e.f39187a : y2.e.f39188b;
            if (aVar == null) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.f39129a = aVar;
            this.f39135g = this.f39137i.f39233c.f39235b;
            this.f39136h = this.f39137i.f39233c.f39236c;
            this.f39138j = new k(this.f39137i.f39233c.f39239f);
            this.f39134f = this.f39137i.f39232b;
            if (y2.e.f39190d) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f39137i.toString());
            }
            return new d(outputStream, this.f39137i.f39233c.f39237d);
        } catch (IOException e10) {
            f3.a.q(this.f39216o);
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
            }
            e(this.f39129a == null ? null : Boolean.valueOf(k()), this.f39135g, e10);
            return null;
        } catch (i.d e11) {
            f3.a.q(this.f39216o);
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e11));
            }
            e(this.f39129a == null ? null : Boolean.valueOf(k()), this.f39135g, e11);
            return null;
        }
    }

    private void v() {
        y2.b bVar = this.f39219r;
        this.f39219r = null;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // y2.a
    public void c() {
        super.c();
        v();
    }

    @Override // java.lang.Runnable
    public void run() {
        a3.a a10;
        d u10 = u();
        if (u10 == null) {
            return;
        }
        e eVar = this.f39217p;
        if (eVar != null) {
            eVar.b(this);
        }
        this.f39129a.a(this.f39136h);
        if (y2.e.f39196j != 0 && ((a10 = this.f39130b.a(this.f39136h, this.f39137i.f39233c.f39234a)) == null || this.f39129a.c(this.f39136h).length() < a10.f53c)) {
            this.f39218q.i(k(), this.f39136h);
        }
        try {
            p(u10);
        } catch (b3.a e10) {
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
            }
        } catch (Throwable th) {
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
            }
        }
        this.f39129a.b(this.f39136h);
        this.f39218q.i(k(), null);
        c();
        f3.a.q(this.f39216o);
        e eVar2 = this.f39217p;
        if (eVar2 != null) {
            eVar2.a(this);
        }
    }
}
