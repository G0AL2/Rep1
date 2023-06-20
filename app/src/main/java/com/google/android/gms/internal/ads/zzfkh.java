package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfkh extends AsyncTask {
    private zzfki zza;
    protected final zzfjz zzd;

    public zzfkh(zzfjz zzfjzVar, byte[] bArr) {
        this.zzd = zzfjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfki zzfkiVar = this.zza;
        if (zzfkiVar != null) {
            zzfkiVar.zza(this);
        }
    }

    public final void zzb(zzfki zzfkiVar) {
        this.zza = zzfkiVar;
    }
}
