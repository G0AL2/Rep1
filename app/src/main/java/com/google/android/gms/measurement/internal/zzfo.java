package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zznw;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzfo implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfo(zzfp zzfpVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfpVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzfp zzfpVar = this.zzc;
        zzfq zzfqVar = zzfpVar.zza;
        str = zzfpVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfqVar.zza.zzaA().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e10) {
            zzfqVar.zza.zzaz().zzd().zzb("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            zzfqVar.zza.zzaz().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzfqVar.zza.zzaA().zzg();
        zzgi.zzO();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                zzfqVar.zza.zzaz().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfqVar.zza.zzaz().zzj().zzb("InstallReferrer API result", string);
                    zzlp zzv = zzfqVar.zza.zzv();
                    Uri parse = Uri.parse("?".concat(string));
                    zznw.zzc();
                    boolean zzs = zzfqVar.zza.zzf().zzs(null, zzel.zzau);
                    zznw.zzc();
                    Bundle zzs2 = zzv.zzs(parse, zzs, zzfqVar.zza.zzf().zzs(null, zzel.zzax));
                    if (zzs2 == null) {
                        zzfqVar.zza.zzaz().zzd().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzs2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                zzfqVar.zza.zzaz().zzd().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzs2.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == zzfqVar.zza.zzm().zzd.zza()) {
                            zzfqVar.zza.zzaz().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfqVar.zza.zzJ()) {
                            zzfqVar.zza.zzm().zzd.zzb(j10);
                            zzfqVar.zza.zzaz().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs2.putString("_cis", "referrer API v2");
                            zzfqVar.zza.zzq().zzG("auto", "_cmp", zzs2, str);
                        }
                    }
                } else {
                    zzfqVar.zza.zzaz().zzd().zza("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfqVar.zza.zzav(), serviceConnection);
    }
}
