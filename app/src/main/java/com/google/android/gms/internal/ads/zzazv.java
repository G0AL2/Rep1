package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazv {
    public final List zza;
    public final int zzb;

    private zzazv(List list, int i10) {
        this.zza = list;
        this.zzb = i10;
    }

    public static zzazv zza(zzazh zzazhVar) throws zzarw {
        try {
            zzazhVar.zzw(21);
            int zzg = zzazhVar.zzg() & 3;
            int zzg2 = zzazhVar.zzg();
            int zzc = zzazhVar.zzc();
            int i10 = 0;
            for (int i11 = 0; i11 < zzg2; i11++) {
                zzazhVar.zzw(1);
                int zzj = zzazhVar.zzj();
                for (int i12 = 0; i12 < zzj; i12++) {
                    int zzj2 = zzazhVar.zzj();
                    i10 += zzj2 + 4;
                    zzazhVar.zzw(zzj2);
                }
            }
            zzazhVar.zzv(zzc);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < zzg2; i14++) {
                zzazhVar.zzw(1);
                int zzj3 = zzazhVar.zzj();
                for (int i15 = 0; i15 < zzj3; i15++) {
                    int zzj4 = zzazhVar.zzj();
                    System.arraycopy(zzazf.zza, 0, bArr, i13, 4);
                    int i16 = i13 + 4;
                    System.arraycopy(zzazhVar.zza, zzazhVar.zzc(), bArr, i16, zzj4);
                    i13 = i16 + zzj4;
                    zzazhVar.zzw(zzj4);
                }
            }
            return new zzazv(i10 == 0 ? null : Collections.singletonList(bArr), zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zzarw("Error parsing HEVC config", e10);
        }
    }
}
