package fm.castbox.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import fm.castbox.mediation.SDKManager;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.http.AdRequestListener;
import fm.castbox.mediation.http.HttpClient;
import fm.castbox.mediation.model.AdRequestAppInfo;
import fm.castbox.mediation.model.AdRequestBidInfo;
import fm.castbox.mediation.model.AdRequestParams;
import fm.castbox.mediation.model.NetworkName;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkDeviceInfo;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkRegsInfo;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkSignal;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkUserInfo;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseInterstitialAd {
    private static final String TAG = "BaseInterstitialAd";
    protected String appBundleName;
    protected String appVersion;
    private AdRequestListener downstreamListener;
    protected Activity hostingActivity;
    private HttpClient httpClient;
    protected String inventoryId;
    protected String requestId;

    public BaseInterstitialAd(Activity activity, String str) {
        this.hostingActivity = activity;
        this.inventoryId = str;
        init(activity);
    }

    private AdRequestParams createAdRequestParams() {
        AudienceNetworkDeviceInfo audienceNetworkDeviceInfo = new AudienceNetworkDeviceInfo();
        audienceNetworkDeviceInfo.setDnt(0);
        audienceNetworkDeviceInfo.setIfa(SDKManager.getInstance().getIdfa());
        audienceNetworkDeviceInfo.setUa(SDKManager.getInstance().getUserAgent());
        AudienceNetworkRegsInfo audienceNetworkRegsInfo = new AudienceNetworkRegsInfo();
        audienceNetworkRegsInfo.setCoppa(0);
        AudienceNetworkUserInfo audienceNetworkUserInfo = new AudienceNetworkUserInfo();
        audienceNetworkUserInfo.setBuyerid(SDKManager.getInstance().getAudienceNetworkBuyerId());
        AudienceNetworkSignal audienceNetworkSignal = new AudienceNetworkSignal();
        audienceNetworkSignal.setDevice(audienceNetworkDeviceInfo);
        audienceNetworkSignal.setUser(audienceNetworkUserInfo);
        audienceNetworkSignal.setRegs(audienceNetworkRegsInfo);
        AdRequestAppInfo adRequestAppInfo = new AdRequestAppInfo();
        adRequestAppInfo.setVer(this.appVersion);
        adRequestAppInfo.setBundle(this.appBundleName);
        AdRequestBidInfo.Builder builder = new AdRequestBidInfo.Builder(NetworkName.FACEBOOK_AUDIENCE_NETWORK);
        builder.signal(audienceNetworkSignal);
        AdRequestParams.Builder builder2 = new AdRequestParams.Builder(this.inventoryId);
        builder2.app(adRequestAppInfo).appendBidderInfo(builder.build());
        return builder2.build();
    }

    private void init(Context context) {
        if (context == null) {
            Log.e(TAG, "no context passed in");
            return;
        }
        this.appBundleName = context.getPackageName();
        try {
            this.appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(TAG, "failed to get application version");
            e10.printStackTrace();
        }
        this.httpClient = HttpClient.getInstance();
    }

    private void resetAdResponse() {
        this.requestId = null;
    }

    public void destroy() {
        this.httpClient.cancelAllOngoingRequests();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fireAdRequest() {
        resetAdResponse();
        this.httpClient.fulfillAdRequest(createAdRequestParams(), new AdRequestListener() { // from class: fm.castbox.mediation.interstitial.BaseInterstitialAd.1
            @Override // fm.castbox.mediation.http.AdRequestListener
            public void onFailure(AdError adError) {
                if (BaseInterstitialAd.this.downstreamListener != null) {
                    BaseInterstitialAd.this.downstreamListener.onFailure(adError);
                }
            }

            @Override // fm.castbox.mediation.http.AdRequestListener
            public void onResponse(String str, List<Bid> list, List<Waterfall> list2) {
                BaseInterstitialAd baseInterstitialAd = BaseInterstitialAd.this;
                baseInterstitialAd.requestId = str;
                if (baseInterstitialAd.downstreamListener != null) {
                    BaseInterstitialAd.this.downstreamListener.onResponse(str, list, list2);
                }
            }
        });
    }

    protected String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerListener(AdRequestListener adRequestListener) {
        this.downstreamListener = adRequestListener;
    }
}
