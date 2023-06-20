package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzaqn implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzapc zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzali zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzaqn(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        this.zzb = zzapcVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzaliVar;
        this.zzg = i10;
        this.zzh = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        long nanoTime;
        Method zzj;
        int i10;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzanx zzd = this.zzb.zzd();
        if (zzd != null && (i10 = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
