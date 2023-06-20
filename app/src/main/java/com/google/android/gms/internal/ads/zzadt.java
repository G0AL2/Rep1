package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzadt extends zzadv {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzadt(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final String toString() {
        String zzf = zzadv.zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzadt zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzadt zzadtVar = (zzadt) this.zzc.get(i11);
            if (zzadtVar.zzd == i10) {
                return zzadtVar;
            }
        }
        return null;
    }

    public final zzadu zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzadu zzaduVar = (zzadu) this.zzb.get(i11);
            if (zzaduVar.zzd == i10) {
                return zzaduVar;
            }
        }
        return null;
    }

    public final void zzc(zzadt zzadtVar) {
        this.zzc.add(zzadtVar);
    }

    public final void zzd(zzadu zzaduVar) {
        this.zzb.add(zzaduVar);
    }
}
