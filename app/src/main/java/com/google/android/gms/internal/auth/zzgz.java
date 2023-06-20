package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzgz {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    static {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgz.<clinit>():void");
    }

    private zzgz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, long j10) {
        return zzf.zzi(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(Object obj, long j10) {
        return zzf.zzj(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zze(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, long j10) {
        return zzf.zzl(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzgz.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
        sb2.append("platform method missing - proto runtime falling back to safer methods: ");
        sb2.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(Object obj, long j10, boolean z10) {
        long j11 = (-4) & j10;
        zzgy zzgyVar = zzf;
        int zzi = zzgyVar.zzi(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zzgyVar.zzm(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & zzi));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(Object obj, long j10, boolean z10) {
        long j11 = (-4) & j10;
        zzgy zzgyVar = zzf;
        int zzi = zzgyVar.zzi(obj, j11);
        int i10 = (((int) j10) & 3) << 3;
        zzgyVar.zzm(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & zzi));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzk(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzl(Object obj, long j10, double d10) {
        zzf.zzd(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzm(Object obj, long j10, float f10) {
        zzf.zze(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzn(Object obj, long j10, int i10) {
        zzf.zzm(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j10, long j11) {
        zzf.zzn(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j10, Object obj2) {
        zzf.zzo(obj, j10, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzq(Object obj, long j10) {
        return ((byte) ((zzf.zzi(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzr(Object obj, long j10) {
        return ((byte) ((zzf.zzi(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class<?> cls) {
        int i10 = zzdo.zza;
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzt(Object obj, long j10) {
        return zzf.zzf(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzu() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzv() {
        return zzg;
    }

    private static int zzw(Class<?> cls) {
        if (zzh) {
            return zzf.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class<?> cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i10 = zzdo.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz == null) {
            Field zzz2 = zzz(Buffer.class, "address");
            if (zzz2 == null || zzz2.getType() != Long.TYPE) {
                return null;
            }
            return zzz2;
        }
        return zzz;
    }

    private static Field zzz(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
