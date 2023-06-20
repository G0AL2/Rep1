package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ze  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1432Ze extends C07296m {
    public static PackageManager A00;
    public static String[] A01 = {"mMUsySdK", "G1dnExSQKLbMoTCo5d1h1U5A6G7ndhFt", "GiJYkTHpyeTaf3ywPcthUoX2rTVjWFCb", "0A5FUJ9kDHtL7zu8WVVZPRsd6iFGNBV", "Uxf0Oizk", "zpV62zjrrTP1cgdKU18BbBXv", "Pb6NlhKASELFsFyHLiNoj4ENeXMrfTQa", "RrSFtRYH4qZAbHiyxnUErsMfABxwLq"};

    public C1432Ze(Context context, C6C c6c) {
        super(context, c6c);
        A00 = context.getPackageManager();
    }

    public static /* synthetic */ PackageManager A01() {
        PackageManager packageManager = A00;
        if (A01[1].charAt(22) != 'k') {
            String[] strArr = A01;
            strArr[7] = "gjUVtXXuXbvsWPZLBaiwFqVTuNtnGy";
            strArr[3] = "aaBFOo2Y3N72goZoHRvUb35kO6Lzp1W";
            return packageManager;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<String, C1433Zf> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    public final InterfaceC07386v A0G(List<C07376u> list) {
        return new C1434Zg(this, list);
    }
}
