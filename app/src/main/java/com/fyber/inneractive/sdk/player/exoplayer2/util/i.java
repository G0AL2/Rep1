package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f19558a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f19559b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f19560c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f19561d = new int[10];

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19562a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19563b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19564c;

        public a(int i10, int i11, boolean z10) {
            this.f19562a = i10;
            this.f19563b = i11;
            this.f19564c = z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19565a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19566b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19567c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19568d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f19569e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f19570f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19571g;

        /* renamed from: h  reason: collision with root package name */
        public final int f19572h;

        /* renamed from: i  reason: collision with root package name */
        public final int f19573i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f19574j;

        public b(int i10, int i11, int i12, float f10, boolean z10, boolean z11, int i13, int i14, int i15, boolean z12) {
            this.f19565a = i10;
            this.f19566b = i11;
            this.f19567c = i12;
            this.f19568d = f10;
            this.f19569e = z10;
            this.f19570f = z11;
            this.f19571g = i13;
            this.f19572h = i14;
            this.f19573i = i15;
            this.f19574j = z12;
        }
    }

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f19560c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f19561d;
                    if (iArr.length <= i13) {
                        f19561d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f19561d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f19561d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.util.i.b b(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(byte[], int, int):com.fyber.inneractive.sdk.player.exoplayer2.util.i$b");
    }

    public static a a(byte[] bArr, int i10, int i11) {
        l lVar = new l(bArr, i10, i11);
        lVar.d(8);
        int d10 = lVar.d();
        int d11 = lVar.d();
        lVar.f();
        return new a(d10, d11, lVar.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0095, code lost:
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(byte[], int, int, boolean[]):int");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
