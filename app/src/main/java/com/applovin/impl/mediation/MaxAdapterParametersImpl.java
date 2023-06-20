package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a  reason: collision with root package name */
    private String f7150a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f7151b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f7152c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f7153d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f7154e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f7155f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f7156g;

    /* renamed from: h  reason: collision with root package name */
    private String f7157h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7158i;

    /* renamed from: j  reason: collision with root package name */
    private String f7159j;

    /* renamed from: k  reason: collision with root package name */
    private String f7160k;

    /* renamed from: l  reason: collision with root package name */
    private long f7161l;

    /* renamed from: m  reason: collision with root package name */
    private MaxAdFormat f7162m;

    private MaxAdapterParametersImpl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl a10 = a((com.applovin.impl.mediation.a.f) aVar);
        a10.f7159j = aVar.l();
        a10.f7160k = aVar.i();
        a10.f7161l = aVar.j();
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f7150a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f7154e = fVar.O();
        maxAdapterParametersImpl.f7155f = fVar.P();
        maxAdapterParametersImpl.f7156g = fVar.Q();
        maxAdapterParametersImpl.f7157h = fVar.R();
        maxAdapterParametersImpl.f7151b = fVar.T();
        maxAdapterParametersImpl.f7152c = fVar.U();
        maxAdapterParametersImpl.f7153d = fVar.V();
        maxAdapterParametersImpl.f7158i = fVar.N();
        return maxAdapterParametersImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.h hVar, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a10 = a(hVar);
        a10.f7162m = maxAdFormat;
        return a10;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f7162m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f7150a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f7161l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f7160k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f7157h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f7153d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f7151b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f7152c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f7159j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f7154e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f7155f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f7156g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f7158i;
    }
}
