package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private final com.applovin.impl.sdk.a.e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final a clickHandler;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<i> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final String jsTracker;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private final Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final String tag;
    private final String title;
    private final com.applovin.impl.a.a vastAd;
    private final List<i> viewableMRC100Requests;
    private final List<i> viewableMRC50Requests;
    private final List<i> viewableVideo50Requests;

    /* loaded from: classes.dex */
    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<i> impressionRequests;
        private String jsTracker;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final m sdk;
        private String title;
        private com.applovin.impl.a.a vastAd;
        private List<i> viewableMRC100Requests;
        private List<i> viewableMRC50Requests;
        private List<i> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = mVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<i> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTracker(String str) {
            this.jsTracker = str;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(com.applovin.impl.a.a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<i> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<i> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<i> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f8593a;

        public a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8593a = appLovinNativeAdImpl;
        }

        public AppLovinNativeAdImpl a() {
            return this.f8593a;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a(this)) {
                    AppLovinNativeAdImpl a10 = a();
                    AppLovinNativeAdImpl a11 = aVar.a();
                    return a10 != null ? a10.equals(a11) : a11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a10 = a();
            return 59 + (a10 == null ? 43 : a10.hashCode());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((AppLovinAdBase) this.f8593a).sdk.u().maybeSubmitPersistentPostbacks(this.f8593a.getDirectClickTrackingPostbacks());
            for (String str : this.f8593a.clickTrackingUrls) {
                ((AppLovinAdBase) this.f8593a).sdk.X().dispatchPostbackAsync(str, null);
            }
            if (Utils.openUri(view.getContext(), this.f8593a.clickDestinationUri, ((AppLovinAdBase) this.f8593a).sdk) || Utils.openUri(view.getContext(), this.f8593a.clickDestinationBackupUri, ((AppLovinAdBase) this.f8593a).sdk)) {
                j.a(this.f8593a.eventListener, this.f8593a);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + a() + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f8594a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8594a = appLovinNativeAdImpl;
        }

        public AppLovinNativeAdImpl a() {
            return this.f8594a;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a(this)) {
                    AppLovinNativeAdImpl a10 = a();
                    AppLovinNativeAdImpl a11 = bVar.a();
                    return a10 != null ? a10.equals(a11) : a11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a10 = a();
            return 59 + (a10 == null ? 43 : a10.hashCode());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8594a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new a(this);
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new com.applovin.impl.sdk.a.e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        this.vastAd = builder.vastAd;
        this.privacyDestinationUri = builder.privacyDestinationUri;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTracker = builder.jsTracker;
        this.impressionRequests = builder.impressionRequests;
        this.viewableMRC50Requests = builder.viewableMRC50Requests;
        this.viewableMRC100Requests = builder.viewableMRC100Requests;
        this.viewableVideo50Requests = builder.viewableVideo50Requests;
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.sdk.d.a> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return postbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            if (StringUtils.isValidString(this.jsTracker)) {
                final com.applovin.impl.adview.d dVar = new com.applovin.impl.adview.d(null, this.sdk, view.getContext());
                dVar.loadData(this.jsTracker, "text/html", "UTF-8");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dVar.stopLoading();
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
            }
            for (i iVar : this.impressionRequests) {
                this.sdk.X().dispatchPostbackRequest(iVar, null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.d();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.e();
    }

    public com.applovin.impl.sdk.a.e getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public a getClickHandler() {
        return this.clickHandler;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                    URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                    String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                    String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                    arrayList.add((StringUtils.isValidString(string) && StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public com.applovin.impl.a.a getVastAd() {
        return this.vastAd;
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (!(g.c() && this.nativeAdView.isAttachedToWindow()) && (g.c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        if (v.a()) {
            v A = this.sdk.A();
            String str = this.tag;
            A.b(str, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners() && v.a()) {
                v A2 = this.sdk.A();
                String str2 = this.tag;
                A2.e(str2, "View has an onClickListener already - " + view);
            }
            view.setOnClickListener(this.clickHandler);
            this.registeredViews.add(view);
        }
        if (v.a()) {
            v A3 = this.sdk.A();
            String str3 = this.tag;
            A3.b(str3, "Registered views for clicks: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        m mVar = this.sdk;
        this.mediaView = new AppLovinMediaView(this, mVar, mVar.L());
        m mVar2 = this.sdk;
        this.optionsView = new AppLovinOptionsView(this, mVar2, mVar2.L());
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        for (View view : this.registeredViews) {
            view.setOnClickListener(null);
        }
        if (v.a()) {
            v A = this.sdk.A();
            String str = this.tag;
            A.b(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
