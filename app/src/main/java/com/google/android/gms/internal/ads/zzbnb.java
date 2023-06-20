package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnb extends RemoteCreator {
    @VisibleForTesting
    public zzbnb() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzblo ? (zzblo) queryLocalInterface : new zzblm(iBinder);
    }

    public final zzbll zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzblo) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbll ? (zzbll) queryLocalInterface : new zzblj(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcfi.zzk("Could not create remote NativeAdViewHolderDelegate.", e10);
            return null;
        }
    }
}
