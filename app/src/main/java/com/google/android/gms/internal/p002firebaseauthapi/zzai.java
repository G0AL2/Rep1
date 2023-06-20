package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzai  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzai extends zzaj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaj zzajVar, int i10, int i11) {
        this.zzc = zzajVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzw.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj
    public final zzaj zzf(int i10, int i11) {
        zzw.zzc(i10, i11, this.zzb);
        zzaj zzajVar = this.zzc;
        int i12 = this.zza;
        return zzajVar.subList(i10 + i12, i11 + i12);
    }
}
