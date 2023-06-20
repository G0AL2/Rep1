package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: SdkInfo.java */
/* loaded from: classes3.dex */
public final class hp {

    /* renamed from: a  reason: collision with root package name */
    private static String f25688a = "dir";

    /* renamed from: b  reason: collision with root package name */
    private static String f25689b;

    public static String a() {
        String str = "pr-SAND-" + b() + "-20220525";
        if (TextUtils.isEmpty("")) {
            return str;
        }
        return str + Constants.FILENAME_SEQUENCE_SEPARATOR + "";
    }

    public static String b() {
        return "10.0.7";
    }

    public static boolean b(Context context) {
        return hf.a(context, "sdk_version_store").b("db_deletion_failed", false);
    }

    public static String c() {
        return DtbConstants.APS_ADAPTER_VERSION_2;
    }

    public static String d() {
        return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public static String e() {
        return "https://www.inmobi.com/products/sdk/#downloads";
    }

    public static String f() {
        return f25689b;
    }

    public static String g() {
        return f25688a;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f25689b = str;
    }

    public static String a(Context context) {
        return hf.a(context, "sdk_version_store").b("sdk_version");
    }

    public static void a(Context context, String str) {
        hf.a(context, "sdk_version_store").a("sdk_version", str);
    }

    public static void a(Context context, boolean z10) {
        hf.a(context, "sdk_version_store").a("db_deletion_failed", z10);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f25688a = str;
    }
}
