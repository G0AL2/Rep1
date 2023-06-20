package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznw extends zznv {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmw.zza;
        }
        if (zzmwVar.zzd == 2) {
            boolean z10 = zzmwVar.zzc != iArr.length;
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 >= length) {
                    return z10 ? new zzmw(zzmwVar.zzb, length, 2) : zzmw.zza;
                }
                int i11 = iArr[i10];
                if (i11 >= zzmwVar.zzc) {
                    throw new zzmx(zzmwVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
        } else {
            throw new zzmx(zzmwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
