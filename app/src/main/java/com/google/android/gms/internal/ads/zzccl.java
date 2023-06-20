package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccl implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzcdn zzd;
    private String zze = "-1";
    private int zzf = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccl(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzcdnVar;
    }

    private final void zzb(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzat)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzar)).booleanValue()) {
            this.zzc.zzH(z10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && z10 && (context = this.zza) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzam)).booleanValue()) {
            this.zzd.zzt();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzav)).booleanValue()) {
            if (zzcck.zza(str, "gad_has_consent_for_cookies")) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzat)).booleanValue()) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i10 != this.zzc.zzb()) {
                        this.zzc.zzH(true);
                    }
                    this.zzc.zzE(i10);
                    return;
                }
                return;
            } else if (zzcck.zza(str, "IABTCF_gdprApplies") || zzcck.zza(str, "IABTCF_TCString") || zzcck.zza(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.zzc.zzn(str))) {
                    this.zzc.zzH(true);
                }
                this.zzc.zzF(str, string);
                return;
            } else {
                return;
            }
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            if (string2.equals("-1") || this.zze.equals(string2)) {
                return;
            }
            this.zze = string2;
            zzb(string2, i11);
        } else if (c10 != 1) {
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzat)).booleanValue() || i11 == -1 || this.zzf == i11) {
                return;
            }
            this.zzf = i11;
            zzb(string2, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzav)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
