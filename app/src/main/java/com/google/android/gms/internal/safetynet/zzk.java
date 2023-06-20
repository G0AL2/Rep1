package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzk extends zzz {
    final /* synthetic */ int[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(GoogleApiClient googleApiClient, int[] iArr, int i10, String str, String str2) {
        super(googleApiClient);
        this.zza = iArr;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) throws RemoteException {
        zzaf zzafVar2 = zzafVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.zza) {
            arrayList.add(Integer.valueOf(i10));
        }
        zzafVar2.zzq(this.zze, arrayList, this.zzb, this.zzc, this.zzd);
    }
}
