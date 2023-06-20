package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.flow.a0;

/* loaded from: classes.dex */
public class InneractiveAdRequest extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public String f17145c;

    /* renamed from: d  reason: collision with root package name */
    public z f17146d;

    public InneractiveAdRequest(String str) {
        this.f17145c = str;
    }

    @Deprecated
    public String getKeywords() {
        return InneractiveAdManager.getKeywords();
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public z getSelectedUnitConfig() {
        return this.f17146d;
    }

    public String getSpotId() {
        return this.f17145c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setKeywords(String str) {
        InneractiveAdManager.setKeywords(str);
    }

    @Deprecated
    public void setMuteVideo(boolean z10) {
        InneractiveAdManager.setMuteVideo(z10);
    }

    public void setSelectedUnitConfig(z zVar) {
        this.f17146d = zVar;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
