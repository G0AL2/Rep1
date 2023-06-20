package pf;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.WindowManager;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;

/* compiled from: SplashScreen.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static Dialog f35723a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Activity> f35724b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashScreen.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f35725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f35727c;

        a(Activity activity, int i10, boolean z10) {
            this.f35725a = activity;
            this.f35726b = i10;
            this.f35727c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35725a.isFinishing()) {
                return;
            }
            Dialog unused = c.f35723a = new Dialog(this.f35725a, this.f35726b);
            c.f35723a.setContentView(pf.a.launch_screen);
            c.f35723a.setCancelable(false);
            if (this.f35727c) {
                c.e(c.f35723a);
            }
            if (c.f35723a.isShowing()) {
                return;
            }
            c.f35723a.show();
        }
    }

    /* compiled from: SplashScreen.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f35728a;

        b(Activity activity) {
            this.f35728a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.f35723a == null || !c.f35723a.isShowing()) {
                return;
            }
            boolean isDestroyed = Build.VERSION.SDK_INT >= 17 ? this.f35728a.isDestroyed() : false;
            if (!this.f35728a.isFinishing() && !isDestroyed) {
                c.f35723a.dismiss();
            }
            Dialog unused = c.f35723a = null;
        }
    }

    public static void d(Activity activity) {
        if (activity == null) {
            WeakReference<Activity> weakReference = f35724b;
            if (weakReference == null) {
                return;
            }
            activity = weakReference.get();
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new b(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Dialog dialog) {
        if (Build.VERSION.SDK_INT < 28 || dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().addFlags(AdRequest.MAX_CONTENT_URL_LENGTH);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        dialog.getWindow().setAttributes(attributes);
    }

    public static void f(Activity activity) {
        h(activity, false);
    }

    public static void g(Activity activity, int i10, boolean z10) {
        if (activity == null) {
            return;
        }
        f35724b = new WeakReference<>(activity);
        activity.runOnUiThread(new a(activity, i10, z10));
    }

    public static void h(Activity activity, boolean z10) {
        g(activity, z10 ? pf.b.SplashScreen_Fullscreen : pf.b.SplashScreen_SplashTheme, z10);
    }
}
