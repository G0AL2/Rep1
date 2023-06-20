package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzclz implements zzbom {
    final /* synthetic */ zzcmb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclz(zzcmb zzcmbVar) {
        this.zza = zzcmbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        zzcli zzcliVar = (zzcli) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcmb zzcmbVar = this.zza;
                    i10 = zzcmbVar.zzG;
                    if (i10 != parseInt) {
                        zzcmbVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e10) {
                zzcfi.zzk("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
