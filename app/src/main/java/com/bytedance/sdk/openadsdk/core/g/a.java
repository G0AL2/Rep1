package com.bytedance.sdk.openadsdk.core.g;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.bytedance.sdk.component.utils.l;

/* compiled from: MIUIPermissionUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12253a = "a";

    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b(context, str);
        }
        return c(context, str);
    }

    private static boolean b(Context context, String str) {
        String str2 = f12253a;
        l.e(str2, "checkPermissinKITKATNew，permission：" + str);
        boolean z10 = true;
        try {
            str.hashCode();
            String lowerCase = str.replaceFirst("android.permission.", "android:").toLowerCase();
            int checkOp = ((AppOpsManager) context.getSystemService("appops")).checkOp(lowerCase, Binder.getCallingUid(), context.getPackageName());
            l.e(str2, "checkPermissinKITKATNew，locationOp,permission：" + checkOp + "," + lowerCase);
            if (checkOp != 0) {
                z10 = false;
                l.e(str2, "checkPermissinKITKATNew，false,permission：" + lowerCase);
                return false;
            }
            return true;
        } catch (Exception e10) {
            String str3 = f12253a;
            l.e(str3, "If there is an error in the permission check, it returns true by default, and the exception code is: " + e10);
            return z10;
        }
    }

    private static boolean c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
