package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzjj extends zzir {
    private static final Logger zzb = Logger.getLogger(zzjj.class.getName());
    private static final boolean zzc = zzmv.zzx();
    zzjk zza;

    private zzjj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjj(zzji zzjiVar) {
    }

    public static int zzA(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzB(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static zzjj zzC(byte[] bArr) {
        return new zzjg(bArr, 0, bArr.length);
    }

    public static int zzt(zzjb zzjbVar) {
        int zzd = zzjbVar.zzd();
        return zzA(zzd) + zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzu(int i10, zzlj zzljVar, zzlu zzluVar) {
        int zzA = zzA(i10 << 3);
        int i11 = zzA + zzA;
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return i11 + zzbu;
    }

    public static int zzv(int i10) {
        if (i10 >= 0) {
            return zzA(i10);
        }
        return 10;
    }

    public static int zzw(zzkp zzkpVar) {
        int zza = zzkpVar.zza();
        return zzA(zza) + zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(zzlj zzljVar, zzlu zzluVar) {
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return zzA(zzbu) + zzbu;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzna.zzc(str);
        } catch (zzmz unused) {
            length = str.getBytes(zzkk.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i10) {
        return zzA(i10 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE(String str, zzmz zzmzVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmzVar);
        byte[] bytes = str.getBytes(zzkk.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjh(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzjb zzjbVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, String str) throws IOException;

    public abstract void zzo(int i10, int i11) throws IOException;

    public abstract void zzp(int i10, int i11) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10, long j10) throws IOException;

    public abstract void zzs(long j10) throws IOException;
}
