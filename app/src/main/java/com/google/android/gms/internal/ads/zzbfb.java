package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfb extends zzgkm implements zzgmb {
    private zzbfb() {
        super(zzbfc.zze());
    }

    public final zzbdy zza() {
        return ((zzbfc) this.zza).zza();
    }

    public final zzbeu zzb() {
        return ((zzbfc) this.zza).zzc();
    }

    public final zzbfb zzc(Iterable iterable) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzh((zzbfc) this.zza, iterable);
        return this;
    }

    public final zzbfb zzd() {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzi((zzbfc) this.zza);
        return this;
    }

    public final zzbfb zze(zzbdx zzbdxVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzk((zzbfc) this.zza, (zzbdy) zzbdxVar.zzal());
        return this;
    }

    public final zzbfb zzf(zzbeh zzbehVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzn((zzbfc) this.zza, zzbehVar);
        return this;
    }

    public final zzbfb zzg(zzbet zzbetVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzj((zzbfc) this.zza, (zzbeu) zzbetVar.zzal());
        return this;
    }

    public final zzbfb zzh(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzg((zzbfc) this.zza, str);
        return this;
    }

    public final zzbfb zzi(zzbga zzbgaVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzl((zzbfc) this.zza, zzbgaVar);
        return this;
    }

    public final zzbfb zzj(zzbhh zzbhhVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzm((zzbfc) this.zza, zzbhhVar);
        return this;
    }

    public final String zzk() {
        return ((zzbfc) this.zza).zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbfb(zzbdt zzbdtVar) {
        super(zzbfc.zze());
    }
}
