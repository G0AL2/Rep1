package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.zzb;
        int size = list.size();
        list2 = zzbdVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbdVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double d10 = this.zzc[i10];
            double d11 = this.zzb[i10];
            int i11 = this.zzd[i10];
            arrayList.add(new zzbc(str, d10, d11, i11 / this.zze, i11));
            i10++;
        }
    }

    public final void zzb(double d10) {
        this.zze++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.zzb[i10]) {
                int[] iArr = this.zzd;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            }
            i10++;
        }
    }
}
