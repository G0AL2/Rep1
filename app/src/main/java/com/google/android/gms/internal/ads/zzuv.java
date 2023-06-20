package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzuv extends zzco {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;

    @Deprecated
    public zzuv() {
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    public static /* bridge */ /* synthetic */ SparseArray zzm(zzuv zzuvVar) {
        return zzuvVar.zzf;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzn(zzuv zzuvVar) {
        return zzuvVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzuv zzuvVar) {
        return zzuvVar.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zzq(zzuv zzuvVar) {
        return zzuvVar.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzuv zzuvVar) {
        return zzuvVar.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzuv zzuvVar) {
        return zzuvVar.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzuv zzuvVar) {
        return zzuvVar.zza;
    }

    private final void zzu() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final /* synthetic */ zzco zze(int i10, int i11, boolean z10) {
        super.zze(i10, i11, true);
        return this;
    }

    public final zzuv zzo(int i10, boolean z10) {
        if (this.zzg.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.zzg.put(i10, true);
        } else {
            this.zzg.delete(i10);
        }
        return this;
    }

    public zzuv(Context context) {
        super.zzd(context);
        Point zzA = zzeg.zzA(context);
        zze(zzA.x, zzA.y, true);
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    public /* synthetic */ zzuv(zzut zzutVar, zzuu zzuuVar) {
        super(zzutVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzutVar.zzG;
        this.zzb = zzutVar.zzI;
        this.zzc = zzutVar.zzK;
        this.zzd = zzutVar.zzP;
        this.zze = zzutVar.zzR;
        sparseArray = zzutVar.zzS;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.zzf = sparseArray2;
        sparseBooleanArray = zzutVar.zzT;
        this.zzg = sparseBooleanArray.clone();
    }
}
