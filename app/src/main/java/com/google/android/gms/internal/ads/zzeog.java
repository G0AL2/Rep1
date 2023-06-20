package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeog implements zzetg {
    private final zzfvm zza;
    private final zzduc zzb;
    private final zzdyj zzc;
    private final zzeoj zzd;

    public zzeog(zzfvm zzfvmVar, zzduc zzducVar, zzdyj zzdyjVar, zzeoj zzeojVar) {
        this.zza = zzfvmVar;
        this.zzb = zzducVar;
        this.zzc = zzdyjVar;
        this.zzd = zzeojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (!zzfpi.zzd((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbk)) && !this.zzd.zzb() && this.zzc.zzt()) {
            this.zzd.zza(true);
            return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeof
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeog.this.zzc();
                }
            });
        }
        return zzfvc.zzi(new zzeoi(new Bundle(), null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeoi zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbk)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfcy zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzA();
                Bundle bundle2 = new Bundle();
                try {
                    zzbwg zzf = zzc.zzf();
                    if (zzf != null) {
                        bundle2.putString("sdk_version", zzf.toString());
                    }
                } catch (zzfci unused) {
                }
                try {
                    zzbwg zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfci unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfci unused3) {
            }
        }
        return new zzeoi(bundle, null);
    }
}
