package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ti  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1283Ti extends L8 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterface$OnClickListenerC1099Mf A01;

    public C1283Ti(DialogInterface$OnClickListenerC1099Mf dialogInterface$OnClickListenerC1099Mf, DialogInterface dialogInterface) {
        this.A01 = dialogInterface$OnClickListenerC1099Mf;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        R2 r22;
        R2 r23;
        C1399Xx c1399Xx;
        Map<? extends String, ? extends String> A04;
        r22 = this.A01.A01.A02;
        if (r22 != null) {
            r23 = this.A01.A01.A02;
            c1399Xx = this.A01.A01.A00;
            String A03 = C1059Ko.A03(c1399Xx);
            RG rg = new RG();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            r23.ADB(A03, rg.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
