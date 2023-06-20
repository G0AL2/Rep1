package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.inmobi.media.fq;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class W9 implements InterfaceC0879Di {
    public static byte[] A0D;
    public static String[] A0E = {"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0870Co A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final C0880Dj A0B = new C0880Dj(128);

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            A0E[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
            i13++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(C0880Dj c0880Dj, String str) {
        byte[] copyOf = Arrays.copyOf(c0880Dj.A02, c0880Dj.A00);
        int i10 = copyOf[4] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i11 = copyOf[5] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int firstByte = copyOf[6] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int aspectRatioCode = (i10 << 4) | (i11 >> 4);
        int width = i11 & 15;
        int i12 = (width << 8) | firstByte;
        float f10 = 1.0f;
        int i13 = (copyOf[7] & 240) >> 4;
        if (i13 != 2) {
            String[] strArr = A0E;
            String str2 = strArr[2];
            String str3 = strArr[5];
            int firstByte2 = str2.length();
            if (firstByte2 == str3.length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (i13 != 3) {
                    if (i13 == 4) {
                        int frameRateExtensionN = i12 * 121;
                        float f11 = frameRateExtensionN;
                        int frameRateExtensionN2 = aspectRatioCode * 100;
                        f10 = f11 / frameRateExtensionN2;
                    }
                } else {
                    int frameRateExtensionN3 = i12 * 16;
                    float f12 = frameRateExtensionN3;
                    int frameRateExtensionN4 = aspectRatioCode * 9;
                    f10 = f12 / frameRateExtensionN4;
                }
            }
            throw new RuntimeException();
        }
        float pixelWidthHeightRatio = aspectRatioCode * 3;
        f10 = (i12 * 4) / pixelWidthHeightRatio;
        Format A03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i12, -1.0f, Collections.singletonList(copyOf), -1, f10, null);
        long j10 = 0;
        int i14 = (copyOf[7] & 15) - 1;
        if (i14 >= 0) {
            double[] dArr = A0F;
            int frameRateCodeMinusOne = dArr.length;
            if (i14 < frameRateCodeMinusOne) {
                double d10 = dArr[i14];
                int i15 = c0880Dj.A01;
                int sequenceExtensionPosition = i15 + 9;
                int i16 = (copyOf[sequenceExtensionPosition] & 96) >> 5;
                int i17 = i15 + 9;
                if (A0E[1].length() == 23) {
                    A0E[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int height = copyOf[i17] & 31;
                    if (i16 != height) {
                        double frameRate = i16;
                        int firstByte3 = height + 1;
                        d10 *= (frameRate + 1.0d) / firstByte3;
                    }
                    j10 = (long) (1000000.0d / d10);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(A03, Long.valueOf(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r21.A07 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r21.A05.AEH(r21.A03, r21.A09 ? 1 : 0, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
        r21.A03 = r2;
        r21.A09 = false;
        r21.A01 = r4;
        r21.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
        if (r21.A0A == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
        if (r3 != false) goto L40;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A48(com.facebook.ads.redexgen.X.C1004Ij r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W9.A48(com.facebook.ads.redexgen.X.Ij):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A06 = c0893Dw.A04();
        this.A05 = interfaceC0862Ce.AFD(c0893Dw.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        C1000If.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
