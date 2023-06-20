package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* loaded from: classes.dex */
public class f extends e implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: h  reason: collision with root package name */
    public final InneractiveAdSpot.RequestListener f17211h;

    /* renamed from: i  reason: collision with root package name */
    public final m f17212i;

    public f(InneractiveAdSpot.RequestListener requestListener, m mVar) {
        this.f17211h = requestListener;
        this.f17212i = mVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.e, com.fyber.inneractive.sdk.interfaces.a.InterfaceC0236a
    public void a() {
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z10) {
            return;
        }
        a(this.f17207e, c(), InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
    }

    @Override // com.fyber.inneractive.sdk.flow.e, com.fyber.inneractive.sdk.interfaces.a.InterfaceC0236a
    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        super.a(inneractiveInfrastructureError);
        InneractiveAdSpot.RequestListener requestListener = this.f17211h;
        if (requestListener != null) {
            requestListener.onInneractiveFailedAdRequest(this.f17212i, inneractiveInfrastructureError.getErrorCode());
        }
    }
}
