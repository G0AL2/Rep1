package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqb implements zzetg {
    private final Context zza;
    private final zzfvm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqb(Context context, zzfvm zzfvmVar) {
        this.zza = context;
        this.zzb = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqb.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqa zzc() throws Exception {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeZ)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfb)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzp();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfa)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzeqa(string, string2, bundle, null);
    }
}
