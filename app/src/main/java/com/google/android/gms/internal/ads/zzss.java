package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzss extends zzrj {
    private static final zzbb zza;
    private final zzsc[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsf zzf;
    private int zzg;
    private long[][] zzh;
    private zzsr zzi;
    private final zzrl zzj;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("MergingMediaSource");
        zza = zzahVar.zzc();
    }

    public zzss(boolean z10, boolean z11, zzsc... zzscVarArr) {
        zzrl zzrlVar = new zzrl();
        this.zzb = zzscVarArr;
        this.zzj = zzrlVar;
        this.zzd = new ArrayList(Arrays.asList(zzscVarArr));
        this.zzg = -1;
        this.zzc = new zzci[zzscVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfsm.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        zzsq zzsqVar = (zzsq) zzryVar;
        int i10 = 0;
        while (true) {
            zzsc[] zzscVarArr = this.zzb;
            if (i10 >= zzscVarArr.length) {
                return;
            }
            zzscVarArr[i10].zzB(zzsqVar.zzn(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsaVar, zzvv zzvvVar, long j10) {
        int length = this.zzb.length;
        zzry[] zzryVarArr = new zzry[length];
        int zza2 = this.zzc[0].zza(zzsaVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzryVarArr[i10] = this.zzb[i10].zzD(zzsaVar.zzc(this.zzc[i10].zzf(zza2)), zzvvVar, j10 - this.zzh[zza2][i10]);
        }
        return new zzsq(this.zzj, this.zzh[zza2], zzryVarArr, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzn(zzfs zzfsVar) {
        super.zzn(zzfsVar);
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzy(Integer.valueOf(i10), this.zzb[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzrj
    public final /* bridge */ /* synthetic */ zzsa zzv(Object obj, zzsa zzsaVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsaVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzsc
    public final void zzw() throws IOException {
        zzsr zzsrVar = this.zzi;
        if (zzsrVar == null) {
            super.zzw();
            return;
        }
        throw zzsrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzrj
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsc zzscVar, zzci zzciVar) {
        int i10;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i10 = zzciVar.zzb();
            this.zzg = i10;
        } else {
            int zzb = zzciVar.zzb();
            int i11 = this.zzg;
            if (zzb != i11) {
                this.zzi = new zzsr(0);
                return;
            }
            i10 = i11;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i10, this.zzc.length);
        }
        this.zzd.remove(zzscVar);
        this.zzc[((Integer) obj).intValue()] = zzciVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        zzsc[] zzscVarArr = this.zzb;
        return zzscVarArr.length > 0 ? zzscVarArr[0].zzz() : zza;
    }
}
