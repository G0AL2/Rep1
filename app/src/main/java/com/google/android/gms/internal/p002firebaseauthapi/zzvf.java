package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.collection.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import ob.e;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvf {
    private static final Map zza = new a();
    private static final Map zzb = new a();

    public static String zza(String str) {
        zzvd zzvdVar;
        Map map = zza;
        synchronized (map) {
            zzvdVar = (zzvd) map.get(str);
        }
        if (zzvdVar != null) {
            return zzh(zzvdVar.zzb(), zzvdVar.zza(), zzvdVar.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzvd zzvdVar;
        Map map = zza;
        synchronized (map) {
            zzvdVar = (zzvd) map.get(str);
        }
        return (zzvdVar != null ? "".concat(zzh(zzvdVar.zzb(), zzvdVar.zza(), zzvdVar.zzb().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzvd zzvdVar;
        Map map = zza;
        synchronized (map) {
            zzvdVar = (zzvd) map.get(str);
        }
        return (zzvdVar != null ? "".concat(zzh(zzvdVar.zzb(), zzvdVar.zza(), zzvdVar.zzb().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    public static String zzd(String str) {
        zzvd zzvdVar;
        Map map = zza;
        synchronized (map) {
            zzvdVar = (zzvd) map.get(str);
        }
        return (zzvdVar != null ? "".concat(zzh(zzvdVar.zzb(), zzvdVar.zza(), zzvdVar.zzb().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzve zzveVar) {
        Map map = zzb;
        synchronized (map) {
            map.put(str, new WeakReference(zzveVar));
        }
    }

    public static void zzf(e eVar, String str, int i10) {
        String b10 = eVar.q().b();
        Map map = zza;
        synchronized (map) {
            map.put(b10, new zzvd(str, i10));
        }
        Map map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(b10)) {
                zzve zzveVar = (zzve) ((WeakReference) map2.get(b10)).get();
                if (zzveVar != null) {
                    zzveVar.zzi();
                } else {
                    map.remove(b10);
                }
            }
        }
    }

    public static boolean zzg(e eVar) {
        return zza.containsKey(eVar.q().b());
    }

    private static String zzh(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }
}
