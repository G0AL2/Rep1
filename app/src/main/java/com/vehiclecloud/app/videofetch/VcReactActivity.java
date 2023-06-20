package com.vehiclecloud.app.videofetch;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.react.j;
import com.facebook.react.k;
import com.facebook.react.x;
import com.vehiclecloud.app.videofetch.rnads.RNAdsLifecycleManager;
import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
import java.util.List;
import jb.s;
import org.json.JSONObject;
import pf.c;
import s6.a;

/* loaded from: classes3.dex */
public class VcReactActivity extends j {
    private static final List<String> RTL_LOCALES = s.x("ar", "arc", "dv", "fa", "ha", "he", "khw", "ks", "ku", "ps", "ur", "yi", new String[0]);

    private void initRTL() {
        try {
            AsyncStorageHelper asyncStorageHelper = AsyncStorageHelper.INSTANCE;
            JSONObject query = AsyncStorageHelper.query(this, "appSettings");
            if (query == null) {
                return;
            }
            String string = query.getString("locale");
            if (string.isEmpty()) {
                return;
            }
            boolean contains = RTL_LOCALES.contains(string);
            a d10 = a.d();
            d10.c(this, contains);
            d10.a(this, contains);
        } catch (Exception e10) {
            timber.log.a.e(e10, "initRTL get ex:", new Object[0]);
        }
    }

    @Override // com.facebook.react.j
    protected k createReactActivityDelegate() {
        return new k(this, getMainComponentName()) { // from class: com.vehiclecloud.app.videofetch.VcReactActivity.1
            @Override // com.facebook.react.k
            protected x createRootView() {
                return new com.swmansion.gesturehandler.react.a(VcReactActivity.this);
            }
        };
    }

    @Override // com.facebook.react.j
    protected String getMainComponentName() {
        return "VideoFetch";
    }

    @Override // com.facebook.react.j, androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
            Intent intent = new Intent("onConfigurationChanged");
            intent.putExtra("newConfig", configuration);
            sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.j, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        c.f(this);
        super.onCreate(null);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        RNAdsLifecycleManager.onCreate(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.j, androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RNAdsLifecycleManager.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.j, androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        RNAdsLifecycleManager.onPause(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.j, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        RNAdsLifecycleManager.onResume(this);
        initRTL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        RNAdsLifecycleManager.onStop(this);
    }
}
