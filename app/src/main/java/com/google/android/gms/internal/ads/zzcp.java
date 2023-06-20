package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcp {
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    @Deprecated
    public static final zzl zzc;
    public final zzfrm zzB;
    public final zzfro zzC;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrj zzo;
    public final zzfrj zzq;
    public final zzfrj zzu;
    public final zzfrj zzv;
    public final int zzw;
    public final int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzp = 0;
    public final int zzr = 0;
    public final int zzs = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzt = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzx = 0;
    public final boolean zzy = false;
    public final boolean zzz = false;
    public final boolean zzA = false;

    static {
        zzcp zzcpVar = new zzcp(new zzco());
        zza = zzcpVar;
        zzb = zzcpVar;
        zzc = new zzl() { // from class: com.google.android.gms.internal.ads.zzcn
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcp(zzco zzcoVar) {
        this.zzl = zzco.zzc(zzcoVar);
        this.zzm = zzco.zzb(zzcoVar);
        this.zzn = zzco.zzl(zzcoVar);
        this.zzo = zzco.zzi(zzcoVar);
        this.zzq = zzco.zzf(zzcoVar);
        this.zzu = zzco.zzg(zzcoVar);
        this.zzv = zzco.zzh(zzcoVar);
        this.zzw = zzco.zza(zzcoVar);
        this.zzB = zzfrm.zzc(zzco.zzj(zzcoVar));
        this.zzC = zzfro.zzl(zzco.zzk(zzcoVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzn == zzcpVar.zzn && this.zzl == zzcpVar.zzl && this.zzm == zzcpVar.zzm && this.zzo.equals(zzcpVar.zzo) && this.zzq.equals(zzcpVar.zzq) && this.zzu.equals(zzcpVar.zzu) && this.zzv.equals(zzcpVar.zzv) && this.zzw == zzcpVar.zzw && this.zzB.equals(zzcpVar.zzB) && this.zzC.equals(zzcpVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode()) * 961) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 28629151) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
