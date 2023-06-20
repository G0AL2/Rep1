package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.zza;
        if (zzs.zze(zzsVar) == null || str == null) {
            return;
        }
        zzs.zze(zzsVar).loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzv(zzsVar, (zzaoc) zzs.zzu(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e10) {
            e = e10;
            zzcfi.zzk("", e);
        } catch (ExecutionException e11) {
            e = e11;
            zzcfi.zzk("", e);
        } catch (TimeoutException e12) {
            zzcfi.zzk("", e12);
        }
        return this.zza.zzp();
    }
}
