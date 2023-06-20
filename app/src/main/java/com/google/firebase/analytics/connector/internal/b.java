package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzit;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import rb.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f23172a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    private static final List f23173b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final List f23174c = Arrays.asList("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final List f23175d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final List f23176e = Arrays.asList((String[]) ArrayUtils.concat(zzhh.zza, zzhh.zzb));

    /* renamed from: f  reason: collision with root package name */
    private static final List f23177f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f36544a;
        if (str != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        }
        String str2 = cVar.f36545b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f36546c;
        if (obj != null) {
            zzhe.zzb(bundle, obj);
        }
        String str3 = cVar.f36547d;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f36548e);
        String str4 = cVar.f36549f;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str4);
        }
        Bundle bundle2 = cVar.f36550g;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str5 = cVar.f36551h;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str5);
        }
        Bundle bundle3 = cVar.f36552i;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f36553j);
        String str6 = cVar.f36554k;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str6);
        }
        Bundle bundle4 = cVar.f36555l;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f36556m);
        bundle.putBoolean("active", cVar.f36557n);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f36558o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        a.c cVar = new a.c();
        cVar.f36544a = (String) Preconditions.checkNotNull((String) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
        cVar.f36545b = (String) Preconditions.checkNotNull((String) zzhe.zza(bundle, "name", String.class, null));
        cVar.f36546c = zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        cVar.f36547d = (String) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        cVar.f36548e = ((Long) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        cVar.f36549f = (String) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        cVar.f36550g = (Bundle) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        cVar.f36551h = (String) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        cVar.f36552i = (Bundle) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        cVar.f36553j = ((Long) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        cVar.f36554k = (String) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        cVar.f36555l = (Bundle) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        cVar.f36557n = ((Boolean) zzhe.zza(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f36556m = ((Long) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        cVar.f36558o = ((Long) zzhe.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String zza = zzhf.zza(str);
        return zza != null ? zza : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        char c10;
        if ("_cmp".equals(str2)) {
            if (i(str) && bundle != null) {
                for (String str3 : f23175d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                        c10 = 0;
                    }
                    c10 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        c10 = 2;
                    }
                    c10 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
                if (c10 == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c10 == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c10 != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f36544a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f36546c;
        if ((obj == null || zzit.zza(obj) != null) && i(str) && j(str, cVar.f36545b)) {
            String str2 = cVar.f36554k;
            if (str2 == null || (g(str2, cVar.f36555l) && e(str, cVar.f36554k, cVar.f36555l))) {
                String str3 = cVar.f36551h;
                if (str3 == null || (g(str3, cVar.f36552i) && e(str, cVar.f36551h, cVar.f36552i))) {
                    String str4 = cVar.f36549f;
                    if (str4 != null) {
                        return g(str4, cVar.f36550g) && e(str, cVar.f36549f, cVar.f36550g);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean g(String str, Bundle bundle) {
        if (f23173b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f23175d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str) {
        return !f23172a.contains(str);
    }

    public static boolean i(String str) {
        return !f23174c.contains(str);
    }

    public static boolean j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        } else if (f23176e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f23177f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
