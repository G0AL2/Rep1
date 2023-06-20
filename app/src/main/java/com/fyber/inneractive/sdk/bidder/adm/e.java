package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.k0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.response.j;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.n;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public AdmParametersOuterClass$AdmParameters f16785a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16786b;

    /* renamed from: c  reason: collision with root package name */
    public String f16787c;

    /* renamed from: d  reason: collision with root package name */
    public String f16788d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public e(String str) {
        this.f16786b = str;
    }

    public static void a(e eVar, a aVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = eVar.f16785a;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : eVar.f16785a.getMarkupUrl();
        if (!TextUtils.isEmpty(markupUrl)) {
            k0 k0Var = new k0(new b(eVar, aVar), markupUrl, eVar);
            k0Var.f17552d = new c(eVar);
            IAConfigManager.J.f16884t.f17705a.offer(k0Var);
            k0Var.a(m0.QUEUED);
            return;
        }
        n.f20310b.post(new d(eVar, aVar));
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public void a(com.fyber.inneractive.sdk.response.b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        int i10;
        int i11;
        int i12;
        String str6;
        bVar.f20150a.A = true;
        IAConfigManager.J.f16888x.f16934e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f16785a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int a10 = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.f16785a.hasErrorMessage()) {
            this.f16785a.getErrorMessage();
        }
        String sessionId = this.f16785a.hasSessionId() ? this.f16785a.getSessionId() : null;
        Long valueOf = this.f16785a.hasContentId() ? Long.valueOf(this.f16785a.getContentId()) : null;
        if (this.f16785a.hasPublisherId()) {
            this.f16785a.getPublisherId();
        }
        Integer valueOf2 = this.f16785a.hasAdWidth() ? Integer.valueOf(this.f16785a.getAdWidth()) : null;
        Integer valueOf3 = this.f16785a.hasAdHeight() ? Integer.valueOf(this.f16785a.getAdHeight()) : null;
        String sdkImpressionUrl = this.f16785a.hasSdkImpressionUrl() ? this.f16785a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.f16785a.hasSdkClickUrl() ? this.f16785a.getSdkClickUrl() : null;
        Integer valueOf4 = this.f16785a.hasAdExpirationInterval() ? Integer.valueOf(this.f16785a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.f16785a.hasAdCompletionUrl() ? this.f16785a.getAdCompletionUrl() : null;
        bVar.f20151b = this.f16785a.hasAdUnitId() ? this.f16785a.getAdUnitId() : null;
        this.f16785a.getAdUnitType().name().toLowerCase();
        String lowerCase = this.f16785a.hasAdUnitId() ? this.f16785a.getAdUnitDisplayType().name().toLowerCase() : null;
        String adNetworkName = this.f16785a.hasAdNetworkName() ? this.f16785a.getAdNetworkName() : null;
        Long valueOf5 = this.f16785a.hasAdNetworkId() ? Long.valueOf(this.f16785a.getAdNetworkId()) : null;
        String creativeId = this.f16785a.hasCreativeId() ? this.f16785a.getCreativeId() : null;
        String adDomain = this.f16785a.hasAdDomain() ? this.f16785a.getAdDomain() : null;
        if (this.f16785a.hasAppBundleId()) {
            str2 = this.f16785a.getAppBundleId();
            str = lowerCase;
        } else {
            str = lowerCase;
            str2 = null;
        }
        String campaignId = this.f16785a.hasCampaignId() ? this.f16785a.getCampaignId() : null;
        impressionData.setCpmValue(this.f16785a.hasPricingValue() ? Double.toString(this.f16785a.getPricingValue()) : null);
        impressionData.setCurrency("USD");
        if (this.f16785a.hasMrcData()) {
            if (this.f16785a.getMrcData().hasPixelPercent()) {
                i11 = this.f16785a.getMrcData().getPixelPercent();
                str5 = adCompletionUrl;
            } else {
                str5 = adCompletionUrl;
                i11 = 0;
            }
            if (this.f16785a.getMrcData().hasPixelDuration()) {
                i12 = this.f16785a.getMrcData().getPixelDuration();
                str4 = sdkClickUrl;
            } else {
                str4 = sdkClickUrl;
                i12 = -1;
            }
            if (this.f16785a.getMrcData().hasPixelImpressionUrl()) {
                str6 = this.f16785a.getMrcData().getPixelImpressionUrl();
                str3 = sdkImpressionUrl;
            } else {
                str3 = sdkImpressionUrl;
                str6 = null;
            }
            com.fyber.inneractive.sdk.response.e eVar = bVar.f20150a;
            eVar.f20179t = i11;
            eVar.f20180u = i12;
            eVar.f20181v = str6;
        } else {
            str3 = sdkImpressionUrl;
            str4 = sdkClickUrl;
            str5 = adCompletionUrl;
        }
        Boolean valueOf6 = this.f16785a.hasSkipMode() ? Boolean.valueOf(this.f16785a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.f20150a.f20176q = this.f16785a.toString();
        }
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f20150a;
        String num = valueOf4.toString();
        eVar2.getClass();
        try {
            j10 = Long.parseLong(num);
        } catch (NumberFormatException unused) {
            j10 = 20;
        }
        eVar2.f20161b = j10;
        Integer num2 = valueOf3;
        eVar2.f20160a = eVar2.f20162c + TimeUnit.MINUTES.toMillis(j10);
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.f20150a.f20163d = valueOf != null ? valueOf.toString() : "";
        bVar.f20150a.getClass();
        bVar.f20150a.getClass();
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f20150a;
        eVar3.f20184y = str2;
        eVar3.f20185z = this.f16788d;
        if (valueOf5 != null) {
            impressionData.setDemandId(valueOf5);
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f20150a;
        eVar4.f20166g = a10;
        if (valueOf2 != null) {
            eVar4.f20164e = valueOf2.intValue();
        }
        if (num2 != null) {
            bVar.f20150a.f20165f = num2.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.f20150a;
        eVar5.f20170k = str3;
        eVar5.f20171l = str4;
        eVar5.f20174o = str5;
        eVar5.f20172m = bVar.f20151b;
        try {
            eVar5.f20173n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused2) {
            bVar.f20150a.f20173n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(k.g());
        bVar.f20150a.f20177r = impressionData;
        if (valueOf6 == null) {
            i10 = -1;
        } else {
            i10 = valueOf6.booleanValue() ? 1 : 0;
        }
        bVar.f20150a.f20182w = i10;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public String a() {
        return this.f16787c;
    }
}
