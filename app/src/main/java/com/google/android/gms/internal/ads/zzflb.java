package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzflb implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    protected final zzfmb zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzflb(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfmb zzfmbVar = new zzfmb(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfmbVar;
        this.zzd = new LinkedBlockingQueue();
        zzfmbVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    static zzaly zza() {
        zzali zza = zzaly.zza();
        zza.zzC(32768L);
        return (zzaly) zza.zzal();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfmg zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfmc(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaly zzb(int i10) {
        zzaly zzalyVar;
        try {
            zzalyVar = (zzaly) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzalyVar = null;
        }
        return zzalyVar == null ? zza() : zzalyVar;
    }

    public final void zzc() {
        zzfmb zzfmbVar = this.zza;
        if (zzfmbVar != null) {
            if (zzfmbVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfmg zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
