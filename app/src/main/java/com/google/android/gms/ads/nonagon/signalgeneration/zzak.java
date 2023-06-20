package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzak implements zzfuj {
    private final Executor zza;
    private final zzeaj zzb;

    public zzak(Executor executor, zzeaj zzeajVar) {
        this.zza = executor;
        this.zzb = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final /* bridge */ /* synthetic */ zzfvl zza(Object obj) throws Exception {
        final zzbzv zzbzvVar = (zzbzv) obj;
        return zzfvc.zzn(this.zzb.zzb(zzbzvVar), new zzfuj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj2) {
                zzbzv zzbzvVar2 = zzbzv.this;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzaw.zzb().zzh(zzbzvVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzfvc.zzi(zzamVar);
            }
        }, this.zza);
    }
}
