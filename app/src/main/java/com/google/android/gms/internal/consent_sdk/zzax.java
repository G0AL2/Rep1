package com.google.android.gms.internal.consent_sdk;

import hb.b;
import hb.e;
import hb.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzax implements f.b, f.a {
    private final f.b zza;
    private final f.a zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzax(f.b bVar, f.a aVar, zzav zzavVar) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    @Override // hb.f.a
    public final void onConsentFormLoadFailure(e eVar) {
        this.zzb.onConsentFormLoadFailure(eVar);
    }

    @Override // hb.f.b
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
