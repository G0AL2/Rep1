package mf;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes3.dex */
public final class b0 extends i {

    /* renamed from: f  reason: collision with root package name */
    private final transient byte[][] f34432f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int[] f34433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(byte[][] bArr, int[] iArr) {
        super(i.f34461d.l());
        qe.k.f(bArr, "segments");
        qe.k.f(iArr, "directory");
        this.f34432f = bArr;
        this.f34433g = iArr;
    }

    private final i I() {
        return new i(D());
    }

    @Override // mf.i
    public i C() {
        return I().C();
    }

    @Override // mf.i
    public byte[] D() {
        byte[] bArr = new byte[A()];
        int length = H().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = G()[length + i10];
            int i14 = G()[i10];
            int i15 = i14 - i11;
            fe.k.c(H()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // mf.i
    public void F(f fVar, int i10, int i11) {
        qe.k.f(fVar, "buffer");
        int i12 = i10 + i11;
        int b10 = nf.e.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : G()[b10 - 1];
            int i14 = G()[H().length + b10];
            int min = Math.min(i12, (G()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            z zVar = new z(H()[b10], i15, i15 + min, true, false);
            z zVar2 = fVar.f34446a;
            if (zVar2 == null) {
                zVar.f34514g = zVar;
                zVar.f34513f = zVar;
                fVar.f34446a = zVar;
            } else {
                qe.k.c(zVar2);
                z zVar3 = zVar2.f34514g;
                qe.k.c(zVar3);
                zVar3.c(zVar);
            }
            i10 += min;
            b10++;
        }
        fVar.z0(fVar.C0() + i11);
    }

    public final int[] G() {
        return this.f34433g;
    }

    public final byte[][] H() {
        return this.f34432f;
    }

    @Override // mf.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.A() == A() && u(0, iVar, 0, A())) {
                return true;
            }
        }
        return false;
    }

    @Override // mf.i
    public String f() {
        return I().f();
    }

    @Override // mf.i
    public int hashCode() {
        int m10 = m();
        if (m10 != 0) {
            return m10;
        }
        int length = H().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = G()[length + i10];
            int i14 = G()[i10];
            byte[] bArr = H()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        w(i11);
        return i11;
    }

    @Override // mf.i
    public i i(String str) {
        qe.k.f(str, "algorithm");
        return nf.b.e(this, str);
    }

    @Override // mf.i
    public int n() {
        return G()[H().length - 1];
    }

    @Override // mf.i
    public String p() {
        return I().p();
    }

    @Override // mf.i
    public byte[] q() {
        return D();
    }

    @Override // mf.i
    public byte r(int i10) {
        c.b(G()[H().length - 1], i10, 1L);
        int b10 = nf.e.b(this, i10);
        return H()[b10][(i10 - (b10 == 0 ? 0 : G()[b10 - 1])) + G()[H().length + b10]];
    }

    @Override // mf.i
    public String toString() {
        return I().toString();
    }

    @Override // mf.i
    public boolean u(int i10, i iVar, int i11, int i12) {
        qe.k.f(iVar, InneractiveMediationNameConsts.OTHER);
        if (i10 < 0 || i10 > A() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = nf.e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : G()[b10 - 1];
            int i15 = G()[H().length + b10];
            int min = Math.min(i13, (G()[b10] - i14) + i14) - i10;
            if (!iVar.v(i11, H()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // mf.i
    public boolean v(int i10, byte[] bArr, int i11, int i12) {
        qe.k.f(bArr, InneractiveMediationNameConsts.OTHER);
        if (i10 < 0 || i10 > A() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = nf.e.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : G()[b10 - 1];
            int i15 = G()[H().length + b10];
            int min = Math.min(i13, (G()[b10] - i14) + i14) - i10;
            if (!c.a(H()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }
}
