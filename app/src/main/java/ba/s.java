package ba;

import android.util.Pair;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import ea.n0;
import i9.u;
import i9.w0;
import i9.y0;
import j8.j3;
import j8.n3;
import j8.x2;
import j8.y2;
import j8.z2;
import java.util.Arrays;
import jb.s;

/* compiled from: MappingTrackSelector.java */
/* loaded from: classes2.dex */
public abstract class s extends a0 {

    /* renamed from: c  reason: collision with root package name */
    private a f5130c;

    /* compiled from: MappingTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5131a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f5132b;

        /* renamed from: c  reason: collision with root package name */
        private final y0[] f5133c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f5134d;

        /* renamed from: e  reason: collision with root package name */
        private final int[][][] f5135e;

        /* renamed from: f  reason: collision with root package name */
        private final y0 f5136f;

        a(String[] strArr, int[] iArr, y0[] y0VarArr, int[] iArr2, int[][][] iArr3, y0 y0Var) {
            this.f5132b = iArr;
            this.f5133c = y0VarArr;
            this.f5135e = iArr3;
            this.f5134d = iArr2;
            this.f5136f = y0Var;
            this.f5131a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f5133c[i10].b(i11).f31846a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            int i14 = 16;
            while (i12 < iArr.length) {
                String str2 = this.f5133c[i10].b(i11).c(iArr[i12]).f32709l;
                int i15 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !n0.c(str, str2);
                }
                i14 = Math.min(i14, x2.d(this.f5135e[i10][i11][i12]));
                i12++;
                i13 = i15;
            }
            return z10 ? Math.min(i14, this.f5134d[i10]) : i14;
        }

        public int c(int i10, int i11, int i12) {
            return this.f5135e[i10][i11][i12];
        }

        public int d() {
            return this.f5131a;
        }

        public int e(int i10) {
            return this.f5132b[i10];
        }

        public y0 f(int i10) {
            return this.f5133c[i10];
        }

        public int g(int i10, int i11, int i12) {
            return x2.f(c(i10, i11, i12));
        }

        public y0 h() {
            return this.f5136f;
        }
    }

    static n3 g(t[] tVarArr, a aVar) {
        s.a aVar2 = new s.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            y0 f10 = aVar.f(i10);
            t tVar = tVarArr[i10];
            for (int i11 = 0; i11 < f10.f31863a; i11++) {
                w0 b10 = f10.b(i11);
                int i12 = b10.f31846a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f31846a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    zArr[i13] = (tVar == null || !tVar.k().equals(b10) || tVar.i(i13) == -1) ? false : true;
                }
                aVar2.a(new n3.a(b10, iArr, aVar.e(i10), zArr));
            }
        }
        y0 h10 = aVar.h();
        for (int i14 = 0; i14 < h10.f31863a; i14++) {
            w0 b11 = h10.b(i14);
            int[] iArr2 = new int[b11.f31846a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new n3.a(b11, iArr2, ea.v.l(b11.c(0).f32709l), new boolean[b11.f31846a]));
        }
        return new n3(aVar2.h());
    }

    private static int h(y2[] y2VarArr, w0 w0Var, int[] iArr, boolean z10) throws j8.n {
        int length = y2VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
            y2 y2Var = y2VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < w0Var.f31846a; i13++) {
                i12 = Math.max(i12, x2.f(y2Var.a(w0Var.c(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(y2 y2Var, w0 w0Var) throws j8.n {
        int[] iArr = new int[w0Var.f31846a];
        for (int i10 = 0; i10 < w0Var.f31846a; i10++) {
            iArr[i10] = y2Var.a(w0Var.c(i10));
        }
        return iArr;
    }

    private static int[] k(y2[] y2VarArr) throws j8.n {
        int length = y2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = y2VarArr[i10].q();
        }
        return iArr;
    }

    @Override // ba.a0
    public final void e(Object obj) {
        this.f5130c = (a) obj;
    }

    @Override // ba.a0
    public final b0 f(y2[] y2VarArr, y0 y0Var, u.b bVar, j3 j3Var) throws j8.n {
        int[] j10;
        int[] iArr = new int[y2VarArr.length + 1];
        int length = y2VarArr.length + 1;
        w0[][] w0VarArr = new w0[length];
        int[][][] iArr2 = new int[y2VarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = y0Var.f31863a;
            w0VarArr[i10] = new w0[i11];
            iArr2[i10] = new int[i11];
        }
        int[] k10 = k(y2VarArr);
        for (int i12 = 0; i12 < y0Var.f31863a; i12++) {
            w0 b10 = y0Var.b(i12);
            int h10 = h(y2VarArr, b10, iArr, ea.v.l(b10.c(0).f32709l) == 5);
            if (h10 == y2VarArr.length) {
                j10 = new int[b10.f31846a];
            } else {
                j10 = j(y2VarArr[h10], b10);
            }
            int i13 = iArr[h10];
            w0VarArr[h10][i13] = b10;
            iArr2[h10][i13] = j10;
            iArr[h10] = iArr[h10] + 1;
        }
        y0[] y0VarArr = new y0[y2VarArr.length];
        String[] strArr = new String[y2VarArr.length];
        int[] iArr3 = new int[y2VarArr.length];
        for (int i14 = 0; i14 < y2VarArr.length; i14++) {
            int i15 = iArr[i14];
            y0VarArr[i14] = new y0((w0[]) n0.H0(w0VarArr[i14], i15));
            iArr2[i14] = (int[][]) n0.H0(iArr2[i14], i15);
            strArr[i14] = y2VarArr[i14].getName();
            iArr3[i14] = y2VarArr[i14].e();
        }
        a aVar = new a(strArr, iArr3, y0VarArr, k10, iArr2, new y0((w0[]) n0.H0(w0VarArr[y2VarArr.length], iArr[y2VarArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> l10 = l(aVar, iArr2, k10, bVar, j3Var);
        return new b0((z2[]) l10.first, (q[]) l10.second, g((t[]) l10.second, aVar), aVar);
    }

    public final a i() {
        return this.f5130c;
    }

    protected abstract Pair<RendererConfiguration[], ExoTrackSelection[]> l(a aVar, int[][][] iArr, int[] iArr2, u.b bVar, j3 j3Var) throws j8.n;
}
