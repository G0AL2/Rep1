package yb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: AppData.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f39360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39361b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39362c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39363d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39364e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39365f;

    /* renamed from: g  reason: collision with root package name */
    public final vb.e f39366g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, vb.e eVar) {
        this.f39360a = str;
        this.f39361b = str2;
        this.f39362c = str3;
        this.f39363d = str4;
        this.f39364e = str5;
        this.f39365f = str6;
        this.f39366g = eVar;
    }

    public static a a(Context context, v vVar, String str, String str2, vb.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g10 = vVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, g10, packageName, num, str3, eVar);
    }
}
