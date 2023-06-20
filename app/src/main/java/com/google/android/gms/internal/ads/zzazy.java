package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzazy implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzazy zzb = new zzazy();
    public volatile long zza;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzazy() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(0);
    }

    public static zzazy zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.zza = j10;
        this.zze.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.zze = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.zzf + 1;
            this.zzf = i11;
            if (i11 == 1) {
                this.zze.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.zzf - 1;
            this.zzf = i12;
            if (i12 == 0) {
                this.zze.removeFrameCallback(this);
                this.zza = 0L;
            }
            return true;
        }
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}
