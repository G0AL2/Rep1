package com.amazon.device.ads;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DTBAdResponse {
    private static final String AMAZON_AD_INFO = "{bidID:'%s',aaxHost:'%s',type:'%s',width:%d,height:%d}";
    private static final String LOG_TAG = "DTBAdResponse";
    private String bidId;
    private String crid;
    private String hostName;
    private String impressionUrl;
    private boolean isVideo;
    private Map<String, List<String>> kvpDictionary = new HashMap();
    private Map<DTBAdSize, List<DtbPricePoint>> pricepoints = new HashMap();
    private DTBAdRequest refreshLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.amazon.device.ads.DTBAdResponse$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String getAmazonInfo() {
        String str = "";
        if (getDTBAds().size() == 0) {
            return "";
        }
        DTBAdSize dTBAdSize = getDTBAds().get(0);
        int width = dTBAdSize.getWidth();
        int height = dTBAdSize.getHeight();
        int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdType[dTBAdSize.getDTBAdType().ordinal()];
        if (i10 == 1) {
            str = DownloadResource.TYPE_VIDEO;
        } else if (i10 == 2) {
            str = AdView.AdType.BANNER;
        } else if (i10 == 3) {
            Activity currentActivity = AdRegistration.getCurrentActivity();
            if (currentActivity != null) {
                Display defaultDisplay = ((WindowManager) currentActivity.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                width = DTBAdUtil.pixelsToDeviceIndependenPixels(displayMetrics.widthPixels);
                height = DTBAdUtil.pixelsToDeviceIndependenPixels(displayMetrics.heightPixels);
            }
            str = "interstitial";
        }
        String str2 = this.hostName;
        if (str2 == null) {
            str2 = DtbDebugProperties.getAaxHostName(DtbSharedPreferences.getInstance().getAaxHostname());
        }
        return String.format(AMAZON_AD_INFO, this.bidId, str2, str, Integer.valueOf(width), Integer.valueOf(height));
    }

    private String getBidKey() {
        return !this.isVideo ? DTBAdLoader.A9_BID_ID_KEY : DTBAdLoader.A9_VID_KEY;
    }

    private Map<String, List<String>> getVideoAdsRequestCustomParamsAsList() {
        HashMap hashMap = new HashMap();
        if (this.isVideo) {
            hashMap.put(DTBAdLoader.A9_VID_KEY, Collections.singletonList(this.bidId));
            hashMap.put(DTBAdLoader.A9_HOST_KEY, Collections.singletonList(DtbDebugProperties.getRoute53EnabledCNAME(DtbSharedPreferences.getInstance().getRoute53EnabledCNAME())));
            for (DtbPricePoint dtbPricePoint : this.pricepoints.get(getDTBAds().get(0))) {
                hashMap.put(DTBAdLoader.A9_PRICE_POINTS_KEY, Collections.singletonList(dtbPricePoint.getPricePoint()));
            }
            hashMap.putAll(getKvpDictionary());
        }
        return hashMap;
    }

    public int getAdCount() {
        return this.pricepoints.size();
    }

    public DTBAdRequest getAdLoader() {
        return this.refreshLoader;
    }

    public String getBidId() {
        return this.bidId;
    }

    public String getCrid() {
        return this.crid;
    }

    public List<DTBAdSize> getDTBAds() {
        return new ArrayList(this.pricepoints.keySet());
    }

    public Map<String, List<String>> getDefaultDisplayAdsRequestCustomParams() {
        HashMap hashMap = new HashMap();
        try {
            if (!this.isVideo) {
                if (this.pricepoints.size() > 0) {
                    hashMap.put(DTBAdLoader.A9_BID_ID_KEY, Collections.singletonList(this.bidId));
                    hashMap.put(getBidKey(), Collections.singletonList(this.bidId));
                    hashMap.put(DTBAdLoader.A9_HOST_KEY, Collections.singletonList(DtbSharedPreferences.getInstance().getAaxHostname()));
                    for (DtbPricePoint dtbPricePoint : this.pricepoints.get(getDTBAds().get(0))) {
                        hashMap.put(DTBAdLoader.A9_PRICE_POINTS_KEY, Collections.singletonList(dtbPricePoint.getPricePoint()));
                    }
                }
                hashMap.putAll(getKvpDictionary());
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getDefaultDisplayAdsRequestCustomParams method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getDefaultDisplayAdsRequestCustomParams method", e10);
        }
        return hashMap;
    }

    public String getDefaultPricePoints() {
        try {
            if (getAdCount() == 0) {
                return null;
            }
            return getPricePoints(getDTBAds().get(0));
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getDefaultPricePoints method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getDefaultPricePoints method", e10);
            return null;
        }
    }

    public Map<String, String> getDefaultVideoAdsRequestCustomParams() {
        HashMap hashMap = new HashMap();
        try {
            if (this.isVideo) {
                hashMap.put(DTBAdLoader.A9_VID_KEY, this.bidId);
                hashMap.put(DTBAdLoader.A9_HOST_KEY, DtbDebugProperties.getRoute53EnabledCNAME(DtbSharedPreferences.getInstance().getRoute53EnabledCNAME()));
                for (DtbPricePoint dtbPricePoint : this.pricepoints.get(getDTBAds().get(0))) {
                    hashMap.put(DTBAdLoader.A9_PRICE_POINTS_KEY, dtbPricePoint.getPricePoint());
                }
                for (Map.Entry<String, List<String>> entry : this.kvpDictionary.entrySet()) {
                    hashMap.put(entry.getKey(), TextUtils.join(", ", entry.getValue()));
                }
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getDefaultVideoAdsRequestCustomParams method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getDefaultVideoAdsRequestCustomParams method", e10);
        }
        return hashMap;
    }

    @Deprecated
    public String getHost() {
        try {
            return DtbSharedPreferences.getInstance().getAaxHostname();
        } catch (IllegalArgumentException e10) {
            String str = LOG_TAG;
            DtbLog.debug(str, "Could not get host name " + e10.getLocalizedMessage());
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getPricePoints method", e10);
            return null;
        }
    }

    public String getImpressionUrl() {
        return this.impressionUrl;
    }

    Map<String, List<String>> getKvpDictionary() {
        return this.kvpDictionary;
    }

    public String getMoPubKeywords() {
        Map<String, List<String>> videoAdsRequestCustomParamsAsList;
        try {
            DtbLog.debug(LOG_TAG, "API 'getMoPubKeywords' supports banner & video Ads.");
            StringBuilder sb2 = new StringBuilder();
            if (!this.isVideo) {
                videoAdsRequestCustomParamsAsList = getDefaultDisplayAdsRequestCustomParams();
            } else {
                videoAdsRequestCustomParamsAsList = getVideoAdsRequestCustomParamsAsList();
            }
            if (this.pricepoints.size() > 0) {
                boolean z10 = true;
                for (Map.Entry<String, List<String>> entry : videoAdsRequestCustomParamsAsList.entrySet()) {
                    for (String str : entry.getValue()) {
                        if (z10) {
                            z10 = false;
                        } else {
                            sb2.append(",");
                        }
                        sb2.append(entry.getKey());
                        sb2.append(":");
                        sb2.append(str);
                    }
                }
            }
            return sb2.toString();
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getMoPubKeywords method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getMoPubKeywords method", e10);
            return "";
        }
    }

    public String getMoPubServerlessKeywords() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Map<String, List<String>> defaultDisplayAdsRequestCustomParams = getDefaultDisplayAdsRequestCustomParams();
            if (this.pricepoints.size() > 0 && defaultDisplayAdsRequestCustomParams.containsKey(DTBAdLoader.A9_PRICE_POINTS_KEY)) {
                List<String> list = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
                if (list.size() > 0) {
                    sb2.append(DTBAdLoader.A9_PRICE_POINTS_KEY);
                    sb2.append(":");
                    sb2.append(list.get(0));
                }
            }
            return sb2.toString();
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getMoPubServerlessKeywords method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getMoPubServerlessKeywords method", e10);
            return "";
        }
    }

    public String getPricePoints(DTBAdSize dTBAdSize) {
        try {
            List<DtbPricePoint> list = this.pricepoints.get(dTBAdSize);
            if (list == null || list.isEmpty()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb2.append(list.get(i10).getPricePoint());
                if (i10 != list.size() - 1) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getPricePoints method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getPricePoints method", e10);
            return null;
        }
    }

    public Bundle getRenderingBundle() {
        return getRenderingBundle(false);
    }

    public HashMap<String, Object> getRenderingMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            hashMap.put(DTBAdView.BID_HTML, SDKUtilities.getBidInfo(this));
            hashMap.put(DTBAdView.EVENT_SERVER_PARAMETER, SDKUtilities.getPricePoint(this));
            hashMap.put(DTBAdView.AMAZON_AD_INFO, getAmazonInfo());
            hashMap.put(DTBAdView.BID_IDENTIFIER, this.bidId);
            hashMap.put(DTBAdView.HOSTNAME_IDENTIFIER, this.hostName);
            hashMap.put(DTBAdView.START_LOAD_TIME, Long.valueOf(new Date().getTime()));
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getRenderingMap method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getRenderingMap method", e10);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isVideo() {
        return this.isVideo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void putPricePoint(DtbPricePoint dtbPricePoint) {
        if (this.pricepoints.get(dtbPricePoint.getAdSize()) == null) {
            this.pricepoints.put(dtbPricePoint.getAdSize(), new ArrayList());
        }
        this.pricepoints.get(dtbPricePoint.getAdSize()).add(dtbPricePoint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdLoader(DTBAdRequest dTBAdRequest) {
        this.refreshLoader = dTBAdRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBidId(String str) {
        this.bidId = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCrid(String str) {
        this.crid = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHostName(String str) {
        this.hostName = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setImpressionUrl(String str) {
        this.impressionUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setKvpDictionary(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (this.kvpDictionary.get(next) == null) {
                        this.kvpDictionary.put(next, new ArrayList());
                    }
                    this.kvpDictionary.get(next).add(jSONArray.getString(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setVideo(boolean z10) {
        this.isVideo = z10;
    }

    public Bundle getRenderingBundle(String str) {
        return getRenderingBundle(false, str);
    }

    public Bundle getRenderingBundle(boolean z10) {
        return getRenderingBundle(z10, null);
    }

    public Bundle getRenderingBundle(boolean z10, String str) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DTBAdView.BID_HTML, SDKUtilities.getBidInfo(this));
            initializeEmptyBundle.putString(DTBAdView.BID_IDENTIFIER, this.bidId);
            initializeEmptyBundle.putString(DTBAdView.HOSTNAME_IDENTIFIER, this.hostName);
            initializeEmptyBundle.putString(DTBAdView.EVENT_SERVER_PARAMETER, SDKUtilities.getPricePoint(this));
            initializeEmptyBundle.putString(DTBAdView.AMAZON_AD_INFO, getAmazonInfo());
            initializeEmptyBundle.putLong(DTBAdView.START_LOAD_TIME, new Date().getTime());
            if (z10) {
                initializeEmptyBundle.putInt(DTBAdView.EXPECTED_WIDTH, SDKUtilities.getWidth(this));
                initializeEmptyBundle.putInt(DTBAdView.EXPECTED_HEIGHT, SDKUtilities.getHeight(this));
            }
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                initializeEmptyBundle.putString(DTBAdView.REQUEST_QUEUE, str);
            }
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getRenderingBundle method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute getRenderingBundle method", e10);
        }
        return initializeEmptyBundle;
    }
}
