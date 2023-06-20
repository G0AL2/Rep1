package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyg implements zzeza {
    private final zzeza zza;
    private final zzeza zzb;
    private final zzfek zzc;
    private final String zzd;
    private zzdbc zze;
    private final Executor zzf;

    public zzeyg(zzeza zzezaVar, zzeza zzezaVar2, zzfek zzfekVar, String str, Executor executor) {
        this.zza = zzezaVar;
        this.zzb = zzezaVar2;
        this.zzc = zzfekVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfvl zzg(zzfdx zzfdxVar, zzezb zzezbVar) {
        zzdbc zzdbcVar = zzfdxVar.zza;
        this.zze = zzdbcVar;
        if (zzfdxVar.zzc != null) {
            if (zzdbcVar.zzf() != null) {
                zzfdxVar.zzc.zzo().zzbL(zzfdxVar.zza.zzf());
            }
            return zzfvc.zzi(zzfdxVar.zzc);
        }
        zzdbcVar.zzb().zzk(zzfdxVar.zzb);
        return ((zzeyq) this.zza).zzb(zzezbVar, null, zzfdxVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzezb zzezbVar, zzeyf zzeyfVar, zzeyz zzeyzVar, zzdbc zzdbcVar, zzeyl zzeylVar) throws Exception {
        if (zzeylVar != null) {
            zzeyf zzeyfVar2 = new zzeyf(zzeyfVar.zza, zzeyfVar.zzb, zzeyfVar.zzc, zzeyfVar.zzd, zzeyfVar.zze, zzeyfVar.zzf, zzeylVar.zza);
            if (zzeylVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyfVar2);
                return zzg(zzeylVar.zzc, zzezbVar);
            }
            zzfvl zza = this.zzc.zza(zzeyfVar2);
            if (zza != null) {
                this.zze = null;
                return zzfvc.zzn(zza, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeyc
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        return zzeyg.this.zze((zzfeh) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeyfVar2);
            zzezbVar = new zzezb(zzezbVar.zzb, zzeylVar.zzb);
        }
        zzfvl zzb = ((zzeyq) this.zza).zzb(zzezbVar, zzeyzVar, zzdbcVar);
        this.zze = zzdbcVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezbVar, zzeyz zzeyzVar, Object obj) {
        return zzf(zzezbVar, zzeyzVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzfeh zzfehVar) throws Exception {
        zzfej zzfejVar;
        if (zzfehVar != null && zzfehVar.zza != null && (zzfejVar = zzfehVar.zzb) != null) {
            zzbeb zza = zzbeh.zza();
            zzbdz zza2 = zzbea.zza();
            zza2.zzd(2);
            zza2.zzb(zzbee.zzd());
            zza.zza(zza2);
            zzfehVar.zza.zza.zzb().zzc().zzi((zzbeh) zza.zzal());
            return zzg(zzfehVar.zza, ((zzeyf) zzfejVar).zzb);
        }
        throw new zzdzl(1, "Empty prefetch");
    }

    public final synchronized zzfvl zzf(final zzezb zzezbVar, final zzeyz zzeyzVar, zzdbc zzdbcVar) {
        zzdbb zza = zzeyzVar.zza(zzezbVar.zzb);
        zza.zza(new zzeyh(this.zzd));
        final zzdbc zzdbcVar2 = (zzdbc) zza.zzh();
        zzdbcVar2.zzg();
        zzdbcVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzdbcVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfcd zzg = zzdbcVar2.zzg();
            final zzeyf zzeyfVar = new zzeyf(zzeyzVar, zzezbVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfvc.zzn(zzfut.zzv(((zzeym) this.zzb).zzb(zzezbVar, zzeyzVar, zzdbcVar2)), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    return zzeyg.this.zzb(zzezbVar, zzeyfVar, zzeyzVar, zzdbcVar2, (zzeyl) obj);
                }
            }, this.zzf);
        }
        this.zze = zzdbcVar2;
        return ((zzeyq) this.zza).zzb(zzezbVar, zzeyzVar, zzdbcVar2);
    }
}
