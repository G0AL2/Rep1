package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b<Listener extends com.ironsource.mediationsdk.adunit.c.a.c> extends a<Listener> implements AdapterAdRewardListener {

    /* renamed from: h  reason: collision with root package name */
    private f f26923h;

    public b(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f26923h = new f();
        super.onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        this.f26923h = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (this.f26928e == null) {
            IronLog.INTERNAL.verbose(c("placement is null "));
            d dVar = this.f26926c;
            if (dVar != null) {
                dVar.f26841e.m("mCurrentPlacement is null");
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("placement name = " + q()));
        if (this.f26926c != null) {
            HashMap hashMap = new HashMap();
            if (J.a().f26342n != null) {
                for (String str : J.a().f26342n.keySet()) {
                    hashMap.put("custom_" + str, J.a().f26342n.get(str));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f26926c.f26840d.a(q(), this.f26928e.getRewardName(), this.f26928e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, k()), f.a(this.f26923h), hashMap, J.a().f26341m);
        }
        ((com.ironsource.mediationsdk.adunit.c.a.c) this.f26925b).a((b<?>) this, this.f26928e);
    }
}
