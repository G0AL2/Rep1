package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtx extends zzbtz {
    private static final zzbvx zza = new zzbvx();

    @Override // com.google.android.gms.internal.ads.zzbua
    public final zzbud zzb(String str) throws RemoteException {
        zzbuz zzbuzVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbtx.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbuz((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbuz((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcfi.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                zzcfi.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzcfi.zze("Reflection failed, retrying using direct instantiation");
            if (AdUnit.GOOGLE_ADAPTER_CLASS.equals(str)) {
                zzbuzVar = new zzbuz(new AdMobAdapter());
            } else {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbuzVar = new zzbuz(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            return zzbuzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final zzbvt zzc(String str) throws RemoteException {
        return new zzbwe((RtbAdapter) Class.forName(str, false, zzbvx.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbtx.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcfi.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbtx.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcfi.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
