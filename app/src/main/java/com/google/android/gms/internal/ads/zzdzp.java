package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzp {
    private final zzfvm zza;
    private final zzfvm zzb;
    private final zzeaw zzc;
    private final zzgqo zzd;

    public zzdzp(zzfvm zzfvmVar, zzfvm zzfvmVar2, zzeaw zzeawVar, zzgqo zzgqoVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfvmVar2;
        this.zzc = zzeawVar;
        this.zzd = zzgqoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zza(zzbzv zzbzvVar, int i10, zzebn zzebnVar) throws Exception {
        return ((zzeco) this.zzd.zzb()).zzc(zzbzvVar, i10);
    }

    public final zzfvl zzb(final zzbzv zzbzvVar) {
        zzfvl zzg;
        String str = zzbzvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzg = zzfvc.zzh(new zzebn(1));
        } else {
            zzg = zzfvc.zzg(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzp.this.zzc(zzbzvVar);
                }
            }), ExecutionException.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdzn
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzfvc.zzh(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfvc.zzg(zzg, zzebn.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzdzp.this.zza(zzbzvVar, callingUid, (zzebn) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbzv zzbzvVar) throws Exception {
        zzcga zzcgaVar;
        final zzeaw zzeawVar = this.zzc;
        synchronized (zzeawVar.zzb) {
            if (zzeawVar.zzc) {
                zzcgaVar = zzeawVar.zza;
            } else {
                zzeawVar.zzc = true;
                zzeawVar.zze = zzbzvVar;
                zzeawVar.zzf.checkAvailabilityAndConnect();
                zzeawVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeav
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeaw.this.zza();
                    }
                }, zzcfv.zzf);
                zzcgaVar = zzeawVar.zza;
            }
        }
        return (InputStream) zzcgaVar.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS);
    }
}
