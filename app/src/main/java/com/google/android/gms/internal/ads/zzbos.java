package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbos implements zzbom {
    private final Context zza;

    public zzbos(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        char c10;
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                com.google.android.gms.ads.internal.zzt.zzn().zzm(this.zza, str2);
            } else if (c10 == 1) {
                com.google.android.gms.ads.internal.zzt.zzn().zzn(this.zza, str2);
            } else if (c10 != 2) {
                zzcfi.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzt.zzn().zzk(this.zza, str2);
            }
        }
    }
}
