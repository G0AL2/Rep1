package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.android.billingclient.api.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o2.a;
import o2.d;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzn("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzp(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            zzn(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle zzc(a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzd(d dVar, boolean z10, String str) {
        Bundle bundle = new Bundle();
        if (z10) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zze(int i10, boolean z10, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i10 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i10 >= 9 && z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i10 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < size; i11++) {
                o oVar = (o) arrayList.get(i11);
                arrayList2.add(null);
                z11 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z12 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z11) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z12) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle zzf(c cVar, boolean z10, boolean z11, boolean z12, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (cVar.c() != 0) {
            bundle.putInt("prorationMode", cVar.c());
        }
        if (!TextUtils.isEmpty(cVar.d())) {
            bundle.putString("accountId", cVar.d());
        }
        if (!TextUtils.isEmpty(cVar.e())) {
            bundle.putString("obfuscatedProfileId", cVar.e());
        }
        if (cVar.a()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(cVar.f())) {
            bundle.putString("oldSkuPurchaseToken", cVar.f());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z12) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    public static Bundle zzg(boolean z10, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static e zzh(Intent intent, String str) {
        if (intent == null) {
            zzn("BillingHelper", "Got null intent!");
            e.a c10 = e.c();
            c10.c(6);
            c10.b("An internal error occurred.");
            return c10.a();
        }
        e.a c11 = e.c();
        c11.c(zzb(intent.getExtras(), str));
        c11.b(zzj(intent.getExtras(), str));
        return c11.a();
    }

    public static o2.e zzi(Bundle bundle, String str) {
        if (bundle == null) {
            return new o2.e(0, null);
        }
        return new o2.e(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            zzn(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static String zzk(int i10) {
        return zza.zza(i10).toString();
    }

    public static List zzl(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            int size = stringArrayList.size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Found purchase list of ");
            sb2.append(size);
            sb2.append(" items");
            zzm("BillingHelper", sb2.toString());
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase zzq = zzq(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (zzq != null) {
                    arrayList.add(zzq);
                }
            }
        } else {
            Purchase zzq2 = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq2 == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq2);
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzq(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        zzm("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
