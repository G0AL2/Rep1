package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zze;
import sb.g;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrl  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrl {
    private final zzun zza;

    public zzrl(zzun zzunVar) {
        this.zza = (zzun) Preconditions.checkNotNull(zzunVar);
    }

    private final void zzM(String str, zzum zzumVar) {
        Preconditions.checkNotNull(zzumVar);
        Preconditions.checkNotEmpty(str);
        zzwe zzd = zzwe.zzd(str);
        if (zzd.zzj()) {
            zzumVar.zzb(zzd);
            return;
        }
        this.zza.zzf(new zzvt(zzd.zzf()), new zzrk(this, zzumVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzN(zzvm zzvmVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzvmVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzc(zzvmVar, new zzpx(this, zztgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzO(zzwe zzweVar, String str, String str2, Boolean bool, zze zzeVar, zztg zztgVar, zzul zzulVar) {
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(zzulVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzg(new zzvu(zzweVar.zze()), new zzqa(this, zzulVar, str2, str, bool, zzeVar, zztgVar, zzweVar));
    }

    private final void zzP(zzwb zzwbVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzwbVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzh(zzwbVar, new zzrd(this, zztgVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzrl zzrlVar, zzxg zzxgVar, zztg zztgVar, zzul zzulVar) {
        Status a10;
        if (zzxgVar.zzp()) {
            zze zzc = zzxgVar.zzc();
            String zzd = zzxgVar.zzd();
            String zzk = zzxgVar.zzk();
            if (zzxgVar.zzn()) {
                a10 = new Status(17012);
            } else {
                a10 = g.a(zzxgVar.zze());
            }
            zztgVar.zze(new zzpq(a10, zzc, zzd, zzk));
            return;
        }
        zzrlVar.zzO(new zzwe(zzxgVar.zzj(), zzxgVar.zzf(), Long.valueOf(zzxgVar.zzb()), "Bearer"), zzxgVar.zzi(), zzxgVar.zzh(), Boolean.valueOf(zzxgVar.zzo()), zzxgVar.zzc(), zztgVar, zzulVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzrl zzrlVar, zztg zztgVar, zzwe zzweVar, zzwu zzwuVar, zzul zzulVar) {
        Preconditions.checkNotNull(zztgVar);
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(zzwuVar);
        Preconditions.checkNotNull(zzulVar);
        zzrlVar.zza.zzg(new zzvu(zzweVar.zze()), new zzpy(zzrlVar, zzulVar, zztgVar, zzweVar, zzwuVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzf(zzrl zzrlVar, zztg zztgVar, zzwe zzweVar, zzvx zzvxVar, zzwu zzwuVar, zzul zzulVar) {
        Preconditions.checkNotNull(zztgVar);
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(zzvxVar);
        Preconditions.checkNotNull(zzwuVar);
        Preconditions.checkNotNull(zzulVar);
        zzrlVar.zza.zzl(zzwuVar, new zzpz(zzrlVar, zzwuVar, zzvxVar, zztgVar, zzweVar, zzulVar));
    }

    public final void zzA(zzxe zzxeVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzxeVar);
        Preconditions.checkNotNull(zztgVar);
        zzxeVar.zzd(true);
        this.zza.zzq(zzxeVar, new zzre(this, zztgVar));
    }

    public final void zzB(zzxh zzxhVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzxhVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzr(zzxhVar, new zzqt(this, zztgVar));
    }

    public final void zzC(String str, String str2, String str3, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzs(new zzxk(str, str2, str3), new zzpv(this, zztgVar));
    }

    public final void zzD(EmailAuthCredential emailAuthCredential, zztg zztgVar) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zztgVar);
        if (emailAuthCredential.zzh()) {
            zzM(emailAuthCredential.zzc(), new zzpw(this, emailAuthCredential, zztgVar));
        } else {
            zzN(new zzvm(emailAuthCredential, null), zztgVar);
        }
    }

    public final void zzE(zzxm zzxmVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzxmVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzt(zzxmVar, new zzqh(this, zztgVar));
    }

    public final void zzF(zzwy zzwyVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzwyVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzo(zzwyVar, new zzqs(this, zztgVar));
    }

    public final void zzG(zzxa zzxaVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzxaVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzp(zzxaVar, new zzqx(this, zztgVar));
    }

    public final void zzH(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqr(this, str2, zztgVar));
    }

    public final void zzI(String str, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqn(this, zztgVar));
    }

    public final void zzJ(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        zzM(str2, new zzqp(this, str, zztgVar));
    }

    public final void zzK(String str, UserProfileChangeRequest userProfileChangeRequest, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzrg(this, userProfileChangeRequest, zztgVar));
    }

    public final void zzL(zzwb zzwbVar, zztg zztgVar) {
        zzP(zzwbVar, zztgVar);
    }

    public final void zzg(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzwu zzwuVar = new zzwu();
        zzwuVar.zzf(str);
        zzwuVar.zzi(str2);
        this.zza.zzl(zzwuVar, new zzrj(this, zztgVar));
    }

    public final void zzh(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzrh(this, str2, zztgVar));
    }

    public final void zzi(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzri(this, str2, zztgVar));
    }

    public final void zzj(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzj(new zzwo(str, null, str2), new zzqd(this, zztgVar));
    }

    public final void zzk(String str, String str2, String str3, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzj(new zzwo(str, str2, str3), new zzqf(this, zztgVar));
    }

    public final void zzl(String str, String str2, String str3, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzn(new zzww(str, str2, null, str3), new zzpu(this, zztgVar));
    }

    public final void zzm(String str, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzrb(this, zztgVar));
    }

    public final void zzn(zzvo zzvoVar, String str, zztg zztgVar) {
        Preconditions.checkNotNull(zzvoVar);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqv(this, zzvoVar, zztgVar));
    }

    public final void zzo(zzvq zzvqVar, zztg zztgVar) {
        Preconditions.checkNotNull(zzvqVar);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zze(zzvqVar, new zzqw(this, zztgVar));
    }

    public final void zzp(String str, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzf(new zzvt(str), new zzqe(this, zztgVar));
    }

    public final void zzq(String str, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        this.zza.zza(new zzvi(str, str2), new zzqb(this, zztgVar));
    }

    public final void zzr(String str, String str2, String str3, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zztgVar);
        zzM(str3, new zzqi(this, str, str2, zztgVar));
    }

    public final void zzs(String str, zzxe zzxeVar, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzxeVar);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqm(this, zzxeVar, zztgVar));
    }

    public final void zzt(String str, zzxm zzxmVar, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzxmVar);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqk(this, zzxmVar, zztgVar));
    }

    public final void zzu(String str, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzM(str, new zzqz(this, zztgVar));
    }

    public final void zzv(String str, ActionCodeSettings actionCodeSettings, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzwb zzwbVar = new zzwb(4);
        zzwbVar.zzg(str);
        if (actionCodeSettings != null) {
            zzwbVar.zzd(actionCodeSettings);
        }
        zzP(zzwbVar, zztgVar);
    }

    public final void zzw(String str, ActionCodeSettings actionCodeSettings, String str2, zztg zztgVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zztgVar);
        zzwb zzwbVar = new zzwb(actionCodeSettings.zza());
        zzwbVar.zze(str);
        zzwbVar.zzd(actionCodeSettings);
        zzwbVar.zzf(str2);
        this.zza.zzh(zzwbVar, new zzqc(this, zztgVar));
    }

    public final void zzx(zzwr zzwrVar, zztg zztgVar) {
        Preconditions.checkNotEmpty(zzwrVar.zzd());
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzk(zzwrVar, new zzqg(this, zztgVar));
    }

    public final void zzy(String str, zztg zztgVar) {
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzm(str, new zzrc(this, zztgVar));
    }

    public final void zzz(String str, zztg zztgVar) {
        Preconditions.checkNotNull(zztgVar);
        this.zza.zzn(new zzww(str), new zzrf(this, zztgVar));
    }
}
