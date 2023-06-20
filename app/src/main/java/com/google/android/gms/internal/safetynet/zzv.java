package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
public abstract class zzv extends zze<SafetyNetApi.HarmfulAppsResult> {
    protected final zzg zza;

    public zzv(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zza = new zzu(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new zzaa(status, null);
    }
}
