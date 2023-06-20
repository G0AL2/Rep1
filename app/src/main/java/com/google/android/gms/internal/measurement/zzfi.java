package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfi extends zzkc implements zzlk {
    private static final zzfi zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzfi zzfiVar = new zzfi();
        zza = zzfiVar;
        zzkc.zzbM(zzfi.class, zzfiVar);
    }

    private zzfi() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzkc
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfh(null);
                }
                return new zzfi();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
