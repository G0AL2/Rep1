package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.a0;
import sb.e0;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrt  reason: invalid package */
/* loaded from: classes2.dex */
final class zzrt extends zzuh {
    private final zzns zza;

    public zzrt(a0 a0Var, String str, String str2) {
        super(2);
        Preconditions.checkNotNull(a0Var);
        Preconditions.checkNotEmpty(str);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        ((e0) this.zzf).a(this.zzj, zzte.zzN(this.zzd, this.zzk));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzh(this.zza, this.zzc);
    }
}
