package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzux  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzux implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzux(zzvb zzvbVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzvb.zza;
        logger.e("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}
