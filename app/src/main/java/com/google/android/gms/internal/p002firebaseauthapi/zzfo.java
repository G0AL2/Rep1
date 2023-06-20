package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfo  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfo extends zzfg {
    public zzfo() {
        super(zzjc.class, new zzfm(zzbe.class));
    }

    public static final void zzh(zzjc zzjcVar) throws GeneralSecurityException {
        zzna.zzc(zzjcVar.zza(), 0);
        if (zzjcVar.zzg().zzd() >= 16) {
            zzn(zzjcVar.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzi(int i10, int i11, int i12, int i13) {
        zzje zzb = zzjf.zzb();
        zzjh zzb2 = zzji.zzb();
        zzb2.zzb(i12);
        zzb2.zza(i11);
        zzb.zzb((zzji) zzb2.zzk());
        zzb.zza(i10);
        return new zzfd((zzjf) zzb.zzk(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzji zzjiVar) throws GeneralSecurityException {
        if (zzjiVar.zza() >= 10) {
            int zzf = zzjiVar.zzf() - 2;
            if (zzf == 1) {
                if (zzjiVar.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzf == 2) {
                if (zzjiVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzf == 3) {
                if (zzjiVar.zza() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzf == 4) {
                if (zzjiVar.zza() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzf == 5) {
                if (zzjiVar.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzfn(this, zzjf.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzjc.zze(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzh((zzjc) zzaaqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
