package com.facebook.ads.redexgen.X;

import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Ci {
    public static byte[] A07;
    public static String[] A08 = {"nifcRfbON53gzILOru2Jo77QmnI", "", "YclbigHQdqatdiMMFtmKc8uyfonoIz5d", "Fd6hY4xBxF4WCtFqE3EitLo6QTPCTd6g", "7NOpBqgVdvht54TmD9wxn6mxDDhXMYkr", "z0qKCLYmn7ETA7vnAfdm8yGWNV", "FyibQKYxxp5WU6WV5DKbmcaitux", "b6Jzn18op"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-25, -5, -22, -17, -11, -75, -13, -10, -21, -19, 20, 40, 23, 28, 34, -30, 32, 35, 24, 26, -32, -1, -28, 0, 20, 3, 8, 14, -50, 12, 15, 4, 6, -52, -21, -47};
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 78), A01(23, 13, 58), A01(0, 10, 33)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 288, 320, 352, 384, DownloadConnection.HTTP_REQUESTED_RANGE_NOT_SATISFIABLE, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, DownloadResource.STATUS_RUNNING, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int version) {
        int samplingRateIndex;
        int padding;
        int i10;
        int i11;
        int samplingRate;
        if ((version & (-2097152)) != -2097152 || (samplingRateIndex = (version >>> 19) & 3) == 1 || (padding = (version >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = version >>> 12;
        if (A08[1].length() == 0) {
            A08[3] = "b2l2aaEsQdCjJRobZM3AI6pzp0fCTcXg";
            int i13 = i12 & 15;
            if (i13 == 0 || i13 == 15 || (i10 = (version >>> 10) & 3) == 3) {
                return -1;
            }
            int i14 = A0E[i10];
            if (samplingRateIndex == 2) {
                i14 /= 2;
            } else if (samplingRateIndex == 0) {
                i14 /= 4;
            }
            int i15 = (version >>> 9) & 1;
            if (padding == 3) {
                if (samplingRateIndex == 3) {
                    int samplingRate2 = i13 - 1;
                    samplingRate = A09[samplingRate2];
                } else {
                    int samplingRate3 = i13 - 1;
                    samplingRate = A0D[samplingRate3];
                }
                int padding2 = samplingRate * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES;
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[0];
                int bitrate = str.length();
                int samplingRate4 = str2.length();
                if (bitrate != samplingRate4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "oe92MVCyaQQCtYlB63NB1CxE35U7HQE5";
                strArr2[2] = "cgh7vNrWE365WSGkm1qsPTYGoGRnPBar";
                int samplingRate5 = ((padding2 / i14) + i15) * 4;
                return samplingRate5;
            }
            if (samplingRateIndex == 3) {
                if (padding == 2) {
                    int samplingRate6 = i13 - 1;
                    i11 = A0A[samplingRate6];
                } else {
                    int samplingRate7 = i13 - 1;
                    i11 = A0B[samplingRate7];
                }
            } else {
                int[] iArr = A0C;
                String[] strArr3 = A08;
                String str3 = strArr3[6];
                String str4 = strArr3[0];
                int length = str3.length();
                int samplingRate8 = str4.length();
                if (length != samplingRate8) {
                    String[] strArr4 = A08;
                    strArr4[7] = "UFIEXEz4g";
                    strArr4[5] = "u6DSTaNAwdJldo1ZeFLEjMNQPO";
                    int samplingRate9 = i13 - 1;
                    i11 = iArr[samplingRate9];
                } else {
                    A08[3] = "uh43YA7kDZkFV42L4FFbPgJOsOuCYlNO";
                    int samplingRate10 = i13 - 1;
                    i11 = iArr[samplingRate10];
                }
            }
            String[] strArr5 = A08;
            String str5 = strArr5[4];
            String str6 = strArr5[2];
            int charAt = str5.charAt(29);
            int samplingRate11 = str6.charAt(29);
            if (charAt != samplingRate11) {
                String[] strArr6 = A08;
                strArr6[7] = "EFM751Hfm";
                strArr6[5] = "lrmHfueLLigjg4doS9Ay4icuU4";
                if (samplingRateIndex == 3) {
                    return ((144000 * i11) / i14) + i15;
                }
                return (((padding == 1 ? 72000 : 144000) * i11) / i14) + i15;
            }
        }
        throw new RuntimeException();
    }

    private void A03(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.A05 = i10;
        this.A06 = str;
        this.A02 = i11;
        this.A03 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A04 = i15;
    }

    public static boolean A04(int version, Ci ci) {
        int i10;
        int bitrate;
        int bitrateIndex;
        int i11;
        int bitrateIndex2;
        int i12;
        int i13;
        if ((version & (-2097152)) != -2097152 || (i10 = (version >>> 19) & 3) == 1 || (bitrate = (version >>> 17) & 3) == 0 || (bitrateIndex = (version >>> 12) & 15) == 0 || bitrateIndex == 15 || (i11 = (version >>> 10) & 3) == 3) {
            return false;
        }
        int samplesPerFrame = A0E[i11];
        if (i10 == 2) {
            samplesPerFrame /= 2;
        } else if (i10 == 0) {
            samplesPerFrame /= 4;
        }
        int samplingRateIndex = version >>> 9;
        int i14 = samplingRateIndex & 1;
        if (bitrate == 3) {
            if (i10 == 3) {
                int[] iArr = A09;
                int i15 = bitrateIndex - 1;
                int padding = A08[1].length();
                if (padding != 0) {
                    throw new RuntimeException();
                }
                A08[1] = "";
                bitrateIndex2 = iArr[i15];
            } else {
                int samplingRateIndex2 = bitrateIndex - 1;
                bitrateIndex2 = A0D[samplingRateIndex2];
            }
            int samplingRateIndex3 = bitrateIndex2 * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES;
            i13 = ((samplingRateIndex3 / samplesPerFrame) + i14) * 4;
            i12 = 384;
        } else {
            if (i10 == 3) {
                if (bitrate == 2) {
                    int samplingRateIndex4 = bitrateIndex - 1;
                    bitrateIndex2 = A0A[samplingRateIndex4];
                } else {
                    int samplingRateIndex5 = bitrateIndex - 1;
                    bitrateIndex2 = A0B[samplingRateIndex5];
                }
                i12 = 1152;
                i13 = ((144000 * bitrateIndex2) / samplesPerFrame) + i14;
            } else {
                int samplingRateIndex6 = bitrateIndex - 1;
                bitrateIndex2 = A0C[samplingRateIndex6];
                i12 = bitrate == 1 ? 576 : 1152;
                i13 = (((bitrate == 1 ? 72000 : 144000) * bitrateIndex2) / samplesPerFrame) + i14;
            }
        }
        int frameSize = 3 - bitrate;
        String str = A0F[frameSize];
        int frameSize2 = version >> 6;
        ci.A03(i10, str, i13, samplesPerFrame, (frameSize2 & 3) == 3 ? 1 : 2, bitrateIndex2 * 1000, i12);
        return true;
    }
}
