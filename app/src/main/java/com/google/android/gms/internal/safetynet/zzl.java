package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
final class zzl extends zzt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzae zzaeVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) throws RemoteException {
        ((zzh) zzafVar.getService()).zzf(this.zza);
    }
}
