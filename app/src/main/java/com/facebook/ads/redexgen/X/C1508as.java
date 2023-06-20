package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.as  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1508as implements InterfaceC07386v {
    public static String[] A01 = {"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    public final /* synthetic */ C1488aY A00;

    public C1508as(C1488aY c1488aY) {
        this.A00 = c1488aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1488aY c1488aY = this.A00;
            applicationInfo2 = c1488aY.A01;
            if (A01[1].length() != 3) {
                A01[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
                return c1488aY.A08(applicationInfo2.taskAffinity);
            }
            throw new RuntimeException();
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
