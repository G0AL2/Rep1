package lf;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ee.u;
import fe.o;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import lf.g;
import mf.i;
import qe.k;
import qe.q;
import qe.s;
import ve.p;
import ye.a0;
import ye.b0;
import ye.d0;
import ye.h0;
import ye.i0;
import ye.r;
import ye.z;

/* compiled from: RealWebSocket.kt */
/* loaded from: classes3.dex */
public final class d implements h0, g.a {

    /* renamed from: z  reason: collision with root package name */
    private static final List<a0> f34057z;

    /* renamed from: a  reason: collision with root package name */
    private final String f34058a;

    /* renamed from: b  reason: collision with root package name */
    private ye.e f34059b;

    /* renamed from: c  reason: collision with root package name */
    private cf.a f34060c;

    /* renamed from: d  reason: collision with root package name */
    private lf.g f34061d;

    /* renamed from: e  reason: collision with root package name */
    private lf.h f34062e;

    /* renamed from: f  reason: collision with root package name */
    private cf.d f34063f;

    /* renamed from: g  reason: collision with root package name */
    private String f34064g;

    /* renamed from: h  reason: collision with root package name */
    private AbstractC0446d f34065h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayDeque<i> f34066i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<Object> f34067j;

    /* renamed from: k  reason: collision with root package name */
    private long f34068k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34069l;

    /* renamed from: m  reason: collision with root package name */
    private int f34070m;

    /* renamed from: n  reason: collision with root package name */
    private String f34071n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f34072o;

    /* renamed from: p  reason: collision with root package name */
    private int f34073p;

    /* renamed from: q  reason: collision with root package name */
    private int f34074q;

    /* renamed from: r  reason: collision with root package name */
    private int f34075r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f34076s;

    /* renamed from: t  reason: collision with root package name */
    private final b0 f34077t;

    /* renamed from: u  reason: collision with root package name */
    private final i0 f34078u;

    /* renamed from: v  reason: collision with root package name */
    private final Random f34079v;

    /* renamed from: w  reason: collision with root package name */
    private final long f34080w;

    /* renamed from: x  reason: collision with root package name */
    private lf.e f34081x;

    /* renamed from: y  reason: collision with root package name */
    private long f34082y;

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f34083a;

        /* renamed from: b  reason: collision with root package name */
        private final i f34084b;

        /* renamed from: c  reason: collision with root package name */
        private final long f34085c;

        public a(int i10, i iVar, long j10) {
            this.f34083a = i10;
            this.f34084b = iVar;
            this.f34085c = j10;
        }

        public final long a() {
            return this.f34085c;
        }

        public final int b() {
            return this.f34083a;
        }

