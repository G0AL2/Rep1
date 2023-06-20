package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y1 implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C1399Xx A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public Y1(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A8r(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C07828z.A1d, new AnonymousClass90(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A92(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C07828z.A1f, new AnonymousClass90(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ADf(String str, int i10, @Nullable String str2, @Nullable Long l10, @Nullable Long l11, AnonymousClass06 anonymousClass06) {
        C7X.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i10, str2, l10, l11, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ADg(String str, boolean z10, AnonymousClass06 anonymousClass06) {
        C7X.A04(this.A00, new C7W(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z10);
    }
}
