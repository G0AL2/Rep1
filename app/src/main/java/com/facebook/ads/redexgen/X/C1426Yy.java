package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Yy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1426Yy implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public C1426Yy(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        C6C c6c;
        ActivityInfo[] activityInfoArr3;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            activityInfoArr2 = this.A00.A04;
            int length = activityInfoArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i10 = 0; i10 < min; i10++) {
                activityInfoArr3 = this.A00.A04;
                arrayList.add(activityInfoArr3[i10].name);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
