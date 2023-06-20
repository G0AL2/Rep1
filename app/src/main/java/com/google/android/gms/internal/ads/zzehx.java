package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehx implements zzehr {
    private final zzdlu zza;
    private final zzfvm zzb;
    private final zzdpu zzc;
    private final zzfcz zzd;
    private final zzdsk zze;

    public zzehx(zzdlu zzdluVar, zzfvm zzfvmVar, zzdpu zzdpuVar, zzfcz zzfczVar, zzdsk zzdskVar) {
        this.zza = zzdluVar;
        this.zzb = zzfvmVar;
        this.zzc = zzdpuVar;
        this.zzd = zzfczVar;
        this.zze = zzdskVar;
    }

    private final zzfvl zzg(final zzfbx zzfbxVar, final zzfbl zzfblVar, final JSONObject jSONObject) {
        final zzfvl zza = this.zzd.zza();
        final zzfvl zza2 = this.zzc.zza(zzfbxVar, zzfblVar, jSONObject);
        return zzfvc.zzd(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehx.this.zzc(zza2, zza, zzfbxVar, zzfblVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        return zzfvc.zzn(zzfvc.zzn(this.zzd.zza(), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzehx.this.zze(zzfblVar, (zzdse) obj);
            }
        }, this.zzb), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzehx.this.zzf(zzfbxVar, zzfblVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        zzfbq zzfbqVar = zzfblVar.zzt;
        return (zzfbqVar == null || zzfbqVar.zzc == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdnc zzc(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzfbx zzfbxVar, zzfbl zzfblVar, JSONObject jSONObject) throws Exception {
        zzdnh zzdnhVar = (zzdnh) zzfvlVar.get();
        zzdse zzdseVar = (zzdse) zzfvlVar2.get();
        zzdni zzd = this.zza.zzd(new zzcym(zzfbxVar, zzfblVar, null), new zzdnt(zzdnhVar), new zzdmj(jSONObject, zzdseVar));
        zzd.zzj().zzb();
        zzd.zzk().zza(zzdseVar);
        zzd.zzg().zza(zzdnhVar.zzr());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(zzdse zzdseVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfvc.zzi(zzdseVar));
        if (jSONObject.optBoolean("success")) {
            return zzfvc.zzi(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbsp("process json failed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzfbl zzfblVar, final zzdse zzdseVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhg)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfblVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfvc.zzn(zzdseVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeht
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzehx.this.zzd(zzdseVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzf(zzfbx zzfbxVar, zzfbl zzfblVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfvc.zzh(new zzdzl(3));
        }
        if (zzfbxVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfbxVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfbxVar.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfbxVar.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzg(zzfbxVar, zzfblVar, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzfvc.zzh(new zzdzl(3)));
                }
            }
            return zzfvc.zzi(arrayList);
        }
        return zzfvc.zzm(zzg(zzfbxVar, zzfblVar, jSONArray.getJSONObject(0)), new zzfok() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfvc.zzi((zzdnc) obj));
            }
        }, this.zzb);
    }
}
