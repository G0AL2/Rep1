package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdComponentViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1572bu extends C5E implements AdCompanionViewApi {
    public static byte[] A05;
    @Nullable
    public AnonymousClass18 A00;
    @Nullable
    public AdCompanionView A01;
    @Nullable
    public C1400Xy A02;
    @Nullable
    public InterfaceC1028Jh A03;
    @Nullable
    public A1 A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-120, -108, -110, 83, -117, -122, -120, -118, -121, -108, -108, -112, 83, -122, -119, -104, 83, -114, -109, -103, -118, -105, -104, -103, -114, -103, -114, -122, -111, 83, -120, -111, -114, -120, -112, -118, -119};
    }

    public final void A02() {
        this.A04 = null;
    }

    public final void A03(C1400Xy c1400Xy, AnonymousClass18 anonymousClass18) {
        AdCompanionView adCompanionView = this.A01;
        if (adCompanionView == null) {
            return;
        }
        this.A02 = c1400Xy;
        this.A00 = anonymousClass18;
        AnonymousClass38.A0A(adCompanionView, new ColorDrawable(0));
        this.A03 = this.A02.A08();
        this.A04 = new A1(this.A02, this.A03, this.A00, A00(0, 37, 16), 3);
        this.A01.addView(this.A04);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdCompanionViewApi
    public final void initialize(AdCompanionView adCompanionView) {
        this.A01 = adCompanionView;
    }
}
