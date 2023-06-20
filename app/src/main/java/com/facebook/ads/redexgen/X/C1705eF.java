package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1705eF {
    public final InterfaceC1709eJ A00;
    public final String A01;
    public final Collection<C1720eU> A02;
    public final Collection<C1720eU> A03;
    public final List<Rect> A04;

    public C1705eF(String str, InterfaceC1709eJ interfaceC1709eJ, List<Rect> list, Collection<C1720eU> collection, Collection<C1720eU> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1709eJ;
        this.A04 = new ArrayList(list);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
