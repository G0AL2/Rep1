package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Ya  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1402Ya implements InterfaceC07386v {
    public static String[] A01 = {"fhgAKr3d26sPe206xi", "SjffeijJA1Vv6PcXWUgct", "EsQusZwl1jUwipz2lU1dtOeOynoqp4qu", "0VpWGFYwNM1shdn7oayU", "oGsU7X9gn8B3aKKKnK6Um4C", "3PuUzv37NfYax6hYz8jf", "w27NqvUy0J9VzwNZKDXUsnO8qh2oDxhJ", "FZXbTPmbge4RvKyxAzubgHD8Txvy8Otv"};
    public final /* synthetic */ YR A00;

    public C1402Ya(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        TelephonyManager telephonyManager4;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            C7A A07 = this.A00.A07(AnonymousClass76.A07);
            if (A01[6].charAt(19) != 'U') {
                throw new RuntimeException();
            }
            A01[6] = "mdGsZgeczhjsROxHbS4UhtOI0ggMdB2A";
            return A07;
        } else if (Build.VERSION.SDK_INT >= 24) {
            YR yr = this.A00;
            telephonyManager4 = yr.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "gYbGBXsMnQLVbPxH35aVX";
            strArr2[4] = "c9uQZVFrEkdSbUXAtWNBNx9";
            return yr.A04(telephonyManager4.getDataNetworkType());
        } else {
            YR yr2 = this.A00;
            String[] strArr3 = A01;
            if (strArr3[2].length() != strArr3[0].length()) {
                A01[6] = "dEMR1C0fCLJEsmN6YStUhJGVUagFQ5EF";
                telephonyManager3 = yr2.A00;
                return yr2.A04(telephonyManager3.getNetworkType());
            }
            A01[7] = "IeVVB4pQAR4pX23W54Z95CGRKG6wHZI8";
            telephonyManager2 = yr2.A00;
            return yr2.A04(telephonyManager2.getNetworkType());
        }
    }
}
