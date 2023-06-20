package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: com.facebook.ads.redexgen.X.Ek  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0903Ek extends AbstractC1396Xu<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C07648d A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public C0903Ek(C07648d c07648d, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c07648d;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07668g
    @Nullable
    /* renamed from: A00 */
    public final String A03() {
        C1399Xx c1399Xx;
        Lock lock;
        C1399Xx c1399Xx2;
        Lock lock2;
        C1399Xx c1399Xx3;
        Lock lock3;
        C1399Xx c1399Xx4;
        C1398Xw c1398Xw;
        C1397Xv c1397Xv;
        C1399Xx c1399Xx5;
        Lock lock4;
        String A01 = A01(0, 8, 12);
        c1399Xx = this.A03.A01;
        c1399Xx.A06().A8F(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C07648d.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1398Xw = this.A03.A02;
                c1397Xv = this.A03.A03;
                String A0E = c1398Xw.A0E(c1397Xv.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e10) {
                        c1399Xx5 = this.A03.A01;
                        c1399Xx5.A06().A8y(A01, C07828z.A0z, new AnonymousClass90(e10));
                    }
                }
                lock4 = C07648d.A08;
                String[] strArr3 = A09;
                String str = strArr3[0];
                String eventId = strArr3[3];
                if (str.length() != eventId.length()) {
                    String[] strArr4 = A09;
                    strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                    strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                    lock4.unlock();
                    return A0E;
                }
                throw new RuntimeException();
            } catch (Exception e11) {
                A01(EnumC07658f.A06);
                c1399Xx2 = this.A03.A01;
                c1399Xx2.A06().A8y(A01, C07828z.A0y, new AnonymousClass90(e11));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e12) {
                        c1399Xx3 = this.A03.A01;
                        c1399Xx3.A06().A8y(A01, C07828z.A0z, new AnonymousClass90(e12));
                    }
                }
                lock2 = C07648d.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e13) {
                    c1399Xx4 = this.A03.A01;
                    c1399Xx4.A06().A8y(A01, C07828z.A0z, new AnonymousClass90(e13));
                }
            }
            lock3 = C07648d.A08;
            lock3.unlock();
            throw th;
        }
    }
}
