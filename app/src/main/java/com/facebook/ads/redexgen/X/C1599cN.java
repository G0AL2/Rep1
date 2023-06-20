package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1599cN implements InterfaceC06342s {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3M A01;

    public C1599cN(C3M c3m) {
        this.A01 = c3m;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06342s
    public final C3P AA0(View view, C3P c3p) {
        C3P A06 = AnonymousClass38.A06(view, c3p);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int childCount = this.A01.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C3P A05 = AnonymousClass38.A05(this.A01.getChildAt(i10), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        return A06.A06(rect.left, rect.top, rect.right, rect.bottom);
    }
}
