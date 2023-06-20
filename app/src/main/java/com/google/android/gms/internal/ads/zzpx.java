package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzpx extends zzgb {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzpx() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzfv
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i10) {
        this.zzh = i10;
    }

    public final boolean zzo(zzgb zzgbVar) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzgbVar.zzd(1073741824));
        zzcw.zzd(!zzgbVar.zzd(268435456));
        zzcw.zzd(!zzgbVar.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgbVar.zzd(RecyclerView.UNDEFINED_DURATION) != zzd(RecyclerView.UNDEFINED_DURATION)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgbVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.zzg;
        this.zzg = i10 + 1;
        if (i10 == 0) {
            this.zzd = zzgbVar.zzd;
            if (zzgbVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgbVar.zzd(RecyclerView.UNDEFINED_DURATION)) {
            zzc(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer3 = zzgbVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgbVar.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
