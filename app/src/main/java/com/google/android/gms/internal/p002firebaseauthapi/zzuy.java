package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy  reason: invalid package */
/* loaded from: classes2.dex */
final class zzuy extends zztg {
    final /* synthetic */ zzvb zza;
    private final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuy(zzvb zzvbVar, zztg zztgVar, String str) {
        super(zztgVar);
        this.zza = zzvbVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztg
    public final void zzb(String str) {
        Logger logger;
        HashMap hashMap;
        logger = zzvb.zza;
        logger.d("onCodeSent", new Object[0]);
        hashMap = this.zza.zzd;
        zzva zzvaVar = (zzva) hashMap.get(this.zzb);
        if (zzvaVar == null) {
            return;
        }
        for (zztg zztgVar : zzvaVar.zzb) {
            zztgVar.zzb(str);
        }
        zzvaVar.zzg = true;
        zzvaVar.zzd = str;
        if (zzvaVar.zza <= 0) {
            this.zza.zzh(this.zzb);
        } else if (!zzvaVar.zzc) {
            this.zza.zzn(this.zzb);
        } else if (!zzae.zzd(zzvaVar.zze)) {
            zzvb.zze(this.zza, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztg
    public final void zzh(Status status) {
        Logger logger;
        HashMap hashMap;
        logger = zzvb.zza;
        String statusCodeString = CommonStatusCodes.getStatusCodeString(status.getStatusCode());
        String statusMessage = status.getStatusMessage();
        logger.e("SMS verification code request failed: " + statusCodeString + " " + statusMessage, new Object[0]);
        hashMap = this.zza.zzd;
        zzva zzvaVar = (zzva) hashMap.get(this.zzb);
        if (zzvaVar == null) {
            return;
        }
        for (zztg zztgVar : zzvaVar.zzb) {
            zztgVar.zzh(status);
        }
        this.zza.zzj(this.zzb);
    }
}
