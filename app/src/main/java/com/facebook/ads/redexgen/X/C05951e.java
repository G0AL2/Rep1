package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1e */
/* loaded from: assets/audience_network.dex */
public final class C05951e extends C3G implements InterfaceC0995Ia {
    public static byte[] A0E;
    public static String[] A0F = {"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final BS A0C;
    public final BY A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, 16, 102, 27, 13, 11, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, 14, 83, 64, 86, 24, 19, 26, 21, 21, 30, 23, 86, 24, 20, 14, 21, 15, 63, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, 31, 91, 92, 66, 71, 70, 31, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, 26, 13, 16, 25, 19, 11, 26};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C05951e(Context context, E6 e62, @Nullable CM<C1372Ww> cm, boolean z10, @Nullable Handler handler, @Nullable BT bt, @Nullable BE be2, BL... blArr) {
        this(context, e62, cm, z10, handler, bt, new X9(be2, blArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C05951e(Context context, E6 e62, @Nullable CM<C1372Ww> cm, boolean z10, @Nullable Handler handler, @Nullable BT bt, BY by) {
        super(1, e62, cm, z10);
        this.A0B = context.getApplicationContext();
        this.A0D = by;
        this.A0C = new BS(handler, bt);
        by.AEb(new X7(this));
    }

    private int A00(E0 e02, Format format) {
        PackageManager packageManager;
        if (C1020Iz.A02 < 24) {
            if (A04(15, 22, 30).equals(e02.A02)) {
                boolean z10 = true;
                if (C1020Iz.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null && packageManager.hasSystemFeature(A04(37, 25, 71))) {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(E0 e02, Format format, Format[] formatArr) {
        return A00(e02, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        EC.A06(mediaFormat, format.A0P);
        EC.A04(mediaFormat, A04(99, 14, 34), i10);
        if (C1020Iz.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6G = this.A0D.A6G(A8R());
        if (A6G != Long.MIN_VALUE) {
            if (!this.A08) {
                A6G = Math.max(this.A05, A6G);
            }
            this.A05 = A6G;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C1020Iz.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(C1020Iz.A05) && (C1020Iz.A03.startsWith(A04(143, 8, 111)) || C1020Iz.A03.startsWith(A04(84, 7, 71)) || C1020Iz.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = C0997Ic.A00(str);
        if (A00 != 0) {
            boolean A8Q = this.A0D.A8Q(A00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            A0F[1] = "OP";
            if (A8Q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A12() {
        try {
            this.A0D.ADm();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A13() {
        super.A13();
        this.A0D.ADE();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A15(long j10, boolean z10) throws AM {
        super.A15(j10, z10);
        this.A0D.reset();
        this.A05 = j10;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A16(boolean z10) throws AM {
        super.A16(z10);
        this.A0C.A05(this.A0U);
        int i10 = A11().A00;
        if (i10 != 0) {
            this.A0D.A5B(i10);
        } else {
            this.A0D.A4o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, E0 e02, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00cf, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00d7, code lost:
        if (r4.A0G(r17.A0C) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00db, code lost:
        if (r17.A05 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e3, code lost:
        if (r4.A0F(r17.A05) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00fa, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Incorrect condition in loop: B:98:0x0074 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ec  */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1B(com.facebook.ads.redexgen.X.E6 r15, com.facebook.ads.redexgen.X.CM<com.facebook.ads.redexgen.X.C1372Ww> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.X.E9 {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05951e.A1B(com.facebook.ads.redexgen.X.E6, com.facebook.ads.redexgen.X.CM, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final E0 A1E(E6 e62, Format format, boolean z10) throws E9 {
        E0 A79;
        if (A09(format.A0O) && (A79 = e62.A79()) != null) {
            return A79;
        }
        return super.A1E(e62, format, z10);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1H() throws AM {
        try {
            this.A0D.ADF();
        } catch (BX e10) {
            throw AM.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws AM {
        int i10;
        int[] iArr;
        int i11;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            i10 = C0997Ic.A00(mediaFormat2.getString(A04(113, 4, 59)));
            mediaFormat = this.A06;
        } else {
            i10 = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 107));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 26));
        if (this.A09 && integer == 6 && (i11 = this.A00) < 6) {
            iArr = new int[i11];
            for (int i12 = 0; i12 < this.A00; i12++) {
                iArr[i12] = i12;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A46(i10, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (BU e10) {
            throw AM.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AM {
        int i10;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 49).equals(format.A0O)) {
            i10 = format.A0A;
        } else {
            i10 = 2;
        }
        this.A04 = i10;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1M(X2 x22) {
        if (this.A07 && !x22.A03()) {
            if (Math.abs(x22.A00 - this.A05) > 500000) {
                this.A05 = x22.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(E0 e02, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(e02, format, A19());
        this.A09 = A08(e02.A02);
        this.A0A = e02.A04;
        MediaFormat A02 = A02(format, e02.A01 == null ? A04(62, 9, 49) : e02.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            this.A06.setString(A04(113, 4, 59), format.A0O);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j10, long j11) {
        this.A0C.A06(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1P(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws AM {
        if (this.A0A && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        } else if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A08++;
            this.A0D.A7y();
            return true;
        } else {
            try {
                if (this.A0D.A7v(byteBuffer, j12)) {
                    mediaCodec.releaseOutputBuffer(i10, false);
                    this.A0U.A06++;
                    return true;
                }
                return false;
            } catch (BV | BX e10) {
                throw AM.A01(e10, A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.XG
    public final InterfaceC0995Ia A6w() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final C0815Ah A7E() {
        return this.A0D.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final long A7H() {
        if (A7W() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.InterfaceC0825Ar
    public final void A7z(int i10, Object obj) throws AM {
        if (i10 != 2) {
            if (i10 != 3) {
                super.A7z(i10, obj);
                return;
            }
            this.A0D.AEU((BD) obj);
            return;
        }
        BY by = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0F[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        by.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return super.A8R() && this.A0D.A8R();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return this.A0D.A83() || super.A8c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final C0815Ah AEf(C0815Ah c0815Ah) {
        return this.A0D.AEf(c0815Ah);
    }
}
