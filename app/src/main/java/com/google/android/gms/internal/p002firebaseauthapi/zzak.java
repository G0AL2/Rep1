package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzak extends zzaj {
    static final zzaj zza = new zzak(new Object[0], 0);
    final transient Object[] zzb;

    zzak(Object[] objArr, int i10) {
        this.zzb = objArr;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzw.zza(i10, 0, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj, com.google.android.gms.internal.p002firebaseauthapi.zzag
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    final int zzb() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zzc() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] zze() {
        return this.zzb;
    }
}
