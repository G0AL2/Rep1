package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgms extends zzgji {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgji zzd;
    private final zzgji zze;
    private final int zzf;
    private final int zzg;

    private zzgms(zzgji zzgjiVar, zzgji zzgjiVar2) {
        this.zzd = zzgjiVar;
        this.zze = zzgjiVar2;
        int zzd = zzgjiVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgjiVar2.zzd();
        this.zzg = Math.max(zzgjiVar.zzf(), zzgjiVar2.zzf()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgji zzG(zzgji zzgjiVar, zzgji zzgjiVar2) {
        if (zzgjiVar2.zzd() == 0) {
            return zzgjiVar;
        }
        if (zzgjiVar.zzd() == 0) {
            return zzgjiVar2;
        }
        int zzd = zzgjiVar.zzd() + zzgjiVar2.zzd();
        if (zzd < 128) {
            return zzH(zzgjiVar, zzgjiVar2);
        }
        if (zzgjiVar instanceof zzgms) {
            zzgms zzgmsVar = (zzgms) zzgjiVar;
            if (zzgmsVar.zze.zzd() + zzgjiVar2.zzd() < 128) {
                return new zzgms(zzgmsVar.zzd, zzH(zzgmsVar.zze, zzgjiVar2));
            } else if (zzgmsVar.zzd.zzf() > zzgmsVar.zze.zzf() && zzgmsVar.zzg > zzgjiVar2.zzf()) {
                return new zzgms(zzgmsVar.zzd, new zzgms(zzgmsVar.zze, zzgjiVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgjiVar.zzf(), zzgjiVar2.zzf()) + 1)) {
            return new zzgms(zzgjiVar, zzgjiVar2);
        }
        return zzgmo.zza(new zzgmo(null), zzgjiVar, zzgjiVar2);
    }

    private static zzgji zzH(zzgji zzgjiVar, zzgji zzgjiVar2) {
        int zzd = zzgjiVar.zzd();
        int zzd2 = zzgjiVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgjiVar.zzC(bArr, 0, 0, zzd);
        zzgjiVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgje(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgji)) {
            return false;
        }
        zzgji zzgjiVar = (zzgji) obj;
        if (this.zzc != zzgjiVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgjiVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgmq zzgmqVar = new zzgmq(this, null);
        zzgjd next = zzgmqVar.next();
        zzgmq zzgmqVar2 = new zzgmq(zzgjiVar, null);
        zzgjd next2 = zzgmqVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (i10 == 0) {
                zzg = next.zzg(next2, i11, min);
            } else {
                zzg = next2.zzg(next, i10, min);
            }
            if (!zzg) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgmqVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == zzd2) {
                next2 = zzgmqVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgji, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgmm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final byte zza(int i10) {
        zzgji.zzB(i10, this.zzc);
        return zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i10 + i12 <= i13) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i13) {
            this.zze.zze(bArr, i10 - i13, i11, i12);
        } else {
            int i14 = i13 - i10;
            this.zzd.zze(bArr, i10, i11, i14);
            this.zze.zze(bArr, 0, i11 + i14, i12 - i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzf() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzi(int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i11 + i12 <= i13) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.zze.zzi(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i14), 0, i12 - i14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzj(int i10, int i11, int i12) {
        int i13 = this.zzf;
        if (i11 + i12 <= i13) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.zze.zzj(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i14), 0, i12 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgji zzk(int i10, int i11) {
        int zzq = zzgji.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgji.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgji zzgjiVar = this.zzd;
        return new zzgms(zzgjiVar.zzk(i10, zzgjiVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjq zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzgmq zzgmqVar = new zzgmq(this, null);
        while (zzgmqVar.hasNext()) {
            arrayList.add(zzgmqVar.next().zzn());
        }
        int i10 = zzgjq.zzd;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else {
                z10 = byteBuffer.isDirect() ? z10 | true : z10 | true;
            }
        }
        if (z10) {
            return new zzgjm(arrayList, i11, true, null);
        }
        return zzgjq.zzH(new zzgld(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final ByteBuffer zzn() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzo(zzgix zzgixVar) throws IOException {
        this.zzd.zzo(zzgixVar);
        this.zze.zzo(zzgixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgji zzgjiVar = this.zze;
        return zzgjiVar.zzj(zzj, 0, zzgjiVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjc zzs() {
        return new zzgmm(this);
    }
}
