package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfri extends zzfrj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfrj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfri(zzfrj zzfrjVar, int i10, int i11) {
        this.zzc = zzfrjVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfou.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrj, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfrj
    public final zzfrj zzh(int i10, int i11) {
        zzfou.zzg(i10, i11, this.zzb);
        zzfrj zzfrjVar = this.zzc;
        int i12 = this.zza;
        return zzfrjVar.subList(i10 + i12, i11 + i12);
    }
}
