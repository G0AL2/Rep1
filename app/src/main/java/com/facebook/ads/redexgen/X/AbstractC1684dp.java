package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1684dp extends AbstractC05710f {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;
    @Nullable
    public final C05770m A01;
    public final boolean A02;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, 68, 70, 81, 76, 74, 75, 11, 115, 108, 96, 114, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC1684dp(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, @Nullable C05770m c05770m, boolean z10) {
        this(c1400Xy, interfaceC1028Jh, str, c05770m, z10, false);
    }

    public AbstractC1684dp(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, @Nullable C05770m c05770m, boolean z10, boolean z11) {
        super(c1400Xy, interfaceC1028Jh, str);
        this.A01 = c05770m;
        this.A02 = z10;
        this.A00 = z11;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05710f
    public final void A0C() {
        C05770m c05770m = this.A01;
        if (c05770m != null) {
            c05770m.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r4 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        r3 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1684dp.A07[6].length() == 8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        r2 = com.facebook.ads.redexgen.X.AbstractC1684dp.A07;
        r2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
        r2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
        if (r4 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.EnumC05700e r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1684dp.A0E(java.util.Map, com.facebook.ads.redexgen.X.0e):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), C1070La.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            }
            return LN.A0B(super.A00, intent);
        } catch (LL unused) {
            return false;
        }
    }
}
