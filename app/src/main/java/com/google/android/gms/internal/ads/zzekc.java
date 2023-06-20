package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzekc implements zzddc {
    boolean zza = false;
    final /* synthetic */ zzefg zzb;
    final /* synthetic */ zzcga zzc;
    final /* synthetic */ zzekd zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekc(zzekd zzekdVar, zzefg zzefgVar, zzcga zzcgaVar) {
        this.zzd = zzekdVar;
        this.zzb = zzefgVar;
        this.zzc = zzcgaVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzev)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zze(new zzefh(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzekd.zze(this.zzb.zza, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzc(int i10, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzekd.zze(this.zzb.zza, i10);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i10, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}
