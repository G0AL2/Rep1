package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0879Di {
    public static byte[] A0K;
    public static String[] A0L = {"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0870Co A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C1004Ij A0I = new C1004Ij((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
    public final C1003Ii A0H = new C1003Ii(this.A0I.A00);

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    static {
        A04();
    }

    public W5(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C1003Ii c1003Ii) throws C0813Af {
        int A01 = c1003Ii.A01();
        Pair<Integer, Integer> A02 = IO.A02(c1003Ii, true);
        this.A05 = ((Integer) A02.first).intValue();
        this.A02 = ((Integer) A02.second).intValue();
        return A01 - c1003Ii.A01();
    }

    private int A01(C1003Ii c1003Ii) throws C0813Af {
        int A04;
        int i10 = 0;
        if (this.A03 == 0) {
            do {
                A04 = c1003Ii.A04(8);
                i10 += A04;
            } while (A04 == 255);
            return i10;
        }
        throw new C0813Af();
    }

    public static long A02(C1003Ii c1003Ii) {
        return c1003Ii.A04((c1003Ii.A04(2) + 1) * 8);
    }

    private void A05(int i10) {
        this.A0I.A0W(i10);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C1003Ii c1003Ii) throws C0813Af {
        if (!c1003Ii.A0F()) {
            this.A0G = true;
            A08(c1003Ii);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c1003Ii, A01(c1003Ii));
                if (this.A0F) {
                    c1003Ii.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C0813Af();
        }
        throw new C0813Af();
    }

    private void A07(C1003Ii c1003Ii) {
        this.A03 = c1003Ii.A04(3);
        int i10 = this.A03;
        if (i10 == 0) {
            c1003Ii.A08(8);
        } else if (i10 != 1) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                c1003Ii.A08(6);
                return;
            }
            if (i10 != 6) {
                if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                if (i10 != 7) {
                    return;
                }
            }
            c1003Ii.A08(1);
        } else {
            c1003Ii.A08(9);
        }
    }

    private void A08(C1003Ii c1003Ii) throws C0813Af {
        boolean A0F;
        int numProgram = c1003Ii.A04(1);
        int bitsRead = numProgram == 1 ? c1003Ii.A04(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(c1003Ii);
            }
            if (c1003Ii.A0F()) {
                this.A04 = c1003Ii.A04(6);
                int A04 = c1003Ii.A04(4);
                int A042 = c1003Ii.A04(3);
                if (A04 == 0 && A042 == 0) {
                    if (numProgram == 0) {
                        int readBits = c1003Ii.A03();
                        int A00 = A00(c1003Ii);
                        c1003Ii.A07(readBits);
                        int readBits2 = A00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        c1003Ii.A0D(initData, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5V(A07);
                        }
                    } else {
                        int A02 = (int) A02(c1003Ii);
                        int bitsRead2 = A00(c1003Ii);
                        c1003Ii.A08(A02 - bitsRead2);
                    }
                    A07(c1003Ii);
                    this.A0F = c1003Ii.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(c1003Ii);
                        } else {
                            do {
                                A0F = c1003Ii.A0F();
                                this.A09 = (this.A09 << 8) + c1003Ii.A04(8);
                            } while (A0F);
                        }
                    }
                    if (c1003Ii.A0F()) {
                        c1003Ii.A08(8);
                        return;
                    }
                    return;
                }
                throw new C0813Af();
            }
            throw new C0813Af();
        }
        throw new C0813Af();
    }

    private void A09(C1003Ii c1003Ii, int i10) {
        int A03 = c1003Ii.A03();
        if ((A03 & 7) == 0) {
            this.A0I.A0Y(A03 >> 3);
        } else {
            c1003Ii.A0D(this.A0I.A00, 0, i10 * 8);
            this.A0I.A0Y(0);
        }
        this.A0D.AEG(this.A0I, i10);
        this.A0D.AEH(this.A0B, 1, i10, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) throws C0813Af {
        while (c1004Ij.A04() > 0) {
            int i10 = this.A08;
            if (i10 != 0) {
                if (i10 == 1) {
                    int A0E = c1004Ij.A0E();
                    if ((A0E & 224) == 224) {
                        this.A07 = A0E;
                        this.A08 = 2;
                    } else if (A0E != 86) {
                        this.A08 = 0;
                    }
                } else if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                } else {
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i10 == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | c1004Ij.A0E();
                        if (this.A06 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i10 == 3) {
                        int min = Math.min(c1004Ij.A04(), this.A06 - this.A01);
                        c1004Ij.A0c(this.A0H.A00, this.A01, min);
                        this.A01 += min;
                        if (this.A01 == this.A06) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (c1004Ij.A0E() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A0D = interfaceC0862Ce.AFD(c0893Dw.A03(), 1);
        this.A0E = c0893Dw.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A0B = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        this.A08 = 0;
        this.A0G = false;
    }
}
