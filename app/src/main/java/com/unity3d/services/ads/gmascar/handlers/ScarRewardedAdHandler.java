package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.core.misc.EventSubject;
import od.c;

/* loaded from: classes3.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase implements h {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(c cVar, EventSubject<com.unity3d.scar.adapter.common.c> eventSubject) {
        super(cVar, eventSubject);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.REWARDED_SHOW_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onAdImpression() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_EARNED_REWARD, new Object[0]);
    }
}
