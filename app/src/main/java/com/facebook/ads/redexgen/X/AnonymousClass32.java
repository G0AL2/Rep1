package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.32  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass32 extends AbstractC0847Bo {
    public static byte[] A0C;
    public static String[] A0D = {"23YoP", "C5PaKb5CuNZ88jAQuKda3Ijqs42X0e51", "UjAKU", "ig9eEatozIbUeilu6P8PDlGI40FLnJQN", "3", "3yPqbEimTjK1Te0jzRxw8Mq4WDJCEE6c", "iulf573S2lPMND7gJrZX6jdv4yAWs7sY", "6"};
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public static final int[] A0K;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<GX> A05;
    public List<GX> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C1004Ij A0A = new C1004Ij();
    public final ArrayList<C0949Ge> A0B = new ArrayList<>();
    public C0949Ge A04 = new C0949Ge(0, 4);

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0C = new byte[]{88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 90, 92, 88, 20, 15, 9, 1};
    }

    static {
        A07();
        A0G = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0F = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0K = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0E = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0H = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0I = new int[]{DownloadResource.STATUS_PAUSED_BY_APP, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, DownloadResource.STATUS_RUNNING, DownloadResource.STATUS_WAITING_TO_RETRY, DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        A0J = new int[]{DownloadResource.STATUS_WAITING_FOR_NETWORK, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, DownloadResource.STATUS_QUEUED_FOR_WIFI, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public AnonymousClass32(String str, int i10) {
        this.A08 = A04(0, 25, 80).equals(str) ? 2 : 3;
        if (i10 != 3 && i10 != 4) {
            this.A09 = 1;
        } else {
            this.A09 = 2;
        }
        A0B(0);
        A06();
    }

    public static char A00(byte b10) {
        int index = (b10 & Byte.MAX_VALUE) - 32;
        return (char) A0E[index];
    }

    public static char A01(byte b10) {
        int index = b10 & 31;
        return (char) A0I[index];
    }

    public static char A02(byte b10) {
        int index = b10 & 31;
        return (char) A0J[index];
    }

    public static char A03(byte b10) {
        int index = b10 & 15;
        return (char) A0H[index];
    }

    private List<GX> A05() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.A0B.size(); i10++) {
            GX A05 = this.A0B.get(i10).A05();
            if (A05 != null) {
                arrayList.add(A05);
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A04.A09(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A08(byte b10) {
        this.A04.A08(' ');
        this.A04.A0E((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void A09(byte b10) {
        if (b10 == 32) {
            A0B(2);
            return;
        }
        String[] strArr = A0D;
        if (strArr[4].length() == strArr[7].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "VpP0XbxTm16oYjwBPQX9pkQBfCeMI0LC";
            strArr2[5] = "MOPRimaIhpXtOf0evsEmKI44xylzjAWv";
            if (b10 != 41) {
                switch (b10) {
                    case 37:
                        A0B(1);
                        A0C(2);
                        return;
                    case 38:
                        A0B(1);
                        A0C(3);
                        return;
                    case 39:
                        A0B(1);
                        String[] strArr3 = A0D;
                        if (strArr3[3].charAt(24) == strArr3[6].charAt(24)) {
                            String[] strArr4 = A0D;
                            strArr4[4] = "Y";
                            strArr4[7] = "Z";
                            A0C(4);
                            return;
                        }
                        break;
                    default:
                        int i10 = this.A02;
                        if (i10 == 0) {
                            return;
                        }
                        if (b10 == 33) {
                            this.A04.A06();
                            return;
                        } else if (b10 == 36) {
                            return;
                        } else {
                            switch (b10) {
                                case 44:
                                    this.A05 = null;
                                    if (i10 != 1 && i10 != 3) {
                                        return;
                                    }
                                    A06();
                                    return;
                                case 45:
                                    if (i10 != 1 || this.A04.A0F()) {
                                        return;
                                    }
                                    this.A04.A07();
                                    return;
                                case 46:
                                    A06();
                                    return;
                                case 47:
                                    this.A05 = A05();
                                    A06();
                                    return;
                                default:
                                    return;
                            }
                        }
                }
            } else {
                A0B(3);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0A(byte b10, byte b11) {
        int i10 = A0G[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.A04.A04()) {
            int i11 = this.A02;
            String[] strArr = A0D;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "0Lleg";
            strArr2[0] = "zZ088";
            if (i11 != 1 && !this.A04.A0F()) {
                this.A04 = new C0949Ge(this.A02, this.A03);
                this.A0B.add(this.A04);
            }
            this.A04.A0C(i10);
        }
        boolean z10 = (b11 & 16) == 16;
        int i12 = (b11 >> 1) & 7;
        this.A04.A0E(z10 ? 8 : i12, (b11 & 1) == 1);
        if (z10) {
            this.A04.A0B(A0F[i12]);
        }
    }

    private void A0B(int i10) {
        if (this.A02 == i10) {
            return;
        }
        int i11 = this.A02;
        this.A02 = i10;
        A06();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.A05 = null;
        }
    }

    private void A0C(int i10) {
        this.A03 = i10;
        this.A04.A0A(i10);
    }

    public static boolean A0D(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean A0E(byte b10, byte b11) {
        boolean A0D2 = A0D(b10);
        if (A0D2) {
            if (this.A07 && this.A00 == b10 && this.A01 == b11) {
                this.A07 = false;
                return true;
            }
            this.A07 = true;
            this.A00 = b10;
            this.A01 = b11;
        }
        if (A0F(b10, b11)) {
            A08(b11);
        } else if (A0H(b10, b11)) {
            A0A(b10, b11);
        } else if (A0I(b10, b11)) {
            this.A04.A0D(b11 - 32);
        } else if (A0G(b10, b11)) {
            A09(b11);
        }
        return A0D2;
    }

    public static boolean A0F(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean A0G(byte b10, byte b11) {
        return (b10 & 247) == 20 && (b11 & 240) == 32;
    }

    public static boolean A0H(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean A0I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final GY A0L() {
        List<GX> list = this.A05;
        this.A06 = list;
        return new VP(list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final /* bridge */ /* synthetic */ C0856Bx A0M() throws GZ {
        return super.A4k();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final /* bridge */ /* synthetic */ AbstractC0848Bp A0N() throws GZ {
        return super.A4l();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final /* bridge */ /* synthetic */ void A0O(C0856Bx c0856Bx) throws GZ {
        super.ADW(c0856Bx);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final void A0P(C0856Bx c0856Bx) {
        this.A0A.A0b(c0856Bx.A01.array(), c0856Bx.A01.limit());
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            int A04 = this.A0A.A04();
            int i10 = this.A08;
            if (A04 >= i10) {
                byte A0E2 = i10 == 2 ? (byte) -4 : (byte) this.A0A.A0E();
                byte A0E3 = (byte) (this.A0A.A0E() & 127);
                byte A0E4 = (byte) (this.A0A.A0E() & 127);
                if ((A0E2 & 6) == 4 && (this.A09 != 1 || (A0E2 & 1) == 0)) {
                    if (this.A09 != 2 || (A0E2 & 1) == 1) {
                        if (A0E3 != 0 || A0E4 != 0) {
                            z10 = true;
                            if ((A0E3 & 247) == 17 && (A0E4 & 240) == 48) {
                                C0949Ge c0949Ge = this.A04;
                                char A03 = A03(A0E4);
                                String[] strArr = A0D;
                                if (strArr[4].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0D;
                                strArr2[4] = "p";
                                strArr2[7] = "B";
                                c0949Ge.A08(A03);
                            } else if ((A0E3 & 246) == 18 && (A0E4 & 224) == 32) {
                                this.A04.A06();
                                int i11 = A0E3 & 1;
                                String[] strArr3 = A0D;
                                if (strArr3[4].length() != strArr3[7].length()) {
                                    String[] strArr4 = A0D;
                                    strArr4[2] = "9HiUv";
                                    strArr4[0] = "jgZGy";
                                    if (i11 == 0) {
                                        this.A04.A08(A01(A0E4));
                                    } else {
                                        this.A04.A08(A02(A0E4));
                                    }
                                } else {
                                    String[] strArr5 = A0D;
                                    strArr5[3] = "JTanLGl8juahhTvO0cevOVMW4Tf5Dblj";
                                    strArr5[6] = "p0GbhYKTQLQ9v5Vn33otxdnR4fUxZFvy";
                                    if (i11 == 0) {
                                        this.A04.A08(A01(A0E4));
                                    } else {
                                        this.A04.A08(A02(A0E4));
                                    }
                                }
                            } else if ((A0E3 & 224) == 0) {
                                z11 = A0E(A0E3, A0E4);
                            } else {
                                this.A04.A08(A00(A0E3));
                                if ((A0E4 & 224) != 0) {
                                    this.A04.A08(A00(A0E4));
                                }
                            }
                        }
                    }
                }
            } else if (z10) {
                if (!z11) {
                    this.A07 = false;
                }
                int i12 = this.A02;
                if (i12 == 1 || i12 == 3) {
                    this.A05 = A05();
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo
    public final boolean A0R() {
        return this.A05 != this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo, com.facebook.ads.redexgen.X.InterfaceC0854Bv
    public final void ADm() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo, com.facebook.ads.redexgen.X.VS
    public final /* bridge */ /* synthetic */ void AEg(long j10) {
        super.AEg(j10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0847Bo, com.facebook.ads.redexgen.X.InterfaceC0854Bv
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0B(0);
        A0C(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
