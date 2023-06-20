package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class VY implements GM {
    @Nullable
    public InterfaceC0863Cf A02;
    @Nullable
    public Object A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final InterfaceC0974Hd A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public VY(InterfaceC0974Hd interfaceC0974Hd) {
        this.A06 = interfaceC0974Hd;
    }

    public final VY A00(String str) {
        IK.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final C0 A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C1369Wt();
        }
        return new C0(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
