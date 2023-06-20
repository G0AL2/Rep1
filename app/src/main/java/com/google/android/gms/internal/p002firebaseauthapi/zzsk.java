package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsk  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzsk extends zzuh {
    private final zzok zza;
    private final String zzw;

    public zzsk(String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        super(4);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        this.zza = new zzok(str, actionCodeSettings, str2);
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzq(this.zza, this.zzc);
    }
}
