package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import hb.a;
import hb.b;
import hb.c;
import hb.d;
import hb.f;

/* loaded from: classes3.dex */
public class RNGDPRModule extends ReactContextBaseJavaModule {
    private static hb.b consentForm = null;
    private static hb.c consentInformation = null;
    private static boolean isEEA = true;

    public RNGDPRModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void askUser(final Activity activity) {
        timber.log.a.d("config gpdr", new Object[0]);
        d.a aVar = new d.a();
        aVar.c(false);
        if (ContextHelper.isDebug(activity) && isEEA) {
            String str = "";
            try {
                str = MD5Util.md5(Settings.System.getString(activity.getContentResolver(), "android_id"));
                timber.log.a.d("deviceId hash: %s", str);
            } catch (Exception e10) {
                timber.log.a.e(e10, "get gaid occour an error:", new Object[0]);
            }
            aVar.b(new a.C0399a(activity).c(1).a(str).b());
        }
        hb.d a10 = aVar.a();
        hb.c a11 = hb.f.a(activity);
        consentInformation = a11;
        a11.requestConsentInfoUpdate(activity, a10, new c.b() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.g
            @Override // hb.c.b
            public final void a() {
                RNGDPRModule.g(activity);
            }
        }, new c.a() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.f
            @Override // hb.c.a
            public final void a(hb.e eVar) {
                RNGDPRModule.i(eVar);
            }
        });
    }

    public static /* synthetic */ void g(Activity activity) {
        lambda$askUser$0(activity);
    }

    public static /* synthetic */ void i(hb.e eVar) {
        lambda$askUser$1(eVar);
    }

    public static /* synthetic */ void j(Activity activity, hb.b bVar) {
        lambda$loadForm$3(activity, bVar);
    }

    public static /* synthetic */ void k(Activity activity, hb.e eVar) {
        loadForm(activity);
    }

    public static /* synthetic */ void l(hb.e eVar) {
        lambda$loadForm$4(eVar);
    }

    public static /* synthetic */ void lambda$askUser$0(Activity activity) {
        if (consentInformation.isConsentFormAvailable()) {
            loadForm(activity);
        }
    }

    public static /* synthetic */ void lambda$askUser$1(hb.e eVar) {
        timber.log.a.d("update consentInfo failed, reason:%s ", eVar.a());
    }

    public static /* synthetic */ void lambda$loadForm$3(final Activity activity, hb.b bVar) {
        consentForm = bVar;
        if (consentInformation.getConsentStatus() == 2) {
            consentForm.show(activity, new b.a() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.e
                @Override // hb.b.a
                public final void a(hb.e eVar) {
                    RNGDPRModule.k(activity, eVar);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$loadForm$4(hb.e eVar) {
        timber.log.a.d(" load consentForm failed, reason: %s", eVar.a());
    }

    public static void loadForm(final Activity activity) {
        timber.log.a.d("try to load gdpr form", new Object[0]);
        hb.f.b(activity, new f.b() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.i
            @Override // hb.f.b
            public final void onConsentFormLoadSuccess(hb.b bVar) {
                RNGDPRModule.j(activity, bVar);
            }
        }, new f.a() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.h
            @Override // hb.f.a
            public final void onConsentFormLoadFailure(hb.e eVar) {
                RNGDPRModule.l(eVar);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGDPR";
    }

    @ReactMethod
    public void resetGDPR() {
        timber.log.a.d("GDPR reset", new Object[0]);
        consentInformation.reset();
    }

    @ReactMethod
    public void setIsEEA(boolean z10) {
        timber.log.a.d("isEEA is going to be set as: %b", Boolean.valueOf(z10));
        isEEA = z10;
    }
}
