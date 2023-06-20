package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbv extends zzcba {
    private final String zza;
    private final int zzb;

    public zzcbv(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzcbv(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
