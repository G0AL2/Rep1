package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzglg {
    private static final zzgkc zzb = zzgkc.zza();
    protected volatile zzgma zza;
    private volatile zzgji zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzglg) {
            zzglg zzglgVar = (zzglg) obj;
            zzgma zzgmaVar = this.zza;
            zzgma zzgmaVar2 = zzglgVar.zza;
            if (zzgmaVar == null && zzgmaVar2 == null) {
                return zzb().equals(zzglgVar.zzb());
            }
            if (zzgmaVar == null || zzgmaVar2 == null) {
                if (zzgmaVar != null) {
                    zzglgVar.zzc(zzgmaVar.zzbh());
                    return zzgmaVar.equals(zzglgVar.zza);
                }
                zzc(zzgmaVar2.zzbh());
                return this.zza.equals(zzgmaVar2);
            }
            return zzgmaVar.equals(zzgmaVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgje) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzax();
        }
        return 0;
    }

    public final zzgji zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgji.zzb;
            } else {
                this.zzc = this.zza.zzas();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzgma zzgmaVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgmaVar;
                    this.zzc = zzgji.zzb;
                } catch (zzglc unused) {
                    this.zza = zzgmaVar;
                    this.zzc = zzgji.zzb;
                }
            }
        }
    }
}
