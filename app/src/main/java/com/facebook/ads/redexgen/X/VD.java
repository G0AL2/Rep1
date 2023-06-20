package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public abstract class VD extends HT {
    public static String[] A01 = {"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};
    @Nullable
    public HO A00;

    public abstract Pair<C0829Av[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws AM;

    public static int A0Q(InterfaceC0828Au[] interfaceC0828AuArr, TrackGroup trackGroup) throws AM {
        int rendererIndex = interfaceC0828AuArr.length;
        int i10 = 0;
        for (int trackIndex = 0; trackIndex < interfaceC0828AuArr.length; trackIndex++) {
            InterfaceC0828Au interfaceC0828Au = interfaceC0828AuArr[trackIndex];
            for (int i11 = 0; i11 < trackGroup.A01; i11++) {
                int formatSupportLevel = interfaceC0828Au.AF7(trackGroup.A01(i11)) & 7;
                if (formatSupportLevel > i10) {
                    rendererIndex = trackIndex;
                    i10 = formatSupportLevel;
                    if (i10 == 4) {
                        return rendererIndex;
                    }
                }
            }
        }
        return rendererIndex;
    }

    public static int[] A0R(InterfaceC0828Au interfaceC0828Au, TrackGroup trackGroup) throws AM {
        int[] iArr = new int[trackGroup.A01];
        for (int i10 = 0; i10 < trackGroup.A01; i10++) {
            iArr[i10] = interfaceC0828Au.AF7(trackGroup.A01(i10));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC0828Au[] interfaceC0828AuArr) throws AM {
        int[] iArr = new int[interfaceC0828AuArr.length];
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int length2 = str.length();
            int i11 = str2.length();
            if (length2 == i11) {
                throw new RuntimeException();
            }
            A01[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i10 < length) {
                int i12 = interfaceC0828AuArr[i10].AF9();
                iArr[i10] = i12;
                i10++;
            } else {
                return iArr;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0029 */
    @Override // com.facebook.ads.redexgen.X.HT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.HU A0T(com.facebook.ads.redexgen.X.InterfaceC0828Au[] r12, com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r13) throws com.facebook.ads.redexgen.X.AM {
        /*
            r11 = this;
            int r0 = r12.length
            int r0 = r0 + 1
            int[] r4 = new int[r0]
            int r0 = r12.length
            int r0 = r0 + 1
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[][] r3 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0]
            int r0 = r12.length
            int r0 = r0 + 1
            int[][][] r9 = new int[r0][]
            r1 = 0
        L10:
            int r0 = r3.length
            if (r1 >= r0) goto L22
            int r0 = r13.A01
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0]
            r3[r1] = r0
            int r0 = r13.A01
            int[][] r0 = new int[r0]
            r9[r1] = r0
            int r1 = r1 + 1
            goto L10
        L22:
            int[] r8 = A0S(r12)
            r7 = 0
        L27:
            int r0 = r13.A01
            if (r7 >= r0) goto L54
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r6 = r13.A01(r7)
            int r5 = A0Q(r12, r6)
            int r0 = r12.length
            if (r5 != r0) goto L4d
            int r0 = r6.A01
            int[] r2 = new int[r0]
        L3a:
            r1 = r4[r5]
            r0 = r3[r5]
            r0[r1] = r6
            r0 = r9[r5]
            r0[r1] = r2
            r0 = r4[r5]
            int r0 = r0 + 1
            r4[r5] = r0
            int r7 = r7 + 1
            goto L27
        L4d:
            r0 = r12[r5]
            int[] r2 = A0R(r0, r6)
            goto L3a
        L54:
            int r0 = r12.length
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[] r7 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[r0]
            int r0 = r12.length
            int[] r6 = new int[r0]
            r5 = 0
        L5b:
            int r0 = r12.length
            if (r5 >= r0) goto L84
            r2 = r4[r5]
            r0 = r3[r5]
            java.lang.Object[] r1 = com.facebook.ads.redexgen.X.C1020Iz.A0k(r0, r2)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r1 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r1
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r0 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            r0.<init>(r1)
            r7[r5] = r0
            r0 = r9[r5]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.C1020Iz.A0k(r0, r2)
            int[][] r0 = (int[][]) r0
            r9[r5] = r0
            r0 = r12[r5]
            int r0 = r0.A7i()
            r6[r5] = r0
            int r5 = r5 + 1
            goto L5b
        L84:
            int r0 = r12.length
            r1 = r4[r0]
            int r0 = r12.length
            r0 = r3[r0]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.C1020Iz.A0k(r0, r1)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r0
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r10 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            r10.<init>(r0)
            com.facebook.ads.redexgen.X.HO r5 = new com.facebook.ads.redexgen.X.HO
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r11
            android.util.Pair r0 = r0.A0V(r5, r9, r8)
            java.lang.Object r2 = r0.first
            com.facebook.ads.redexgen.X.Av[] r2 = (com.facebook.ads.redexgen.X.C0829Av[]) r2
            java.lang.Object r1 = r0.second
            com.facebook.ads.redexgen.X.HQ[] r1 = (com.facebook.ads.redexgen.X.HQ[]) r1
            com.facebook.ads.redexgen.X.HU r0 = new com.facebook.ads.redexgen.X.HU
            r0.<init>(r2, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VD.A0T(com.facebook.ads.redexgen.X.Au[], com.facebook.ads.internal.exoplayer2.source.TrackGroupArray):com.facebook.ads.redexgen.X.HU");
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final void A0U(Object obj) {
        this.A00 = (HO) obj;
    }
}
