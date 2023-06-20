package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import ba.q;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.n;
import da.d0;
import da.m0;
import ea.n0;
import ea.v;
import i9.b0;
import i9.o0;
import i9.p0;
import i9.r;
import i9.w0;
import i9.y0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k8.o1;
import o9.h;
import o9.l;

/* compiled from: HlsMediaPeriod.java */
/* loaded from: classes2.dex */
public final class j implements r, n.b, l.b {

    /* renamed from: a  reason: collision with root package name */
    private final f f21494a;

    /* renamed from: b  reason: collision with root package name */
    private final o9.l f21495b;

    /* renamed from: c  reason: collision with root package name */
    private final n9.b f21496c;

    /* renamed from: d  reason: collision with root package name */
    private final m0 f21497d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f21498e;

    /* renamed from: f  reason: collision with root package name */
    private final k.a f21499f;

    /* renamed from: g  reason: collision with root package name */
    private final d0 f21500g;

    /* renamed from: h  reason: collision with root package name */
    private final b0.a f21501h;

    /* renamed from: i  reason: collision with root package name */
    private final da.b f21502i;

    /* renamed from: l  reason: collision with root package name */
    private final i9.h f21505l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f21506m;

    /* renamed from: n  reason: collision with root package name */
    private final int f21507n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f21508o;

    /* renamed from: p  reason: collision with root package name */
    private final o1 f21509p;

    /* renamed from: q  reason: collision with root package name */
    private r.a f21510q;

    /* renamed from: r  reason: collision with root package name */
    private int f21511r;

    /* renamed from: s  reason: collision with root package name */
    private y0 f21512s;

    /* renamed from: v  reason: collision with root package name */
    private int f21515v;

    /* renamed from: w  reason: collision with root package name */
    private p0 f21516w;

    /* renamed from: j  reason: collision with root package name */
    private final IdentityHashMap<o0, Integer> f21503j = new IdentityHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final n9.e f21504k = new n9.e();

    /* renamed from: t  reason: collision with root package name */
    private n[] f21513t = new n[0];

    /* renamed from: u  reason: collision with root package name */
    private n[] f21514u = new n[0];

    public j(f fVar, o9.l lVar, n9.b bVar, m0 m0Var, com.google.android.exoplayer2.drm.l lVar2, k.a aVar, d0 d0Var, b0.a aVar2, da.b bVar2, i9.h hVar, boolean z10, int i10, boolean z11, o1 o1Var) {
        this.f21494a = fVar;
        this.f21495b = lVar;
        this.f21496c = bVar;
        this.f21497d = m0Var;
        this.f21498e = lVar2;
        this.f21499f = aVar;
        this.f21500g = d0Var;
        this.f21501h = aVar2;
        this.f21502i = bVar2;
        this.f21505l = hVar;
        this.f21506m = z10;
        this.f21507n = i10;
        this.f21508o = z11;
        this.f21509p = o1Var;
        this.f21516w = hVar.a(new p0[0]);
    }

