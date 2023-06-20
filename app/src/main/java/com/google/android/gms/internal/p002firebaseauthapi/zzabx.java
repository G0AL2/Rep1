package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzabx implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzaby zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabx(zzaby zzabyVar) {
        zzzy zzzyVar;
        this.zzb = zzabyVar;
        zzzyVar = zzabyVar.zza;
        this.zza = zzzyVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
