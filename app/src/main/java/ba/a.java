package ba;

import ba.q;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import ea.n0;
import i9.u;
import i9.w0;
import j8.j3;
import j8.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jb.c0;
import jb.s;

/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: g  reason: collision with root package name */
    private final da.f f5015g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5016h;

    /* renamed from: i  reason: collision with root package name */
    private final long f5017i;

    /* renamed from: j  reason: collision with root package name */
    private final long f5018j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5019k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5020l;

    /* renamed from: m  reason: collision with root package name */
    private final float f5021m;

    /* renamed from: n  reason: collision with root package name */
    private final float f5022n;

    /* renamed from: o  reason: collision with root package name */
    private final jb.s<C0093a> f5023o;

    /* renamed from: p  reason: collision with root package name */
    private final ea.c f5024p;

    /* renamed from: q  reason: collision with root package name */
    private float f5025q;

    /* renamed from: r  reason: collision with root package name */
    private int f5026r;

    /* renamed from: s  reason: collision with root package name */
    private int f5027s;

    /* renamed from: t  reason: collision with root package name */
    private long f5028t;

    /* renamed from: u  reason: collision with root package name */
    private k9.n f5029u;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: ba.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0093a {

        /* renamed from: a  reason: collision with root package name */
        public final long f5030a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5031b;

        public C0093a(long j10, long j11) {
            this.f5030a = j10;
            this.f5031b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0093a) {
                C0093a c0093a = (C0093a) obj;
                return this.f5030a == c0093a.f5030a && this.f5031b == c0093a.f5031b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f5030a) * 31) + ((int) this.f5031b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes2.dex */
    public static class b implements q.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f5032a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5033b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5034c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5035d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5036e;

        /* renamed from: f  reason: collision with root package name */
        private final float f5037f;

        /* renamed from: g  reason: collision with root package name */
        private final float f5038g;

        /* renamed from: h  reason: collision with root package name */
        private final ea.c f5039h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override // ba.q.b
        public final q[] a(q.a[] aVarArr, da.f fVar, u.b bVar, j3 j3Var) {
            q b10;
            jb.s z10 = a.z(aVarArr);
            q[] qVarArr = new q[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                q.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f5126b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b10 = new r(aVar.f5125a, iArr[0], aVar.f5127c);
                        } else {
                            b10 = b(aVar.f5125a, iArr, aVar.f5127c, fVar, (jb.s) z10.get(i10));
                        }
                        qVarArr[i10] = b10;
                    }
                }
            }
            return qVarArr;
        }

        protected a b(w0 w0Var, int[] iArr, int i10, da.f fVar, jb.s<C0093a> sVar) {
            return new a(w0Var, iArr, i10, fVar, this.f5032a, this.f5033b, this.f5034c, this.f5035d, this.f5036e, this.f5037f, this.f5038g, sVar, this.f5039h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, ea.c.f29651a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, ea.c cVar) {
            this.f5032a = i10;
            this.f5033b = i11;
            this.f5034c = i12;
            this.f5035d = i13;
            this.f5036e = i14;
            this.f5037f = f10;
            this.f5038g = f11;
            this.f5039h = cVar;
        }
    }

    protected a(w0 w0Var, int[] iArr, int i10, da.f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0093a> list, ea.c cVar) {
        super(w0Var, iArr, i10);
        da.f fVar2;
        long j13;
        if (j12 < j10) {
            ea.r.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j13 = j10;
        } else {
            fVar2 = fVar;
            j13 = j12;
        }
        this.f5015g = fVar2;
        this.f5016h = j10 * 1000;
        this.f5017i = j11 * 1000;
        this.f5018j = j13 * 1000;
        this.f5019k = i11;
        this.f5020l = i12;
        this.f5021m = f10;
        this.f5022n = f11;
        this.f5023o = jb.s.p(list);
        this.f5024p = cVar;
        this.f5025q = 1.0f;
        this.f5027s = 0;
        this.f5028t = -9223372036854775807L;
    }

    private long A(long j10) {
        long G = G(j10);
        if (this.f5023o.isEmpty()) {
            return G;
        }
        int i10 = 1;
        while (i10 < this.f5023o.size() - 1 && this.f5023o.get(i10).f5030a < G) {
            i10++;
        }
        C0093a c0093a = this.f5023o.get(i10 - 1);
        C0093a c0093a2 = this.f5023o.get(i10);
        long j11 = c0093a.f5030a;
        long j12 = c0093a.f5031b;
        return j12 + ((((float) (G - j11)) / ((float) (c0093a2.f5030a - j11))) * ((float) (c0093a2.f5031b - j12)));
    }

    private long B(List<? extends k9.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        k9.n nVar = (k9.n) jb.v.c(list);
        long j10 = nVar.f33391g;
        if (j10 != -9223372036854775807L) {
            long j11 = nVar.f33392h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private long D(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends k9.n> list) {
        int i10 = this.f5026r;
        if (i10 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i10].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.f5026r];
            return mediaChunkIterator.b() - mediaChunkIterator.a();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.b() - mediaChunkIterator2.a();
            }
        }
        return B(list);
    }

    private static long[][] E(q.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            q.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f5126b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f5126b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f5125a.c(iArr[i11]).f32705h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static jb.s<Integer> F(long[][] jArr) {
        jb.b0 e10 = c0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    e10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return jb.s.p(e10.values());
    }

    private long G(long j10) {
        long a10;
        long f10 = ((float) this.f5015g.f()) * this.f5021m;
        if (this.f5015g.a() != -9223372036854775807L && j10 != -9223372036854775807L) {
            float f11 = (float) j10;
            return (((float) f10) * Math.max((f11 / this.f5025q) - ((float) a10), 0.0f)) / f11;
        }
        return ((float) f10) / this.f5025q;
    }

    private long H(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f5016h;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f5022n, this.f5016h);
    }

    private static void w(List<s.a<C0093a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            s.a<C0093a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0093a(j10, jArr[i10]));
            }
        }
    }

    private int y(long j10, long j11) {
        long A = A(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5049b; i11++) {
            if (j10 == Long.MIN_VALUE || !c(i11, j10)) {
                p1 d10 = d(i11);
                if (x(d10, d10.f32705h, A)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jb.s<jb.s<C0093a>> z(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            if (definitionArr[i10] != null && definitionArr[i10].f5126b.length > 1) {
                s.a n10 = jb.s.n();
                n10.a(new C0093a(0L, 0L));
                arrayList.add(n10);
            } else {
                arrayList.add(null);
            }
        }
        long[][] E = E(definitionArr);
        int[] iArr = new int[E.length];
        long[] jArr = new long[E.length];
        for (int i11 = 0; i11 < E.length; i11++) {
            jArr[i11] = E[i11].length == 0 ? 0L : E[i11][0];
        }
        w(arrayList, jArr);
        jb.s<Integer> F = F(E);
        for (int i12 = 0; i12 < F.size(); i12++) {
            int intValue = F.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = E[intValue][i13];
            w(arrayList, jArr);
        }
        for (int i14 = 0; i14 < definitionArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        w(arrayList, jArr);
        s.a n11 = jb.s.n();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            s.a aVar = (s.a) arrayList.get(i15);
            n11.a(aVar == null ? jb.s.t() : aVar.h());
        }
        return n11.h();
    }

    protected long C() {
        return this.f5018j;
    }

    protected boolean I(long j10, List<? extends k9.n> list) {
        long j11 = this.f5028t;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((k9.n) jb.v.c(list)).equals(this.f5029u));
    }

    @Override // ba.q
    public int a() {
        return this.f5026r;
    }

    @Override // ba.c, ba.q
    public void disable() {
        this.f5029u = null;
    }

    @Override // ba.c, ba.q
    public void enable() {
        this.f5028t = -9223372036854775807L;
        this.f5029u = null;
    }

    @Override // ba.c, ba.q
    public void f(float f10) {
        this.f5025q = f10;
    }

    @Override // ba.q
    public Object g() {
        return null;
    }

    @Override // ba.q
    public void j(long j10, long j11, long j12, List<? extends k9.n> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.f5024p.elapsedRealtime();
        long D = D(mediaChunkIteratorArr, list);
        int i10 = this.f5027s;
        if (i10 == 0) {
            this.f5027s = 1;
            this.f5026r = y(elapsedRealtime, D);
            return;
        }
        int i11 = this.f5026r;
        int o10 = list.isEmpty() ? -1 : o(((k9.n) jb.v.c(list)).f33388d);
        if (o10 != -1) {
            i10 = ((k9.n) jb.v.c(list)).f33389e;
            i11 = o10;
        }
        int y10 = y(elapsedRealtime, D);
        if (!c(i11, elapsedRealtime)) {
            p1 d10 = d(i11);
            p1 d11 = d(y10);
            long H = H(j12, D);
            int i12 = d11.f32705h;
            int i13 = d10.f32705h;
            if ((i12 > i13 && j11 < H) || (i12 < i13 && j11 >= this.f5017i)) {
                y10 = i11;
            }
        }
        if (y10 != i11) {
            i10 = 3;
        }
        this.f5027s = i10;
        this.f5026r = y10;
    }

    @Override // ba.c, ba.q
    public int m(long j10, List<? extends k9.n> list) {
        int i10;
        int i11;
        long elapsedRealtime = this.f5024p.elapsedRealtime();
        if (!I(elapsedRealtime, list)) {
            return list.size();
        }
        this.f5028t = elapsedRealtime;
        this.f5029u = list.isEmpty() ? null : (k9.n) jb.v.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long g02 = n0.g0(list.get(size - 1).f33391g - j10, this.f5025q);
        long C = C();
        if (g02 < C) {
            return size;
        }
        p1 d10 = d(y(elapsedRealtime, B(list)));
        for (int i12 = 0; i12 < size; i12++) {
            k9.n nVar = list.get(i12);
            p1 p1Var = nVar.f33388d;
            if (n0.g0(nVar.f33391g - j10, this.f5025q) >= C && p1Var.f32705h < d10.f32705h && (i10 = p1Var.f32715r) != -1 && i10 <= this.f5020l && (i11 = p1Var.f32714q) != -1 && i11 <= this.f5019k && i10 < d10.f32715r) {
                return i12;
            }
        }
        return size;
    }

    @Override // ba.q
    public int q() {
        return this.f5027s;
    }

    protected boolean x(p1 p1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
