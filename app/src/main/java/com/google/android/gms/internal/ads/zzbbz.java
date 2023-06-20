package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbz {
    private final zzbbo zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzbbz(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : 64;
        if (i12 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i12;
        }
        this.zza = new zzbbx(i11);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbby(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzbbn) arrayList2.get(i10)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i11) == '\'') {
                                if (sb2.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb2.charAt(i13) == 's' || sb2.charAt(i13) == 'S') && (i12 == sb2.length() || sb2.charAt(i12) == ' ')) {
                                        sb2.insert(i11, ' ');
                                        i11 = i12;
                                        z10 = true;
                                    }
                                }
                                sb2.setCharAt(i11, ' ');
                                z10 = true;
                            }
                            i11++;
                        }
                        String sb3 = z10 ? sb2.toString() : null;
                        if (sb3 != null) {
                            this.zzc = sb3;
                            str = sb3;
                        }
                    }
                    String[] zzb = zzbbs.zzb(str, true);
                    if (zzb.length >= this.zzd) {
                        for (int i14 = 0; i14 < zzb.length; i14++) {
                            String str2 = "";
                            for (int i15 = 0; i15 < this.zzd; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= zzb.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i16]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzbbq zzbbqVar = new zzbbq();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbbqVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e10) {
                zzcfi.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzbbqVar.toString();
    }
}
