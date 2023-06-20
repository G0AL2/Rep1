package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfkk extends zzfkg {
    public zzfkk(zzfjz zzfjzVar, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfjzVar, hashSet, jSONObject, j10, null);
    }

    private final void zzc(String str) {
        zzfjc zza = zzfjc.zza();
        if (zza != null) {
            for (zzfir zzfirVar : zza.zzc()) {
                if (((zzfkg) this).zza.contains(zzfirVar.zzh())) {
                    zzfirVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkh
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
