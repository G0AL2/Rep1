package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import gb.p;

/* loaded from: classes3.dex */
final class i extends h<ReviewInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar, p pVar) {
        super(jVar, new cb.e("OnRequestInstallCallback"), pVar);
    }

    @Override // com.google.android.play.core.review.h, cb.d
    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        this.f23125b.e(ReviewInfo.e((PendingIntent) bundle.get("confirmation_intent")));
    }
}
