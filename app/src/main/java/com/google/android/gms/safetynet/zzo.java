package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
final class zzo extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(SafetyNetClient safetyNetClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z10) {
        zzad zzadVar = new zzad(status, z10);
        SafetyNetApi.VerifyAppsUserResponse verifyAppsUserResponse = new SafetyNetApi.VerifyAppsUserResponse();
        verifyAppsUserResponse.setResult(zzadVar);
        TaskUtil.setResultOrApiException(status, verifyAppsUserResponse, this.zza);
    }
}
