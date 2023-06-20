package kd;

import com.amazon.device.ads.DtbDeviceDataRetriever;

/* compiled from: ConnectionType.java */
/* loaded from: classes3.dex */
public enum b {
    BLUETOOTH("bluetooth"),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    NONE("none"),
    UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
    WIFI("wifi"),
    WIMAX("wimax"),
    VPN("vpn");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f33461a;

    b(String str) {
        this.f33461a = str;
    }
}
