package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeaj {
    private final ScheduledExecutorService zza;
    private final zzfvm zzb;
    private final zzeba zzc;
    private final zzgqo zzd;

    public zzeaj(ScheduledExecutorService scheduledExecutorService, zzfvm zzfvmVar, zzeba zzebaVar, zzgqo zzgqoVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfvmVar;
        this.zzc = zzebaVar;
        this.zzd = zzgqoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzbzv zzbzvVar, int i10, Throwable th) throws Exception {
        return ((zzeco) this.zzd.zzb()).zzd(zzbzvVar, i10);
    }

    public final zzfvl zzb(final zzbzv zzbzvVar) {
        zzfvl zzfvlVar;
        String str = zzbzvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfvlVar = zzfvc.zzh(new zzebn(1));
        } else {
            final zzeba zzebaVar = this.zzc;
            synchronized (zzebaVar.zzb) {
                if (zzebaVar.zzc) {
                    zzfvlVar = zzebaVar.zza;
                } else {
                    zzebaVar.zzc = true;
                    zzebaVar.zze = zzbzvVar;
                    zzebaVar.zzf.checkAvailabilityAndConnect();
                    zzebaVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeba.this.zza();
                        }
                    }, zzcfv.zzf);
                    zzfvlVar = zzebaVar.zza;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfvc.zzg((zzfut) zzfvc.zzo(zzfut.zzv(zzfvlVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeaj.this.zza(zzbzvVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
