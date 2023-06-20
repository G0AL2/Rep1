package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.c;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* loaded from: classes2.dex */
final class zbw implements a.InterfaceC0062a {
    final /* synthetic */ SignInHubActivity zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0062a
    public final c onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0062a
    public final /* bridge */ /* synthetic */ void onLoadFinished(c cVar, Object obj) {
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(signInHubActivity));
        this.zba.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0062a
    public final void onLoaderReset(c cVar) {
    }
}
