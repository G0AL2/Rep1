package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.p;
import da.d0;
import da.y;
import ea.n0;
import ea.v;
import j8.p1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jb.q0;
import jb.u;
import jb.u0;
import k8.o1;

/* compiled from: DefaultDrmSessionManager.java */
/* loaded from: classes2.dex */
public class e implements l {

    /* renamed from: b */
    private final UUID f21061b;

    /* renamed from: c */
    private final p.d f21062c;

    /* renamed from: d */
    private final s f21063d;

    /* renamed from: e */
    private final HashMap<String, String> f21064e;

    /* renamed from: f */
    private final boolean f21065f;

    /* renamed from: g */
    private final int[] f21066g;

    /* renamed from: h */
    private final boolean f21067h;

    /* renamed from: i */
    private final g f21068i;

    /* renamed from: j */
    private final d0 f21069j;

    /* renamed from: k */
    private final h f21070k;

    /* renamed from: l */
    private final long f21071l;

    /* renamed from: m */
    private final List<com.google.android.exoplayer2.drm.d> f21072m;

    /* renamed from: n */
    private final Set<f> f21073n;

    /* renamed from: o */
    private final Set<com.google.android.exoplayer2.drm.d> f21074o;

    /* renamed from: p */
    private int f21075p;

    /* renamed from: q */
    private p f21076q;

    /* renamed from: r */
    private com.google.android.exoplayer2.drm.d f21077r;

    /* renamed from: s */
    private com.google.android.exoplayer2.drm.d f21078s;

    /* renamed from: t */
    private Looper f21079t;

    /* renamed from: u */
    private Handler f21080u;

    /* renamed from: v */
    private int f21081v;

    /* renamed from: w */
    private byte[] f21082w;

    /* renamed from: x */
    private o1 f21083x;

    /* renamed from: y */
    volatile d f21084y;

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: d */
        private boolean f21088d;

        /* renamed from: f */
        private boolean f21090f;

        /* renamed from: a */
        private final HashMap<String, String> f21085a = new HashMap<>();

        /* renamed from: b */
        private UUID f21086b = j8.h.f32428d;

        /* renamed from: c */
        private p.d f21087c = q.f21125d;

        /* renamed from: g */
        private d0 f21091g = new y();

        /* renamed from: e */
        private int[] f21089e = new int[0];

        /* renamed from: h */
        private long f21092h = 300000;

        public e a(s sVar) {
            return new e(this.f21086b, this.f21087c, sVar, this.f21085a, this.f21088d, this.f21089e, this.f21090f, this.f21091g, this.f21092h);
        }

