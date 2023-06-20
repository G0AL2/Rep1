package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzfvm;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcfo zzcfoVar, String str, Runnable runnable, zzfhu zzfhuVar) {
        zzb(context, zzcfoVar, true, null, str, null, runnable, zzfhuVar);
    }

    @VisibleForTesting
    final void zzb(Context context, zzcfo zzcfoVar, boolean z10, zzcel zzcelVar, String str, String str2, Runnable runnable, final zzfhu zzfhuVar) {
        PackageInfo packageInfo;
        if (zzt.zzA().elapsedRealtime() - this.zzb < 5000) {
            zzcfi.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzA().elapsedRealtime();
        if (zzcelVar != null) {
            if (zzt.zzA().currentTimeMillis() - zzcelVar.zza() <= ((Long) zzay.zzc().zzb(zzbhz.zzde)).longValue() && zzcelVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcfi.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcfi.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            final zzfhh zza = zzfhg.zza(context, 4);
            zza.zzf();
            zzbta zza2 = zzt.zzf().zza(this.zza, zzcfoVar, zzfhuVar);
            zzbsu zzbsuVar = zzbsx.zza;
            zzbsq zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbsuVar, zzbsuVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbhz.zza()));
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put(MediationMetaData.KEY_VERSION, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfvl zzb = zza3.zzb(jSONObject);
                zzfuj zzfujVar = new zzfuj() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        zzfhu zzfhuVar2 = zzfhu.this;
                        zzfhh zzfhhVar = zza;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        zzfhhVar.zze(optBoolean);
                        zzfhuVar2.zzb(zzfhhVar.zzj());
                        return zzfvc.zzi(null);
                    }
                };
                zzfvm zzfvmVar = zzcfv.zzf;
                zzfvl zzn = zzfvc.zzn(zzb, zzfujVar, zzfvmVar);
                if (runnable != null) {
                    zzb.zzc(runnable, zzfvmVar);
                }
                zzcfy.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                zzcfi.zzh("Error requesting application settings", e10);
                zza.zze(false);
                zzfhuVar.zzb(zza.zzj());
            }
        }
    }

    public final void zzc(Context context, zzcfo zzcfoVar, String str, zzcel zzcelVar, zzfhu zzfhuVar) {
        zzb(context, zzcfoVar, false, zzcelVar, zzcelVar != null ? zzcelVar.zzb() : null, str, null, zzfhuVar);
    }
}
