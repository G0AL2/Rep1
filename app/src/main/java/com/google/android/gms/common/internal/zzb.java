package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzb extends com.google.android.gms.internal.common.zzi {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z10;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && ((i10 != 4 || this.zza.enableLocalFallback()) && message.what != 5)) || this.zza.isConnecting()) {
            int i11 = message.what;
            if (i11 == 4) {
                this.zza.zzB = new ConnectionResult(message.arg2);
                if (BaseGmsClient.zzo(this.zza)) {
                    BaseGmsClient baseGmsClient = this.zza;
                    z10 = baseGmsClient.zzC;
                    if (!z10) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.zza;
                connectionResult2 = baseGmsClient2.zzB;
                ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new ConnectionResult(8);
                this.zza.zzc.onReportServiceBinding(connectionResult3);
                this.zza.onConnectionFailed(connectionResult3);
                return;
            } else if (i11 == 5) {
                BaseGmsClient baseGmsClient3 = this.zza;
                connectionResult = baseGmsClient3.zzB;
                ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new ConnectionResult(8);
                this.zza.zzc.onReportServiceBinding(connectionResult4);
                this.zza.onConnectionFailed(connectionResult4);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.zza.zzc.onReportServiceBinding(connectionResult5);
                this.zza.onConnectionFailed(connectionResult5);
                return;
            } else if (i11 == 6) {
                this.zza.zzp(5, null);
                BaseGmsClient baseGmsClient4 = this.zza;
                baseConnectionCallbacks = baseGmsClient4.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.zzw;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.zza.onConnectionSuspended(message.arg2);
                BaseGmsClient.zzn(this.zza, 5, 1, null);
                return;
            } else if (i11 == 2 && !this.zza.isConnected()) {
                zza(message);
                return;
            } else if (zzb(message)) {
                ((zzc) message.obj).zze();
                return;
            } else {
                int i12 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i12);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
                return;
            }
        }
        zza(message);
    }
}
