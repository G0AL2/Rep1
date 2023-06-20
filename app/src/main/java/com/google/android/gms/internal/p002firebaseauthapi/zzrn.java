package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrn  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrn extends zzuh {
    private final zzne zza;

    public zzrn(String str, String str2) {
        super(7);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zza = new zzne(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "applyActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zza(this.zza, this.zzc);
    }
}
