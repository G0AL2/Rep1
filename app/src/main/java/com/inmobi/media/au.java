package com.inmobi.media;

import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.ads.AdMetaInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Ad.java */
@ik
/* loaded from: classes3.dex */
public class au {
    public static final String CLICK_BEACON = "click";
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = "au";
    public static final String WIN_BEACON = "win_beacon";
    private String adAuctionMeta;
    private boolean allowAutoRedirection;
    private boolean applyBitmap;
    JSONArray assetUrls;
    private boolean canLoadBeforeShow;
    String impressionId;
    private JSONArray landingPageParams;
    JSONObject mAdContent;
    String mAdType;
    long mExpiryDurationInMillis;
    long mInsertionTimestampInMillis;
    boolean mIsPreloadWebView;
    private String mWebVast;
    String markupType;
    private JSONObject metaInfo;
    private String pubContent;
    private JSONArray trackers;
    JSONObject transaction;

    public au() {
        this.markupType = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        this.allowAutoRedirection = false;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    private long w() {
        long j10 = this.mExpiryDurationInMillis;
        if (j10 == -1) {
            return -1L;
        }
        return this.mInsertionTimestampInMillis + j10;
    }

    public final String a() {
        return this.mAdType;
    }

    public final JSONObject b() {
        return this.mAdContent;
    }

    public String c() {
        return this.mWebVast;
    }

    public boolean d() {
        return this.mIsPreloadWebView;
    }

    public boolean e() {
        return this.allowAutoRedirection;
    }

    public final String f() {
        return this.impressionId;
    }

    public AdMetaInfo g() {
        return new AdMetaInfo(t(), this.transaction);
    }

    public final Set<bn> h() {
        HashSet hashSet = new HashSet();
        try {
            if (this.assetUrls != null) {
                for (int i10 = 0; i10 < this.assetUrls.length(); i10++) {
                    JSONObject jSONObject = new JSONObject(this.assetUrls.getString(i10));
                    byte b10 = (byte) jSONObject.getInt("type");
                    String optString = jSONObject.optString(ImagesContract.URL);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(new bn(b10, optString));
                    }
                }
            }
            return hashSet;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return hashSet;
        }
    }

    public final String i() {
        return this.markupType;
    }

    public String j() {
        return this.pubContent;
    }

    public boolean k() {
        return this.canLoadBeforeShow;
    }

    public JSONObject l() {
        return this.transaction;
    }

    public JSONArray m() {
        return this.mAdContent.optJSONArray("trackingEvents");
    }

    public String n() {
        return this.mAdContent.optString("baseEventUrl", null);
    }

    public Long o() {
        try {
            if (this.mAdContent.has("asPlcId")) {
                return Long.valueOf(this.mAdContent.getLong("asPlcId"));
            }
            return null;
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public long p() {
        return this.mAdContent.optLong("lineItemId", Long.MIN_VALUE);
    }

    public String q() {
        return this.adAuctionMeta;
    }

    public boolean r() {
        return this.applyBitmap;
    }

    public Map<String, String> s() {
        try {
            return b(this.mAdContent.getJSONObject("pubContent"));
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public String t() {
        return this.mAdContent.optString("creativeId");
    }

    public String u() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.metaInfo;
        if (jSONObject2 != null) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("landingPageParams");
            this.landingPageParams = optJSONArray;
            return (optJSONArray == null || (jSONObject = (JSONObject) optJSONArray.opt(0)) == null) ? "DEFAULT" : jSONObject.optString("openMode", "DEFAULT");
        }
        return "DEFAULT";
    }

    public String v() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString("creativeType", null);
        }
        return null;
    }

    public boolean a(long j10) {
        long w10;
        if (w() == -1) {
            w10 = (this.mInsertionTimestampInMillis + TimeUnit.SECONDS.toMillis(j10)) - System.currentTimeMillis();
        } else {
            w10 = w() - System.currentTimeMillis();
        }
        return w10 < 0;
    }

    public void b(String str) throws JSONException {
        if ("inmobiJson".equals(i())) {
            this.mAdContent.put("pubContent", new JSONObject(str));
        } else {
            this.mAdContent.put("pubContent", str);
        }
        this.pubContent = str;
    }

    public List<String> c(String str) {
        JSONArray optJSONArray;
        if (this.trackers == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.trackers.length(); i10++) {
            try {
                JSONObject jSONObject = this.trackers.getJSONObject(i10);
                if (str.equals(jSONObject.optString("type")) && (optJSONArray = jSONObject.optJSONArray(ImagesContract.URL)) != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        linkedList.add(optJSONArray.getString(i11));
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public void a(String str) {
        this.mWebVast = str;
    }

    public static Map<String, String> b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("rewards")) {
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = jSONObject.optJSONObject("rewards");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.getString(next));
                }
            }
            return hashMap;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.pubContent = this.pubContent.replace(next, jSONObject.getString(next));
            }
        }
        b(this.pubContent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(au auVar, JSONArray jSONArray) {
        this.markupType = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        this.allowAutoRedirection = false;
        ij.a(auVar, this);
        this.assetUrls = jSONArray;
    }
}
