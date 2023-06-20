package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhs {
    private final Collection zza = new ArrayList();
    private final Collection zzb = new ArrayList();
    private final Collection zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbhr zzbhrVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbia.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbhr zzbhrVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbia.zzb());
        return zza;
    }

    public final void zzc(zzbhr zzbhrVar) {
        this.zzb.add(zzbhrVar);
    }

    public final void zzd(zzbhr zzbhrVar) {
        this.zza.add(zzbhrVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbhr zzbhrVar : this.zza) {
            if (zzbhrVar.zze() == 1) {
                zzbhrVar.zzd(editor, zzbhrVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcfi.zzg("Flag Json is null.");
        }
    }
}
