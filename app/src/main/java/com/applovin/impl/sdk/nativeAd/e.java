package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a implements a.InterfaceC0133a, AppLovinAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f8602a;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8603c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8604d;

    /* renamed from: e  reason: collision with root package name */
    private String f8605e;

    /* renamed from: f  reason: collision with root package name */
    private String f8606f;

    /* renamed from: g  reason: collision with root package name */
    private String f8607g;

    /* renamed from: h  reason: collision with root package name */
    private String f8608h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f8609i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f8610j;

    /* renamed from: k  reason: collision with root package name */
    private Uri f8611k;

    /* renamed from: l  reason: collision with root package name */
    private Uri f8612l;

    /* renamed from: m  reason: collision with root package name */
    private com.applovin.impl.a.a f8613m;

    /* renamed from: n  reason: collision with root package name */
    private Uri f8614n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f8615o;

    /* renamed from: p  reason: collision with root package name */
    private final List<String> f8616p;

    /* renamed from: q  reason: collision with root package name */
    private String f8617q;

    /* renamed from: r  reason: collision with root package name */
    private final List<i> f8618r;

    /* renamed from: s  reason: collision with root package name */
    private final List<i> f8619s;

    /* renamed from: t  reason: collision with root package name */
    private final List<i> f8620t;

    /* renamed from: u  reason: collision with root package name */
    private final List<i> f8621u;

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super("TaskRenderNativeAd", mVar);
        this.f8605e = "";
        this.f8606f = "";
        this.f8607g = "";
        this.f8608h = "";
        this.f8609i = null;
        this.f8610j = null;
        this.f8611k = null;
        this.f8612l = null;
        this.f8614n = null;
        this.f8615o = null;
        this.f8616p = new ArrayList();
        this.f8618r = new ArrayList();
        this.f8619s = new ArrayList();
        this.f8620t = new ArrayList();
        this.f8621u = new ArrayList();
        this.f8602a = jSONObject;
        this.f8603c = jSONObject2;
        this.f8604d = appLovinNativeAdLoadListener;
    }

    private void a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f8602a), JsonUtils.shallowCopy(this.f8603c), this.f8349b).setTitle(this.f8605e).setAdvertiser(this.f8606f).setBody(this.f8607g).setCallToAction(this.f8608h).setIconUri(this.f8609i).setMainImageUri(this.f8610j).setPrivacyIconUri(this.f8611k).setVastAd(this.f8613m).setPrivacyDestinationUri(this.f8612l).setClickDestinationUri(this.f8614n).setClickDestinationBackupUri(this.f8615o).setClickTrackingUrls(this.f8616p).setJsTracker(this.f8617q).setImpressionRequests(this.f8618r).setViewableMRC50Requests(this.f8619s).setViewableMRC100Requests(this.f8620t).setViewableVideo50Requests(this.f8621u).build();
        build.getAdEventTracker().b();
        if (v.a()) {
            a("Starting cache task for type: " + build.getType() + "...");
        }
        this.f8349b.S().a(new a(build, this.f8349b, this), o.a.MAIN);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, ImagesContract.URL, null);
        if (StringUtils.isValidString(string)) {
            this.f8614n = Uri.parse(string);
            if (v.a()) {
                a("Processed click destination URL: " + this.f8614n);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f8615o = Uri.parse(string2);
            if (v.a()) {
                a("Processed click destination backup URL: " + this.f8615o);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f8616p.addAll(JsonUtils.toList(jSONArray));
                if (v.a()) {
                    a("Processed click tracking URLs: " + this.f8616p);
                }
            } catch (Throwable th) {
                if (v.a()) {
                    a("Failed to render click tracking URLs", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f8604d.onNativeAdLoadFailed(-6);
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (v.a()) {
                    e.this.a("Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    if (v.a()) {
                        e.this.a("Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.f8604d.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    if (v.a()) {
                        e.this.a("Failed to prepare native ad view components", th);
                    }
                    e.this.b();
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0133a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (v.a()) {
            a("Successfully cached and loaded ad");
        }
        b(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (v.a()) {
            a("VAST ad rendered successfully");
        }
        this.f8613m = (com.applovin.impl.a.a) appLovinAd;
        a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (v.a()) {
            d("VAST ad failed to render");
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v58 */
    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String str2;
        StringBuilder sb4;
        String str3;
        String sb5;
        String str4;
        Uri uri;
        ?? r22 = 0;
        String string = JsonUtils.getString(this.f8602a, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f8611k = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f8602a, "privacy_url", null);
        if (!URLUtil.isValidUrl(string2)) {
            string2 = "https://www.applovin.com/privacy/";
        }
        this.f8612l = Uri.parse(string2);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8602a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (v.a()) {
                d("No oRtb response provided: " + this.f8602a);
            }
            b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, MediationMetaData.KEY_VERSION, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
        if (v.a()) {
            a("Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (v.a()) {
                d("Unable to retrieve assets - failing ad load: " + this.f8602a);
            }
            b();
            return;
        }
        String str5 = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r22);
            if (jSONObject4.has("title")) {
                this.f8605e = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r22), "text", r22);
                if (v.a()) {
                    a("Processed title: " + this.f8605e);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r22));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r22);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, ImagesContract.URL, r22);
                if (i12 == 1 || 3 == i11) {
                    this.f8609i = Uri.parse(string4);
                    if (v.a()) {
                        sb3 = new StringBuilder();
                        sb3.append("Processed icon URL: ");
                        uri = this.f8609i;
                        sb3.append(uri);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f8610j = Uri.parse(string4);
                    if (v.a()) {
                        sb3 = new StringBuilder();
                        sb3.append("Processed main image URL: ");
                        uri = this.f8610j;
                        sb3.append(uri);
                    }
                } else {
                    if (v.a()) {
                        c("Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 > 0 && i14 > 0) {
                        int i15 = ((i13 / i14) > 1.0d ? 1 : ((i13 / i14) == 1.0d ? 0 : -1));
                        boolean a10 = v.a();
                        if (i15 > 0) {
                            if (a10) {
                                a("Inferring main image from " + i13 + "x" + i14 + "...");
                            }
                            this.f8610j = Uri.parse(string4);
                        } else {
                            if (a10) {
                                a("Inferring icon image from " + i13 + "x" + i14 + "...");
                            }
                            this.f8609i = Uri.parse(string4);
                        }
                    } else if (v.a()) {
                        sb5 = "Skipping...";
                        c(sb5);
                    }
                }
                str4 = sb3.toString();
                a(str4);
            } else {
                if (jSONObject4.has(DownloadResource.TYPE_VIDEO)) {
                    str5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, DownloadResource.TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                    if (StringUtils.isValidString(str5)) {
                        if (v.a()) {
                            str4 = "Processed VAST video";
                            a(str4);
                        }
                    } else if (v.a()) {
                        sb4 = new StringBuilder();
                        str3 = "Ignoring invalid \"vasttag\" for video: ";
                        sb4.append(str3);
                        sb4.append(jSONObject4);
                        sb5 = sb4.toString();
                    }
                } else if (jSONObject4.has("data")) {
                    int i16 = JsonUtils.getInt(jSONObject4, "id", -1);
                    JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                    int i17 = JsonUtils.getInt(jSONObject6, "type", -1);
                    String string5 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
                    if (i17 == 1 || i16 == 8) {
                        this.f8606f = string5;
                        if (v.a()) {
                            sb3 = new StringBuilder();
                            sb3.append("Processed advertiser: ");
                            str2 = this.f8606f;
                            sb3.append(str2);
                        }
                    } else if (i17 == 2 || i16 == 4) {
                        this.f8607g = string5;
                        if (v.a()) {
                            sb3 = new StringBuilder();
                            sb3.append("Processed body: ");
                            str2 = this.f8607g;
                            sb3.append(str2);
                        }
                    } else if (i17 == 12 || i16 == 5) {
                        this.f8608h = string5;
                        if (v.a()) {
                            sb3 = new StringBuilder();
                            sb3.append("Processed cta: ");
                            str2 = this.f8608h;
                            sb3.append(str2);
                        }
                    } else if (v.a()) {
                        sb4 = new StringBuilder();
                        str3 = "Skipping unsupported data: ";
                        sb4.append(str3);
                        sb4.append(jSONObject4);
                        sb5 = sb4.toString();
                    }
                    str4 = sb3.toString();
                    a(str4);
                } else if (v.a()) {
                    d("Unsupported asset object: " + jSONObject4);
                }
                c(sb5);
            }
            i10++;
            r22 = 0;
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string6)) {
            this.f8617q = string6;
            a("Processed jstracker: " + string6);
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i18 = 0;
            while (i18 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i18, obj);
                if (objectAtIndex instanceof String) {
                    String str6 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str6)) {
                        this.f8618r.add(new i.a(this.f8349b).a(str6).d(false).c(false).a());
                        if (v.a()) {
                            a("Processed imptracker URL: " + str6);
                        }
                    }
                }
                i18++;
                obj = null;
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i19, (JSONObject) null);
                int i20 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i21 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string7 = JsonUtils.getString(jSONObject7, ImagesContract.URL, null);
                if (!TextUtils.isEmpty(string7)) {
                    if (i21 == 1 || i21 == 2) {
                        i a11 = new i.a(this.f8349b).a(string7).d(false).c(false).g(i21 == 2).a();
                        if (i20 == 1) {
                            this.f8618r.add(a11);
                            if (v.a()) {
                                a("Processed impression URL: " + string7);
                            }
                        } else if (i20 == 2) {
                            this.f8619s.add(a11);
                            if (v.a()) {
                                sb2 = new StringBuilder();
                                str = "Processed viewable MRC50 URL: ";
                                sb2.append(str);
                                sb2.append(string7);
                                a(sb2.toString());
                            }
                        } else if (i20 == 3) {
                            this.f8620t.add(a11);
                            if (v.a()) {
                                sb2 = new StringBuilder();
                                str = "Processed viewable MRC100 URL: ";
                                sb2.append(str);
                                sb2.append(string7);
                                a(sb2.toString());
                            }
                        } else {
                            if (i20 == 4) {
                                this.f8621u.add(a11);
                                if (v.a()) {
                                    a("Processed viewable video 50 URL: " + string7);
                                }
                            } else if (v.a()) {
                                d("Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (v.a()) {
                        d("Unsupported method for event tracker: " + jSONObject7);
                    }
                }
            }
        }
        if (!StringUtils.isValidString(str5)) {
            a();
            return;
        }
        if (v.a()) {
            a("Processing VAST video...");
        }
        this.f8349b.S().a((com.applovin.impl.sdk.e.a) r.a(str5, JsonUtils.shallowCopy(this.f8602a), JsonUtils.shallowCopy(this.f8603c), com.applovin.impl.sdk.ad.b.UNKNOWN, this, this.f8349b));
    }
}
