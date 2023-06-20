package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aa extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f8353a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdRewardListener f8354c;

    public aa(com.applovin.impl.sdk.ad.e eVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.m mVar) {
        super("TaskValidateAppLovinReward", mVar);
        this.f8353a = eVar;
        this.f8354c = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/vr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 < 400 || i10 >= 500) {
            this.f8354c.validationRequestFailed(this.f8353a, i10);
            str = "network_timeout";
        } else {
            this.f8354c.userRewardRejected(this.f8353a, Collections.emptyMap());
            str = "rejected";
        }
        this.f8353a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.f8353a.a(cVar);
        String b10 = cVar.b();
        Map<String, String> a10 = cVar.a();
        if (b10.equals("accepted")) {
            this.f8354c.userRewardVerified(this.f8353a, a10);
        } else if (b10.equals("quota_exceeded")) {
            this.f8354c.userOverQuota(this.f8353a, a10);
        } else if (b10.equals("rejected")) {
            this.f8354c.userRewardRejected(this.f8353a, a10);
        } else {
            this.f8354c.validationRequestFailed(this.f8353a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f8353a.getAdZone().a());
        String clCode = this.f8353a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected boolean b() {
        return this.f8353a.aE();
    }
}
