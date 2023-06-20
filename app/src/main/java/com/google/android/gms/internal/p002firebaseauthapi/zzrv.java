package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.b;
import sb.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrv extends zzuh {
    private final zznw zza;

    public zzrv(String str) {
        super(1);
        Preconditions.checkNotEmpty(str, "refresh token cannot be null");
        this.zza = new zznw(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzf())) {
            this.zzj.zzi(this.zza.zza());
        }
        ((e0) this.zzf).a(this.zzj, this.zze);
        zzm(b.a(this.zzj.zze()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzj(this.zza, this.zzc);
    }
}
