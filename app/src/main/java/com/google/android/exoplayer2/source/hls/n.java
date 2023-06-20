package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.e;
import com.google.android.exoplayer2.source.hls.n;
import da.a0;
import da.d0;
import da.e0;
import ea.r;
import ea.v;
import i9.b0;
import i9.n0;
import i9.o0;
import i9.p0;
import i9.q;
import i9.w0;
import i9.y0;
import j8.b3;
import j8.j2;
import j8.p1;
import j8.q1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jb.s;
import p8.a0;
import p8.x;
import p8.z;

/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: classes2.dex */
public final class n implements e0.b<k9.f>, e0.f, p0, p8.k, n0.d {
    private static final Set<Integer> Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private p1 F;
    private p1 G;
    private boolean H;
    private y0 I;
    private Set<w0> J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private DrmInitData W;
    private h X;

    /* renamed from: a */
    private final String f21522a;

    /* renamed from: b */
    private final int f21523b;

    /* renamed from: c */
    private final b f21524c;

    /* renamed from: d */
    private final e f21525d;

    /* renamed from: e */
    private final da.b f21526e;

    /* renamed from: f */
    private final p1 f21527f;

    /* renamed from: g */
    private final com.google.android.exoplayer2.drm.l f21528g;

    /* renamed from: h */
    private final k.a f21529h;

    /* renamed from: i */
    private final d0 f21530i;

    /* renamed from: k */
    private final b0.a f21532k;

    /* renamed from: l */
    private final int f21533l;

    /* renamed from: n */
    private final ArrayList<h> f21535n;

    /* renamed from: o */
    private final List<h> f21536o;

    /* renamed from: p */
    private final Runnable f21537p;

    /* renamed from: q */
    private final Runnable f21538q;

    /* renamed from: r */
    private final Handler f21539r;

    /* renamed from: s */
    private final ArrayList<k> f21540s;

    /* renamed from: t */
    private final Map<String, DrmInitData> f21541t;

    /* renamed from: u */
    private k9.f f21542u;

    /* renamed from: v */
    private d[] f21543v;

    /* renamed from: x */
    private Set<Integer> f21545x;

    /* renamed from: y */
    private SparseIntArray f21546y;

    /* renamed from: z */
    private a0 f21547z;

    /* renamed from: j */
    private final e0 f21531j = new e0("Loader:HlsSampleStreamWrapper");

    /* renamed from: m */
    private final e.b f21534m = new e.b();

