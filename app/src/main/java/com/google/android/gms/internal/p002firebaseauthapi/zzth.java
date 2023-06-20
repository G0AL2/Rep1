package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import ob.e;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzth {
    private static final Logger zza = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzrl zzb;
    private final zzvb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzth(e eVar) {
        Preconditions.checkNotNull(eVar);
        Context l10 = eVar.l();
        Preconditions.checkNotNull(l10);
        this.zzb = new zzrl(new zztv(eVar, zztu.zza(), null, null, null));
        this.zzc = new zzvb(l10);
    }

    private static boolean zzG(long j10, boolean z10) {
        if (j10 <= 0 || !z10) {
            zza.w("App hash will not be appended to the request.", new Object[0]);
            return false;
        }
        return true;
    }

    public final void zzA(zzpe zzpeVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpeVar);
        Preconditions.checkNotNull(zztfVar);
        String phoneNumber = zzpeVar.zzb().getPhoneNumber();
        zztg zztgVar = new zztg(zztfVar, zza);
        if (this.zzc.zzl(phoneNumber)) {
            if (zzpeVar.zzg()) {
                this.zzc.zzj(phoneNumber);
            } else {
                this.zzc.zzi(zztgVar, phoneNumber);
                return;
            }
        }
        long zza2 = zzpeVar.zza();
        boolean zzh = zzpeVar.zzh();
        zzxa zzb = zzxa.zzb(zzpeVar.zzd(), zzpeVar.zzb().e(), zzpeVar.zzb().getPhoneNumber(), zzpeVar.zzc(), zzpeVar.zze(), zzpeVar.zzf());
        if (zzG(zza2, zzh)) {
            zzb.zzd(new zzvg(this.zzc.zzc()));
        }
        this.zzc.zzk(phoneNumber, zztgVar, zza2, zzh);
        this.zzb.zzG(zzb, new zzuy(this.zzc, zztgVar, phoneNumber));
    }

    public final void zzB(zzpg zzpgVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpgVar);
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzH(zzpgVar.zza(), zzpgVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzC(zzpi zzpiVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpiVar);
        Preconditions.checkNotEmpty(zzpiVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzI(zzpiVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzD(zzpk zzpkVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpkVar);
        Preconditions.checkNotEmpty(zzpkVar.zzb());
        Preconditions.checkNotEmpty(zzpkVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzJ(zzpkVar.zzb(), zzpkVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzE(zzpm zzpmVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpmVar);
        Preconditions.checkNotEmpty(zzpmVar.zzb());
        Preconditions.checkNotNull(zzpmVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzK(zzpmVar.zzb(), zzpmVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzF(zzpo zzpoVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpoVar);
        this.zzb.zzL(zzwb.zzc(zzpoVar.zza(), zzpoVar.zzb(), zzpoVar.zzc()), new zztg(zztfVar, zza));
    }

    public final void zza(zzne zzneVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzneVar);
        Preconditions.checkNotEmpty(zzneVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzg(zzneVar.zza(), zzneVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzb(zzng zzngVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzngVar);
        Preconditions.checkNotEmpty(zzngVar.zza());
        Preconditions.checkNotEmpty(zzngVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzh(zzngVar.zza(), zzngVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzc(zzni zzniVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzniVar);
        Preconditions.checkNotEmpty(zzniVar.zza());
        Preconditions.checkNotEmpty(zzniVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzi(zzniVar.zza(), zzniVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzd(zznk zznkVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznkVar);
        Preconditions.checkNotEmpty(zznkVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzj(zznkVar.zza(), zznkVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zze(zznm zznmVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznmVar);
        Preconditions.checkNotEmpty(zznmVar.zza());
        Preconditions.checkNotEmpty(zznmVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzk(zznmVar.zza(), zznmVar.zzb(), zznmVar.zzc(), new zztg(zztfVar, zza));
    }

    public final void zzf(zzno zznoVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(zznoVar.zza());
        Preconditions.checkNotEmpty(zznoVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzl(zznoVar.zza(), zznoVar.zzb(), zznoVar.zzc(), new zztg(zztfVar, zza));
    }

    public final void zzg(zznq zznqVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznqVar);
        Preconditions.checkNotEmpty(zznqVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzm(zznqVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzh(zzns zznsVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznsVar);
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzn(zzvo.zzb(zznsVar.zzb(), (String) Preconditions.checkNotNull(zznsVar.zza().zzg()), (String) Preconditions.checkNotNull(zznsVar.zza().l1()), zznsVar.zzc()), zznsVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzi(zznu zznuVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznuVar);
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzo(zzvq.zzb(zznuVar.zzb(), (String) Preconditions.checkNotNull(zznuVar.zza().zzg()), (String) Preconditions.checkNotNull(zznuVar.zza().l1())), new zztg(zztfVar, zza));
    }

    public final void zzj(zznw zznwVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznwVar);
        Preconditions.checkNotNull(zztfVar);
        Preconditions.checkNotEmpty(zznwVar.zza());
        this.zzb.zzp(zznwVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzk(zzny zznyVar, zztf zztfVar) {
        Preconditions.checkNotNull(zznyVar);
        Preconditions.checkNotEmpty(zznyVar.zza());
        this.zzb.zzq(zznyVar.zza(), zznyVar.zzb(), new zztg(zztfVar, zza));
    }

    public final void zzl(zzoa zzoaVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzoaVar);
        Preconditions.checkNotEmpty(zzoaVar.zzb());
        Preconditions.checkNotEmpty(zzoaVar.zzc());
        Preconditions.checkNotEmpty(zzoaVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzr(zzoaVar.zzb(), zzoaVar.zzc(), zzoaVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzm(zzoc zzocVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzocVar);
        Preconditions.checkNotEmpty(zzocVar.zzb());
        Preconditions.checkNotNull(zzocVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzs(zzocVar.zzb(), zzocVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzn(zzoe zzoeVar, zztf zztfVar) {
        Preconditions.checkNotNull(zztfVar);
        Preconditions.checkNotNull(zzoeVar);
        this.zzb.zzt(Preconditions.checkNotEmpty(zzoeVar.zzb()), zzur.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzoeVar.zza())), new zztg(zztfVar, zza));
    }

    public final void zzo(zzog zzogVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzogVar);
        Preconditions.checkNotEmpty(zzogVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzu(zzogVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzp(zzoi zzoiVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzoiVar);
        Preconditions.checkNotEmpty(zzoiVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzv(zzoiVar.zzb(), zzoiVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzq(zzok zzokVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzokVar);
        Preconditions.checkNotEmpty(zzokVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzw(zzokVar.zzb(), zzokVar.zza(), zzokVar.zzc(), new zztg(zztfVar, zza));
    }

    public final void zzr(zzom zzomVar, zztf zztfVar) {
        Preconditions.checkNotNull(zztfVar);
        Preconditions.checkNotNull(zzomVar);
        zzwr zzwrVar = (zzwr) Preconditions.checkNotNull(zzomVar.zza());
        String zzd = zzwrVar.zzd();
        zztg zztgVar = new zztg(zztfVar, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzwrVar.zzf()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zztgVar, zzd);
                return;
            }
        }
        long zzb = zzwrVar.zzb();
        boolean zzg = zzwrVar.zzg();
        if (zzG(zzb, zzg)) {
            zzwrVar.zze(new zzvg(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zztgVar, zzb, zzg);
        this.zzb.zzx(zzwrVar, new zzuy(this.zzc, zztgVar, zzd));
    }

    public final void zzs(zzoo zzooVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzooVar);
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzy(zzooVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzt(zzoq zzoqVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzoqVar);
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzz(zzoqVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzu(zzos zzosVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzosVar);
        Preconditions.checkNotNull(zzosVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzA(zzosVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzv(zzou zzouVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzouVar);
        Preconditions.checkNotEmpty(zzouVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzB(new zzxh(zzouVar.zzb(), zzouVar.zza()), new zztg(zztfVar, zza));
    }

    public final void zzw(zzow zzowVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzowVar);
        Preconditions.checkNotEmpty(zzowVar.zza());
        Preconditions.checkNotEmpty(zzowVar.zzb());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzC(zzowVar.zza(), zzowVar.zzb(), zzowVar.zzc(), new zztg(zztfVar, zza));
    }

    public final void zzx(zzoy zzoyVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzoyVar);
        Preconditions.checkNotNull(zzoyVar.zza());
        Preconditions.checkNotNull(zztfVar);
        this.zzb.zzD(zzoyVar.zza(), new zztg(zztfVar, zza));
    }

    public final void zzy(zzpa zzpaVar, zztf zztfVar) {
        Preconditions.checkNotNull(zztfVar);
        Preconditions.checkNotNull(zzpaVar);
        this.zzb.zzE(zzur.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzpaVar.zza())), new zztg(zztfVar, zza));
    }

    public final void zzz(zzpc zzpcVar, zztf zztfVar) {
        Preconditions.checkNotNull(zzpcVar);
        Preconditions.checkNotNull(zztfVar);
        String zzd = zzpcVar.zzd();
        zztg zztgVar = new zztg(zztfVar, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzpcVar.zzg()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zztgVar, zzd);
                return;
            }
        }
        long zza2 = zzpcVar.zza();
        boolean zzh = zzpcVar.zzh();
        zzwy zzb = zzwy.zzb(zzpcVar.zzb(), zzpcVar.zzd(), zzpcVar.zzc(), zzpcVar.zze(), zzpcVar.zzf());
        if (zzG(zza2, zzh)) {
            zzb.zzd(new zzvg(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zztgVar, zza2, zzh);
        this.zzb.zzF(zzb, new zzuy(this.zzc, zztgVar, zzd));
    }
}
