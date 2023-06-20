package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzab  reason: invalid package */
/* loaded from: classes2.dex */
abstract class zzab extends zzf {
    final CharSequence zzb;
    final zzl zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzab(zzad zzadVar, CharSequence charSequence) {
        zzl zzlVar;
        zzlVar = zzadVar.zza;
        this.zzc = zzlVar;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i11);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc == i10) {
                int i12 = zzc + 1;
                this.zzd = i12;
                if (i12 > this.zzb.length()) {
                    this.zzd = -1;
                }
            } else {
                if (i10 < zzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i13 = this.zze;
                if (i13 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i10) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i13 - 1;
                }
                return this.zzb.subSequence(i10, zzd).toString();
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
