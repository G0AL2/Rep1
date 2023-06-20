package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b implements Runnable {
    public b(InneractiveAdManager inneractiveAdManager) {
    }

    @Override // java.lang.Runnable
    public void run() {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        SharedPreferences sharedPreferences = l.f20301a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null && sharedPreferences.contains("IAConfigFQE")) {
            return;
        }
        SharedPreferences sharedPreferences2 = l.f20301a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putBoolean("IAConfigFQE", true).apply();
        }
        new q.a(p.FIRST_OPENED, (InneractiveAdRequest) null, (e) null, (JSONArray) null).a((String) null);
    }
}
