package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import sb.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsd  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzsd extends zzuh {
    private final zzoy zza;

    public zzsd(EmailAuthCredential emailAuthCredential) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null or empty");
        this.zza = new zzoy(emailAuthCredential);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzx zzN = zzte.zzN(this.zzd, this.zzk);
        if (this.zze.e().equalsIgnoreCase(zzN.e())) {
            ((e0) this.zzf).a(this.zzj, zzN);
            zzm(new zzr(zzN));
            return;
        }
        zzl(new Status(17024));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzx(this.zza, this.zzc);
    }
}
