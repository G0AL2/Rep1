package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzjx {
    private final zzhd zza;

    @Deprecated
    public zzjx(Context context, zzckr zzckrVar, byte[] bArr) {
        this.zza = new zzhd(context, zzckrVar, null);
    }

    @Deprecated
    public final zzjx zza(final zzja zzjaVar) {
        zzhd zzhdVar = this.zza;
        zzcw.zzf(!zzhdVar.zzl);
        zzhdVar.zzf = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzgv
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzja.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzjx zzb(final zzvm zzvmVar) {
        zzhd zzhdVar = this.zza;
        zzcw.zzf(!zzhdVar.zzl);
        zzhdVar.zze = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzgw
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzvm.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzjy zzc() {
        zzhd zzhdVar = this.zza;
        zzcw.zzf(!zzhdVar.zzl);
        zzhdVar.zzl = true;
        return new zzjy(zzhdVar);
    }
}
