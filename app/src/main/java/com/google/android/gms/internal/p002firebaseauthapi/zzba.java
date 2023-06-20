package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzba {
    private final zzkj zza;

    private zzba(zzkj zzkjVar) {
        this.zza = zzkjVar;
    }

    public static zzba zze() {
        return new zzba(zzkm.zzc());
    }

    public static zzba zzf(zzaz zzazVar) {
        return new zzba((zzkj) zzazVar.zzc().zzu());
    }

    private final synchronized int zzg() {
        int zza;
        zza = zzfi.zza();
        while (zzi(zza)) {
            zza = zzfi.zza();
        }
        return zza;
    }

    private final synchronized zzkl zzh(zzke zzkeVar) throws GeneralSecurityException {
        return zzj(zzbq.zzc(zzkeVar), zzkeVar.zzh());
    }

    private final synchronized boolean zzi(int i10) {
        boolean z10;
        Iterator it = this.zza.zze().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((zzkl) it.next()).zza() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private final synchronized zzkl zzj(zzjz zzjzVar, int i10) throws GeneralSecurityException {
        zzkk zzc;
        int zzg = zzg();
        if (i10 != 2) {
            zzc = zzkl.zzc();
            zzc.zza(zzjzVar);
            zzc.zzb(zzg);
            zzc.zzd(3);
            zzc.zzc(i10);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzkl) zzc.zzk();
    }

    @Deprecated
    public final synchronized int zza(zzke zzkeVar, boolean z10) throws GeneralSecurityException {
        zzkl zzh;
        zzh = zzh(zzkeVar);
        this.zza.zzb(zzh);
        return zzh.zza();
    }

    public final synchronized zzaz zzb() throws GeneralSecurityException {
        return zzaz.zza((zzkm) this.zza.zzk());
    }

    public final synchronized zzba zzc(zzax zzaxVar) throws GeneralSecurityException {
        zza(zzaxVar.zza(), false);
        return this;
    }

    public final synchronized zzba zzd(int i10) throws GeneralSecurityException {
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zzkl zzd = this.zza.zzd(i11);
            if (zzd.zza() == i10) {
                if (zzd.zzh() == 3) {
                    this.zza.zzc(i10);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
