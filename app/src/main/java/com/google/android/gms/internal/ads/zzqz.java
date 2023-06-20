package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqz implements zzqd {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqz(MediaCodec mediaCodec, zzqy zzqyVar) {
        this.zza = mediaCodec;
        if (zzeg.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zzeg.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzf(int i10) {
        if (zzeg.zza >= 21) {
            return this.zza.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) zzeg.zzG(this.zzb))[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzg(int i10) {
        if (zzeg.zza >= 21) {
            return this.zza.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) zzeg.zzG(this.zzc))[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzk(int i10, int i11, zzfy zzfyVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzfyVar.zza(), j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzm(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzn(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final boolean zzr() {
        return false;
    }
}
