package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0892Dv {
    public static byte[] A02;
    public static String[] A03 = {"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    public final int A00;
    public final List<Format> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    static {
        A02();
    }

    public WC() {
        this(0);
    }

    public WC(int i10) {
        this(i10, Collections.emptyList());
    }

    public WC(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private C0888Dr A00(C0891Du c0891Du) {
        String A01;
        int i10;
        if (A03(32)) {
            return new C0888Dr(this.A01);
        }
        C1004Ij c1004Ij = new C1004Ij(c0891Du.A03);
        List<Format> list = this.A01;
        while (true) {
            int A04 = c1004Ij.A04();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (A04 > 0) {
                int descriptorLength = c1004Ij.A0E();
                int descriptorTag = c1004Ij.A0E();
                int A06 = c1004Ij.A06() + descriptorTag;
                if (descriptorLength == 134) {
                    list = new ArrayList<>();
                    int nextDescriptorPosition = c1004Ij.A0E();
                    int i11 = nextDescriptorPosition & 31;
                    for (int accessibilityChannel = 0; accessibilityChannel < i11; accessibilityChannel++) {
                        String A0S = c1004Ij.A0S(3);
                        int A0E = c1004Ij.A0E();
                        int captionTypeByte = A0E & 128;
                        int captionTypeByte2 = captionTypeByte != 0 ? 1 : 0;
                        if (captionTypeByte2 != 0) {
                            A01 = A01(19, 19, 39);
                            i10 = A0E & 63;
                        } else {
                            A01 = A01(0, 19, 33);
                            i10 = 1;
                        }
                        list.add(Format.A08(null, A01, null, -1, 0, A0S, i10, null));
                        c1004Ij.A0Z(2);
                    }
                }
                c1004Ij.A0Y(A06);
            } else {
                return new C0888Dr(list);
            }
        }
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0892Dv
    public final SparseArray<InterfaceC0894Dx> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0892Dv
    public final InterfaceC0894Dx A4P(int i10, C0891Du c0891Du) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new W3(new W4(c0891Du.A01));
            }
            if (i10 == 15) {
                if (A03(2)) {
                    return null;
                }
                return new W3(new WD(false, c0891Du.A01));
            } else if (i10 == 17) {
                if (A03(2)) {
                    return null;
                }
                return new W3(new W5(c0891Du.A01));
            } else if (i10 != 21) {
                if (i10 == 27) {
                    if (A03(4)) {
                        return null;
                    }
                    return new W3(new W8(A00(c0891Du), A03(1), A03(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 129) {
                                if (i10 != 130) {
                                    if (A03[7].charAt(7) != 'G') {
                                        throw new RuntimeException();
                                    }
                                    A03[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                                    if (i10 == 134) {
                                        if (A03(16)) {
                                            return null;
                                        }
                                        return new W0(new C1349Vz());
                                    } else if (i10 != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new W3(new WG(c0891Du.A01));
                        }
                        return new W3(new WB(c0891Du.A01));
                    }
                    return new W3(new WA(c0891Du.A02));
                } else {
                    return new W3(new W7(A00(c0891Du)));
                }
            } else {
                return new W3(new W6());
            }
        }
        return new W3(new W9());
    }
}
