package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzka implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzkb zza;
    private volatile boolean zzb;
    private volatile zzeu zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzka(zzkb zzkbVar) {
        this.zza = zzkbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzs.zzaA().zzp(new zzjx(this, (zzeo) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzey zzl = this.zza.zzs.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzs.zzaA().zzp(new zzjz(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzs.zzaz().zzc().zza("Service connection suspended");
        this.zza.zzs.zzaA().zzp(new zzjy(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzka zzkaVar;
        zzeo zzemVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzs.zzaz().zzd().zza("Service connected with null binder");
                return;
            }
            zzeo zzeoVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzeo) {
                        zzemVar = (zzeo) queryLocalInterface;
                    } else {
                        zzemVar = new zzem(iBinder);
                    }
                    zzeoVar = zzemVar;
                    this.zza.zzs.zzaz().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzs.zzaz().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzs.zzaz().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzeoVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzav = this.zza.zzs.zzav();
                    zzkaVar = this.zza.zza;
                    connectionTracker.unbindService(zzav, zzkaVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzs.zzaA().zzp(new zzjv(this, zzeoVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzs.zzaz().zzc().zza("Service disconnected");
        this.zza.zzs.zzaA().zzp(new zzjw(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzka zzkaVar;
        this.zza.zzg();
        Context zzav = this.zza.zzs.zzav();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzaz().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzs.zzaz().zzj().zza("Using local app measurement service");
            this.zzb = true;
            zzkaVar = this.zza.zza;
            connectionTracker.bindService(zzav, intent, zzkaVar, 129);
        }
    }

    public final void zzc() {
        this.zza.zzg();
        Context zzav = this.zza.zzs.zzav();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzaz().zzj().zza("Connection attempt already in progress");
            } else if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzs.zzaz().zzj().zza("Already awaiting connection attempt");
            } else {
                this.zzc = new zzeu(zzav, Looper.getMainLooper(), this, this);
                this.zza.zzs.zzaz().zzj().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
