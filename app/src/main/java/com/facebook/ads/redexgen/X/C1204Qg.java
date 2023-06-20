package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

@TargetApi(14)
/* renamed from: com.facebook.ads.redexgen.X.Qg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1204Qg {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C0889Ds A00;
    public final V8 A01 = new V8();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C1204Qg(C1400Xy c1400Xy) {
        this.A00 = AO.A00(new XI(c1400Xy), new C0843Bk(new VF(this.A01)), new XK());
    }

    @VisibleForTesting
    public static String A01(AM am) {
        return A00(41, 11, 55) + am.A01 + A00(14, 22, 116) + am.A00 + A00(0, 14, 98) + am.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) != 'z') {
            A03[6] = "p35x";
            return true;
        }
        throw new RuntimeException();
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5r();
    }

    public final long A06() {
        return this.A00.A6F();
    }

    public final long A07() {
        return this.A00.A6R();
    }

    @Nullable
    public final C1202Qe A08() {
        Format A0L = this.A00.A0L();
        if (A0L == null) {
            return null;
        }
        return new C1202Qe(A0L.A0F, A0L.A08);
    }

    public final void A09() {
        this.A00.ADm();
    }

    public final void A0A() {
        this.A00.AEO();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f10) {
        this.A00.A0N(f10);
    }

    public final void A0D(long j10) {
        this.A00.AEN(j10);
    }

    public final void A0E(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C1399Xx c1399Xx, Uri uri) {
        if (JR.A26(c1399Xx, A03())) {
            VY vy = new VY(C1208Qk.A05(c1399Xx).A0F(c1399Xx));
            String customCacheKey = C1208Qk.A08(c1399Xx, uri);
            if (customCacheKey != null) {
                vy.A00(customCacheKey);
            }
            this.A00.A0P(vy.A01(uri));
            return;
        }
        this.A00.A0P(new VY(new V6(c1399Xx, C1020Iz.A0K(c1399Xx, A00(38, 3, 4)), this.A01)).A01(uri));
    }

    public final void A0G(InterfaceC1201Qd interfaceC1201Qd) {
        this.A00.A3E(new II(this, interfaceC1201Qd));
    }

    public final void A0H(InterfaceC1203Qf interfaceC1203Qf) {
        this.A00.A0Q(new IJ(this, interfaceC1203Qf));
    }

    public final void A0I(boolean z10) {
        this.A00.AEe(z10);
    }

    public final boolean A0J() {
        return this.A00.A7D();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
