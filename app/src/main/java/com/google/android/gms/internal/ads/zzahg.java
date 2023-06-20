package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahg implements zzagz {
    final /* synthetic */ zzahi zza;
    private final zzdx zzb = new zzdx(new byte[4], 4);

    public zzahg(zzahi zzahiVar) {
        this.zza = zzahiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzdy zzdyVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (zzdyVar.zzk() == 0 && (zzdyVar.zzk() & 128) != 0) {
            zzdyVar.zzG(6);
            int zza = zzdyVar.zza() / 4;
            for (int i11 = 0; i11 < zza; i11++) {
                zzdyVar.zzA(this.zzb, 4);
                int zzc = this.zzb.zzc(16);
                this.zzb.zzj(3);
                if (zzc == 0) {
                    this.zzb.zzj(13);
                } else {
                    int zzc2 = this.zzb.zzc(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzc2) == null) {
                        zzahi zzahiVar = this.zza;
                        sparseArray3 = zzahiVar.zzf;
                        sparseArray3.put(zzc2, new zzaha(new zzahh(zzahiVar, zzc2)));
                        zzahi zzahiVar2 = this.zza;
                        i10 = zzahiVar2.zzl;
                        zzahiVar2.zzl = i10 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
    }
}
