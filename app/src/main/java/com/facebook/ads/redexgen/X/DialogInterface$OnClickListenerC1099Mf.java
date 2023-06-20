package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Mf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC1099Mf implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1282Th A01;

    public DialogInterface$OnClickListenerC1099Mf(C1282Th c1282Th, EditText editText) {
        this.A01 = c1282Th;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C1283Ti(this, dialogInterface));
    }
}
