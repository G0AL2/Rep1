package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class AI extends SB {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public AI(C2M c2m, int i10, @Nullable List<C1172Pa> list, @Nullable C1220Qw c1220Qw, @Nullable Bundle bundle) {
        super(c2m, i10, list, c1220Qw, bundle);
        c2m.A1j(this);
        this.A03 = new TD(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 != null && A27 != -1 && A27 < this.A05.size() - 1) {
            A0V(A27 + 1);
        }
    }

    private void A01(int lastVisibleItem) {
        int A28 = this.A0C.A28();
        int A29 = this.A0C.A29();
        int visibleItem = this.A0C.A27();
        if (visibleItem != A28) {
            A0S(A28);
        }
        if (visibleItem != A29) {
            A0S(A29);
        }
        A0T(visibleItem);
        A0W(A28, A29, lastVisibleItem);
    }

    @Override // com.facebook.ads.redexgen.X.SB, com.facebook.ads.redexgen.X.C4Y
    public final void A0L(F9 f92, int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.SB, com.facebook.ads.redexgen.X.C4Y
    public final void A0M(F9 f92, int i10, int i11) {
        if (this.A0C.A27() != -1) {
            AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC1261Sl != null && abstractC1261Sl.A0i() && !abstractC1261Sl.A0h()) {
                abstractC1261Sl.A0f();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A0Y(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A0a(AbstractC1261Sl abstractC1261Sl, boolean z10) {
        A0Y(abstractC1261Sl, z10);
        if (!z10 && abstractC1261Sl.A0h()) {
            abstractC1261Sl.A0e();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C1220Qw A0c() {
        return this.A04;
    }

    public final void A0d(C1220Qw c1220Qw) {
        this.A04 = c1220Qw;
    }

    public final void A0e(List<C1172Pa> list) {
        this.A05 = list;
    }
}
