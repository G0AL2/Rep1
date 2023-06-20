package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class K2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UD A00;

    public K2(UD ud2) {
        this.A00 = ud2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            C1670da c1670da = this.A00.A01.A0a;
            A01 = this.A00.A01();
            c1670da.A0P(A01);
        }
    }
}
