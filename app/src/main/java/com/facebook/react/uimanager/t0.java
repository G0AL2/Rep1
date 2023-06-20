package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;

/* compiled from: UIManagerHelper.java */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15978a = "com.facebook.react.uimanager.t0";

    public static float[] a(n0 n0Var) {
        EditText editText = new EditText(n0Var);
        return new float[]{r.a(androidx.core.view.z.H(editText)), r.a(androidx.core.view.z.G(editText)), r.a(editText.getPaddingTop()), r.a(editText.getPaddingBottom())};
    }

    public static com.facebook.react.uimanager.events.d b(ReactContext reactContext, int i10) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof n0) {
                reactContext = ((n0) reactContext).b();
            }
            return ((com.facebook.react.uimanager.events.g) reactContext).getEventDispatcher();
        }
        UIManager h10 = h(reactContext, i10, false);
        if (h10 == null) {
            String str = f15978a;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i10));
            return null;
        }
        com.facebook.react.uimanager.events.d dVar = (com.facebook.react.uimanager.events.d) h10.getEventDispatcher();
        if (dVar == null) {
            String str2 = f15978a;
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i10));
        }
        return dVar;
    }

    public static com.facebook.react.uimanager.events.d c(ReactContext reactContext, int i10) {
        com.facebook.react.uimanager.events.d b10 = b(reactContext, x6.a.a(i10));
        if (b10 == null) {
            String str = f15978a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i10));
        }
        return b10;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof n0) {
            return ((n0) context).c();
        }
        return -1;
    }

    public static int f(View view) {
        if (view instanceof b0) {
            b0 b0Var = (b0) view;
            if (b0Var.getUIManagerType() == 2) {
                return b0Var.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (x6.a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof n0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int e10 = e(context);
        if (e10 == -1) {
            String str = f15978a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return e10;
    }

    public static UIManager g(ReactContext reactContext, int i10) {
        return h(reactContext, i10, true);
    }

    private static UIManager h(ReactContext reactContext, int i10, boolean z10) {
        if (reactContext.isBridgeless()) {
            UIManager uIManager = (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
            if (uIManager == null) {
                ReactSoftExceptionLogger.logSoftException(f15978a, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
                return null;
            }
            return uIManager;
        } else if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(f15978a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        } else {
            if (!reactContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(f15978a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                if (z10) {
                    return null;
                }
            }
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            try {
                if (i10 == 2) {
                    return (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager);
                }
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            } catch (IllegalArgumentException unused) {
                String str = f15978a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i10));
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            }
        }
    }

    public static UIManager i(ReactContext reactContext, int i10) {
        return g(reactContext, x6.a.a(i10));
    }
}
