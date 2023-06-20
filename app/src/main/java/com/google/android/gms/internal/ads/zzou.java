package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzou extends zznv {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzou() {
        byte[] bArr = zzeg.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i10 = this.zzd;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i10) {
        zzj(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.zzj);
        int i11 = this.zzj - min;
        System.arraycopy(bArr, i10 - i11, this.zzg, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.zzg, i11, min);
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i10 = this.zzh;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.zzf.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i11 = this.zzd;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzh = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    zzj(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 != 1) {
                int limit3 = byteBuffer.limit();
                int zzr = zzr(byteBuffer);
                byteBuffer.limit(zzr);
                this.zzl += byteBuffer.remaining() / this.zzd;
                zzt(byteBuffer, this.zzg, this.zzj);
                if (zzr < limit3) {
                    zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int zzr2 = zzr(byteBuffer);
                int position2 = zzr2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i12 = this.zzi;
                int i13 = length - i12;
                if (zzr2 < limit4 && position2 < i13) {
                    zzs(bArr, i12);
                    this.zzi = 0;
                    this.zzh = 0;
                } else {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.zzf, this.zzi, min);
                    int i14 = this.zzi + min;
                    this.zzi = i14;
                    byte[] bArr2 = this.zzf;
                    if (i14 == bArr2.length) {
                        if (this.zzk) {
                            zzs(bArr2, this.zzj);
                            long j10 = this.zzl;
                            int i15 = this.zzi;
                            int i16 = this.zzj;
                            this.zzl = j10 + ((i15 - (i16 + i16)) / this.zzd);
                            i14 = i15;
                        } else {
                            this.zzl += (i14 - this.zzj) / this.zzd;
                        }
                        zzt(byteBuffer, this.zzf, i14);
                        this.zzi = 0;
                        this.zzh = 2;
                    }
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzmy
    public final boolean zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        if (zzmwVar.zzd == 2) {
            return this.zze ? zzmwVar : zzmw.zza;
        }
        throw new zzmx(zzmwVar);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int zzq = zzq(150000L) * this.zzd;
            if (this.zzf.length != zzq) {
                this.zzf = new byte[zzq];
            }
            int zzq2 = zzq(20000L) * this.zzd;
            this.zzj = zzq2;
            if (this.zzg.length != zzq2) {
                this.zzg = new byte[zzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzl() {
        int i10 = this.zzi;
        if (i10 > 0) {
            zzs(this.zzf, i10);
        }
        if (this.zzk) {
            return;
        }
        this.zzl += this.zzj / this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    protected final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzeg.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}
