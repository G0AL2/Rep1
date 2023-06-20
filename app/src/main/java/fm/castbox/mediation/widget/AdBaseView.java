package fm.castbox.mediation.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
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
public class AdBaseView extends FrameLayout {
    private static final String TAG = AdBaseView.class.getSimpleName();
    protected String appBundleName;
    protected String appVersion;
    private List<Bid> bids;
    private HttpClient httpClient;
    protected String inventoryId;
    private AdRequestListener listener;
    protected String requestId;
    private List<Waterfall> waterfalls;

    public AdBaseView(Context context) {
        super(context);
        init(context);
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
        List<Bid> list = this.bids;
        if (list != null) {
            list.clear();
        }
        this.bids = null;
        List<Waterfall> list2 = this.waterfalls;
        if (list2 != null) {
            list2.clear();
        }
        this.waterfalls = null;
    }

    public void destroy() {
        this.httpClient.cancelAllOngoingRequests();
        resetAdResponse();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fireAdRequest() {
        resetAdResponse();
        this.httpClient.fulfillAdRequest(createAdRequestParams(), new AdRequestListener() { // from class: fm.castbox.mediation.widget.AdBaseView.1
            @Override // fm.castbox.mediation.http.AdRequestListener
            public void onFailure(AdError adError) {
                if (AdBaseView.this.listener != null) {
                    AdBaseView.this.listener.onFailure(adError);
                }
            }

            @Override // fm.castbox.mediation.http.AdRequestListener
            public void onResponse(String str, List<Bid> list, List<Waterfall> list2) {
                AdBaseView adBaseView = AdBaseView.this;
                adBaseView.requestId = str;
                adBaseView.bids = list;
                AdBaseView.this.waterfalls = list2;
                if (AdBaseView.this.listener != null) {
                    AdBaseView.this.listener.onResponse(str, list, list2);
                }
            }
        });
    }

    protected String getRequestId() {
        return this.requestId;
    }

    public void pause() {
        this.httpClient.cancelAllOngoingRequests();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerListener(AdRequestListener adRequestListener) {
        this.listener = adRequestListener;
    }

    public void resume() {
    }

    public AdBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AdBaseView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }

    public AdBaseView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init(context);
    }
}
