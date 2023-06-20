package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.33  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends E4 implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public VS A03;
    public C0856Bx A04;
    public AbstractC0848Bp A05;
    public AbstractC0848Bp A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AZ A0A;
    public final InterfaceC0945Ga A0B;
    public final InterfaceC0946Gb A0C;

    public AnonymousClass33(InterfaceC0946Gb interfaceC0946Gb, Looper looper) {
        this(interfaceC0946Gb, looper, InterfaceC0945Ga.A00);
    }

    public AnonymousClass33(InterfaceC0946Gb interfaceC0946Gb, Looper looper, InterfaceC0945Ga interfaceC0945Ga) {
        super(3);
        this.A0C = (InterfaceC0946Gb) IK.A01(interfaceC0946Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0945Ga;
        this.A0A = new AZ();
    }

    private long A00() {
        int i10 = this.A01;
        if (i10 == -1 || i10 >= this.A06.A6c()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6b(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0848Bp abstractC0848Bp = this.A06;
        if (abstractC0848Bp != null) {
            abstractC0848Bp.A08();
            this.A06 = null;
        }
        AbstractC0848Bp abstractC0848Bp2 = this.A05;
        if (abstractC0848Bp2 != null) {
            abstractC0848Bp2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADm();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A05(List<GX> list) {
        this.A0C.AAS(list);
    }

    private void A06(List<GX> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A15(long j10, boolean z10) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        VS vs = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        vs.flush();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A17(Format[] formatArr, long j10) throws AM {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        A02();
        r9.A08 = true;
     */
    @Override // com.facebook.ads.redexgen.X.XG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ADz(long r10, long r12) throws com.facebook.ads.redexgen.X.AM {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass33.ADz(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0828Au
    public final int AF7(Format format) {
        if (this.A0B.AF8(format)) {
            return E4.A0x(null, format.A0H) ? 4 : 2;
        } else if (C0997Ic.A0A(format.A0O)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
