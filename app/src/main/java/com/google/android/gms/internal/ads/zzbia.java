package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbia {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbjb.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbjm.zza);
        zzc(arrayList, zzbjm.zzb);
        zzc(arrayList, zzbjm.zzc);
        zzc(arrayList, zzbjm.zzd);
        zzc(arrayList, zzbjm.zze);
        zzc(arrayList, zzbjm.zzu);
        zzc(arrayList, zzbjm.zzf);
        zzc(arrayList, zzbjm.zzm);
        zzc(arrayList, zzbjm.zzn);
        zzc(arrayList, zzbjm.zzo);
        zzc(arrayList, zzbjm.zzp);
        zzc(arrayList, zzbjm.zzq);
        zzc(arrayList, zzbjm.zzr);
        zzc(arrayList, zzbjm.zzs);
        zzc(arrayList, zzbjm.zzt);
        zzc(arrayList, zzbjm.zzg);
        zzc(arrayList, zzbjm.zzh);
        zzc(arrayList, zzbjm.zzi);
        zzc(arrayList, zzbjm.zzj);
        zzc(arrayList, zzbjm.zzk);
        zzc(arrayList, zzbjm.zzl);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbjz.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbjb zzbjbVar) {
        String str = (String) zzbjbVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
