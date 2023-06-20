package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaz {
    private final zzkm zza;

    private zzaz(zzkm zzkmVar) {
        this.zza = zzkmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzaz zza(zzkm zzkmVar) throws GeneralSecurityException {
        zzi(zzkmVar);
        return new zzaz(zzkmVar);
    }

    public static final zzaz zzh(zzfb zzfbVar, zzan zzanVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzix zza = zzfbVar.zza();
        if (zza != null && zza.zzd().zzd() != 0) {
            try {
                zzkm zzf = zzkm.zzf(zzanVar.zza(zza.zzd().zzt(), bArr), zzyy.zza());
                zzi(zzf);
                return new zzaz(zzf);
            } catch (zzzt unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static void zzi(zzkm zzkmVar) throws GeneralSecurityException {
        if (zzkmVar == null || zzkmVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzbr.zza(this.zza).toString();
    }

    public final zzaz zzb() throws GeneralSecurityException {
        if (this.zza != null) {
            zzkj zzc = zzkm.zzc();
            for (zzkl zzklVar : this.zza.zzg()) {
                zzjz zzb = zzklVar.zzb();
                if (zzb.zzh() == 4) {
                    zzjz zzb2 = zzbq.zzb(zzb.zze(), zzb.zzd());
                    zzbq.zzf(zzb2);
                    zzkk zzc2 = zzkl.zzc();
                    zzc2.zzj(zzklVar);
                    zzc2.zza(zzb2);
                    zzc.zzb((zzkl) zzc2.zzk());
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc.zzc(this.zza.zzb());
            return new zzaz((zzkm) zzc.zzk());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzkm zzc() {
        return this.zza;
    }

    public final zzkr zzd() {
        return zzbr.zza(this.zza);
    }

    public final Object zze(Class cls) throws GeneralSecurityException {
        Class zze = zzbq.zze(cls);
        if (zze != null) {
            zzbr.zzb(this.zza);
            zzbi zzb = zzbi.zzb(zze);
            for (zzkl zzklVar : this.zza.zzg()) {
                if (zzklVar.zzh() == 3) {
                    zzbf zza = zzb.zza(zzbq.zzg(zzklVar.zzb(), zze), zzklVar);
                    if (zzklVar.zza() == this.zza.zzb()) {
                        zzb.zze(zza);
                    }
                }
            }
            return zzbq.zzj(zzb, cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final void zzf(zzbb zzbbVar, zzan zzanVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzkm zzkmVar = this.zza;
        byte[] zzb = zzanVar.zzb(zzkmVar.zzr(), bArr);
        try {
            if (zzkm.zzf(zzanVar.zza(zzb, bArr), zzyy.zza()).equals(zzkmVar)) {
                zziw zza = zzix.zza();
                zza.zza(zzyi.zzn(zzb));
                zza.zzb(zzbr.zza(zzkmVar));
                zzbbVar.zzb((zzix) zza.zzk());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzzt unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(com.google.android.gms.internal.p002firebaseauthapi.zzbb r7) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.firebase-auth-api.zzkm r0 = r6.zza
            java.util.List r0 = r0.zzg()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzkl r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzkl) r1
            com.google.android.gms.internal.firebase-auth-api.zzjz r2 = r1.zzb()
            int r2 = r2.zzh()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r2 == r5) goto L37
            com.google.android.gms.internal.firebase-auth-api.zzjz r2 = r1.zzb()
            int r2 = r2.zzh()
            if (r2 == r4) goto L37
            com.google.android.gms.internal.firebase-auth-api.zzjz r2 = r1.zzb()
            int r2 = r2.zzh()
            if (r2 != r3) goto La
        L37:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.google.android.gms.internal.firebase-auth-api.zzjz r2 = r1.zzb()
            int r2 = r2.zzh()
            if (r2 == r5) goto L5e
            if (r2 == r4) goto L5b
            if (r2 == r3) goto L58
            r3 = 5
            if (r2 == r3) goto L55
            r3 = 6
            if (r2 == r3) goto L52
            java.lang.String r2 = "UNRECOGNIZED"
            goto L60
        L52:
            java.lang.String r2 = "REMOTE"
            goto L60
        L55:
            java.lang.String r2 = "ASYMMETRIC_PUBLIC"
            goto L60
        L58:
            java.lang.String r2 = "ASYMMETRIC_PRIVATE"
            goto L60
        L5b:
            java.lang.String r2 = "SYMMETRIC"
            goto L60
        L5e:
            java.lang.String r2 = "UNKNOWN_KEYMATERIAL"
        L60:
            r3 = 0
            r0[r3] = r2
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzjz r1 = r1.zzb()
            java.lang.String r1 = r1.zze()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L78:
            com.google.android.gms.internal.firebase-auth-api.zzkm r0 = r6.zza
            r7.zzc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaz.zzg(com.google.android.gms.internal.firebase-auth-api.zzbb):void");
    }
}
