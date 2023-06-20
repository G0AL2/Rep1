package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1391Xp extends L8 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8U A01;
    public final /* synthetic */ InterfaceC07758s A02;
    public final /* synthetic */ AnonymousClass90 A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public C1391Xp(C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90, InterfaceC07758s interfaceC07758s) {
        this.A01 = c8u;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = anonymousClass90;
        this.A02 = interfaceC07758s;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        String stackTrace;
        Map<String, String> A4T;
        String A6q;
        AtomicReference atomicReference;
        try {
            if (C07768t.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C1039Js.A08(this.A01, EnumC1031Jk.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = MA.A03(this.A01, cause);
            } else if (JT.A0R(this.A01)) {
                stackTrace = MA.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (JT.A0V(this.A01)) {
                A4T = this.A01.A02().A4T();
            } else if (this.A02 != null) {
                A4T = this.A02.A6X();
            } else if (C07768t.A02) {
                String message = A00(1, 57, 65);
                C07768t.A0F(new RuntimeException(message, this.A03));
                A4T = new HashMap<>();
            } else {
                A4T = this.A01.A02().A4T();
            }
            A4T.put(A00(136, 7, 65), this.A04);
            A4T.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject A02 = this.A03.A02();
            if (A02 != null) {
                A4T.put(A00(71, 15, 69), A02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(111, 15, 126).equals(this.A04)) && (A6q = this.A01.A02().A6q()) != null) {
                A4T.put(A00(86, 20, 84), A6q);
            }
            String A0A = this.A01.A0A();
            if (A0A != null && !TextUtils.isEmpty(A0A)) {
                A4T.put(A00(126, 10, 4), A0A);
            }
            atomicReference = C07768t.A0A;
            C8r c8r = (C8r) atomicReference.get();
            if (c8r == null) {
                C07768t.A0F(new RuntimeException(A00(58, 13, 7)));
            } else {
                c8r.AFh(stackTrace, A4T, this.A01);
            }
        } catch (Throwable th) {
            C07768t.A0F(th);
        }
    }
}
