package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import h6.e;
import java.util.Map;

@o6.a(name = DialogModule.NAME)
/* loaded from: classes.dex */
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = e.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f15546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f15547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f15548c;

        a(DialogModule dialogModule, c cVar, Bundle bundle, Callback callback) {
            this.f15546a = cVar;
            this.f15547b = bundle;
            this.f15548c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15546a.b(this.f15547b, this.f15548c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        private final Callback f15549a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15550b = false;

        public b(Callback callback) {
            this.f15549a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f15550b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f15549a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i10));
            this.f15550b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f15550b || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f15549a.invoke(DialogModule.ACTION_DISMISSED);
            this.f15550b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final FragmentManager f15552a;

        /* renamed from: b  reason: collision with root package name */
        private Object f15553b;

        public c(FragmentManager fragmentManager) {
            this.f15552a = fragmentManager;
        }

        private void a() {
            com.facebook.react.modules.dialog.a aVar;
            if (DialogModule.this.mIsInForeground && (aVar = (com.facebook.react.modules.dialog.a) this.f15552a.i0(DialogModule.FRAGMENT_TAG)) != null && aVar.isResumed()) {
                aVar.dismiss();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.a aVar = new com.facebook.react.modules.dialog.a(callback != null ? new b(callback) : null, bundle);
            if (DialogModule.this.mIsInForeground && !this.f15552a.L0()) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    aVar.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                aVar.show(this.f15552a, DialogModule.FRAGMENT_TAG);
                return;
            }
            this.f15553b = aVar;
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f15553b == null) {
                return;
            }
            a();
            ((com.facebook.react.modules.dialog.a) this.f15553b).show(this.f15552a, DialogModule.FRAGMENT_TAG);
            this.f15553b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof d)) {
            return null;
        }
        return new c(((d) currentActivity).getSupportFragmentManager());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            z3.a.C(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey("items")) {
            ReadableArray array = readableMap.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i10 = 0; i10 < array.size(); i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(this, fragmentManagerHelper, bundle, callback2));
    }
}
