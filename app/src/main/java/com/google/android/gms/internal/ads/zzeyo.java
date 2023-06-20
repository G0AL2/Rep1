package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyo {
    public static void zza(AtomicReference atomicReference, zzeyn zzeynVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeynVar.zza(obj);
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzcfi.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
