package ba;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ba.a;
import ba.l;
import ba.q;
import ba.s;
import ba.w;
import ba.y;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ea.n0;
import i9.u;
import i9.w0;
import i9.y0;
import j8.g;
import j8.j3;
import j8.p1;
import j8.x2;
import j8.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;
import jb.i0;
import jb.s;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes2.dex */
public class l extends s {

    /* renamed from: f */
    private static final i0<Integer> f5065f = i0.a(new Comparator() { // from class: ba.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l.q((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: g */
    private static final i0<Integer> f5066g = i0.a(new Comparator() { // from class: ba.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l.n((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d */
    private final q.b f5067d;

    /* renamed from: e */
    private final AtomicReference<d> f5068e;

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class b extends h<b> implements Comparable<b> {

        /* renamed from: e */
        private final int f5069e;

        /* renamed from: f */
        private final boolean f5070f;

        /* renamed from: g */
        private final String f5071g;

        /* renamed from: h */
        private final d f5072h;

        /* renamed from: i */
        private final boolean f5073i;

        /* renamed from: j */
        private final int f5074j;

        /* renamed from: k */
        private final int f5075k;

        /* renamed from: l */
        private final int f5076l;

        /* renamed from: m */
        private final boolean f5077m;

        /* renamed from: n */
        private final int f5078n;

        /* renamed from: o */
        private final int f5079o;

        /* renamed from: p */
        private final boolean f5080p;

        /* renamed from: q */
        private final int f5081q;

        /* renamed from: r */
        private final int f5082r;

        /* renamed from: s */
        private final int f5083s;

        /* renamed from: t */
        private final int f5084t;

        /* renamed from: u */
        private final boolean f5085u;

        /* renamed from: v */
        private final boolean f5086v;

        public b(int i10, w0 w0Var, int i11, d dVar, int i12, boolean z10) {
            super(i10, w0Var, i11);
            int i13;
            int i14;
            int i15;
            this.f5072h = dVar;
            this.f5071g = l.Q(this.f5107d.f32700c);
            this.f5073i = l.I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f5163n.size();
                i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i14 = 0;
                    break;
                }
                i14 = l.z(this.f5107d, dVar.f5163n.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f5075k = i16;
            this.f5074j = i14;
            this.f5076l = l.E(this.f5107d.f32702e, dVar.f5164o);
            p1 p1Var = this.f5107d;
            int i17 = p1Var.f32702e;
            this.f5077m = i17 == 0 || (i17 & 1) != 0;
            this.f5080p = (p1Var.f32701d & 1) != 0;
            int i18 = p1Var.f32722y;
            this.f5081q = i18;
            this.f5082r = p1Var.f32723z;
            int i19 = p1Var.f32705h;
            this.f5083s = i19;
            this.f5070f = (i19 == -1 || i19 <= dVar.f5166q) && (i18 == -1 || i18 <= dVar.f5165p);
            String[] j02 = n0.j0();
            int i20 = 0;
            while (true) {
                if (i20 >= j02.length) {
                    i20 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i15 = 0;
                    break;
                }
                i15 = l.z(this.f5107d, j02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.f5078n = i20;
            this.f5079o = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f5167r.size()) {
                    String str = this.f5107d.f32709l;
                    if (str != null && str.equals(dVar.f5167r.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f5084t = i13;
            this.f5085u = x2.e(i12) == 128;
            this.f5086v = x2.g(i12) == 64;
            this.f5069e = k(i12, z10);
        }

        public static int h(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static jb.s<b> j(int i10, w0 w0Var, d dVar, int[] iArr, boolean z10) {
            s.a n10 = jb.s.n();
            for (int i11 = 0; i11 < w0Var.f31846a; i11++) {
                n10.a(new b(i10, w0Var, i11, dVar, iArr[i11], z10));
            }
            return n10.h();
        }

        private int k(int i10, boolean z10) {
            if (l.I(i10, this.f5072h.K)) {
                if (this.f5070f || this.f5072h.F) {
                    if (l.I(i10, false) && this.f5070f && this.f5107d.f32705h != -1) {
                        d dVar = this.f5072h;
                        if (!dVar.f5172w && !dVar.f5171v && (dVar.M || !z10)) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // ba.l.h
        public int f() {
            return this.f5069e;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(b bVar) {
            i0 d10 = (this.f5070f && this.f5073i) ? l.f5065f : l.f5065f.d();
            jb.m e10 = jb.m.i().f(this.f5073i, bVar.f5073i).e(Integer.valueOf(this.f5075k), Integer.valueOf(bVar.f5075k), i0.b().d()).d(this.f5074j, bVar.f5074j).d(this.f5076l, bVar.f5076l).f(this.f5080p, bVar.f5080p).f(this.f5077m, bVar.f5077m).e(Integer.valueOf(this.f5078n), Integer.valueOf(bVar.f5078n), i0.b().d()).d(this.f5079o, bVar.f5079o).f(this.f5070f, bVar.f5070f).e(Integer.valueOf(this.f5084t), Integer.valueOf(bVar.f5084t), i0.b().d()).e(Integer.valueOf(this.f5083s), Integer.valueOf(bVar.f5083s), this.f5072h.f5171v ? l.f5065f.d() : l.f5066g).f(this.f5085u, bVar.f5085u).f(this.f5086v, bVar.f5086v).e(Integer.valueOf(this.f5081q), Integer.valueOf(bVar.f5081q), d10).e(Integer.valueOf(this.f5082r), Integer.valueOf(bVar.f5082r), d10);
            Integer valueOf = Integer.valueOf(this.f5083s);
            Integer valueOf2 = Integer.valueOf(bVar.f5083s);
            if (!n0.c(this.f5071g, bVar.f5071g)) {
                d10 = l.f5066g;
            }
            return e10.e(valueOf, valueOf2, d10).h();
        }

        @Override // ba.l.h
        /* renamed from: l */
        public boolean g(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f5072h;
            if ((dVar.I || ((i11 = this.f5107d.f32722y) != -1 && i11 == bVar.f5107d.f32722y)) && (dVar.G || ((str = this.f5107d.f32709l) != null && TextUtils.equals(str, bVar.f5107d.f32709l)))) {
                d dVar2 = this.f5072h;
                if ((dVar2.H || ((i10 = this.f5107d.f32723z) != -1 && i10 == bVar.f5107d.f32723z)) && (dVar2.J || (this.f5085u == bVar.f5085u && this.f5086v == bVar.f5086v))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a */
        private final boolean f5087a;

        /* renamed from: b */
        private final boolean f5088b;

        public c(p1 p1Var, int i10) {
            this.f5087a = (p1Var.f32701d & 1) != 0;
            this.f5088b = l.I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return jb.m.i().f(this.f5088b, cVar.f5088b).f(this.f5087a, cVar.f5087a).h();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class d extends y {
        public static final d P = new e().z();
        public final int A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        private final SparseArray<Map<y0, f>> N;
        private final SparseBooleanArray O;

        private static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean d(SparseArray<Map<y0, f>> sparseArray, SparseArray<Map<y0, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !e(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean e(java.util.Map<i9.y0, ba.l.f> r4, java.util.Map<i9.y0, ba.l.f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                i9.y0 r1 = (i9.y0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = ea.n0.c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.l.d.e(java.util.Map, java.util.Map):boolean");
        }

        public static d g(Context context) {
            return new e(context).z();
        }

        @Override // ba.y
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.B == dVar.B && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.J == dVar.J && this.A == dVar.A && this.K == dVar.K && this.L == dVar.L && this.M == dVar.M && c(this.O, dVar.O) && d(this.N, dVar.N);
        }

        public e f() {
            return new e(this);
        }

        public final boolean h(int i10) {
            return this.O.get(i10);
        }

        @Override // ba.y
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + this.A) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0);
        }

        @Deprecated
        public final f i(int i10, y0 y0Var) {
            Map<y0, f> map = this.N.get(i10);
            if (map != null) {
                return map.get(y0Var);
            }
            return null;
        }

        @Deprecated
        public final boolean j(int i10, y0 y0Var) {
            Map<y0, f> map = this.N.get(i10);
            return map != null && map.containsKey(y0Var);
        }

        private d(e eVar) {
            super(eVar);
            this.B = eVar.f5089z;
            this.C = eVar.A;
            this.D = eVar.B;
            this.E = eVar.C;
            this.F = eVar.D;
            this.G = eVar.E;
            this.H = eVar.F;
            this.I = eVar.G;
            this.J = eVar.H;
            this.A = eVar.I;
            this.K = eVar.J;
            this.L = eVar.K;
            this.M = eVar.L;
            this.N = eVar.M;
            this.O = eVar.N;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class e extends y.a {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private boolean E;
        private boolean F;
        private boolean G;
        private boolean H;
        private int I;
        private boolean J;
        private boolean K;
        private boolean L;
        private final SparseArray<Map<y0, f>> M;
        private final SparseBooleanArray N;

        /* renamed from: z */
        private boolean f5089z;

        private static SparseArray<Map<y0, f>> Y(SparseArray<Map<y0, f>> sparseArray) {
            SparseArray<Map<y0, f>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        private void Z() {
            this.f5089z = true;
            this.A = false;
            this.B = true;
            this.C = false;
            this.D = true;
            this.E = false;
            this.F = false;
            this.G = false;
            this.H = false;
            this.I = 0;
            this.J = true;
            this.K = false;
            this.L = true;
        }

        @Override // ba.y.a
        /* renamed from: X */
        public d z() {
            return new d(this);
        }

        protected e a0(y yVar) {
            super.B(yVar);
            return this;
        }

        public e b0(int i10) {
            super.C(i10);
            return this;
        }

        @Override // ba.y.a
        /* renamed from: c0 */
        public e D(Context context) {
            super.D(context);
            return this;
        }

        public final e d0(int i10, boolean z10) {
            if (this.N.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.N.put(i10, true);
            } else {
                this.N.delete(i10);
            }
            return this;
        }

        public e e0(w wVar) {
            super.F(wVar);
            return this;
        }

        @Override // ba.y.a
        /* renamed from: f0 */
        public e G(int i10, int i11, boolean z10) {
            super.G(i10, i11, z10);
            return this;
        }

        @Override // ba.y.a
        /* renamed from: g0 */
        public e H(Context context, boolean z10) {
            super.H(context, z10);
            return this;
        }

        @Deprecated
        public e() {
            this.M = new SparseArray<>();
            this.N = new SparseBooleanArray();
            Z();
        }

        public e(Context context) {
            super(context);
            this.M = new SparseArray<>();
            this.N = new SparseBooleanArray();
            Z();
        }

        private e(d dVar) {
            super(dVar);
            this.I = dVar.A;
            this.f5089z = dVar.B;
            this.A = dVar.C;
            this.B = dVar.D;
            this.C = dVar.E;
            this.D = dVar.F;
            this.E = dVar.G;
            this.F = dVar.H;
            this.G = dVar.I;
            this.H = dVar.J;
            this.J = dVar.K;
            this.K = dVar.L;
            this.L = dVar.M;
            this.M = Y(dVar.N);
            this.N = dVar.O.clone();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class f implements j8.g {

        /* renamed from: e */
        public static final g.a<f> f5090e = new g.a() { // from class: ba.m
            @Override // j8.g.a
            public final j8.g a(Bundle bundle) {
                return l.f.a(bundle);
            }
        };

        /* renamed from: a */
        public final int f5091a;

        /* renamed from: b */
        public final int[] f5092b;

        /* renamed from: c */
        public final int f5093c;

        /* renamed from: d */
        public final int f5094d;

        public f(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public static /* synthetic */ f a(Bundle bundle) {
            return d(bundle);
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ f d(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(c(0), -1);
            int[] intArray = bundle.getIntArray(c(1));
            int i11 = bundle.getInt(c(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            ea.a.a(z10);
            ea.a.e(intArray);
            return new f(i10, intArray, i11);
        }

        public boolean b(int i10) {
            for (int i11 : this.f5092b) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f5091a == fVar.f5091a && Arrays.equals(this.f5092b, fVar.f5092b) && this.f5094d == fVar.f5094d;
        }

        public int hashCode() {
            return (((this.f5091a * 31) + Arrays.hashCode(this.f5092b)) * 31) + this.f5094d;
        }

        public f(int i10, int[] iArr, int i11) {
            this.f5091a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f5092b = copyOf;
            this.f5093c = iArr.length;
            this.f5094d = i11;
            Arrays.sort(copyOf);
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e */
        private final int f5095e;

        /* renamed from: f */
        private final boolean f5096f;

        /* renamed from: g */
        private final boolean f5097g;

        /* renamed from: h */
        private final boolean f5098h;

        /* renamed from: i */
        private final int f5099i;

        /* renamed from: j */
        private final int f5100j;

        /* renamed from: k */
        private final int f5101k;

        /* renamed from: l */
        private final int f5102l;

        /* renamed from: m */
        private final boolean f5103m;

        public g(int i10, w0 w0Var, int i11, d dVar, int i12, String str) {
            super(i10, w0Var, i11);
            jb.s<String> sVar;
            int i13;
            int i14 = 0;
            this.f5096f = l.I(i12, false);
            int i15 = this.f5107d.f32701d & (~dVar.A);
            this.f5097g = (i15 & 1) != 0;
            this.f5098h = (i15 & 2) != 0;
            int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (dVar.f5168s.isEmpty()) {
                sVar = jb.s.u("");
            } else {
                sVar = dVar.f5168s;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= sVar.size()) {
                    i13 = 0;
                    break;
                }
                i13 = l.z(this.f5107d, sVar.get(i17), dVar.f5170u);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f5099i = i16;
            this.f5100j = i13;
            int E = l.E(this.f5107d.f32702e, dVar.f5169t);
            this.f5101k = E;
            this.f5103m = (this.f5107d.f32702e & 1088) != 0;
            int z10 = l.z(this.f5107d, str, l.Q(str) == null);
            this.f5102l = z10;
            boolean z11 = i13 > 0 || (dVar.f5168s.isEmpty() && E > 0) || this.f5097g || (this.f5098h && z10 > 0);
            if (l.I(i12, dVar.K) && z11) {
                i14 = 1;
            }
            this.f5095e = i14;
        }

        public static int h(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static jb.s<g> j(int i10, w0 w0Var, d dVar, int[] iArr, String str) {
            s.a n10 = jb.s.n();
            for (int i11 = 0; i11 < w0Var.f31846a; i11++) {
                n10.a(new g(i10, w0Var, i11, dVar, iArr[i11], str));
            }
            return n10.h();
        }

        @Override // ba.l.h
        public int f() {
            return this.f5095e;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(g gVar) {
            jb.m d10 = jb.m.i().f(this.f5096f, gVar.f5096f).e(Integer.valueOf(this.f5099i), Integer.valueOf(gVar.f5099i), i0.b().d()).d(this.f5100j, gVar.f5100j).d(this.f5101k, gVar.f5101k).f(this.f5097g, gVar.f5097g).e(Boolean.valueOf(this.f5098h), Boolean.valueOf(gVar.f5098h), this.f5100j == 0 ? i0.b() : i0.b().d()).d(this.f5102l, gVar.f5102l);
            if (this.f5101k == 0) {
                d10 = d10.g(this.f5103m, gVar.f5103m);
            }
            return d10.h();
        }

        @Override // ba.l.h
        /* renamed from: k */
        public boolean g(g gVar) {
            return false;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: a */
        public final int f5104a;

        /* renamed from: b */
        public final w0 f5105b;

        /* renamed from: c */
        public final int f5106c;

        /* renamed from: d */
        public final p1 f5107d;

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: classes2.dex */
        public interface a<T extends h<T>> {
            List<T> a(int i10, w0 w0Var, int[] iArr);
        }

        public h(int i10, w0 w0Var, int i11) {
            this.f5104a = i10;
            this.f5105b = w0Var;
            this.f5106c = i11;
            this.f5107d = w0Var.c(i11);
        }

        public abstract int f();

        public abstract boolean g(T t10);
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class i extends h<i> {

        /* renamed from: e */
        private final boolean f5108e;

        /* renamed from: f */
        private final d f5109f;

        /* renamed from: g */
        private final boolean f5110g;

        /* renamed from: h */
        private final boolean f5111h;

        /* renamed from: i */
        private final int f5112i;

        /* renamed from: j */
        private final int f5113j;

        /* renamed from: k */
        private final int f5114k;

        /* renamed from: l */
        private final int f5115l;

        /* renamed from: m */
        private final boolean f5116m;

        /* renamed from: n */
        private final boolean f5117n;

        /* renamed from: o */
        private final int f5118o;

        /* renamed from: p */
        private final boolean f5119p;

        /* renamed from: q */
        private final boolean f5120q;

        /* renamed from: r */
        private final int f5121r;

        /* JADX WARN: Removed duplicated region for block: B:136:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x00cc A[EDGE_INSN: B:160:0x00cc->B:150:0x00cc ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(int r5, i9.w0 r6, int r7, ba.l.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.l.i.<init>(int, i9.w0, int, ba.l$d, int, int, boolean):void");
        }

        public static /* synthetic */ int h(i iVar, i iVar2) {
            return j(iVar, iVar2);
        }

        public static /* synthetic */ int i(i iVar, i iVar2) {
            return k(iVar, iVar2);
        }

        public static int j(i iVar, i iVar2) {
            jb.m f10 = jb.m.i().f(iVar.f5111h, iVar2.f5111h).d(iVar.f5115l, iVar2.f5115l).f(iVar.f5116m, iVar2.f5116m).f(iVar.f5108e, iVar2.f5108e).f(iVar.f5110g, iVar2.f5110g).e(Integer.valueOf(iVar.f5114k), Integer.valueOf(iVar2.f5114k), i0.b().d()).f(iVar.f5119p, iVar2.f5119p).f(iVar.f5120q, iVar2.f5120q);
            if (iVar.f5119p && iVar.f5120q) {
                f10 = f10.d(iVar.f5121r, iVar2.f5121r);
            }
            return f10.h();
        }

        public static int k(i iVar, i iVar2) {
            i0 d10 = (iVar.f5108e && iVar.f5111h) ? l.f5065f : l.f5065f.d();
            return jb.m.i().e(Integer.valueOf(iVar.f5112i), Integer.valueOf(iVar2.f5112i), iVar.f5109f.f5171v ? l.f5065f.d() : l.f5066g).e(Integer.valueOf(iVar.f5113j), Integer.valueOf(iVar2.f5113j), d10).e(Integer.valueOf(iVar.f5112i), Integer.valueOf(iVar2.f5112i), d10).h();
        }

        public static int l(List<i> list, List<i> list2) {
            return jb.m.i().e((i) Collections.max(list, new Comparator() { // from class: ba.n
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.h((l.i) obj, (l.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: ba.n
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.h((l.i) obj, (l.i) obj2);
                }
            }), new Comparator() { // from class: ba.n
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.h((l.i) obj, (l.i) obj2);
                }
            }).d(list.size(), list2.size()).e((i) Collections.max(list, new Comparator() { // from class: ba.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.i((l.i) obj, (l.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: ba.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.i((l.i) obj, (l.i) obj2);
                }
            }), new Comparator() { // from class: ba.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return l.i.i((l.i) obj, (l.i) obj2);
                }
            }).h();
        }

        public static jb.s<i> m(int i10, w0 w0Var, d dVar, int[] iArr, int i11) {
            int B = l.B(w0Var, dVar.f5158i, dVar.f5159j, dVar.f5160k);
            s.a n10 = jb.s.n();
            for (int i12 = 0; i12 < w0Var.f31846a; i12++) {
                int f10 = w0Var.c(i12).f();
                n10.a(new i(i10, w0Var, i12, dVar, iArr[i12], i11, B == Integer.MAX_VALUE || (f10 != -1 && f10 <= B)));
            }
            return n10.h();
        }

        private int n(int i10, int i11) {
            if ((this.f5107d.f32702e & 16384) == 0 && l.I(i10, this.f5109f.K)) {
                if (this.f5108e || this.f5109f.B) {
                    if (l.I(i10, false) && this.f5110g && this.f5108e && this.f5107d.f32705h != -1) {
                        d dVar = this.f5109f;
                        if (!dVar.f5172w && !dVar.f5171v && (i10 & i11) != 0) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // ba.l.h
        public int f() {
            return this.f5118o;
        }

        @Override // ba.l.h
        /* renamed from: o */
        public boolean g(i iVar) {
            return (this.f5117n || n0.c(this.f5107d.f32709l, iVar.f5107d.f32709l)) && (this.f5109f.E || (this.f5119p == iVar.f5119p && this.f5120q == iVar.f5120q));
        }
    }

    @Deprecated
    public l(q.b bVar) {
        this(d.P, bVar);
    }

    private q.a A(s.a aVar, d dVar, int i10) {
        y0 f10 = aVar.f(i10);
        f i11 = dVar.i(i10, f10);
        if (i11 == null) {
            return null;
        }
        return new q.a(f10.b(i11.f5091a), i11.f5092b, i11.f5094d);
    }

    public static int B(w0 w0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < w0Var.f31846a; i14++) {
                p1 c10 = w0Var.c(i14);
                int i15 = c10.f32714q;
                if (i15 > 0 && (i12 = c10.f32715r) > 0) {
                    Point C = C(z10, i10, i11, i15, i12);
                    int i16 = c10.f32714q;
                    int i17 = c10.f32715r;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (C.x * 0.98f)) && i17 >= ((int) (C.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point C(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = ea.n0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = ea.n0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.l.C(boolean, int, int, int, int):android.graphics.Point");
    }

    public static int E(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    private boolean G(s.a aVar, d dVar, int i10) {
        return dVar.j(i10, aVar.f(i10));
    }

    private boolean H(s.a aVar, d dVar, int i10) {
        return dVar.h(i10) || dVar.f5174y.contains(Integer.valueOf(aVar.e(i10)));
    }

    protected static boolean I(int i10, boolean z10) {
        int f10 = x2.f(i10);
        return f10 == 4 || (z10 && f10 == 3);
    }

    public static /* synthetic */ List J(d dVar, boolean z10, int i10, w0 w0Var, int[] iArr) {
        return b.j(i10, w0Var, dVar, iArr, z10);
    }

    public static /* synthetic */ List K(d dVar, String str, int i10, w0 w0Var, int[] iArr) {
        return g.j(i10, w0Var, dVar, iArr, str);
    }

    public static /* synthetic */ List L(d dVar, int[] iArr, int i10, w0 w0Var, int[] iArr2) {
        return i.m(i10, w0Var, dVar, iArr2, iArr[i10]);
    }

    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(s.a aVar, int[][][] iArr, z2[] z2VarArr, q[] qVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            q qVar = qVarArr[i12];
            if ((e10 == 1 || e10 == 2) && qVar != null && R(iArr[i12], aVar.f(i12), qVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            z2 z2Var = new z2(true);
            z2VarArr[i11] = z2Var;
            z2VarArr[i10] = z2Var;
        }
    }

    private void P(SparseArray<Pair<w.c, Integer>> sparseArray, w.c cVar, int i10) {
        if (cVar == null) {
            return;
        }
        int b10 = cVar.b();
        Pair<w.c, Integer> pair = sparseArray.get(b10);
        if (pair == null || ((w.c) pair.first).f5147b.isEmpty()) {
            sparseArray.put(b10, Pair.create(cVar, Integer.valueOf(i10)));
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, y0 y0Var, q qVar) {
        if (qVar == null) {
            return false;
        }
        int c10 = y0Var.c(qVar.k());
        for (int i10 = 0; i10 < qVar.length(); i10++) {
            if (x2.h(iArr[c10][qVar.e(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<q.a, Integer> W(int i10, s.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        s.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                y0 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f31863a; i13++) {
                    w0 b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f31846a];
                    int i14 = 0;
                    while (i14 < b10.f31846a) {
                        T t10 = a10.get(i14);
                        int f11 = t10.f();
                        if (zArr[i14] || f11 == 0) {
                            i11 = d10;
                        } else {
                            if (f11 == 1) {
                                randomAccess = jb.s.u(t10);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < b10.f31846a) {
                                    T t11 = a10.get(i15);
                                    int i16 = d10;
                                    if (t11.f() == 2 && t10.g(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                i11 = d10;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f5106c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new q.a(hVar.f5105b, iArr2), Integer.valueOf(hVar.f5104a));
    }

    private void a0(d dVar) {
        ea.a.e(dVar);
        if (this.f5068e.getAndSet(dVar).equals(dVar)) {
            return;
        }
        c();
    }

    public static /* synthetic */ List m(d dVar, boolean z10, int i10, w0 w0Var, int[] iArr) {
        return J(dVar, z10, i10, w0Var, iArr);
    }

    public static /* synthetic */ int n(Integer num, Integer num2) {
        return N(num, num2);
    }

    public static /* synthetic */ List o(d dVar, int[] iArr, int i10, w0 w0Var, int[] iArr2) {
        return L(dVar, iArr, i10, w0Var, iArr2);
    }

    public static /* synthetic */ List p(d dVar, String str, int i10, w0 w0Var, int[] iArr) {
        return K(dVar, str, i10, w0Var, iArr);
    }

    public static /* synthetic */ int q(Integer num, Integer num2) {
        return M(num, num2);
    }

    private void w(s.a aVar, q.a[] aVarArr, int i10, w.c cVar, int i11) {
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (i11 == i12) {
                aVarArr[i12] = new q.a(cVar.f5146a, mb.d.l(cVar.f5147b));
            } else if (aVar.e(i12) == i10) {
                aVarArr[i12] = null;
            }
        }
    }

    private SparseArray<Pair<w.c, Integer>> y(s.a aVar, d dVar) {
        SparseArray<Pair<w.c, Integer>> sparseArray = new SparseArray<>();
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            y0 f10 = aVar.f(i10);
            for (int i11 = 0; i11 < f10.f31863a; i11++) {
                P(sparseArray, dVar.f5173x.b(f10.b(i11)), i10);
            }
        }
        y0 h10 = aVar.h();
        for (int i12 = 0; i12 < h10.f31863a; i12++) {
            P(sparseArray, dVar.f5173x.b(h10.b(i12)), -1);
        }
        return sparseArray;
    }

    protected static int z(p1 p1Var, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(p1Var.f32700c)) {
            String Q = Q(str);
            String Q2 = Q(p1Var.f32700c);
            if (Q2 == null || Q == null) {
                return (z10 && Q2 == null) ? 1 : 0;
            } else if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
                return 3;
            } else {
                return n0.S0(Q2, Constants.FILENAME_SEQUENCE_SEPARATOR)[0].equals(n0.S0(Q, Constants.FILENAME_SEQUENCE_SEPARATOR)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public d D() {
        return this.f5068e.get();
    }

    protected q.a[] S(s.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws j8.n {
        String str;
        int d10 = aVar.d();
        q.a[] aVarArr = new q.a[d10];
        Pair<q.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (q.a) X.first;
        }
        Pair<q.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (q.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((q.a) obj).f5125a.c(((q.a) obj).f5126b[0]).f32700c;
        }
        Pair<q.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (q.a) V.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (e10 != 2 && e10 != 1 && e10 != 3) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    @SuppressLint({"WrongConstant"})
    protected Pair<q.a, Integer> T(s.a aVar, int[][][] iArr, int[] iArr2, final d dVar) throws j8.n {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f31863a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h.a() { // from class: ba.e
            @Override // ba.l.h.a
            public final List a(int i11, w0 w0Var, int[] iArr3) {
                return l.m(l.d.this, z10, i11, w0Var, iArr3);
            }
        }, new Comparator() { // from class: ba.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.b.h((List) obj, (List) obj2);
            }
        });
    }

    protected q.a U(int i10, y0 y0Var, int[][] iArr, d dVar) throws j8.n {
        w0 w0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < y0Var.f31863a; i12++) {
            w0 b10 = y0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f31846a; i13++) {
                if (I(iArr2[i13], dVar.K)) {
                    c cVar2 = new c(b10.c(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        w0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (w0Var == null) {
            return null;
        }
        return new q.a(w0Var, i11);
    }

    @SuppressLint({"WrongConstant"})
    protected Pair<q.a, Integer> V(s.a aVar, int[][][] iArr, final d dVar, final String str) throws j8.n {
        return W(3, aVar, iArr, new h.a() { // from class: ba.d
            @Override // ba.l.h.a
            public final List a(int i10, w0 w0Var, int[] iArr2) {
                return l.p(l.d.this, str, i10, w0Var, iArr2);
            }
        }, new Comparator() { // from class: ba.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.g.h((List) obj, (List) obj2);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    protected Pair<q.a, Integer> X(s.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) throws j8.n {
        return W(2, aVar, iArr, new h.a() { // from class: ba.f
            @Override // ba.l.h.a
            public final List a(int i10, w0 w0Var, int[] iArr3) {
                return l.o(l.d.this, iArr2, i10, w0Var, iArr3);
            }
        }, new Comparator() { // from class: ba.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.i.l((List) obj, (List) obj2);
            }
        });
    }

    public void Y(e eVar) {
        a0(eVar.z());
    }

    public void Z(y yVar) {
        if (yVar instanceof d) {
            a0((d) yVar);
        }
        a0(new e(this.f5068e.get()).a0(yVar).z());
    }

    @Override // ba.a0
    public boolean d() {
        return true;
    }

    @Override // ba.s
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> l(s.a aVar, int[][][] iArr, int[] iArr2, u.b bVar, j3 j3Var) throws j8.n {
        d dVar = this.f5068e.get();
        int d10 = aVar.d();
        q.a[] S = S(aVar, iArr, iArr2, dVar);
        SparseArray<Pair<w.c, Integer>> y10 = y(aVar, dVar);
        for (int i10 = 0; i10 < y10.size(); i10++) {
            Pair<w.c, Integer> valueAt = y10.valueAt(i10);
            w(aVar, S, y10.keyAt(i10), (w.c) valueAt.first, ((Integer) valueAt.second).intValue());
        }
        for (int i11 = 0; i11 < d10; i11++) {
            if (G(aVar, dVar, i11)) {
                S[i11] = A(aVar, dVar, i11);
            }
        }
        for (int i12 = 0; i12 < d10; i12++) {
            if (H(aVar, dVar, i12)) {
                S[i12] = null;
            }
        }
        q[] a10 = this.f5067d.a(S, a(), bVar, j3Var);
        z2[] z2VarArr = new z2[d10];
        for (int i13 = 0; i13 < d10; i13++) {
            boolean z10 = true;
            if ((dVar.h(i13) || dVar.f5174y.contains(Integer.valueOf(aVar.e(i13)))) || (aVar.e(i13) != -2 && a10[i13] == null)) {
                z10 = false;
            }
            z2VarArr[i13] = z10 ? z2.f32904b : null;
        }
        if (dVar.L) {
            O(aVar, iArr, z2VarArr, a10);
        }
        return Pair.create(z2VarArr, a10);
    }

    public e x() {
        return D().f();
    }

    public l(Context context) {
        this(context, new a.b());
    }

    public l(Context context, q.b bVar) {
        this(d.g(context), bVar);
    }

    public l(d dVar, q.b bVar) {
        this.f5067d = bVar;
        this.f5068e = new AtomicReference<>(dVar);
    }
}
