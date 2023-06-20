package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import sb.g;
import sb.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzue implements zztf {
    final /* synthetic */ zzuh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzue(zzuh zzuhVar) {
        this.zza = zzuhVar;
    }

    private final void zzp(zzuf zzufVar) {
        this.zza.zzi.execute(new zzud(this, zzufVar));
    }

    private final void zzq(Status status, AuthCredential authCredential, String str, String str2) {
        zzuh.zzk(this.zza, status);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzp = authCredential;
        zzuhVar.zzq = str;
        zzuhVar.zzr = str2;
        m mVar = zzuhVar.zzg;
        if (mVar != null) {
            mVar.zzb(status);
        }
        this.zza.zzl(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zza(String str) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzo = str;
        zzuhVar.zza = true;
        zzp(new zzub(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzb(String str) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        this.zza.zzo = str;
        zzp(new zztz(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzc(zzvj zzvjVar) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 3;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzl = zzvjVar;
        zzuh.zzj(zzuhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzd() throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 5;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zze(zzpq zzpqVar) {
        zzq(zzpqVar.zza(), zzpqVar.zzb(), zzpqVar.zzc(), zzpqVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzf(zzps zzpsVar) {
        zzuh zzuhVar = this.zza;
        zzuhVar.zzs = zzpsVar;
        zzuhVar.zzl(g.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 2;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzq(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzh(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzuh zzuhVar = this.zza;
        if (zzuhVar.zzb == 8) {
            zzuhVar.zza = true;
            zzp(new zzuc(this, status));
            return;
        }
        zzuh.zzk(zzuhVar, status);
        this.zza.zzl(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzi(zzwe zzweVar, zzvx zzvxVar) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 2;
        Preconditions.checkState(z10, "Unexpected response type: " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzj = zzweVar;
        zzuhVar.zzk = zzvxVar;
        zzuh.zzj(zzuhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzj(zzwp zzwpVar) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 4;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzm = zzwpVar;
        zzuh.zzj(zzuhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzk() throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 6;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzl(String str) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 7;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzn = str;
        zzuh.zzj(zzuhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzm() throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 9;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        zzuh.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzn(zzwe zzweVar) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 1;
        Preconditions.checkState(z10, "Unexpected response type: " + i10);
        zzuh zzuhVar = this.zza;
        zzuhVar.zzj = zzweVar;
        zzuh.zzj(zzuhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztf
    public final void zzo(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        Preconditions.checkState(z10, "Unexpected response type " + i10);
        this.zza.zza = true;
        zzp(new zzua(this, phoneAuthCredential));
    }
}
