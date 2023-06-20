package com.facebook.ads.redexgen.X;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.48  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass48 {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC06774l> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.A08.get(i10).A0H;
            C4U c4u = (C4U) view.getLayoutParams();
            if (!c4u.A02()) {
                int i11 = this.A01;
                int i12 = c4u.A00();
                if (i11 == i12) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View closest) {
        int i10 = this.A08.size();
        View view = null;
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i12 = 0; i12 < i10; i12++) {
            View view2 = this.A08.get(i12).A0H;
            C4U c4u = (C4U) view2.getLayoutParams();
            if (view2 != closest && !c4u.A02()) {
                int A00 = c4u.A00();
                int closestDistance = this.A01;
                int i13 = A00 - closestDistance;
                int closestDistance2 = this.A03;
                int i14 = i13 * closestDistance2;
                if (i14 >= 0 && i14 < i11) {
                    view = view2;
                    i11 = i14;
                    if (i14 == 0) {
                        break;
                    }
                }
            }
        }
        return view;
    }

    private final void A02(View view) {
        View A01 = A01(view);
        if (A01 == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C4U) A01.getLayoutParams()).A00();
        }
    }

    public final View A03(C06674b c06674b) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c06674b.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C06744i c06744i) {
        int i10 = this.A01;
        return i10 >= 0 && i10 < c06744i.A03();
    }
}
