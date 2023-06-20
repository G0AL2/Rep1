package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.by  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1576by extends C06282m {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C06282m A00 = new C1577bz(this);
    public final F9 A01;

    public C1576by(F9 f92) {
        this.A01 = f92;
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(F9.class.getName());
        if ((view instanceof F9) && !A0B()) {
            F9 f92 = (F9) view;
            if (f92.getLayoutManager() != null) {
                f92.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final void A08(View view, C3X c3x) {
        super.A08(view, c3x);
        c3x.A0O(F9.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c3x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C06282m
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            C4T layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i10, bundle);
        } else {
            return false;
        }
    }

    public final C06282m A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1t();
    }
}
