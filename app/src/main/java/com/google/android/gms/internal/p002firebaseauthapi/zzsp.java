package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import sb.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzsp extends zzuh {
    private final zzow zza;

    public zzsp(String str, String str2, String str3) {
        super(2);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        Preconditions.checkNotEmpty(str2, "password cannot be null or empty");
        this.zza = new zzow(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "signInWithEmailAndPassword";
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
        zzthVar.zzw(this.zza, this.zzc);
    }
}
