package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.jh;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzayu extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzayx zzb;
    private final zzayv zzc;
    private final zzayt zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayu(zzayx zzayxVar, Looper looper, zzayv zzayvVar, zzayt zzaytVar, int i10, long j10) {
        super(looper);
        this.zzb = zzayxVar;
        this.zzc = zzayvVar;
        this.zzd = zzaytVar;
        this.zza = i10;
        this.zze = j10;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzayu zzayuVar;
        this.zzf = null;
        zzayx zzayxVar = this.zzb;
        executorService = zzayxVar.zza;
        zzayuVar = zzayxVar.zzb;
        executorService.execute(zzayuVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            zzd();
        } else if (i10 != 4) {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.zze;
            if (this.zzc.zze()) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j10, false);
            } else if (i11 == 2) {
                this.zzd.zzu(this.zzc, elapsedRealtime, j10);
            } else if (i11 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzd = this.zzd.zzd(this.zzc, elapsedRealtime, j10, iOException);
                if (zzd == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzd != 2) {
                    int i12 = zzd != 1 ? 1 + this.zzg : 1;
                    this.zzg = i12;
                    zzc(Math.min((i12 - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzazm.zza("load:" + simpleName);
                try {
                    this.zzc.zzc();
                    zzazm.zzb();
                } catch (Throwable th) {
                    zzazm.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (OutOfMemoryError e11) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e11);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayw(e11)).sendToTarget();
        } catch (Error e12) {
            Log.e("LoadTask", "Unexpected error loading stream", e12);
            if (!this.zzi) {
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        } catch (InterruptedException unused) {
            zzayz.zze(this.zzc.zze());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e13) {
            Log.e("LoadTask", "Unexpected exception loading stream", e13);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayw(e13)).sendToTarget();
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z10) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzayu zzayuVar;
        zzayuVar = this.zzb.zzb;
        zzayz.zze(zzayuVar == null);
        this.zzb.zzb = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
