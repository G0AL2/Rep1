package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import sb.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzry  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzry extends zzuh {
    private final PhoneAuthCredential zza;

    public zzry(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zza = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential, "credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzx zzN = zzte.zzN(this.zzd, this.zzk);
        ((e0) this.zzf).a(this.zzj, zzN);
        zzm(new zzr(zzN));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzn(new zzoe(this.zze.zzf(), this.zza), this.zzc);
    }
}
