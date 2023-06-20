package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1594cH implements InterfaceC06433b {
    public final /* synthetic */ FE A00;
    public final /* synthetic */ C3Z A01;

    public C1594cH(FE fe2, C3Z c3z) {
        this.A00 = fe2;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06433b
    public final Object A4D(int i10) {
        C3X A00 = this.A01.A00(i10);
        if (A00 == null) {
            return null;
        }
        return A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06433b
    public final List<Object> A5O(String str, int i10) {
        List<C3X> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = A03.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06433b
    public final boolean AD9(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
