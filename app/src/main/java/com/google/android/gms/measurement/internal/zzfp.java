package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfp implements ServiceConnection {
    final /* synthetic */ zzfq zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfq zzfqVar, String str) {
        this.zza = zzfqVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.zza.zza.zzaz().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzaz().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaA().zzp(new zzfo(this, zzb, this));
                return;
            } catch (RuntimeException e10) {
                this.zza.zza.zzaz().zzk().zzb("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        this.zza.zza.zzaz().zzk().zza("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaz().zzj().zza("Install Referrer Service disconnected");
    }
}
