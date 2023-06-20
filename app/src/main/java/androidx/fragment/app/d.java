package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.a;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class d extends ComponentActivity implements a.c, a.e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final androidx.lifecycle.q mFragmentLifecycleRegistry;
    final h mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.markFragmentsCreated();
            d.this.mFragmentLifecycleRegistry.h(i.b.ON_STOP);
            Parcelable x10 = d.this.mFragments.x();
            if (x10 != null) {
                bundle.putParcelable(d.FRAGMENTS_TAG, x10);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class b implements b.b {
        b() {
        }

        @Override // b.b
        public void a(Context context) {
            d.this.mFragments.a(null);
            Bundle a10 = d.this.getSavedStateRegistry().a(d.FRAGMENTS_TAG);
            if (a10 != null) {
                d.this.mFragments.w(a10.getParcelable(d.FRAGMENTS_TAG));
            }
        }
    }

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    class c extends j<d> implements h0, androidx.activity.c, androidx.activity.result.c, o {
        public c() {
            super(d.this);
        }

        @Override // androidx.fragment.app.o
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            d.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public View c(int i10) {
            return d.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.c
        public ActivityResultRegistry getActivityResultRegistry() {
            return d.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.p
        public androidx.lifecycle.i getLifecycle() {
            return d.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return d.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.h0
        public g0 getViewModelStore() {
            return d.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.j
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.j
        public boolean l(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.j
        public boolean m(String str) {
            return androidx.core.app.a.t(d.this, str);
        }

        @Override // androidx.fragment.app.j
        public void p() {
            d.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.j
        /* renamed from: q */
        public d i() {
            return d.this;
        }
    }

    public d() {
        this.mFragments = h.b(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().d(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(FragmentManager fragmentManager, i.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.t0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), cVar);
                }
                x xVar = fragment.mViewLifecycleOwner;
                if (xVar != null && xVar.getLifecycle().b().a(i.c.STARTED)) {
                    fragment.mViewLifecycleOwner.f(cVar);
                    z10 = true;
                }
                if (fragment.mLifecycleRegistry.b().a(i.c.STARTED)) {
                    fragment.mLifecycleRegistry.o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().X(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), i.c.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.u();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(i.b.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            return super.onCreatePanelMenu(i10, menu) | this.mFragments.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.h(i.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.mFragments.e(menuItem);
        }
        return this.mFragments.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.j(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.h(i.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.n(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(i.b.ON_RESUME);
        this.mFragments.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.h(i.b.ON_START);
        this.mFragments.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.h(i.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.o oVar) {
        androidx.core.app.a.r(this, oVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.o oVar) {
        androidx.core.app.a.s(this, oVar);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.a.v(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.n(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.o(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.w(this);
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.a.u(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public d(int i10) {
        super(i10);
        this.mFragments = h.b(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }
}
