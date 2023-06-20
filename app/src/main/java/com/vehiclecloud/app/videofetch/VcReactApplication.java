package com.vehiclecloud.app.videofetch;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import androidx.work.b;
import com.facebook.react.f;
import com.facebook.react.m;
import com.facebook.react.p;
import com.facebook.react.s;
import com.facebook.react.t;
import com.facebook.soloader.SoLoader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vehiclecloud.app.videofetch.rnactivity.RNActivityPackage;
import com.vehiclecloud.app.videofetch.rnads.RNAdsPackage;
import com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientPackage;
import com.vehiclecloud.app.videofetch.rncrypto.RNCryptoPackage;
import com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderPackage;
import com.vehiclecloud.app.videofetch.rnfullscreen.RNFullScreenPackage;
import com.vehiclecloud.app.videofetch.rnintent.RNIntentPackage;
import com.vehiclecloud.app.videofetch.rnmedia.RNMediaPackage;
import com.vehiclecloud.app.videofetch.rnnotification.RNNotificationPackage;
import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
import com.vehiclecloud.app.videofetch.webview.RNWebViewPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import timber.log.a;

/* loaded from: classes3.dex */
public abstract class VcReactApplication extends Application implements m, b.c {
    public static final String TAG = "VcReactApplication";
    private final s mReactNativeHost = new s(this) { // from class: com.vehiclecloud.app.videofetch.VcReactApplication.1
        @Override // com.facebook.react.s
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override // com.facebook.react.s
        protected List<t> getPackages() {
            ArrayList<t> a10 = new f(this).a();
            a10.add(new RNDownloaderPackage());
            a10.add(new RNMediaPackage());
            a10.add(new RNAdsPackage());
            a10.add(new RNIntentPackage());
            a10.add(new RNWebViewPackage());
            a10.add(new RNCryptoPackage());
            a10.add(new RNBillingClientPackage());
            a10.add(new RNFullScreenPackage());
            a10.add(new RNNotificationPackage());
            a10.add(new RNActivityPackage());
            VcReactApplication.this.initPackages(a10);
            return a10;
        }

        @Override // com.facebook.react.s
        public boolean getUseDeveloperSupport() {
            return false;
        }
    };

    private String getUserId() {
        JSONObject query = AsyncStorageHelper.query(this, "castBox");
        if (query == null || !query.has("uid")) {
            return null;
        }
        return query.optString("uid");
    }

    private void initFirebaseAnalytics() {
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        firebaseAnalytics.h("device_id", string);
        String userId = getUserId();
        if (userId != null) {
            firebaseAnalytics.g(userId);
        }
    }

    private void initTimber() {
        a.g(new a.C0509a() { // from class: com.vehiclecloud.app.videofetch.VcReactApplication.2
            @Override // timber.log.a.c
            protected boolean isLoggable(String str, int i10) {
                return i10 >= 4;
            }
        });
    }

    private void initWebView() {
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a.d("processName: " + processName + "; packageName: " + getPackageName(), new Object[0]);
            if (getPackageName().equals(processName)) {
                return;
            }
            WebView.setDataDirectorySuffix(Integer.toHexString(processName.hashCode()));
        }
    }

    private static void initializeFlipper(Context context, p pVar) {
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        initWebView();
    }

    @Override // com.facebook.react.m
    public s getReactNativeHost() {
        return this.mReactNativeHost;
    }

    @Override // androidx.work.b.c
    public b getWorkManagerConfiguration() {
        return new b.C0081b().b(Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 2, Build.VERSION.SDK_INT < 24 ? 2 : 3)))).a();
    }

    protected void initPackages(List<t> list) {
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(org.wonday.orientation.a.a());
        SoLoader.l(this, false);
        initFirebaseAnalytics();
        initTimber();
    }
}
