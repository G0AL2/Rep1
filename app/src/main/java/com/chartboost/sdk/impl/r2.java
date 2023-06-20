package com.chartboost.sdk.impl;

import com.chartboost.sdk.Networking.requests.models.ShowParamsModel;
import com.chartboost.sdk.impl.s0;

/* loaded from: classes.dex */
public class r2 extends s0 {
    public r2(String str, l2 l2Var, ShowParamsModel showParamsModel, s0.a aVar) {
        super("https://live.chartboost.com", str, l2Var, 2, aVar);
        this.f14237i = 1;
        a(showParamsModel);
    }

    private void a(ShowParamsModel showParamsModel) {
        a("cached", "0");
        a("location", showParamsModel.getLocation());
        int videoCached = showParamsModel.getVideoCached();
        if (videoCached >= 0) {
            a("video_cached", Integer.valueOf(videoCached));
        }
        String adId = showParamsModel.getAdId();
        if (adId.isEmpty()) {
            return;
        }
        a("ad_id", adId);
    }
}
