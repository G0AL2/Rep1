package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class YO implements InterfaceC07386v {
    public static String[] A01 = {"smnl8goxbtEXy2ari0oo94M5wBAsJ", "4jdGfKjJVtKongVqtnlXz1qpag9QmJcO", "6HhyQoH63eZiDTc8tIM8lg1a8XmlaMXL", "TRovmJ8dsKeWsGtAEtnO1NLs5DkGdItv", "EJDQOjfPW", "Fvhxx1JOY2tpNVIZJk2UFnorm88CMjoG", "Hr", "QB67UPOvQOrUPNaLWc8iYWX5dhIe7kRi"};
    public final /* synthetic */ YN A00;

    public YO(YN yn) {
        this.A00 = yn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 24) {
            C7A A07 = this.A00.A07(AnonymousClass76.A05);
            String[] strArr = A01;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A01[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            return A07;
        }
        return this.A00.A08(TimeZone.getDefault().getDisplayName());
    }
}
