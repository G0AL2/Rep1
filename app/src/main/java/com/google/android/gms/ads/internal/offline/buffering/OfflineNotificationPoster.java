package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.k;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbxl zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtx());
    }

    @Override // androidx.work.Worker
    public final k.a doWork() {
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), getInputData().j("uri"), getInputData().j("gws_query_id"));
            return k.a.c();
        } catch (RemoteException unused) {
            return k.a.a();
        }
    }
}
