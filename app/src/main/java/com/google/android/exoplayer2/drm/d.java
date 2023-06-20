package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.p;
import da.d0;
import ea.n0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k8.o1;
import n8.t;
import n8.u;
import n8.w;

/* compiled from: DefaultDrmSession.java */
/* loaded from: classes2.dex */
public class d implements j {

    /* renamed from: a */
    public final List<DrmInitData.SchemeData> f21029a;

    /* renamed from: b */
    private final p f21030b;

    /* renamed from: c */
    private final a f21031c;

    /* renamed from: d */
    private final b f21032d;

    /* renamed from: e */
    private final int f21033e;

    /* renamed from: f */
    private final boolean f21034f;

    /* renamed from: g */
    private final boolean f21035g;

    /* renamed from: h */
    private final HashMap<String, String> f21036h;

    /* renamed from: i */
    private final ea.h<k.a> f21037i;

    /* renamed from: j */
    private final d0 f21038j;

    /* renamed from: k */
    private final o1 f21039k;

    /* renamed from: l */
    final s f21040l;

    /* renamed from: m */
    final UUID f21041m;

    /* renamed from: n */
    final e f21042n;

    /* renamed from: o */
    private int f21043o;

    /* renamed from: p */
    private int f21044p;

    /* renamed from: q */
    private HandlerThread f21045q;

    /* renamed from: r */
    private c f21046r;

    /* renamed from: s */
    private m8.b f21047s;

    /* renamed from: t */
    private j.a f21048t;

    /* renamed from: u */
    private byte[] f21049u;

    /* renamed from: v */
    private byte[] f21050v;

    /* renamed from: w */
    private p.b f21051w;

    /* renamed from: x */
    private p.e f21052x;

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(d dVar);

        void c();
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(d dVar, int i10);

