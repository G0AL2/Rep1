package w8;

import j8.p1;

/* compiled from: Track.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f38446a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38447b;

    /* renamed from: c  reason: collision with root package name */
    public final long f38448c;

    /* renamed from: d  reason: collision with root package name */
    public final long f38449d;

    /* renamed from: e  reason: collision with root package name */
    public final long f38450e;

    /* renamed from: f  reason: collision with root package name */
    public final p1 f38451f;

    /* renamed from: g  reason: collision with root package name */
    public final int f38452g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f38453h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f38454i;

    /* renamed from: j  reason: collision with root package name */
    public final int f38455j;

    /* renamed from: k  reason: collision with root package name */
    private final p[] f38456k;

    public o(int i10, int i11, long j10, long j11, long j12, p1 p1Var, int i12, p[] pVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f38446a = i10;
        this.f38447b = i11;
        this.f38448c = j10;
        this.f38449d = j11;
        this.f38450e = j12;
        this.f38451f = p1Var;
        this.f38452g = i12;
        this.f38456k = pVarArr;
        this.f38455j = i13;
        this.f38453h = jArr;
        this.f38454i = jArr2;
    }

    public p a(int i10) {
        p[] pVarArr = this.f38456k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
