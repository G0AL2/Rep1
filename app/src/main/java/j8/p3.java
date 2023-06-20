package j8;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: WifiLockManager.java */
/* loaded from: classes2.dex */
final class p3 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f32763a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f32764b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32765c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32766d;

    public p3(Context context) {
        this.f32763a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f32764b;
        if (wifiLock == null) {
            return;
        }
        if (this.f32765c && this.f32766d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f32764b == null) {
            WifiManager wifiManager = this.f32763a;
            if (wifiManager == null) {
                ea.r.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f32764b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f32765c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f32766d = z10;
        c();
    }
}
