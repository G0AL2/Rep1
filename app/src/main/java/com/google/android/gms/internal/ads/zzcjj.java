package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjj implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchrVar = (zzchr) obj;
        zzcme zzs = zzchrVar.zzs();
        if (zzs == null) {
            try {
                zzcme zzcmeVar = new zzcme(zzchrVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchrVar.zzE(zzcmeVar);
                zzs = zzcmeVar;
            } catch (NullPointerException e10) {
                e = e10;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i10 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i10 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcfi.zzm(3)) {
            zzcfi.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i10 + " , aspectRatio : " + str);
        }
        zzs.zzc(parseFloat2, parseFloat, i10, equals, parseFloat3);
    }
}
