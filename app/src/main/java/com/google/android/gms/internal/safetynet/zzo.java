package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
final class zzo extends zzx {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzae zzaeVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) throws RemoteException {
        ((zzh) zzafVar.getService()).zzj(this.zzb, this.zza);
    }
}
