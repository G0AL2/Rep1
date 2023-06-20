package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgiy extends zzgja {
    final /* synthetic */ zzgji zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgiy(zzgji zzgjiVar) {
        this.zza = zzgjiVar;
        this.zzc = zzgjiVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjc
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
