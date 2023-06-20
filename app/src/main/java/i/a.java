package i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import d.j;

/* compiled from: ActionBarPolicy.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f31418a;

    private a(Context context) {
        this.f31418a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f31418a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f31418a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f31418a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 <= 960 || i11 <= 720) {
            if (i10 <= 720 || i11 <= 960) {
                if (i10 < 500) {
                    if (i10 <= 640 || i11 <= 480) {
                        if (i10 <= 480 || i11 <= 640) {
                            return i10 >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f31418a.getResources().getDimensionPixelSize(d.d.f28691b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f31418a.obtainStyledAttributes(null, j.f28795a, d.a.f28657c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f28840j, 0);
        Resources resources = this.f31418a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.d.f28690a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f31418a.getResources().getBoolean(d.b.f28681a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f31418a).hasPermanentMenuKey();
    }
}
