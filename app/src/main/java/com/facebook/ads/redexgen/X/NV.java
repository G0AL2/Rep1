package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NV implements View.OnClickListener {
    public static String[] A01 = {"RpRdDeRKSCMdi", "IuXxM6erDWGrR2ilBdYngNq10nVc0mkU", "Kill7HMysw6SnDOrBs", "MIbB774K8liBHgb3cyiNiqUG4b3Um782", "7YEQDQbB6rycAAMyAlOvxfyaq0dnUo7P", "y1fFSWKNdNdnYTXNNG", "pYfR2zdeniJKCCLkUpT", "pJHaP"};
    public final /* synthetic */ TI A00;

    public NV(TI ti) {
        this.A00 = ti;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8l();
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A01[5].length() == 17) {
                throw new RuntimeException();
            }
            A01[5] = "tK5zLur";
        }
    }
}
