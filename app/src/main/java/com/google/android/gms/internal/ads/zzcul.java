package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcul implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzcul(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcud zzcudVar = (zzcud) this.zza.zzb();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        if (((JSONObject) this.zzc.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdiz(zzcudVar, zzfvmVar));
        }
        zzgrc.zzb(singleton);
        return singleton;
    }
}
