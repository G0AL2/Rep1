package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IO {
    public static byte[] A00;
    public static String[] A01 = {"7xLJJJjcPic97znxr7jYyKVhMaeA1j2E", "qlBokwmGez00tGn8Zoa7EPfSBX4wK2nd", "lNuywCj9LEYUa8avgu1fHofmnBtqXXwP", "QFj1OU4oR8zs4ROIl6ex9DnIWth", "MldRCxmPSCf85WqtCY5KHjt0bBRgqPbR", "RjpHJdGRFnKrV", "xTxTizoIhxSZQJal7HagUNUTtmhMrgov", "oiVBLQsg82rzAXMmQswhUJYEb9MEhzaa"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{5, 62, 35, 37, 32, 32, 63, 34, 36, 53, 52, 112, 49, 37, 52, 57, 63, 112, 63, 50, 58, 53, 51, 36, 112, 36, 41, 32, 53, 106, 112, 116, 79, 82, 84, 81, 81, 78, 83, 85, 68, 69, 1, 68, 81, 98, 78, 79, 71, 72, 70, 27, 1};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C1003Ii c1003Ii) {
        int A042 = c1003Ii.A04(5);
        if (A042 == 31) {
            return c1003Ii.A04(6) + 32;
        }
        return A042;
    }

    public static int A01(C1003Ii c1003Ii) {
        int A042 = c1003Ii.A04(4);
        if (A042 == 15) {
            int samplingFrequency = c1003Ii.A04(24);
            return samplingFrequency;
        } else if (A01[3].length() != 27) {
            throw new RuntimeException();
        } else {
            A01[5] = "Rl706moC1hxTN";
            IK.A03(A042 < 13);
            int samplingFrequency2 = A04[A042];
            return samplingFrequency2;
        }
    }

    public static Pair<Integer, Integer> A02(C1003Ii c1003Ii, boolean z10) throws C0813Af {
        int A002 = A00(c1003Ii);
        int channelConfiguration = A01(c1003Ii);
        int A042 = c1003Ii.A04(4);
        if (A002 == 5 || A002 == 29) {
            channelConfiguration = A01(c1003Ii);
            A002 = A00(c1003Ii);
            if (A002 == 22) {
                A042 = c1003Ii.A04(4);
            }
        }
        boolean z11 = true;
        if (z10) {
            if (A002 != 1 && A002 != 2 && A002 != 3 && A002 != 4 && A002 != 6 && A002 != 7 && A002 != 17) {
                switch (A002) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C0813Af(A04(0, 31, 122) + A002);
                }
            }
            A06(c1003Ii, A002, A042);
            if (A01[4].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            A01[7] = "vV2yfuq3D8MlByvyd0FSsWmE07MYRaiH";
            switch (A002) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int channelCount = c1003Ii.A04(2);
                    if (channelCount == 2 || channelCount == 3) {
                        throw new C0813Af(A04(31, 22, 11) + channelCount);
                    }
            }
        }
        int i10 = A03[A042];
        if (i10 == -1) {
            z11 = false;
        }
        IK.A03(z11);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(i10));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C0813Af {
        return A02(new C1003Ii(bArr), false);
    }

    public static void A06(C1003Ii c1003Ii, int i10, int i11) {
        c1003Ii.A08(1);
        if (c1003Ii.A0F()) {
            if (A01[5].length() != 13) {
                throw new RuntimeException();
            }
            A01[6] = "9ZbgWIK1Tjah9N2o7wCOkUZOiekVuClG";
            c1003Ii.A08(14);
        }
        boolean A0F = c1003Ii.A0F();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                c1003Ii.A08(3);
            }
            if (A0F) {
                if (i10 == 22) {
                    c1003Ii.A08(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    c1003Ii.A08(3);
                }
                c1003Ii.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, A02.length, i11);
        return bArr3;
    }
}
