package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzow implements zzmy {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzmw zze;
    private zzmw zzf;
    private zzmw zzg;
    private zzmw zzh;
    private boolean zzi;
    private zzov zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzow() {
        zzmw zzmwVar = zzmw.zza;
        this.zze = zzmwVar;
        this.zzf = zzmwVar;
        this.zzg = zzmwVar;
        this.zzh = zzmwVar;
        ByteBuffer byteBuffer = zzmy.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final zzmw zza(zzmw zzmwVar) throws zzmx {
        if (zzmwVar.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzmwVar.zzb;
            }
            this.zze = zzmwVar;
            zzmw zzmwVar2 = new zzmw(i10, zzmwVar.zzc, 2);
            this.zzf = zzmwVar2;
            this.zzi = true;
            return zzmwVar2;
        }
        throw new zzmx(zzmwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final ByteBuffer zzb() {
        int zza;
        zzov zzovVar = this.zzj;
        if (zzovVar != null && (zza = zzovVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzovVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzmy.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzc() {
        if (zzg()) {
            zzmw zzmwVar = this.zze;
            this.zzg = zzmwVar;
            zzmw zzmwVar2 = this.zzf;
            this.zzh = zzmwVar2;
            if (this.zzi) {
                this.zzj = new zzov(zzmwVar.zzb, zzmwVar.zzc, this.zzc, this.zzd, zzmwVar2.zzb);
            } else {
                zzov zzovVar = this.zzj;
                if (zzovVar != null) {
                    zzovVar.zzc();
                }
            }
        }
        this.zzm = zzmy.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzd() {
        zzov zzovVar = this.zzj;
        if (zzovVar != null) {
            zzovVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzov zzovVar = this.zzj;
            Objects.requireNonNull(zzovVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzovVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzmw zzmwVar = zzmw.zza;
        this.zze = zzmwVar;
        this.zzf = zzmwVar;
        this.zzg = zzmwVar;
        this.zzh = zzmwVar;
        ByteBuffer byteBuffer = zzmy.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final boolean zzh() {
        zzov zzovVar;
        return this.zzp && ((zzovVar = this.zzj) == null || zzovVar.zza() == 0);
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 >= 1024) {
            long j12 = this.zzn;
            zzov zzovVar = this.zzj;
            Objects.requireNonNull(zzovVar);
            long zzb = j12 - zzovVar.zzb();
            int i10 = this.zzh.zzb;
            int i11 = this.zzg.zzb;
            if (i10 == i11) {
                return zzeg.zzw(j10, zzb, j11);
            }
            return zzeg.zzw(j10, zzb * i10, j11 * i11);
        }
        return (long) (this.zzc * j10);
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
