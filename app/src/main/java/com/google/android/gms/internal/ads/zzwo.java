package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwo {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzwn) obj).zza - ((zzwn) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzwn) obj).zzc, ((zzwn) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzwn[] zzd = new zzwn[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzwo(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg * 0.5f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            zzwn zzwnVar = (zzwn) this.zzc.get(i11);
            i10 += zzwnVar.zzb;
            if (i10 >= f11) {
                return zzwnVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzwn) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzwn zzwnVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzwn[] zzwnVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzwnVar = zzwnVarArr[i12];
        } else {
            zzwnVar = new zzwn(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzwnVar.zza = i13;
        zzwnVar.zzb = i10;
        zzwnVar.zzc = f10;
        this.zzc.add(zzwnVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzwn zzwnVar2 = (zzwn) this.zzc.get(0);
            int i16 = zzwnVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                this.zzc.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzwn[] zzwnVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzwnVarArr2[i17] = zzwnVar2;
                }
            } else {
                zzwnVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
