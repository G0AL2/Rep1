package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaa  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaa implements zzac {
    final /* synthetic */ zzo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzo zzoVar) {
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    public final /* bridge */ /* synthetic */ Iterator zza(zzad zzadVar, CharSequence charSequence) {
        return new zzz(this, zzadVar, charSequence, this.zza.zza(charSequence));
    }
}
