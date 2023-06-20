package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeaw extends zzeay {
    public zzeaw(Context context) {
        this.zzf = new zzbzg(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzeax(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebn(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zze(new zzebn(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeay, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzebn(1));
    }
}
