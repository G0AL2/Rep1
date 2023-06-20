package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzw  reason: invalid package */
/* loaded from: classes2.dex */
public class zzzw {
    private static final zzyy zzb = zzyy.zza();
    protected volatile zzaaq zza;
    private volatile zzyi zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzw) {
            zzzw zzzwVar = (zzzw) obj;
            zzaaq zzaaqVar = this.zza;
            zzaaq zzaaqVar2 = zzzwVar.zza;
            if (zzaaqVar == null && zzaaqVar2 == null) {
                return zzb().equals(zzzwVar.zzb());
            }
            if (zzaaqVar == null || zzaaqVar2 == null) {
                if (zzaaqVar != null) {
                    zzzwVar.zzc(zzaaqVar.zzH());
                    return zzaaqVar.equals(zzzwVar.zza);
                }
                zzc(zzaaqVar2.zzH());
                return this.zza.equals(zzaaqVar2);
            }
            return zzaaqVar.equals(zzaaqVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzyf) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzyi zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzyi.zzb;
            } else {
                this.zzc = this.zza.zzo();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzaaq zzaaqVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzaaqVar;
                    this.zzc = zzyi.zzb;
                } catch (zzzt unused) {
                    this.zza = zzaaqVar;
                    this.zzc = zzyi.zzb;
                }
            }
        }
    }
}
