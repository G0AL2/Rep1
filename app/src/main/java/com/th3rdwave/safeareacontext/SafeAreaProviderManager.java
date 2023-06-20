package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.th3rdwave.safeareacontext.e;
import java.util.Map;

/* loaded from: classes3.dex */
public class SafeAreaProviderManager extends ViewGroupManager<e> {
    private final ReactApplicationContext mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f28445a;

        a(SafeAreaProviderManager safeAreaProviderManager, com.facebook.react.uimanager.events.d dVar) {
            this.f28445a = dVar;
        }

        @Override // com.th3rdwave.safeareacontext.e.a
        public void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar) {
            this.f28445a.g(new b(eVar.getId(), aVar, cVar));
        }
    }

    public SafeAreaProviderManager(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private Map<String, Object> getInitialWindowMetrics() {
        ViewGroup viewGroup;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView()) == null) {
            return null;
        }
        View findViewById = viewGroup.findViewById(16908290);
        com.th3rdwave.safeareacontext.a c10 = f.c(viewGroup);
        c a10 = f.a(viewGroup, findViewById);
        if (c10 == null || a10 == null) {
            return null;
        }
        return h6.e.e("insets", l.a(c10), "frame", l.c(a10));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return h6.e.a().b("topInsetsChange", h6.e.d("registrationName", "onInsetsChange")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return h6.e.d("initialWindowMetrics", getInitialWindowMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, e eVar) {
        eVar.setOnInsetsChangeListener(new a(this, ((UIManagerModule) n0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(n0 n0Var) {
        return new e(n0Var);
    }
}
