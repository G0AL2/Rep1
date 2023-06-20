package p1;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f35456a = androidx.work.l.i("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.l e10 = androidx.work.l.e();
            String str = f35456a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            e10.a(str, sb2.toString());
        } catch (Exception e11) {
            androidx.work.l e12 = androidx.work.l.e();
            String str2 = f35456a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            e12.b(str2, sb3.toString(), e11);
        }
    }
}
