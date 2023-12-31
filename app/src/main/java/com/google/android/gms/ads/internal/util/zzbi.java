package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbi extends zzakg {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcfh zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i10, String str, zzajg zzajgVar, zzajf zzajfVar, byte[] bArr, Map map, zzcfh zzcfhVar) {
        super(i10, str, zzajgVar, zzajfVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final Map zzl() throws zzaij {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzakg, com.google.android.gms.internal.ads.zzajb
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final byte[] zzx() throws zzaij {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
