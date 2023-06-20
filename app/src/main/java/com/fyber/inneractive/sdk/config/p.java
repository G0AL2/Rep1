package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class p implements com.fyber.inneractive.sdk.network.u<com.fyber.inneractive.sdk.config.global.l> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f17007a;

    public p(IAConfigManager iAConfigManager) {
        this.f17007a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(com.fyber.inneractive.sdk.config.global.l lVar, Exception exc, boolean z10) {
        com.fyber.inneractive.sdk.config.global.l lVar2 = lVar;
        if (lVar2 != null) {
            IAlog.a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z10));
            this.f17007a.f16890z.f16938a = lVar2;
        } else if (exc != null) {
            if (exc instanceof com.fyber.inneractive.sdk.network.f) {
                IAlog.a("remote features config not modified", new Object[0]);
                return;
            }
            IAlog.a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager = this.f17007a;
            IAConfigManager iAConfigManager2 = IAConfigManager.J;
            iAConfigManager.getClass();
            new q.a(com.fyber.inneractive.sdk.network.o.FATAL_FEATURES_CONFIG_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null).a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).a((String) null);
        }
    }
}
