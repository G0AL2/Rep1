package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CE implements VW, InterfaceC0862Ce, InterfaceC0985Hq<C1327Va>, InterfaceC0988Ht, InterfaceC0939Fu {
    public static byte[] A0c;
    public static String[] A0d = {"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC0867Cl A07;
    @Nullable
    public VX A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final FU A0S;
    public final FV A0T;
    public final C0930Fl A0U;
    public final HW A0V;
    public final InterfaceC0975He A0W;
    @Nullable
    public final String A0b;
    public final C1323Uw A0X = new C1323Uw(A07(0, 27, 82));
    public final IQ A0Y = new IQ();
    public final Runnable A0Z = new FS(this);
    public final Runnable A0a = new FT(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public VV[] A0K = new VV[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            A0d[2] = "Up";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
            i13++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, 16, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    static {
        A0B();
    }

    public CE(Uri uri, InterfaceC0975He interfaceC0975He, InterfaceC0860Cc[] interfaceC0860CcArr, int i10, C0930Fl c0930Fl, FV fv, HW hw, @Nullable String str, int i11) {
        this.A0Q = uri;
        this.A0W = interfaceC0975He;
        this.A0O = i10;
        this.A0U = c0930Fl;
        this.A0T = fv;
        this.A0V = hw;
        this.A0b = str;
        this.A0P = i11;
        this.A0S = new FU(interfaceC0860CcArr, this);
        this.A00 = i10 == -1 ? 3 : i10;
        c0930Fl.A03();
    }

    private int A00() {
        VV[] vvArr;
        int i10 = 0;
        for (VV vv : this.A0K) {
            String[] strArr = A0d;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            i10 += vv.A0C();
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0985Hq
    /* renamed from: A01 */
    public final int ABI(C1327Va c1327Va, long j10, long j11, IOException iOException) {
        C0979Hi c0979Hi;
        long j12;
        long j13;
        boolean isErrorFatal = A0N(iOException);
        C0930Fl c0930Fl = this.A0U;
        c0979Hi = c1327Va.A03;
        j12 = c1327Va.A02;
        long j14 = this.A03;
        j13 = c1327Va.A00;
        c0930Fl.A0H(c0979Hi, 1, -1, null, 0, null, j12, j14, j10, j11, j13, iOException, isErrorFatal);
        A0E(c1327Va);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean z10 = A00 > this.A02;
        if (A0L(c1327Va, A00)) {
            return z10 ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        VV[] vvArr;
        long j10 = Long.MIN_VALUE;
        for (VV vv : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            A0d[6] = "ZyGj31aUIwj7oXhThZ";
            j10 = Math.max(j10, vv.A0F());
        }
        return j10;
    }

    public void A09() {
        VV[] vvArr;
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (VV sampleQueue : this.A0K) {
            if (sampleQueue.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6S();
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                Format A0G = this.A0K[i10].A0G();
                trackGroupArr[i10] = new TrackGroup(A0G);
                String str = A0G.A0O;
                if (!C0997Ic.A0B(str)) {
                    boolean A09 = C0997Ic.A09(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0d[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!A09) {
                        z10 = false;
                    }
                }
                this.A0N[i10] = z10;
                boolean isAudioVideo = this.A0A;
                this.A0A = isAudioVideo | z10;
                i10++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1 && this.A05 == -1 && this.A07.A6S() == -9223372036854775807L) {
                    this.A00 = 6;
                }
                this.A0F = true;
                this.A0T.ACL(this.A03, this.A07.A8g());
                this.A08.ABw(this);
                return;
            }
        }
    }

    private void A0A() {
        C0979Hi c0979Hi;
        long j10;
        C1327Va c1327Va = new C1327Va(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            IK.A04(A0I());
            long j11 = this.A03;
            if (j11 != -9223372036854775807L && this.A06 >= j11) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            c1327Va.A04(this.A07.A7O(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(c1327Va, this, this.A00);
        C0930Fl c0930Fl = this.A0U;
        c0979Hi = c1327Va.A03;
        j10 = c1327Va.A02;
        c0930Fl.A0E(c0979Hi, 1, -1, null, 0, null, j10, this.A03, A04);
    }

    private void A0C(int i10) {
        if (!this.A0M[i10]) {
            Format A01 = this.A09.A01(i10).A01(0);
            this.A0U.A06(C0997Ic.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i10] = true;
        }
    }

    private void A0D(int i10) {
        VV[] vvArr;
        if (!this.A0E || !this.A0N[i10] || this.A0K[i10].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (VV sampleQueue : this.A0K) {
            sampleQueue.A0I();
        }
        this.A08.AAP(this);
    }

    private void A0E(C1327Va c1327Va) {
        long j10;
        if (this.A05 != -1) {
            return;
        }
        j10 = c1327Va.A01;
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0985Hq
    /* renamed from: A0F */
    public final void ABH(C1327Va c1327Va, long j10, long j11) {
        C0979Hi c0979Hi;
        long j12;
        long j13;
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + A02;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0T.ACL(this.A03, this.A07.A8g());
        }
        C0930Fl c0930Fl = this.A0U;
        c0979Hi = c1327Va.A03;
        j12 = c1327Va.A02;
        long j14 = this.A03;
        j13 = c1327Va.A00;
        c0930Fl.A0G(c0979Hi, 1, -1, null, 0, null, j12, j14, j10, j11, j13);
        A0E(c1327Va);
        this.A0B = true;
        this.A08.AAP(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0985Hq
    /* renamed from: A0G */
    public final void ABF(C1327Va c1327Va, long j10, long j11, boolean z10) {
        C0979Hi c0979Hi;
        long j12;
        long j13;
        C0930Fl c0930Fl = this.A0U;
        c0979Hi = c1327Va.A03;
        j12 = c1327Va.A02;
        long j14 = this.A03;
        j13 = c1327Va.A00;
        c0930Fl.A0F(c0979Hi, 1, -1, null, 0, null, j12, j14, j10, j11, j13);
        if (!z10) {
            A0E(c1327Va);
            for (VV vv : this.A0K) {
                vv.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAP(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        if (!this.A0D) {
            boolean A0I = A0I();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!A0I) {
                return false;
            }
        }
        return true;
    }

    private boolean A0K(long j10) {
        int length = this.A0K.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return true;
            }
            VV sampleQueue = this.A0K[i10];
            sampleQueue.A0J();
            if ((sampleQueue.A0D(j10, true, false) != -1) || (!this.A0N[i10] && this.A0A)) {
                i10++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
        if (r7 != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0L(com.facebook.ads.redexgen.X.C1327Va r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A05
            r6 = 1
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L33
            com.facebook.ads.redexgen.X.Cl r0 = r9.A07
            if (r0 == 0) goto L3c
            long r7 = r0.A6S()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CE.A0d
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CE.A0d
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
        L33:
            r9.A02 = r11
            return r6
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            boolean r0 = r9.A0F
            r5 = 0
            if (r0 == 0) goto L65
            boolean r0 = r9.A0J()
            if (r0 != 0) goto L65
            r9.A0E = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.CE.A0d
            r0 = 4
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CE.A0d
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            return r5
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L65:
            boolean r0 = r9.A0F
            r9.A0D = r0
            r2 = 0
            r9.A04 = r2
            r9.A02 = r5
            com.facebook.ads.redexgen.X.VV[] r4 = r9.A0K
            int r1 = r4.length
        L72:
            if (r5 >= r1) goto L7c
            r0 = r4[r5]
            r0.A0I()
            int r5 = r5 + 1
            goto L72
        L7c:
            r10.A04(r2, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CE.A0L(com.facebook.ads.redexgen.X.Va, int):boolean");
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof VT;
    }

    public final int A0O(int skipCount, long j10) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        VV vv = this.A0K[skipCount];
        if (this.A0B && j10 > vv.A0F()) {
            A0D = vv.A0A();
        } else {
            A0D = vv.A0D(j10, true, true);
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(skipCount);
        } else {
            A0D(skipCount);
        }
        return A0D;
    }

    public final int A0P(int i10, AZ az, X2 x22, boolean z10) {
        if (A0J()) {
            return -3;
        }
        VV vv = this.A0K[i10];
        boolean z11 = this.A0B;
        long j10 = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        A0d[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int A0E = vv.A0E(az, x22, z10, z11, j10);
        if (A0E == -4) {
            A0C(i10);
        } else if (A0E == -3) {
            A0D(i10);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (VV vv : this.A0K) {
                vv.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i10) {
        return !A0J() && (this.A0B || this.A0K[i10].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final boolean A4A(long j10) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i10 = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i10 == 0) {
                return false;
            }
        }
        boolean A02 = this.A0Y.A02();
        if (!this.A0X.A08()) {
            A0A();
            String[] strArr = A0d;
            if (strArr[5].length() != strArr[0].length()) {
                A0d[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            A0d[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A4p(long j10, boolean z10) {
        int length = this.A0K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A0K[i10].A0K(j10, z10, this.A0L[i10]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0862Ce
    public final void A5D() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5e(long j10, C0831Ax c0831Ax) {
        if (!this.A07.A8g()) {
            return 0L;
        }
        C0866Ck A7O = this.A07.A7O(j10);
        return C1020Iz.A0I(j10, c0831Ax, A7O.A00.A01, A7O.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5t() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j10 = this.A06;
            if (A0d[6].length() == 18) {
                A0d[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j10;
            }
        } else {
            if (this.A0A) {
                A02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    A0d[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (this.A0N[i10]) {
                            VV vv = this.A0K[i10];
                            String[] strArr = A0d;
                            if (strArr[5].length() == strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A0d[7] = "ClOx81htkGLxdwhy5PY2qE";
                            A02 = Math.min(A02, vv.A0F());
                        }
                    }
                }
            } else {
                A02 = A02();
            }
            if (A02 == Long.MIN_VALUE) {
                return this.A04;
            }
            return A02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A71() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5t();
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final TrackGroupArray A7h() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A9Y() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0988Ht
    public final void ABM() {
        for (VV vv : this.A0K) {
            vv.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0939Fu
    public final void ACe(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADG(VX vx, long j10) {
        this.A08 = vx;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long ADb() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADi(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0862Ce
    public final void AEM(InterfaceC0867Cl interfaceC0867Cl) {
        this.A07 = interfaceC0867Cl;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long AEP(long j10) {
        VV[] vvArr;
        if (!this.A07.A8g()) {
            j10 = 0;
        }
        this.A04 = j10;
        this.A0D = false;
        if (!A0I() && A0K(j10)) {
            return j10;
        }
        this.A0E = false;
        this.A06 = j10;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (VV sampleQueue : this.A0K) {
                sampleQueue.A0I();
            }
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0108, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x010a, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x010d, code lost:
        if (r7 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x010f, code lost:
        r4[r7].A0H();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0122, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0125, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0128, code lost:
        if (r7 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x012a, code lost:
        r4[r7].A0I();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x015e, code lost:
        r12.A0X.A05();
     */
    @Override // com.facebook.ads.redexgen.X.VW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEQ(com.facebook.ads.redexgen.X.HQ[] r13, boolean[] r14, com.facebook.ads.redexgen.X.InterfaceC0940Fv[] r15, boolean[] r16, long r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CE.AEQ(com.facebook.ads.redexgen.X.HQ[], boolean[], com.facebook.ads.redexgen.X.Fv[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0862Ce
    public final InterfaceC0870Co AFD(int i10, int i11) {
        int length = this.A0K.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.A0J[i12] == i10) {
                return this.A0K[i12];
            }
        }
        VV vv = new VV(this.A0V);
        vv.A0L(this);
        this.A0J = Arrays.copyOf(this.A0J, length + 1);
        this.A0J[length] = i10;
        this.A0K = (VV[]) Arrays.copyOf(this.A0K, length + 1);
        this.A0K[length] = vv;
        return vv;
    }
}
