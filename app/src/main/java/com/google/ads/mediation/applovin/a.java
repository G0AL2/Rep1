package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: AppLovinInitializer.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f20471c;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Integer> f20472a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f20473b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppLovinInitializer.java */
    /* renamed from: com.google.ads.mediation.applovin.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0275a implements AppLovinSdk.SdkInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20474a;

        C0275a(String str) {
            this.f20474a = str;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            a.this.f20472a.put(this.f20474a, 2);
            ArrayList arrayList = (ArrayList) a.this.f20473b.get(this.f20474a);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onInitializeSuccess(this.f20474a);
                }
                arrayList.clear();
            }
        }
    }

    /* compiled from: AppLovinInitializer.java */
    /* loaded from: classes2.dex */
    public interface b {
        void onInitializeSuccess(String str);
    }

    private a() {
    }

    public static a c() {
        if (f20471c == null) {
            f20471c = new a();
        }
        return f20471c;
    }

    public void d(Context context, String str, b bVar) {
        if (!this.f20472a.containsKey(str)) {
            this.f20472a.put(str, 0);
            this.f20473b.put(str, new ArrayList<>());
        }
        Integer num = 2;
        if (num.equals(this.f20472a.get(str))) {
            bVar.onInitializeSuccess(str);
            return;
        }
        this.f20473b.get(str).add(bVar);
        Integer num2 = 1;
        if (num2.equals(this.f20472a.get(str))) {
            return;
        }
        this.f20472a.put(str, 1);
        ApplovinAdapter.log(3, String.format("Attempting to initialize SDK with SDK Key: %s", str));
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, AppLovinMediationAdapter.getSdkSettings(context), context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider("admob");
        appLovinSdk.initializeSdk(new C0275a(str));
    }
}
