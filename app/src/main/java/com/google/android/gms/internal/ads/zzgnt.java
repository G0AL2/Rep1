package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgnt {
    final Unsafe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgnt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j10);

    public abstract double zzb(Object obj, long j10);

    public abstract float zzc(Object obj, long j10);

    public abstract void zzd(long j10, byte[] bArr, long j11, long j12);

    public abstract void zze(Object obj, long j10, boolean z10);

    public abstract void zzf(Object obj, long j10, byte b10);

    public abstract void zzg(Object obj, long j10, double d10);

    public abstract void zzh(Object obj, long j10, float f10);

    public abstract boolean zzi(Object obj, long j10);

    public final int zzj(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzk(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzl(Object obj, long j10) {
        return this.zza.getInt(obj, j10);
    }

    public final long zzm(Object obj, long j10) {
        return this.zza.getLong(obj, j10);
    }

    public final long zzn(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzo(Object obj, long j10) {
        return this.zza.getObject(obj, j10);
    }

    public final void zzp(Object obj, long j10, int i10) {
        this.zza.putInt(obj, j10, i10);
    }

    public final void zzq(Object obj, long j10, long j11) {
        this.zza.putLong(obj, j10, j11);
    }

    public final void zzr(Object obj, long j10, Object obj2) {
        this.zza.putObject(obj, j10, obj2);
    }
}
