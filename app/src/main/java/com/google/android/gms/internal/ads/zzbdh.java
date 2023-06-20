package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdh implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbdi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdh(zzbdi zzbdiVar, zzcga zzcgaVar) {
        this.zzb = zzbdiVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
