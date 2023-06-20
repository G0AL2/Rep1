package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhx implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbib.zza(new zzfpj() { // from class: com.google.android.gms.internal.ads.zzbhv
                @Override // com.google.android.gms.internal.ads.zzfpj
                public final Object zza() {
                    return zzbhx.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbhr zzbhrVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbhrVar.zzm();
            }
        }
        if (zzbhrVar.zze() == 2) {
            Bundle bundle = this.zzf;
            return bundle == null ? zzbhrVar.zzm() : zzbhrVar.zzb(bundle);
        } else if (zzbhrVar.zze() == 1 && this.zzh.has(zzbhrVar.zzn())) {
            return zzbhrVar.zza(this.zzh);
        } else {
            return zzbib.zza(new zzfpj() { // from class: com.google.android.gms.internal.ads.zzbhu
                @Override // com.google.android.gms.internal.ads.zzfpj
                public final Object zza() {
                    return zzbhx.this.zzc(zzbhrVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbhr zzbhrVar) {
        return zzbhrVar.zzc(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", JsonUtils.EMPTY_JSON);
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            SharedPreferences zza = zzbht.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbkg.zzc(new zzbhw(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
