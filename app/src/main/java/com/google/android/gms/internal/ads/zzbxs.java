package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxs extends RemoteCreator {
    public zzbxs() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbxy ? (zzbxy) queryLocalInterface : new zzbxw(iBinder);
    }

    public final zzbxv zza(Activity activity) {
        try {
            IBinder zze = ((zzbxy) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbxv ? (zzbxv) queryLocalInterface : new zzbxt(zze);
        } catch (RemoteException e10) {
            zzcfi.zzk("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            zzcfi.zzk("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