        public b b(boolean z10) {
            this.f21088d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f21090f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                ea.a.a(z10);
            }
            this.f21089e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, p.d dVar) {
            this.f21086b = (UUID) ea.a.e(uuid);
            this.f21087c = (p.d) ea.a.e(dVar);
            return this;
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    private class c implements p.c {
        private c() {
            e.this = r1;
        }

        @Override // com.google.android.exoplayer2.drm.p.c
        public void a(p pVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) ea.a.e(e.this.f21084y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class d extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Looper looper) {
            super(looper);
            e.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.google.android.exoplayer2.drm.d dVar : e.this.f21072m) {
                if (dVar.p(bArr)) {
                    dVar.x(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* renamed from: com.google.android.exoplayer2.drm.e$e */
    /* loaded from: classes2.dex */
    public static final class C0286e extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private C0286e(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.e.C0286e.<init>(java.util.UUID):void");
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class f implements l.b {

        /* renamed from: b */
        private final k.a f21095b;

        /* renamed from: c */
        private j f21096c;

        /* renamed from: d */
        private boolean f21097d;

        public f(k.a aVar) {
            e.this = r1;
            this.f21095b = aVar;
        }

        public static /* synthetic */ void a(f fVar) {
            fVar.e();
        }

        public static /* synthetic */ void b(f fVar, p1 p1Var) {
            fVar.d(p1Var);
        }

        public /* synthetic */ void d(p1 p1Var) {
            if (e.this.f21075p == 0 || this.f21097d) {
                return;
            }
            e eVar = e.this;
            this.f21096c = eVar.t((Looper) ea.a.e(eVar.f21079t), this.f21095b, p1Var, false);
            e.this.f21073n.add(this);
        }

        public /* synthetic */ void e() {
            if (this.f21097d) {
                return;
            }
            j jVar = this.f21096c;
            if (jVar != null) {
                jVar.b(this.f21095b);
            }
            e.this.f21073n.remove(this);
            this.f21097d = true;
        }

        public void c(final p1 p1Var) {
            ((Handler) ea.a.e(e.this.f21080u)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.b(e.f.this, p1Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.l.b
        public void release() {
            n0.L0((Handler) ea.a.e(e.this.f21080u), new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.a(e.f.this);
                }
            });
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class g implements d.a {

        /* renamed from: a */
        private final Set<com.google.android.exoplayer2.drm.d> f21099a = new HashSet();

        /* renamed from: b */
        private com.google.android.exoplayer2.drm.d f21100b;

        public g(e eVar) {
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void a(Exception exc, boolean z10) {
            this.f21100b = null;
            jb.s p10 = jb.s.p(this.f21099a);
            this.f21099a.clear();
            u0 it = p10.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.d) it.next()).z(exc, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void b(com.google.android.exoplayer2.drm.d dVar) {
            this.f21099a.add(dVar);
            if (this.f21100b != null) {
                return;
            }
            this.f21100b = dVar;
            dVar.D();
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void c() {
            this.f21100b = null;
            jb.s p10 = jb.s.p(this.f21099a);
            this.f21099a.clear();
            u0 it = p10.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.d) it.next()).y();
            }
        }

        public void d(com.google.android.exoplayer2.drm.d dVar) {
            this.f21099a.remove(dVar);
            if (this.f21100b == dVar) {
                this.f21100b = null;
                if (this.f21099a.isEmpty()) {
                    return;
                }
                com.google.android.exoplayer2.drm.d next = this.f21099a.iterator().next();
                this.f21100b = next;
                next.D();
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class h implements d.b {
        private h() {
            e.this = r1;
        }

        public static /* synthetic */ void c(com.google.android.exoplayer2.drm.d dVar) {
            dVar.b(null);
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public void a(com.google.android.exoplayer2.drm.d dVar, int i10) {
            if (e.this.f21071l != -9223372036854775807L) {
                e.this.f21074o.remove(dVar);
                ((Handler) ea.a.e(e.this.f21080u)).removeCallbacksAndMessages(dVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public void b(final com.google.android.exoplayer2.drm.d dVar, int i10) {
            if (i10 == 1 && e.this.f21075p > 0 && e.this.f21071l != -9223372036854775807L) {
                e.this.f21074o.add(dVar);
                ((Handler) ea.a.e(e.this.f21080u)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.h.c(d.this);
                    }
                }, dVar, SystemClock.uptimeMillis() + e.this.f21071l);
            } else if (i10 == 0) {
                e.this.f21072m.remove(dVar);
                if (e.this.f21077r == dVar) {
                    e.this.f21077r = null;
                }
                if (e.this.f21078s == dVar) {
                    e.this.f21078s = null;
                }
                e.this.f21068i.d(dVar);
                if (e.this.f21071l != -9223372036854775807L) {
                    ((Handler) ea.a.e(e.this.f21080u)).removeCallbacksAndMessages(dVar);
                    e.this.f21074o.remove(dVar);
                }
            }
            e.this.C();
        }
    }

    private j A(int i10, boolean z10) {
        p pVar = (p) ea.a.e(this.f21076q);
        if ((pVar.i() == 2 && n8.q.f34712d) || n0.z0(this.f21066g, i10) == -1 || pVar.i() == 1) {
            return null;
        }
        com.google.android.exoplayer2.drm.d dVar = this.f21077r;
        if (dVar == null) {
            com.google.android.exoplayer2.drm.d x10 = x(jb.s.t(), true, null, z10);
            this.f21072m.add(x10);
            this.f21077r = x10;
        } else {
            dVar.a(null);
        }
        return this.f21077r;
    }

    private void B(Looper looper) {
        if (this.f21084y == null) {
            this.f21084y = new d(looper);
        }
    }

    public void C() {
        if (this.f21076q != null && this.f21075p == 0 && this.f21072m.isEmpty() && this.f21073n.isEmpty()) {
            ((p) ea.a.e(this.f21076q)).release();
            this.f21076q = null;
        }
    }

    private void D() {
        Iterator it = u.n(this.f21074o).iterator();
        while (it.hasNext()) {
            ((j) it.next()).b(null);
        }
    }

    private void E() {
        Iterator it = u.n(this.f21073n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void G(j jVar, k.a aVar) {
        jVar.b(aVar);
        if (this.f21071l != -9223372036854775807L) {
            jVar.b(null);
        }
    }

    public j t(Looper looper, k.a aVar, p1 p1Var, boolean z10) {
        List<DrmInitData.SchemeData> list;
        B(looper);
        DrmInitData drmInitData = p1Var.f32712o;
        if (drmInitData == null) {
            return A(v.l(p1Var.f32709l), z10);
        }
        com.google.android.exoplayer2.drm.d dVar = null;
        if (this.f21082w == null) {
            list = y((DrmInitData) ea.a.e(drmInitData), this.f21061b, false);
            if (list.isEmpty()) {
                C0286e c0286e = new C0286e(this.f21061b);
                ea.r.d("DefaultDrmSessionMgr", "DRM error", c0286e);
                if (aVar != null) {
                    aVar.l(c0286e);
                }
                return new o(new j.a(c0286e, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (!this.f21065f) {
            dVar = this.f21078s;
        } else {
            Iterator<com.google.android.exoplayer2.drm.d> it = this.f21072m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.d next = it.next();
                if (n0.c(next.f21029a, list)) {
                    dVar = next;
                    break;
                }
            }
        }
        if (dVar == null) {
            dVar = x(list, false, aVar, z10);
            if (!this.f21065f) {
                this.f21078s = dVar;
            }
            this.f21072m.add(dVar);
        } else {
            dVar.a(aVar);
        }
        return dVar;
    }

    private static boolean u(j jVar) {
        return jVar.getState() == 1 && (n0.f29709a < 19 || (((j.a) ea.a.e(jVar.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean v(DrmInitData drmInitData) {
        if (this.f21082w != null) {
            return true;
        }
        if (y(drmInitData, this.f21061b, true).isEmpty()) {
            if (drmInitData.f21021d != 1 || !drmInitData.h(0).g(j8.h.f32426b)) {
                return false;
            }
            String valueOf = String.valueOf(this.f21061b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(valueOf);
            ea.r.h("DefaultDrmSessionMgr", sb2.toString());
        }
        String str = drmInitData.f21020c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? n0.f29709a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private com.google.android.exoplayer2.drm.d w(List<DrmInitData.SchemeData> list, boolean z10, k.a aVar) {
        ea.a.e(this.f21076q);
        com.google.android.exoplayer2.drm.d dVar = new com.google.android.exoplayer2.drm.d(this.f21061b, this.f21076q, this.f21068i, this.f21070k, list, this.f21081v, this.f21067h | z10, z10, this.f21082w, this.f21064e, this.f21063d, (Looper) ea.a.e(this.f21079t), this.f21069j, (o1) ea.a.e(this.f21083x));
        dVar.a(aVar);
        if (this.f21071l != -9223372036854775807L) {
            dVar.a(null);
        }
        return dVar;
    }

    private com.google.android.exoplayer2.drm.d x(List<DrmInitData.SchemeData> list, boolean z10, k.a aVar, boolean z11) {
        com.google.android.exoplayer2.drm.d w10 = w(list, z10, aVar);
        if (u(w10) && !this.f21074o.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (u(w10) && z11 && !this.f21073n.isEmpty()) {
            E();
            if (!this.f21074o.isEmpty()) {
                D();
            }
            G(w10, aVar);
            return w(list, z10, aVar);
        }
        return w10;
    }

    private static List<DrmInitData.SchemeData> y(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f21021d);
        for (int i10 = 0; i10 < drmInitData.f21021d; i10++) {
            DrmInitData.SchemeData h10 = drmInitData.h(i10);
            if ((h10.g(uuid) || (j8.h.f32427c.equals(uuid) && h10.g(j8.h.f32426b))) && (h10.f21026e != null || z10)) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f21079t;
        if (looper2 == null) {
            this.f21079t = looper;
            this.f21080u = new Handler(looper);
        } else {
            ea.a.f(looper2 == looper);
            ea.a.e(this.f21080u);
        }
    }

    public void F(int i10, byte[] bArr) {
        ea.a.f(this.f21072m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            ea.a.e(bArr);
        }
        this.f21081v = i10;
        this.f21082w = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public final void a() {
        int i10 = this.f21075p;
        this.f21075p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f21076q == null) {
            p a10 = this.f21062c.a(this.f21061b);
            this.f21076q = a10;
            a10.g(new c());
        } else if (this.f21071l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f21072m.size(); i11++) {
                this.f21072m.get(i11).a(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.l
    public int b(p1 p1Var) {
        int i10 = ((p) ea.a.e(this.f21076q)).i();
        DrmInitData drmInitData = p1Var.f32712o;
        if (drmInitData == null) {
            if (n0.z0(this.f21066g, v.l(p1Var.f32709l)) != -1) {
                return i10;
            }
            return 0;
        } else if (v(drmInitData)) {
            return i10;
        } else {
            return 1;
        }
    }

    @Override // com.google.android.exoplayer2.drm.l
    public void c(Looper looper, o1 o1Var) {
        z(looper);
        this.f21083x = o1Var;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public j d(k.a aVar, p1 p1Var) {
        ea.a.f(this.f21075p > 0);
        ea.a.h(this.f21079t);
        return t(this.f21079t, aVar, p1Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.l
    public l.b e(k.a aVar, p1 p1Var) {
        ea.a.f(this.f21075p > 0);
        ea.a.h(this.f21079t);
        f fVar = new f(aVar);
        fVar.c(p1Var);
        return fVar;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public final void release() {
        int i10 = this.f21075p - 1;
        this.f21075p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f21071l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f21072m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.google.android.exoplayer2.drm.d) arrayList.get(i11)).b(null);
            }
        }
        E();
        C();
    }

    @Deprecated
    public e(UUID uuid, p pVar, s sVar, HashMap<String, String> hashMap, boolean z10, int i10) {
        this(uuid, new p.a(pVar), sVar, hashMap == null ? new HashMap<>() : hashMap, z10, new int[0], false, new y(i10), 300000L);
    }

    private e(UUID uuid, p.d dVar, s sVar, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, d0 d0Var, long j10) {
        ea.a.e(uuid);
        ea.a.b(!j8.h.f32426b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21061b = uuid;
        this.f21062c = dVar;
        this.f21063d = sVar;
        this.f21064e = hashMap;
        this.f21065f = z10;
        this.f21066g = iArr;
        this.f21067h = z11;
        this.f21069j = d0Var;
        this.f21068i = new g(this);
        this.f21070k = new h();
        this.f21081v = 0;
        this.f21072m = new ArrayList();
        this.f21073n = q0.h();
        this.f21074o = q0.h();
        this.f21071l = j10;
    }
}
