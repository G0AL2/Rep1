package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import sb.e0;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzru  reason: invalid package */
/* loaded from: classes2.dex */
final class zzru extends zzuh {
    private final zznu zza;

    public zzru(a0 a0Var, String str) {
        super(2);
        Preconditions.checkNotNull(a0Var);
        Preconditions.checkNotEmpty(str);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzx zzN = zzte.zzN(this.zzd, this.zzk);
        FirebaseUser firebaseUser = this.zze;
        if (firebaseUser != null && !firebaseUser.e().equalsIgnoreCase(zzN.e())) {
            zzl(new Status(17024));
            return;
        }
        ((e0) this.zzf).a(this.zzj, zzN);
        zzm(new zzr(zzN));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzi(this.zza, this.zzc);
    }
}
