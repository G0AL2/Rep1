package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import cd.c;
import cd.e;
import cd.h;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.List;
import qc.g;
import tb.d;
import tb.i;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements i {
    public static /* synthetic */ String a(Context context) {
        return h(context);
    }

    public static /* synthetic */ String b(Context context) {
        return e(context);
    }

    public static /* synthetic */ String c(Context context) {
        return f(context);
    }

    public static /* synthetic */ String d(Context context) {
        return g(context);
    }

    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i10 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // tb.i
    public List<d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(g.h());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.1.0"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: ob.h
            @Override // cd.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: ob.i
            @Override // cd.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: ob.j
            @Override // cd.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: ob.g
            @Override // cd.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String a10 = e.a();
        if (a10 != null) {
            arrayList.add(h.b("kotlin", a10));
        }
        return arrayList;
    }
}
