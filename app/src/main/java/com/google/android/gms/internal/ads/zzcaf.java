package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.config.VersionInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcaf extends zzcag {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbsq zzd;

    public zzcaf(Context context, zzbsq zzbsqVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbsqVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcfo.zza().zza);
            jSONObject.put("mf", zzbjp.zza.zze());
            jSONObject.put("cl", "458339781");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", VersionInfo.GIT_BRANCH);
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcag
    public final zzfvl zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbjp.zzb.zze()).longValue()) {
            return zzfvc.zzi(null);
        }
        return zzfvc.zzm(this.zzd.zzb(zzc(this.zzb)), new zzfok() { // from class: com.google.android.gms.internal.ads.zzcae
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzcaf.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcfv.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbhz.zzd(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()).apply();
        return null;
    }
}
