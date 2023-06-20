package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeip implements zzfuy {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbl zzc;
    final /* synthetic */ zzfbo zzd;
    final /* synthetic */ zzfie zze;
    final /* synthetic */ zzfbx zzf;
    final /* synthetic */ zzeiq zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeip(zzeiq zzeiqVar, long j10, String str, zzfbl zzfblVar, zzfbo zzfboVar, zzfie zzfieVar, zzfbx zzfbxVar) {
        this.zzg = zzeiqVar;
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzfblVar;
        this.zzd = zzfboVar;
        this.zze = zzfieVar;
        this.zzf = zzfbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        Clock clock;
        int i10;
        boolean z10;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzefi zzefiVar;
        zzfii zzfiiVar;
        zzeir zzeirVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i10 = 2;
        } else if (th instanceof zzeif) {
            i10 = 3;
        } else if (th instanceof CancellationException) {
            i10 = 4;
        } else if (th instanceof zzfci) {
            i10 = 5;
        } else {
            i10 = ((th instanceof zzdzl) && zzfdc.zza(th).zza == 3) ? 1 : 6;
        }
        zzeiq.zzg(this.zzg, this.zzb, i10, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiqVar = this.zzg;
        z10 = zzeiqVar.zze;
        if (z10) {
            zzeirVar = zzeiqVar.zzb;
            zzeirVar.zza(this.zzd, this.zzc, i10, th instanceof zzefh ? (zzefh) th : null, elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgZ)).booleanValue()) {
            zzfiiVar = this.zzg.zzc;
            zzfie zzfieVar = this.zze;
            zzfbx zzfbxVar = this.zzf;
            zzfbl zzfblVar = this.zzc;
            zzfiiVar.zzd(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzo));
        }
        com.google.android.gms.ads.internal.client.zze zza = zzfdc.zza(th);
        int i11 = zza.zza;
        if ((i11 == 3 || i11 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza = zzfdc.zza(new zzefh(13, zza.zzd));
        }
        zzefiVar = this.zzg.zzf;
        zzefiVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object obj) {
        Clock clock;
        boolean z10;
        zzefi zzefiVar;
        zzeir zzeirVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeiq.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiqVar = this.zzg;
        z10 = zzeiqVar.zze;
        if (z10) {
            zzeirVar = zzeiqVar.zzb;
            zzeirVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzefiVar = this.zzg.zzf;
        zzefiVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
