package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C1730d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes3.dex */
public final class g extends d<com.ironsource.mediationsdk.adunit.d.b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r18, com.ironsource.mediationsdk.model.h r19, java.lang.String r20, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r21, com.ironsource.mediationsdk.IronSourceSegment r22) {
        /*
            r17 = this;
            r0 = r19
            com.ironsource.mediationsdk.adunit.c.a r10 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.mediationsdk.utils.c r4 = r0.f27246i
            int r5 = r0.f27240c
            int r6 = r0.f27242e
            int r7 = r0.f27243f
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            com.ironsource.mediationsdk.adunit.c.b.a$a r12 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0342a.MANUAL
            long r13 = r4.f27418k
            long r2 = r4.f27417j
            r11 = r9
            r15 = r2
            r11.<init>(r12, r13, r15)
            r8 = -1
            r0 = r10
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r1 = r21
            r2 = r22
            r0.<init>(r10, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.g.<init>(java.util.List, com.ironsource.mediationsdk.model.h, java.lang.String, java.util.Set, com.ironsource.mediationsdk.IronSourceSegment):void");
    }

    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b10 = C1730d.a().b(networkSettings, ad_unit);
        if (b10 == null || !(b10 instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b10;
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    protected final /* synthetic */ BaseAdAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return b(networkSettings, ad_unit);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    protected final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a aVar = this.f26890m;
        return new com.ironsource.mediationsdk.adunit.d.b(new com.ironsource.mediationsdk.adunit.d.a(ad_unit, aVar.f26857b, i10, this.f26885h, str, this.f26883f, this.f26884g, networkSettings, aVar.f26862g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
