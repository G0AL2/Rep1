package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenz implements zzetg {
    private final zzetg zza;
    private final zzfcd zzb;
    private final Context zzc;
    private final zzcer zzd;

    public zzenz(zzepq zzepqVar, zzfcd zzfcdVar, Context context, zzcer zzcerVar) {
        this.zza = zzepqVar;
        this.zzb = zzfcdVar;
        this.zzc = context;
        this.zzd = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzm(this.zza.zzb(), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzenz.this.zzc((zzetl) obj);
            }
        }, zzcfv.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeoa zzc(zzetl zzetlVar) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z10 = zzqVar.zzi;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z13 = zzqVar2.zzi;
                if (!z13 && !z11) {
                    str = zzqVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            float f11 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i11 = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i10 = i13;
            f10 = f11;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = zzqVar3.zze;
                    if (i14 == -1) {
                        i14 = f10 != 0.0f ? (int) (zzqVar3.zzf / f10) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = zzqVar3.zzb;
                    if (i15 == -2) {
                        i15 = f10 != 0.0f ? (int) (zzqVar3.zzc / f10) : -2;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzeoa(zzqVar, str, z10, sb2.toString(), f10, i10, i11, str2, this.zzb.zzp);
    }
}
