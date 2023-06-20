package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.Kk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1055Kk {
    public static byte[] A07;
    public static final MV A08;
    public static final Executor A09;
    public long A00;
    @Nullable
    public Kj A01;
    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C1400Xy A04;
    public final C1056Kl A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 107, 108, 51, 50, 57, 50, 59, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new MV();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C1055Kk(C1400Xy c1400Xy) {
        this(c1400Xy, C2E.A00(c1400Xy.A00()));
    }

    public C1055Kk(C1400Xy c1400Xy, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c1400Xy;
        this.A05 = C1056Kl.A00();
        this.A06 = C1059Ko.A01(c1400Xy);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R3 A03(long j10, C1053Kh c1053Kh) {
        return new U1(this, c1053Kh, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1400Xy c1400Xy = this.A04;
        if (c1400Xy == null || !RK.A0A(c1400Xy)) {
            return;
        }
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(8, 5, 107));
        anonymousClass90.A03(1);
        this.A04.A06().A8y(A05(86, 7, 111), C07828z.A1w, anonymousClass90);
    }

    private void A0B(int i10, String str) {
        String A05 = A05(93, 10, 22);
        KV.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        KV.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(KH kh) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.AAi(kh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(KH kh) {
        MM.A00(new C1300Tz(this, kh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C1299Ty c1299Ty) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.ACS(c1299Ty);
        }
    }

    private void A0L(C1299Ty c1299Ty) {
        InterfaceC07628a A04;
        MM.A00(new U0(this, c1299Ty));
        if (JR.A1m(this.A04) && (A04 = this.A04.A04()) != null) {
            A04.A5U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j10, C1053Kh c1053Kh) {
        String str2;
        try {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            C1058Kn A06 = this.A05.A06(this.A04, str, j10);
            C9H A00 = A06.A00();
            C1399Xx A002 = this.A04.A00();
            A002.A01().A8s(A002, str);
            if (A00 != null) {
                JR.A0O(this.A04).A2E(A00.A08());
                this.A04.A06().A9W();
                this.A03.A0N(A00.A06());
                Kg.A05(A00.A05().A0B(), c1053Kh);
                C1100Mg.A01(this.A04, A09, A00);
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(30, 7, 123) + C1086Ls.A02());
                anonymousClass90.A04(1);
                anonymousClass90.A08(false);
                this.A04.A06().A9Q(A05(79, 7, 56), C07828z.A1W, anonymousClass90);
            }
            int i10 = C1054Ki.A00[A06.A01().ordinal()];
            if (i10 == 1) {
                C1299Ty c1299Ty = (C1299Ty) A06;
                if (A00 != null) {
                    if (A00.A05().A0E()) {
                        Kg.A07(str, c1053Kh);
                    }
                    if (this.A02 != null) {
                        str2 = this.A02.get(A05(13, 17, 93));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                        this.A04.A01().AEA(this.A04, str2, A06.A02());
                    }
                }
                this.A04.A0D().A2k(MJ.A01(this.A00));
                A0L(c1299Ty);
            } else if (i10 != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0D(KH.A01(adErrorType, str));
            } else {
                C1298Tx c1298Tx = (C1298Tx) A06;
                String A04 = c1298Tx.A04();
                AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1298Tx.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c1298Tx.A03(), A04);
                if (A04 == null) {
                    A04 = str;
                }
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                A0D(KH.A01(adErrorTypeFromCode, A04));
            }
        } catch (Exception e11) {
            e = e11;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0D(KH.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, C1053Kh c1053Kh) {
        A09.execute(new U2(this, str, j10, c1053Kh));
    }

    public final void A0O(C1053Kh c1053Kh) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass98.A0B(this.A04);
        if (Kg.A08(c1053Kh)) {
            MX.A06.execute(new U4(this));
            String A02 = Kg.A02(c1053Kh);
            if (A02 != null) {
                this.A04.A0D().AFN();
                A0N(A02, 0L, c1053Kh);
                return;
            }
            AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
            A0D(KH.A01(adErrorType, null));
            return;
        }
        A09.execute(new U3(this, c1053Kh));
    }

    public final void A0P(Kj kj) {
        this.A01 = kj;
    }
}
