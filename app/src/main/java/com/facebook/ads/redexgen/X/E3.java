package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import l6.c;

/* loaded from: assets/audience_network.dex */
public final class E3 implements XH {
    public static byte[] A0M;
    public static String[] A0N = {"FdQu0fmyjo2y", "53g7H5tUmq98heWq", c.f33710i, "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", InneractiveMediationDefs.GENDER_MALE, "Ea4pNsdJDJP"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    @Nullable
    public AM A05;
    public C0814Ag A06;
    public C0815Ah A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final E1 A0E;
    public final C0832Az A0F;
    public final B0 A0G;
    public final HT A0H;
    public final HU A0I;
    public final ArrayDeque<AQ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0818Ak> A0K;
    public final XG[] A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            A0N[7] = "NVWBbKH";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
            i13++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, 23, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, 17, 22, 11, 95, 27, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, 21, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public E3(XG[] xgArr, HT ht, InterfaceC0809Ab interfaceC0809Ab, IN in) {
        Log.i(A02(2, 13, 112), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + C1020Iz.A04 + A02(46, 1, 86));
        IK.A04(xgArr.length > 0);
        this.A0L = (XG[]) IK.A01(xgArr);
        this.A0H = (HT) IK.A01(ht);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new HU(new C0829Av[xgArr.length], new HQ[xgArr.length], null);
        this.A0G = new B0();
        this.A0F = new C0832Az();
        this.A07 = C0815Ah.A04;
        this.A0C = new AP(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A06 = new C0814Ag(B1.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new E1(xgArr, ht, this.A0I, interfaceC0809Ab, this.A0A, this.A03, this.A0B, this.A0C, this, in);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j10) {
        long A01 = AG.A01(j10);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return A01 + this.A0F.A08();
        }
        return A01;
    }

    private C0814Ag A01(boolean z10, boolean z11, int i10) {
        if (z10) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6I();
            this.A00 = A07();
            this.A04 = A6F();
        }
        C0814Ag c0814Ag = new C0814Ag(z11 ? B1.A01 : this.A06.A03, z11 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i10, false, z11 ? TrackGroupArray.A04 : this.A06.A05, z11 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0N[7] = "Xqr2ExcYOBi8j1Q";
        return c0814Ag;
    }

    private void A04(C0814Ag c0814Ag, int i10, boolean z10, int timelineChangeReason) {
        int i11;
        C0814Ag c0814Ag2 = c0814Ag;
        this.A02 -= i10;
        if (this.A02 == 0) {
            if (c0814Ag2.A02 == -9223372036854775807L) {
                c0814Ag2 = c0814Ag2.A04(c0814Ag2.A04, 0L, c0814Ag2.A01);
            }
            if (!this.A06.A03.A0E() || this.A08) {
                B1 b12 = c0814Ag2.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    A0N[7] = "oGDG41JiAsT7PCq0";
                    if (b12.A0E()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr2 = A0N;
                        if (strArr2[6].length() == strArr2[2].length()) {
                            String[] strArr3 = A0N;
                            strArr3[1] = "vrOcQin3pszluGLq";
                            strArr3[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A08) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            boolean z11 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c0814Ag2, z10, timelineChangeReason, i11, z11, false);
        }
    }

    private void A05(C0814Ag c0814Ag, boolean z10, int i10, int i11, boolean z11, boolean z12) {
        boolean z13 = !this.A0J.isEmpty();
        this.A0J.addLast(new AQ(c0814Ag, this.A06, this.A0K, this.A0H, z10, i10, i11, z11, this.A0A, z12));
        this.A06 = c0814Ag;
        if (z13) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i10) {
        A09(i10, -9223372036854775807L);
    }

    public final void A09(int i10, long j10) {
        long A00;
        B1 b12 = this.A06.A03;
        if (i10 >= 0) {
            boolean A0E = b12.A0E();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (A0E || i10 < b12.A01()) {
                    this.A09 = true;
                    this.A02++;
                    boolean A0B = A0B();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (A0B) {
                            String A02 = A02(2, 13, 112);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                A0N[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(A02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i10;
                            if (b12.A0E()) {
                                int i11 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                A0N[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = i11 == 0 ? 0L : j10;
                                this.A00 = 0;
                            } else {
                                if (j10 == -9223372036854775807L) {
                                    A00 = b12.A0B(i10, this.A0G).A01();
                                } else {
                                    A00 = AG.A00(j10);
                                }
                                Pair<Integer, Long> A07 = b12.A07(this.A0G, this.A0F, i10, A00);
                                this.A04 = AG.A01(A00);
                                this.A00 = ((Integer) A07.first).intValue();
                            }
                            this.A0E.A0y(b12, i10, AG.A00(j10));
                            Iterator<InterfaceC0818Ak> it = this.A0K.iterator();
                            while (it.hasNext()) {
                                InterfaceC0818Ak next = it.next();
                                String[] strArr4 = A0N;
                                if (strArr4[4].length() != strArr4[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[1] = "l5NWk5x9vooO50uu";
                                strArr5[3] = "FcAzQ8glamB386Jq";
                                next.ABu(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new C0808Aa(b12, i10, j10);
    }

    public final void A0A(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            A04((C0814Ag) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i10 != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                A0N[5] = "7KT5lT3IIkvardi0cOE285";
                if (i10 == 2) {
                    AM am = (AM) message.obj;
                    this.A05 = am;
                    Iterator<InterfaceC0818Ak> it = this.A0K.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String[] strArr2 = A0N;
                        if (strArr2[4].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        A0N[7] = "lr70Wm3MPuK1";
                        if (hasNext) {
                            it.next().ABq(am);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            C0815Ah c0815Ah = (C0815Ah) message.obj;
            if (!this.A07.equals(c0815Ah)) {
                this.A07 = c0815Ah;
                CopyOnWriteArraySet<InterfaceC0818Ak> copyOnWriteArraySet = this.A0K;
                String[] strArr3 = A0N;
                if (strArr3[6].length() == strArr3[2].length()) {
                    String[] strArr4 = A0N;
                    strArr4[1] = "XPkhdR3hZ8JGZkbg";
                    strArr4[3] = "HitM1md97HqEAHyx";
                    Iterator<InterfaceC0818Ak> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().ABo(c0815Ah);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void A3E(InterfaceC0818Ak interfaceC0818Ak) {
        this.A0K.add(interfaceC0818Ak);
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final C0826As A4L(InterfaceC0825Ar interfaceC0825Ar) {
        return new C0826As(this.A0E, interfaceC0825Ar, this.A06.A03, A6I(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A5r() {
        long A5s = A5s();
        long A6R = A6R();
        if (A5s != -9223372036854775807L) {
            int i10 = (A6R > (-9223372036854775807L) ? 1 : (A6R == (-9223372036854775807L) ? 0 : -1));
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = "n";
            if (i10 != 0) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (A6R == 0) {
                    return 100;
                }
                return C1020Iz.A06((int) ((100 * A5s) / A6R), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A5s() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6A() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AG.A01(this.A06.A01);
        }
        return A6F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6C() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6D() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6F() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final B1 A6H() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6I() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6R() {
        B1 b12 = this.A06.A03;
        if (b12.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            FY fy = this.A06.A04;
            b12.A09(fy.A02, this.A0F);
            return AG.A01(this.A0F.A0A(fy.A00, fy.A01));
        }
        return b12.A0B(A6I(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final boolean A7D() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final void ADH(InterfaceC0919Fa interfaceC0919Fa, boolean z10, boolean z11) {
        this.A05 = null;
        C0814Ag A01 = A01(z10, z11, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC0919Fa, z10, z11);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void ADm() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A02(38, 8, 2));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(A02(0, 2, 7));
        sb2.append(A02(15, 18, 78));
        String A02 = A02(47, 3, 94);
        sb2.append(A02);
        sb2.append(C1020Iz.A04);
        sb2.append(A02);
        sb2.append(AW.A00());
        sb2.append(A02(46, 1, 86));
        Log.i(A02(2, 13, 112), sb2.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEN(long j10) {
        A09(A6I(), j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEO() {
        A08(A6I());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEe(boolean z10) {
        if (this.A0A != z10) {
            this.A0A = z10;
            this.A0E.A10(z10);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AF4(boolean z10) {
        if (z10) {
            this.A05 = null;
        }
        C0814Ag A01 = A01(z10, z10, 1);
        this.A02++;
        this.A0E.A11(z10);
        A05(A01, false, 4, 1, false, false);
    }
}
