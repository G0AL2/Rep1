package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.f;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.savedstate.SavedStateRegistry;
import c.a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends f implements h0, androidx.savedstate.c, androidx.activity.c, androidx.activity.result.c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final b.a mContextAwareHelper;
    private f0.b mDefaultFactory;
    private final q mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final androidx.savedstate.b mSavedStateRegistryController;
    private g0 mViewModelStore;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f683a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.C0097a f684b;

            a(int i10, a.C0097a c0097a) {
                this.f683a = i10;
                this.f684b = c0097a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f683a, this.f684b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0032b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f686a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f687b;

            RunnableC0032b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f686a = i10;
                this.f687b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f686a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f687b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, c.a<I, O> aVar, I i11, androidx.core.app.b bVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0097a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.q(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.a.v(componentActivity, intentSenderRequest.g(), i10, intentSenderRequest.c(), intentSenderRequest.e(), intentSenderRequest.f(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0032b(i10, e10));
                }
            } else {
                androidx.core.app.a.u(componentActivity, a10, i10, bundle2);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements SavedStateRegistry.b {
        c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.mActivityResultRegistry.h(bundle);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    class d implements b.b {
        d() {
        }

        @Override // b.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a10 = ComponentActivity.this.getSavedStateRegistry().a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (a10 != null) {
                ComponentActivity.this.mActivityResultRegistry.g(a10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f691a;

        /* renamed from: b  reason: collision with root package name */
        g0 f692b;

        e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new b.a();
        this.mLifecycleRegistry = new q(this);
        this.mSavedStateRegistryController = androidx.savedstate.b.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                getLifecycle().a(new m() { // from class: androidx.activity.ComponentActivity.3
                    @Override // androidx.lifecycle.m
                    public void b(p pVar, i.b bVar) {
                        if (bVar == i.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new m() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.m
                public void b(p pVar, i.b bVar) {
                    if (bVar == i.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new m() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.m
                public void b(p pVar, i.b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (19 <= i10 && i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().d(ACTIVITY_RESULT_TAG, new c());
            addOnContextAvailableListener(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        i0.a(getWindow().getDecorView(), this);
        j0.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(b.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f692b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new g0();
            }
        }
    }

    @Override // androidx.activity.result.c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public f0.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new c0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f691a;
        }
        return null;
    }

    @Override // androidx.core.app.f, androidx.lifecycle.p
    public i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.h0
    public g0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        a0.g(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        g0 g0Var = this.mViewModelStore;
        if (g0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            g0Var = eVar.f692b;
        }
        if (g0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f691a = onRetainCustomNonConfigurationInstance;
        eVar2.f692b = g0Var;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i lifecycle = getLifecycle();
        if (lifecycle instanceof q) {
            ((q) lifecycle).o(i.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(c.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public final void removeOnContextAvailableListener(b.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (e1.a.d()) {
                e1.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && androidx.core.content.b.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            e1.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(c.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
