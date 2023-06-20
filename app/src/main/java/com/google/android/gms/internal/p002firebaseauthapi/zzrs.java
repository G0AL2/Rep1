package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import sb.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrs  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrs extends zzuh {
    private final zzny zza;

    public zzrs(String str, String str2) {
        super(3);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        this.zza = new zzny(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
        List list;
        if (this.zzl.zzb() == null) {
            list = zzaj.zzg();
        } else {
            list = (List) Preconditions.checkNotNull(this.zzl.zzb());
        }
        zzm(new h(list));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzk(this.zza, this.zzc);
    }
}
