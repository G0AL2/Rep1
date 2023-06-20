package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: TTClientBiddingUtil.java */
/* loaded from: classes.dex */
public class q {
    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, Double d10) {
        if (nVar == null || nVar.aj() == null) {
            return;
        }
        Map<String, Object> aj = nVar.aj();
        try {
            Object obj = nVar.aj().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) aj.get("nurl");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d10 != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.m.f().a(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.l.b("report Win error");
        }
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, Double d10, String str, String str2) {
        if (nVar == null || nVar.aj() == null) {
            return;
        }
        Map<String, Object> aj = nVar.aj();
        try {
            Object obj = nVar.aj().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) aj.get("lurl");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (d10 != null) {
                    str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d10));
                }
                if (str != null) {
                    str3 = str3.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    str3 = str3.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.m.f().a(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.l.b("report Loss error");
        }
    }
}
