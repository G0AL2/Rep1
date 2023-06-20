package l8;

/* compiled from: MpegAudioUtil.java */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f33797a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f33798b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f33799c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f33800d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f33801e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f33802f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f33803g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33804a;

        /* renamed from: b  reason: collision with root package name */
        public String f33805b;

        /* renamed from: c  reason: collision with root package name */
        public int f33806c;

        /* renamed from: d  reason: collision with root package name */
        public int f33807d;

        /* renamed from: e  reason: collision with root package name */
        public int f33808e;

        /* renamed from: f  reason: collision with root package name */
        public int f33809f;

        /* renamed from: g  reason: collision with root package name */
        public int f33810g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!e0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f33804a = i11;
            this.f33805b = e0.f33797a[3 - i12];
            int i15 = e0.f33798b[i14];
            this.f33807d = i15;
            if (i11 == 2) {
                this.f33807d = i15 / 2;
            } else if (i11 == 0) {
                this.f33807d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f33810g = e0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? e0.f33799c[i13 - 1] : e0.f33800d[i13 - 1];
                this.f33809f = i17;
                this.f33806c = (((i17 * 12) / this.f33807d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? e0.f33801e[i13 - 1] : e0.f33802f[i13 - 1];
                    this.f33809f = i18;
                    this.f33806c = ((i18 * 144) / this.f33807d) + i16;
                } else {
                    int i19 = e0.f33803g[i13 - 1];
                    this.f33809f = i19;
                    this.f33806c = (((i12 == 1 ? 72 : 144) * i19) / this.f33807d) + i16;
                }
            }
            this.f33808e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f33798b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f33799c[i13 - 1] : f33800d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f33801e[i13 - 1] : f33802f[i13 - 1];
        } else {
            i15 = f33803g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        } else if (i11 != 2) {
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
