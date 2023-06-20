package fm.castbox.mediation.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkSignal;

/* loaded from: classes3.dex */
public class AdRequestBidInfo {
    private String network_name;
    private Object signal;

    /* loaded from: classes3.dex */
    public static class Builder {
        private String network_name;
        private Object signal;

        public Builder(String str) {
            this.network_name = str;
        }

        public AdRequestBidInfo build() {
            AdRequestBidInfo adRequestBidInfo = new AdRequestBidInfo();
            adRequestBidInfo.setNetwork_name(this.network_name);
            adRequestBidInfo.setSignal(this.signal);
            return adRequestBidInfo;
        }

        public Builder signal(Object obj) {
            this.signal = obj;
            return this;
        }
    }

    public String getNetwork_name() {
        return this.network_name;
    }

    public String getSignal() {
        Gson create = new GsonBuilder().create();
        Object obj = this.signal;
        return obj instanceof AudienceNetworkSignal ? create.toJson((AudienceNetworkSignal) obj) : "";
    }

    public void setNetwork_name(String str) {
        this.network_name = str;
    }

    public void setSignal(Object obj) {
        this.signal = obj;
    }

    public String toString() {
        return "AdRequestBidInfo{network_name='" + this.network_name + "', signal='" + this.signal + "'}";
    }
}
