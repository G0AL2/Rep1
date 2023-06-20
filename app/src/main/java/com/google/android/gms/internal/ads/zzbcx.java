package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcx extends com.google.android.gms.ads.internal.zzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcx(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzcaj.zza(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbda ? (zzbda) queryLocalInterface : new zzbda(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.ads.zzd.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && ArrayUtils.contains(getAvailableFeatures(), com.google.android.gms.ads.zzd.zza);
    }

    public final zzbda zzq() throws DeadObjectException {
        return (zzbda) super.getService();
    }
}
