package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgje extends zzgjd {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgje(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgji) && zzd() == ((zzgji) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzgje) {
                zzgje zzgjeVar = (zzgje) obj;
                int zzr = zzr();
                int zzr2 = zzgjeVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzgjeVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgji
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public int zzd() {
        return this.zza.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgjd
    final boolean zzg(zzgji zzgjiVar, int i10, int i11) {
        if (i11 <= zzgjiVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzgjiVar.zzd()) {
                if (zzgjiVar instanceof zzgje) {
                    zzgje zzgjeVar = (zzgje) zzgjiVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgjeVar.zza;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzgjeVar.zzc() + i10;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgjiVar.zzk(i10, i12).equals(zzk(0, i11));
            }
            int zzd = zzgjiVar.zzd();
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzd);
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i11 + zzd2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzi(int i10, int i11, int i12) {
        return zzgla.zzd(i10, this.zza, zzc() + i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzgnz.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgji zzk(int i10, int i11) {
        int zzq = zzgji.zzq(i10, i11, zzd());
        return zzq == 0 ? zzgji.zzb : new zzgjb(this.zza, zzc() + i10, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjq zzl() {
        return zzgjq.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzo(zzgix zzgixVar) throws IOException {
        zzgixVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzp() {
        int zzc = zzc();
        return zzgnz.zzj(this.zza, zzc, zzd() + zzc);
    }
}
