package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* compiled from: WebHelper.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13177a = false;

    public static void a(boolean z10) {
        f13177a = z10;
    }

    public static boolean a(final Context context, final com.bytedance.sdk.openadsdk.core.e.n nVar, final int i10, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, final String str, r3.c cVar, final boolean z10) {
        String O;
        String str2;
        if (context == null || nVar == null || i10 == -1) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.e.h ab2 = nVar.ab();
        if (ab2 != null) {
            String a10 = ab2.a();
            if (!TextUtils.isEmpty(a10)) {
                Uri parse = Uri.parse(ab2.a());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (com.bytedance.sdk.openadsdk.utils.u.l(context)) {
                    if (com.bytedance.sdk.openadsdk.utils.u.a(context, intent)) {
                        if (m.h().c()) {
                            com.bytedance.sdk.openadsdk.utils.u.b(nVar, str);
                        }
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() { // from class: com.bytedance.sdk.openadsdk.core.y.1
                            @Override // com.bytedance.sdk.component.utils.b.a
                            public void a() {
                            }

                            @Override // com.bytedance.sdk.component.utils.b.a
                            public void a(Throwable th) {
                                if (m.h().c()) {
                                    return;
                                }
                                y.a(context, nVar.O(), nVar, i10, str, z10);
                                com.bytedance.sdk.component.utils.l.c("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", th);
                            }
                        });
                        com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_url_app", (Map<String, Object>) null);
                        com.bytedance.sdk.openadsdk.b.p.a().a(nVar, str);
                        return true;
                    }
                } else {
                    try {
                        if (m.h().c()) {
                            com.bytedance.sdk.openadsdk.utils.u.b(nVar, str);
                        }
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_url_app", (Map<String, Object>) null);
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.b.p.a().a(nVar, str);
                        return true;
                    } catch (Throwable unused) {
                        a10 = nVar.O();
                    }
                }
            }
            if (ab2.c() != 2 || nVar.ad() == 5 || nVar.ad() == 15) {
                if (ab2.c() == 1) {
                    a10 = ab2.b();
                } else {
                    a10 = nVar.O();
                }
            } else if (cVar != null) {
                if (!cVar.a()) {
                    if (cVar.e()) {
                        com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_fallback_url", (Map<String, Object>) null);
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_fallback_url", (Map<String, Object>) null);
                    return false;
                }
                com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_fallback_url", (Map<String, Object>) null);
                return true;
            }
            com.bytedance.sdk.openadsdk.b.e.d(context, nVar, str, "open_fallback_url", (Map<String, Object>) null);
            str2 = a10;
        } else {
            if (nVar.aw() && nVar.ax() != null) {
                O = nVar.ax().i();
            } else {
                O = nVar.O();
            }
            str2 = O;
        }
        return a(context, nVar, i10, tTNativeAd, tTNativeExpressAd, str, z10, str2);
    }

    public static boolean a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, int i10, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, boolean z10, String str2) {
        if (!TextUtils.isEmpty(str2) || com.bytedance.sdk.openadsdk.core.e.p.a(nVar)) {
            if (nVar.L() == 2) {
                if (com.bytedance.sdk.component.utils.o.a(str2)) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    try {
                        intent.setData(Uri.parse(str2));
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.component.utils.b.a(context, intent, null);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
                return false;
            }
            com.bytedance.sdk.component.utils.b.a(context, a(context, str2, nVar, i10, tTNativeAd, tTNativeExpressAd, str, z10), null);
            f13177a = false;
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str, com.bytedance.sdk.openadsdk.core.e.n nVar, int i10, String str2, boolean z10) {
        try {
            context.startActivity(a(context, str, nVar, i10, (TTNativeAd) null, (TTNativeExpressAd) null, str2, z10));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent a(Context context, String str, com.bytedance.sdk.openadsdk.core.e.n nVar, int i10, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str2, boolean z10) {
        Intent intent;
        if (com.bytedance.sdk.openadsdk.core.e.p.a(nVar) && (tTNativeAd != null || tTNativeExpressAd != null)) {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", a(nVar, z10));
            String c10 = com.bytedance.sdk.openadsdk.core.e.p.c(nVar);
            if (!TextUtils.isEmpty(c10)) {
                if (c10.contains("?")) {
                    str = c10 + "&orientation=portrait";
                } else {
                    str = c10 + "?orientation=portrait";
                }
            }
        } else {
            intent = (nVar.L() != 3 || !(nVar.f() == 2 || (nVar.f() == 1 && f13177a)) || nVar.f12160a) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra(ImagesContract.URL, str);
        intent.putExtra("gecko_id", nVar.af());
        intent.putExtra("web_title", nVar.U());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", nVar.Y());
        intent.putExtra("log_extra", nVar.ac());
        intent.putExtra("icon_url", nVar.M() == null ? null : nVar.M().a());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i10);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, nVar.ar().toString());
        } else {
            t.a().h();
            t.a().a(nVar);
        }
        if (nVar.ad() == 5 || nVar.ad() == 15 || nVar.ad() == 50) {
            if (tTNativeAd != null) {
                r9 = tTNativeAd instanceof a.InterfaceC0184a ? ((a.InterfaceC0184a) tTNativeAd).f() : null;
                if (r9 != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, r9.a().toString());
                }
            }
            if (tTNativeExpressAd != null && (r9 = tTNativeExpressAd.getVideoModel()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, r9.a().toString());
            }
            if (r9 != null) {
                intent.putExtra("video_is_auto_play", r9.f13516d);
                if (com.bytedance.sdk.component.utils.l.c()) {
                    com.bytedance.sdk.component.utils.l.c("videoDataModel", "videoDataModel=" + r9.a().toString());
                }
            }
        }
        return intent;
    }

    private static boolean a(com.bytedance.sdk.openadsdk.core.e.n nVar, boolean z10) {
        return z10 && nVar != null && nVar.L() == 4 && com.bytedance.sdk.openadsdk.core.e.p.a(nVar);
    }
}
