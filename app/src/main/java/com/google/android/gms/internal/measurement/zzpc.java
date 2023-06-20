package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzpc implements zzpb {
    public static final zzhy zza;
    public static final zzhy zzb;

    static {
        zzhv zza2 = new zzhv(zzho.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zzf("measurement.module.pixie.ees", true);
        zzb = zza2.zzf("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpb
    public final boolean zzb() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
