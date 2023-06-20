package fm.castbox.mediation.model.ad.bidding;

import ed.c;

/* loaded from: classes3.dex */
public abstract class BaseBid {
    @c("ad_format")
    protected String adFormat;
    protected String cur;
    @c("display_notification_url")
    protected String displayNotificationUrl;
    @c("cpm")
    protected float ecpm;
    @c("loss_notification_url")
    protected String lossNoticeUrl;
    @c("network_name")
    protected String networkName;
    protected String payload;
    @c("tag_id")
    protected String placementId;
    @c("win_notification_url")
    protected String winNoticeUrl;

    public abstract boolean equals(BaseBid baseBid);

    public String getAdFormat() {
        return this.adFormat;
    }

    public String getCur() {
        return this.cur;
    }

    public String getDisplayNotificationUrl() {
        return this.displayNotificationUrl;
    }

    public float getEcpm() {
        return this.ecpm;
    }

    public String getLossNoticeUrl() {
        return this.lossNoticeUrl;
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getWinNoticeUrl() {
        return this.winNoticeUrl;
    }

    public String toString() {
        return "BaseBid{networkName='" + this.networkName + "', placementId='" + this.placementId + "', adFormat='" + this.adFormat + "', payload='" + this.payload + "', ecpm=" + this.ecpm + ", cur='" + this.cur + "', displayNotificationUrl='" + this.displayNotificationUrl + "', winNoticeUrl='" + this.winNoticeUrl + "', lossNoticeUrl='" + this.lossNoticeUrl + "'}";
    }
}
