package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NY implements View.OnClickListener {
    public static String[] A02 = {"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    public final /* synthetic */ NR A00;
    public final /* synthetic */ TH A01;

    public NY(TH th, NR nr) {
        this.A01 = th;
        this.A00 = nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABW(C2F.A05);
        } catch (Throwable th) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            A02[2] = "snOHg";
            L0.A00(th, this);
        }
    }
}
