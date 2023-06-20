package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ba.q;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.f;
import da.d0;
import da.f0;
import da.m0;
import ea.n0;
import i9.b0;
import i9.h;
import i9.o0;
import i9.p0;
import i9.r;
import i9.w0;
import i9.y0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.o1;
import k9.i;
import m9.g;
import m9.j;

/* compiled from: DashMediaPeriod.java */
/* loaded from: classes2.dex */
final class b implements r, p0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f21318y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f21319z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a  reason: collision with root package name */
    final int f21320a;

    /* renamed from: b  reason: collision with root package name */
    private final a.InterfaceC0289a f21321b;

    /* renamed from: c  reason: collision with root package name */
    private final m0 f21322c;

    /* renamed from: d  reason: collision with root package name */
    private final l f21323d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f21324e;

    /* renamed from: f  reason: collision with root package name */
    private final l9.b f21325f;

    /* renamed from: g  reason: collision with root package name */
    private final long f21326g;

    /* renamed from: h  reason: collision with root package name */
    private final f0 f21327h;

    /* renamed from: i  reason: collision with root package name */
    private final da.b f21328i;

    /* renamed from: j  reason: collision with root package name */
    private final y0 f21329j;

    /* renamed from: k  reason: collision with root package name */
    private final a[] f21330k;

    /* renamed from: l  reason: collision with root package name */
    private final h f21331l;

    /* renamed from: m  reason: collision with root package name */
    private final f f21332m;

    /* renamed from: o  reason: collision with root package name */
    private final b0.a f21334o;

    /* renamed from: p  reason: collision with root package name */
    private final k.a f21335p;

    /* renamed from: q  reason: collision with root package name */
    private final o1 f21336q;

    /* renamed from: r  reason: collision with root package name */
    private r.a f21337r;

    /* renamed from: u  reason: collision with root package name */
    private p0 f21340u;

    /* renamed from: v  reason: collision with root package name */
    private m9.c f21341v;

    /* renamed from: w  reason: collision with root package name */
    private int f21342w;

    /* renamed from: x  reason: collision with root package name */
    private List<m9.f> f21343x;

    /* renamed from: s  reason: collision with root package name */
    private ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] f21338s = E(0);

    /* renamed from: t  reason: collision with root package name */
    private e[] f21339t = new e[0];

    /* renamed from: n  reason: collision with root package name */
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, f.c> f21333n = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DashMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f21344a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21345b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21346c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21347d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21348e;

        /* renamed from: f  reason: collision with root package name */
        public final int f21349f;

        /* renamed from: g  reason: collision with root package name */
        public final int f21350g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f21345b = i10;
            this.f21344a = iArr;
            this.f21346c = i11;
            this.f21348e = i12;
            this.f21349f = i13;
            this.f21350g = i14;
            this.f21347d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, m9.c cVar, l9.b bVar, int i11, a.InterfaceC0289a interfaceC0289a, m0 m0Var, l lVar, k.a aVar, d0 d0Var, b0.a aVar2, long j10, f0 f0Var, da.b bVar2, h hVar, f.b bVar3, o1 o1Var) {
        this.f21320a = i10;
        this.f21341v = cVar;
        this.f21325f = bVar;
        this.f21342w = i11;
        this.f21321b = interfaceC0289a;
        this.f21322c = m0Var;
        this.f21323d = lVar;
        this.f21335p = aVar;
        this.f21324e = d0Var;
        this.f21334o = aVar2;
        this.f21326g = j10;
        this.f21327h = f0Var;
        this.f21328i = bVar2;
        this.f21331l = hVar;
        this.f21336q = o1Var;
        this.f21332m = new f(cVar, bVar3, bVar2);
        this.f21340u = hVar.a(this.f21338s);
        g d10 = cVar.d(i11);
        List<m9.f> list = d10.f34369d;
        this.f21343x = list;
        Pair<y0, a[]> s10 = s(lVar, d10.f34368c, list);
        this.f21329j = (y0) s10.first;
        this.f21330k = (a[]) s10.second;
    }

    private int A(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f21330k[i11].f21348e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f21330k[i14].f21346c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] B(q[] qVarArr) {
        int[] iArr = new int[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (qVarArr[i10] != null) {
                iArr[i10] = this.f21329j.c(qVarArr[i10].k());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean C(List<m9.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f34324c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f34382d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int D(int i10, List<m9.a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (C(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            formatArr[i12] = y(list, iArr[i12]);
            if (formatArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] E(int i10) {
        return new i[i10];
    }

    private static p1[] G(m9.e eVar, Pattern pattern, p1 p1Var) {
        String str = eVar.f34360b;
        if (str == null) {
            return new p1[]{p1Var};
        }
        String[] R0 = n0.R0(str, ";");
        p1[] p1VarArr = new p1[R0.length];
        for (int i10 = 0; i10 < R0.length; i10++) {
            Matcher matcher = pattern.matcher(R0[i10]);
            if (!matcher.matches()) {
                return new p1[]{p1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            p1.b b10 = p1Var.b();
            String str2 = p1Var.f32698a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
            sb2.append(str2);
            sb2.append(":");
            sb2.append(parseInt);
            p1VarArr[i10] = b10.S(sb2.toString()).F(parseInt).V(matcher.group(2)).E();
        }
        return p1VarArr;
    }

    private void I(q[] qVarArr, boolean[] zArr, o0[] o0VarArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (qVarArr[i10] == null || !zArr[i10]) {
                if (o0VarArr[i10] instanceof i) {
                    ((i) o0VarArr[i10]).P(this);
                } else if (o0VarArr[i10] instanceof i.a) {
                    ((i.a) o0VarArr[i10]).c();
                }
                o0VarArr[i10] = null;
            }
        }
    }

    private void J(q[] qVarArr, o0[] o0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if ((o0VarArr[i10] instanceof i9.k) || (o0VarArr[i10] instanceof i.a)) {
                int A = A(i10, iArr);
                if (A == -1) {
                    z10 = o0VarArr[i10] instanceof i9.k;
                } else {
                    z10 = (o0VarArr[i10] instanceof i.a) && ((i.a) o0VarArr[i10]).f33419a == o0VarArr[A];
                }
                if (!z10) {
                    if (o0VarArr[i10] instanceof i.a) {
                        ((i.a) o0VarArr[i10]).c();
                    }
                    o0VarArr[i10] = null;
                }
            }
        }
    }

    private void K(q[] qVarArr, o0[] o0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null) {
                if (o0VarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f21330k[iArr[i10]];
                    int i11 = aVar.f21346c;
                    if (i11 == 0) {
                        o0VarArr[i10] = r(aVar, qVar, j10);
                    } else if (i11 == 2) {
                        o0VarArr[i10] = new e(this.f21343x.get(aVar.f21347d), qVar.k().c(0), this.f21341v.f34335d);
                    }
                } else if (o0VarArr[i10] instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) o0VarArr[i10]).D()).b(qVar);
                }
            }
        }
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            if (o0VarArr[i12] == null && qVarArr[i12] != null) {
                a aVar2 = this.f21330k[iArr[i12]];
                if (aVar2.f21346c == 1) {
                    int A = A(i12, iArr);
                    if (A == -1) {
                        o0VarArr[i12] = new i9.k();
                    } else {
                        o0VarArr[i12] = ((i) o0VarArr[A]).S(j10, aVar2.f21345b);
                    }
                }
            }
        }
    }

    private static void j(List<m9.f> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            m9.f fVar = list.get(i11);
            p1 E = new p1.b().S(fVar.a()).e0("application/x-emsg").E();
            String a10 = fVar.a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 12);
            sb2.append(a10);
            sb2.append(":");
            sb2.append(i11);
            trackGroupArr[i10] = new w0(sb2.toString(), E);
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int o(l lVar, List<m9.a> list, int[][] iArr, int i10, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, a[] aVarArr) {
        String sb2;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f34324c);
            }
            int size = arrayList.size();
            p1[] p1VarArr = new p1[size];
            for (int i16 = 0; i16 < size; i16++) {
                p1 p1Var = ((j) arrayList.get(i16)).f34379a;
                p1VarArr[i16] = p1Var.c(lVar.b(p1Var));
            }
            m9.a aVar = list.get(iArr2[0]);
            int i17 = aVar.f34322a;
            if (i17 != -1) {
                sb2 = Integer.toString(i17);
            } else {
                StringBuilder sb3 = new StringBuilder(17);
                sb3.append("unset:");
                sb3.append(i13);
                sb2 = sb3.toString();
            }
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (formatArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            trackGroupArr[i14] = new w0(sb2, p1VarArr);
            aVarArr[i14] = a.d(aVar.f34323b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String concat = String.valueOf(sb2).concat(":emsg");
                trackGroupArr[i18] = new w0(concat, new p1.b().S(concat).e0("application/x-emsg").E());
                aVarArr[i18] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                trackGroupArr[i11] = new w0(String.valueOf(sb2).concat(":cc"), formatArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i<com.google.android.exoplayer2.source.dash.a> r(a aVar, q qVar, long j10) {
        w0 w0Var;
        int i10;
        w0 w0Var2;
        int i11;
        int i12 = aVar.f21349f;
        boolean z10 = i12 != -1;
        f.c cVar = null;
        if (z10) {
            w0Var = this.f21329j.b(i12);
            i10 = 1;
        } else {
            w0Var = null;
            i10 = 0;
        }
        int i13 = aVar.f21350g;
        boolean z11 = i13 != -1;
        if (z11) {
            w0Var2 = this.f21329j.b(i13);
            i10 += w0Var2.f31846a;
        } else {
            w0Var2 = null;
        }
        p1[] p1VarArr = new p1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            p1VarArr[0] = w0Var.c(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < w0Var2.f31846a; i14++) {
                p1VarArr[i11] = w0Var2.c(i14);
                iArr[i11] = 3;
                arrayList.add(p1VarArr[i11]);
                i11++;
            }
        }
        if (this.f21341v.f34335d && z10) {
            cVar = this.f21332m.k();
        }
        f.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f21345b, iArr, p1VarArr, this.f21321b.a(this.f21327h, this.f21341v, this.f21325f, this.f21342w, aVar.f21344a, qVar, aVar.f21345b, this.f21326g, z10, arrayList, cVar2, this.f21322c, this.f21336q), this, this.f21328i, j10, this.f21323d, this.f21335p, this.f21324e, this.f21334o);
        synchronized (this) {
            this.f21333n.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<y0, a[]> s(l lVar, List<m9.a> list, List<m9.f> list2) {
        int[][] z10 = z(list);
        int length = z10.length;
        boolean[] zArr = new boolean[length];
        p1[][] p1VarArr = new p1[length];
        int D = D(length, list, z10, zArr, p1VarArr) + length + list2.size();
        w0[] w0VarArr = new w0[D];
        a[] aVarArr = new a[D];
        j(list2, w0VarArr, aVarArr, o(lVar, list, z10, length, zArr, p1VarArr, w0VarArr, aVarArr));
        return Pair.create(new y0(w0VarArr), aVarArr);
    }

    private static m9.e v(List<m9.e> list) {
        return w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static m9.e w(List<m9.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m9.e eVar = list.get(i10);
            if (str.equals(eVar.f34359a)) {
                return eVar;
            }
        }
        return null;
    }

    private static m9.e x(List<m9.e> list) {
        return w(list, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] y(List<m9.a> list, int[] iArr) {
        for (int i10 : iArr) {
            m9.a aVar = list.get(i10);
            List<m9.e> list2 = list.get(i10).f34325d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                m9.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f34359a)) {
                    p1.b e02 = new p1.b().e0("application/cea-608");
                    int i12 = aVar.f34322a;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i12);
                    sb2.append(":cea608");
                    return G(eVar, f21318y, e02.S(sb2.toString()).E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f34359a)) {
                    p1.b e03 = new p1.b().e0("application/cea-708");
                    int i13 = aVar.f34322a;
                    StringBuilder sb3 = new StringBuilder(18);
                    sb3.append(i13);
                    sb3.append(":cea708");
                    return G(eVar, f21319z, e03.S(sb3.toString()).E());
                }
            }
        }
        return new p1[0];
    }

    private static int[][] z(List<m9.a> list) {
        int i10;
        m9.e v10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f34322a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            m9.a aVar = list.get(i12);
            m9.e x10 = x(aVar.f34326e);
            if (x10 == null) {
                x10 = x(aVar.f34327f);
            }
            if (x10 == null || (i10 = sparseIntArray.get(Integer.parseInt(x10.f34360b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (v10 = v(aVar.f34327f)) != null) {
                for (String str : n0.R0(v10.f34360b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = mb.d.l((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    @Override // i9.p0.a
    /* renamed from: F */
    public void m(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.f21337r.m(this);
    }

    public void H() {
        this.f21332m.o();
        for (i iVar : this.f21338s) {
            iVar.P(this);
        }
        this.f21337r = null;
    }

    public void L(m9.c cVar, int i10) {
        e[] eVarArr;
        this.f21341v = cVar;
        this.f21342w = i10;
        this.f21332m.q(cVar);
        i[] iVarArr = this.f21338s;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                ((com.google.android.exoplayer2.source.dash.a) iVar.D()).h(cVar, i10);
            }
            this.f21337r.m(this);
        }
        this.f21343x = cVar.d(i10).f34369d;
        for (e eVar : this.f21339t) {
            Iterator<m9.f> it = this.f21343x.iterator();
            while (true) {
                if (it.hasNext()) {
                    m9.f next = it.next();
                    if (next.a().equals(eVar.b())) {
                        boolean z10 = true;
                        eVar.d(next, (cVar.f34335d && i10 == cVar.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // k9.i.b
    public synchronized void a(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        f.c remove = this.f21333n.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // i9.r, i9.p0
    public long b() {
        return this.f21340u.b();
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f21340u.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        return this.f21340u.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        i[] iVarArr;
        for (i iVar : this.f21338s) {
            if (iVar.f33396a == 2) {
                return iVar.e(j10, b3Var);
            }
        }
        return j10;
    }

    @Override // i9.r, i9.p0
    public long g() {
        return this.f21340u.g();
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        this.f21340u.h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f21337r = aVar;
        aVar.f(this);
    }

    @Override // i9.r
    public long k(long j10) {
        for (i iVar : this.f21338s) {
            iVar.R(j10);
        }
        for (e eVar : this.f21339t) {
            eVar.c(j10);
        }
        return j10;
    }

    @Override // i9.r
    public long l() {
        return -9223372036854775807L;
    }

    @Override // i9.r
    public long p(q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        int[] B = B(qVarArr);
        I(qVarArr, zArr, o0VarArr);
        J(qVarArr, o0VarArr, B);
        K(qVarArr, o0VarArr, zArr2, j10, B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (o0 o0Var : o0VarArr) {
            if (o0Var instanceof i) {
                arrayList.add((i) o0Var);
            } else if (o0Var instanceof e) {
                arrayList2.add((e) o0Var);
            }
        }
        ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] E = E(arrayList.size());
        this.f21338s = E;
        arrayList.toArray(E);
        e[] eVarArr = new e[arrayList2.size()];
        this.f21339t = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f21340u = this.f21331l.a(this.f21338s);
        return j10;
    }

    @Override // i9.r
    public void q() throws IOException {
        this.f21327h.a();
    }

    @Override // i9.r
    public y0 t() {
        return this.f21329j;
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        for (i iVar : this.f21338s) {
            iVar.u(j10, z10);
        }
    }
}
