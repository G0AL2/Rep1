package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgj extends zzkc implements zzlk {
    private static final zzgj zza;
    private int zze;
    private int zzf;
    private zzki zzg = zzkc.zzbE();

    static {
        zzgj zzgjVar = new zzgj();
        zza = zzgjVar;
        zzkc.zzbM(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public static zzgi zzd() {
        return (zzgi) zza.zzbA();
    }

    public static /* synthetic */ void zzg(zzgj zzgjVar, int i10) {
        zzgjVar.zze |= 1;
        zzgjVar.zzf = i10;
    }

    public static /* synthetic */ void zzh(zzgj zzgjVar, Iterable iterable) {
        zzki zzkiVar = zzgjVar.zzg;
        if (!zzkiVar.zzc()) {
            zzgjVar.zzg = zzkc.zzbF(zzkiVar);
        }
        zzil.zzbw(iterable, zzgjVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i10) {
        return this.zzg.zza(i10);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
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
                    return new zzgi(null);
                }
                return new zzgj();
            }
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
