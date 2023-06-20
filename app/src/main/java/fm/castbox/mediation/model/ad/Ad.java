package fm.castbox.mediation.model.ad;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Ad {

    /* renamed from: id  reason: collision with root package name */
    private String f30372id;
    private List<Bid> bids = new ArrayList();
    private List<Waterfall> waterfall = new ArrayList();

    public List<Bid> getBids() {
        return this.bids;
    }

    public String getId() {
        return this.f30372id;
    }

    public List<Waterfall> getWaterfall() {
        return this.waterfall;
    }

    public String toString() {
        return "Ad{id='" + this.f30372id + "', bids=" + this.bids + ", waterfalls=" + this.waterfall + '}';
    }
}
