package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzst  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzst extends zzuh {
    private final zzpe zza;

    public zzst(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        Preconditions.checkNotNull(phoneMultiFactorInfo);
        Preconditions.checkNotEmpty(str);
        this.zza = new zzpe(phoneMultiFactorInfo, str, str2, j10, z10, z11, str3, str4, z12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuh
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final void zzc(TaskCompletionSource taskCompletionSource, zzth zzthVar) {
        this.zzv = new zzug(this, taskCompletionSource);
        zzthVar.zzA(this.zza, this.zzc);
    }
}
