package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyw {
    private final zzdyj zza;
    private final zzdtz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyw(zzdyj zzdyjVar, zzdtz zzdtzVar) {
        this.zza = zzdyjVar;
        this.zzb = zzdtzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbqg zzbqgVar = (zzbqg) it.next();
                List list2 = this.zzd;
                String str = zzbqgVar.zza;
                String zzc = this.zzb.zzc(str);
                boolean z10 = zzbqgVar.zzb;
                list2.add(new zzdyv(str, zzc, z10 ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdyv zzdyvVar : this.zzd) {
                jSONArray.put(zzdyvVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdyu(this));
    }
}
