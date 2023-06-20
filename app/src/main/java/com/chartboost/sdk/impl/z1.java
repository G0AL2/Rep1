package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z1 {
    private static String a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "" : IronSourceConstants.BANNER_AD_UNIT : "Rewarded" : IronSourceConstants.INTERSTITIAL_AD_UNIT;
    }

    public static void a(String str, String str2, int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.b("OpenRTBCache", "OpenRTBCache not supported for this Android version");
            a aVar = com.chartboost.sdk.g.f13879d;
            if (aVar != null) {
                aVar.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        if (a10 == null) {
            CBLogging.b("OpenRTBCache", "OpenRTBCache cache: SDK is null");
        } else if (!a2.a(str, str2)) {
            a2.a(a10, str, i10, "");
        } else {
            j1 j1Var = a10.f13857n.f14017a;
            if (j1Var == null) {
                a2.a(a10, str, i10, "");
                return;
            }
            try {
                y1 y1Var = new y1(i10, new JSONObject(str2));
                com.chartboost.sdk.g.f13889n = false;
                a(a10, i10, str, j1Var, y1Var);
            } catch (JSONException e10) {
                m1.d(new com.chartboost.sdk.Tracking.a("cache_bid_response_parsing_error", e10.toString(), a(i10), str));
                a2.a(a10, str, i10, "");
            }
        }
    }

    private static f b(com.chartboost.sdk.f fVar, int i10, String str, String str2) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return a(fVar, str, str2);
            }
            return fVar.g();
        }
        return fVar.e();
    }

    private static void a(final com.chartboost.sdk.f fVar, final int i10, final String str, j1 j1Var, final y1 y1Var) {
        a(j1Var, y1Var, new o() { // from class: com.chartboost.sdk.impl.a4
            @Override // com.chartboost.sdk.impl.o
            public final void a(boolean z10, int i11, int i12) {
                z1.a(com.chartboost.sdk.f.this, i10, str, y1Var, z10, i11, i12);
            }
        }, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.chartboost.sdk.f fVar, int i10, String str, y1 y1Var, boolean z10, int i11, int i12) {
        if (z10) {
            a(fVar, i10, str, y1Var);
        } else {
            a2.a(fVar, str, i10, y1Var);
        }
    }

    static void a(com.chartboost.sdk.f fVar, int i10, String str, y1 y1Var) {
        String str2 = y1Var != null ? y1Var.f13666g : "";
        f b10 = b(fVar, i10, str, str2);
        if (b10 != null) {
            a(b10, str, y1Var);
            b10.j(b10.g(str));
            a(fVar, i10, str, str2);
            return;
        }
        a2.a(fVar, str, i10, str2);
    }

    private static void a(j1 j1Var, y1 y1Var, o oVar, int i10) {
        j1Var.a(1, y1Var.d().b(), new AtomicInteger(), oVar, a(i10));
    }

    private static void a(com.chartboost.sdk.f fVar, int i10, String str, String str2) {
        if (i10 == 0) {
            Chartboost.cacheInterstitial(str);
        } else if (i10 == 1) {
            Chartboost.cacheRewardedVideo(str);
        } else if (i10 != 2) {
        } else {
            fVar.f13855l.a(str, str2);
        }
    }

    private static f a(com.chartboost.sdk.f fVar, String str, String str2) {
        t tVar = fVar.f13855l;
        if (tVar == null) {
            a2.d(fVar, str, str2);
            return null;
        }
        return tVar.a(str);
    }

    private static void a(f fVar, String str, y1 y1Var) {
        if (fVar.f(str) == null) {
            fVar.a(str, y1Var);
        }
    }
}
