package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahu implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzahq
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzahu.zza;
            return new zzyr[]{new zzahu()};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private zzyu zzb;
    private zzzy zzc;
    private zzahs zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r19, com.google.android.gms.internal.ads.zzzr r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb = zzyuVar;
        this.zzc = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        this.zzd = j10 == 0 ? 0 : 4;
        zzahs zzahsVar = this.zzf;
        if (zzahsVar != null) {
            zzahsVar.zzb(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzahx.zzc(zzysVar);
    }
}
