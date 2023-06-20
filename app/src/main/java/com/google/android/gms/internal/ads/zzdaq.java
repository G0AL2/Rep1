package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdaq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdaq(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcfo zza = ((zzcnv) this.zzb).zza();
        final zzfcd zza2 = ((zzdbk) this.zzc).zza();
        return new zzfok() { // from class: com.google.android.gms.internal.ads.zzdap
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcfo zzcfoVar = zza;
                zzfcd zzfcdVar = zza2;
                zzfbl zzfblVar = (zzfbl) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzfblVar.zzC);
                zzasVar.zzq(zzfblVar.zzD.toString());
                zzasVar.zzo(zzcfoVar.zza);
                zzasVar.zzn(zzfcdVar.zzf);
                return zzasVar;
            }
        };
    }
}
