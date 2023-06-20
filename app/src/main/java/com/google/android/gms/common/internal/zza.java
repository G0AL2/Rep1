package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
abstract class zza extends zzc<Boolean> {
    public final int zza;
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(BaseGmsClient baseGmsClient, int i10, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.zzc = baseGmsClient;
        this.zza = i10;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zza(Boolean bool) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else if (zzd()) {
        } else {
            this.zzc.zzp(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }

    protected abstract void zzb(ConnectionResult connectionResult);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }

    protected abstract boolean zzd();
}
