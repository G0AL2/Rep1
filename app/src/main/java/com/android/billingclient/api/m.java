package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(Bundle bundle, String str, String str2) {
        e eVar = l.f6079j;
        if (bundle == null) {
            zzb.zzn("BillingClient", String.format("%s got null owned items list", str2));
            return eVar;
        }
        int zzb = zzb.zzb(bundle, "BillingClient");
        String zzj = zzb.zzj(bundle, "BillingClient");
        e.a c10 = e.c();
        c10.c(zzb);
        c10.b(zzj);
        e a10 = c10.a();
        if (zzb != 0) {
            zzb.zzn("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zzb)));
            return a10;
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return eVar;
            } else if (stringArrayList2 == null) {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return eVar;
            } else if (stringArrayList3 == null) {
                zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return eVar;
            } else {
                return l.f6080k;
            }
        } else {
            zzb.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return eVar;
        }
    }
}
