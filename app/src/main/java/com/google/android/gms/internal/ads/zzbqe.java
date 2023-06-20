package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqe(zzbqf zzbqfVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
