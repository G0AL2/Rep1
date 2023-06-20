package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbna extends RemoteCreator {
    @VisibleForTesting
    public zzbna() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbli ? (zzbli) queryLocalInterface : new zzblg(iBinder);
    }

    public final zzblf zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbli) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzblf ? (zzblf) queryLocalInterface : new zzbld(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcfi.zzk("Could not create remote NativeAdViewDelegate.", e10);
            return null;
        }
    }
}
