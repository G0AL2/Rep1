package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzces {
    @VisibleForTesting
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    @VisibleForTesting
    long zza = -1;
    @VisibleForTesting
    long zzb = -1;
    @VisibleForTesting
    int zzc = -1;
    @VisibleForTesting
    int zzd = -1;
    @VisibleForTesting
    long zze = 0;
    private final Object zzi = new Object();
    @VisibleForTesting
    int zzg = 0;
    @VisibleForTesting
    int zzh = 0;

    public zzces(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (((Boolean) zzbjv.zza.zze()).booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzi) {
            bundle = new Bundle();
            if (!this.zzj.zzP()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzcaj.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            boolean z10 = false;
            if (identifier == 0) {
                zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z10 = true;
                    } else {
                        zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcfi.zzj("Fail to fetch AdActivity theme");
                    zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z10);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzc() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j10) {
        synchronized (this.zzi) {
            long zzd = this.zzj.zzd();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzd > ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaN)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzc();
                }
                this.zzb = j10;
                this.zza = j10;
            } else {
                this.zza = j10;
            }
            Bundle bundle = zzlVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i10 = this.zzd + 1;
            this.zzd = i10;
            if (i10 == 0) {
                this.zze = 0L;
                this.zzj.zzD(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzj.zze();
            }
        }
    }
}
