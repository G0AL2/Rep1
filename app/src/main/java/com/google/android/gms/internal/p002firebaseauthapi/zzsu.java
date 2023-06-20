package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import sb.e0;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu  reason: invalid package */
/* loaded from: classes2.dex */
final class zzsu extends zzuh {
    private final zzpg zza;

    public zzsu(String str, String str2) {
        super(2);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(str2);
        this.zza = new zzpg(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        ((e0) this.zzf).a(this.zzj, zzte.zzN(this.zzd, this.zzk));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzB(this.zza, this.zzc);
    }
}
