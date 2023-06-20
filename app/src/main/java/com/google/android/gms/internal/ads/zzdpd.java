package com.google.android.gms.internal.ads;

import androidx.collection.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpd implements zzdcn {
    private final zzdnh zza;
    private final zzdnm zzb;

    public zzdpd(zzdnh zzdnhVar, zzdnm zzdnmVar) {
        this.zza = zzdnhVar;
        this.zzb = zzdnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzdnh zzdnhVar = this.zza;
        if (zzdnhVar.zzu() == null) {
            return;
        }
        zzcli zzq = zzdnhVar.zzq();
        zzcli zzr = zzdnhVar.zzr();
        if (zzq == null) {
            zzq = zzr == null ? null : zzr;
        }
        if (!this.zzb.zzd() || zzq == null) {
            return;
        }
        zzq.zzd("onSdkImpression", new a());
    }
}
