package com.fyber.inneractive.sdk.network;

/* loaded from: classes.dex */
public enum l {
    AD_TIMEOUT("X-IA-SESSION-TIMEOUT"),
    RETURNED_AD_TYPE("X-IA-Ad-Type"),
    HEIGHT("X-IA-Ad-Height"),
    WIDTH("X-IA-Ad-Width"),
    AD_NETWORK("X-IA-AdNetwork"),
    AD_NETWORK_ID("X-IA-AdNetwork-Id"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_UNIQUE_ID("X-IA-Cuid"),
    ERROR_CODE("X-IA-Error"),
    SESSION_ID("X-IA-Session"),
    CONTENT_ID("X-IA-Content"),
    PUBLISHER_ID("X-IA-Publisher"),
    AD_UNIT_ID("X-IA-Ad-Unit-ID"),
    AD_UNIT_TYPE("X-IA-Ad-Unit-Type"),
    AD_COMPLETION_URL("X-IA-Completion"),
    AD_UNIT_DISPLAY_TYPE("X-IA-Ad-Unit-Display-Type"),
    AD_DOMAIN("X-IA-Adomain"),
    APP_BUNDLE("X-IA-App-Bundle"),
    CAMPAIGN_ID("X-IA-Campaign-ID"),
    CREATIVE_ID("X-IA-Creative-ID"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION("X-IA-SdkAdapterName"),
    /* JADX INFO: Fake field, exist only in values array */
    SDK_ADAPTER_DATA("X-IA-SdkAdapterData"),
    CPM_VALUE("X-IA-Pricing-Value"),
    CPM_CURRENCY("X-IA-Pricing-Currency"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION("Location"),
    SDK_IMPRESSION_URL("X-IA-sdkImpressionUrl"),
    SDK_CLICK_URL("X-IA-sdkClickUrl"),
    BANNER_MRC_PERCENT("X-IA-MRC-Percent"),
    BANNER_MRC_DURATION("X-IA-MRC-Duration"),
    BANNER_MRC_IMPRESSION_URL("X-IA-MRC-Impression"),
    INTERSTITIAL_SKIP_MODE("X-IA-skipMode");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f17607a;

    l(String str) {
        this.f17607a = str;
    }
}
