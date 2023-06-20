package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.db  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1671db extends L8 {
    public final /* synthetic */ C1670da A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1671db(C1670da c1670da, Map map, Map map2) {
        this.A00 = c1670da;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AnonymousClass11 anonymousClass11;
        C1400Xy c1400Xy;
        AnonymousClass11 anonymousClass112;
        anonymousClass11 = this.A00.A01;
        if (!TextUtils.isEmpty(anonymousClass11.A0Y())) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.A02);
            hashMap.putAll(this.A01);
            c1400Xy = this.A00.A09;
            InterfaceC1028Jh A08 = c1400Xy.A08();
            anonymousClass112 = this.A00.A01;
            A08.A9L(anonymousClass112.A0Y(), hashMap);
        }
    }
}
