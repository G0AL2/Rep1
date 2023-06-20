package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public abstract class zzgy {
    final Unsafe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgy(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, double d10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract boolean zzf(Object obj, long j10);

    public final int zzg(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j10) {
        return this.zza.getInt(obj, j10);
    }

    public final long zzj(Object obj, long j10) {
        return this.zza.getLong(obj, j10);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j10) {
        return this.zza.getObject(obj, j10);
    }

    public final void zzm(Object obj, long j10, int i10) {
        this.zza.putInt(obj, j10, i10);
    }

    public final void zzn(Object obj, long j10, long j11) {
        this.zza.putLong(obj, j10, j11);
    }

    public final void zzo(Object obj, long j10, Object obj2) {
        this.zza.putObject(obj, j10, obj2);
    }
}
