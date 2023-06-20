package hd;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: DeviceTypeResolver.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31414a;

    public b(Context context) {
        this.f31414a = context;
    }

    private com.learnium.RNDeviceInfo.a b() {
        WindowManager windowManager = (WindowManager) this.f31414a.getSystemService("window");
        if (windowManager == null) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        double sqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        if (sqrt < 3.0d || sqrt > 6.9d) {
            if (sqrt > 6.9d && sqrt <= 18.0d) {
                return com.learnium.RNDeviceInfo.a.TABLET;
            }
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        return com.learnium.RNDeviceInfo.a.HANDSET;
    }

    private com.learnium.RNDeviceInfo.a c() {
        int i10 = this.f31414a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 == 0) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        return i10 >= 600 ? com.learnium.RNDeviceInfo.a.TABLET : com.learnium.RNDeviceInfo.a.HANDSET;
    }

    public com.learnium.RNDeviceInfo.a a() {
        if (this.f31414a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f31414a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        com.learnium.RNDeviceInfo.a c10 = c();
        return (c10 == null || c10 == com.learnium.RNDeviceInfo.a.UNKNOWN) ? b() : c10;
    }

    public boolean d() {
        return a() == com.learnium.RNDeviceInfo.a.TABLET;
    }
}
