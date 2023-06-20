package fm.castbox.mediation.model.ad.bidding.facebook;

/* loaded from: classes3.dex */
public class AudienceNetworkDeviceInfo {
    private int dnt;
    private String ifa;

    /* renamed from: ua  reason: collision with root package name */
    private String f30373ua;

    public int getDnt() {
        return this.dnt;
    }

    public String getIfa() {
        return this.ifa;
    }

    public String getUa() {
        return this.f30373ua;
    }

    public void setDnt(int i10) {
        this.dnt = i10;
    }

    public void setIfa(String str) {
        this.ifa = str;
    }

    public void setUa(String str) {
        this.f30373ua = str;
    }

    public String toString() {
        return "AudienceNetworkDeviceInfo{ifa='" + this.ifa + "', dnt=" + this.dnt + ", ua='" + this.f30373ua + "'}";
    }
}
