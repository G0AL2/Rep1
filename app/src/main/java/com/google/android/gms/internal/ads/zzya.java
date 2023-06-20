package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzya {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzya(List list, int i10, int i11, int i12, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = f10;
        this.zzf = str;
    }

    public static zzya zza(zzdy zzdyVar) throws zzbp {
        String str;
        int i10;
        int i11;
        float f10;
        try {
            zzdyVar.zzG(4);
            int zzk = (zzdyVar.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i12 = 0; i12 < zzk2; i12++) {
                    arrayList.add(zzb(zzdyVar));
                }
                int zzk3 = zzdyVar.zzk();
                for (int i13 = 0; i13 < zzk3; i13++) {
                    arrayList.add(zzb(zzdyVar));
                }
                if (zzk2 > 0) {
                    zzzn zzd = zzzo.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i14 = zzd.zze;
                    int i15 = zzd.zzf;
                    float f11 = zzd.zzg;
                    str = zzcy.zza(zzd.zza, zzd.zzb, zzd.zzc);
                    i10 = i14;
                    i11 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                }
                return new zzya(arrayList, zzk, i10, i11, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbp.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzdy zzdyVar) {
        int zzo = zzdyVar.zzo();
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(zzo);
        return zzcy.zzc(zzdyVar.zzH(), zzc, zzo);
    }
}
