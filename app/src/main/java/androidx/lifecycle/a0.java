package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;

/* compiled from: ReportFragment.java */
/* loaded from: classes.dex */
public class a0 extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f3349a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            a0.a(activity, i.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            a0.a(activity, i.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            a0.a(activity, i.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            a0.a(activity, i.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            a0.a(activity, i.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            a0.a(activity, i.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, i.b bVar) {
        if (activity instanceof r) {
            ((r) activity).getLifecycle().h(bVar);
        } else if (activity instanceof p) {
            i lifecycle = ((p) activity).getLifecycle();
            if (lifecycle instanceof q) {
                ((q) lifecycle).h(bVar);
            }
        }
    }

    private void b(i.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 f(Activity activity) {
        return (a0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new a0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(a aVar) {
        this.f3349a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f3349a);
        b(i.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(i.b.ON_DESTROY);
        this.f3349a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(i.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f3349a);
        b(i.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f3349a);
        b(i.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(i.b.ON_STOP);
    }
}
