package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzecv implements zzffi {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhh zzc;
    private final zzfhs zzd;

    public zzecv(String str, zzfhs zzfhsVar, zzfhh zzfhhVar) {
        this.zzb = str;
        this.zzd = zzfhsVar;
        this.zzc = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffi
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbzy zzbzyVar;
        zzbzy zzbzyVar2;
        zzbzy zzbzyVar3;
        zzbzy zzbzyVar4;
        zzbzy zzbzyVar5;
        zzbzy zzbzyVar6;
        zzbzy zzbzyVar7;
        JSONObject jSONObject2;
        String str;
        zzecu zzecuVar = (zzecu) obj;
        jSONObject = zzecuVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbzyVar = zzecuVar.zzb;
        if (zzbzyVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbzyVar2 = zzecuVar.zzb;
            String str2 = "";
            if (zzbzyVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            zzbzyVar3 = zzecuVar.zzb;
            if (zzbzyVar3.zzi()) {
                jSONObject2 = zzecuVar.zza;
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    }
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
                }
            }
            zzbzyVar4 = zzecuVar.zzb;
            if (zzbzyVar4 != null) {
                zzbzyVar6 = zzecuVar.zzb;
                if (!TextUtils.isEmpty(zzbzyVar6.zzd())) {
                    zzbzyVar7 = zzecuVar.zzb;
                    str2 = zzbzyVar7.zzd();
                }
            }
            zzfhs zzfhsVar = this.zzd;
            zzfhh zzfhhVar = this.zzc;
            zzfhhVar.zze(true);
            zzfhsVar.zza(zzfhhVar);
            zzbzyVar5 = zzecuVar.zzb;
            return new zzecq(zzbzyVar5.zze(), optInt, hashMap, str2.getBytes(zzfoi.zzc), "");
        }
        zzfhs zzfhsVar2 = this.zzd;
        zzfhh zzfhhVar2 = this.zzc;
        zzfhhVar2.zze(false);
        zzfhsVar2.zza(zzfhhVar2);
        if (zzbzyVar.zza() == 1) {
            if (zzbzyVar.zzf() != null) {
                zzcfi.zzg(TextUtils.join(", ", zzbzyVar.zzf()));
            }
            throw new zzdzl(2, "Error building request URL.");
        }
        throw new zzdzl(1);
    }
}
