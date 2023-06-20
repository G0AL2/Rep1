package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfn extends zzhc {
    @VisibleForTesting
    static final Pair zza = new Pair("", 0L);
    public zzfl zzb;
    public final zzfj zzc;
    public final zzfj zzd;
    public final zzfm zze;
    public final zzfj zzf;
    public final zzfh zzg;
    public final zzfm zzh;
    public final zzfh zzi;
    public final zzfj zzj;
    public boolean zzk;
    public final zzfh zzl;
    public final zzfh zzm;
    public final zzfj zzn;
    public final zzfm zzo;
    public final zzfm zzp;
    public final zzfj zzq;
    public final zzfi zzr;
    private SharedPreferences zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfn(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzf = new zzfj(this, "session_timeout", 1800000L);
        this.zzg = new zzfh(this, "start_new_session", true);
        this.zzj = new zzfj(this, "last_pause_time", 0L);
        this.zzh = new zzfm(this, "non_personalized_ads", null);
        this.zzi = new zzfh(this, "allow_remote_dynamite", false);
        this.zzc = new zzfj(this, "first_open_time", 0L);
        this.zzd = new zzfj(this, "app_install_time", 0L);
        this.zze = new zzfm(this, "app_instance_id", null);
        this.zzl = new zzfh(this, "app_backgrounded", false);
        this.zzm = new zzfh(this, "deep_link_retrieval_complete", false);
        this.zzn = new zzfj(this, "deep_link_retrieval_attempts", 0L);
        this.zzo = new zzfm(this, "firebase_feature_rollouts", null);
        this.zzp = new zzfm(this, "deferred_attribution_cache", null);
        this.zzq = new zzfj(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzr = new zzfi(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final SharedPreferences zza() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzhc
    protected final void zzaB() {
        SharedPreferences sharedPreferences = this.zzs.zzav().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzt = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzk = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.zzt.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzs.zzf();
        this.zzb = new zzfl(this, "health_monitor", Math.max(0L, ((Long) zzel.zzb.zza(null)).longValue()), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair zzb(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzaw().elapsedRealtime();
        String str2 = this.zzu;
        if (str2 != null && elapsedRealtime < this.zzw) {
            return new Pair(str2, Boolean.valueOf(this.zzv));
        }
        this.zzw = elapsedRealtime + this.zzs.zzf().zzi(str, zzel.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzav());
            this.zzu = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzu = id2;
            }
            this.zzv = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.zzs.zzaz().zzc().zzb("Unable to get advertising id", e10);
            this.zzu = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzu, Boolean.valueOf(this.zzv));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzah zzc() {
        zzg();
        return zzah.zzb(zza().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhc
    protected final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(boolean z10) {
        zzg();
        this.zzs.zzaz().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = zza().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzt;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(long j10) {
        return j10 - this.zzf.zza() > this.zzj.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzl(int i10) {
        return zzah.zzj(i10, zza().getInt("consent_source", 100));
    }
}
