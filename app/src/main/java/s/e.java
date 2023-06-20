package s;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.d;
import t.n;
import t.p;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: v0  reason: collision with root package name */
    public static float f36610v0 = 0.5f;
    public int A;
    public float B;
    int C;
    float D;
    private int[] E;
    private float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    public d L;
    public d M;
    public d N;
    public d O;
    public d P;
    d Q;
    d R;
    public d S;
    public d[] T;
    protected ArrayList<d> U;
    private boolean[] V;
    public b[] W;
    public e X;
    int Y;
    int Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f36612a0;

    /* renamed from: b  reason: collision with root package name */
    public t.c f36613b;

    /* renamed from: b0  reason: collision with root package name */
    protected int f36614b0;

    /* renamed from: c  reason: collision with root package name */
    public t.c f36615c;

    /* renamed from: c0  reason: collision with root package name */
    protected int f36616c0;

    /* renamed from: d0  reason: collision with root package name */
    protected int f36618d0;

    /* renamed from: e0  reason: collision with root package name */
    int f36620e0;

    /* renamed from: f0  reason: collision with root package name */
    protected int f36622f0;

    /* renamed from: g0  reason: collision with root package name */
    protected int f36624g0;

    /* renamed from: h0  reason: collision with root package name */
    float f36626h0;

    /* renamed from: i0  reason: collision with root package name */
    float f36628i0;

    /* renamed from: j0  reason: collision with root package name */
    private Object f36630j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f36632k0;

    /* renamed from: l  reason: collision with root package name */
    public String f36633l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f36634l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36635m;

    /* renamed from: m0  reason: collision with root package name */
    private String f36636m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36637n;

    /* renamed from: n0  reason: collision with root package name */
    private String f36638n0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f36639o;

    /* renamed from: o0  reason: collision with root package name */
    int f36640o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f36641p;

    /* renamed from: p0  reason: collision with root package name */
    int f36642p0;

    /* renamed from: q  reason: collision with root package name */
    public int f36643q;

    /* renamed from: q0  reason: collision with root package name */
    public float[] f36644q0;

    /* renamed from: r  reason: collision with root package name */
    public int f36645r;

    /* renamed from: r0  reason: collision with root package name */
    protected e[] f36646r0;

    /* renamed from: s  reason: collision with root package name */
    private int f36647s;

    /* renamed from: s0  reason: collision with root package name */
    protected e[] f36648s0;

    /* renamed from: t  reason: collision with root package name */
    public int f36649t;

    /* renamed from: t0  reason: collision with root package name */
    public int f36650t0;

    /* renamed from: u  reason: collision with root package name */
    public int f36651u;

    /* renamed from: u0  reason: collision with root package name */
    public int f36652u0;

    /* renamed from: v  reason: collision with root package name */
    public int[] f36653v;

    /* renamed from: w  reason: collision with root package name */
    public int f36654w;

    /* renamed from: x  reason: collision with root package name */
    public int f36655x;

    /* renamed from: y  reason: collision with root package name */
    public float f36656y;

    /* renamed from: z  reason: collision with root package name */
    public int f36657z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f36611a = false;

    /* renamed from: d  reason: collision with root package name */
    public t.l f36617d = null;

    /* renamed from: e  reason: collision with root package name */
    public n f36619e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f36621f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    private boolean f36623g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36625h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f36627i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f36629j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f36631k = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36658a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f36659b;

        static {
            int[] iArr = new int[b.values().length];
            f36659b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36659b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36659b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36659b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f36658a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36658a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36658a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36658a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36658a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36658a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36658a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36658a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36658a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new r.a(this);
        this.f36635m = false;
        this.f36637n = false;
        this.f36639o = false;
        this.f36641p = false;
        this.f36643q = -1;
        this.f36645r = -1;
        this.f36647s = 0;
        this.f36649t = 0;
        this.f36651u = 0;
        this.f36653v = new int[2];
        this.f36654w = 0;
        this.f36655x = 0;
        this.f36656y = 1.0f;
        this.f36657z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.F = 0.0f;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = new d(this, d.b.LEFT);
        this.M = new d(this, d.b.TOP);
        this.N = new d(this, d.b.RIGHT);
        this.O = new d(this, d.b.BOTTOM);
        this.P = new d(this, d.b.BASELINE);
        this.Q = new d(this, d.b.CENTER_X);
        this.R = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.S = dVar;
        this.T = new d[]{this.L, this.N, this.M, this.O, this.P, dVar};
        this.U = new ArrayList<>();
        this.V = new boolean[2];
        b bVar = b.FIXED;
        this.W = new b[]{bVar, bVar};
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.f36612a0 = 0.0f;
        this.f36614b0 = -1;
        this.f36616c0 = 0;
        this.f36618d0 = 0;
        this.f36620e0 = 0;
        float f10 = f36610v0;
        this.f36626h0 = f10;
        this.f36628i0 = f10;
        this.f36632k0 = 0;
        this.f36634l0 = false;
        this.f36636m0 = null;
        this.f36638n0 = null;
        this.f36640o0 = 0;
        this.f36642p0 = 0;
        this.f36644q0 = new float[]{-1.0f, -1.0f};
        this.f36646r0 = new e[]{null, null};
        this.f36648s0 = new e[]{null, null};
        this.f36650t0 = -1;
        this.f36652u0 = -1;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f36595f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f36595f);
        sb2.append("'");
        if (dVar.f36597h != Integer.MIN_VALUE || dVar.f36596g != 0) {
            sb2.append(",");
            sb2.append(dVar.f36596g);
            if (dVar.f36597h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f36597h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.U.add(this.L);
        this.U.add(this.M);
        this.U.add(this.N);
        this.U.add(this.O);
        this.U.add(this.Q);
        this.U.add(this.R);
        this.U.add(this.S);
        this.U.add(this.P);
    }

    private boolean d0(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.T;
        if (dVarArr[i11].f36595f != null && dVarArr[i11].f36595f.f36595f != dVarArr[i11]) {
            int i12 = i11 + 1;
            if (dVarArr[i12].f36595f != null && dVarArr[i12].f36595f.f36595f == dVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x046d, code lost:
        if ((r4 instanceof s.a) != false) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:391:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(p.d r37, boolean r38, boolean r39, boolean r40, boolean r41, p.i r42, p.i r43, s.e.b r44, boolean r45, s.d r46, s.d r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.i(p.d, boolean, boolean, boolean, boolean, p.i, p.i, s.e$b, boolean, s.d, s.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void w0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int A() {
        return this.J;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void A0(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int i11 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i12, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i11 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = 0.0f;
            } else {
                String substring4 = str.substring(i12);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = 0.0f;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.f36612a0 = f10;
                this.f36614b0 = i11;
                return;
            }
            return;
        }
        this.f36612a0 = 0.0f;
    }

    public int B() {
        return this.K;
    }

    public void B0(int i10) {
        if (this.G) {
            int i11 = i10 - this.f36620e0;
            int i12 = this.Z + i11;
            this.f36618d0 = i11;
            this.M.s(i11);
            this.O.s(i12);
            this.P.s(i10);
            this.f36637n = true;
        }
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10, int i11) {
        if (this.f36635m) {
            return;
        }
        this.L.s(i10);
        this.N.s(i11);
        this.f36616c0 = i10;
        this.Y = i11 - i10;
        this.f36635m = true;
    }

    public int D() {
        return this.E[1];
    }

    public void D0(int i10) {
        this.L.s(i10);
        this.f36616c0 = i10;
    }

    public int E() {
        return this.E[0];
    }

    public void E0(int i10) {
        this.M.s(i10);
        this.f36618d0 = i10;
    }

    public int F() {
        return this.f36624g0;
    }

    public void F0(int i10, int i11) {
        if (this.f36637n) {
            return;
        }
        this.M.s(i10);
        this.O.s(i11);
        this.f36618d0 = i10;
        this.Z = i11 - i10;
        if (this.G) {
            this.P.s(i10 + this.f36620e0);
        }
        this.f36637n = true;
    }

    public int G() {
        return this.f36622f0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f36616c0 = i10;
        this.f36618d0 = i11;
        if (this.f36632k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        b[] bVarArr = this.W;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.Y)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.Z)) {
            i17 = i14;
        }
        this.Y = i16;
        this.Z = i17;
        int i18 = this.f36624g0;
        if (i17 < i18) {
            this.Z = i18;
        }
        int i19 = this.f36622f0;
        if (i16 < i19) {
            this.Y = i19;
        }
        int i20 = this.f36655x;
        if (i20 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i20);
        }
        int i21 = this.A;
        if (i21 > 0 && this.W[1] == b.MATCH_CONSTRAINT) {
            this.Z = Math.min(this.Z, i21);
        }
        int i22 = this.Y;
        if (i16 != i22) {
            this.f36629j = i22;
        }
        int i23 = this.Z;
        if (i17 != i23) {
            this.f36631k = i23;
        }
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.O).f36595f) != null && dVar2.f36595f == dVar) {
                return dVar2.f36593d;
            }
            return null;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f36595f;
        if (dVar4 == null || dVar4.f36595f != dVar3) {
            return null;
        }
        return dVar4.f36593d;
    }

    public void H0(boolean z10) {
        this.G = z10;
    }

    public e I() {
        return this.X;
    }

    public void I0(int i10) {
        this.Z = i10;
        int i11 = this.f36624g0;
        if (i10 < i11) {
            this.Z = i11;
        }
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.M).f36595f) != null && dVar2.f36595f == dVar) {
                return dVar2.f36593d;
            }
            return null;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f36595f;
        if (dVar4 == null || dVar4.f36595f != dVar3) {
            return null;
        }
        return dVar4.f36593d;
    }

    public void J0(float f10) {
        this.f36626h0 = f10;
    }

    public int K() {
        return V() + this.Y;
    }

    public void K0(int i10) {
        this.f36640o0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f36617d;
        }
        if (i10 == 1) {
            return this.f36619e;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.f36616c0 = i10;
        int i12 = i11 - i10;
        this.Y = i12;
        int i13 = this.f36622f0;
        if (i12 < i13) {
            this.Y = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f36633l + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.Y);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Z);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f36616c0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f36618d0);
        sb2.append("\n");
        O(sb2, "left", this.L);
        O(sb2, "top", this.M);
        O(sb2, "right", this.N);
        O(sb2, "bottom", this.O);
        O(sb2, "baseline", this.P);
        O(sb2, "centerX", this.Q);
        O(sb2, "centerY", this.R);
        N(sb2, "    width", this.Y, this.f36622f0, this.E[0], this.f36629j, this.f36654w, this.f36649t, this.f36656y, this.f36644q0[0]);
        N(sb2, "    height", this.Z, this.f36624g0, this.E[1], this.f36631k, this.f36657z, this.f36651u, this.B, this.f36644q0[1]);
        w0(sb2, "    dimensionRatio", this.f36612a0, this.f36614b0);
        u0(sb2, "    horizontalBias", this.f36626h0, f36610v0);
        u0(sb2, "    verticalBias", this.f36628i0, f36610v0);
        v0(sb2, "    horizontalChainStyle", this.f36640o0, 0);
        v0(sb2, "    verticalChainStyle", this.f36642p0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.W[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f10) {
        this.f36649t = i10;
        this.f36654w = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f36655x = i12;
        this.f36656y = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f36649t = 2;
    }

    public void O0(float f10) {
        this.f36644q0[0] = f10;
    }

    public float P() {
        return this.f36628i0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P0(int i10, boolean z10) {
        this.V[i10] = z10;
    }

    public int Q() {
        return this.f36642p0;
    }

    public void Q0(boolean z10) {
        this.H = z10;
    }

    public b R() {
        return this.W[1];
    }

    public void R0(boolean z10) {
        this.I = z10;
    }

    public int S() {
        int i10 = this.L != null ? 0 + this.M.f36596g : 0;
        return this.N != null ? i10 + this.O.f36596g : i10;
    }

    public void S0(int i10, int i11) {
        this.J = i10;
        this.K = i11;
        V0(false);
    }

    public int T() {
        return this.f36632k0;
    }

    public void T0(int i10) {
        this.E[1] = i10;
    }

    public int U() {
        if (this.f36632k0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public void U0(int i10) {
        this.E[0] = i10;
    }

    public int V() {
        e eVar = this.X;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).D0 + this.f36616c0;
        }
        return this.f36616c0;
    }

    public void V0(boolean z10) {
        this.f36623g = z10;
    }

    public int W() {
        e eVar = this.X;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).E0 + this.f36618d0;
        }
        return this.f36618d0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            this.f36624g0 = 0;
        } else {
            this.f36624g0 = i10;
        }
    }

    public boolean X() {
        return this.G;
    }

    public void X0(int i10) {
        if (i10 < 0) {
            this.f36622f0 = 0;
        } else {
            this.f36622f0 = i10;
        }
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.L.f36595f != null ? 1 : 0) + (this.N.f36595f != null ? 1 : 0) < 2;
        }
        return ((this.M.f36595f != null ? 1 : 0) + (this.O.f36595f != null ? 1 : 0)) + (this.P.f36595f != null ? 1 : 0) < 2;
    }

    public void Y0(int i10, int i11) {
        this.f36616c0 = i10;
        this.f36618d0 = i11;
    }

    public boolean Z() {
        int size = this.U.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.U.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.X = eVar;
    }

    public boolean a0() {
        return (this.f36629j == -1 && this.f36631k == -1) ? false : true;
    }

    public void a1(float f10) {
        this.f36628i0 = f10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.L.f36595f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.N.f36595f) != null && dVar2.m() && (this.N.f36595f.d() - this.N.e()) - (this.L.f36595f.d() + this.L.e()) >= i11;
        }
        d dVar4 = this.M.f36595f;
        return dVar4 != null && dVar4.m() && (dVar = this.O.f36595f) != null && dVar.m() && (this.O.f36595f.d() - this.O.e()) - (this.M.f36595f.d() + this.M.e()) >= i11;
        return false;
    }

    public void b1(int i10) {
        this.f36642p0 = i10;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(int i10, int i11) {
        this.f36618d0 = i10;
        int i12 = i11 - i10;
        this.Z = i12;
        int i13 = this.f36624g0;
        if (i12 < i13) {
            this.Z = i13;
        }
    }

    public void d1(b bVar) {
        this.W[1] = bVar;
    }

    public void e(f fVar, p.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.P1(64));
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.L.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f36593d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.N.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f36593d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c12 = this.M.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f36593d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.O.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f36593d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.P.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f36593d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f36639o;
    }

    public void e1(int i10, int i11, int i12, float f10) {
        this.f36651u = i10;
        this.f36657z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f36651u = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i10) {
        return this.V[i10];
    }

    public void f1(float f10) {
        this.f36644q0[1] = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(p.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.g(p.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.L;
        d dVar2 = dVar.f36595f;
        if (dVar2 == null || dVar2.f36595f != dVar) {
            d dVar3 = this.N;
            d dVar4 = dVar3.f36595f;
            return dVar4 != null && dVar4.f36595f == dVar3;
        }
        return true;
    }

    public void g1(int i10) {
        this.f36632k0 = i10;
    }

    public boolean h() {
        return this.f36632k0 != 8;
    }

    public boolean h0() {
        return this.H;
    }

    public void h1(int i10) {
        this.Y = i10;
        int i11 = this.f36622f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public boolean i0() {
        d dVar = this.M;
        d dVar2 = dVar.f36595f;
        if (dVar2 == null || dVar2.f36595f != dVar) {
            d dVar3 = this.O;
            d dVar4 = dVar3.f36595f;
            return dVar4 != null && dVar4.f36595f == dVar3;
        }
        return true;
    }

    public void i1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f36647s = i10;
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.F = f10;
    }

    public boolean j0() {
        return this.I;
    }

    public void j1(int i10) {
        this.f36616c0 = i10;
    }

    public void k(p.d dVar) {
        dVar.q(this.L);
        dVar.q(this.M);
        dVar.q(this.N);
        dVar.q(this.O);
        if (this.f36620e0 > 0) {
            dVar.q(this.P);
        }
    }

    public boolean k0() {
        return this.f36623g && this.f36632k0 != 8;
    }

    public void k1(int i10) {
        this.f36618d0 = i10;
    }

    public void l() {
        if (this.f36617d == null) {
            this.f36617d = new t.l(this);
        }
        if (this.f36619e == null) {
            this.f36619e = new n(this);
        }
    }

    public boolean l0() {
        return this.f36635m || (this.L.m() && this.N.m());
    }

    public void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.C == -1) {
            if (z12 && !z13) {
                this.C = 0;
            } else if (!z12 && z13) {
                this.C = 1;
                if (this.f36614b0 == -1) {
                    this.D = 1.0f / this.D;
                }
            }
        }
        if (this.C == 0 && (!this.M.n() || !this.O.n())) {
            this.C = 1;
        } else if (this.C == 1 && (!this.L.n() || !this.N.n())) {
            this.C = 0;
        }
        if (this.C == -1 && (!this.M.n() || !this.O.n() || !this.L.n() || !this.N.n())) {
            if (this.M.n() && this.O.n()) {
                this.C = 0;
            } else if (this.L.n() && this.N.n()) {
                this.D = 1.0f / this.D;
                this.C = 1;
            }
        }
        if (this.C == -1) {
            int i10 = this.f36654w;
            if (i10 > 0 && this.f36657z == 0) {
                this.C = 0;
            } else if (i10 != 0 || this.f36657z <= 0) {
            } else {
                this.D = 1.0f / this.D;
                this.C = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f36658a[bVar.ordinal()]) {
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.P;
            case 6:
                return this.S;
            case 7:
                return this.Q;
            case 8:
                return this.R;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f36637n || (this.M.m() && this.O.m());
    }

    public void m1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f36617d.k();
        boolean k11 = z11 & this.f36619e.k();
        t.l lVar = this.f36617d;
        int i12 = lVar.f37066h.f37026g;
        n nVar = this.f36619e;
        int i13 = nVar.f37066h.f37026g;
        int i14 = lVar.f37067i.f37026g;
        int i15 = nVar.f37067i.f37026g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f36616c0 = i12;
        }
        if (k11) {
            this.f36618d0 = i13;
        }
        if (this.f36632k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        if (k10) {
            if (this.W[0] == b.FIXED && i17 < (i11 = this.Y)) {
                i17 = i11;
            }
            this.Y = i17;
            int i19 = this.f36622f0;
            if (i17 < i19) {
                this.Y = i19;
            }
        }
        if (k11) {
            if (this.W[1] == b.FIXED && i18 < (i10 = this.Z)) {
                i18 = i10;
            }
            this.Z = i18;
            int i20 = this.f36624g0;
            if (i18 < i20) {
                this.Z = i20;
            }
        }
    }

    public int n() {
        return this.f36620e0;
    }

    public boolean n0() {
        return this.f36641p;
    }

    public void n1(p.d dVar, boolean z10) {
        n nVar;
        t.l lVar;
        int x10 = dVar.x(this.L);
        int x11 = dVar.x(this.M);
        int x12 = dVar.x(this.N);
        int x13 = dVar.x(this.O);
        if (z10 && (lVar = this.f36617d) != null) {
            t.f fVar = lVar.f37066h;
            if (fVar.f37029j) {
                t.f fVar2 = lVar.f37067i;
                if (fVar2.f37029j) {
                    x10 = fVar.f37026g;
                    x12 = fVar2.f37026g;
                }
            }
        }
        if (z10 && (nVar = this.f36619e) != null) {
            t.f fVar3 = nVar.f37066h;
            if (fVar3.f37029j) {
                t.f fVar4 = nVar.f37067i;
                if (fVar4.f37029j) {
                    x11 = fVar3.f37026g;
                    x13 = fVar4.f37026g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x13 = 0;
            x10 = 0;
            x11 = 0;
            x12 = 0;
        }
        G0(x10, x11, x12, x13);
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f36626h0;
        }
        if (i10 == 1) {
            return this.f36628i0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f36639o = true;
    }

    public int p() {
        return W() + this.Z;
    }

    public void p0() {
        this.f36641p = true;
    }

    public Object q() {
        return this.f36630j0;
    }

    public boolean q0() {
        b[] bVarArr = this.W;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f36636m0;
    }

    public void r0() {
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.X = null;
        this.F = 0.0f;
        this.Y = 0;
        this.Z = 0;
        this.f36612a0 = 0.0f;
        this.f36614b0 = -1;
        this.f36616c0 = 0;
        this.f36618d0 = 0;
        this.f36620e0 = 0;
        this.f36622f0 = 0;
        this.f36624g0 = 0;
        float f10 = f36610v0;
        this.f36626h0 = f10;
        this.f36628i0 = f10;
        b[] bVarArr = this.W;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f36630j0 = null;
        this.f36632k0 = 0;
        this.f36638n0 = null;
        this.f36640o0 = 0;
        this.f36642p0 = 0;
        float[] fArr = this.f36644q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f36643q = -1;
        this.f36645r = -1;
        int[] iArr = this.E;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f36649t = 0;
        this.f36651u = 0;
        this.f36656y = 1.0f;
        this.B = 1.0f;
        this.f36655x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f36654w = 0;
        this.f36657z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.f36621f;
        zArr[0] = true;
        zArr[1] = true;
        this.I = false;
        boolean[] zArr2 = this.V;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f36623g = true;
        int[] iArr2 = this.f36653v;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f36629j = -1;
        this.f36631k = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f36635m = false;
        this.f36637n = false;
        this.f36639o = false;
        this.f36641p = false;
        int size = this.U.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.U.get(i10).q();
        }
    }

    public float t() {
        return this.f36612a0;
    }

    public void t0(p.c cVar) {
        this.L.r(cVar);
        this.M.r(cVar);
        this.N.r(cVar);
        this.O.r(cVar);
        this.P.r(cVar);
        this.S.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f36638n0 != null) {
            str = "type: " + this.f36638n0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f36636m0 != null) {
            str2 = "id: " + this.f36636m0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f36616c0);
        sb2.append(", ");
        sb2.append(this.f36618d0);
        sb2.append(") - (");
        sb2.append(this.Y);
        sb2.append(" x ");
        sb2.append(this.Z);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f36614b0;
    }

    public int v() {
        if (this.f36632k0 == 8) {
            return 0;
        }
        return this.Z;
    }

    public float w() {
        return this.f36626h0;
    }

    public int x() {
        return this.f36640o0;
    }

    public void x0(int i10) {
        this.f36620e0 = i10;
        this.G = i10 > 0;
    }

    public b y() {
        return this.W[0];
    }

    public void y0(Object obj) {
        this.f36630j0 = obj;
    }

    public int z() {
        d dVar = this.L;
        int i10 = dVar != null ? 0 + dVar.f36596g : 0;
        d dVar2 = this.N;
        return dVar2 != null ? i10 + dVar2.f36596g : i10;
    }

    public void z0(String str) {
        this.f36636m0 = str;
    }
}
