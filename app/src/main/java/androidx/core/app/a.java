package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.core.content.b {

    /* renamed from: d  reason: collision with root package name */
    private static d f2480d;

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0046a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f2481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f2482b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f2483c;

        RunnableC0046a(String[] strArr, Activity activity, int i10) {
            this.f2481a = strArr;
            this.f2482b = activity;
            this.f2483c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2481a.length];
            PackageManager packageManager = this.f2482b.getPackageManager();
            String packageName = this.f2482b.getPackageName();
            int length = this.f2481a.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f2481a[i10], packageName);
            }
            ((c) this.f2482b).onRequestPermissionsResult(this.f2483c, this.f2481a, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f2484a;

        b(Activity activity) {
            this.f2484a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2484a.isFinishing() || androidx.core.app.c.i(this.f2484a)) {
                return;
            }
            this.f2484a.recreate();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void validateRequestPermissionsRequestCode(int i10);
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void p(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            activity.recreate();
        } else if (i10 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else if (androidx.core.app.c.i(activity)) {
        } else {
            activity.recreate();
        }
    }

    public static void q(Activity activity, String[] strArr, int i10) {
        d dVar = f2480d;
        if (dVar == null || !dVar.a(activity, strArr, i10)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i10);
                }
                activity.requestPermissions(strArr, i10);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0046a(strArr, activity, i10));
            }
        }
    }

    public static void r(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(null);
        }
    }

    public static void s(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(null);
        }
    }

    public static boolean t(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void u(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }

    public static void v(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
        }
    }

    public static void w(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
