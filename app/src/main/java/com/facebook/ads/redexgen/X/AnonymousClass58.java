package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.58  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass58 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass59 A00;

    public AnonymousClass58(AnonymousClass59 anonymousClass59) {
        this.A00 = anonymousClass59;
    }

    public /* synthetic */ AnonymousClass58(AnonymousClass59 anonymousClass59, AnonymousClass55 anonymousClass55) {
        this(anonymousClass59);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (AnonymousClass59.A02(this.A00) != null && AnonymousClass59.A00(this.A00) != null) {
            AnonymousClass59.A02(this.A00).setBounds(0, 0, AnonymousClass59.A00(this.A00).getWidth(), AnonymousClass59.A00(this.A00).getHeight());
            AnonymousClass59.A02(this.A00).A0D(!AnonymousClass59.A02(this.A00).A0E());
        }
        return true;
    }
}
