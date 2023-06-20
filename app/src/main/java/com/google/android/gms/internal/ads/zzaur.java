package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaur extends zzaut {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaur(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final String toString() {
        String zzg = zzaut.zzg(this.zzaR);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzg + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzaur zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzaur zzaurVar = (zzaur) this.zzc.get(i11);
            if (zzaurVar.zzaR == i10) {
                return zzaurVar;
            }
        }
        return null;
    }

    public final zzaus zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzaus zzausVar = (zzaus) this.zzb.get(i11);
            if (zzausVar.zzaR == i10) {
                return zzausVar;
            }
        }
        return null;
    }

    public final void zzc(zzaur zzaurVar) {
        this.zzc.add(zzaurVar);
    }

    public final void zzd(zzaus zzausVar) {
        this.zzb.add(zzausVar);
    }
}
