package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzox extends zznv {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzeg.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzmy
    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.zzi) > 0) {
            zzj(i10).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.zzi + i11) - this.zzh.length;
        ByteBuffer zzj = zzj(length);
        int zzf = zzeg.zzf(length, 0, this.zzi);
        zzj.put(this.zzh, 0, zzf);
        int zzf2 = zzeg.zzf(length - zzf, 0, i11);
        byteBuffer.limit(byteBuffer.position() + zzf2);
        zzj.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - zzf2;
        int i13 = this.zzi - zzf;
        this.zzi = i13;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzf, bArr, 0, i13);
        byteBuffer.get(this.zzh, this.zzi, i12);
        this.zzi += i12;
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzmy
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        if (zzmwVar.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzmw.zza : zzmwVar;
        }
        throw new zzmx(zzmwVar);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i10 = this.zze;
            int i11 = this.zzb.zze;
            this.zzh = new byte[i10 * i11];
            this.zzg = this.zzd * i11;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzl() {
        int i10;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i10 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzm() {
        this.zzh = zzeg.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }
}
