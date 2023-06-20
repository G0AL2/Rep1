package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            zzaw.zza().zzl(this, new zzbtx()).zze(intent);
        } catch (RemoteException e10) {
            zzcfi.zzg("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
