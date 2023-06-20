package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzfld implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    protected final zzfmb zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfku zzf;
    private final long zzg;
    private final int zzh;

    public zzfld(Context context, int i10, int i11, String str, String str2, String str3, zzfku zzfkuVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfkuVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfmb zzfmbVar = new zzfmb(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfmbVar;
        this.zzd = new LinkedBlockingQueue();
        zzfmbVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    static zzfmn zza() {
        return new zzfmn(null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfmg zzd = zzd();
        if (zzd != null) {
            try {
                zzfmn zzf = zzd.zzf(new zzfml(1, this.zzh, this.zzb, this.zzc));
                zze(IronSourceConstants.errorCode_internal, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfmn zzb(int i10) {
        zzfmn zzfmnVar;
        try {
            zzfmnVar = (zzfmn) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfmnVar = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, null);
        if (zzfmnVar != null) {
            if (zzfmnVar.zzc == 7) {
                zzfku.zzg(3);
            } else {
                zzfku.zzg(2);
            }
        }
        return zzfmnVar == null ? zza() : zzfmnVar;
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
