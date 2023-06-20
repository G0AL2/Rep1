package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpo implements zzqc {
    private final zzfpj zzb;
    private final zzfpj zzc;

    public zzpo(int i10, boolean z10) {
        zzpm zzpmVar = new zzpm(i10);
        zzpn zzpnVar = new zzpn(i10);
        this.zzb = zzpmVar;
        this.zzc = zzpnVar;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzs;
        zzs = zzpq.zzs(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzs;
        zzs = zzpq.zzs(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzpq zzc(zzqb zzqbVar) throws IOException {
        MediaCodec mediaCodec;
        String str = zzqbVar.zza.zza;
        zzpq zzpqVar = null;
        try {
            int i10 = zzeg.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzpq zzpqVar2 = new zzpq(mediaCodec, zza(((zzpm) this.zzb).zza), zzb(((zzpn) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzpq.zzh(zzpqVar2, zzqbVar.zzb, zzqbVar.zzd, null, 0);
                    return zzpqVar2;
                } catch (Exception e10) {
                    e = e10;
                    zzpqVar = zzpqVar2;
                    if (zzpqVar != null) {
                        zzpqVar.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }
}
