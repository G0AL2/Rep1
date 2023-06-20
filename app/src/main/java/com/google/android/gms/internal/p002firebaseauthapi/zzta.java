package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.UserProfileChangeRequest;
import sb.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzta  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzta extends zzuh {
    private final UserProfileChangeRequest zza;

    public zzta(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        this.zza = (UserProfileChangeRequest) Preconditions.checkNotNull(userProfileChangeRequest, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        ((e0) this.zzf).a(this.zzj, zzte.zzN(this.zzd, this.zzk));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzE(new zzpm(this.zza, this.zze.zzf()), this.zzc);
    }
}
