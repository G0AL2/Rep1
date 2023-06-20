package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfw extends zzkc implements zzlk {
    private static final zzfw zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private zzkj zzk = zzkc.zzbG();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzkc.zzbM(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zze() {
        return (zzfv) zza.zzbA();
    }

    public static /* synthetic */ void zzj(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 1;
        zzfwVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 2;
        zzfwVar.zzg = str;
    }

    public static /* synthetic */ void zzm(zzfw zzfwVar) {
        zzfwVar.zze &= -3;
        zzfwVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void zzn(zzfw zzfwVar, long j10) {
        zzfwVar.zze |= 4;
        zzfwVar.zzh = j10;
    }

    public static /* synthetic */ void zzo(zzfw zzfwVar) {
        zzfwVar.zze &= -5;
        zzfwVar.zzh = 0L;
    }

    public static /* synthetic */ void zzp(zzfw zzfwVar, double d10) {
        zzfwVar.zze |= 16;
        zzfwVar.zzj = d10;
    }

    public static /* synthetic */ void zzq(zzfw zzfwVar) {
        zzfwVar.zze &= -17;
        zzfwVar.zzj = 0.0d;
    }

    public static /* synthetic */ void zzr(zzfw zzfwVar, zzfw zzfwVar2) {
        zzfwVar2.getClass();
        zzfwVar.zzz();
        zzfwVar.zzk.add(zzfwVar2);
    }

    public static /* synthetic */ void zzs(zzfw zzfwVar, Iterable iterable) {
        zzfwVar.zzz();
        zzil.zzbw(iterable, zzfwVar.zzk);
    }

    private final void zzz() {
        zzkj zzkjVar = this.zzk;
        if (zzkjVar.zzc()) {
            return;
        }
        this.zzk = zzkc.zzbH(zzkjVar);
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
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
                    return new zzfv(null);
                }
                return new zzfw();
            }
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfw.class});
        }
        return (byte) 1;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}
