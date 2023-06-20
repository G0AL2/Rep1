package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxz  reason: invalid package */
/* loaded from: classes2.dex */
final class zzxz extends zzyb {
    final /* synthetic */ zzyi zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxz(zzyi zzyiVar) {
        this.zza = zzyiVar;
        this.zzc = zzyiVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyd
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
