package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import ob.e;
import sb.e0;
import sb.l;
import sb.q;
import sb.x;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzte  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzte extends zzuk {
    public zzte(e eVar) {
        this.zza = new zzth(eVar);
        this.zzb = Executors.newCachedThreadPool();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static zzx zzN(e eVar, zzvx zzvxVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(zzvxVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzvxVar, "firebase"));
        List zzr = zzvxVar.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i10 = 0; i10 < zzr.size(); i10++) {
                arrayList.add(new zzt((zzwk) zzr.get(i10)));
            }
        }
        zzx zzxVar = new zzx(eVar, arrayList);
        zzxVar.P1(new zzz(zzvxVar.zzb(), zzvxVar.zza()));
        zzxVar.O1(zzvxVar.zzt());
        zzxVar.N1(zzvxVar.zzd());
        zzxVar.H1(q.b(zzvxVar.zzq()));
        return zzxVar;
    }

    public final Task zzA(e eVar, String str, String str2, String str3, e0 e0Var) {
        zzsp zzspVar = new zzsp(str, str2, str3);
        zzspVar.zzf(eVar);
        zzspVar.zzd(e0Var);
        return zzP(zzspVar);
    }

    public final Task zzB(e eVar, EmailAuthCredential emailAuthCredential, e0 e0Var) {
        zzsq zzsqVar = new zzsq(emailAuthCredential);
        zzsqVar.zzf(eVar);
        zzsqVar.zzd(e0Var);
        return zzP(zzsqVar);
    }

    public final Task zzC(e eVar, PhoneAuthCredential phoneAuthCredential, String str, e0 e0Var) {
        zzuv.zzc();
        zzsr zzsrVar = new zzsr(phoneAuthCredential, str);
        zzsrVar.zzf(eVar);
        zzsrVar.zzd(e0Var);
        return zzP(zzsrVar);
    }

    public final Task zzD(zzag zzagVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, PhoneAuthProvider.a aVar, Executor executor, Activity activity) {
        zzss zzssVar = new zzss(zzagVar, str, str2, j10, z10, z11, str3, str4, z12);
        zzssVar.zzh(aVar, activity, executor, str);
        return zzP(zzssVar);
    }

    public final Task zzE(zzag zzagVar, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, PhoneAuthProvider.a aVar, Executor executor, Activity activity) {
        zzst zzstVar = new zzst(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzagVar.zzd()), str, j10, z10, z11, str2, str3, z12);
        zzstVar.zzh(aVar, activity, executor, phoneMultiFactorInfo.e());
        return zzP(zzstVar);
    }

    public final Task zzF(e eVar, FirebaseUser firebaseUser, String str, x xVar) {
        zzsu zzsuVar = new zzsu(firebaseUser.zzf(), str);
        zzsuVar.zzf(eVar);
        zzsuVar.zzg(firebaseUser);
        zzsuVar.zzd(xVar);
        zzsuVar.zze(xVar);
        return zzP(zzsuVar);
    }

    public final Task zzG(e eVar, FirebaseUser firebaseUser, String str, x xVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(xVar);
        List zzg = firebaseUser.zzg();
        if ((zzg != null && !zzg.contains(str)) || firebaseUser.p1()) {
            return Tasks.forException(zzti.zza(new Status(17016, str)));
        }
        if (((str.hashCode() == 1216985755 && str.equals("password")) ? (char) 0 : (char) 65535) != 0) {
            zzsw zzswVar = new zzsw(str);
            zzswVar.zzf(eVar);
            zzswVar.zzg(firebaseUser);
            zzswVar.zzd(xVar);
            zzswVar.zze(xVar);
            return zzP(zzswVar);
        }
        zzsv zzsvVar = new zzsv();
        zzsvVar.zzf(eVar);
        zzsvVar.zzg(firebaseUser);
        zzsvVar.zzd(xVar);
        zzsvVar.zze(xVar);
        return zzP(zzsvVar);
    }

    public final Task zzH(e eVar, FirebaseUser firebaseUser, String str, x xVar) {
        zzsx zzsxVar = new zzsx(str);
        zzsxVar.zzf(eVar);
        zzsxVar.zzg(firebaseUser);
        zzsxVar.zzd(xVar);
        zzsxVar.zze(xVar);
        return zzP(zzsxVar);
    }

    public final Task zzI(e eVar, FirebaseUser firebaseUser, String str, x xVar) {
        zzsy zzsyVar = new zzsy(str);
        zzsyVar.zzf(eVar);
        zzsyVar.zzg(firebaseUser);
        zzsyVar.zzd(xVar);
        zzsyVar.zze(xVar);
        return zzP(zzsyVar);
    }

    public final Task zzJ(e eVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, x xVar) {
        zzuv.zzc();
        zzsz zzszVar = new zzsz(phoneAuthCredential);
        zzszVar.zzf(eVar);
        zzszVar.zzg(firebaseUser);
        zzszVar.zzd(xVar);
        zzszVar.zze(xVar);
        return zzP(zzszVar);
    }

    public final Task zzK(e eVar, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, x xVar) {
        zzta zztaVar = new zzta(userProfileChangeRequest);
        zztaVar.zzf(eVar);
        zztaVar.zzg(firebaseUser);
        zztaVar.zzd(xVar);
        zztaVar.zze(xVar);
        return zzP(zztaVar);
    }

    public final Task zzL(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.s1(7);
        return zzP(new zztb(str, str2, actionCodeSettings));
    }

    public final Task zzM(e eVar, String str, String str2) {
        zztc zztcVar = new zztc(str, str2);
        zztcVar.zzf(eVar);
        return zzP(zztcVar);
    }

    public final void zzO(e eVar, zzwr zzwrVar, PhoneAuthProvider.a aVar, Activity activity, Executor executor) {
        zztd zztdVar = new zztd(zzwrVar);
        zztdVar.zzf(eVar);
        zztdVar.zzh(aVar, activity, executor, zzwrVar.zzd());
        zzP(zztdVar);
    }

    public final Task zza(e eVar, String str, String str2) {
        zzrn zzrnVar = new zzrn(str, str2);
        zzrnVar.zzf(eVar);
        return zzP(zzrnVar);
    }

    public final Task zzb(e eVar, String str, String str2) {
        zzro zzroVar = new zzro(str, str2);
        zzroVar.zzf(eVar);
        return zzP(zzroVar);
    }

    public final Task zzc(e eVar, String str, String str2, String str3) {
        zzrp zzrpVar = new zzrp(str, str2, str3);
        zzrpVar.zzf(eVar);
        return zzP(zzrpVar);
    }

    public final Task zzd(e eVar, String str, String str2, String str3, e0 e0Var) {
        zzrq zzrqVar = new zzrq(str, str2, str3);
        zzrqVar.zzf(eVar);
        zzrqVar.zzd(e0Var);
        return zzP(zzrqVar);
    }

    public final Task zze(FirebaseUser firebaseUser, l lVar) {
        zzrr zzrrVar = new zzrr();
        zzrrVar.zzg(firebaseUser);
        zzrrVar.zzd(lVar);
        zzrrVar.zze(lVar);
        return zzP(zzrrVar);
    }

    public final Task zzf(e eVar, String str, String str2) {
        zzrs zzrsVar = new zzrs(str, str2);
        zzrsVar.zzf(eVar);
        return zzP(zzrsVar);
    }

    public final Task zzg(e eVar, a0 a0Var, FirebaseUser firebaseUser, String str, e0 e0Var) {
        zzuv.zzc();
        zzrt zzrtVar = new zzrt(a0Var, firebaseUser.zzf(), str);
        zzrtVar.zzf(eVar);
        zzrtVar.zzd(e0Var);
        return zzP(zzrtVar);
    }

    public final Task zzh(e eVar, FirebaseUser firebaseUser, a0 a0Var, String str, e0 e0Var) {
        zzuv.zzc();
        zzru zzruVar = new zzru(a0Var, str);
        zzruVar.zzf(eVar);
        zzruVar.zzd(e0Var);
        if (firebaseUser != null) {
            zzruVar.zzg(firebaseUser);
        }
        return zzP(zzruVar);
    }

    public final Task zzi(e eVar, FirebaseUser firebaseUser, String str, x xVar) {
        zzrv zzrvVar = new zzrv(str);
        zzrvVar.zzf(eVar);
        zzrvVar.zzg(firebaseUser);
        zzrvVar.zzd(xVar);
        zzrvVar.zze(xVar);
        return zzP(zzrvVar);
    }

    public final Task zzj(e eVar, FirebaseUser firebaseUser, AuthCredential authCredential, x xVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(xVar);
        List zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.j1())) {
            return Tasks.forException(zzti.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzg()) {
                zzrw zzrwVar = new zzrw(emailAuthCredential);
                zzrwVar.zzf(eVar);
                zzrwVar.zzg(firebaseUser);
                zzrwVar.zzd(xVar);
                zzrwVar.zze(xVar);
                return zzP(zzrwVar);
            }
            zzrz zzrzVar = new zzrz(emailAuthCredential);
            zzrzVar.zzf(eVar);
            zzrzVar.zzg(firebaseUser);
            zzrzVar.zzd(xVar);
            zzrzVar.zze(xVar);
            return zzP(zzrzVar);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzuv.zzc();
            zzry zzryVar = new zzry((PhoneAuthCredential) authCredential);
            zzryVar.zzf(eVar);
            zzryVar.zzg(firebaseUser);
            zzryVar.zzd(xVar);
            zzryVar.zze(xVar);
            return zzP(zzryVar);
        } else {
            Preconditions.checkNotNull(eVar);
            Preconditions.checkNotNull(authCredential);
            Preconditions.checkNotNull(firebaseUser);
            Preconditions.checkNotNull(xVar);
            zzrx zzrxVar = new zzrx(authCredential);
            zzrxVar.zzf(eVar);
            zzrxVar.zzg(firebaseUser);
            zzrxVar.zzd(xVar);
            zzrxVar.zze(xVar);
            return zzP(zzrxVar);
        }
    }

    public final Task zzk(e eVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, x xVar) {
        zzsa zzsaVar = new zzsa(authCredential, str);
        zzsaVar.zzf(eVar);
        zzsaVar.zzg(firebaseUser);
        zzsaVar.zzd(xVar);
        zzsaVar.zze(xVar);
        return zzP(zzsaVar);
    }

    public final Task zzl(e eVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, x xVar) {
        zzsb zzsbVar = new zzsb(authCredential, str);
        zzsbVar.zzf(eVar);
        zzsbVar.zzg(firebaseUser);
        zzsbVar.zzd(xVar);
        zzsbVar.zze(xVar);
        return zzP(zzsbVar);
    }

    public final Task zzm(e eVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, x xVar) {
        zzsc zzscVar = new zzsc(emailAuthCredential);
        zzscVar.zzf(eVar);
        zzscVar.zzg(firebaseUser);
        zzscVar.zzd(xVar);
        zzscVar.zze(xVar);
        return zzP(zzscVar);
    }

    public final Task zzn(e eVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, x xVar) {
        zzsd zzsdVar = new zzsd(emailAuthCredential);
        zzsdVar.zzf(eVar);
        zzsdVar.zzg(firebaseUser);
        zzsdVar.zzd(xVar);
        zzsdVar.zze(xVar);
        return zzP(zzsdVar);
    }

    public final Task zzo(e eVar, FirebaseUser firebaseUser, String str, String str2, String str3, x xVar) {
        zzse zzseVar = new zzse(str, str2, str3);
        zzseVar.zzf(eVar);
        zzseVar.zzg(firebaseUser);
        zzseVar.zzd(xVar);
        zzseVar.zze(xVar);
        return zzP(zzseVar);
    }

    public final Task zzp(e eVar, FirebaseUser firebaseUser, String str, String str2, String str3, x xVar) {
        zzsf zzsfVar = new zzsf(str, str2, str3);
        zzsfVar.zzf(eVar);
        zzsfVar.zzg(firebaseUser);
        zzsfVar.zzd(xVar);
        zzsfVar.zze(xVar);
        return zzP(zzsfVar);
    }

    public final Task zzq(e eVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, x xVar) {
        zzuv.zzc();
        zzsg zzsgVar = new zzsg(phoneAuthCredential, str);
        zzsgVar.zzf(eVar);
        zzsgVar.zzg(firebaseUser);
        zzsgVar.zzd(xVar);
        zzsgVar.zze(xVar);
        return zzP(zzsgVar);
    }

    public final Task zzr(e eVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, x xVar) {
        zzuv.zzc();
        zzsh zzshVar = new zzsh(phoneAuthCredential, str);
        zzshVar.zzf(eVar);
        zzshVar.zzg(firebaseUser);
        zzshVar.zzd(xVar);
        zzshVar.zze(xVar);
        return zzP(zzshVar);
    }

    public final Task zzs(e eVar, FirebaseUser firebaseUser, x xVar) {
        zzsi zzsiVar = new zzsi();
        zzsiVar.zzf(eVar);
        zzsiVar.zzg(firebaseUser);
        zzsiVar.zzd(xVar);
        zzsiVar.zze(xVar);
        return zzP(zzsiVar);
    }

    public final Task zzt(e eVar, ActionCodeSettings actionCodeSettings, String str) {
        zzsj zzsjVar = new zzsj(str, actionCodeSettings);
        zzsjVar.zzf(eVar);
        return zzP(zzsjVar);
    }

    public final Task zzu(e eVar, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.s1(1);
        zzsk zzskVar = new zzsk(str, actionCodeSettings, str2, "sendPasswordResetEmail");
        zzskVar.zzf(eVar);
        return zzP(zzskVar);
    }

    public final Task zzv(e eVar, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.s1(6);
        zzsk zzskVar = new zzsk(str, actionCodeSettings, str2, "sendSignInLinkToEmail");
        zzskVar.zzf(eVar);
        return zzP(zzskVar);
    }

    public final Task zzw(String str) {
        return zzP(new zzsl(str));
    }

    public final Task zzx(e eVar, e0 e0Var, String str) {
        zzsm zzsmVar = new zzsm(str);
        zzsmVar.zzf(eVar);
        zzsmVar.zzd(e0Var);
        return zzP(zzsmVar);
    }

    public final Task zzy(e eVar, AuthCredential authCredential, String str, e0 e0Var) {
        zzsn zzsnVar = new zzsn(authCredential, str);
        zzsnVar.zzf(eVar);
        zzsnVar.zzd(e0Var);
        return zzP(zzsnVar);
    }

    public final Task zzz(e eVar, String str, String str2, e0 e0Var) {
        zzso zzsoVar = new zzso(str, str2);
        zzsoVar.zzf(eVar);
        zzsoVar.zzd(e0Var);
        return zzP(zzsoVar);
    }
}
