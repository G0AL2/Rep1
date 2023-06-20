package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1570bs implements InterfaceC1110Mq {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<AnonymousClass59> A00;

    public C1570bs(AnonymousClass59 anonymousClass59) {
        this.A00 = new WeakReference<>(anonymousClass59);
    }

    private void A00(AnonymousClass59 anonymousClass59) {
        C1180Pi c1180Pi;
        RelativeLayout relativeLayout;
        c1180Pi = anonymousClass59.A0C;
        if (c1180Pi != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.bringChildToFront(c1180Pi);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public final void A3H(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.addView(view, i10, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public final void A3I(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            relativeLayout = anonymousClass59.A06;
            relativeLayout.addView(view, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public void A3t(String str, C07839a c07839a) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c07839a);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public final void A8j(String str, C1U c1u) {
        if (this.A00.get() != null) {
            AnonymousClass59 anonymousClass59 = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            anonymousClass59.A0E(str, c1u);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Mq
    public final void AAF(int i10) {
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            anonymousClass59.finish(i10);
        }
    }
}
