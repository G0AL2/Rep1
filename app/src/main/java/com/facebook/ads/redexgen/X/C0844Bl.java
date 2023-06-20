package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0844Bl {
    public static byte[] A00;
    public static String[] A01 = {"LkGuYUivH3Ie1Im5DPbpjiI8Q8YTXvDH", "1PwPqA1AQPAmdWryNsV6sN6X26rPkCjW", "ZqXwAcmmJts9Z3eghrFogO2ZvZ2KPTjy", "VVFX", "itVzmaW23y4JHLkTkKw9c3", "4is91i25oXLwO1hEL45hwpUW49QZoS4h", "3tDKTkvCK0hS9Fm4lJL5mZYVdrHZzDGh", "0qkAcrqD1J7f8hfbi9Oz77lQGDa0et74"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{119, 99, 114, Byte.MAX_VALUE, 121, 57, 96, 120, 114, 56, 114, 98, 101};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, DownloadResource.STATUS_RUNNING, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int i10;
        int nblks = byteBuffer.position();
        byte b10 = byteBuffer.get(nblks);
        if (b10 == -2) {
            i10 = ((byteBuffer.get(nblks + 5) & 1) << 6) | ((byteBuffer.get(nblks + 4) & 252) >> 2);
        } else if (b10 == -1) {
            i10 = ((byteBuffer.get(nblks + 4) & 7) << 4) | ((byteBuffer.get(nblks + 7) & 60) >> 2);
        } else if (b10 != 31) {
            i10 = ((byteBuffer.get(nblks + 4) & 1) << 6) | ((byteBuffer.get(nblks + 5) & 252) >> 2);
        } else {
            i10 = ((byteBuffer.get(nblks + 5) & 7) << 4) | ((byteBuffer.get(nblks + 6) & 60) >> 2);
        }
        return (i10 + 1) * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        int fsize = 0;
        byte b10 = bArr[0];
        if (b10 == -2) {
            i10 = (((bArr[4] & 3) << 12) | ((bArr[7] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr[6] & 240) >> 4)) + 1;
        } else if (b10 == -1) {
            i10 = (((bArr[7] & 3) << 12) | ((bArr[6] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr[9] & 60) >> 2)) + 1;
            fsize = 1;
        } else if (b10 != 31) {
            i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr[7] & 240) >> 4)) + 1;
        } else {
            i10 = (((bArr[6] & 3) << 12) | ((bArr[7] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr[8] & 60) >> 2)) + 1;
            fsize = 1;
        }
        return fsize != 0 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        byte b10 = bArr[0];
        if (b10 == -2) {
            i10 = ((bArr[5] & 1) << 6) | ((bArr[4] & 252) >> 2);
        } else if (A01[4].length() == 20) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[2] = "EqLnRlbAIvqb7JmhHHjyb9MWmtPppsRr";
            strArr[7] = "wqmF86kNtSHy9CpxzvQffLVgP6PIYafb";
            if (b10 == -1) {
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
            } else if (b10 != 31) {
                i10 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
            } else {
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
            }
        }
        int i11 = (i10 + 1) * 32;
        String[] strArr2 = A01;
        if (strArr2[2].charAt(1) != strArr2[7].charAt(1)) {
            return i11;
        }
        String[] strArr3 = A01;
        strArr3[1] = "0BUMWBHFUBXEmf7IWFiBpaLqqarBLbVJ";
        strArr3[6] = "IXHZH24RcLqKyQXeo23FKYJCWT4dHCob";
        return i11;
    }

    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i10;
        C1003Ii A042 = A04(bArr);
        A042.A08(60);
        int i11 = A02[A042.A04(6)];
        int i12 = A03[A042.A04(4)];
        int rate = A042.A04(5);
        int[] iArr = A04;
        if (rate >= iArr.length) {
            i10 = -1;
        } else {
            int bitrate = iArr[rate];
            i10 = (bitrate * 1000) / 2;
        }
        A042.A08(10);
        int bitrate2 = A042.A04(2);
        int bitrate3 = bitrate2 > 0 ? 1 : 0;
        return Format.A07(str, A05(0, 13, 1), null, i10, -1, i11 + bitrate3, i12, null, drmInitData, 0, str2);
    }

    public static C1003Ii A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C1003Ii(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte temp = copyOf[i10];
                copyOf[i10] = copyOf[i10 + 1];
                copyOf[i10 + 1] = temp;
            }
        }
        C1003Ii c1003Ii = new C1003Ii(copyOf);
        if (copyOf[0] == 31) {
            C1003Ii c1003Ii2 = new C1003Ii(copyOf);
            while (true) {
                int A012 = c1003Ii2.A01();
                if (A01[5].charAt(2) == 'T') {
                    throw new RuntimeException();
                }
                A01[4] = "1c365Ndi9m7qeJPJDL";
                if (A012 < 16) {
                    break;
                }
                c1003Ii2.A08(2);
                c1003Ii.A0A(c1003Ii2.A04(14), 14);
            }
        }
        c1003Ii.A0B(copyOf);
        return c1003Ii;
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
