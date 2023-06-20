package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepn implements zzetg {
    private final zzeyh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepn(zzeyh zzeyhVar) {
        this.zza = zzeyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzeyh zzeyhVar = this.zza;
        zzetf zzetfVar = null;
        if (zzeyhVar != null && zzeyhVar.zza() != null && !zzeyhVar.zza().isEmpty()) {
            zzetfVar = new zzetf() { // from class: com.google.android.gms.internal.ads.zzepm
                @Override // com.google.android.gms.internal.ads.zzetf
                public final void zzf(Object obj) {
                    zzepn.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfvc.zzi(zzetfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
