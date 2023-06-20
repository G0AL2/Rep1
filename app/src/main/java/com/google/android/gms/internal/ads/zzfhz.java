package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhz extends zzgkm implements zzgmb {
    private zzfhz() {
        super(zzfic.zzd());
    }

    public final int zza() {
        return ((zzfic) this.zza).zza();
    }

    public final zzfhz zzb(zzfia zzfiaVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzfic.zzf((zzfic) this.zza, (zzfib) zzfiaVar.zzal());
        return this;
    }

    public final zzfhz zzc() {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzfic.zze((zzfic) this.zza);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfhz(zzfhy zzfhyVar) {
        super(zzfic.zzd());
    }
}
