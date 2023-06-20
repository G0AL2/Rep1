package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.applovin.impl.sdk.utils.Utils;

/* compiled from: AppstoreLinkHandler.java */
/* loaded from: classes3.dex */
public final class hk {

    /* renamed from: a  reason: collision with root package name */
    private static hk f25675a;

    private hk() {
    }

    public static synchronized hk a() {
        hk hkVar;
        synchronized (hk.class) {
            if (f25675a == null) {
                f25675a = new hk();
            }
            hkVar = f25675a;
        }
        return hkVar;
    }

    private static boolean a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return Utils.PLAY_STORE_SCHEME.equals(parse.getScheme()) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost());
    }

    private static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        if (a(str)) {
            Uri parse = Uri.parse(str);
            if (a(context)) {
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            hl.a();
            return hl.a(context, str);
        }
        return false;
    }
}