        void b(d dVar, int i10);
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f21053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Looper looper) {
            super(looper);
            d.this = r1;
        }

        private boolean a(Message message, u uVar) {
            IOException fVar;
            C0285d c0285d = (C0285d) message.obj;
            if (c0285d.f21056b) {
                int i10 = c0285d.f21059e + 1;
                c0285d.f21059e = i10;
                if (i10 > d.this.f21038j.c(3)) {
                    return false;
                }
                i9.n nVar = new i9.n(c0285d.f21055a, uVar.f34719a, uVar.f34720b, uVar.f34721c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c0285d.f21057c, uVar.f34722d);
                i9.q qVar = new i9.q(3);
                if (uVar.getCause() instanceof IOException) {
                    fVar = (IOException) uVar.getCause();
                } else {
                    fVar = new f(uVar.getCause());
                }
                long b10 = d.this.f21038j.b(new d0.c(nVar, qVar, fVar, c0285d.f21059e));
                if (b10 == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    if (this.f21053a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b10);
                    return true;
                }
            }
            return false;
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new C0285d(i9.n.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f21053a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            C0285d c0285d = (C0285d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    d dVar = d.this;
                    bArr = dVar.f21040l.a(dVar.f21041m, (p.e) c0285d.f21058d);
                } else if (i10 == 1) {
                    d dVar2 = d.this;
                    bArr = dVar2.f21040l.b(dVar2.f21041m, (p.b) c0285d.f21058d);
                } else {
                    throw new RuntimeException();
                }
            } catch (u e10) {
                boolean a10 = a(message, e10);
                bArr = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                ea.r.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                bArr = e11;
            }
            d.this.f21038j.d(c0285d.f21055a);
            synchronized (this) {
                if (!this.f21053a) {
                    d.this.f21042n.obtainMessage(message.what, Pair.create(c0285d.f21058d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* renamed from: com.google.android.exoplayer2.drm.d$d */
    /* loaded from: classes2.dex */
    public static final class C0285d {

        /* renamed from: a */
        public final long f21055a;

        /* renamed from: b */
        public final boolean f21056b;

        /* renamed from: c */
        public final long f21057c;

        /* renamed from: d */
        public final Object f21058d;

        /* renamed from: e */
        public int f21059e;

        public C0285d(long j10, boolean z10, long j11, Object obj) {
            this.f21055a = j10;
            this.f21056b = z10;
            this.f21057c = j11;
            this.f21058d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class e extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Looper looper) {
            super(looper);
            d.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                d.this.A(obj, obj2);
            } else if (i10 != 1) {
            } else {
                d.this.u(obj, obj2);
            }
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes2.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public d(UUID uuid, p pVar, a aVar, b bVar, List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, s sVar, Looper looper, d0 d0Var, o1 o1Var) {
        if (i10 == 1 || i10 == 3) {
            ea.a.e(bArr);
        }
        this.f21041m = uuid;
        this.f21031c = aVar;
        this.f21032d = bVar;
        this.f21030b = pVar;
        this.f21033e = i10;
        this.f21034f = z10;
        this.f21035g = z11;
        if (bArr != null) {
            this.f21050v = bArr;
            this.f21029a = null;
        } else {
            this.f21029a = Collections.unmodifiableList((List) ea.a.e(list));
        }
        this.f21036h = hashMap;
        this.f21040l = sVar;
        this.f21037i = new ea.h<>();
        this.f21038j = d0Var;
        this.f21039k = o1Var;
        this.f21043o = 2;
        this.f21042n = new e(looper);
    }

    public void A(Object obj, Object obj2) {
        if (obj == this.f21052x) {
            if (this.f21043o == 2 || q()) {
                this.f21052x = null;
                if (obj2 instanceof Exception) {
                    this.f21031c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f21030b.h((byte[]) obj2);
                    this.f21031c.c();
                } catch (Exception e10) {
                    this.f21031c.a(e10, true);
                }
            }
        }
    }

    private boolean B() {
        if (q()) {
            return true;
        }
        try {
            byte[] e10 = this.f21030b.e();
            this.f21049u = e10;
            this.f21030b.m(e10, this.f21039k);
            this.f21047s = this.f21030b.j(this.f21049u);
            this.f21043o = 3;
            m(new ea.g() { // from class: com.google.android.exoplayer2.drm.b
                @Override // ea.g
                public final void accept(Object obj) {
                    d.i(r1, (k.a) obj);
                }
            });
            ea.a.e(this.f21049u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f21031c.b(this);
            return false;
        } catch (Exception e11) {
            t(e11, 1);
            return false;
        }
    }

    private void C(byte[] bArr, int i10, boolean z10) {
        try {
            this.f21051w = this.f21030b.o(bArr, this.f21029a, i10, this.f21036h);
            ((c) n0.j(this.f21046r)).b(1, ea.a.e(this.f21051w), z10);
        } catch (Exception e10) {
            v(e10, true);
        }
    }

    private boolean E() {
        try {
            this.f21030b.f(this.f21049u, this.f21050v);
            return true;
        } catch (Exception e10) {
            t(e10, 1);
            return false;
        }
    }

    public static /* synthetic */ void h(Exception exc, k.a aVar) {
        aVar.l(exc);
    }

    public static /* synthetic */ void i(int i10, k.a aVar) {
        aVar.k(i10);
    }

    private void m(ea.g<k.a> gVar) {
        for (k.a aVar : this.f21037i.q0()) {
            gVar.accept(aVar);
        }
    }

    private void n(boolean z10) {
        if (this.f21035g) {
            return;
        }
        byte[] bArr = (byte[]) n0.j(this.f21049u);
        int i10 = this.f21033e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f21050v == null || E()) {
                    C(bArr, 2, z10);
                }
            } else if (i10 != 3) {
            } else {
                ea.a.e(this.f21050v);
                ea.a.e(this.f21049u);
                C(this.f21050v, 3, z10);
            }
        } else if (this.f21050v == null) {
            C(bArr, 1, z10);
        } else if (this.f21043o == 4 || E()) {
            long o10 = o();
            if (this.f21033e != 0 || o10 > 60) {
                if (o10 <= 0) {
                    t(new t(), 2);
                    return;
                }
                this.f21043o = 4;
                m(new ea.g() { // from class: n8.c
                    @Override // ea.g
                    public final void accept(Object obj) {
                        ((k.a) obj).j();
                    }
                });
                return;
            }
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb2.append(o10);
            ea.r.b("DefaultDrmSession", sb2.toString());
            C(bArr, 2, z10);
        }
    }

    private long o() {
        if (j8.h.f32428d.equals(this.f21041m)) {
            Pair pair = (Pair) ea.a.e(w.b(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    private boolean q() {
        int i10 = this.f21043o;
        return i10 == 3 || i10 == 4;
    }

    private void t(final Exception exc, int i10) {
        this.f21048t = new j.a(exc, m.a(exc, i10));
        ea.r.d("DefaultDrmSession", "DRM session error", exc);
        m(new ea.g() { // from class: com.google.android.exoplayer2.drm.c
            @Override // ea.g
            public final void accept(Object obj) {
                d.h(exc, (k.a) obj);
            }
        });
        if (this.f21043o != 4) {
            this.f21043o = 1;
        }
    }

    public void u(Object obj, Object obj2) {
        if (obj == this.f21051w && q()) {
            this.f21051w = null;
            if (obj2 instanceof Exception) {
                v((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f21033e == 3) {
                    this.f21030b.n((byte[]) n0.j(this.f21050v), bArr);
                    m(new ea.g() { // from class: n8.b
                        @Override // ea.g
                        public final void accept(Object obj3) {
                            ((k.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] n10 = this.f21030b.n(this.f21049u, bArr);
                int i10 = this.f21033e;
                if ((i10 == 2 || (i10 == 0 && this.f21050v != null)) && n10 != null && n10.length != 0) {
                    this.f21050v = n10;
                }
                this.f21043o = 4;
                m(new ea.g() { // from class: n8.a
                    @Override // ea.g
                    public final void accept(Object obj3) {
                        ((k.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                v(e10, true);
            }
        }
    }

    private void v(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f21031c.b(this);
        } else {
            t(exc, z10 ? 1 : 2);
        }
    }

    private void w() {
        if (this.f21033e == 0 && this.f21043o == 4) {
            n0.j(this.f21049u);
            n(false);
        }
    }

    public void D() {
        this.f21052x = this.f21030b.d();
        ((c) n0.j(this.f21046r)).b(0, ea.a.e(this.f21052x), true);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void a(k.a aVar) {
        int i10 = this.f21044p;
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i10);
            ea.r.c("DefaultDrmSession", sb2.toString());
            this.f21044p = 0;
        }
        if (aVar != null) {
            this.f21037i.a(aVar);
        }
        int i11 = this.f21044p + 1;
        this.f21044p = i11;
        if (i11 == 1) {
            ea.a.f(this.f21043o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21045q = handlerThread;
            handlerThread.start();
            this.f21046r = new c(this.f21045q.getLooper());
            if (B()) {
                n(true);
            }
        } else if (aVar != null && q() && this.f21037i.b(aVar) == 1) {
            aVar.k(this.f21043o);
        }
        this.f21032d.a(this, this.f21044p);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void b(k.a aVar) {
        int i10 = this.f21044p;
        if (i10 <= 0) {
            ea.r.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f21044p = i11;
        if (i11 == 0) {
            this.f21043o = 0;
            ((e) n0.j(this.f21042n)).removeCallbacksAndMessages(null);
            ((c) n0.j(this.f21046r)).c();
            this.f21046r = null;
            ((HandlerThread) n0.j(this.f21045q)).quit();
            this.f21045q = null;
            this.f21047s = null;
            this.f21048t = null;
            this.f21051w = null;
            this.f21052x = null;
            byte[] bArr = this.f21049u;
            if (bArr != null) {
                this.f21030b.l(bArr);
                this.f21049u = null;
            }
        }
        if (aVar != null) {
            this.f21037i.c(aVar);
            if (this.f21037i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f21032d.b(this, this.f21044p);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final UUID c() {
        return this.f21041m;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean d() {
        return this.f21034f;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final m8.b e() {
        return this.f21047s;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> f() {
        byte[] bArr = this.f21049u;
        if (bArr == null) {
            return null;
        }
        return this.f21030b.c(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean g(String str) {
        return this.f21030b.k((byte[]) ea.a.h(this.f21049u), str);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final j.a getError() {
        if (this.f21043o == 1) {
            return this.f21048t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final int getState() {
        return this.f21043o;
    }

    public boolean p(byte[] bArr) {
        return Arrays.equals(this.f21049u, bArr);
    }

    public void x(int i10) {
        if (i10 != 2) {
            return;
        }
        w();
    }

    public void y() {
        if (B()) {
            n(true);
        }
    }

    public void z(Exception exc, boolean z10) {
        t(exc, z10 ? 1 : 3);
    }
}
