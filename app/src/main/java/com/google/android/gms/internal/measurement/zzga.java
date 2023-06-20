package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzga extends zzkc implements zzlk {
    private static final zzga zza;
    private zzkj zze = zzkc.zzbG();

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzkc.zzbM(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzga zzgaVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzkj zzkjVar = zzgaVar.zze;
        if (!zzkjVar.zzc()) {
            zzgaVar.zze = zzkc.zzbH(zzkjVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public final zzgc zzc(int i10) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
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
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzkc.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        return (byte) 1;
    }
}
