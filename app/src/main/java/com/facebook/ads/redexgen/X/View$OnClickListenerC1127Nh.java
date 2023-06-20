package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1127Nh implements View.OnClickListener {
    public static String[] A02 = {"0jbDV4SqpRnuIwDLdLhaSwFsy", "4CrQo2YdoWcqlYT3QJHt1izZuISw0o1a", "L1hOW0A7sRjLAVrGrG7yuKVrDUUFxwrZ", "r8z", "jBR", "EADx", "Dw2r3KoKizw7HI548vOXrftmgV6TcaYT", "JzZVJSkZeh7kJVI6l2oDTz"};
    public final /* synthetic */ NR A00;
    public final /* synthetic */ TG A01;

    public View$OnClickListenerC1127Nh(TG tg, NR nr) {
        this.A01 = tg;
        this.A00 = nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABW(C2F.A03);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A02[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "wzs";
            strArr[0] = "95EfxSbyIArn9raLN6CoppC7A";
        }
    }
}
