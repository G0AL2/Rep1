package fm.castbox.mediation.model.ad.bidding.facebook;

/* loaded from: classes3.dex */
public class AudienceNetworkSignal {
    private AudienceNetworkDeviceInfo device;
    private AudienceNetworkRegsInfo regs;
    private AudienceNetworkUserInfo user;

    public AudienceNetworkDeviceInfo getDevice() {
        return this.device;
    }

    public AudienceNetworkRegsInfo getRegs() {
        return this.regs;
    }

    public AudienceNetworkUserInfo getUser() {
        return this.user;
    }

    public void setDevice(AudienceNetworkDeviceInfo audienceNetworkDeviceInfo) {
        this.device = audienceNetworkDeviceInfo;
    }

    public void setRegs(AudienceNetworkRegsInfo audienceNetworkRegsInfo) {
        this.regs = audienceNetworkRegsInfo;
    }

    public void setUser(AudienceNetworkUserInfo audienceNetworkUserInfo) {
        this.user = audienceNetworkUserInfo;
    }

    public String toString() {
        return "AudienceNetworkSignal{device=" + this.device + ", regs=" + this.regs + ", user=" + this.user + '}';
    }
}
