package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzati implements zzasi {
    private zzath zzd;
    private ByteBuffer zzg;
    private ShortBuffer zzh;
    private ByteBuffer zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private float zze = 1.0f;
    private float zzf = 1.0f;
    private int zzb = -1;
    private int zzc = -1;

    public zzati() {
        ByteBuffer byteBuffer = zzasi.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzi;
        this.zzi = zzasi.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzd() {
        zzath zzathVar = new zzath(this.zzc, this.zzb);
        this.zzd = zzathVar;
        zzathVar.zzf(this.zze);
        this.zzd.zze(this.zzf);
        this.zzi = zzasi.zza;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zze() {
        this.zzd.zzc();
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzj += remaining;
            this.zzd.zzd(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zza = this.zzd.zza() * this.zzb;
        int i10 = zza + zza;
        if (i10 > 0) {
            if (this.zzg.capacity() < i10) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.zzg = order;
                this.zzh = order.asShortBuffer();
            } else {
                this.zzg.clear();
                this.zzh.clear();
            }
            this.zzd.zzb(this.zzh);
            this.zzk += i10;
            this.zzg.limit(i10);
            this.zzi = this.zzg;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        this.zzd = null;
        ByteBuffer byteBuffer = zzasi.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzh(int i10, int i11, int i12) throws zzash {
        if (i12 == 2) {
            if (this.zzc == i10 && this.zzb == i11) {
                return false;
            }
            this.zzc = i10;
            this.zzb = i11;
            return true;
        }
        throw new zzash(i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzi() {
        return Math.abs(this.zze + (-1.0f)) >= 0.01f || Math.abs(this.zzf + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzj() {
        zzath zzathVar;
        return this.zzl && ((zzathVar = this.zzd) == null || zzathVar.zza() == 0);
    }

    public final float zzk(float f10) {
        this.zzf = zzazo.zza(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float zzl(float f10) {
        float zza = zzazo.zza(f10, 0.1f, 8.0f);
        this.zze = zza;
        return zza;
    }

    public final long zzm() {
        return this.zzj;
    }

    public final long zzn() {
        return this.zzk;
    }
}
