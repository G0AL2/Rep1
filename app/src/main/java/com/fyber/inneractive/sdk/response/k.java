package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final m f20188a;

    public k(m mVar) {
        this.f20188a = mVar;
    }

    public final String a(Map<String, String> map, l lVar) {
        String lowerCase = lVar.f17607a.toLowerCase();
        String str = map.get(lowerCase);
        IAlog.d("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public String a() {
        return this.f20188a.d().toString();
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public void a(b bVar) {
        long j10;
        bVar.f20150a.A = false;
        IAConfigManager.J.f16888x.f16934e = false;
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> o10 = this.f20188a.o();
        String a10 = a(o10, l.RETURNED_AD_TYPE);
        a(o10, l.ERROR_CODE);
        String a11 = a(o10, l.SESSION_ID);
        String a12 = a(o10, l.CONTENT_ID);
        a(o10, l.PUBLISHER_ID);
        String a13 = a(o10, l.WIDTH);
        String a14 = a(o10, l.HEIGHT);
        String a15 = a(o10, l.SDK_IMPRESSION_URL);
        String a16 = a(o10, l.SDK_CLICK_URL);
        String a17 = a(o10, l.AD_TIMEOUT);
        String a18 = a(o10, l.AD_COMPLETION_URL);
        bVar.f20151b = a(o10, l.AD_UNIT_ID);
        a(o10, l.AD_UNIT_TYPE);
        String a19 = a(o10, l.AD_UNIT_DISPLAY_TYPE);
        String a20 = a(o10, l.AD_NETWORK);
        String a21 = a(o10, l.AD_NETWORK_ID);
        String a22 = a(o10, l.CREATIVE_ID);
        String a23 = a(o10, l.AD_DOMAIN);
        String a24 = a(o10, l.APP_BUNDLE);
        String a25 = a(o10, l.CAMPAIGN_ID);
        String a26 = a(o10, l.CPM_VALUE);
        String a27 = a(o10, l.CPM_CURRENCY);
        impressionData.setCpmValue(a26);
        impressionData.setCurrency(a27);
        String a28 = a(o10, l.BANNER_MRC_PERCENT);
        String a29 = a(o10, l.BANNER_MRC_DURATION);
        String a30 = a(o10, l.BANNER_MRC_IMPRESSION_URL);
        String a31 = a(o10, l.INTERSTITIAL_SKIP_MODE);
        if (bVar.b()) {
            bVar.f20150a.f20175p = o10;
        }
        e eVar = bVar.f20150a;
        eVar.getClass();
        try {
            j10 = Long.parseLong(a17);
        } catch (NumberFormatException unused) {
            j10 = 20;
        }
        long j11 = j10;
        eVar.f20161b = j11;
        eVar.f20160a = eVar.f20162c + TimeUnit.MINUTES.toMillis(j11);
        impressionData.setImpressionId(a11);
        impressionData.setDemandSource(a20);
        e eVar2 = bVar.f20150a;
        eVar2.f20163d = a12;
        eVar2.f20184y = a24;
        if (!TextUtils.isEmpty(a21)) {
            impressionData.setDemandId(Long.valueOf(a21));
        }
        if (!TextUtils.isEmpty(a10)) {
            bVar.f20150a.f20166g = Integer.valueOf(a10).intValue();
        }
        if (!TextUtils.isEmpty(a13)) {
            bVar.f20150a.f20164e = Integer.valueOf(a13).intValue();
        }
        if (!TextUtils.isEmpty(a14)) {
            bVar.f20150a.f20165f = Integer.valueOf(a14).intValue();
        }
        e eVar3 = bVar.f20150a;
        eVar3.f20170k = a15;
        eVar3.f20171l = a16;
        eVar3.f20174o = a18;
        eVar3.f20172m = bVar.f20151b;
        try {
            eVar3.f20173n = UnitDisplayType.fromValue(a19);
        } catch (IllegalArgumentException unused2) {
            bVar.f20150a.f20173n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a22)) {
            impressionData.setCreativeId(a22);
        }
        if (!TextUtils.isEmpty(a23)) {
            impressionData.setAdvertiserDomain(a23);
        }
        if (!TextUtils.isEmpty(a25)) {
            impressionData.setCampaignId(a25);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.g());
        e eVar4 = bVar.f20150a;
        eVar4.f20177r = impressionData;
        eVar4.f20179t = s.a(a28, 0);
        e eVar5 = bVar.f20150a;
        float f10 = -1.0f;
        if (!TextUtils.isEmpty(a29)) {
            try {
                f10 = Float.parseFloat(a29);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar5.f20180u = f10;
        e eVar6 = bVar.f20150a;
        eVar6.f20181v = a30;
        eVar6.f20182w = s.a(a31, -1);
    }
}
