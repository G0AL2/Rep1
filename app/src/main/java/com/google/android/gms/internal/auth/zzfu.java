package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzfu<T> implements zzgb<T> {
    private final zzfq zza;
    private final zzgp<?, ?> zzb;
    private final zzeh<?> zzc;

    private zzfu(zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfq zzfqVar) {
        this.zzb = zzgpVar;
        zzehVar.zzc(zzfqVar);
        this.zzc = zzehVar;
        this.zza = zzfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzfu<T> zzb(zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfq zzfqVar) {
        return new zzfu<>(zzgpVar, zzehVar, zzfqVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final int zza(T t10) {
        return this.zzb.zza(t10).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final T zzd() {
        return (T) ((zzeo) ((zzeq) this.zza).zzj(5, null, null)).zzg();
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zze(T t10) {
        this.zzb.zze(t10);
        this.zzc.zzb(t10);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzf(T t10, T t11) {
        zzgd.zzf(this.zzb, t10, t11);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzg(T t10, byte[] bArr, int i10, int i11, zzdp zzdpVar) throws IOException {
        zzeq zzeqVar = (zzeq) t10;
        if (zzeqVar.zzc == zzgq.zza()) {
            zzeqVar.zzc = zzgq.zzc();
        }
        zzep zzepVar = (zzep) t10;
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzh(T t10, T t11) {
        return this.zzb.zza(t10).equals(this.zzb.zza(t11));
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzi(T t10) {
        this.zzc.zza(t10);
        throw null;
    }
}
