package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgf extends zzkc implements zzlk {
    private static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzkc.zzbM(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzgd zza() {
        return (zzgd) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzgf zzgfVar, zzfu zzfuVar) {
        zzfuVar.getClass();
        zzkj zzkjVar = zzgfVar.zzg;
        if (!zzkjVar.zzc()) {
            zzgfVar.zzg = zzkc.zzbH(zzkjVar);
        }
        zzgfVar.zzg.add(zzfuVar);
    }

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
                    return new zzgd(null);
                }
                return new zzgf();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzge.zza, "zzg", zzfu.class});
        }
        return (byte) 1;
    }
}
