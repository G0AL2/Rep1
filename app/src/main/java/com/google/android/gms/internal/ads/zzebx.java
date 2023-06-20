package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzebx {
    private final zzfvm zza;
    private final zzebe zzb;
    private final zzgqo zzc;

    public zzebx(zzfvm zzfvmVar, zzebe zzebeVar, zzgqo zzgqoVar) {
        this.zza = zzfvmVar;
        this.zzb = zzebeVar;
        this.zzc = zzgqoVar;
    }

    private final zzfvl zzg(final zzbzv zzbzvVar, zzebw zzebwVar, final zzebw zzebwVar2, final zzfuj zzfujVar) {
        zzfvl zzg;
        String str = zzbzvVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzg = zzfvc.zzh(new zzebn(1));
        } else {
            zzg = zzfvc.zzg(zzebwVar.zza(zzbzvVar), ExecutionException.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebo
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzfvc.zzh(((ExecutionException) obj).getCause());
                }
            }, this.zza);
        }
        return zzfvc.zzg(zzfvc.zzn(zzfut.zzv(zzg), zzfujVar, this.zza), zzebn.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebv
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzebx.this.zzb(zzebwVar2, zzbzvVar, zzfujVar, (zzebn) obj);
            }
        }, this.zza);
    }

    public final zzfvl zza(final zzbzv zzbzvVar) {
        zzfuj zzfujVar = new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                zzbzv zzbzvVar2 = zzbzv.this;
                zzbzvVar2.zzj = new String(zzftl.zza((InputStream) obj), zzfoi.zzc);
                return zzfvc.zzi(zzbzvVar2);
            }
        };
        final zzebe zzebeVar = this.zzb;
        return zzg(zzbzvVar, new zzebw() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // com.google.android.gms.internal.ads.zzebw
            public final zzfvl zza(zzbzv zzbzvVar2) {
                return zzebe.this.zzb(zzbzvVar2);
            }
        }, new zzebw() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzebw
            public final zzfvl zza(zzbzv zzbzvVar2) {
                return zzebx.this.zzc(zzbzvVar2);
            }
        }, zzfujVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzebw zzebwVar, zzbzv zzbzvVar, zzfuj zzfujVar, zzebn zzebnVar) throws Exception {
        return zzfvc.zzn(zzebwVar.zza(zzbzvVar), zzfujVar, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzbzv zzbzvVar) {
        return ((zzeco) this.zzc.zzb()).zzb(zzbzvVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(zzbzv zzbzvVar) {
        String str;
        zzebe zzebeVar = this.zzb;
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            str = zzbzvVar.zzh;
        } else {
            str = zzbzvVar.zzj;
        }
        return zzebeVar.zzc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzbzv zzbzvVar) {
        String str;
        zzeco zzecoVar = (zzeco) this.zzc.zzb();
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            str = zzbzvVar.zzh;
        } else {
            str = zzbzvVar.zzj;
        }
        return zzecoVar.zzi(str);
    }

    public final zzfvl zzf(zzbzv zzbzvVar) {
        if (zzapf.zzg(zzbzvVar.zzj)) {
            return zzfvc.zzh(new zzdzl(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbzvVar, new zzebw() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzebw
            public final zzfvl zza(zzbzv zzbzvVar2) {
                return zzebx.this.zzd(zzbzvVar2);
            }
        }, new zzebw() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzebw
            public final zzfvl zza(zzbzv zzbzvVar2) {
                return zzebx.this.zze(zzbzvVar2);
            }
        }, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzfvc.zzi(null);
            }
        });
    }
}
