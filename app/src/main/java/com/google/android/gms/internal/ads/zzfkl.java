package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfkl extends zzfkg {
    public zzfkl(zzfjz zzfjzVar, HashSet hashSet, JSONObject jSONObject, long j10, byte[] bArr) {
        super(zzfjzVar, hashSet, jSONObject, j10, null);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjt.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkh
    public final void zza(String str) {
        zzfjc zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfjc.zza()) != null) {
            for (zzfir zzfirVar : zza.zzc()) {
                if (((zzfkg) this).zza.contains(zzfirVar.zzh())) {
                    zzfirVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
