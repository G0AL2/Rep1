package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgjq {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgjr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjq(zzgjp zzgjpVar) {
    }

    public static int zzF(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zzG(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzgjq zzH(InputStream inputStream, int i10) {
        return new zzgjo(inputStream, 4096, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgjq zzI(byte[] bArr, int i10, int i11, boolean z10) {
        zzgjk zzgjkVar = new zzgjk(bArr, i10, i11, z10, null);
        try {
            zzgjkVar.zze(i11);
            return zzgjkVar;
        } catch (zzglc e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i10) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i10) throws zzglc;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzgji zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i10) throws zzglc;
}
