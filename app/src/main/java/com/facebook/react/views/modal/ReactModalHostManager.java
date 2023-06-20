package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import c7.i;
import c7.j;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.modal.d;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactModalHostManager extends ViewGroupManager<d> implements j<d> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final a1<d> mDelegate = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f16122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f16123b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f16124c;

        a(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, n0 n0Var, d dVar2) {
            this.f16122a = dVar;
            this.f16123b = n0Var;
            this.f16124c = dVar2;
        }

        @Override // com.facebook.react.views.modal.d.c
        public void a(DialogInterface dialogInterface) {
            this.f16122a.g(new e(t0.e(this.f16123b), this.f16124c.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f16125a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f16126b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f16127c;

        b(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, n0 n0Var, d dVar2) {
            this.f16125a = dVar;
            this.f16126b = n0Var;
            this.f16127c = dVar2;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f16125a.g(new f(t0.e(this.f16126b), this.f16127c.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a1<d> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.a().b("topRequestClose", h6.e.d("registrationName", "onRequestClose")).b("topShow", h6.e.d("registrationName", "onShow")).b("topDismiss", h6.e.d("registrationName", "onDismiss")).b("topOrientationChange", h6.e.d("registrationName", "onOrientationChange")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.j> getShadowNodeClass() {
        return com.facebook.react.views.modal.b.class;
    }

    @Override // c7.j
    @w6.a(name = "animated")
    public void setAnimated(d dVar, boolean z10) {
    }

    @Override // c7.j
    @w6.a(name = "identifier")
    public void setIdentifier(d dVar, int i10) {
    }

    @Override // c7.j
    @w6.a(name = "presentationStyle")
    public void setPresentationStyle(d dVar, String str) {
    }

    @Override // c7.j
    @w6.a(name = "supportedOrientations")
    public void setSupportedOrientations(d dVar, ReadableArray readableArray) {
    }

    @Override // c7.j
    @w6.a(name = "visible")
    public void setVisible(d dVar, boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, d dVar) {
        com.facebook.react.uimanager.events.d c10 = t0.c(n0Var, dVar.getId());
        if (c10 != null) {
            dVar.setOnRequestCloseListener(new a(this, c10, n0Var, dVar));
            dVar.setOnShowListener(new b(this, c10, n0Var, dVar));
            dVar.setEventDispatcher(c10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.j createShadowNodeInstance() {
        return new com.facebook.react.views.modal.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(d dVar) {
        super.onAfterUpdateTransaction((ReactModalHostManager) dVar);
        dVar.d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(d dVar) {
        super.onDropViewInstance((ReactModalHostManager) dVar);
        dVar.c();
    }

    @Override // c7.j
    @w6.a(name = "animationType")
    public void setAnimationType(d dVar, String str) {
        if (str != null) {
            dVar.setAnimationType(str);
        }
    }

    @Override // c7.j
    @w6.a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(d dVar, boolean z10) {
        dVar.setHardwareAccelerated(z10);
    }

    @Override // c7.j
    @w6.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(d dVar, boolean z10) {
        dVar.setStatusBarTranslucent(z10);
    }

    @Override // c7.j
    @w6.a(name = "transparent")
    public void setTransparent(d dVar, boolean z10) {
        dVar.setTransparent(z10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d dVar, f0 f0Var, m0 m0Var) {
        dVar.getFabricViewStateManager().e(m0Var);
        Point a10 = com.facebook.react.views.modal.a.a(dVar.getContext());
        dVar.f(a10.x, a10.y);
        return null;
    }
}
