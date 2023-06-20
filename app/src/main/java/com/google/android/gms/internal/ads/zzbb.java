package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbb {
    public static final zzbb zza = new zzah().zzc();
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzaf
    };
    public final String zzc;
    public final zzaw zzd;
    @Deprecated
    public final zzay zze;
    public final zzau zzf;
    public final zzbh zzg;
    public final zzal zzh;
    @Deprecated
    public final zzan zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbb(String str, zzan zzanVar, zzay zzayVar, zzau zzauVar, zzbh zzbhVar, zzba zzbaVar) {
        this.zzc = str;
        this.zzd = zzayVar;
        this.zze = zzayVar;
        this.zzf = zzauVar;
        this.zzg = zzbhVar;
        this.zzh = zzanVar;
        this.zzi = zzanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            return zzeg.zzS(this.zzc, zzbbVar.zzc) && this.zzh.equals(zzbbVar.zzh) && zzeg.zzS(this.zzd, zzbbVar.zzd) && zzeg.zzS(this.zzf, zzbbVar.zzf) && zzeg.zzS(this.zzg, zzbbVar.zzg);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzaw zzawVar = this.zzd;
        return ((((((hashCode + (zzawVar != null ? zzawVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode();
    }
}
