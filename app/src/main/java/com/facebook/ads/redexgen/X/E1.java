package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class E1 implements Handler.Callback, VX, HS, FZ, AJ, InterfaceC0824Aq {
    public static byte[] A0V;
    public static String[] A0W = {"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AV A04;
    public C0814Ag A05;
    public InterfaceC0919Fa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public XG[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XJ A0G;
    public final XH A0H;
    public final InterfaceC0809Ab A0J;
    public final C0832Az A0L;
    public final B0 A0M;
    public final HT A0N;
    public final HU A0O;
    public final IN A0P;
    public final IX A0Q;
    public final ArrayList<AT> A0R;
    public final boolean A0S;
    public final XG[] A0T;
    public final InterfaceC0828Au[] A0U;
    public final C0812Ae A0K = new C0812Ae();
    public C0831Ax A06 = C0831Ax.A03;
    public final AU A0I = new AU(null);

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, 63, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, 14, 3, 27, 0, 3, 1, 9, 66, 7, 16, 16, 13, 16, 76, 102, 90, 64, 71, 86, 80, 21, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, Byte.MAX_VALUE, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    static {
        A0K();
    }

    public E1(XG[] xgArr, HT ht, HU hu, InterfaceC0809Ab interfaceC0809Ab, boolean z10, int i10, boolean z11, Handler handler, XH xh, IN in) {
        this.A0T = xgArr;
        this.A0N = ht;
        this.A0O = hu;
        this.A0J = interfaceC0809Ab;
        this.A08 = z10;
        this.A02 = i10;
        this.A0B = z11;
        this.A0E = handler;
        this.A0H = xh;
        this.A0P = in;
        this.A0D = interfaceC0809Ab.A5m();
        this.A0S = interfaceC0809Ab.AED();
        this.A05 = new C0814Ag(B1.A01, -9223372036854775807L, TrackGroupArray.A04, hu);
        this.A0U = new InterfaceC0828Au[xgArr.length];
        for (int i11 = 0; i11 < xgArr.length; i11++) {
            xgArr[i11].AEZ(i11);
            this.A0U[i11] = xgArr[i11].A5y();
        }
        this.A0G = new XJ(this, in);
        this.A0R = new ArrayList<>();
        this.A0C = new XG[0];
        this.A0M = new B0();
        this.A0L = new C0832Az();
        ht.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = in.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        B1 b12 = this.A05.A03;
        if (b12.A0E()) {
            return 0;
        }
        return b12.A0B(b12.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i10, B1 b12, B1 b13) {
        int maxIterations = i10;
        int i11 = -1;
        int A00 = b12.A00();
        for (int i12 = 0; i12 < A00 && i11 == -1; i12++) {
            maxIterations = b12.A03(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            i11 = b13.A04(b12.A0A(maxIterations, this.A0L, true).A03);
        }
        return i11;
    }

    private long A02(FY fy, long j10) throws AM {
        return A03(fy, j10, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(FY fy, long j10, boolean z10) throws AM {
        A0H();
        this.A09 = false;
        A0N(2);
        C0810Ac A0G = this.A0K.A0G();
        C0810Ac newPlayingPeriodHolder = A0G;
        while (true) {
            if (newPlayingPeriodHolder == null) {
                break;
            } else if (A0t(fy, j10, newPlayingPeriodHolder)) {
                this.A0K.A0S(newPlayingPeriodHolder);
                break;
            } else {
                newPlayingPeriodHolder = this.A0K.A0C();
            }
        }
        if (A0G != newPlayingPeriodHolder || z10) {
            XG[] xgArr = this.A0C;
            if (A0W[5].length() == 18) {
                A0W[4] = "MfZ5b0v7S5HL";
                for (XG xg : xgArr) {
                    if (A0W[6].charAt(23) == 'j') {
                        break;
                    }
                    A0W[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                    A0b(xg);
                }
                this.A0C = new XG[0];
                A0G = null;
            }
            throw new RuntimeException();
        }
        if (newPlayingPeriodHolder != null) {
            A0V(A0G);
            boolean z11 = newPlayingPeriodHolder.A05;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                A0W[5] = "xpv6IUpjcorvZnU437";
                if (z11) {
                    j10 = newPlayingPeriodHolder.A08.AEP(j10);
                    newPlayingPeriodHolder.A08.A4p(j10 - this.A0D, this.A0S);
                }
                A0P(j10);
                A09();
            }
            throw new RuntimeException();
        }
        this.A0K.A0O(true);
        A0P(j10);
        this.A0Q.AER(2);
        return j10;
    }

    private Pair<Integer, Long> A04(AV av, boolean z10) {
        int A01;
        B1 b12 = this.A05.A03;
        B1 b13 = av.A02;
        if (b12.A0E()) {
            return null;
        }
        if (b13.A0E()) {
            b13 = b12;
        }
        try {
            Pair<Integer, Long> A07 = b13.A07(this.A0M, this.A0L, av.A00, av.A01);
            if (b12 == b13) {
                return A07;
            }
            int A04 = b12.A04(b13.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                Integer valueOf = Integer.valueOf(A04);
                Object obj = A07.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[4] = "NzmvKaw5D7qN";
                return Pair.create(valueOf, (Long) obj);
            } else if (!z10 || (A01 = A01(((Integer) A07.first).intValue(), b13, b12)) == -1) {
                return null;
            } else {
                int i10 = b12.A09(A01, this.A0L).A00;
                String[] strArr = A0W;
                if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                    A0W[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
                    return A05(b12, i10, -9223372036854775807L);
                }
                return A05(b12, i10, -9223372036854775807L);
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C0808Aa(b12, av.A00, av.A01);
        }
    }

    private Pair<Integer, Long> A05(B1 b12, int i10, long j10) {
        return b12.A07(this.A0M, this.A0L, i10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
        if (r16.A05.A00 == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
        if (r16.A05.A00 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
        A0R(r2, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
        com.facebook.ads.redexgen.X.C1017Iw.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ac, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
        if (r16.A0C.length == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
        if (r16.A05.A00 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
        A0R(r2, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
        r16.A0Q.ADw(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.facebook.ads.redexgen.X.AM, java.io.IOException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A07():void");
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C0810Ac A0F = this.A0K.A0F();
        long A06 = A0F.A06();
        if (A06 == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        long bufferedDurationUs = A06 - A0F.A08(this.A03);
        boolean AEl = this.A0J.AEl(bufferedDurationUs, this.A0G.A7E().A01);
        A0k(AEl);
        if (AEl) {
            long nextLoadPositionUs = this.A03;
            A0F.A0F(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i10;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int A00 = AU.A00(this.A0I);
            if (AU.A02(this.A0I)) {
                i10 = AU.A01(this.A0I);
            } else {
                i10 = -1;
            }
            handler.obtainMessage(0, A00, i10, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        XG[] xgArr;
        C0810Ac A0F = this.A0K.A0F();
        C0810Ac A0H = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (A0H != null) {
                C0810Ac readingPeriodHolder = A0H.A01;
                if (readingPeriodHolder != A0F) {
                    return;
                }
            }
            for (XG renderer : this.A0C) {
                if (!renderer.A84()) {
                    return;
                }
            }
            A0F.A08.A9Y();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C0811Ad A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.A9Z();
                return;
            }
            this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5h(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I).ADG(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.AC5();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws AM {
        if (!this.A0K.A0P()) {
            return;
        }
        float f10 = this.A0G.A7E().A01;
        C0810Ac A0H = this.A0K.A0H();
        boolean z10 = true;
        for (C0810Ac A0G = this.A0K.A0G(); A0G != null; A0G = A0G.A01) {
            boolean selectionsChangedForReadPeriod = A0G.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!A0G.A0I(f10)) {
                if (A0G == A0H) {
                    z10 = false;
                }
            } else {
                if (z10) {
                    C0810Ac A0G2 = this.A0K.A0G();
                    boolean A0S = this.A0K.A0S(A0G2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                    A0i(A0G2.A03, A0G2.A04);
                    if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                        C0814Ag c0814Ag = this.A05;
                        this.A05 = c0814Ag.A04(c0814Ag.A04, A0B, this.A05.A01);
                        this.A0I.A04(4);
                        A0P(A0B);
                    }
                    int i10 = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i11 = 0;
                    while (true) {
                        XG[] xgArr = this.A0T;
                        if (i11 >= xgArr.length) {
                            this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                            A0p(zArr2, i10);
                            break;
                        }
                        XG xg = xgArr[i11];
                        zArr2[i11] = xg.A7W() != 0;
                        InterfaceC0940Fv interfaceC0940Fv = A0G2.A0A[i11];
                        if (interfaceC0940Fv != null) {
                            i10++;
                        }
                        if (zArr2[i11]) {
                            InterfaceC0940Fv A7b = xg.A7b();
                            if (A0W[4].length() == 29) {
                                throw new RuntimeException();
                            }
                            A0W[4] = "CIOLNyaJNw";
                            if (interfaceC0940Fv != A7b) {
                                A0b(xg);
                            } else if (zArr[i11]) {
                                xg.AEC(this.A03);
                            }
                        }
                        i11++;
                    }
                } else {
                    this.A0K.A0S(A0G);
                    if (A0G.A06) {
                        A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                        A0i(A0G.A03, A0G.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.AER(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws AM {
        this.A09 = false;
        this.A0G.A05();
        for (XG xg : this.A0C) {
            xg.start();
        }
    }

    private void A0H() throws AM {
        this.A0G.A06();
        for (XG xg : this.A0C) {
            A0c(xg);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d6, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01de, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r4.A02.A05 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r5 >= r2.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r3 = r2[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r0 = r3.A7b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r0 != r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (r3.A84() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        r3.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r4.A01 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r4.A01.A06 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r7 = r1.A0T;
        r6 = r7.length;
        r2 = com.facebook.ads.redexgen.X.E1.A0W[3].charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        if (r2 == 99) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
        com.facebook.ads.redexgen.X.E1.A0W[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r5 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r3 = r7[r5];
        r2 = r4.A0A[r5];
        r0 = r3.A7b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r0 != r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
        if (r3.A84() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        r3 = com.facebook.ads.redexgen.X.E1.A0W;
        r3[1] = "W3Zxvi1uQeiwcOM1a3uIixoX4KFWrQEX";
        r3[2] = "hMjrL9hJ9zdobOz7Vqnbeo3Jken9e002";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r5 >= r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        r8 = r4.A04;
        r7 = r1.A0K.A0D();
        r6 = r7.A04;
        r4 = (r7.A08.ADb() > (-9223372036854775807L) ? 1 : (r7.A08.ADb() == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
        if (com.facebook.ads.redexgen.X.E1.A0W[4].length() == 29) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
        com.facebook.ads.redexgen.X.E1.A0W[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r4 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
        r2 = r1.A0T;
        r0 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
        if (r5 >= r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
        r4 = r2[r5];
        r0 = r8.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r0 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
        if (r13 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (r4.A8O() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
        r12 = r6.A01.A00(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
        if (r1.A0U[r5].A7i() != 5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017a, code lost:
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.X.E1.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
        com.facebook.ads.redexgen.X.E1.A0W[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
        if (r11 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
        if (r0.equals(r3) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
        if (r10 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r3 = A0v(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
        if (com.facebook.ads.redexgen.X.E1.A0W[3].charAt(0) == 'c') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
        com.facebook.ads.redexgen.X.E1.A0W[5] = "P6QWonkpaKbLAx4pgk";
        r4.AE1(r3, r9[r5], r7.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cc, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
        if (r4 == 0) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.X.AM, java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A0I():void");
    }

    private void A0J() throws AM {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C0810Ac A0G = this.A0K.A0G();
        long ADb = A0G.A08.ADb();
        if (ADb != -9223372036854775807L) {
            A0P(ADb);
            long periodPositionUs = this.A05.A0A;
            if (ADb != periodPositionUs) {
                C0814Ag c0814Ag = this.A05;
                this.A05 = c0814Ag.A04(c0814Ag.A04, ADb, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C0814Ag c0814Ag2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c0814Ag2.A09 = A0C;
    }

    private void A0L(float f10) {
        HQ[] A01;
        for (C0810Ac A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A04 != null) {
                for (HQ trackSelection : A0E.A04.A01.A01()) {
                    if (trackSelection != null) {
                        trackSelection.ABp(f10);
                    }
                }
            }
        }
    }

    private void A0M(int i10) throws AM {
        this.A02 = i10;
        if (!this.A0K.A0R(i10)) {
            A0j(true);
        }
    }

    private void A0N(int i10) {
        if (this.A05.A00 != i10) {
            this.A05 = this.A05.A02(i10);
        }
    }

    private void A0O(int i10, boolean z10, int i11) throws AM {
        C0810Ac A0G = this.A0K.A0G();
        XG xg = this.A0T[i10];
        this.A0C[i11] = xg;
        if (xg.A7W() == 0) {
            C0829Av c0829Av = A0G.A04.A03[i10];
            Format[] A0v = A0v(A0G.A04.A01.A00(i10));
            boolean z11 = this.A08 && this.A05.A00 == 3;
            xg.A5A(c0829Av, A0v, A0G.A0A[i10], this.A03, !z10 && z11, A0G.A07());
            this.A0G.A09(xg);
            if (z11) {
                xg.start();
            }
        }
    }

    private void A0P(long j10) throws AM {
        if (this.A0K.A0P()) {
            C0810Ac A0G = this.A0K.A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j10 = A0G.A09(j10);
        }
        this.A03 = j10;
        this.A0G.A07(this.A03);
        for (XG xg : this.A0C) {
            xg.AEC(this.A03);
        }
    }

    private void A0Q(long j10, long j11) throws AM {
        AT at;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j10) {
            j10--;
        }
        int i10 = this.A05.A04.A02;
        int i11 = this.A00;
        AT at2 = i11 > 0 ? this.A0R.get(i11 - 1) : null;
        while (at2 != null) {
            if (at2.A00 <= i10) {
                int i12 = at2.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i12 == i10) {
                    if (at2.A01 <= j10) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.A00--;
            int i13 = this.A00;
            at2 = i13 > 0 ? this.A0R.get(i13 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            at = this.A0R.get(this.A00);
        } else {
            at = null;
        }
        while (at != null && at.A02 != null && (at.A00 < i10 || (at.A00 == i10 && at.A01 <= j10))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
        while (at != null && at.A02 != null && at.A00 == i10 && at.A01 > j10 && at.A01 <= j11) {
            A0Z(at.A03);
            if (at.A03.A0B() || at.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
    }

    private void A0R(long j10, long j11) {
        this.A0Q.ADw(2);
        this.A0Q.AES(2, j10 + j11);
    }

    private void A0S(AS as) throws AM {
        Object playingPeriodUid;
        if (as.A01 != this.A07) {
            return;
        }
        B1 b12 = this.A05.A03;
        B1 b13 = as.A00;
        Object manifest = as.A02;
        this.A0K.A0N(b13);
        this.A05 = this.A05.A03(b13, manifest);
        A0F();
        int i10 = this.A01;
        if (i10 > 0) {
            this.A0I.A03(i10);
            this.A01 = 0;
            AV av = this.A04;
            if (av != null) {
                Pair<Integer, Long> A04 = A04(av, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                FY A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            } else if (this.A05.A02 != -9223372036854775807L) {
                return;
            } else {
                boolean A0E = b13.A0E();
                String[] strArr = A0W;
                if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                    throw new RuntimeException();
                }
                A0W[4] = "lH2oXw2RUPBHBuRA0";
                if (A0E) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(b13, b13.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                FY A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            }
        }
        int i11 = this.A05.A04.A02;
        long j10 = this.A05.A01;
        if (b12.A0E()) {
            if (!b13.A0E()) {
                FY A0L3 = this.A0K.A0L(i11, j10);
                C0814Ag c0814Ag = this.A05;
                long startPositionUs = A0L3.A01() ? 0L : j10;
                this.A05 = c0814Ag.A04(A0L3, startPositionUs, j10);
                return;
            }
            return;
        }
        C0810Ac A0E2 = this.A0K.A0E();
        if (A0E2 == null) {
            C0832Az c0832Az = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr2 = A0W;
                strArr2[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr2[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = b12.A0A(i11, c0832Az, true).A03;
            } else {
                A0W[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = b12.A0A(i11, c0832Az, true).A03;
            }
        } else {
            playingPeriodUid = A0E2.A09;
        }
        int A042 = b13.A04(playingPeriodUid);
        if (A042 == -1) {
            int A01 = A01(i11, b12, b13);
            if (A01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> A052 = A05(b13, b13.A09(A01, this.A0L).A00, -9223372036854775807L);
            int intValue3 = ((Integer) A052.first).intValue();
            long longValue3 = ((Long) A052.second).longValue();
            FY A0L4 = this.A0K.A0L(intValue3, longValue3);
            b13.A0A(intValue3, this.A0L, true);
            if (A0E2 != null) {
                Object obj = this.A0L.A03;
                A0E2.A02 = A0E2.A02.A00(-1);
                while (A0E2.A01 != null) {
                    A0E2 = A0E2.A01;
                    if (A0E2.A09.equals(obj)) {
                        A0E2.A02 = this.A0K.A0J(A0E2.A02, intValue3);
                    } else {
                        A0E2.A02 = A0E2.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : longValue3), longValue3);
            return;
        }
        if (A042 != i11) {
            C0814Ag A012 = this.A05.A01(A042);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = A012;
        }
        FY fy = this.A05.A04;
        if (fy.A01()) {
            FY A0L5 = this.A0K.A0L(A042, j10);
            if (!A0L5.equals(fy)) {
                this.A05 = this.A05.A04(A0L5, A02(A0L5, A0L5.A01() ? 0L : j10), j10);
                return;
            }
        }
        if (!this.A0K.A0U(fy, this.A03)) {
            A0j(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.X.AV r20) throws com.facebook.ads.redexgen.X.AM {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A0T(com.facebook.ads.redexgen.X.AV):void");
    }

    private void A0V(@Nullable C0810Ac c0810Ac) throws AM {
        C0810Ac A0G = this.A0K.A0G();
        if (A0G == null || c0810Ac == A0G) {
            return;
        }
        int i10 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i11 = 0;
        while (true) {
            XG[] xgArr = this.A0T;
            if (i11 >= xgArr.length) {
                break;
            }
            XG xg = xgArr[i11];
            zArr[i11] = xg.A7W() != 0;
            if (A0G.A04.A00(i11)) {
                i10++;
            }
            if (zArr[i11] && (!A0G.A04.A00(i11) || (xg.A8O() && xg.A7b() == c0810Ac.A0A[i11]))) {
                A0b(xg);
            }
            i11++;
        }
        C0814Ag c0814Ag = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = c0814Ag.A05(A0G.A03, A0G.A04);
        A0p(zArr, i10);
    }

    private void A0W(C0815Ah c0815Ah) {
        this.A0G.AEf(c0815Ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C0826As c0826As) throws AM {
        if (c0826As.A0D()) {
            return;
        }
        try {
            c0826As.A04().A7z(c0826As.A00(), c0826As.A09());
        } finally {
            c0826As.A0A(true);
        }
    }

    private void A0Y(C0826As c0826As) throws AM {
        if (c0826As.A02() == -9223372036854775807L) {
            A0Z(c0826As);
        } else if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new AT(c0826As));
        } else {
            AT at = new AT(c0826As);
            if (A0r(at)) {
                ArrayList<AT> arrayList = this.A0R;
                String[] strArr = A0W;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0W[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
                arrayList.add(at);
                Collections.sort(this.A0R);
                return;
            }
            c0826As.A0A(false);
        }
    }

    private void A0Z(C0826As c0826As) throws AM {
        if (c0826As.A03().getLooper() == this.A0Q.A6v()) {
            A0X(c0826As);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AER(2);
                return;
            }
            return;
        }
        this.A0Q.A9m(15, c0826As).sendToTarget();
    }

    private void A0a(C0826As c0826As) {
        c0826As.A03().post(new AR(this, c0826As));
    }

    private void A0b(XG xg) throws AM {
        this.A0G.A08(xg);
        A0c(xg);
        xg.A4n();
    }

    private void A0c(XG xg) throws AM {
        if (xg.A7W() == 2) {
            xg.stop();
        }
    }

    private void A0d(C0831Ax c0831Ax) {
        this.A06 = c0831Ax;
    }

    private void A0e(VW vw) {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(VW vw) throws AM {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        C0810Ac A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7E().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            A0P(this.A0K.A0C().A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0941Fw
    /* renamed from: A0g */
    public final void AAP(VW vw) {
        this.A0Q.A9m(10, vw).sendToTarget();
    }

    private void A0h(InterfaceC0919Fa interfaceC0919Fa, boolean z10, boolean z11) {
        this.A01++;
        A0o(true, z10, z11);
        this.A0J.onPrepared();
        this.A07 = interfaceC0919Fa;
        A0N(2);
        interfaceC0919Fa.ADJ(this.A0H, true, this);
        this.A0Q.AER(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, HU hu) {
        this.A0J.ACZ(this.A0T, trackGroupArray, hu.A01);
    }

    private void A0j(boolean z10) throws AM {
        FY fy = this.A0K.A0G().A02.A04;
        long A03 = A03(fy, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (A03 != newPositionUs) {
            C0814Ag c0814Ag = this.A05;
            this.A05 = c0814Ag.A04(fy, A03, c0814Ag.A01);
            if (z10) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z10) {
        if (this.A05.A08 != z10) {
            this.A05 = this.A05.A06(z10);
        }
    }

    private void A0l(boolean z10) throws AM {
        this.A09 = false;
        this.A08 = z10;
        if (!z10) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            this.A0Q.AER(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AER(2);
        }
    }

    private void A0m(boolean z10) throws AM {
        this.A0B = z10;
        if (!this.A0K.A0V(z10)) {
            A0j(true);
        }
    }

    private void A0n(boolean z10, boolean z11) {
        A0o(true, z10, z10);
        this.A0I.A03(this.A01 + (z11 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACR();
        A0N(1);
    }

    private void A0o(boolean z10, boolean z11, boolean z12) {
        XG[] xgArr;
        Object obj;
        long j10;
        TrackGroupArray trackGroupArray;
        HU hu;
        InterfaceC0919Fa interfaceC0919Fa;
        this.A0Q.ADw(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (XG renderer : this.A0C) {
            try {
                A0b(renderer);
            } catch (AM | RuntimeException e10) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e10);
            }
        }
        this.A0C = new XG[0];
        C0812Ae c0812Ae = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        c0812Ae.A0O(!z11);
        A0k(false);
        if (z11) {
            this.A04 = null;
        }
        if (z12) {
            this.A0K.A0N(B1.A01);
            Iterator<AT> it = this.A0R.iterator();
            while (it.hasNext()) {
                AT next = it.next();
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                next.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        B1 b12 = z12 ? B1.A01 : this.A05.A03;
        if (z12) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        FY fy = z11 ? new FY(A00()) : this.A05.A04;
        long j11 = -9223372036854775807L;
        if (z11) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.A05.A0A;
        }
        if (!z11) {
            j11 = this.A05.A01;
        }
        int i10 = this.A05.A00;
        if (z12) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            C0814Ag c0814Ag = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = c0814Ag.A05;
            } else {
                String[] strArr3 = A0W;
                strArr3[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr3[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = c0814Ag.A05;
            }
        }
        if (z12) {
            hu = this.A0O;
        } else {
            hu = this.A05.A06;
        }
        this.A05 = new C0814Ag(b12, obj, fy, j10, j11, i10, false, trackGroupArray, hu);
        if (z10 && (interfaceC0919Fa = this.A07) != null) {
            interfaceC0919Fa.ADt(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i10) throws AM {
        this.A0C = new XG[i10];
        int enabledRendererCount = 0;
        C0810Ac A0G = this.A0K.A0G();
        for (int i11 = 0; i11 < this.A0T.length; i11++) {
            if (A0G.A04.A00(i11)) {
                A0O(i11, zArr[i11], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C0810Ac A0G = this.A0K.A0G();
        long j10 = A0G.A02.A01;
        return j10 == -9223372036854775807L || this.A05.A0A < j10 || (A0G.A01 != null && (A0G.A01.A06 || A0G.A01.A02.A04.A01()));
    }

    private boolean A0r(AT at) {
        if (at.A02 == null) {
            Pair<Integer, Long> A04 = A04(new AV(at.A03.A08(), at.A03.A01(), AG.A00(at.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            at.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(at.A02);
            if (A042 == -1) {
                return false;
            }
            at.A00 = A042;
        }
        return true;
    }

    private boolean A0s(XG xg) {
        C0810Ac A0H = this.A0K.A0H();
        return A0H.A01 != null && A0H.A01.A06 && xg.A84();
    }

    private boolean A0t(FY fy, long j10, C0810Ac c0810Ac) {
        if (fy.equals(c0810Ac.A02.A04) && c0810Ac.A06) {
            this.A05.A03.A09(c0810Ac.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j10);
            if (A04 == -1 || this.A0L.A09(A04) == c0810Ac.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        r2 = r7.A0J;
        r0 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.AEo(r3 - r5.A08(r0), r7.A0G.A7E().A01, r7.A09) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0u(boolean r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.XG[] r0 = r7.A0C
            int r0 = r0.length
            if (r0 != 0) goto La
            boolean r0 = r7.A0q()
            return r0
        La:
            r6 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L23
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "XitCw2lYTMNoWfZ3MNfhmS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pjSmPGutCkFid20LDJR8Tk"
            r0 = 7
            r2[r0] = r1
            if (r8 != 0) goto L32
            return r6
        L32:
            com.facebook.ads.redexgen.X.Ag r0 = r7.A05
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L3a
            return r3
        L3a:
            com.facebook.ads.redexgen.X.Ae r0 = r7.A0K
            com.facebook.ads.redexgen.X.Ac r5 = r0.A0F()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
        L6a:
            com.facebook.ads.redexgen.X.Ab r2 = r7.A0J
            long r0 = r7.A03
            long r0 = r5.A08(r0)
            long r3 = r3 - r0
            com.facebook.ads.redexgen.X.XJ r0 = r7.A0G
            com.facebook.ads.redexgen.X.Ah r0 = r0.A7E()
            float r1 = r0.A01
            boolean r0 = r7.A09
            boolean r0 = r2.AEo(r3, r1, r0)
            if (r0 == 0) goto L84
        L83:
            r6 = 1
        L84:
            return r6
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A0u(boolean):boolean");
    }

    @NonNull
    public static Format[] A0v(HQ hq) {
        int length = hq != null ? hq.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = hq.A6h(i10);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AER(7);
        boolean z10 = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(B1 b12, int i10, long j10) {
        this.A0Q.A9m(3, new AV(b12, i10, j10)).sendToTarget();
    }

    public final void A0z(InterfaceC0919Fa interfaceC0919Fa, boolean z10, boolean z11) {
        this.A0Q.A9l(0, z10 ? 1 : 0, z11 ? 1 : 0, interfaceC0919Fa).sendToTarget();
    }

    public final void A10(boolean z10) {
        this.A0Q.A9k(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z10) {
        this.A0Q.A9k(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void ABo(C0815Ah c0815Ah) {
        this.A0E.obtainMessage(1, c0815Ah).sendToTarget();
        A0L(c0815Ah.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VX
    public final void ABw(VW vw) {
        this.A0Q.A9m(9, vw).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.FZ
    public final void ACM(InterfaceC0919Fa interfaceC0919Fa, B1 b12, Object obj) {
        this.A0Q.A9m(8, new AS(interfaceC0919Fa, b12, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0824Aq
    public final synchronized void AET(C0826As c0826As) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c0826As.A0A(false);
            return;
        }
        this.A0Q.A9m(14, c0826As).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0919Fa) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((AV) message.obj);
                    break;
                case 4:
                    A0W((C0815Ah) message.obj);
                    break;
                case 5:
                    A0d((C0831Ax) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((AS) message.obj);
                    break;
                case 9:
                    A0f((VW) message.obj);
                    break;
                case 10:
                    A0e((VW) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C0826As) message.obj);
                    break;
                case 15:
                    A0a((C0826As) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (AM e10) {
            Log.e(A06, A06(110, 15, 0), e10);
            A0n(false, false);
            this.A0E.obtainMessage(2, e10).sendToTarget();
            A0A();
        } catch (IOException e11) {
            Log.e(A06, A06(125, 13, 87), e11);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A00(e11)).sendToTarget();
            if (A0W[6].charAt(23) != 'j') {
                A0W[5] = "BLVAUEtDSJNWXrvjpr";
                A0A();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e12) {
            Log.e(A06, A06(87, 23, 108), e12);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A02(e12)).sendToTarget();
            A0A();
        }
        return true;
    }
}
