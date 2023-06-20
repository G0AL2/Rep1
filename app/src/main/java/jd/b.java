package jd;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;

/* compiled from: ConnectivityReceiver.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f33086a;

    /* renamed from: b  reason: collision with root package name */
    private final WifiManager f33087b;

    /* renamed from: c  reason: collision with root package name */
    private final TelephonyManager f33088c;

    /* renamed from: d  reason: collision with root package name */
    private final ReactApplicationContext f33089d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f33090e = false;

    /* renamed from: f  reason: collision with root package name */
    private kd.b f33091f = kd.b.UNKNOWN;

    /* renamed from: g  reason: collision with root package name */
    private kd.a f33092g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33093h = false;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f33094i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ReactApplicationContext reactApplicationContext) {
        this.f33089d = reactApplicationContext;
        this.f33086a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f33087b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f33088c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    private WritableMap b(String str) {
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        str.hashCode();
        if (!str.equals("cellular")) {
            if (str.equals("wifi") && d.a(e()) && (connectionInfo = this.f33087b.getConnectionInfo()) != null) {
                try {
                    String ssid = connectionInfo.getSSID();
                    if (ssid != null && !ssid.contains("<unknown ssid>")) {
                        createMap.putString("ssid", ssid.replace("\"", ""));
                    }
                } catch (Exception unused) {
                }
                try {
                    String bssid = connectionInfo.getBSSID();
                    if (bssid != null) {
                        createMap.putString("bssid", bssid);
                    }
                } catch (Exception unused2) {
                }
                try {
                    createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                } catch (Exception unused3) {
                }
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    }
                } catch (Exception unused4) {
                }
                try {
                    byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    d.b(byteArray);
                    createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                } catch (Exception unused5) {
                }
                try {
                    byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    d.b(byteArray2);
                    int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                    createMap.putString("subnet", String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
                } catch (Exception unused6) {
                }
            }
        } else {
            kd.a aVar = this.f33092g;
            if (aVar != null) {
                createMap.putString("cellularGeneration", aVar.f33451a);
            }
            String networkOperatorName = this.f33088c.getNetworkOperatorName();
            if (networkOperatorName != null) {
                createMap.putString("carrier", networkOperatorName);
            }
        }
        return createMap;
    }

    protected WritableMap a(String str) {
        WritableMap createMap = Arguments.createMap();
        if (d.a(e())) {
            createMap.putBoolean("isWifiEnabled", this.f33087b.isWifiEnabled());
        }
        createMap.putString("type", str != null ? str : this.f33091f.f33461a);
        boolean z10 = false;
        boolean z11 = (this.f33091f.equals(kd.b.NONE) || this.f33091f.equals(kd.b.UNKNOWN)) ? false : true;
        createMap.putBoolean("isConnected", z11);
        if (this.f33093h && (str == null || str.equals(this.f33091f.f33461a))) {
            z10 = true;
        }
        createMap.putBoolean("isInternetReachable", z10);
        if (str == null) {
            str = this.f33091f.f33461a;
        }
        WritableMap b10 = b(str);
        if (z11) {
            b10.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        createMap.putMap("details", b10);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectivityManager c() {
        return this.f33086a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactApplicationContext e() {
        return this.f33089d;
    }

    public abstract void f();

    protected void g() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    public void h(boolean z10) {
        this.f33094i = Boolean.valueOf(z10);
        j(this.f33091f, this.f33092g, this.f33093h);
    }

    public abstract void i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(kd.b bVar, kd.a aVar, boolean z10) {
        Boolean bool = this.f33094i;
        if (bool != null) {
            z10 = bool.booleanValue();
        }
        boolean z11 = bVar != this.f33091f;
        boolean z12 = aVar != this.f33092g;
        boolean z13 = z10 != this.f33093h;
        if (z11 || z12 || z13) {
            this.f33091f = bVar;
            this.f33092g = aVar;
            this.f33093h = z10;
            if (this.f33090e) {
                g();
            }
        }
    }
}
