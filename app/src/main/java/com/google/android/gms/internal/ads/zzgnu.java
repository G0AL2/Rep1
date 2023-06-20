package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgnt zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    static {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgnu.<clinit>():void");
    }

    private zzgnu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzA() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zzj(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zzk(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i10 = zzgit.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 == null || zzF2.getType() != Long.TYPE) {
                return null;
            }
            return zzF2;
        }
        return zzF;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzgnt zzgntVar = zzf;
        int zzl = zzgntVar.zzl(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zzgntVar.zzp(obj, j11, ((255 & b10) << i10) | (zzl & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzgnt zzgntVar = zzf;
        int i10 = (((int) j10) & 3) << 3;
        zzgntVar.zzp(obj, j11, ((255 & b10) << i10) | (zzgntVar.zzl(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(long j10) {
        return zzf.zza(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzc(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(Object obj, long j10) {
        return zzf.zzl(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zze(ByteBuffer byteBuffer) {
        return zzf.zzm(byteBuffer, zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(Object obj, long j10) {
        return zzf.zzm(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzh(Object obj, long j10) {
        return zzf.zzo(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgnq());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzgnu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(long j10, byte[] bArr, long j11, long j12) {
        zzf.zzd(j10, bArr, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j10, boolean z10) {
        zzf.zze(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(byte[] bArr, long j10, byte b10) {
        zzf.zzf(bArr, zza + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzr(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzs(Object obj, long j10, float f10) {
        zzf.zzh(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzt(Object obj, long j10, int i10) {
        zzf.zzp(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzu(Object obj, long j10, long j11) {
        zzf.zzq(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzv(Object obj, long j10, Object obj2) {
        zzf.zzr(obj, j10, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j10) {
        return ((byte) ((zzf.zzl(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j10) {
        return ((byte) ((zzf.zzl(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzy(Class cls) {
        int i10 = zzgit.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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
    public static boolean zzz(Object obj, long j10) {
        return zzf.zzi(obj, j10);
    }
}
