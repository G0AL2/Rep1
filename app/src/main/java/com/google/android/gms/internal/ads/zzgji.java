package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgji implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgji zzb = new zzgje(zzgla.zzd);
    private static final zzgjh zzd;
    private int zzc = 0;

    static {
        int i10 = zzgit.zza;
        zzd = new zzgjh(null);
        zza = new zzgiz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzB(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static zzgji zzc(Iterator it, int i10) {
        if (i10 > 0) {
            if (i10 == 1) {
                return (zzgji) it.next();
            }
            int i11 = i10 >>> 1;
            zzgji zzc = zzc(it, i11);
            zzgji zzc2 = zzc(it, i10 - i11);
            if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
                return zzgms.zzG(zzc, zzc2);
            }
            int zzd2 = zzc.zzd();
            int zzd3 = zzc2.zzd();
            throw new IllegalArgumentException("ByteString would be too long: " + zzd2 + "+" + zzd3);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i10, int i11, int i12) {
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

    public static zzgjf zzt() {
        return new zzgjf(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgji zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgji zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgji zzw(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgje(bArr2);
    }

    public static zzgji zzx(String str) {
        return new zzgje(str.getBytes(zzgla.zzb));
    }

    public static zzgji zzy(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 256;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            zzgji zzw = i11 == 0 ? null : zzw(bArr, 0, i11);
            if (zzw == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzw);
            i10 = Math.min(i10 + i10, (int) Constants.BUFFER_SIZE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgji zzz(byte[] bArr) {
        return new zzgje(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzi(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgni.zza(this) : zzgni.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgla.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzh();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzi(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgji zzk(int i10, int i11);

    public abstract zzgjq zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(zzgix zzgixVar) throws IOException;

    public abstract boolean zzp();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgjc iterator() {
        return new zzgiy(this);
    }
}
