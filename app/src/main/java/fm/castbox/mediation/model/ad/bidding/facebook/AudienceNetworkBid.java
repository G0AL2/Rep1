package fm.castbox.mediation.model.ad.bidding.facebook;

import ed.c;
import fm.castbox.mediation.model.ad.bidding.BaseBid;

/* loaded from: classes3.dex */
public class AudienceNetworkBid extends BaseBid {
    @c("bidid")
    private String bidid;

    @Override // fm.castbox.mediation.model.ad.bidding.BaseBid
    public boolean equals(BaseBid baseBid) {
        if (baseBid != null && (baseBid instanceof AudienceNetworkBid)) {
            AudienceNetworkBid audienceNetworkBid = (AudienceNetworkBid) baseBid;
            return getNetworkName().equals(audienceNetworkBid.getNetworkName()) && getBidid().equals(audienceNetworkBid.getBidid()) && getAdFormat().equals(audienceNetworkBid.getAdFormat()) && getPlacementId().equals(audienceNetworkBid.getPlacementId());
        }
        return false;
    }

    public String getBidid() {
        return this.bidid;
    }

    @Override // fm.castbox.mediation.model.ad.bidding.BaseBid
    public String toString() {
        return "AudienceNetworkBid{" + super.toString() + ", bidid='" + this.bidid + "'}";
    }
}
