package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1593cG implements InterfaceC06453e {
    public final /* synthetic */ FD A00;
    public final /* synthetic */ C3Z A01;

    public C1593cG(FD fd2, C3Z c3z) {
        this.A00 = fd2;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06453e
    public final Object A4D(int i10) {
        C3X A00 = this.A01.A00(i10);
        if (A00 == null) {
            return null;
        }
        return A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06453e
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC06453e
    public final Object A5P(int i10) {
        C3X A01 = this.A01.A01(i10);
        if (A01 == null) {
            return null;
        }
        return A01.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06453e
    public final boolean AD9(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
