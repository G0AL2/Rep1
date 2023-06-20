package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.core.misc.EventSubject;
import od.c;

/* loaded from: classes3.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements g {
    public ScarInterstitialAdHandler(c cVar, EventSubject<com.unity3d.scar.adapter.common.c> eventSubject) {
        super(cVar, eventSubject);
    }

    @Override // com.unity3d.scar.adapter.common.g
    public void onAdClicked() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_CLICKED, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.g
    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.g
    public void onAdImpression() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_LEFT_APPLICATION, new Object[0]);
    }
}