    private void o(long j10, List<h.a> list, List<n> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f35124c;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (n0.c(str, list.get(i11).f35124c)) {
                        h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f35122a);
                        arrayList2.add(aVar.f35123b);
                        z10 &= n0.K(aVar.f35123b.f32706i, 1) == 1;
                    }
                }
                String valueOf = String.valueOf(str);
                String concat = valueOf.length() != 0 ? "audio:".concat(valueOf) : new String("audio:");
                n v10 = v(concat, 1, (Uri[]) arrayList.toArray((Uri[]) n0.k(new Uri[0])), (p1[]) arrayList2.toArray(new p1[0]), null, Collections.emptyList(), map, j10);
                list3.add(mb.d.l(arrayList3));
                list2.add(v10);
                if (this.f21506m && z10) {
                    v10.d0(new w0[]{new w0(concat, (p1[]) arrayList2.toArray(new p1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(o9.h r21, long r22, java.util.List<com.google.android.exoplayer2.source.hls.n> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r26) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.j.r(o9.h, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void s(long j10) {
        Map<String, DrmInitData> emptyMap;
        o9.h hVar = (o9.h) ea.a.e(this.f21495b.c());
        if (this.f21508o) {
            emptyMap = x(hVar.f35121m);
        } else {
            emptyMap = Collections.emptyMap();
        }
        Map<String, DrmInitData> map = emptyMap;
        boolean z10 = !hVar.f35113e.isEmpty();
        List<h.a> list = hVar.f35115g;
        List<h.a> list2 = hVar.f35116h;
        this.f21511r = 0;
        ArrayList arrayList = new ArrayList();
        List<int[]> arrayList2 = new ArrayList<>();
        if (z10) {
            r(hVar, j10, arrayList, arrayList2, map);
        }
        o(j10, list, arrayList, arrayList2, map);
        this.f21515v = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = aVar.f35124c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
            sb2.append("subtitle:");
            sb2.append(i10);
            sb2.append(":");
            sb2.append(str);
            String sb3 = sb2.toString();
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            n v10 = v(sb3, 3, new Uri[]{aVar.f35122a}, new p1[]{aVar.f35123b}, null, Collections.emptyList(), map, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(v10);
            v10.d0(new w0[]{new w0(sb3, aVar.f35123b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f21513t = (n[]) arrayList.toArray(new n[0]);
        int[][] iArr = (int[][]) arrayList2.toArray(new int[0]);
        n[] nVarArr = this.f21513t;
        this.f21511r = nVarArr.length;
        nVarArr[0].m0(true);
        for (n nVar : this.f21513t) {
            nVar.B();
        }
        this.f21514u = this.f21513t;
    }

    private n v(String str, int i10, Uri[] uriArr, Format[] formatArr, p1 p1Var, List<p1> list, Map<String, DrmInitData> map, long j10) {
        return new n(str, i10, this, new e(this.f21494a, this.f21495b, uriArr, formatArr, this.f21496c, this.f21497d, this.f21504k, list, this.f21509p), map, this.f21502i, j10, p1Var, this.f21498e, this.f21499f, this.f21500g, this.f21501h, this.f21507n);
    }

    private static p1 w(p1 p1Var, p1 p1Var2, boolean z10) {
        String str;
        Metadata metadata;
        int i10;
        int i11;
        int i12;
        String str2;
        String str3;
        if (p1Var2 != null) {
            str2 = p1Var2.f32706i;
            metadata = p1Var2.f32707j;
            int i13 = p1Var2.f32722y;
            i11 = p1Var2.f32701d;
            int i14 = p1Var2.f32702e;
            String str4 = p1Var2.f32700c;
            str3 = p1Var2.f32699b;
            i12 = i13;
            i10 = i14;
            str = str4;
        } else {
            String L = n0.L(p1Var.f32706i, 1);
            Metadata metadata2 = p1Var.f32707j;
            if (z10) {
                int i15 = p1Var.f32722y;
                int i16 = p1Var.f32701d;
                int i17 = p1Var.f32702e;
                str = p1Var.f32700c;
                str2 = L;
                str3 = p1Var.f32699b;
                i12 = i15;
                i11 = i16;
                metadata = metadata2;
                i10 = i17;
            } else {
                str = null;
                metadata = metadata2;
                i10 = 0;
                i11 = 0;
                i12 = -1;
                str2 = L;
                str3 = null;
            }
        }
        return new p1.b().S(p1Var.f32698a).U(str3).K(p1Var.f32708k).e0(v.g(str2)).I(str2).X(metadata).G(z10 ? p1Var.f32703f : -1).Z(z10 ? p1Var.f32704g : -1).H(i12).g0(i11).c0(i10).V(str).E();
    }

    private static Map<String, DrmInitData> x(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitData = list.get(i10);
            String str = drmInitData.f21020c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData2.f21020c, str)) {
                    drmInitData = drmInitData.i(drmInitData2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    private static p1 y(p1 p1Var) {
        String L = n0.L(p1Var.f32706i, 2);
        return new p1.b().S(p1Var.f32698a).U(p1Var.f32699b).K(p1Var.f32708k).e0(v.g(L)).I(L).X(p1Var.f32707j).G(p1Var.f32703f).Z(p1Var.f32704g).j0(p1Var.f32714q).Q(p1Var.f32715r).P(p1Var.f32716s).g0(p1Var.f32701d).c0(p1Var.f32702e).E();
    }

    public void A() {
        this.f21495b.e(this);
        for (n nVar : this.f21513t) {
            nVar.f0();
        }
        this.f21510q = null;
    }

    @Override // o9.l.b
    public boolean a(Uri uri, d0.c cVar, boolean z10) {
        boolean z11 = true;
        for (n nVar : this.f21513t) {
            z11 &= nVar.a0(uri, cVar, z10);
        }
        this.f21510q.m(this);
        return z11;
    }

    @Override // i9.r, i9.p0
    public long b() {
        return this.f21516w.b();
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f21516w.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        if (this.f21512s == null) {
            for (n nVar : this.f21513t) {
                nVar.B();
            }
            return false;
        }
        return this.f21516w.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        n[] nVarArr;
        for (n nVar : this.f21514u) {
            if (nVar.R()) {
                return nVar.e(j10, b3Var);
            }
        }
        return j10;
    }

    @Override // i9.r, i9.p0
    public long g() {
        return this.f21516w.g();
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        this.f21516w.h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f21510q = aVar;
        this.f21495b.f(this);
        s(j10);
    }

    @Override // o9.l.b
    public void j() {
        for (n nVar : this.f21513t) {
            nVar.b0();
        }
        this.f21510q.m(this);
    }

    @Override // i9.r
    public long k(long j10) {
        n[] nVarArr = this.f21514u;
        if (nVarArr.length > 0) {
            boolean i02 = nVarArr[0].i0(j10, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.f21514u;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].i0(j10, i02);
                i10++;
            }
            if (i02) {
                this.f21504k.b();
            }
        }
        return j10;
    }

    @Override // i9.r
    public long l() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.hls.n.b
    public void n(Uri uri) {
        this.f21495b.d(uri);
    }

    @Override // com.google.android.exoplayer2.source.hls.n.b
    public void onPrepared() {
        n[] nVarArr;
        int i10 = this.f21511r - 1;
        this.f21511r = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (n nVar : this.f21513t) {
            i11 += nVar.t().f31863a;
        }
        w0[] w0VarArr = new w0[i11];
        int i12 = 0;
        for (n nVar2 : this.f21513t) {
            int i13 = nVar2.t().f31863a;
            int i14 = 0;
            while (i14 < i13) {
                w0VarArr[i12] = nVar2.t().b(i14);
                i14++;
                i12++;
            }
        }
        this.f21512s = new y0(w0VarArr);
        this.f21510q.f(this);
    }

    @Override // i9.r
    public long p(q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        o0[] o0VarArr2 = o0VarArr;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            iArr[i10] = o0VarArr2[i10] == null ? -1 : this.f21503j.get(o0VarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (qVarArr[i10] != null) {
                w0 k10 = qVarArr[i10].k();
                int i11 = 0;
                while (true) {
                    n[] nVarArr = this.f21513t;
                    if (i11 >= nVarArr.length) {
                        break;
                    } else if (nVarArr[i11].t().c(k10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f21503j.clear();
        int length = qVarArr.length;
        o0[] o0VarArr3 = new o0[length];
        o0[] o0VarArr4 = new o0[qVarArr.length];
        q[] qVarArr2 = new q[qVarArr.length];
        n[] nVarArr2 = new n[this.f21513t.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f21513t.length) {
            for (int i14 = 0; i14 < qVarArr.length; i14++) {
                q qVar = null;
                o0VarArr4[i14] = iArr[i14] == i13 ? o0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    qVar = qVarArr[i14];
                }
                qVarArr2[i14] = qVar;
            }
            n nVar = this.f21513t[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            q[] qVarArr3 = qVarArr2;
            n[] nVarArr3 = nVarArr2;
            boolean j02 = nVar.j0(qVarArr2, zArr, o0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= qVarArr.length) {
                    break;
                }
                o0 o0Var = o0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    ea.a.e(o0Var);
                    o0VarArr3[i18] = o0Var;
                    this.f21503j.put(o0Var, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    ea.a.f(o0Var == null);
                }
                i18++;
            }
            if (z11) {
                nVarArr3[i15] = nVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    nVar.m0(true);
                    if (!j02) {
                        n[] nVarArr4 = this.f21514u;
                        if (nVarArr4.length != 0 && nVar == nVarArr4[0]) {
                        }
                    }
                    this.f21504k.b();
                    z10 = true;
                } else {
                    nVar.m0(i17 < this.f21515v);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            nVarArr2 = nVarArr3;
            length = i16;
            qVarArr2 = qVarArr3;
            o0VarArr2 = o0VarArr;
        }
        System.arraycopy(o0VarArr3, 0, o0VarArr2, 0, length);
        n[] nVarArr5 = (n[]) n0.H0(nVarArr2, i12);
        this.f21514u = nVarArr5;
        this.f21516w = this.f21505l.a(nVarArr5);
        return j10;
    }

    @Override // i9.r
    public void q() throws IOException {
        for (n nVar : this.f21513t) {
            nVar.q();
        }
    }

    @Override // i9.r
    public y0 t() {
        return (y0) ea.a.e(this.f21512s);
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        for (n nVar : this.f21514u) {
            nVar.u(j10, z10);
        }
    }

    @Override // i9.p0.a
    /* renamed from: z */
    public void m(n nVar) {
        this.f21510q.m(this);
    }
}
