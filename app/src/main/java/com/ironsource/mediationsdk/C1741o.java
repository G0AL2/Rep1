package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1741o {

    /* renamed from: com.ironsource.mediationsdk.o$a */
    /* loaded from: classes3.dex */
    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb2);
    }

    /* renamed from: com.ironsource.mediationsdk.o$b */
    /* loaded from: classes3.dex */
    interface b {
        void a();

        void a(String str);
    }

    public static JSONObject a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0337a.f26136a.a(context);
        for (String str : strArr) {
            if (a10.has(str)) {
                jSONObject.put(str, a10.opt(str));
            }
        }
        return jSONObject;
    }

    public static JSONObject a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0337a.f26136a.a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a10.has(str)) {
                jSONObject.put(str, a10.opt(str));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, ConcurrentHashMap<String, T> concurrentHashMap, a aVar) {
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        if (!com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (T t10 : concurrentHashMap.values()) {
                if (t10.h()) {
                    Map<String, Object> c10 = t10.c();
                    if (c10 != null) {
                        hashMap.put(t10.k(), c10);
                        sb2 = new StringBuilder("2");
                        sb2.append(t10.k());
                        sb2.append(",");
                        sb3.append(sb2.toString());
                    } else {
                        t10.a(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                    }
                } else if (!t10.h()) {
                    arrayList.add(t10.k());
                    sb2 = new StringBuilder("1");
                    sb2.append(t10.k());
                    sb2.append(",");
                    sb3.append(sb2.toString());
                }
            }
        }
        aVar.a(hashMap, arrayList, sb3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    public JSONObject a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0337a.f26136a.a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a10.has(next)) {
                jSONObject.put(next, a10.opt(next));
            }
        }
        return jSONObject;
    }
}
