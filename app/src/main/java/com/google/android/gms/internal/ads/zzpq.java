package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpq implements zzqd {
    private final MediaCodec zza;
    private final zzpw zzb;
    private final zzpu zzc;
    private boolean zzd;
    private int zze = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpq(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, zzpp zzppVar) {
        this.zza = mediaCodec;
        this.zzb = new zzpw(handlerThread);
        this.zzc = new zzpu(mediaCodec, handlerThread2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzd(int i10) {
        return zzs(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zze(int i10) {
        return zzs(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzpq zzpqVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzpqVar.zzb.zzf(zzpqVar.zza);
        int i11 = zzeg.zza;
        Trace.beginSection("configureCodec");
        zzpqVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzpqVar.zzc.zzf();
        Trace.beginSection("startCodec");
        zzpqVar.zza.start();
        Trace.endSection();
        zzpqVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzs(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzc(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzk(int i10, int i11, zzfy zzfyVar, long j10, int i12) {
        this.zzc.zzd(i10, 0, zzfyVar, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zze();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
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
