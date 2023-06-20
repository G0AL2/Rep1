package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class XL<T> implements InterfaceC07999r<T> {
    public static byte[] A06;
    public C07929j A00;
    public C07929j A01;
    public List<XL<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C07919i A04;
    public final C08069y A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, 26, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, 11, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, 26, 29, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, 25, -47, 21, 18, 37, 18, -47, 23, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, 21, 24, 10, -20, 15, 18, 11, -24, 7, 25, 11, 10, -8, 11, 9, 21, 24, 10, -22, 7, 26, 7, 8, 7, 25, 11, -58, 15, 25, -58, 9, 18, 21, 25, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, 29, 26, 27, 23, 26, 5, 2, 21, 2};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XL(C07969o c07969o, InterfaceC08049w interfaceC08049w) throws IOException {
        this.A05 = new C08069y(c07969o.A04(A00(515, 4, 63)), interfaceC08049w);
        this.A04 = new C07919i(new File(c07969o.A05(), A00(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, 6, 70)));
        this.A00 = this.A04.A03();
        A05(interfaceC08049w);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i10, int i11) throws IOException {
        this.A00 = new C07929j(i10, i11);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XL<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(XM xm) throws A0 {
        if (!this.A03) {
            if (A06(xm)) {
                if (xm.A5N() == 0) {
                    return;
                }
                if (this.A00.A04(xm.A00().A02) == 0) {
                    try {
                        for (C08039v c08039v : xm.A00) {
                            if (c08039v.A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), xm.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e10) {
                        throw new A0(A00(361, 30, 93), e10);
                    }
                }
                throw new A0(A00(0, 54, 63));
            }
            throw new A0(A00(466, 43, 49));
        }
        throw new A0(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(InterfaceC08049w interfaceC08049w) throws IOException {
        C07929j c07929j = new C07929j(this.A05.A06(), 0);
        if (c07929j.A04(this.A00) > 0) {
            interfaceC08049w.AE4(String.format(Locale.US, A00(54, 102, 53), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c07929j.A02()), Integer.valueOf(c07929j.A03())));
            this.A00 = c07929j;
            return;
        }
        while (c07929j.A02() < this.A00.A02()) {
            if (this.A05.A0D()) {
                c07929j = new C07929j(this.A05.A06(), 0);
            } else {
                interfaceC08049w.AE4(String.format(Locale.US, A00(156, 101, 13), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c07929j.A02())));
                this.A00 = new C07929j(this.A05.A06(), this.A05.A07());
                this.A04.A04(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XL<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(XM xm) {
        if (!this.A02.remove(xm)) {
            return false;
        }
        if (xm.A5N() > 0 && xm.A01().A02.A05(xm.A01().A01).equals(this.A01)) {
            this.A01 = xm.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07999r
    public final synchronized InterfaceC07989q A5M(byte[] bArr, int[] iArr) throws A0 {
        XL<T>.RecordFileBasedFetch xm;
        if (!this.A03) {
            int i10 = 0;
            int i11 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                while (true) {
                    C07949m A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i10, iArr, i11);
                    int A00 = A0A.A01().A00() - A0A.A01().A01();
                    i10 += A0A.A01().A02();
                    i11 += A00;
                    if (A0A.A01().A03() == EnumC07939k.A02) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == EnumC07939k.A03) {
                        break;
                    } else if (A0A.A01().A03() == EnumC07939k.A04) {
                        if (this.A05.A06() + this.A05.A08() != this.A01.A02() + 1) {
                            this.A01 = new C07929j(this.A01.A02() + 1, 0);
                        } else {
                            z10 = false;
                            break;
                        }
                    } else {
                        this.A01 = this.A01.A05(A00);
                    }
                }
                xm = new XM(this, arrayList, z10);
                this.A02.add(xm);
                if (!arrayList.isEmpty()) {
                    this.A01 = xm.A01().A02.A05(xm.A01().A01);
                }
            } catch (IOException e10) {
                throw new A0(A00(306, 29, 79), e10);
            }
        } else {
            throw new A0(A00(391, 36, 119));
        }
        return xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07999r
    public final synchronized int A7I() throws A0 {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                if (this.A00.A02() == this.A05.A06()) {
                    A09 -= this.A00.A03();
                }
            } catch (IOException e10) {
                throw new A0(A00(335, 26, 122), e10);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07999r
    public final synchronized void AF5(byte[] bArr) throws A0 {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e10) {
                throw new A0(A00(257, 25, 61), e10);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07999r
    public final synchronized void clear() throws A0 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new A0(A00(282, 24, 16), e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
