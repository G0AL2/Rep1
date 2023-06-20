package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwu {
    private final zzgft zza;

    private zzfwu(zzgft zzgftVar) {
        this.zza = zzgftVar;
    }

    public static zzfwu zzd() {
        return new zzfwu(zzgfw.zzd());
    }

    private final synchronized int zze() {
        int zza;
        zza = zzgav.zza();
        while (zzg(zza)) {
            zza = zzgav.zza();
        }
        return zza;
    }

    private final synchronized zzgfv zzf(zzgfo zzgfoVar) throws GeneralSecurityException {
        return zzh(zzfxk.zzc(zzgfoVar), zzgfoVar.zzi());
    }

    private final synchronized boolean zzg(int i10) {
        boolean z10;
        Iterator it = this.zza.zzc().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((zzgfv) it.next()).zza() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private final synchronized zzgfv zzh(zzgfj zzgfjVar, int i10) throws GeneralSecurityException {
        zzgfu zzd;
        int zze = zze();
        if (i10 != 2) {
            zzd = zzgfv.zzd();
            zzd.zza(zzgfjVar);
            zzd.zzb(zze);
            zzd.zzd(3);
            zzd.zzc(i10);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzgfv) zzd.zzal();
    }

    @Deprecated
    public final synchronized int zza(zzgfo zzgfoVar, boolean z10) throws GeneralSecurityException {
        zzgfv zzf;
        zzf = zzf(zzgfoVar);
        this.zza.zza(zzf);
        this.zza.zzb(zzf.zza());
        return zzf.zza();
    }

    public final synchronized zzfwt zzb() throws GeneralSecurityException {
        return zzfwt.zza((zzgfw) this.zza.zzal());
    }

    @Deprecated
    public final synchronized zzfwu zzc(zzgfo zzgfoVar) throws GeneralSecurityException {
        zza(zzgfoVar, true);
        return this;
    }
}
