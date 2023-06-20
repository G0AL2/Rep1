package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final m f8955a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(final m mVar) {
        this.f8955a = mVar;
        if (mVar.e()) {
            return;
        }
        a("SDK Session Begin");
        mVar.aj().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.v.1
            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                v.this.a("SDK Session End");
                mVar.aj().unregisterReceiver(this);
            }
        }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.a().a(str).a();
        f("AppLovinSdk", kVar.toString());
    }

    private void a(String str, String str2, boolean z10) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f8955a.a(com.applovin.impl.sdk.c.b.al)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + intValue) - 1) / intValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * intValue;
                String substring = str2.substring(i12, Math.min(length, i12 + intValue));
                if (z10) {
                    Log.d(str, substring);
                } else {
                    b(str, substring);
                }
            }
        }
    }

    public static boolean a() {
        List<AppLovinSdk> a10 = AppLovinSdk.a();
        if (a10.isEmpty()) {
            return false;
        }
        AppLovinSdk appLovinSdk = a10.get(0);
        return appLovinSdk == null || a(appLovinSdk.coreSdk);
    }

    public static boolean a(m mVar) {
        return mVar != null && mVar.K().d();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        c(str, str2, null);
    }

    private void j(String str, String str2) {
    }

    public void a(String str, String str2) {
        if (a(this.f8955a)) {
            a(str, str2, false);
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (a(this.f8955a)) {
            String str3 = "[" + str + "] " + str2;
            Log.w("AppLovinSdk", str3, th);
            j("WARN", str3);
        }
    }

    public void b(String str, String str2) {
        if (a(this.f8955a)) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            j("DEBUG", str3);
        }
    }

    public void b(String str, String str2, Throwable th) {
        if (a(this.f8955a)) {
            String str3 = "[" + str + "] " + str2;
            Log.e("AppLovinSdk", str3, th);
            j("ERROR", str3 + " : " + th);
        }
    }

    public void c(String str, String str2) {
        if (a(this.f8955a)) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            j("INFO", str3);
        }
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }
}
