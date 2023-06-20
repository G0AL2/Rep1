package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a  reason: collision with root package name */
    private final m f8624a;

    public PostbackServiceImpl(m mVar) {
        this.f8624a = mVar;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(i.b(this.f8624a).a(str).c(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(i iVar, o.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f8624a.S().a(new com.applovin.impl.sdk.e.g(iVar, aVar, this.f8624a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(i iVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(iVar, o.a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
