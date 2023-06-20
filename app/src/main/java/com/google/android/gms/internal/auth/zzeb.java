package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public abstract class zzeb implements Iterable<Byte>, Serializable {
    private static final Comparator<zzeb> zza;
    public static final zzeb zzb = new zzdz(zzev.zzc);
    private static final zzea zzd;
    private int zzc = 0;

    static {
        int i10 = zzdo.zza;
        zzd = new zzea(null);
        zza = new zzdu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Beginning index: ");
                sb2.append(i10);
                sb2.append(" < 0");
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i11 < i10) {
                StringBuilder sb3 = new StringBuilder(66);
                sb3.append("Beginning index larger than ending index: ");
                sb3.append(i10);
                sb3.append(", ");
                sb3.append(i11);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("End index: ");
                sb4.append(i11);
                sb4.append(" >= ");
                sb4.append(i12);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        }
        return i13;
    }

    public static zzeb zzk(byte[] bArr, int i10, int i11) {
        zzi(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzdz(bArr2);
    }

    public static zzeb zzl(String str) {
        return new zzdz(str.getBytes(zzev.zza));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zze(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzds(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgn.zza(this) : String.valueOf(zzgn.zza(zzf(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    protected abstract int zze(int i10, int i11, int i12);

    public abstract zzeb zzf(int i10, int i11);

    protected abstract String zzg(Charset charset);

    public abstract boolean zzh();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzj() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