        public final i c() {
            return this.f34084b;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f34086a;

        /* renamed from: b  reason: collision with root package name */
        private final i f34087b;

        public c(int i10, i iVar) {
            k.f(iVar, "data");
            this.f34086a = i10;
            this.f34087b = iVar;
        }

        public final i a() {
            return this.f34087b;
        }

        public final int b() {
            return this.f34086a;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* renamed from: lf.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0446d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f34088a;

        /* renamed from: b  reason: collision with root package name */
        private final mf.h f34089b;

        /* renamed from: c  reason: collision with root package name */
        private final mf.g f34090c;

        public AbstractC0446d(boolean z10, mf.h hVar, mf.g gVar) {
            k.f(hVar, "source");
            k.f(gVar, "sink");
            this.f34088a = z10;
            this.f34089b = hVar;
            this.f34090c = gVar;
        }

        public final boolean a() {
            return this.f34088a;
        }

        public final mf.g b() {
            return this.f34090c;
        }

        public final mf.h d() {
            return this.f34089b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes3.dex */
    public final class e extends cf.a {
        public e() {
            super(d.this.f34064g + " writer", false, 2, null);
        }

        @Override // cf.a
        public long f() {
            try {
                return d.this.x() ? 0L : -1L;
            } catch (IOException e10) {
                d.this.q(e10, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* loaded from: classes3.dex */
    public static final class f implements ye.f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f34093b;

        f(b0 b0Var) {
            this.f34093b = b0Var;
        }

        @Override // ye.f
        public void onFailure(ye.e eVar, IOException iOException) {
            k.f(eVar, "call");
            k.f(iOException, "e");
            d.this.q(iOException, null);
        }

        @Override // ye.f
        public void onResponse(ye.e eVar, d0 d0Var) {
            k.f(eVar, "call");
            k.f(d0Var, "response");
            df.c l10 = d0Var.l();
            try {
                d.this.n(d0Var, l10);
                k.c(l10);
                AbstractC0446d m10 = l10.m();
                lf.e a10 = lf.e.f34097g.a(d0Var.A());
                d.this.f34081x = a10;
                if (!d.this.t(a10)) {
                    synchronized (d.this) {
                        d.this.f34067j.clear();
                        d.this.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.s(ze.c.f40526h + " WebSocket " + this.f34093b.l().o(), m10);
                    d.this.r().f(d.this, d0Var);
                    d.this.u();
                } catch (Exception e10) {
                    d.this.q(e10, null);
                }
            } catch (IOException e11) {
                if (l10 != null) {
                    l10.u();
                }
                d.this.q(e11, d0Var);
                ze.c.j(d0Var);
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class g extends cf.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34094e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f34095f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j10, d dVar, String str3, AbstractC0446d abstractC0446d, lf.e eVar) {
            super(str2, false, 2, null);
            this.f34094e = j10;
            this.f34095f = dVar;
        }

        @Override // cf.a
        public long f() {
            this.f34095f.y();
            return this.f34094e;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class h extends cf.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f34096e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, d dVar, lf.h hVar, i iVar, s sVar, q qVar, s sVar2, s sVar3, s sVar4, s sVar5) {
            super(str2, z11);
            this.f34096e = dVar;
        }

        @Override // cf.a
        public long f() {
            this.f34096e.m();
            return -1L;
        }
    }

    static {
        List<a0> d10;
        new b(null);
        d10 = o.d(a0.HTTP_1_1);
        f34057z = d10;
    }

    public d(cf.e eVar, b0 b0Var, i0 i0Var, Random random, long j10, lf.e eVar2, long j11) {
        k.f(eVar, "taskRunner");
        k.f(b0Var, "originalRequest");
        k.f(i0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        k.f(random, "random");
        this.f34077t = b0Var;
        this.f34078u = i0Var;
        this.f34079v = random;
        this.f34080w = j10;
        this.f34081x = eVar2;
        this.f34082y = j11;
        this.f34063f = eVar.i();
        this.f34066i = new ArrayDeque<>();
        this.f34067j = new ArrayDeque<>();
        this.f34070m = -1;
        if (k.a("GET", b0Var.h())) {
            i.a aVar = i.f34462e;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            u uVar = u.f29813a;
            this.f34058a = i.a.g(aVar, bArr, 0, 0, 3, null).f();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + b0Var.h()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(lf.e eVar) {
        if (!eVar.f34103f && eVar.f34099b == null) {
            Integer num = eVar.f34101d;
            if (num != null) {
                int intValue = num.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    private final void v() {
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        cf.a aVar = this.f34060c;
        if (aVar != null) {
            cf.d.j(this.f34063f, aVar, 0L, 2, null);
        }
    }

    private final synchronized boolean w(i iVar, int i10) {
        if (!this.f34072o && !this.f34069l) {
            if (this.f34068k + iVar.A() > 16777216) {
                f(1001, null);
                return false;
            }
            this.f34068k += iVar.A();
            this.f34067j.add(new c(i10, iVar));
            v();
            return true;
        }
        return false;
    }

    @Override // ye.h0
    public boolean a(String str) {
        k.f(str, "text");
        return w(i.f34462e.d(str), 1);
    }

    @Override // ye.h0
    public boolean b(i iVar) {
        k.f(iVar, "bytes");
        return w(iVar, 2);
    }

    @Override // lf.g.a
    public void c(String str) throws IOException {
        k.f(str, "text");
        this.f34078u.d(this, str);
    }

    @Override // lf.g.a
    public void d(i iVar) throws IOException {
        k.f(iVar, "bytes");
        this.f34078u.e(this, iVar);
    }

    @Override // lf.g.a
    public synchronized void e(i iVar) {
        k.f(iVar, "payload");
        if (!this.f34072o && (!this.f34069l || !this.f34067j.isEmpty())) {
            this.f34066i.add(iVar);
            v();
            this.f34074q++;
        }
    }

    @Override // ye.h0
    public boolean f(int i10, String str) {
        return o(i10, str, 60000L);
    }

    @Override // lf.g.a
    public synchronized void g(i iVar) {
        k.f(iVar, "payload");
        this.f34075r++;
        this.f34076s = false;
    }

    @Override // lf.g.a
    public void h(int i10, String str) {
        AbstractC0446d abstractC0446d;
        lf.g gVar;
        lf.h hVar;
        k.f(str, IronSourceConstants.EVENTS_ERROR_REASON);
        boolean z10 = true;
        if (i10 != -1) {
            synchronized (this) {
                if (this.f34070m != -1) {
                    z10 = false;
                }
                if (z10) {
                    this.f34070m = i10;
                    this.f34071n = str;
                    abstractC0446d = null;
                    if (this.f34069l && this.f34067j.isEmpty()) {
                        AbstractC0446d abstractC0446d2 = this.f34065h;
                        this.f34065h = null;
                        gVar = this.f34061d;
                        this.f34061d = null;
                        hVar = this.f34062e;
                        this.f34062e = null;
                        this.f34063f.n();
                        abstractC0446d = abstractC0446d2;
                    } else {
                        gVar = null;
                        hVar = null;
                    }
                    u uVar = u.f29813a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.f34078u.b(this, i10, str);
                if (abstractC0446d != null) {
                    this.f34078u.a(this, i10, str);
                }
                if (hVar != null) {
                    return;
                }
                return;
            } finally {
                if (abstractC0446d != null) {
                    ze.c.j(abstractC0446d);
                }
                if (gVar != null) {
                    ze.c.j(gVar);
                }
                if (hVar != null) {
                    ze.c.j(hVar);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void m() {
        ye.e eVar = this.f34059b;
        k.c(eVar);
        eVar.cancel();
    }

    public final void n(d0 d0Var, df.c cVar) throws IOException {
        boolean l10;
        boolean l11;
        k.f(d0Var, "response");
        if (d0Var.h() == 101) {
            String z10 = d0.z(d0Var, "Connection", null, 2, null);
            l10 = p.l("Upgrade", z10, true);
            if (l10) {
                String z11 = d0.z(d0Var, "Upgrade", null, 2, null);
                l11 = p.l("websocket", z11, true);
                if (l11) {
                    String z12 = d0.z(d0Var, "Sec-WebSocket-Accept", null, 2, null);
                    i.a aVar = i.f34462e;
                    String f10 = aVar.d(this.f34058a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").y().f();
                    if (!(!k.a(f10, z12))) {
                        if (cVar == null) {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                        return;
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + f10 + "' but was '" + z12 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + z11 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + z10 + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + d0Var.h() + ' ' + d0Var.C() + '\'');
    }

    public final synchronized boolean o(int i10, String str, long j10) {
        lf.f.f34104a.c(i10);
        i iVar = null;
        if (str != null) {
            iVar = i.f34462e.d(str);
            if (!(((long) iVar.A()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        }
        if (!this.f34072o && !this.f34069l) {
            this.f34069l = true;
            this.f34067j.add(new a(i10, iVar, j10));
            v();
            return true;
        }
        return false;
    }

    public final void p(z zVar) {
        k.f(zVar, "client");
        if (this.f34077t.d("Sec-WebSocket-Extensions") != null) {
            q(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        z c10 = zVar.z().j(r.f39743a).R(f34057z).c();
        b0 b10 = this.f34077t.i().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.f34058a).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        df.e eVar = new df.e(c10, b10, true);
        this.f34059b = eVar;
        k.c(eVar);
        eVar.i1(new f(b10));
    }

    public final void q(Exception exc, d0 d0Var) {
        k.f(exc, "e");
        synchronized (this) {
            if (this.f34072o) {
                return;
            }
            this.f34072o = true;
            AbstractC0446d abstractC0446d = this.f34065h;
            this.f34065h = null;
            lf.g gVar = this.f34061d;
            this.f34061d = null;
            lf.h hVar = this.f34062e;
            this.f34062e = null;
            this.f34063f.n();
            u uVar = u.f29813a;
            try {
                this.f34078u.c(this, exc, d0Var);
            } finally {
                if (abstractC0446d != null) {
                    ze.c.j(abstractC0446d);
                }
                if (gVar != null) {
                    ze.c.j(gVar);
                }
                if (hVar != null) {
                    ze.c.j(hVar);
                }
            }
        }
    }

    public final i0 r() {
        return this.f34078u;
    }

    public final void s(String str, AbstractC0446d abstractC0446d) throws IOException {
        k.f(str, "name");
        k.f(abstractC0446d, "streams");
        lf.e eVar = this.f34081x;
        k.c(eVar);
        synchronized (this) {
            this.f34064g = str;
            this.f34065h = abstractC0446d;
            this.f34062e = new lf.h(abstractC0446d.a(), abstractC0446d.b(), this.f34079v, eVar.f34098a, eVar.a(abstractC0446d.a()), this.f34082y);
            this.f34060c = new e();
            long j10 = this.f34080w;
            if (j10 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                String str2 = str + " ping";
                this.f34063f.i(new g(str2, str2, nanos, this, str, abstractC0446d, eVar), nanos);
            }
            if (!this.f34067j.isEmpty()) {
                v();
            }
            u uVar = u.f29813a;
        }
        this.f34061d = new lf.g(abstractC0446d.a(), abstractC0446d.d(), this, eVar.f34098a, eVar.a(!abstractC0446d.a()));
    }

    public final void u() throws IOException {
        while (this.f34070m == -1) {
            lf.g gVar = this.f34061d;
            k.c(gVar);
            gVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:91:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x01af, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:91:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Type inference failed for: r1v10, types: [lf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [qe.s] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, lf.d$d] */
    /* JADX WARN: Type inference failed for: r2v16, types: [lf.g, T] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, lf.h] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [mf.i] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.d.x():boolean");
    }

    public final void y() {
        synchronized (this) {
            if (this.f34072o) {
                return;
            }
            lf.h hVar = this.f34062e;
            if (hVar != null) {
                int i10 = this.f34076s ? this.f34073p : -1;
                this.f34073p++;
                this.f34076s = true;
                u uVar = u.f29813a;
                if (i10 != -1) {
                    q(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f34080w + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
                    return;
                }
                try {
                    hVar.e(i.f34461d);
                } catch (IOException e10) {
                    q(e10, null);
                }
            }
        }
    }
}
