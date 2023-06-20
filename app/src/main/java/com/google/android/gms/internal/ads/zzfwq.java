package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfwq implements zzfwo {
    private final zzgas zza;
    private final Class zzb;

    public zzfwq(zzgas zzgasVar, Class cls) {
        if (!zzgasVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgasVar.toString(), cls.getName()));
        }
        this.zza = zzgasVar;
        this.zzb = cls;
    }

    private final zzfwp zzg() {
        return new zzfwp(this.zza.zza());
    }

    private final Object zzh(zzgma zzgmaVar) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzd(zzgmaVar);
            return this.zza.zzk(zzgmaVar, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzgfj zza(zzgji zzgjiVar) throws GeneralSecurityException {
        try {
            zzgma zza = zzg().zza(zzgjiVar);
            zzgfi zza2 = zzgfj.zza();
            zza2.zza(this.zza.zzc());
            zza2.zzb(zza.zzas());
            zza2.zzc(this.zza.zzf());
            return (zzgfj) zza2.zzal();
        } catch (zzglc e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzgma zzb(zzgji zzgjiVar) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgjiVar);
        } catch (zzglc e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final Object zzd(zzgji zzgjiVar) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzb(zzgjiVar));
        } catch (zzglc e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final Object zze(zzgma zzgmaVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.zza.zzj().getName());
        if (this.zza.zzj().isInstance(zzgmaVar)) {
            return zzh(zzgmaVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final String zzf() {
        return this.zza.zzc();
    }
}
