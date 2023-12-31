package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class D8 {
    public static byte[] A00;
    public static String[] A01 = {"vNU1Clptty9spXV3rmNWKqfECA0GCDno", "yQl7wYGB6utTXxK398wXXYrAeYZNPLId", "BVcq1q5Q", "NihUY4HxpsM0GkJJgFchlTfxDOIJFYzw", "lx4TwpHGLs68", "XI1Xq2FkjwcQfgB5bw70GFmYpaxAyyjl", "uRZmXRdJsodI", "Cygx2J1H2ENb6XLRYlHXnR1vUW4XHHOP"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{49, 37, 119, 106, 114, 102, 110, 115, 110, 115, 108, 88, 102, 114, 117, 113, 106, 120, 70, 121, 89, 110, 114, 106, 120, 121, 102, 114, 117, 73, 106, 113, 121, 102, 37, -112, -124, -42, -55, -47, -59, -51, -46, -51, -46, -53, -73, -59, -47, -44, -48, -55, -41, -83, -46, -89, -52, -39, -46, -49, -124, 71, 59, -115, Byte.MIN_VALUE, -120, 124, -124, -119, -124, -119, -126, 111, -124, -120, Byte.MIN_VALUE, -114, -113, 124, -120, -117, 95, Byte.MIN_VALUE, -121, -113, 124, 94, -125, 124, -119, -126, Byte.MIN_VALUE, -114, 59, -110, 120, -54, -67, -59, -71, -63, -58, -63, -58, -65, -85, -47, -58, -69, -64, -54, -57, -58, -63, -46, -71, -52, -63, -57, -58, -85, -71, -59, -56, -60, -67, -53, 120, 100, -105, -110, -112, 115, -124, -107, -106, -120, -107, -106, -76, -46, -39, -38, -35, -44, -39, -46, -117, -48, -49, -44, -33, -117, -41, -44, -34, -33, -91, -117, -48, -49, -44, -33, -117, -49, -38, -48, -34, -117, -39, -38, -33, -117, -34, -33, -52, -35, -33, -117, -30, -44, -33, -45, -117, -52, -117, -34, -28, -39, -50, -117, -34, -52, -40, -37, -41, -48, -103, -110, -73, -84, -72, -73, -68, -78, -68, -67, -82, -73, -67, 105, -68, -67, -85, -75, 105, -85, -72, -63, 105, -81, -72, -69, 105, -67, -69, -86, -84, -76, 105, 117, -109, -126, -124, -116, 65, -119, -126, -108, 65, -113, -112, 65, -108, -126, -114, -111, -115, -122, 65, -107, -126, -125, -115, -122, 65, -108, -118, -101, -122, 65, -118, -113, -121, -112, -109, -114, -126, -107, -118, -112, -113, -120, -95, -90, -88, -93, -93, -94, -91, -89, -104, -105, 83, -96, -104, -105, -100, -108, 83, -91, -108, -89, -104, 97, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -13, -13, -20, -21, -86, -9, -20, -21, -90, -75, -75, -79, -82, -88, -90, -71, -82, -76, -77, 116, -67, 114, -88, -90, -78, -86, -73, -90, 114, -78, -76, -71, -82, -76, -77, -78, -63, -63, -67, -70, -76, -78, -59, -70, -64, -65, Byte.MIN_VALUE, -55, 126, -66, -63, -123, 126, -76, -74, -78, 126, -121, -127, -119, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -77, -74, 122, 115, -68, -70, -70, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -85, -81, -93, -99, -91, -82, -93, -89, -97, 103, -82, -78, 109, -95, 124, -112, Byte.MAX_VALUE, -124, -118, 74, 78, -126, -117, -117, -126, -106, -123, -118, -112, 80, -126, -124, 84, -69, -49, -66, -61, -55, -119, -69, -58, -69, -67, -33, -13, -30, -25, -19, -83, -33, -21, -16, -85, -11, -32, 107, Byte.MAX_VALUE, 110, 115, 121, 57, 111, 107, 109, 61, -109, -89, -106, -101, -95, 97, -97, -94, 102, -109, 95, -98, -109, -90, -97, -65, -45, -62, -57, -51, -115, -53, -50, -61, -59, -68, -48, -65, -60, -54, -118, -51, -68, -46, -94, -74, -91, -86, -80, 112, -73, -81, -91, 111, -91, -75, -76, -87, -67, -84, -79, -73, 119, -66, -74, -84, 118, -84, -68, -69, 118, -80, -84, 109, -127, 112, 117, 123, 59, -126, 122, 112, 58, 112, Byte.MIN_VALUE, Byte.MAX_VALUE, 58, 116, 112, 71, 124, 126, 123, 114, 117, 120, 113, 73, 120, 110, 126, -119, -120, -119, 87, -32, -33, -32, -16, -124, -122, -113, -124, -43, -41, -32, -27, -110, -105, -104, -101, -109, 112, -93, -98, -100, -126, -104, -87, -108, 79, -94, -105, -98, -92, -101, -109, 79, -111, -108, 79, -97, -98, -94, -104, -93, -104, -91, -108, 101, 110, 101, 114, -119, -107, -112, -124, 67, -124, -105, -110, -112, 67, -116, -106, 67, -112, -124, -111, -121, -124, -105, -110, -107, -100, -50, -58, -43, -62, -100, -117, -99, -107, -99, -115, -110, -109, 74, -117, -98, -103, -105, 74, -109, -99, 74, -105, -117, -104, -114, -117, -98, -103, -100, -93, -51, -55, -49, -56, -108, -106, -125, -107, -59, -74, -65, -76, 113, -78, -59, -64, -66, 113, -70, -60, 113, -66, -78, -65, -75, -78, -59, -64, -61, -54, -48, -63, -44, -48, -39, -52, -57, -56, -77, -90, -95, -94, -84, 108, 112, -92, -83, -83, -52, -65, -70, -69, -59, -123, -73, -52, -71, -14, -27, -32, -31, -21, -85, -28, -31, -14, -33, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 85, -86, -99, -104, -103, -93, 99, -84, 97, -86, -94, -104, 98, -93, -94, 102, 98, -86, -92, 109};
    }

    static {
        A0J();
        A08 = C1020Iz.A08(A0I(696, 4, 97));
        A05 = C1020Iz.A08(A0I(662, 4, 88));
        A07 = C1020Iz.A08(A0I(692, 4, 90));
        A04 = C1020Iz.A08(A0I(636, 4, 39));
        A06 = C1020Iz.A08(A0I(TTAdConstant.STYLE_SIZE_RADIO_2_3, 4, 31));
        A02 = C1020Iz.A08(A0I(IronSourceError.ERROR_BN_LOAD_NO_FILL, 4, 0));
        A03 = C1020Iz.A08(A0I(632, 4, 95));
    }

    public static float A00(C1004Ij c1004Ij, int i10) {
        c1004Ij.A0Y(i10 + 8);
        return c1004Ij.A0H() / c1004Ij.A0H();
    }

    public static int A01(C1004Ij c1004Ij) {
        int size = c1004Ij.A0E();
        int i10 = size & 127;
        while ((size & 128) == 128) {
            size = c1004Ij.A0E();
            i10 = (i10 << 7) | (size & 127);
        }
        return i10;
    }

    public static int A02(C1004Ij c1004Ij) {
        c1004Ij.A0Y(16);
        int A082 = c1004Ij.A08();
        if (A082 == A05) {
            return 1;
        }
        int trackType = A08;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "sACqbdB9h4ZaSOP8RBXRhKf5pkODD9Ze";
        strArr[5] = "nfjFHkgcUdXk9ZZxpn0R0spMdbOfBjgH";
        if (A082 == trackType) {
            return 2;
        }
        if (A082 != A07 && A082 != A04 && A082 != A06 && A082 != A02) {
            if (A082 == A03) {
                return 4;
            }
            return -1;
        }
        String[] strArr2 = A01;
        if (strArr2[4].length() != strArr2[6].length()) {
            return 3;
        }
        String[] strArr3 = A01;
        strArr3[0] = "HjSYihfmO4Fjwo0SJsN86rpcIq24412o";
        strArr3[5] = "nDlBCf5sAdyqWE5fn1qZlgrWKnIrwKiA";
        return 3;
    }

    public static int A03(C1004Ij c1004Ij, int i10, int i11) {
        int A062 = c1004Ij.A06();
        while (A062 - i10 < i11) {
            c1004Ij.A0Y(A062);
            int A082 = c1004Ij.A08();
            IK.A05(A082 > 0, A0I(574, 32, 45));
            if (c1004Ij.A08() == D3.A0S) {
                return A062;
            }
            A062 += A082;
        }
        return -1;
    }

    public static long A04(C1004Ij c1004Ij) {
        int fullAtom = 8;
        c1004Ij.A0Y(8);
        int version = D3.A01(c1004Ij.A08());
        if (version != 0) {
            fullAtom = 16;
        }
        c1004Ij.A0Z(fullAtom);
        return c1004Ij.A0M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<long[], long[]> A05(com.facebook.ads.redexgen.X.C1350Wa r9) {
        /*
            if (r9 == 0) goto La
            int r0 = com.facebook.ads.redexgen.X.D3.A0O
            com.facebook.ads.redexgen.X.WZ r0 = r9.A07(r0)
            if (r0 != 0) goto L10
        La:
            r0 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r0)
            return r0
        L10:
            com.facebook.ads.redexgen.X.Ij r8 = r0.A00
            r0 = 8
            r8.A0Y(r0)
            int r0 = r8.A08()
            int r7 = com.facebook.ads.redexgen.X.D3.A01(r0)
            int r6 = r8.A0H()
            long[] r5 = new long[r6]
            long[] r4 = new long[r6]
            r3 = 0
        L28:
            if (r3 >= r6) goto L6d
            r9 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D8.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L3e
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            java.lang.String r1 = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn"
            r0 = 3
            r2[r0] = r1
            if (r7 != r9) goto L68
            long r0 = r8.A0N()
        L4b:
            r5[r3] = r0
            if (r7 != r9) goto L62
            long r0 = r8.A0L()
        L53:
            r4[r3] = r0
            short r0 = r8.A0U()
            if (r0 != r9) goto L86
            r0 = 2
            r8.A0Z(r0)
            int r3 = r3 + 1
            goto L28
        L62:
            int r0 = r8.A08()
            long r0 = (long) r0
            goto L53
        L68:
            long r0 = r8.A0M()
            goto L4b
        L6d:
            android.util.Pair r3 = android.util.Pair.create(r5, r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L96
            goto L38
        L86:
            r2 = 272(0x110, float:3.81E-43)
            r1 = 23
            r0 = 49
            java.lang.String r1 = A0I(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L96:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            java.lang.String r1 = "0OgbcJvER11tVuU6ktzS5zcploLwLpnU"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "Fpvfvil3v0kwqlJSCQAnqVBmdIeuMsHJ"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A05(com.facebook.ads.redexgen.X.Wa):android.util.Pair");
    }

    public static Pair<Long, String> A06(C1004Ij c1004Ij) {
        c1004Ij.A0Y(8);
        int A012 = D3.A01(c1004Ij.A08());
        int version = A012 == 0 ? 8 : 16;
        c1004Ij.A0Z(version);
        long A0M = c1004Ij.A0M();
        int fullAtom = A012 == 0 ? 4 : 8;
        c1004Ij.A0Z(fullAtom);
        int A0I = c1004Ij.A0I();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0I(0, 0, 122));
        int version2 = A0I >> 10;
        sb2.append((char) ((version2 & 31) + 96));
        int version3 = A0I >> 5;
        sb2.append((char) ((version3 & 31) + 96));
        int version4 = A0I & 31;
        sb2.append((char) (version4 + 96));
        return Pair.create(Long.valueOf(A0M), sb2.toString());
    }

    public static Pair<String, byte[]> A07(C1004Ij c1004Ij, int i10) {
        c1004Ij.A0Y(i10 + 8 + 4);
        c1004Ij.A0Z(1);
        A01(c1004Ij);
        c1004Ij.A0Z(2);
        int A0E = c1004Ij.A0E();
        int flags = A0E & 128;
        if (flags != 0) {
            c1004Ij.A0Z(2);
        }
        int flags2 = A0E & 64;
        if (flags2 != 0) {
            int flags3 = c1004Ij.A0I();
            c1004Ij.A0Z(flags3);
        }
        int flags4 = A0E & 32;
        if (flags4 != 0) {
            c1004Ij.A0Z(2);
        }
        c1004Ij.A0Z(1);
        A01(c1004Ij);
        int A0E2 = c1004Ij.A0E();
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[5];
        int charAt = str.charAt(2);
        int flags5 = str2.charAt(2);
        if (charAt != flags5) {
            String[] strArr2 = A01;
            strArr2[4] = "ipSJ7rerSzX8";
            strArr2[6] = "rVXKHnYgOQNY";
            String A032 = C0997Ic.A03(A0E2);
            String mimeType = A0I(482, 10, 92);
            if (!mimeType.equals(A032)) {
                String mimeType2 = A0I(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, 13, 63);
                if (!mimeType2.equals(A032)) {
                    String mimeType3 = A0I(IronSourceConstants.INIT_COMPLETE, 16, 70);
                    if (!mimeType3.equals(A032)) {
                        c1004Ij.A0Z(12);
                        c1004Ij.A0Z(1);
                        int A012 = A01(c1004Ij);
                        byte[] bArr = new byte[A012];
                        c1004Ij.A0c(bArr, 0, A012);
                        return Pair.create(A032, bArr);
                    }
                }
            }
            Pair<String, byte[]> create = Pair.create(A032, null);
            if (A01[3].charAt(8) != 'p') {
                return create;
            }
            String[] strArr3 = A01;
            strArr3[1] = "09LVPMUcXpQFix5jag1XMCG3MLP6JHGE";
            strArr3[7] = "l6DCOVwnZaQMuPJJN9SXx5QHr45WFHuE";
            return create;
        }
        throw new RuntimeException();
    }

    public static Pair<Integer, DP> A08(C1004Ij c1004Ij, int schemeInformationBoxPosition, int schemeInformationBoxSize) {
        int i10 = schemeInformationBoxPosition + 8;
        int i11 = -1;
        int childAtomSize = 0;
        String str = null;
        Integer num = null;
        while (true) {
            int i12 = i10 - schemeInformationBoxPosition;
            if (A01[3].charAt(8) != 'p') {
                throw new RuntimeException();
            }
            A01[2] = "AMwqROlZ";
            if (i12 < schemeInformationBoxSize) {
                c1004Ij.A0Y(i10);
                int A082 = c1004Ij.A08();
                int A083 = c1004Ij.A08();
                if (A083 == D3.A0T) {
                    num = Integer.valueOf(c1004Ij.A08());
                } else if (A083 == D3.A0z) {
                    c1004Ij.A0Z(4);
                    str = c1004Ij.A0S(4);
                } else if (A083 == D3.A0y) {
                    i11 = i10;
                    childAtomSize = A082;
                }
                i10 += A082;
            } else if (A0I(566, 4, 31).equals(str) || A0I(558, 4, 36).equals(str) || A0I(570, 4, 112).equals(str) || A0I(TTAdConstant.STYLE_SIZE_RADIO_9_16, 4, 123).equals(str)) {
                boolean z10 = true;
                IK.A05(num != null, A0I(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, 22, 33));
                IK.A05(i11 != -1, A0I(640, 22, 40));
                DP A0D = A0D(c1004Ij, i11, childAtomSize, str);
                if (A0D == null) {
                    z10 = false;
                }
                IK.A05(z10, A0I(670, 22, 79));
                return Pair.create(num, A0D);
            } else {
                return null;
            }
        }
    }

    public static Pair<Integer, DP> A09(C1004Ij c1004Ij, int i10, int i11) {
        Pair<Integer, DP> A082;
        int A062 = c1004Ij.A06();
        while (A062 - i10 < i11) {
            c1004Ij.A0Y(A062);
            int A083 = c1004Ij.A08();
            IK.A05(A083 > 0, A0I(574, 32, 45));
            if (c1004Ij.A08() == D3.A13 && (A082 = A08(c1004Ij, A062, A083)) != null) {
                return A082;
            }
            A062 += A083;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r7 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A0v) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A0w) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A0a) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A03) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r3 = com.facebook.ads.redexgen.X.D3.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (com.facebook.ads.redexgen.X.D8.A01[3].charAt(8) == 'p') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        com.facebook.ads.redexgen.X.D8.A01[2] = "qFwSWgIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
        if (r7 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
        com.facebook.ads.redexgen.X.D8.A01[3] = "CalJSZVBpFQrcbMBJJxLaxIn8rHUlaUl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0116, code lost:
        if (r7 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
        if (r7 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
        r3 = com.facebook.ads.redexgen.X.D3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (com.facebook.ads.redexgen.X.D8.A01[2].length() == 8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
        r2 = com.facebook.ads.redexgen.X.D8.A01;
        r2[0] = "Ao0TD4kH2iK3OLyPM25FC6RmFi2h7I9b";
        r2[5] = "OuNutSfPZXXgacWVKzm9oLRb1otwM5q4";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:
        if (r7 == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
        r3 = com.facebook.ads.redexgen.X.D3.A1O;
        r2 = com.facebook.ads.redexgen.X.D8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
        if (r2[1].charAt(19) == r2[7].charAt(19)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0162, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
        r2 = com.facebook.ads.redexgen.X.D8.A01;
        r2[0] = "AIk7lRaJ8E5MijNPplfsCP53DjqDD31L";
        r2[5] = "UZtf95QrnIyEi2GPpmv3pYGFcGVBr3II";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016f, code lost:
        if (r7 == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0173, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A1W) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
        if (r7 == com.facebook.ads.redexgen.X.D3.A18) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
        if (r7 != com.facebook.ads.redexgen.X.D3.A09) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017d, code lost:
        r6 = r6;
        r8 = r8;
        r9 = r9;
        A0L(r6, r7, r8, r9, r25, r27, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
        if (r7 != com.facebook.ads.redexgen.X.D3.A0A) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018d, code lost:
        r7 = java.lang.Integer.toString(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
        if (com.facebook.ads.redexgen.X.D8.A01[2].length() == 8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b2, code lost:
        r2 = com.facebook.ads.redexgen.X.D8.A01;
        r2[4] = "I4VfvCwCFlYX";
        r2[6] = "JqrGNuQTdpXg";
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.D6 A0A(com.facebook.ads.redexgen.X.C1004Ij r24, int r25, int r26, java.lang.String r27, com.facebook.ads.internal.exoplayer2.drm.DrmInitData r28, boolean r29) throws com.facebook.ads.redexgen.X.C0813Af {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0A(com.facebook.ads.redexgen.X.Ij, int, int, java.lang.String, com.facebook.ads.internal.exoplayer2.drm.DrmInitData, boolean):com.facebook.ads.redexgen.X.D6");
    }

    public static D7 A0B(C1004Ij c1004Ij) {
        long A0M;
        int a11;
        c1004Ij.A0Y(8);
        int a00 = D3.A01(c1004Ij.A08());
        int version = a00 == 0 ? 8 : 16;
        c1004Ij.A0Z(version);
        int A082 = c1004Ij.A08();
        c1004Ij.A0Z(4);
        int i10 = 1;
        int A062 = c1004Ij.A06();
        int fullAtom = a00 == 0 ? 4 : 8;
        int a01 = 0;
        while (true) {
            if (a01 >= fullAtom) {
                break;
            }
            int version2 = A062 + a01;
            if (c1004Ij.A00[version2] != -1) {
                i10 = 0;
                break;
            }
            a01++;
        }
        if (i10 != 0) {
            c1004Ij.A0Z(fullAtom);
            A0M = -9223372036854775807L;
        } else {
            A0M = a00 == 0 ? c1004Ij.A0M() : c1004Ij.A0N();
            int fixedOne = (A0M > 0L ? 1 : (A0M == 0L ? 0 : -1));
            if (fixedOne == 0) {
                A0M = -9223372036854775807L;
            }
        }
        c1004Ij.A0Z(16);
        int fullAtom2 = c1004Ij.A08();
        int a002 = c1004Ij.A08();
        c1004Ij.A0Z(4);
        int trackId = c1004Ij.A08();
        int durationPosition = c1004Ij.A08();
        if (fullAtom2 == 0 && a002 == 65536) {
            int fixedOne2 = -Constants.MIN_PROGRESS_STEP;
            if (trackId == fixedOne2 && durationPosition == 0) {
                a11 = 90;
                return new D7(A082, A0M, a11);
            }
        }
        if (fullAtom2 == 0) {
            int durationByteCount = -Constants.MIN_PROGRESS_STEP;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int fixedOne3 = str2.length();
            if (length != fixedOne3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "i5DrkfhddIOc";
            strArr2[6] = "TqiRE9mqRyND";
            if (a002 == durationByteCount && trackId == 65536 && durationPosition == 0) {
                a11 = 270;
                return new D7(A082, A0M, a11);
            }
        }
        int fixedOne4 = -Constants.MIN_PROGRESS_STEP;
        if (fullAtom2 == fixedOne4 && a002 == 0 && trackId == 0) {
            int fixedOne5 = -Constants.MIN_PROGRESS_STEP;
            if (durationPosition == fixedOne5) {
                a11 = 180;
                return new D7(A082, A0M, a11);
            }
        }
        a11 = 0;
        return new D7(A082, A0M, a11);
    }

    public static DO A0C(C1350Wa c1350Wa, WZ wz, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws C0813Af {
        long A0F;
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        C1350Wa A062 = c1350Wa.A06(D3.A0d);
        int A022 = A02(A062.A07(D3.A0V).A00);
        if (A022 == -1) {
            return null;
        }
        WZ A072 = c1350Wa.A07(D3.A1J);
        if (A01[3].charAt(8) != 'p') {
            throw new RuntimeException();
        }
        A01[2] = "QWUsjPBg";
        D7 A0B = A0B(A072.A00);
        if (j11 == -9223372036854775807L) {
            j11 = A0B.A02;
        }
        long A042 = A04(wz.A00);
        if (j11 == -9223372036854775807L) {
            A0F = -9223372036854775807L;
        } else {
            A0F = C1020Iz.A0F(j11, 1000000L, A042);
        }
        C1350Wa A063 = A062.A06(D3.A0h).A06(D3.A16);
        Pair<Long, String> A064 = A06(A062.A07(D3.A0c).A00);
        C1004Ij c1004Ij = A063.A07(D3.A1A).A00;
        i10 = A0B.A00;
        i11 = A0B.A01;
        D6 A0A = A0A(c1004Ij, i10, i11, (String) A064.second, drmInitData, z11);
        long[] editListDurations = null;
        long[] jArr = null;
        if (!z10) {
            Pair<long[], long[]> A052 = A05(c1350Wa.A06(D3.A0N));
            editListDurations = (long[]) A052.first;
            jArr = (long[]) A052.second;
        }
        if (A0A.A02 != null) {
            i12 = A0B.A00;
            return new DO(i12, A022, ((Long) A064.first).longValue(), A042, A0F, A0A.A02, A0A.A01, A0A.A03, A0A.A00, editListDurations, jArr);
        }
        return null;
    }

    public static DP A0D(C1004Ij c1004Ij, int childPosition, int i10, String str) {
        int constantIvSize = childPosition + 8;
        while (constantIvSize - childPosition < i10) {
            c1004Ij.A0Y(constantIvSize);
            int defaultCryptByteBlock = c1004Ij.A08();
            if (c1004Ij.A08() == D3.A1G) {
                int version = D3.A01(c1004Ij.A08());
                boolean z10 = true;
                c1004Ij.A0Z(1);
                int i11 = 0;
                int i12 = 0;
                if (version == 0) {
                    c1004Ij.A0Z(1);
                } else {
                    int defaultSkipByteBlock = c1004Ij.A0E();
                    int patternByte = defaultSkipByteBlock & 240;
                    i11 = patternByte >> 4;
                    i12 = defaultSkipByteBlock & 15;
                }
                int version2 = c1004Ij.A0E();
                if (version2 != 1) {
                    z10 = false;
                }
                int A0E = c1004Ij.A0E();
                byte[] bArr = new byte[16];
                int defaultPerSampleIvSize = bArr.length;
                c1004Ij.A0c(bArr, 0, defaultPerSampleIvSize);
                byte[] bArr2 = null;
                if (z10 && A0E == 0) {
                    int A0E2 = c1004Ij.A0E();
                    bArr2 = new byte[A0E2];
                    c1004Ij.A0c(bArr2, 0, A0E2);
                    if (A01[2].length() != 8) {
                        throw new RuntimeException();
                    }
                    A01[2] = "N18HcU44";
                }
                return new DP(z10, str, A0E, bArr, i11, i12, bArr2);
            }
            constantIvSize += defaultCryptByteBlock;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0449, code lost:
        if (r17 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044b, code lost:
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x044d, code lost:
        if (r17 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x044f, code lost:
        r12 = new int[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0451, code lost:
        r14 = new long[r9];
        r30 = 0;
        r4 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x045a, code lost:
        if (r7 >= r0.A08.length) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x045c, code lost:
        r5 = r0.A09[r7];
        r24 = r0.A08[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0468, code lost:
        if (r5 == (-1)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x046a, code lost:
        r1 = com.facebook.ads.redexgen.X.C1020Iz.A0A(r22, r5, true, true);
        r2 = com.facebook.ads.redexgen.X.C1020Iz.A0A(r22, com.facebook.ads.redexgen.X.C1020Iz.A0F(r24, r0.A06, r0.A05) + r5, r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0485, code lost:
        if (r17 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0487, code lost:
        r10 = r2 - r1;
        java.lang.System.arraycopy(r19, r1, r38, r4, r10);
        java.lang.System.arraycopy(r20, r1, r13, r4, r10);
        java.lang.System.arraycopy(r21, r1, r12, r4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x049a, code lost:
        if (r1 >= r2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x049c, code lost:
        r11 = r12[r4] & 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04ab, code lost:
        if (com.facebook.ads.redexgen.X.D8.A01[2].length() == 8) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04ad, code lost:
        if (r11 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04af, code lost:
        if (r1 >= r2) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04b1, code lost:
        r15 = com.facebook.ads.redexgen.X.C1020Iz.A0F(r30, 1000000, r0.A05);
        r9 = r0.A06;
        r14[r4] = r15 + com.facebook.ads.redexgen.X.C1020Iz.A0F(r22[r1] - r5, 1000000, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04ce, code lost:
        if (r17 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04d0, code lost:
        r11 = r13[r4];
        r10 = com.facebook.ads.redexgen.X.D8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04e3, code lost:
        if (r10[0].charAt(2) == r10[5].charAt(2)) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04e5, code lost:
        com.facebook.ads.redexgen.X.D8.A01[2] = "F0gq9lor";
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04ee, code lost:
        if (r11 <= r18) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04f0, code lost:
        r18 = r20[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04f2, code lost:
        r4 = r4 + 1;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04f7, code lost:
        com.facebook.ads.redexgen.X.D8.A01[2] = "ZJoOz8i1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0500, code lost:
        if (r11 <= r18) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0503, code lost:
        com.facebook.ads.redexgen.X.D8.A01[2] = "0L8vuzYj";
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x050a, code lost:
        if (r11 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x050d, code lost:
        r30 = r30 + r24;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0513, code lost:
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0523, code lost:
        if (r17 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0532, code lost:
        android.util.Log.w(r23, A0I(139, 59, 105));
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0546, code lost:
        throw new com.facebook.ads.redexgen.X.WW();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0560, code lost:
        return new com.facebook.ads.redexgen.X.DR(r38, r38, r13, r18, r14, r12, com.facebook.ads.redexgen.X.C1020Iz.A0F(r30, 1000000, r0.A06));
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.DR A0E(com.facebook.ads.redexgen.X.DO r38, com.facebook.ads.redexgen.X.C1350Wa r39, com.facebook.ads.redexgen.X.C0864Cg r40) throws com.facebook.ads.redexgen.X.C0813Af {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0E(com.facebook.ads.redexgen.X.DO, com.facebook.ads.redexgen.X.Wa, com.facebook.ads.redexgen.X.Cg):com.facebook.ads.redexgen.X.DR");
    }

    public static Metadata A0F(WZ wz, boolean z10) {
        if (z10) {
            return null;
        }
        C1004Ij c1004Ij = wz.A00;
        c1004Ij.A0Y(8);
        while (c1004Ij.A04() >= 8) {
            int A062 = c1004Ij.A06();
            int A082 = c1004Ij.A08();
            int A083 = c1004Ij.A08();
            int atomType = D3.A0g;
            if (A083 == atomType) {
                c1004Ij.A0Y(A062);
                return A0H(c1004Ij, A062 + A082);
            }
            int atomType2 = A082 - 8;
            c1004Ij.A0Z(atomType2);
        }
        return null;
    }

    public static Metadata A0G(C1004Ij c1004Ij, int i10) {
        c1004Ij.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (c1004Ij.A06() < i10) {
            Metadata.Entry A012 = DG.A01(c1004Ij);
            if (A012 != null) {
                arrayList.add(A012);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(C1004Ij c1004Ij, int i10) {
        c1004Ij.A0Z(12);
        while (c1004Ij.A06() < i10) {
            int A062 = c1004Ij.A06();
            int A082 = c1004Ij.A08();
            int A083 = c1004Ij.A08();
            int atomType = D3.A0Z;
            if (A083 == atomType) {
                c1004Ij.A0Y(A062);
                return A0G(c1004Ij, A062 + A082);
            }
            int atomType2 = A082 - 8;
            c1004Ij.A0Z(atomType2);
        }
        return null;
    }

    public static void A0K(C1004Ij c1004Ij, int i10, int i11, int i12, int i13, int width, DrmInitData drmInitData, D6 d62, int childPosition) throws C0813Af {
        DrmInitData drmInitData2 = drmInitData;
        int stereoMode = i10;
        c1004Ij.A0Y(i11 + 8 + 8);
        c1004Ij.A0Z(16);
        int A0I = c1004Ij.A0I();
        int A0I2 = c1004Ij.A0I();
        boolean z10 = false;
        float f10 = 1.0f;
        c1004Ij.A0Z(50);
        int A062 = c1004Ij.A06();
        int height = D3.A0R;
        if (stereoMode == height) {
            Pair<Integer, DP> A09 = A09(c1004Ij, i11, i12);
            if (A09 != null) {
                stereoMode = ((Integer) A09.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.A02(((DP) A09.second).A02);
                }
                d62.A03[childPosition] = (DP) A09.second;
            }
            c1004Ij.A0Y(A062);
        }
        List<byte[]> list = null;
        String str = null;
        byte[] bArr = null;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "nt1AbbZdLf7H";
        strArr[6] = "te59XVvfeUPr";
        int i14 = -1;
        while (A062 - i11 < i12) {
            c1004Ij.A0Y(A062);
            int A063 = c1004Ij.A06();
            int A082 = c1004Ij.A08();
            if (A082 == 0 && c1004Ij.A06() - i11 == i12) {
                break;
            }
            IK.A05(A082 > 0, A0I(574, 32, 45));
            int A083 = c1004Ij.A08();
            if (A083 == D3.A08) {
                IK.A04(str == null);
                str = A0I(710, 9, 84);
                c1004Ij.A0Y(A063 + 8);
                J1 A002 = J1.A00(c1004Ij);
                list = A002.A04;
                d62.A00 = A002.A02;
                if (!z10) {
                    f10 = A002.A00;
                }
            } else if (A083 == D3.A0Y) {
                IK.A04(str == null);
                str = A0I(719, 10, 122);
                c1004Ij.A0Y(A063 + 8);
                J7 A003 = J7.A00(c1004Ij);
                list = A003.A01;
                d62.A00 = A003.A00;
            } else if (A083 == D3.A1U) {
                IK.A04(str == null);
                str = stereoMode == D3.A1S ? A0I(729, 19, 27) : A0I(748, 19, 50);
            } else if (A083 == D3.A0D) {
                IK.A04(str == null);
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "qKPn33WXRD1J";
                strArr2[6] = "UtAkzKHIBavs";
                str = A0I(700, 10, 59);
            } else if (A083 == D3.A0S) {
                IK.A04(str == null);
                Pair<String, byte[]> A072 = A07(c1004Ij, A063);
                str = (String) A072.first;
                list = Collections.singletonList((byte[]) A072.second);
            } else if (A083 == D3.A0p) {
                f10 = A00(c1004Ij, A063);
                z10 = true;
            } else if (A083 == D3.A1F) {
                bArr = A0O(c1004Ij, A063, A082);
            } else if (A083 == D3.A15) {
                int A0E = c1004Ij.A0E();
                c1004Ij.A0Z(3);
                if (A0E == 0) {
                    int A0E2 = c1004Ij.A0E();
                    if (A0E2 == 0) {
                        i14 = 0;
                    } else if (A0E2 == 1) {
                        i14 = 1;
                    } else if (A0E2 != 2) {
                        if (A0E2 == 3) {
                            i14 = 3;
                        }
                    } else {
                        i14 = 2;
                    }
                }
            }
            A062 += A082;
        }
        if (str == null) {
            return;
        }
        d62.A02 = Format.A04(Integer.toString(i13), str, null, -1, -1, A0I, A0I2, -1.0f, list, width, f10, bArr, i14, null, drmInitData2);
    }

    public static void A0L(C1004Ij c1004Ij, int i10, int i11, int i12, int i13, String str, D6 d62) throws C0813Af {
        String A0I;
        c1004Ij.A0Y(i11 + 8 + 8);
        List list = null;
        long j10 = Long.MAX_VALUE;
        if (i10 == D3.A02) {
            A0I = A0I(295, 20, 125);
        } else if (i10 == D3.A1O) {
            A0I = A0I(388, 28, 56);
            int i14 = (i12 - 8) - 8;
            byte[] bArr = new byte[i14];
            c1004Ij.A0c(bArr, 0, i14);
            list = Collections.singletonList(bArr);
        } else if (i10 == D3.A1W) {
            A0I = A0I(367, 21, 68);
        } else if (i10 == D3.A18) {
            A0I = A0I(295, 20, 125);
            j10 = 0;
        } else if (i10 == D3.A09) {
            A0I = A0I(342, 25, 79);
            d62.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        d62.A02 = Format.A09(Integer.toString(i13), A0I, null, -1, 0, str, -1, null, j10, list);
    }

    public static void A0M(C1004Ij c1004Ij, int i10, int i11, int i12, int channelCount, String str, boolean z10, DrmInitData drmInitData, D6 d62, int i13) throws C0813Af {
        int childAtomType;
        int childPosition;
        int A032;
        DrmInitData drmInitData2 = drmInitData;
        int i14 = i10;
        c1004Ij.A0Y(i11 + 8 + 8);
        int i15 = 0;
        if (z10) {
            i15 = c1004Ij.A0I();
            c1004Ij.A0Z(6);
        } else {
            c1004Ij.A0Z(8);
        }
        if (i15 == 0 || i15 == 1) {
            childAtomType = c1004Ij.A0I();
            c1004Ij.A0Z(6);
            childPosition = c1004Ij.A0F();
            if (i15 == 1) {
                c1004Ij.A0Z(16);
            }
        } else if (i15 == 2) {
            c1004Ij.A0Z(16);
            childPosition = (int) Math.round(c1004Ij.A03());
            childAtomType = c1004Ij.A0H();
            c1004Ij.A0Z(20);
        } else {
            return;
        }
        int atomType = c1004Ij.A06();
        if (i14 == D3.A0Q) {
            Pair<Integer, DP> A09 = A09(c1004Ij, i11, i12);
            if (A09 != null) {
                i14 = ((Integer) A09.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    Object obj = A09.second;
                    String[] strArr = A01;
                    String str2 = strArr[1];
                    String str3 = strArr[7];
                    int quickTimeSoundDescriptionVersion = str2.charAt(19);
                    if (quickTimeSoundDescriptionVersion == str3.charAt(19)) {
                        A01[3] = "pOqul1QRpDZUg5bU2yQQaQp61y123VtO";
                        drmInitData2 = drmInitData2.A02(((DP) obj).A02);
                    }
                    throw new RuntimeException();
                }
                d62.A03[i13] = (DP) A09.second;
            }
            c1004Ij.A0Y(atomType);
        }
        String str4 = null;
        if (i14 == D3.A04) {
            str4 = A0I(426, 9, 31);
        } else {
            int quickTimeSoundDescriptionVersion2 = D3.A0M;
            if (i14 == quickTimeSoundDescriptionVersion2) {
                str4 = A0I(457, 10, 8);
            } else {
                int quickTimeSoundDescriptionVersion3 = D3.A0I;
                if (i14 == quickTimeSoundDescriptionVersion3) {
                    str4 = A0I(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, 13, 63);
                } else {
                    int quickTimeSoundDescriptionVersion4 = D3.A0K;
                    if (i14 != quickTimeSoundDescriptionVersion4) {
                        int quickTimeSoundDescriptionVersion5 = D3.A0L;
                        if (i14 != quickTimeSoundDescriptionVersion5) {
                            int quickTimeSoundDescriptionVersion6 = D3.A0J;
                            if (i14 == quickTimeSoundDescriptionVersion6) {
                                str4 = A0I(530, 28, 10);
                            } else {
                                int quickTimeSoundDescriptionVersion7 = D3.A0v;
                                if (i14 == quickTimeSoundDescriptionVersion7) {
                                    str4 = A0I(DownloadConnection.HTTP_REQUESTED_RANGE_NOT_SATISFIABLE, 10, 25);
                                } else {
                                    int quickTimeSoundDescriptionVersion8 = D3.A0w;
                                    if (i14 == quickTimeSoundDescriptionVersion8) {
                                        str4 = A0I(445, 12, 124);
                                    } else {
                                        int quickTimeSoundDescriptionVersion9 = D3.A0a;
                                        if (i14 != quickTimeSoundDescriptionVersion9) {
                                            int quickTimeSoundDescriptionVersion10 = D3.A14;
                                            if (i14 != quickTimeSoundDescriptionVersion10) {
                                                int quickTimeSoundDescriptionVersion11 = D3.A03;
                                                if (i14 == quickTimeSoundDescriptionVersion11) {
                                                    str4 = A0I(482, 10, 92);
                                                } else {
                                                    int quickTimeSoundDescriptionVersion12 = D3.A05;
                                                    if (i14 == quickTimeSoundDescriptionVersion12) {
                                                        str4 = A0I(435, 10, 88);
                                                    }
                                                }
                                            }
                                        }
                                        str4 = A0I(DownloadResource.STATUS_FILE_ERROR, 9, 89);
                                    }
                                }
                            }
                        }
                    }
                    str4 = A0I(IronSourceConstants.INIT_COMPLETE, 16, 70);
                }
            }
        }
        byte[] bArr = null;
        while (atomType - i11 < i12) {
            c1004Ij.A0Y(atomType);
            int A082 = c1004Ij.A08();
            IK.A05(A082 > 0, A0I(574, 32, 45));
            int A083 = c1004Ij.A08();
            if (A083 == D3.A0S || (z10 && A083 == D3.A1V)) {
                if (A083 == D3.A0S) {
                    A032 = atomType;
                } else {
                    A032 = A03(c1004Ij, atomType, A082);
                }
                if (A032 != -1) {
                    Pair<String, byte[]> A072 = A07(c1004Ij, A032);
                    str4 = (String) A072.first;
                    bArr = (byte[]) A072.second;
                    if (A0I(467, 15, 48).equals(str4)) {
                        Pair<Integer, Integer> A033 = IO.A03(bArr);
                        childPosition = ((Integer) A033.first).intValue();
                        childAtomType = ((Integer) A033.second).intValue();
                    }
                }
            } else if (A083 == D3.A0E) {
                int i16 = atomType + 8;
                if (A01[3].charAt(8) == 'p') {
                    String[] strArr2 = A01;
                    strArr2[0] = "HYOwJoQ2L6umAwimTza29CMlFS3ISf2h";
                    strArr2[5] = "FglgDO1LYQ1bVlWfctdCtrgF4dzfBOT4";
                    c1004Ij.A0Y(i16);
                    d62.A02 = BA.A07(c1004Ij, Integer.toString(channelCount), str, drmInitData2);
                } else {
                    throw new RuntimeException();
                }
            } else if (A083 == D3.A0H) {
                c1004Ij.A0Y(atomType + 8);
                d62.A02 = BA.A08(c1004Ij, Integer.toString(channelCount), str, drmInitData2);
            } else if (A083 == D3.A0G) {
                d62.A02 = Format.A07(Integer.toString(channelCount), str4, null, -1, -1, childAtomType, childPosition, null, drmInitData2, 0, str);
            } else if (A083 == D3.A05) {
                bArr = new byte[A082];
                c1004Ij.A0Y(atomType);
                c1004Ij.A0c(bArr, 0, A082);
            }
            atomType += A082;
        }
        if (d62.A02 != null || str4 == null) {
            return;
        }
        int i17 = A0I(DownloadResource.STATUS_FILE_ERROR, 9, 89).equals(str4) ? 2 : -1;
        String mimeType = Integer.toString(channelCount);
        d62.A02 = Format.A06(mimeType, str4, null, -1, -1, childAtomType, childPosition, i17, bArr != null ? Collections.singletonList(bArr) : null, drmInitData2, 0, str);
    }

    public static boolean A0N(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int latestDelayIndex = C1020Iz.A06(3, 0, length);
        return jArr[0] <= j11 && j11 < jArr[latestDelayIndex] && jArr[C1020Iz.A06(jArr.length - 3, 0, length)] < j12 && j12 <= j10;
    }

    public static byte[] A0O(C1004Ij c1004Ij, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c1004Ij.A0Y(i12);
            int A082 = c1004Ij.A08();
            if (c1004Ij.A08() == D3.A0q) {
                return Arrays.copyOfRange(c1004Ij.A00, i12, i12 + A082);
            }
            i12 += A082;
        }
        return null;
    }
}
