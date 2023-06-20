package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public class p {
    public static boolean a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.a("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }
}
