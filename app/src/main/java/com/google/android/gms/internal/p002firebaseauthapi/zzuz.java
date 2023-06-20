package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzuz extends BroadcastReceiver {
    final /* synthetic */ zzvb zza;
    private final String zzb;

    public zzuz(zzvb zzvbVar, String str) {
        this.zza = zzvbVar;
        this.zzb = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        Logger logger;
        Logger logger2;
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                hashMap = this.zza.zzd;
                zzva zzvaVar = (zzva) hashMap.get(this.zzb);
                if (zzvaVar == null) {
                    logger2 = zzvb.zza;
                    logger2.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zzb = zzvb.zzb(str);
                    zzvaVar.zze = zzb;
                    if (zzb == null) {
                        logger = zzvb.zza;
                        logger.e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzae.zzd(zzvaVar.zzd)) {
                        zzvb.zze(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