    /* renamed from: w */
    private int[] f21544w = new int[0];

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    public interface b extends p0.a<n> {
        void n(Uri uri);

        void onPrepared();
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    private static class c implements a0 {

        /* renamed from: g */
        private static final p1 f21548g = new p1.b().e0("application/id3").E();

        /* renamed from: h */
        private static final p1 f21549h = new p1.b().e0("application/x-emsg").E();

        /* renamed from: a */
        private final e9.a f21550a = new e9.a();

        /* renamed from: b */
        private final a0 f21551b;

        /* renamed from: c */
        private final p1 f21552c;

        /* renamed from: d */
        private p1 f21553d;

        /* renamed from: e */
        private byte[] f21554e;

        /* renamed from: f */
        private int f21555f;

        public c(a0 a0Var, int i10) {
            this.f21551b = a0Var;
            if (i10 == 1) {
                this.f21552c = f21548g;
            } else if (i10 == 3) {
                this.f21552c = f21549h;
            } else {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unknown metadataType: ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f21554e = new byte[0];
            this.f21555f = 0;
        }

        private boolean g(EventMessage eventMessage) {
            p1 z10 = eventMessage.z();
            return z10 != null && ea.n0.c(this.f21552c.f32709l, z10.f32709l);
        }

        private void h(int i10) {
            byte[] bArr = this.f21554e;
            if (bArr.length < i10) {
                this.f21554e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private ea.a0 i(int i10, int i11) {
            int i12 = this.f21555f - i11;
            ea.a0 a0Var = new ea.a0(Arrays.copyOfRange(this.f21554e, i12 - i10, i12));
            byte[] bArr = this.f21554e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f21555f = i11;
            return a0Var;
        }

        @Override // p8.a0
        public /* synthetic */ void a(ea.a0 a0Var, int i10) {
            z.b(this, a0Var, i10);
        }

        @Override // p8.a0
        public int b(da.i iVar, int i10, boolean z10, int i11) throws IOException {
            h(this.f21555f + i10);
            int c10 = iVar.c(this.f21554e, this.f21555f, i10);
            if (c10 != -1) {
                this.f21555f += c10;
                return c10;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // p8.a0
        public /* synthetic */ int c(da.i iVar, int i10, boolean z10) {
            return z.a(this, iVar, i10, z10);
        }

        @Override // p8.a0
        public void d(p1 p1Var) {
            this.f21553d = p1Var;
            this.f21551b.d(this.f21552c);
        }

        @Override // p8.a0
        public void e(long j10, int i10, int i11, int i12, a0.a aVar) {
            ea.a.e(this.f21553d);
            ea.a0 i13 = i(i11, i12);
            if (!ea.n0.c(this.f21553d.f32709l, this.f21552c.f32709l)) {
                if ("application/x-emsg".equals(this.f21553d.f32709l)) {
                    EventMessage c10 = this.f21550a.c(i13);
                    if (!g(c10)) {
                        r.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f21552c.f32709l, c10.z()));
                        return;
                    }
                    i13 = new ea.a0((byte[]) ea.a.e(c10.c1()));
                } else {
                    String valueOf = String.valueOf(this.f21553d.f32709l);
                    r.h("HlsSampleStreamWrapper", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
            }
            int a10 = i13.a();
            this.f21551b.a(i13, a10);
            this.f21551b.e(j10, i10, a10, i12, aVar);
        }

        @Override // p8.a0
        public void f(ea.a0 a0Var, int i10, int i11) {
            h(this.f21555f + i10);
            a0Var.j(this.f21554e, this.f21555f, i10);
            this.f21555f += i10;
        }
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    public static final class d extends n0 {
        private final Map<String, DrmInitData> H;
        private DrmInitData I;

        private Metadata h0(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int g10 = metadata.g();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= g10) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry f10 = metadata.f(i11);
                if ((f10 instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) f10).f21207b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (g10 == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[g10 - 1];
            while (i10 < g10) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.f(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        @Override // i9.n0, p8.a0
        public void e(long j10, int i10, int i11, int i12, a0.a aVar) {
            super.e(j10, i10, i11, i12, aVar);
        }

        public void i0(DrmInitData drmInitData) {
            this.I = drmInitData;
            I();
        }

        public void j0(h hVar) {
            f0(hVar.f21478k);
        }

        @Override // i9.n0
        public p1 w(p1 p1Var) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = p1Var.f32712o;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.f21020c)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata h02 = h0(p1Var.f32707j);
            if (drmInitData2 != p1Var.f32712o || h02 != p1Var.f32707j) {
                p1Var = p1Var.b().M(drmInitData2).X(h02).E();
            }
            return super.w(p1Var);
        }

        private d(da.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar, Map<String, DrmInitData> map) {
            super(bVar, lVar, aVar);
            this.H = map;
        }
    }

    public n(String str, int i10, b bVar, e eVar, Map<String, DrmInitData> map, da.b bVar2, long j10, p1 p1Var, com.google.android.exoplayer2.drm.l lVar, k.a aVar, d0 d0Var, b0.a aVar2, int i11) {
        this.f21522a = str;
        this.f21523b = i10;
        this.f21524c = bVar;
        this.f21525d = eVar;
        this.f21541t = map;
        this.f21526e = bVar2;
        this.f21527f = p1Var;
        this.f21528g = lVar;
        this.f21529h = aVar;
        this.f21530i = d0Var;
        this.f21532k = aVar2;
        this.f21533l = i11;
        Set<Integer> set = Y;
        this.f21545x = new HashSet(set.size());
        this.f21546y = new SparseIntArray(set.size());
        this.f21543v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList<h> arrayList = new ArrayList<>();
        this.f21535n = arrayList;
        this.f21536o = Collections.unmodifiableList(arrayList);
        this.f21540s = new ArrayList<>();
        this.f21537p = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.m
            @Override // java.lang.Runnable
            public final void run() {
                n.w(n.this);
            }
        };
        this.f21538q = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.l
            @Override // java.lang.Runnable
            public final void run() {
                n.v(n.this);
            }
        };
        this.f21539r = ea.n0.w();
        this.P = j10;
        this.Q = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.f21535n.size(); i11++) {
            if (this.f21535n.get(i11).f21481n) {
                return false;
            }
        }
        h hVar = this.f21535n.get(i10);
        for (int i12 = 0; i12 < this.f21543v.length; i12++) {
            if (this.f21543v[i12].C() > hVar.l(i12)) {
                return false;
            }
        }
        return true;
    }

    private static p8.h C(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unmapped track with id ");
        sb2.append(i10);
        sb2.append(" of type ");
        sb2.append(i11);
        r.h("HlsSampleStreamWrapper", sb2.toString());
        return new p8.h();
    }

    private n0 D(int i10, int i11) {
        int length = this.f21543v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f21526e, this.f21528g, this.f21529h, this.f21541t);
        dVar.b0(this.P);
        if (z10) {
            dVar.i0(this.W);
        }
        dVar.a0(this.V);
        h hVar = this.X;
        if (hVar != null) {
            dVar.j0(hVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f21544w, i12);
        this.f21544w = copyOf;
        copyOf[length] = i10;
        this.f21543v = (d[]) ea.n0.F0(this.f21543v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.O, i12);
        this.O = copyOf2;
        copyOf2[length] = z10;
        this.M = copyOf2[length] | this.M;
        this.f21545x.add(Integer.valueOf(i11));
        this.f21546y.append(i11, length);
        if (M(i11) > M(this.A)) {
            this.B = length;
            this.A = i11;
        }
        this.N = Arrays.copyOf(this.N, i12);
        return dVar;
    }

    private y0 E(w0[] w0VarArr) {
        for (int i10 = 0; i10 < w0VarArr.length; i10++) {
            w0 w0Var = w0VarArr[i10];
            p1[] p1VarArr = new p1[w0Var.f31846a];
            for (int i11 = 0; i11 < w0Var.f31846a; i11++) {
                p1 c10 = w0Var.c(i11);
                p1VarArr[i11] = c10.c(this.f21528g.b(c10));
            }
            w0VarArr[i10] = new w0(w0Var.f31847b, p1VarArr);
        }
        return new y0(w0VarArr);
    }

    private static p1 F(p1 p1Var, p1 p1Var2, boolean z10) {
        String d10;
        String str;
        if (p1Var == null) {
            return p1Var2;
        }
        int l10 = v.l(p1Var2.f32709l);
        if (ea.n0.K(p1Var.f32706i, l10) == 1) {
            d10 = ea.n0.L(p1Var.f32706i, l10);
            str = v.g(d10);
        } else {
            d10 = v.d(p1Var.f32706i, p1Var2.f32709l);
            str = p1Var2.f32709l;
        }
        p1.b I = p1Var2.b().S(p1Var.f32698a).U(p1Var.f32699b).V(p1Var.f32700c).g0(p1Var.f32701d).c0(p1Var.f32702e).G(z10 ? p1Var.f32703f : -1).Z(z10 ? p1Var.f32704g : -1).I(d10);
        if (l10 == 2) {
            I.j0(p1Var.f32714q).Q(p1Var.f32715r).P(p1Var.f32716s);
        }
        if (str != null) {
            I.e0(str);
        }
        int i10 = p1Var.f32722y;
        if (i10 != -1 && l10 == 1) {
            I.H(i10);
        }
        Metadata metadata = p1Var.f32707j;
        if (metadata != null) {
            Metadata metadata2 = p1Var2.f32707j;
            if (metadata2 != null) {
                metadata = metadata2.e(metadata);
            }
            I.X(metadata);
        }
        return I.E();
    }

    private void G(int i10) {
        ea.a.f(!this.f21531j.j());
        while (true) {
            if (i10 >= this.f21535n.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = K().f33392h;
        h H = H(i10);
        if (this.f21535n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((h) jb.v.c(this.f21535n)).n();
        }
        this.T = false;
        this.f21532k.D(this.A, H.f33391g, j10);
    }

    private h H(int i10) {
        h hVar = this.f21535n.get(i10);
        ArrayList<h> arrayList = this.f21535n;
        ea.n0.N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f21543v.length; i11++) {
            this.f21543v[i11].u(hVar.l(i11));
        }
        return hVar;
    }

    private boolean I(h hVar) {
        int i10 = hVar.f21478k;
        int length = this.f21543v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.N[i11] && this.f21543v[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(p1 p1Var, p1 p1Var2) {
        String str = p1Var.f32709l;
        String str2 = p1Var2.f32709l;
        int l10 = v.l(str);
        if (l10 != 3) {
            return l10 == v.l(str2);
        } else if (ea.n0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || p1Var.D == p1Var2.D;
        } else {
            return false;
        }
    }

    private h K() {
        ArrayList<h> arrayList = this.f21535n;
        return arrayList.get(arrayList.size() - 1);
    }

    private a0 L(int i10, int i11) {
        ea.a.a(Y.contains(Integer.valueOf(i11)));
        int i12 = this.f21546y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f21545x.add(Integer.valueOf(i11))) {
            this.f21544w[i12] = i10;
        }
        if (this.f21544w[i12] == i10) {
            return this.f21543v[i12];
        }
        return C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    private void N(h hVar) {
        d[] dVarArr;
        this.X = hVar;
        this.F = hVar.f33388d;
        this.Q = -9223372036854775807L;
        this.f21535n.add(hVar);
        s.a n10 = s.n();
        for (d dVar : this.f21543v) {
            n10.a(Integer.valueOf(dVar.G()));
        }
        hVar.m(this, n10.h());
        for (d dVar2 : this.f21543v) {
            dVar2.j0(hVar);
            if (hVar.f21481n) {
                dVar2.g0();
            }
        }
    }

    private static boolean O(k9.f fVar) {
        return fVar instanceof h;
    }

    private boolean P() {
        return this.Q != -9223372036854775807L;
    }

    private void S() {
        int i10 = this.I.f31863a;
        int[] iArr = new int[i10];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f21543v;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((p1) ea.a.h(dVarArr[i12].F()), this.I.b(i11).c(0))) {
                    this.K[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<k> it = this.f21540s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void T() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f21543v) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.I != null) {
                S();
                return;
            }
            z();
            l0();
            this.f21524c.onPrepared();
        }
    }

    public void c0() {
        this.C = true;
        T();
    }

    private void g0() {
        for (d dVar : this.f21543v) {
            dVar.W(this.R);
        }
        this.R = false;
    }

    private boolean h0(long j10) {
        int length = this.f21543v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f21543v[i10].Z(j10, false) && (this.O[i10] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.D = true;
    }

    private void q0(o0[] o0VarArr) {
        this.f21540s.clear();
        for (o0 o0Var : o0VarArr) {
            if (o0Var != null) {
                this.f21540s.add((k) o0Var);
            }
        }
    }

    public static /* synthetic */ void v(n nVar) {
        nVar.c0();
    }

    public static /* synthetic */ void w(n nVar) {
        nVar.T();
    }

    private void x() {
        ea.a.f(this.D);
        ea.a.e(this.I);
        ea.a.e(this.J);
    }

    private void z() {
        int i10;
        p1 F;
        p1 p1Var;
        int length = this.f21543v.length;
        int i11 = 0;
        int i12 = -2;
        int i13 = -1;
        while (true) {
            i10 = 2;
            if (i11 >= length) {
                break;
            }
            String str = ((p1) ea.a.h(this.f21543v[i11].F())).f32709l;
            if (!v.t(str)) {
                if (v.p(str)) {
                    i10 = 1;
                } else {
                    i10 = v.s(str) ? 3 : -2;
                }
            }
            if (M(i10) > M(i12)) {
                i13 = i11;
                i12 = i10;
            } else if (i10 == i12 && i13 != -1) {
                i13 = -1;
            }
            i11++;
        }
        w0 j10 = this.f21525d.j();
        int i14 = j10.f31846a;
        this.L = -1;
        this.K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.K[i15] = i15;
        }
        w0[] w0VarArr = new w0[length];
        int i16 = 0;
        while (i16 < length) {
            p1 p1Var2 = (p1) ea.a.h(this.f21543v[i16].F());
            if (i16 == i13) {
                p1[] p1VarArr = new p1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    p1 c10 = j10.c(i17);
                    if (i12 == 1 && (p1Var = this.f21527f) != null) {
                        c10 = c10.j(p1Var);
                    }
                    if (i14 == 1) {
                        F = p1Var2.j(c10);
                    } else {
                        F = F(c10, p1Var2, true);
                    }
                    p1VarArr[i17] = F;
                }
                w0VarArr[i16] = new w0(this.f21522a, p1VarArr);
                this.L = i16;
            } else {
                p1 p1Var3 = (i12 == i10 && v.p(p1Var2.f32709l)) ? this.f21527f : null;
                String str2 = this.f21522a;
                int i18 = i16 < i13 ? i16 : i16 - 1;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 18);
                sb2.append(str2);
                sb2.append(":muxed:");
                sb2.append(i18);
                w0VarArr[i16] = new w0(sb2.toString(), F(p1Var3, p1Var2, false));
            }
            i16++;
            i10 = 2;
        }
        this.I = E(w0VarArr);
        ea.a.f(this.J == null);
        this.J = Collections.emptySet();
    }

    public void B() {
        if (this.D) {
            return;
        }
        d(this.P);
    }

    public boolean Q(int i10) {
        return !P() && this.f21543v[i10].K(this.T);
    }

    public boolean R() {
        return this.A == 2;
    }

    public void U() throws IOException {
        this.f21531j.a();
        this.f21525d.n();
    }

    public void V(int i10) throws IOException {
        U();
        this.f21543v[i10].N();
    }

    @Override // da.e0.b
    /* renamed from: W */
    public void j(k9.f fVar, long j10, long j11, boolean z10) {
        this.f21542u = null;
        i9.n nVar = new i9.n(fVar.f33385a, fVar.f33386b, fVar.e(), fVar.d(), j10, j11, fVar.a());
        this.f21530i.d(fVar.f33385a);
        this.f21532k.r(nVar, fVar.f33387c, this.f21523b, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
        if (z10) {
            return;
        }
        if (P() || this.E == 0) {
            g0();
        }
        if (this.E > 0) {
            this.f21524c.m(this);
        }
    }

    @Override // da.e0.b
    /* renamed from: X */
    public void m(k9.f fVar, long j10, long j11) {
        this.f21542u = null;
        this.f21525d.p(fVar);
        i9.n nVar = new i9.n(fVar.f33385a, fVar.f33386b, fVar.e(), fVar.d(), j10, j11, fVar.a());
        this.f21530i.d(fVar.f33385a);
        this.f21532k.u(nVar, fVar.f33387c, this.f21523b, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
        if (!this.D) {
            d(this.P);
        } else {
            this.f21524c.m(this);
        }
    }

    @Override // da.e0.b
    /* renamed from: Y */
    public e0.c s(k9.f fVar, long j10, long j11, IOException iOException, int i10) {
        e0.c cVar;
        int i11;
        boolean O = O(fVar);
        if (O && !((h) fVar).p() && (iOException instanceof a0.e) && ((i11 = ((a0.e) iOException).f29120b) == 410 || i11 == 404)) {
            return e0.f29143d;
        }
        long a10 = fVar.a();
        i9.n nVar = new i9.n(fVar.f33385a, fVar.f33386b, fVar.e(), fVar.d(), j10, j11, a10);
        d0.c cVar2 = new d0.c(nVar, new q(fVar.f33387c, this.f21523b, fVar.f33388d, fVar.f33389e, fVar.f33390f, ea.n0.Z0(fVar.f33391g), ea.n0.Z0(fVar.f33392h)), iOException, i10);
        d0.b a11 = this.f21530i.a(ba.z.a(this.f21525d.k()), cVar2);
        boolean m10 = (a11 == null || a11.f29135a != 2) ? false : this.f21525d.m(fVar, a11.f29136b);
        if (m10) {
            if (O && a10 == 0) {
                ArrayList<h> arrayList = this.f21535n;
                ea.a.f(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f21535n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((h) jb.v.c(this.f21535n)).n();
                }
            }
            cVar = e0.f29144e;
        } else {
            long b10 = this.f21530i.b(cVar2);
            if (b10 != -9223372036854775807L) {
                cVar = e0.h(false, b10);
            } else {
                cVar = e0.f29145f;
            }
        }
        e0.c cVar3 = cVar;
        boolean z10 = !cVar3.c();
        this.f21532k.w(nVar, fVar.f33387c, this.f21523b, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h, iOException, z10);
        if (z10) {
            this.f21542u = null;
            this.f21530i.d(fVar.f33385a);
        }
        if (m10) {
            if (!this.D) {
                d(this.P);
            } else {
                this.f21524c.m(this);
            }
        }
        return cVar3;
    }

    public void Z() {
        this.f21545x.clear();
    }

    @Override // i9.n0.d
    public void a(p1 p1Var) {
        this.f21539r.post(this.f21537p);
    }

    public boolean a0(Uri uri, d0.c cVar, boolean z10) {
        d0.b a10;
        if (this.f21525d.o(uri)) {
            long j10 = (z10 || (a10 = this.f21530i.a(ba.z.a(this.f21525d.k()), cVar)) == null || a10.f29135a != 2) ? -9223372036854775807L : a10.f29136b;
            return this.f21525d.q(uri, j10) && j10 != -9223372036854775807L;
        }
        return true;
    }

    @Override // i9.p0
    public long b() {
        if (P()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return K().f33392h;
    }

    public void b0() {
        if (this.f21535n.isEmpty()) {
            return;
        }
        h hVar = (h) jb.v.c(this.f21535n);
        int c10 = this.f21525d.c(hVar);
        if (c10 == 1) {
            hVar.u();
        } else if (c10 == 2 && !this.T && this.f21531j.j()) {
            this.f21531j.f();
        }
    }

    @Override // i9.p0
    public boolean c() {
        return this.f21531j.j();
    }

    @Override // i9.p0
    public boolean d(long j10) {
        List<h> list;
        long max;
        if (this.T || this.f21531j.j() || this.f21531j.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.Q;
            for (d dVar : this.f21543v) {
                dVar.b0(this.Q);
            }
        } else {
            list = this.f21536o;
            h K = K();
            if (K.g()) {
                max = K.f33392h;
            } else {
                max = Math.max(this.P, K.f33391g);
            }
        }
        List<h> list2 = list;
        long j11 = max;
        this.f21534m.a();
        this.f21525d.e(j10, j11, list2, this.D || !list2.isEmpty(), this.f21534m);
        e.b bVar = this.f21534m;
        boolean z10 = bVar.f21468b;
        k9.f fVar = bVar.f21467a;
        Uri uri = bVar.f21469c;
        if (z10) {
            this.Q = -9223372036854775807L;
            this.T = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f21524c.n(uri);
            }
            return false;
        } else {
            if (O(fVar)) {
                N((h) fVar);
            }
            this.f21542u = fVar;
            this.f21532k.A(new i9.n(fVar.f33385a, fVar.f33386b, this.f21531j.n(fVar, this, this.f21530i.c(fVar.f33387c))), fVar.f33387c, this.f21523b, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
            return true;
        }
    }

    public void d0(w0[] w0VarArr, int i10, int... iArr) {
        this.I = E(w0VarArr);
        this.J = new HashSet();
        for (int i11 : iArr) {
            this.J.add(this.I.b(i11));
        }
        this.L = i10;
        Handler handler = this.f21539r;
        final b bVar = this.f21524c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: n9.c
            @Override // java.lang.Runnable
            public final void run() {
                n.b.this.onPrepared();
            }
        });
        l0();
    }

    public long e(long j10, b3 b3Var) {
        return this.f21525d.b(j10, b3Var);
    }

    public int e0(int i10, q1 q1Var, m8.g gVar, int i11) {
        p1 p1Var;
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f21535n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f21535n.size() - 1 && I(this.f21535n.get(i13))) {
                i13++;
            }
            ea.n0.N0(this.f21535n, 0, i13);
            h hVar = this.f21535n.get(0);
            p1 p1Var2 = hVar.f33388d;
            if (!p1Var2.equals(this.G)) {
                this.f21532k.i(this.f21523b, p1Var2, hVar.f33389e, hVar.f33390f, hVar.f33391g);
            }
            this.G = p1Var2;
        }
        if (this.f21535n.isEmpty() || this.f21535n.get(0).p()) {
            int S = this.f21543v[i10].S(q1Var, gVar, i11, this.T);
            if (S == -5) {
                p1 p1Var3 = (p1) ea.a.e(q1Var.f32770b);
                if (i10 == this.B) {
                    int Q = this.f21543v[i10].Q();
                    while (i12 < this.f21535n.size() && this.f21535n.get(i12).f21478k != Q) {
                        i12++;
                    }
                    if (i12 < this.f21535n.size()) {
                        p1Var = this.f21535n.get(i12).f33388d;
                    } else {
                        p1Var = (p1) ea.a.e(this.F);
                    }
                    p1Var3 = p1Var3.j(p1Var);
                }
                q1Var.f32770b = p1Var3;
            }
            return S;
        }
        return -3;
    }

    @Override // p8.k
    public p8.a0 f(int i10, int i11) {
        p8.a0 a0Var;
        if (!Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                p8.a0[] a0VarArr = this.f21543v;
                if (i12 >= a0VarArr.length) {
                    a0Var = null;
                    break;
                } else if (this.f21544w[i12] == i10) {
                    a0Var = a0VarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            a0Var = L(i10, i11);
        }
        if (a0Var == null) {
            if (this.U) {
                return C(i10, i11);
            }
            a0Var = D(i10, i11);
        }
        if (i11 == 5) {
            if (this.f21547z == null) {
                this.f21547z = new c(a0Var, this.f21533l);
            }
            return this.f21547z;
        }
        return a0Var;
    }

    public void f0() {
        if (this.D) {
            for (d dVar : this.f21543v) {
                dVar.R();
            }
        }
        this.f21531j.m(this);
        this.f21539r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f21540s.clear();
    }

    @Override // i9.p0
    public long g() {
        ArrayList<h> arrayList;
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.Q;
        }
        long j10 = this.P;
        h K = K();
        if (!K.g()) {
            K = this.f21535n.size() > 1 ? this.f21535n.get(arrayList.size() - 2) : null;
        }
        if (K != null) {
            j10 = Math.max(j10, K.f33392h);
        }
        if (this.C) {
            for (d dVar : this.f21543v) {
                j10 = Math.max(j10, dVar.z());
            }
        }
        return j10;
    }

    @Override // i9.p0
    public void h(long j10) {
        if (this.f21531j.i() || P()) {
            return;
        }
        if (this.f21531j.j()) {
            ea.a.e(this.f21542u);
            if (this.f21525d.v(j10, this.f21542u, this.f21536o)) {
                this.f21531j.f();
                return;
            }
            return;
        }
        int size = this.f21536o.size();
        while (size > 0 && this.f21525d.c(this.f21536o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f21536o.size()) {
            G(size);
        }
        int h10 = this.f21525d.h(j10, this.f21536o);
        if (h10 < this.f21535n.size()) {
            G(h10);
        }
    }

    public boolean i0(long j10, boolean z10) {
        this.P = j10;
        if (P()) {
            this.Q = j10;
            return true;
        }
        if (this.C && !z10 && h0(j10)) {
            return false;
        }
        this.Q = j10;
        this.T = false;
        this.f21535n.clear();
        if (this.f21531j.j()) {
            if (this.C) {
                for (d dVar : this.f21543v) {
                    dVar.r();
                }
            }
            this.f21531j.f();
        } else {
            this.f21531j.g();
            g0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j0(ba.q[] r20, boolean[] r21, i9.o0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.j0(ba.q[], boolean[], i9.o0[], boolean[], long, boolean):boolean");
    }

    public void k0(DrmInitData drmInitData) {
        if (ea.n0.c(this.W, drmInitData)) {
            return;
        }
        this.W = drmInitData;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f21543v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.O[i10]) {
                dVarArr[i10].i0(drmInitData);
            }
            i10++;
        }
    }

    public void m0(boolean z10) {
        this.f21525d.t(z10);
    }

    @Override // p8.k
    public void n(x xVar) {
    }

    public void n0(long j10) {
        if (this.V != j10) {
            this.V = j10;
            for (d dVar : this.f21543v) {
                dVar.a0(j10);
            }
        }
    }

    @Override // da.e0.f
    public void o() {
        for (d dVar : this.f21543v) {
            dVar.T();
        }
    }

    public int o0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.f21543v[i10];
        int E = dVar.E(j10, this.T);
        h hVar = (h) jb.v.d(this.f21535n, null);
        if (hVar != null && !hVar.p()) {
            E = Math.min(E, hVar.l(i10) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    public void p0(int i10) {
        x();
        ea.a.e(this.K);
        int i11 = this.K[i10];
        ea.a.f(this.N[i11]);
        this.N[i11] = false;
    }

    public void q() throws IOException {
        U();
        if (this.T && !this.D) {
            throw j2.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p8.k
    public void r() {
        this.U = true;
        this.f21539r.post(this.f21538q);
    }

    public y0 t() {
        x();
        return this.I;
    }

    public void u(long j10, boolean z10) {
        if (!this.C || P()) {
            return;
        }
        int length = this.f21543v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f21543v[i10].q(j10, z10, this.N[i10]);
        }
    }

    public int y(int i10) {
        x();
        ea.a.e(this.K);
        int i11 = this.K[i10];
        if (i11 == -1) {
            return this.J.contains(this.I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
