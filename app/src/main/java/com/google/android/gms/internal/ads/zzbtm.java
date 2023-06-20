package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtm implements zzfuj {
    private final zzbss zza;
    private final zzbst zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfvl zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtm(zzfvl zzfvlVar, String str, zzbst zzbstVar, zzbss zzbssVar) {
        this.zzd = zzfvlVar;
        this.zzb = zzbstVar;
        this.zza = zzbssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfvl zzb(final Object obj) {
        return zzfvc.zzn(this.zzd, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj2) {
                return zzbtm.this.zzc(obj, (zzbsn) obj2);
            }
        }, zzcfv.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Object obj, zzbsn zzbsnVar) throws Exception {
        zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbol.zzo.zzc(uuid, new zzbtl(this, zzcgaVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsnVar.zzl(this.zzc, jSONObject);
        return zzcgaVar;
    }
}
