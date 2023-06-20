package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmw {
    @VisibleForTesting
    final zzfmz zza;
    @VisibleForTesting
    final boolean zzb;

    private zzfmw(zzfmz zzfmzVar) {
        this.zza = zzfmzVar;
        this.zzb = zzfmzVar != null;
    }

    public static zzfmw zzb(Context context, String str, String str2) {
        zzfmz zzfmxVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfmxVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfmxVar = queryLocalInterface instanceof zzfmz ? (zzfmz) queryLocalInterface : new zzfmx(instantiate);
                    }
                    zzfmxVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfmw(zzfmxVar);
                } catch (RemoteException | zzfly | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfmw(new zzfna());
                }
            } catch (Exception e10) {
                throw new zzfly(e10);
            }
        } catch (Exception e11) {
            throw new zzfly(e11);
        }
    }

    public static zzfmw zzc() {
        zzfna zzfnaVar = new zzfna();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfmw(zzfnaVar);
    }

    public final zzfmv zza(byte[] bArr) {
        return new zzfmv(this, bArr, null);
    }
}
