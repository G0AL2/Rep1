package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnp implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzcfi.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcliVar.zzo().zzc(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e10) {
                    zzcfi.zzk("Malformed timestamp for CSI tick.", e10);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                zzcfi.zzj("No value given for CSI experiment.");
            } else {
                zzcliVar.zzo().zza().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                zzcfi.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcfi.zzj("No name given for CSI extra.");
            } else {
                zzcliVar.zzo().zza().zzd(str6, str7);
            }
        }
    }
}
