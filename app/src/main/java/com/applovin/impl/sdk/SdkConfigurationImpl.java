package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import lombok.NonNull;

/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final m f7974a;

    public SdkConfigurationImpl(m mVar) {
        this.f7974a = mVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f7974a.p().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f7974a.a(com.applovin.impl.sdk.c.b.eU);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f7974a.a(com.applovin.impl.sdk.c.b.eV);
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{consentDialogState=" + getConsentDialogState() + ", countryCode=" + getCountryCode() + '}';
    }
}
