package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: ExpressEventManager.java */
/* loaded from: classes.dex */
public class h {
    public static void a(String str, String str2, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        com.bytedance.sdk.openadsdk.h.b.a().a(com.bytedance.sdk.openadsdk.h.a.b.b().a(a(str)).c(str2).e(u.h(nVar)).a("dynamic_backup_render_new"));
    }

    public static void a(int i10, String str, String str2, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        com.bytedance.sdk.openadsdk.h.b.a().b(com.bytedance.sdk.openadsdk.h.a.b.b().a(a(str)).c(str2).e(u.h(nVar)).b(i10).f(com.bytedance.sdk.openadsdk.core.g.a(i10)));
    }

    private static int a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1912999166:
                if (str.equals("draw_ad")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            case 5:
                return 9;
            default:
                return 5;
        }
    }
}
