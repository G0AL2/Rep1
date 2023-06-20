package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzyi implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzyi zzb = new zzyf(zzzr.zzd);
    private static final zzyh zzd;
    private int zzc = 0;

    static {
        int i10 = zzxu.zza;
        zzd = new zzyh(null);
        zza = new zzya();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static zzyi zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzyi zzo(byte[] bArr, int i10, int i11) {
        zzl(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzyf(bArr2);
    }

    public static zzyi zzp(String str) {
        return new zzyf(str.getBytes(zzzr.zzb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzyi zzq(byte[] bArr) {
        return new zzyf(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzxz(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzabr.zza(this) : zzabr.zza(zzg(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i10, int i11, int i12);

    protected abstract int zzf(int i10, int i11, int i12);

    public abstract zzyi zzg(int i10, int i11);

    public abstract zzym zzh();

    protected abstract String zzi(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzj(zzxy zzxyVar) throws IOException;

    public abstract boolean zzk();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzi(charset);
    }

    public final boolean zzs() {
        return zzd() == 0;
    }

    public final byte[] zzt() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzzr.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
