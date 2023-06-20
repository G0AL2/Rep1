package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjr extends zzgc {
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzci[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjr(Collection collection, zztt zzttVar, byte[] bArr) {
        super(false, zzttVar, null);
        int i10 = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzci[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap();
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            zzjg zzjgVar = (zzjg) it.next();
            this.zzg[i12] = zzjgVar.zza();
            this.zzf[i12] = i10;
            this.zze[i12] = i11;
            i10 += this.zzg[i12].zzc();
            i11 += this.zzg[i12].zzb();
            this.zzh[i12] = zzjgVar.zzb();
            this.zzi.put(this.zzh[i12], Integer.valueOf(i12));
            i12++;
        }
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final int zzq(int i10) {
        return zzeg.zzc(this.zze, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final int zzr(int i10) {
        return zzeg.zzc(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final int zzs(int i10) {
        return this.zze[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final int zzt(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final zzci zzu(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    protected final Object zzv(int i10) {
        return this.zzh[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzw() {
        return Arrays.asList(this.zzg);
    }
}
