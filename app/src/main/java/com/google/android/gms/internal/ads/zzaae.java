package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaae {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static zzbl zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] zzag = zzeg.zzag(str, "=");
            if (zzag.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzag[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzabg.zzb(new zzdy(Base64.decode(zzag[1], 0))));
                } catch (RuntimeException e10) {
                    zzdn.zzb("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzacw(zzag[0], zzag[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    public static zzaab zzc(zzdy zzdyVar, boolean z10, boolean z11) throws zzbp {
        if (z10) {
            zzd(3, zzdyVar, false);
        }
        String zzx = zzdyVar.zzx((int) zzdyVar.zzq(), zzfoi.zzc);
        long zzq = zzdyVar.zzq();
        String[] strArr = new String[(int) zzq];
        int length = zzx.length() + 15;
        for (int i10 = 0; i10 < zzq; i10++) {
            String zzx2 = zzdyVar.zzx((int) zzdyVar.zzq(), zzfoi.zzc);
            strArr[i10] = zzx2;
            length = length + 4 + zzx2.length();
        }
        if (z11 && (zzdyVar.zzk() & 1) == 0) {
            throw zzbp.zza("framing bit expected to be set", null);
        }
        return new zzaab(zzx, strArr, length + 1);
    }

    public static boolean zzd(int i10, zzdy zzdyVar, boolean z10) throws zzbp {
        if (zzdyVar.zza() < 7) {
            if (z10) {
                return false;
            }
            int zza = zzdyVar.zza();
            throw zzbp.zza("too short header: " + zza, null);
        } else if (zzdyVar.zzk() != i10) {
            if (z10) {
                return false;
            }
            throw zzbp.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        } else if (zzdyVar.zzk() == 118 && zzdyVar.zzk() == 111 && zzdyVar.zzk() == 114 && zzdyVar.zzk() == 98 && zzdyVar.zzk() == 105 && zzdyVar.zzk() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzbp.zza("expected characters 'vorbis'", null);
        }
    }
}
