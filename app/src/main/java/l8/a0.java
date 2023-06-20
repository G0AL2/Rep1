package l8;

import ea.n0;
import l8.y;

/* compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* loaded from: classes2.dex */
public class a0 implements y.d {

    /* renamed from: b  reason: collision with root package name */
    protected final int f33747b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f33748c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f33749d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f33750e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f33751f;

    /* renamed from: g  reason: collision with root package name */
    public final int f33752g;

    /* compiled from: DefaultAudioTrackBufferSizeProvider.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f33753a = 250000;

        /* renamed from: b  reason: collision with root package name */
        private int f33754b = 750000;

        /* renamed from: c  reason: collision with root package name */
        private int f33755c = 4;

        /* renamed from: d  reason: collision with root package name */
        private int f33756d = 250000;

        /* renamed from: e  reason: collision with root package name */
        private int f33757e = 50000000;

        /* renamed from: f  reason: collision with root package name */
        private int f33758f = 2;

        public a0 g() {
            return new a0(this);
        }
    }

    protected a0(a aVar) {
        this.f33747b = aVar.f33753a;
        this.f33748c = aVar.f33754b;
        this.f33749d = aVar.f33755c;
        this.f33750e = aVar.f33756d;
        this.f33751f = aVar.f33757e;
        this.f33752g = aVar.f33758f;
    }

    protected static int b(int i10, int i11, int i12) {
        return mb.d.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // l8.y.d
    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return f(i11);
                }
                throw new IllegalArgumentException();
            }
            return e(i11);
        }
        return g(i10, i14, i13);
    }

    protected int e(int i10) {
        return mb.d.d((this.f33751f * d(i10)) / 1000000);
    }

    protected int f(int i10) {
        int i11 = this.f33750e;
        if (i10 == 5) {
            i11 *= this.f33752g;
        }
        return mb.d.d((i11 * d(i10)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return n0.q(i10 * this.f33749d, b(this.f33747b, i11, i12), b(this.f33748c, i11, i12));
    }
}
