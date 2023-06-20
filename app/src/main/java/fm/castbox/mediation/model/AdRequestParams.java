package fm.castbox.mediation.model;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import ed.c;
import fm.castbox.mediation.helper.TimezoneInfoProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class AdRequestParams {
    private AdRequestAppInfo app;
    private List<AdRequestBidInfo> bidders;
    @c("inventory_id")
    private String inventoryId;
    private AdRequestUserInfo user;

    /* loaded from: classes3.dex */
    public static class Builder {
        private AdRequestAppInfo app;
        private List<AdRequestBidInfo> bidders;
        private final String inventoryId;

        public Builder(String str) {
            this.inventoryId = str;
        }

        private AdRequestUserInfo collectUserInfo() {
            TimezoneInfoProvider timezoneInfoProvider = new TimezoneInfoProvider();
            AdRequestUserInfo adRequestUserInfo = new AdRequestUserInfo();
            TimezoneInfoProvider.TimezoneInfo deviceTimezoneInfo = timezoneInfoProvider.getDeviceTimezoneInfo();
            if (deviceTimezoneInfo != null) {
                adRequestUserInfo.setCountryCode(deviceTimezoneInfo.getCountryCode());
            } else {
                adRequestUserInfo.setCountryCode(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            }
            return adRequestUserInfo;
        }

        public Builder app(AdRequestAppInfo adRequestAppInfo) {
            this.app = adRequestAppInfo;
            return this;
        }

        public Builder appendBidderInfo(AdRequestBidInfo adRequestBidInfo) {
            if (this.bidders == null) {
                this.bidders = new ArrayList();
            }
            this.bidders.add(adRequestBidInfo);
            return this;
        }

        public AdRequestParams build() {
            AdRequestParams adRequestParams = new AdRequestParams();
            adRequestParams.setInventoryId(this.inventoryId);
            adRequestParams.setApp(this.app);
            adRequestParams.setBidders(this.bidders);
            adRequestParams.setUser(collectUserInfo());
            return adRequestParams;
        }
    }

    public AdRequestAppInfo getApp() {
        return this.app;
    }

    public List<AdRequestBidInfo> getBidders() {
        return this.bidders;
    }

    public String getInventoryId() {
        return this.inventoryId;
    }

    public AdRequestUserInfo getUser() {
        return this.user;
    }

    public void setApp(AdRequestAppInfo adRequestAppInfo) {
        this.app = adRequestAppInfo;
    }

    public void setBidders(List<AdRequestBidInfo> list) {
        this.bidders = list;
    }

    public void setInventoryId(String str) {
        this.inventoryId = str;
    }

    public void setUser(AdRequestUserInfo adRequestUserInfo) {
        this.user = adRequestUserInfo;
    }

    public String toString() {
        return "AdRequestParams{inventoryId='" + this.inventoryId + "', app=" + this.app + ", bidders=" + this.bidders + ", user=" + this.user + '}';
    }
}
