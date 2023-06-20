package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzeh extends zzkc implements zzlk {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkj zzg = zzkc.zzbG();
    private zzkj zzh = zzkc.zzbG();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzkc.zzbM(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzeh zzehVar, int i10, zzes zzesVar) {
        zzesVar.getClass();
        zzkj zzkjVar = zzehVar.zzg;
        if (!zzkjVar.zzc()) {
            zzehVar.zzg = zzkc.zzbH(zzkjVar);
        }
        zzehVar.zzg.set(i10, zzesVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzeh zzehVar, int i10, zzej zzejVar) {
        zzejVar.getClass();
        zzkj zzkjVar = zzehVar.zzh;
        if (!zzkjVar.zzc()) {
            zzehVar.zzh = zzkc.zzbH(zzkjVar);
        }
        zzehVar.zzh.set(i10, zzejVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i10) {
        return (zzej) this.zzh.get(i10);
    }

    public final zzes zzf(int i10) {
        return (zzes) this.zzg.get(i10);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
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
                    return new zzeg(null);
                }
                return new zzeh();
            }
            return zzkc.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
