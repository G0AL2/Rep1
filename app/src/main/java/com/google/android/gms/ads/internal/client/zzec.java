package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzec extends zzbqm {
    final /* synthetic */ zzed zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzec(zzed zzedVar, zzeb zzebVar) {
        this.zza = zzedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        Object obj;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InitializationStatus zzw;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zzd = false;
            this.zza.zze = true;
            arrayList2 = this.zza.zzc;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = this.zza.zzc;
            arrayList3.clear();
        }
        zzw = zzed.zzw(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(zzw);
        }
    }
}
