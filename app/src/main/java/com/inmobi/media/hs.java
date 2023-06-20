package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClickUrlHandler.java */
/* loaded from: classes3.dex */
public class hs {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25703a = "hs";

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context != null) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null;
        }
        return a(Uri.parse(str));
    }

    public static void b(Context context, String str) throws ActivityNotFoundException, URISyntaxException {
        while (context != null) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return;
            } catch (ActivityNotFoundException e10) {
                if ("intent".equals(Uri.parse(str).getScheme())) {
                    str = b(str);
                    if (TextUtils.isEmpty(str)) {
                    }
                }
                throw e10;
            }
        }
    }

    public static List<ResolveInfo> c(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || context == null) {
            return arrayList;
        }
        try {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivityOptions(null, null, c(str), 0)) {
                if (resolveInfo.activityInfo.exported) {
                    arrayList.add(resolveInfo);
                }
            }
        } catch (URISyntaxException unused) {
        }
        return arrayList;
    }

    public static void a(Context context, String str, ResolveInfo resolveInfo) throws ActivityNotFoundException, URISyntaxException {
        if (context == null) {
            return;
        }
        Intent c10 = c(str);
        if (resolveInfo != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            c10.setClassName(activityInfo.packageName, activityInfo.name);
        }
        c10.setFlags(268435456);
        context.startActivity(c10);
    }

    public static String a(Context context, String str, String str2) {
        Intent parseUri;
        if (context == null) {
            return null;
        }
        try {
            parseUri = Intent.parseUri(str, 0);
        } catch (Exception unused) {
        }
        if (parseUri.resolveActivity(context.getPackageManager()) != null) {
            parseUri.setFlags(268435456);
            context.startActivity(parseUri);
            return str;
        } else if (!TextUtils.isEmpty(str2)) {
            return a(context, str2, (String) null);
        } else {
            if ("intent".equals(Uri.parse(str).getScheme())) {
                String b10 = b(str);
                if (!TextUtils.isEmpty(b10)) {
                    return a(context, URLDecoder.decode(b10, "UTF-8"), (String) null);
                }
            }
            return null;
        }
    }

    private static String b(String str) {
        try {
            return Intent.parseUri(str, 1).getStringExtra("browser_fallback_url");
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    private static Intent c(String str) throws URISyntaxException {
        Uri parse = Uri.parse(str);
        if (parse != null && parse.getScheme() != null) {
            if (parse.getScheme().equals("intent")) {
                try {
                    return Intent.parseUri(str, 1);
                } catch (URISyntaxException e10) {
                    gg.a().a(new hg(e10));
                    throw e10;
                }
            }
            return new Intent("android.intent.action.VIEW", parse);
        }
        throw new URISyntaxException(str, "url is not getting parsed");
    }

    public static boolean a(Uri uri) {
        return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
    }

    public static boolean a(String str) {
        Uri parse = Uri.parse(str);
        return (!a(parse) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost()) || Utils.PLAY_STORE_SCHEME.equals(parse.getScheme())) ? false : true;
    }
}
