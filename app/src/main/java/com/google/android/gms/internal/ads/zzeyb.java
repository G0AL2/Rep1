package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyb implements zzeza {
    private zzdbc zza;
    private final Executor zzb = zzfvs.zzb();

    public final zzdbc zza() {
        return this.zza;
    }

    public final zzfvl zzb(zzezb zzezbVar, zzeyz zzeyzVar, zzdbc zzdbcVar) {
        zzdbb zza = zzeyzVar.zza(zzezbVar.zzb);
        zza.zzb(new zzezg(true));
        zzdbc zzdbcVar2 = (zzdbc) zza.zzh();
        this.zza = zzdbcVar2;
        final zzcza zzb = zzdbcVar2.zzb();
        final zzfdx zzfdxVar = new zzfdx();
        return zzfvc.zzm(zzfvc.zzn(zzfut.zzv(zzb.zzi()), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                zzfdx zzfdxVar2 = zzfdxVar;
                zzcza zzczaVar = zzb;
                zzfbx zzfbxVar = (zzfbx) obj;
                zzfdxVar2.zzb = zzfbxVar;
                Iterator it = zzfbxVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzfbl) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzczaVar.zzh(zzfvc.zzi(zzfbxVar));
                    }
                }
                return zzfvc.zzi(null);
            }
        }, this.zzb), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzfdx zzfdxVar2 = zzfdx.this;
                zzfdxVar2.zzc = (zzcxx) obj;
                return zzfdxVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezbVar, zzeyz zzeyzVar, Object obj) {
        return zzb(zzezbVar, zzeyzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
