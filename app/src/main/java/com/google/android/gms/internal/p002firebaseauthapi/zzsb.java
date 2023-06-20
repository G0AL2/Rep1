package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import sb.e0;
import sb.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzsb extends zzuh {
    private final zzos zza;

    public zzsb(AuthCredential authCredential, String str) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        zzxe a10 = f0.a(authCredential, str);
        a10.zzb(false);
        this.zza = new zzos(a10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuj
    public final String zza() {
        return "reauthenticateWithCredentialWithData";
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
        zzthVar.zzu(this.zza, this.zzc);
    }
}
