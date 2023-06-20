package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzyt extends zzxy {
    private static final Logger zza = Logger.getLogger(zzyt.class.getName());
    private static final boolean zzb = zzacd.zzx();
    zzyu zze;

    private zzyt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzyt(zzys zzysVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzA(zzaaq zzaaqVar, zzabc zzabcVar) {
        zzxs zzxsVar = (zzxs) zzaaqVar;
        int zzn = zzxsVar.zzn();
        if (zzn == -1) {
            zzn = zzabcVar.zza(zzxsVar);
            zzxsVar.zzp(zzn);
        }
        return zzE(zzn) + zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzaci.zzc(str);
        } catch (zzach unused) {
            length = str.getBytes(zzzr.zzb).length;
        }
        return zzE(length) + length;
    }

    public static int zzD(int i10) {
        return zzE(i10 << 3);
    }

    public static int zzE(int i10) {
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

    public static int zzF(long j10) {
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

    public static zzyt zzG(byte[] bArr) {
        return new zzyp(bArr, 0, bArr.length);
    }

    public static zzyt zzH(OutputStream outputStream, int i10) {
        return new zzyr(outputStream, i10);
    }

    public static int zzw(zzyi zzyiVar) {
        int zzd = zzyiVar.zzd();
        return zzE(zzd) + zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzx(int i10, zzaaq zzaaqVar, zzabc zzabcVar) {
        int zzE = zzE(i10 << 3);
        int i11 = zzE + zzE;
        zzxs zzxsVar = (zzxs) zzaaqVar;
        int zzn = zzxsVar.zzn();
        if (zzn == -1) {
            zzn = zzabcVar.zza(zzxsVar);
            zzxsVar.zzp(zzn);
        }
        return i11 + zzn;
    }

    public static int zzy(int i10) {
        if (i10 >= 0) {
            return zzE(i10);
        }
        return 10;
    }

    public static int zzz(zzzw zzzwVar) {
        int zza2 = zzzwVar.zza();
        return zzE(zza2) + zza2;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzJ(String str, zzach zzachVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzachVar);
        byte[] bytes = str.getBytes(zzzr.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzyq(e10);
        }
    }

    public abstract void zzN() throws IOException;

    public abstract void zzO(byte b10) throws IOException;

    public abstract void zzP(int i10, boolean z10) throws IOException;

    public abstract void zzQ(int i10, zzyi zzyiVar) throws IOException;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxy
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzaaq zzaaqVar, zzabc zzabcVar) throws IOException;

    public abstract void zzo(int i10, String str) throws IOException;

    public abstract void zzq(int i10, int i11) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10, long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;
}
