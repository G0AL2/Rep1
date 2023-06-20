package fm.castbox.mediation.model.ad.waterfall;

import ed.c;

/* loaded from: classes3.dex */
public abstract class BaseWaterfall {
    @c("ecpm_floor")
    protected float EcpmFloor;
    @c("ad_format")
    protected String adFormat;
    @c("ad_unit_id")
    protected String adUnitId;
    @c("ad_unit_name")
    protected String adUnitName;
    @c("network_name")
    protected String networkName;

    public String getAdFormat() {
        return this.adFormat;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public String getAdUnitName() {
        return this.adUnitName;
    }

    public float getEcpmFloor() {
        return this.EcpmFloor;
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public String toString() {
        return "BaseWaterfall{networkName='" + this.networkName + "', adUnitName='" + this.adUnitName + "', adFormat='" + this.adFormat + "', adUnitId='" + this.adUnitId + "', EcpmFloor=" + this.EcpmFloor + '}';
    }
}
