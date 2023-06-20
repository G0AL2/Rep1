package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwu extends HandlerThread implements Handler.Callback {
    private zzde zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzww zze;

    public zzwu() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    zzde zzdeVar = this.zza;
                    Objects.requireNonNull(zzdeVar);
                    zzdeVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                zzde zzdeVar2 = this.zza;
                Objects.requireNonNull(zzdeVar2);
                zzdeVar2.zzb(i11);
                this.zze = new zzww(this, this.zza.zza(), i11 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                zzdn.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.zzc = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                zzdn.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.zzd = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzww zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzde(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzww zzwwVar = this.zze;
                Objects.requireNonNull(zzwwVar);
                return zzwwVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
