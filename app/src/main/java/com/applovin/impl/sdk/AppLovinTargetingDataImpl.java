package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f7959a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f7960b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Integer f7961c = null;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinGender f7962d = null;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinAdContentRating f7963e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f7964f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f7965g = null;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f7966h = null;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f7967i = null;

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7960b) {
            if (StringUtils.isValidString(str2)) {
                this.f7959a.put(str, str2);
            } else {
                this.f7959a.remove(str);
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.f7960b) {
            this.f7959a.clear();
        }
    }

    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f7960b) {
            hashMap = new HashMap(this.f7959a);
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.f7964f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinGender getGender() {
        return this.f7962d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.f7967i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.f7966h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f7963e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.f7965g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.f7961c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f7964f = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            a(InneractiveMediationDefs.KEY_GENDER, str);
            this.f7962d = appLovinGender;
        }
        str = null;
        a(InneractiveMediationDefs.KEY_GENDER, str);
        this.f7962d = appLovinGender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f7967i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f7966h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f7963e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f7965g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f7961c = num;
    }
}
