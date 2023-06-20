package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg  reason: invalid package */
/* loaded from: classes2.dex */
public class zztg {
    private final zztf zza;
    private final Logger zzb;

    public zztg(zztf zztfVar, Logger logger) {
        this.zza = (zztf) Preconditions.checkNotNull(zztfVar);
        this.zzb = (Logger) Preconditions.checkNotNull(logger);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc(zzvj zzvjVar) {
        try {
            this.zza.zzc(zzvjVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzd();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zze(zzpq zzpqVar) {
        try {
            this.zza.zze(zzpqVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zzf(zzps zzpsVar) {
        try {
            this.zza.zzf(zzpsVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzg(status, phoneAuthCredential);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzh(status);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zzi(zzwe zzweVar, zzvx zzvxVar) {
        try {
            this.zza.zzi(zzweVar, zzvxVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zzj(zzwp zzwpVar) {
        try {
            this.zza.zzj(zzwpVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zzk() {
        try {
            this.zza.zzk();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zzl(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public final void zzn(zzwe zzweVar) {
        try {
            this.zza.zzn(zzweVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zzo(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzo(phoneAuthCredential);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }

    public zztg(zztg zztgVar) {
        this(zztgVar.zza, zztgVar.zzb);
    }
}
