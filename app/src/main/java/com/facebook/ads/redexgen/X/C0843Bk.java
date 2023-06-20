package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Bk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0843Bk extends VD {
    public static byte[] A02;
    public static String[] A03 = {"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    public static final int[] A04;
    @Nullable
    public final HP A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        A03[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0843Bk() {
        this(null);
    }

    public C0843Bk(@Nullable HP hp) {
        this.A00 = hp;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        } else if (i11 == -1) {
            return 1;
        } else {
            return i10 - i11;
        }
    }

    public static int A01(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            Integer num = list.get(i15);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int intValue = num.intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, HG hg) {
        int i10 = 0;
        for (int i11 = 0; i11 < trackGroup.A01; i11++) {
            if (A0J(trackGroup.A01(i11), iArr[i11], hg)) {
                i10++;
            }
        }
        return i10;
    }

    public static Point A05(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) != (i10 > i11)) {
                i10 = i11;
                i11 = i10;
            }
        }
        int tempViewportWidth = i12 * i11;
        int i14 = i13 * i10;
        if (A03[2].charAt(31) != 'o') {
            A03[6] = "nfw";
            if (tempViewportWidth >= i14) {
                return new Point(i10, C1020Iz.A04(i10 * i13, i12));
            }
            return new Point(C1020Iz.A04(i11 * i12, i13), i11);
        }
        throw new RuntimeException();
    }

    @Nullable
    private final HQ A06(int i10, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            A03[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i12 < i13) {
                TrackGroup A01 = trackGroupArray.A01(i12);
                int[] iArr2 = iArr[i12];
                for (int i14 = 0; i14 < A01.A01; i14++) {
                    if (A0H(iArr2[i14], defaultTrackSelector$Parameters.A0B)) {
                        int i15 = (A01.A01(i14).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[i14], false)) {
                            i15 += 1000;
                        }
                        if (i15 > i11) {
                            trackGroup = A01;
                            trackIndex = i14;
                            i11 = i15;
                        }
                    }
                }
                i12++;
            } else if (trackGroup == null) {
                return null;
            } else {
                return new C0836Bd(trackGroup, trackIndex);
            }
        }
    }

    @Nullable
    public static HQ A07(TrackGroupArray trackGroupArray, int[][] iArr, int requiredAdaptiveSupport, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, HP hp) throws AM {
        int i10;
        if (defaultTrackSelector$Parameters.A0A) {
            i10 = 24;
        } else {
            i10 = 16;
        }
        boolean z10 = defaultTrackSelector$Parameters.A09 && (requiredAdaptiveSupport & i10) != 0;
        for (int i11 = 0; i11 < trackGroupArray.A01; i11++) {
            TrackGroup A01 = trackGroupArray.A01(i11);
            int[] A0O = A0O(A01, iArr[i11], z10, i10, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((HP) IK.A01(hp)).A4U(A01, A0O);
            }
        }
        return null;
    }

    @Nullable
    private final HQ A08(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        int trackIndex = -1;
        int i11 = -1;
        HH trackScore = null;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup A01 = trackGroupArray.A01(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < A01.A01; i13++) {
                if (A0H(iArr2[i13], defaultTrackSelector$Parameters.A0B)) {
                    HH hh = new HH(A01.A01(i13), defaultTrackSelector$Parameters, iArr2[i13]);
                    if (trackScore == null || hh.A00(trackScore) > 0) {
                        i11 = i12;
                        trackIndex = i13;
                        trackScore = hh;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup A012 = trackGroupArray.A01(i11);
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            int[] A0N = A0N(A012, iArr[i11], defaultTrackSelector$Parameters.A09);
            if (A0N.length > 0) {
                return hp.A4U(A012, A0N);
            }
        }
        return new C0836Bd(A012, trackIndex);
    }

    @Nullable
    private final HQ A09(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        HQ hq = null;
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            hq = A07(trackGroupArray, iArr, i10, defaultTrackSelector$Parameters, hp);
        }
        if (hq == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return hq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r1 <= r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r3 <= r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r1 <= r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
        if (r1 <= r21.A01) goto L37;
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.HQ A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0843Bk.A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.HQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r0 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.HQ A0B(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r15, int[][] r16, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r17) throws com.facebook.ads.redexgen.X.AM {
        /*
            r14 = this;
            r6 = 0
            r5 = 0
            r2 = 0
            r7 = 0
        L4:
            int r0 = r15.A01
            if (r7 >= r0) goto L98
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r4 = r15.A01(r7)
            r13 = r16[r7]
            r3 = 0
        Lf:
            int r0 = r4.A01
            if (r3 >= r0) goto L94
            r1 = r13[r3]
            r10 = r17
            boolean r0 = r10.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L90
            com.facebook.ads.internal.exoplayer2.Format r8 = r4.A01(r3)
            int r1 = r8.A0D
            int r0 = r10.A00
            r0 = r0 ^ (-1)
            r1 = r1 & r0
            r0 = r1 & 1
            r9 = 0
            r12 = 1
            if (r0 == 0) goto L86
            r11 = 1
        L31:
            r0 = r1 & 2
            if (r0 == 0) goto L84
        L35:
            java.lang.String r0 = r10.A08
            boolean r1 = A0K(r8, r0)
            if (r1 != 0) goto L47
            boolean r0 = r10.A0E
            if (r0 == 0) goto L72
            boolean r0 = A0I(r8)
            if (r0 == 0) goto L72
        L47:
            if (r11 == 0) goto L6c
            r8 = 8
        L4b:
            int r8 = r8 + r1
        L4c:
            r0 = r13[r3]
            boolean r0 = A0H(r0, r9)
            if (r0 == 0) goto L56
            int r8 = r8 + 1000
        L56:
            if (r8 <= r2) goto L90
            r6 = r4
            r5 = r3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0843Bk.A03
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L88
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6c:
            if (r12 != 0) goto L70
            r8 = 6
            goto L4b
        L70:
            r8 = 4
            goto L4b
        L72:
            if (r11 == 0) goto L76
            r8 = 3
            goto L4c
        L76:
            if (r12 == 0) goto L90
            java.lang.String r0 = r10.A07
            boolean r0 = A0K(r8, r0)
            if (r0 == 0) goto L82
            r8 = 2
            goto L4c
        L82:
            r8 = 1
            goto L4c
        L84:
            r12 = 0
            goto L35
        L86:
            r11 = 0
            goto L31
        L88:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0843Bk.A03
            java.lang.String r1 = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM"
            r0 = 2
            r2[r0] = r1
            r2 = r8
        L90:
            int r3 = r3 + 1
            goto Lf
        L94:
            int r7 = r7 + 1
            goto L4
        L98:
            if (r6 != 0) goto L9c
            r0 = 0
        L9b:
            return r0
        L9c:
            com.facebook.ads.redexgen.X.Bd r0 = new com.facebook.ads.redexgen.X.Bd
            r0.<init>(r6, r5)
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0843Bk.A0B(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.HQ");
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i10, int maxVideoPixelsToRetain, boolean z10) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i11 = 0; i11 < trackGroup.A01; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        if (i10 == Integer.MAX_VALUE || maxVideoPixelsToRetain == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i13 = 0; i13 < trackGroup.A01; i13++) {
            Format A01 = trackGroup.A01(i13);
            if (A01.A0F > 0) {
                int i14 = A01.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                A03[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i14 > 0) {
                    Point A05 = A05(z10, i10, maxVideoPixelsToRetain, A01.A0F, A01.A08);
                    int i15 = A01.A0F * A01.A08;
                    int videoPixels = A01.A0F;
                    if (videoPixels >= ((int) (A05.x * 0.98f))) {
                        int videoPixels2 = A01.A08;
                        if (videoPixels2 >= ((int) (A05.y * 0.98f)) && i15 < i12) {
                            i12 = i15;
                        }
                    }
                }
            }
        }
        if (i12 != Integer.MAX_VALUE) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int A0E = trackGroup.A01(((Integer) arrayList.get(size)).intValue()).A0E();
                if (A0E == -1 || A0E > i12) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    public static void A0F(TrackGroup trackGroup, int[] iArr, int trackIndex, @Nullable String str, int i10, int i11, int i12, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], trackIndex, i10, i11, i12)) {
                list.remove(size);
            }
        }
    }

    public static void A0G(HO ho, int[][][] iArr, C0829Av[] c0829AvArr, HQ[] hqArr, int rendererType) {
        if (rendererType == 0) {
            return;
        }
        int i10 = -1;
        int i11 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= ho.A00()) {
                break;
            }
            int A01 = ho.A01(i12);
            HQ hq = hqArr[i12];
            if ((A01 == 1 || A01 == 2) && hq != null && A0M(iArr[i12], ho.A02(i12), hq)) {
                if (A01 == 1) {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                } else if (i11 != -1) {
                    z10 = false;
                    break;
                } else {
                    i11 = i12;
                }
            }
            i12++;
        }
        boolean z12 = z10 & ((i10 == -1 || i11 == -1) ? false : false);
        if (A03[3].charAt(2) != 'E') {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z12) {
                return;
            }
        } else if (!z12) {
            return;
        }
        C0829Av c0829Av = new C0829Av(rendererType);
        c0829AvArr[i10] = c0829Av;
        c0829AvArr[i11] = c0829Av;
    }

    public static boolean A0H(int i10, boolean z10) {
        int maskedSupport = i10 & 7;
        return maskedSupport == 4 || (z10 && maskedSupport == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 21));
    }

    public static boolean A0J(Format format, int i10, HG hg) {
        if (A0H(i10, false) && format.A05 == hg.A00 && format.A0C == hg.A01) {
            return hg.A02 == null || TextUtils.equals(hg.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C1020Iz.A0L(format.A0N));
    }

    public static boolean A0L(Format format, @Nullable String str, int i10, int i11, int i12, int i13, int i14) {
        if (!A0H(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str == null || C1020Iz.A0g(format.A0O, str)) {
            if (format.A0F == -1 || format.A0F <= i12) {
                if (format.A08 == -1 || format.A08 <= i13) {
                    if (format.A04 != -1) {
                        int i15 = format.A04;
                        if (A03[2].charAt(31) == 'o') {
                            throw new RuntimeException();
                        }
                        A03[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
                        if (i15 > i14) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, HQ hq) {
        if (hq == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(hq.A7g());
        if (A03[2].charAt(31) != 'o') {
            A03[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
            for (int i10 = 0; i10 < hq.length(); i10++) {
                if ((iArr[A00][hq.A6n(i10)] & 32) != 32) {
                    return false;
                }
            }
            if (A03[2].charAt(31) != 'o') {
                String[] strArr = A03;
                strArr[4] = "AvWfp";
                strArr[0] = "jnm8oH";
                return true;
            }
            A03[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
            return true;
        }
        throw new RuntimeException();
    }

    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z10) {
        int A042;
        int i10 = 0;
        HG hg = null;
        HashSet hashSet = new HashSet();
        int configurationCount = 0;
        while (true) {
            if (configurationCount < trackGroup.A01) {
                Format A01 = trackGroup.A01(configurationCount);
                HG hg2 = new HG(A01.A05, A01.A0C, z10 ? null : A01.A0O);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[0].length()) {
                    break;
                }
                A03[6] = "SWl";
                if (hashSet.add(hg2) && (A042 = A04(trackGroup, iArr, hg2)) > i10) {
                    hg = hg2;
                    i10 = A042;
                }
                configurationCount++;
            } else if (i10 > 1) {
                int[] adaptiveIndices = new int[i10];
                if (A03[1].charAt(3) == 'F') {
                    A03[2] = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq";
                    int index = 0;
                    for (int i11 = 0; i11 < trackGroup.A01; i11++) {
                        if (A0J(trackGroup.A01(i11), iArr[i11], (HG) IK.A01(hg))) {
                            adaptiveIndices[index] = i11;
                            index++;
                        }
                    }
                    return adaptiveIndices;
                }
            } else {
                return A04;
            }
        }
        throw new RuntimeException();
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int trackIndex, int i13, int i14, boolean z11) {
        int A032;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i13, i14, z11);
            if (A0D.size() < 2) {
                return A04;
            }
            String str = null;
            if (!z10) {
                HashSet hashSet = new HashSet();
                int i15 = 0;
                for (int selectedMimeTypeTrackCount = 0; selectedMimeTypeTrackCount < A0D.size(); selectedMimeTypeTrackCount++) {
                    String str2 = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount).intValue()).A0O;
                    if (hashSet.add(str2) && (A032 = A03(trackGroup, iArr, i10, str2, i11, i12, trackIndex, A0D)) > i15) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        str = str2;
                        i15 = A032;
                    }
                }
            }
            A0F(trackGroup, iArr, i10, str, i11, i12, trackIndex, A0D);
            return A0D.size() < 2 ? A04 : C1020Iz.A0j(A0D);
        }
        return A04;
    }

    private final HQ[] A0P(HO ho, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        boolean z10;
        int A00 = ho.A00();
        HQ[] hqArr = new HQ[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i10 = 0;
        for (int i11 = 0; i11 < A00; i11++) {
            int A01 = ho.A01(i11);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == A01) {
                if (i10 == 0) {
                    z10 = true;
                    hqArr[i11] = A09(ho.A02(i11), iArr[i11], iArr2[i11], defaultTrackSelector$Parameters, this.A00);
                    i10 = hqArr[i11] != null ? 1 : 0;
                } else {
                    z10 = true;
                }
                if (ho.A02(i11).A01 <= 0) {
                    z10 = false;
                }
                seenVideoRendererWithMappedTracks |= z10;
            }
        }
        boolean z11 = false;
        int i12 = 0;
        if (A03[3].charAt(2) != 'E') {
            A03[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
            for (int i13 = 0; i13 < A00; i13++) {
                int A012 = ho.A01(i13);
                if (A012 != 1) {
                    if (A012 != 2) {
                        if (A012 != 3) {
                            hqArr[i13] = A06(A012, ho.A02(i13), iArr[i13], defaultTrackSelector$Parameters);
                        } else if (i12 == 0) {
                            hqArr[i13] = A0B(ho.A02(i13), iArr[i13], defaultTrackSelector$Parameters);
                            i12 = hqArr[i13] != null ? 1 : 0;
                        }
                    }
                } else if (!z11) {
                    hqArr[i13] = A08(ho.A02(i13), iArr[i13], iArr2[i13], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                    z11 = hqArr[i13] != null;
                }
            }
            return hqArr;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.VD
    public final Pair<C0829Av[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws AM {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int i10 = ho.A00();
        HQ[] A0P = A0P(ho, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i11 = 0; i11 < i10; i11++) {
            if (defaultTrackSelector$Parameters.A06(i11)) {
                A0P[i11] = null;
            } else {
                TrackGroupArray A022 = ho.A02(i11);
                if (defaultTrackSelector$Parameters.A07(i11, A022)) {
                    DefaultTrackSelector$SelectionOverride A05 = defaultTrackSelector$Parameters.A05(i11, A022);
                    if (A05 == null) {
                        A0P[i11] = null;
                    } else if (A05.A01 == 1) {
                        A0P[i11] = new C0836Bd(A022.A01(A05.A00), A05.A02[0]);
                    } else {
                        A0P[i11] = ((HP) IK.A01(this.A00)).A4U(A022.A01(A05.A00), A05.A02);
                    }
                }
            }
        }
        C0829Av[] c0829AvArr = new C0829Av[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            c0829AvArr[i12] = !defaultTrackSelector$Parameters.A06(i12) && (ho.A01(i12) == 5 || A0P[i12] != null) ? C0829Av.A01 : null;
        }
        A0G(ho, iArr, c0829AvArr, A0P, defaultTrackSelector$Parameters.A04);
        return Pair.create(c0829AvArr, A0P);
    }
}
