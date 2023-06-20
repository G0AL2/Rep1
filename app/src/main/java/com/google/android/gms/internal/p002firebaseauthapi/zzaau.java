package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaau implements zzabc {
    private final zzaaq zza;
    private final zzabt zzb;
    private final boolean zzc;
    private final zzyz zzd;

    private zzaau(zzabt zzabtVar, zzyz zzyzVar, zzaaq zzaaqVar) {
        this.zzb = zzabtVar;
        this.zzc = zzyzVar.zzh(zzaaqVar);
        this.zzd = zzyzVar;
        this.zza = zzaaqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaau zzc(zzabt zzabtVar, zzyz zzyzVar, zzaaq zzaaqVar) {
        return new zzaau(zzabtVar, zzyzVar, zzaaqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final int zza(Object obj) {
        zzabt zzabtVar = this.zzb;
        int zzb = zzabtVar.zzb(zzabtVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final Object zze() {
        return this.zza.zzA().zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzg(Object obj, Object obj2) {
        zzabe.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzabe.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzh(Object obj, zzabb zzabbVar, zzyy zzyyVar) throws IOException {
        boolean zzO;
        zzabt zzabtVar = this.zzb;
        zzyz zzyzVar = this.zzd;
        Object zzc = zzabtVar.zzc(obj);
        zzzd zzb = zzyzVar.zzb(obj);
        while (zzabbVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzabbVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzyzVar.zzc(zzyyVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzyzVar.zzf(zzabbVar, zzc2, zzyyVar, zzb);
                        } else {
                            zzO = zzabtVar.zzp(zzc, zzabbVar);
                        }
                    } else {
                        zzO = zzabbVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i10 = 0;
                    Object obj2 = null;
                    zzyi zzyiVar = null;
                    while (zzabbVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzabbVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzabbVar.zzj();
                            obj2 = zzyzVar.zzc(zzyyVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzyzVar.zzf(zzabbVar, obj2, zzyyVar, zzb);
                            } else {
                                zzyiVar = zzabbVar.zzp();
                            }
                        } else if (!zzabbVar.zzO()) {
                            break;
                        }
                    }
                    if (zzabbVar.zzd() != 12) {
                        throw zzzt.zzb();
                    } else if (zzyiVar != null) {
                        if (obj2 != null) {
                            zzyzVar.zzg(zzyiVar, obj2, zzyyVar, zzb);
                        } else {
                            zzabtVar.zzk(zzc, i10, zzyiVar);
                        }
                    }
                }
            } finally {
                zzabtVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzxv zzxvVar) throws IOException {
        zzzl zzzlVar = (zzzl) obj;
        if (zzzlVar.zzc == zzabu.zzc()) {
            zzzlVar.zzc = zzabu.zze();
        }
        zzzi zzziVar = (zzzi) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzn(Object obj, zzyu zzyuVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
