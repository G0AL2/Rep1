package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzym  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzym {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzyn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzym(zzyl zzylVar) {
    }

    public static int zzs(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zzt(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzym zzu(byte[] bArr, int i10, int i11, boolean z10) {
        zzyk zzykVar = new zzyk(bArr, 0, i11, z10, null);
        try {
            zzykVar.zzc(i11);
            return zzykVar;
        } catch (zzzt e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i10) throws zzzt;

    public abstract int zzf() throws IOException;

    public abstract zzyi zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract void zzm(int i10) throws zzzt;

    public abstract void zzn(int i10);

    public abstract boolean zzp() throws IOException;

    public abstract boolean zzq() throws IOException;

    public abstract boolean zzr(int i10) throws IOException;
}
