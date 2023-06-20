package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzatc implements zzasi {
    private int zzb;
    private int zzc;
    private int[] zzd;
    private boolean zze;
    private int[] zzf;
    private ByteBuffer zzg;
    private ByteBuffer zzh;
    private boolean zzi;

    public zzatc() {
        ByteBuffer byteBuffer = zzasi.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        int[] iArr = this.zzf;
        return iArr == null ? this.zzb : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzh;
        this.zzh = zzasi.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzd() {
        this.zzh = zzasi.zza;
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zze() {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzf(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = this.zzb;
        int length = ((limit - position) / (i10 + i10)) * this.zzf.length;
        int i11 = length + length;
        if (this.zzg.capacity() < i11) {
            this.zzg = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.zzg.clear();
        }
        while (position < limit) {
            for (int i12 : this.zzf) {
                this.zzg.putShort(byteBuffer.getShort(i12 + i12 + position));
            }
            int i13 = this.zzb;
            position += i13 + i13;
        }
        byteBuffer.position(limit);
        this.zzg.flip();
        this.zzh = this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        zzd();
        this.zzg = zzasi.zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzf = null;
        this.zze = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzh(int i10, int i11, int i12) throws zzash {
        boolean z10 = !Arrays.equals(this.zzd, this.zzf);
        int[] iArr = this.zzd;
        this.zzf = iArr;
        if (iArr == null) {
            this.zze = false;
            return z10;
        } else if (i12 == 2) {
            if (!z10 && this.zzc == i10 && this.zzb == i11) {
                return false;
            }
            this.zzc = i10;
            this.zzb = i11;
            this.zze = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.zzf;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    this.zze = (i14 != i13) | this.zze;
                    i13++;
                } else {
                    throw new zzash(i10, i11, 2);
                }
            }
        } else {
            throw new zzash(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzj() {
        return this.zzi && this.zzh == zzasi.zza;
    }

    public final void zzk(int[] iArr) {
        this.zzd = iArr;
    }
}
