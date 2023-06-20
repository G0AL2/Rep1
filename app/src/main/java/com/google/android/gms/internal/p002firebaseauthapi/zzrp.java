package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrp extends zzuh {
    private final zznm zza;

    public zzrp(String str, String str2, String str3) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        Preconditions.checkNotEmpty(str2, "new password cannot be null or empty");
        this.zza = new zznm(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zze(this.zza, this.zzc);
    }
}
