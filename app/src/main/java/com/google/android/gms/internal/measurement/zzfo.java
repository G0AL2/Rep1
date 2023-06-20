package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfo extends zzkc implements zzlk {
    private static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzkc.zzbM(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfn zzb() {
        return (zzfn) zza.zzbA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfo zzfoVar, int i10) {
        zzfoVar.zze |= 1;
        zzfoVar.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzfo zzfoVar, zzgh zzghVar) {
        zzghVar.getClass();
        zzfoVar.zzg = zzghVar;
        zzfoVar.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfo zzfoVar, zzgh zzghVar) {
        zzfoVar.zzh = zzghVar;
        zzfoVar.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfo zzfoVar, boolean z10) {
        zzfoVar.zze |= 8;
        zzfoVar.zzi = z10;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgh zzd() {
        zzgh zzghVar = this.zzg;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final zzgh zze() {
        zzgh zzghVar = this.zzh;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
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
                    return new zzfn(null);
                }
                return new zzfo();
            }
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
