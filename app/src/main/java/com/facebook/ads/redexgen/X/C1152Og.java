package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Og  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1152Og {
    public static AbstractC1151Of A00(C1155Oj c1155Oj, @Nullable Bundle bundle, boolean z10) {
        AbstractC1151Of c1269St;
        C1B A0O = c1155Oj.A04().A0O();
        double A00 = C1150Oe.A00(A0O);
        boolean isWatchAndBrowse = c1155Oj.A04().A0O().A0N();
        boolean isVideo = C1150Oe.A05(c1155Oj.A00(), c1155Oj.A01(), A00);
        AbstractC05710f A002 = C05720g.A00(c1155Oj.A05(), c1155Oj.A06(), "", C1070La.A00(c1155Oj.A04().A0O().A0F().A05()), new HashMap());
        boolean z11 = !TextUtils.isEmpty(A0O.A0D().A08());
        if (JR.A1I(c1155Oj.A05())) {
            c1155Oj.A05().A09().AFP(c1155Oj.A02(), c1155Oj.A04().A0U(), z11);
        }
        if (isWatchAndBrowse && (A002 instanceof G0)) {
            c1269St = new C1262Sm(c1155Oj);
        } else if (z11) {
            c1269St = new A9(c1155Oj);
        } else if (!z11 && JR.A1q(c1155Oj.A05())) {
            c1269St = new AA(c1155Oj, isVideo);
        } else if (isVideo) {
            c1269St = new C1271Sv(c1155Oj, c1155Oj.A00() == 2);
        } else {
            c1269St = new C1269St(c1155Oj, C1150Oe.A03(A00));
        }
        if (z10) {
            c1269St.A0b(A0O, c1155Oj.A04().A0U(), A00, bundle);
        }
        return c1269St;
    }
}
