package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.inmobi.media.jh;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzwe extends Handler implements Runnable {
    final /* synthetic */ zzwj zza;
    private final zzwf zzb;
    private final long zzc;
    private zzwb zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzwe(zzwj zzwjVar, Looper looper, zzwf zzwfVar, zzwb zzwbVar, int i10, long j10) {
        super(looper);
        this.zza = zzwjVar;
        this.zzb = zzwfVar;
        this.zzd = zzwbVar;
        this.zzc = j10;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzwe zzweVar;
        this.zze = null;
        zzwj zzwjVar = this.zza;
        executorService = zzwjVar.zze;
        zzweVar = zzwjVar.zzf;
        Objects.requireNonNull(zzweVar);
        executorService.execute(zzweVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        if (this.zzi) {
            return;
        }
        int i13 = message.what;
        if (i13 == 0) {
            zzd();
        } else if (i13 != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.zzc;
            zzwb zzwbVar = this.zzd;
            Objects.requireNonNull(zzwbVar);
            if (this.zzh) {
                zzwbVar.zzG(this.zzb, elapsedRealtime, j11, false);
                return;
            }
            int i14 = message.what;
            if (i14 == 1) {
                try {
                    zzwbVar.zzH(this.zzb, elapsedRealtime, j11);
                } catch (RuntimeException e10) {
                    zzdn.zza("LoadTask", "Unexpected exception handling load completed", e10);
                    this.zza.zzg = new zzwi(e10);
                }
            } else if (i14 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i15 = this.zzf + 1;
                this.zzf = i15;
                zzwd zzt = zzwbVar.zzt(this.zzb, elapsedRealtime, j11, iOException, i15);
                i10 = zzt.zza;
                if (i10 == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i11 = zzt.zza;
                if (i11 != 2) {
                    i12 = zzt.zza;
                    if (i12 == 1) {
                        this.zzf = 1;
                    }
                    j10 = zzt.zzb;
                    zzc(j10 != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                int i10 = zzeg.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzi();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(2, new zzwi(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(2, new zzwi(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwb zzwbVar = this.zzd;
            Objects.requireNonNull(zzwbVar);
            zzwbVar.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzwe zzweVar;
        zzweVar = this.zza.zzf;
        zzcw.zzf(zzweVar == null);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
