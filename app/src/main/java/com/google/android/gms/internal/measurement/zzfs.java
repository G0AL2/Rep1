package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfs extends zzkc implements zzlk {
    private static final zzfs zza;
    private int zze;
    private zzkj zzf = zzkc.zzbG();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfs zzfsVar = new zzfs();
        zza = zzfsVar;
        zzkc.zzbM(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    public static zzfr zze() {
        return (zzfr) zza.zzbA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzfs zzfsVar, int i10, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.zzv();
        zzfsVar.zzf.set(i10, zzfwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzfs zzfsVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.zzv();
        zzfsVar.zzf.add(zzfwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzfs zzfsVar, Iterable iterable) {
        zzfsVar.zzv();
        zzil.zzbw(iterable, zzfsVar.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzfs zzfsVar, int i10) {
        zzfsVar.zzv();
        zzfsVar.zzf.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzfs zzfsVar, String str) {
        str.getClass();
        zzfsVar.zze |= 1;
        zzfsVar.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzfs zzfsVar, long j10) {
        zzfsVar.zze |= 2;
        zzfsVar.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzfs zzfsVar, long j10) {
        zzfsVar.zze |= 4;
        zzfsVar.zzi = j10;
    }

    private final void zzv() {
        zzkj zzkjVar = this.zzf;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzf = zzkc.zzbH(zzkjVar);
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfw zzg(int i10) {
        return (zzfw) this.zzf.get(i10);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzf;
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
                    return new zzfr(null);
                }
                return new zzfs();
            }
            return zzkc.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfw.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
