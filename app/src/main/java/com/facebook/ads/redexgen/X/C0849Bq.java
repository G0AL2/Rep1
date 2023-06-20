package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0849Bq {
    public static String[] A0M = {"ohCL8W0", "KQz7BMIeF4Z94D8gT8Jgt17pY9ay2sPb", "WHqc", "zdEVbBlbYLVxAkbZHAQvOg0x6UERU0KV", "RqBqTDSsJG3NS", "FmAwfgCi2dLCVzfY4ysR6r9BF", "Bq6occebnHk", "mWE0rLrmKK4IIqcH7c7itMEBPX65A8Us"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C0849Bq(int i10, int i11, float f10, float f11, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i10 / i12;
        this.A0K = i10 / DownloadResource.STATUS_BAD_REQUEST;
        this.A0I = i10 / 65;
        this.A0J = this.A0I * 2;
        int i13 = this.A0J;
        this.A0L = new short[i13];
        this.A0A = new short[i13 * i11];
        this.A0B = new short[i13 * i11];
        this.A0C = new short[i13 * i11];
    }

    private int A00(int i10) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, min);
        this.A09 -= min;
        return min;
    }

    private int A01(short[] sArr, int i10) {
        int A04;
        int i11;
        int i12 = this.A0H;
        int minP = i12 > 4000 ? i12 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
        if (this.A0G == 1 && minP == 1) {
            A04 = A04(sArr, i10, this.A0K, this.A0I);
        } else {
            A0E(sArr, i10, minP);
            A04 = A04(this.A0L, 0, this.A0K / minP, this.A0I / minP);
            if (minP != 1) {
                int i13 = A04 * minP;
                int i14 = i13 - (minP * 4);
                int minP2 = (minP * 4) + i13;
                int maxP = this.A0K;
                if (i14 < maxP) {
                    i14 = this.A0K;
                }
                int maxP2 = this.A0I;
                if (minP2 > maxP2) {
                    minP2 = this.A0I;
                }
                int i15 = this.A0G;
                if (A0M[2].length() != 4) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[7] = "JAo85nDeN7hM6ugSVwGhvUnreF2qbK1o";
                strArr[1] = "l4YUjJfL7ivyphsQmVZd9dZE6KXUcfPo";
                if (i15 == 1) {
                    A04 = A04(sArr, i10, i14, minP2);
                } else {
                    A0E(sArr, i10, 1);
                    if (A0M[2].length() != 4) {
                        A04 = A04(this.A0L, 0, i14, minP2);
                    } else {
                        String[] strArr2 = A0M;
                        strArr2[6] = "Av8EYvFT4XF";
                        strArr2[5] = "OBBgqqBYNHA95X1QZrayaR0nl";
                        A04 = A04(this.A0L, 0, i14, minP2);
                    }
                }
            }
        }
        if (A0F(this.A02, this.A01)) {
            i11 = this.A08;
        } else {
            i11 = A04;
        }
        this.A07 = this.A02;
        this.A08 = A04;
        return i11;
    }

    private int A02(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.A09 = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        this.A0B = A0G(this.A0B, this.A05, i11 + i12);
        int i13 = this.A0G;
        System.arraycopy(sArr, i10 * i13, this.A0B, this.A05 * i13, i13 * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        this.A05 += i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        this.A0B = A0G(this.A0B, this.A05, i12);
        A0C(i12, this.A0G, this.A0B, this.A05, sArr, i10, sArr, i10 + i11);
        this.A05 += i12;
        return i12;
    }

    private int A04(short[] sArr, int minDiff, int maxDiff, int period) {
        int diff = 0;
        int i10 = 255;
        int i11 = 1;
        int i12 = 0;
        int minDiff2 = minDiff * this.A0G;
        while (maxDiff <= period) {
            int i13 = 0;
            for (int i14 = 0; i14 < maxDiff; i14++) {
                i13 += Math.abs(sArr[minDiff2 + i14] - sArr[(minDiff2 + maxDiff) + i14]);
            }
            if (i13 * diff < i11 * maxDiff) {
                i11 = i13;
                diff = maxDiff;
            }
            if (i13 * i10 > i12 * maxDiff) {
                i12 = i13;
                i10 = maxDiff;
            }
            maxDiff++;
        }
        this.A02 = i11 / diff;
        this.A01 = i12 / i10;
        return diff;
    }

    private short A05(short[] sArr, int i10, int i11, int leftPosition) {
        short s10 = sArr[i10];
        short s11 = sArr[this.A0G + i10];
        int i12 = this.A04;
        int i13 = i12 * leftPosition;
        int i14 = (i12 + 1) * leftPosition;
        int width = i14 - (this.A03 * i11);
        int i15 = i14 - i13;
        return (short) (((width * s10) + ((i15 - width) * s11)) / i15);
    }

    private void A06() {
        int i10 = this.A05;
        float f10 = this.A0F;
        float f11 = this.A0D;
        float f12 = f10 / f11;
        float f13 = this.A0E * f11;
        if (f12 > 1.00001d || f12 < 0.99999d) {
            A07(f12);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f13 != 1.0f) {
            A08(f13, i10);
        }
    }

    private void A07(float f10) {
        if (this.A00 < this.A0J) {
            return;
        }
        int i10 = this.A00;
        int i11 = 0;
        do {
            if (this.A09 > 0) {
                i11 += A00(i11);
            } else {
                int A01 = A01(this.A0A, i11);
                if (f10 > 1.0d) {
                    i11 += A03(this.A0A, i11, f10, A01) + A01;
                } else {
                    i11 += A02(this.A0A, i11, f10, A01);
                }
            }
        } while (this.A0J + i11 <= i10);
        A0B(i11);
    }

    private void A08(float f10, int i10) {
        int i11;
        int i12;
        if (this.A05 == i10) {
            return;
        }
        int i13 = (int) (this.A0H / f10);
        int i14 = this.A0H;
        while (true) {
            if (i13 > 16384 || i14 > 16384) {
                i13 /= 2;
                if (A0M[0].length() != 7) {
                    break;
                }
                A0M[0] = "V4vENqc";
                i14 /= 2;
            } else {
                A09(i10);
                int i15 = 0;
                while (true) {
                    int i16 = this.A06;
                    int i17 = i16 - 1;
                    String[] strArr = A0M;
                    if (strArr[7].charAt(13) == strArr[1].charAt(13)) {
                        break;
                    }
                    String[] strArr2 = A0M;
                    strArr2[7] = "S0FZlq4hqR1MtwM4zltGGLcwqbHHLsP7";
                    strArr2[1] = "aAsnKYirvcv97dya3O8NjUmjHgDgPMP0";
                    if (i15 < i17) {
                        while (true) {
                            i11 = this.A04;
                            int i18 = (i11 + 1) * i13;
                            i12 = this.A03;
                            if (i18 <= i12 * i14) {
                                break;
                            }
                            this.A0B = A0G(this.A0B, this.A05, 1);
                            int i19 = 0;
                            while (true) {
                                int i20 = this.A0G;
                                if (i19 < i20) {
                                    this.A0B[(this.A05 * i20) + i19] = A05(this.A0C, (i20 * i15) + i19, i14, i13);
                                    i19++;
                                }
                            }
                            int i21 = this.A03;
                            this.A03 = i21 + 1;
                            this.A05++;
                        }
                        this.A04 = i11 + 1;
                        if (this.A04 == i14) {
                            this.A04 = 0;
                            IK.A04(i12 == i13);
                            this.A03 = 0;
                        }
                        i15++;
                    } else {
                        A0A(i16 - 1);
                        return;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        this.A0C = A0G(this.A0C, this.A06, i11);
        short[] sArr = this.A0B;
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, this.A0C, this.A06 * i12, i12 * i11);
        this.A05 = i10;
        this.A06 += i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i11 = this.A0G;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.A06 - i10) * i11);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        short[] sArr = this.A0A;
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int o10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < o10; i14++) {
            int i15 = (i11 * o10) + i14;
            int i16 = (i13 * o10) + i14;
            int i17 = (i12 * o10) + i14;
            for (int i18 = 0; i18 < i10; i18++) {
                sArr[i15] = (short) (((sArr2[i17] * (i10 - i18)) + (sArr3[i16] * i18)) / i10);
                i15 += o10;
                i17 += o10;
                i16 += o10;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        this.A0B = A0G(this.A0B, this.A05, i11);
        int i12 = this.A0G;
        System.arraycopy(sArr, i10 * i12, this.A0B, this.A05 * i12, i12 * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int samplesPerValue, int i10) {
        int i11 = this.A0J / i10;
        int i12 = this.A0G;
        int i13 = i12 * i10;
        int samplesPerValue2 = samplesPerValue * i12;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                i15 += sArr[(i14 * i13) + samplesPerValue2 + i16];
            }
            this.A0L[i14] = (short) (i15 / i13);
        }
    }

    private boolean A0F(int i10, int i11) {
        if (i10 == 0 || this.A08 == 0 || i11 > i10 * 3 || i10 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.A0G;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i12 * (((i13 * 3) / 2) + i11));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i10 = this.A00;
        float f10 = this.A0F;
        float f11 = this.A0D;
        float f12 = this.A0E * f11;
        float r10 = this.A06;
        int i11 = this.A05 + ((int) ((((i10 / (f10 / f11)) + r10) / f12) + 0.5f));
        this.A0A = A0G(this.A0A, this.A00, (this.A0J * 2) + i10);
        int i12 = 0;
        while (true) {
            int i13 = this.A0J;
            int i14 = this.A0G;
            if (i12 < i13 * 2 * i14) {
                short[] sArr = this.A0A;
                String[] strArr = A0M;
                if (strArr[7].charAt(13) == strArr[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[6] = "8uqTwc5xmM3";
                strArr2[5] = "8QSOBZmBR7CYVXHwBaCnC4p1f";
                sArr[(i14 * i10) + i12] = 0;
                i12++;
            } else {
                this.A00 += i13 * 2;
                A06();
                if (this.A05 > i11) {
                    this.A05 = i11;
                }
                this.A00 = 0;
                this.A09 = 0;
                this.A06 = 0;
                return;
            }
        }
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * min);
        this.A05 -= min;
        short[] sArr = this.A0B;
        int i10 = this.A0G;
        System.arraycopy(sArr, min * i10, sArr, 0, this.A05 * i10);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.A0G;
        int i11 = remaining / i10;
        this.A0A = A0G(this.A0A, this.A00, i11);
        shortBuffer.get(this.A0A, this.A00 * this.A0G, ((i10 * i11) * 2) / 2);
        this.A00 += i11;
        A06();
    }
}
