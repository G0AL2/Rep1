package com.facebook.ads.redexgen.X;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* renamed from: com.facebook.ads.redexgen.X.Ss  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1268Ss extends L8 {
    public static String[] A01 = {"ZvDtHAz5m48M18w3xVBvW9UUvAxUfTco", "Su9zcdtZ9ImnInrf0ILgVeApSeGsgvZI", "xXqvKIRF0PBjEGaR7TZ18ROMB", "m2Hewa3Z6gbURtNYV3SWt7DVdluwrYvz", "mWXUFmbAmKViJClAM9LXlAC", "0Y7AahKvzPLarINwhoocY8ezozCmsz", "5fBoxvqmYpNfoXwOAmWasRGE3QCsQXLn", "O4RwXCXfxOQMJWQD0Tqe5fA"};
    public final /* synthetic */ C1262Sm A00;

    public C1268Ss(C1262Sm c1262Sm) {
        this.A00 = c1262Sm;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        boolean z10;
        C1162Oq c1162Oq;
        z10 = this.A00.A0L;
        if (!z10) {
            c1162Oq = this.A00.A0F;
            MS.A0F(1000, c1162Oq);
        }
        this.A00.postDelayed(this, Constants.MIN_PROGRESS_TIME);
        if (A01[2].length() == 24) {
            throw new RuntimeException();
        }
        A01[2] = "V75DU12eQT8nm";
    }
}
