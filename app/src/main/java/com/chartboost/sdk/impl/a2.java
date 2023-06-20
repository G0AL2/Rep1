package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.c;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.chartboost.sdk.f fVar, String str, int i10, y1 y1Var) {
        String str2 = y1Var != null ? y1Var.f13666g : "";
        if (i10 == 0) {
            b(fVar, str, str2);
        } else if (i10 == 1) {
            c(fVar, str, str2);
        } else if (i10 != 2) {
        } else {
            a(fVar, str, str2);
        }
    }

    private static void b(com.chartboost.sdk.f fVar, String str, String str2) {
        c cVar = fVar.f13863t;
        Objects.requireNonNull(cVar);
        a(fVar, new c.a(4, str, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE, null, false, str2));
    }

    private static void c(com.chartboost.sdk.f fVar, String str, String str2) {
        c cVar = fVar.f13867x;
        Objects.requireNonNull(cVar);
        a(fVar, new c.a(4, str, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE, null, false, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(com.chartboost.sdk.f fVar, String str, String str2) {
        d a10 = fVar.f13855l.a(str);
        if (a10 != null) {
            g0 g10 = a10.g();
            if (g10 != null) {
                a(fVar, new c.a(6, str, null, new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL), false, str2));
            } else {
                CBLogging.a("OpenRTBErrorsHelper", "Banner trait is null");
            }
        }
    }

    private static void e(com.chartboost.sdk.f fVar, String str, String str2) {
        c f10 = fVar.f();
        Objects.requireNonNull(f10);
        a(fVar, new c.a(4, str, CBError.CBImpressionError.INTERNAL, null, false, str2));
    }

    private static void f(com.chartboost.sdk.f fVar, String str, String str2) {
        c h10 = fVar.h();
        Objects.requireNonNull(h10);
        a(fVar, new c.a(4, str, CBError.CBImpressionError.INTERNAL, null, false, str2));
    }

    private static void a(com.chartboost.sdk.f fVar, String str, String str2) {
        d a10 = fVar.f13855l.a(str);
        if (a10 != null) {
            g0 g10 = a10.g();
            Objects.requireNonNull(g10);
            a(fVar, new c.a(4, str, null, new ChartboostCacheError(ChartboostCacheError.Code.ASSET_DOWNLOAD_FAILURE), false, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.chartboost.sdk.f fVar, String str, int i10, String str2) {
        if (i10 == 0) {
            e(fVar, str, str2);
        } else if (i10 == 1) {
            f(fVar, str, str2);
        } else if (i10 != 2) {
        } else {
            d(fVar, str, str2);
        }
    }

    private static void a(com.chartboost.sdk.f fVar, c.a aVar) {
        fVar.j().post(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2) {
        return a(str) && a(str2);
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str);
    }
}
