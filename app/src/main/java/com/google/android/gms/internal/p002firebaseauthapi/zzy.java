package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzy implements zzac {
    final /* synthetic */ zzl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzl zzlVar) {
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    public final /* synthetic */ Iterator zza(zzad zzadVar, CharSequence charSequence) {
        return new zzx(this, zzadVar, charSequence);
    }
}
