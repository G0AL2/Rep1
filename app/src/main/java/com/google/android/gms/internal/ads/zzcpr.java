package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcpr {
    private zzcni zza;
    private zzcre zzb;
    private zzfgj zzc;
    private zzcrr zzd;
    private zzfdd zze;

    private zzcpr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpr(zzcpq zzcpqVar) {
    }

    public final zzcnf zza() {
        zzgrc.zzc(this.zza, zzcni.class);
        zzgrc.zzc(this.zzb, zzcre.class);
        if (this.zzc == null) {
            this.zzc = new zzfgj();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrr();
        }
        if (this.zze == null) {
            this.zze = new zzfdd();
        }
        return new zzcop(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcpr zzb(zzcni zzcniVar) {
        this.zza = zzcniVar;
        return this;
    }

    public final zzcpr zzc(zzcre zzcreVar) {
        this.zzb = zzcreVar;
        return this;
    }
}
