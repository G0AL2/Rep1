package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzug  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzug {
    private final zzuh zza;
    private final TaskCompletionSource zzb;

    public zzug(zzuh zzuhVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzuhVar;
        this.zzb = taskCompletionSource;
    }

    public final void zza(Object obj, Status status) {
        Preconditions.checkNotNull(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(obj);
            return;
        }
        zzuh zzuhVar = this.zza;
        if (zzuhVar.zzs != null) {
            TaskCompletionSource taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzuhVar.zzd);
            zzuh zzuhVar2 = this.zza;
            taskCompletionSource.setException(zzti.zzc(firebaseAuth, zzuhVar2.zzs, ("reauthenticateWithCredential".equals(zzuhVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zze : null));
            return;
        }
        AuthCredential authCredential = zzuhVar.zzp;
        if (authCredential != null) {
            this.zzb.setException(zzti.zzb(status, authCredential, zzuhVar.zzq, zzuhVar.zzr));
        } else {
            this.zzb.setException(zzti.zza(status));
        }
    }
}
