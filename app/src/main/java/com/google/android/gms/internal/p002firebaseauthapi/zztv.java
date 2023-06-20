package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import ob.e;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv  reason: invalid package */
/* loaded from: classes2.dex */
final class zztv extends zzun implements zzve {
    @VisibleForTesting
    zztw zza;
    private zztp zzb;
    private zztq zzc;
    private zzus zzd;
    private final zztu zze;
    private final e zzf;
    private final String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zztv(e eVar, zztu zztuVar, zzus zzusVar, zztp zztpVar, zztq zztqVar) {
        this.zzf = eVar;
        String b10 = eVar.q().b();
        this.zzg = b10;
        this.zze = (zztu) Preconditions.checkNotNull(zztuVar);
        zzw(null, null, null);
        zzvf.zze(b10, this);
    }

    private final zztw zzv() {
        if (this.zza == null) {
            e eVar = this.zzf;
            this.zza = new zztw(eVar.l(), eVar, this.zze.zzb());
        }
        return this.zza;
    }

    private final void zzw(zzus zzusVar, zztp zztpVar, zztq zztqVar) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String zza = zzvc.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzvf.zzd(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(zza)));
        }
        if (this.zzd == null) {
            this.zzd = new zzus(zza, zzv());
        }
        String zza2 = zzvc.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzvf.zzb(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(zza2)));
        }
        if (this.zzb == null) {
            this.zzb = new zztp(zza2, zzv());
        }
        String zza3 = zzvc.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzvf.zzc(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(zza3)));
        }
        if (this.zzc == null) {
            this.zzc = new zztq(zza3, zzv());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zza(zzvi zzviVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzviVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/createAuthUri", this.zzg), zzviVar, zzumVar, zzvj.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzb(zzvl zzvlVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvlVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/deleteAccount", this.zzg), zzvlVar, zzumVar, Void.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzc(zzvm zzvmVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvmVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/emailLinkSignin", this.zzg), zzvmVar, zzumVar, zzvn.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzd(zzvo zzvoVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvoVar);
        Preconditions.checkNotNull(zzumVar);
        zztq zztqVar = this.zzc;
        zzup.zza(zztqVar.zza("/mfaEnrollment:finalize", this.zzg), zzvoVar, zzumVar, zzvp.class, zztqVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zze(zzvq zzvqVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvqVar);
        Preconditions.checkNotNull(zzumVar);
        zztq zztqVar = this.zzc;
        zzup.zza(zztqVar.zza("/mfaSignIn:finalize", this.zzg), zzvqVar, zzumVar, zzvr.class, zztqVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzf(zzvt zzvtVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvtVar);
        Preconditions.checkNotNull(zzumVar);
        zzus zzusVar = this.zzd;
        zzup.zza(zzusVar.zza("/token", this.zzg), zzvtVar, zzumVar, zzwe.class, zzusVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzg(zzvu zzvuVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzvuVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/getAccountInfo", this.zzg), zzvuVar, zzumVar, zzvv.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzh(zzwb zzwbVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwbVar);
        Preconditions.checkNotNull(zzumVar);
        if (zzwbVar.zzb() != null) {
            zzv().zzc(zzwbVar.zzb().zze());
        }
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/getOobConfirmationCode", this.zzg), zzwbVar, zzumVar, zzwc.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzve
    public final void zzi() {
        zzw(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzj(zzwo zzwoVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwoVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/resetPassword", this.zzg), zzwoVar, zzumVar, zzwp.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzk(zzwr zzwrVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwrVar);
        Preconditions.checkNotNull(zzumVar);
        if (!TextUtils.isEmpty(zzwrVar.zzc())) {
            zzv().zzc(zzwrVar.zzc());
        }
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/sendVerificationCode", this.zzg), zzwrVar, zzumVar, zzwt.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzl(zzwu zzwuVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwuVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/setAccountInfo", this.zzg), zzwuVar, zzumVar, zzwv.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzm(String str, zzum zzumVar) {
        Preconditions.checkNotNull(zzumVar);
        zzv().zzb(str);
        ((zzrc) zzumVar).zza.zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzn(zzww zzwwVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwwVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/signupNewUser", this.zzg), zzwwVar, zzumVar, zzwx.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzo(zzwy zzwyVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzwyVar);
        Preconditions.checkNotNull(zzumVar);
        if (!TextUtils.isEmpty(zzwyVar.zzc())) {
            zzv().zzc(zzwyVar.zzc());
        }
        zztq zztqVar = this.zzc;
        zzup.zza(zztqVar.zza("/mfaEnrollment:start", this.zzg), zzwyVar, zzumVar, zzwz.class, zztqVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzp(zzxa zzxaVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxaVar);
        Preconditions.checkNotNull(zzumVar);
        if (!TextUtils.isEmpty(zzxaVar.zzc())) {
            zzv().zzc(zzxaVar.zzc());
        }
        zztq zztqVar = this.zzc;
        zzup.zza(zztqVar.zza("/mfaSignIn:start", this.zzg), zzxaVar, zzumVar, zzxb.class, zztqVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzq(zzxe zzxeVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxeVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/verifyAssertion", this.zzg), zzxeVar, zzumVar, zzxg.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzr(zzxh zzxhVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxhVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/verifyCustomToken", this.zzg), zzxhVar, zzumVar, zzxi.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzs(zzxk zzxkVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxkVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/verifyPassword", this.zzg), zzxkVar, zzumVar, zzxl.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzt(zzxm zzxmVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxmVar);
        Preconditions.checkNotNull(zzumVar);
        zztp zztpVar = this.zzb;
        zzup.zza(zztpVar.zza("/verifyPhoneNumber", this.zzg), zzxmVar, zzumVar, zzxn.class, zztpVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzun
    public final void zzu(zzxo zzxoVar, zzum zzumVar) {
        Preconditions.checkNotNull(zzxoVar);
        Preconditions.checkNotNull(zzumVar);
        zztq zztqVar = this.zzc;
        zzup.zza(zztqVar.zza("/mfaEnrollment:withdraw", this.zzg), zzxoVar, zzumVar, zzxp.class, zztqVar.zzb);
    }
}
