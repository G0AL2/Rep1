package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f8064a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8065b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8066c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.a.c f8067d;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
        this.f8064a = b();
        this.f8065b = i();
        this.f8066c = aM();
        this.f8067d = new com.applovin.impl.sdk.a.c(this);
    }

    private String aM() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f8064a);
            JsonUtils.putString(this.adObject, "stream_url", this.f8066c);
        }
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, DownloadResource.TYPE_VIDEO, uri.toString());
        }
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* renamed from: c */
    public com.applovin.impl.sdk.a.c o() {
        return this.f8067d;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f8065b;
    }

    public String e() {
        return this.f8066c;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return this.adObject.has("stream_url");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f8064a);
            JsonUtils.putString(jSONObject, DownloadResource.TYPE_VIDEO, this.f8065b);
            JsonUtils.putString(jSONObject, "stream_url", this.f8066c);
        }
        return deepCopy;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        String aM = aM();
        if (StringUtils.isValidString(aM)) {
            return Uri.parse(aM);
        }
        String i10 = i();
        if (StringUtils.isValidString(i10)) {
            return Uri.parse(i10);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return h() != null;
    }

    public String i() {
        return getStringFromAdObject(DownloadResource.TYPE_VIDEO, "");
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public i.a n() {
        return a(getIntFromAdObject("expandable_style", i.a.INVISIBLE.a()));
    }
}
