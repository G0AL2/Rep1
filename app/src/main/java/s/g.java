package s;

import s.d;
import s.e;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class g extends e {
    private boolean B0;

    /* renamed from: w0  reason: collision with root package name */
    protected float f36668w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    protected int f36669x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    protected int f36670y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    private d f36671z0 = this.M;
    private int A0 = 0;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36672a;

        static {
            int[] iArr = new int[d.b.values().length];
            f36672a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36672a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36672a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36672a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36672a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36672a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36672a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36672a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36672a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.U.clear();
        this.U.add(this.f36671z0);
        int length = this.T.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.T[i10] = this.f36671z0;
        }
    }

    @Override // s.e
    public void g(p.d dVar, boolean z10) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m10 = fVar.m(d.b.LEFT);
        d m11 = fVar.m(d.b.RIGHT);
        e eVar = this.X;
        boolean z11 = true;
        boolean z12 = eVar != null && eVar.W[0] == e.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            m10 = fVar.m(d.b.TOP);
            m11 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.X;
            z12 = (eVar2 == null || eVar2.W[1] != e.b.WRAP_CONTENT) ? false : false;
        }
        if (this.B0 && this.f36671z0.m()) {
            p.i q10 = dVar.q(this.f36671z0);
            dVar.f(q10, this.f36671z0.d());
            if (this.f36669x0 != -1) {
                if (z12) {
                    dVar.h(dVar.q(m11), q10, 0, 5);
                }
            } else if (this.f36670y0 != -1 && z12) {
                p.i q11 = dVar.q(m11);
                dVar.h(q10, dVar.q(m10), 0, 5);
                dVar.h(q11, q10, 0, 5);
            }
            this.B0 = false;
        } else if (this.f36669x0 != -1) {
            p.i q12 = dVar.q(this.f36671z0);
            dVar.e(q12, dVar.q(m10), this.f36669x0, 8);
            if (z12) {
                dVar.h(dVar.q(m11), q12, 0, 5);
            }
        } else if (this.f36670y0 != -1) {
            p.i q13 = dVar.q(this.f36671z0);
            p.i q14 = dVar.q(m11);
            dVar.e(q13, q14, -this.f36670y0, 8);
            if (z12) {
                dVar.h(q13, dVar.q(m10), 0, 5);
                dVar.h(q14, q13, 0, 5);
            }
        } else if (this.f36668w0 != -1.0f) {
            dVar.d(p.d.s(dVar, dVar.q(this.f36671z0), dVar.q(m11), this.f36668w0));
        }
    }

    @Override // s.e
    public boolean h() {
        return true;
    }

    @Override // s.e
    public boolean l0() {
        return this.B0;
    }

    @Override // s.e
    public d m(d.b bVar) {
        int i10 = a.f36672a[bVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if ((i10 == 3 || i10 == 4) && this.A0 == 0) {
                return this.f36671z0;
            }
            return null;
        } else if (this.A0 == 1) {
            return this.f36671z0;
        } else {
            return null;
        }
    }

    @Override // s.e
    public boolean m0() {
        return this.B0;
    }

    @Override // s.e
    public void n1(p.d dVar, boolean z10) {
        if (I() == null) {
            return;
        }
        int x10 = dVar.x(this.f36671z0);
        if (this.A0 == 1) {
            j1(x10);
            k1(0);
            I0(I().v());
            h1(0);
            return;
        }
        j1(0);
        k1(x10);
        h1(I().U());
        I0(0);
    }

    public d o1() {
        return this.f36671z0;
    }

    public int p1() {
        return this.A0;
    }

    public int q1() {
        return this.f36669x0;
    }

    public int r1() {
        return this.f36670y0;
    }

    public float s1() {
        return this.f36668w0;
    }

    public void t1(int i10) {
        this.f36671z0.s(i10);
        this.B0 = true;
    }

    public void u1(int i10) {
        if (i10 > -1) {
            this.f36668w0 = -1.0f;
            this.f36669x0 = i10;
            this.f36670y0 = -1;
        }
    }

    public void v1(int i10) {
        if (i10 > -1) {
            this.f36668w0 = -1.0f;
            this.f36669x0 = -1;
            this.f36670y0 = i10;
        }
    }

    public void w1(float f10) {
        if (f10 > -1.0f) {
            this.f36668w0 = f10;
            this.f36669x0 = -1;
            this.f36670y0 = -1;
        }
    }

    public void x1(int i10) {
        if (this.A0 == i10) {
            return;
        }
        this.A0 = i10;
        this.U.clear();
        if (this.A0 == 1) {
            this.f36671z0 = this.L;
        } else {
            this.f36671z0 = this.M;
        }
        this.U.add(this.f36671z0);
        int length = this.T.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.T[i11] = this.f36671z0;
        }
    }
}
