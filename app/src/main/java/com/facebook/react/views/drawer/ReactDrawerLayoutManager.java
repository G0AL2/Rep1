package com.facebook.react.views.drawer;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import c7.b;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import e7.c;
import h6.e;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<com.facebook.react.views.drawer.a> implements b<com.facebook.react.views.drawer.a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final a1<com.facebook.react.views.drawer.a> mDelegate = new c7.a(this);

    /* loaded from: classes.dex */
    public static class a implements DrawerLayout.d {

        /* renamed from: a  reason: collision with root package name */
        private final DrawerLayout f16083a;

        /* renamed from: b  reason: collision with root package name */
        private final d f16084b;

        public a(DrawerLayout drawerLayout, d dVar) {
            this.f16083a = drawerLayout;
            this.f16084b = dVar;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(View view) {
            this.f16084b.g(new e7.b(t0.f(this.f16083a), this.f16083a.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View view) {
            this.f16084b.g(new e7.a(t0.f(this.f16083a), this.f16083a.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void c(int i10) {
            this.f16084b.g(new e7.d(t0.f(this.f16083a), this.f16083a.getId(), i10));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View view, float f10) {
            this.f16084b.g(new c(t0.f(this.f16083a), this.f16083a.getId(), f10));
        }
    }

    private void setDrawerPositionInternal(com.facebook.react.views.drawer.a aVar, String str) {
        if (str.equals("left")) {
            aVar.X(8388611);
        } else if (str.equals("right")) {
            aVar.X(8388613);
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be 'left' or 'right', received" + str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e.e("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a1<com.facebook.react.views.drawer.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(e.g("topDrawerSlide", e.d("registrationName", "onDrawerSlide"), "topDrawerOpen", e.d("registrationName", "onDrawerOpen"), "topDrawerClose", e.d("registrationName", "onDrawerClose"), "topDrawerStateChanged", e.d("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return e.d("DrawerPosition", e.e("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // c7.b
    @w6.a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    @Override // c7.b
    @w6.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(com.facebook.react.views.drawer.a aVar, String str) {
    }

    @Override // c7.b
    @w6.a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.drawer.a aVar) {
        d c10 = t0.c(n0Var, aVar.getId());
        if (c10 == null) {
            return;
        }
        aVar.a(new a(aVar, c10));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.facebook.react.views.drawer.a aVar, View view, int i10) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i10 != 0 && i10 != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i10 + " instead.");
        }
        aVar.addView(view, i10);
        aVar.Y();
    }

    @Override // c7.b
    public void closeDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.drawer.a createViewInstance(n0 n0Var) {
        return new com.facebook.react.views.drawer.a(n0Var);
    }

    @Override // c7.b
    public void openDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.W();
    }

    @Override // c7.b
    @w6.a(name = "drawerLockMode")
    public void setDrawerLockMode(com.facebook.react.views.drawer.a aVar, String str) {
        if (str != null && !"unlocked".equals(str)) {
            if ("locked-closed".equals(str)) {
                aVar.setDrawerLockMode(1);
                return;
            } else if ("locked-open".equals(str)) {
                aVar.setDrawerLockMode(2);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
            }
        }
        aVar.setDrawerLockMode(0);
    }

    @Override // c7.b
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, String str) {
        if (str == null) {
            aVar.X(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @w6.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, float f10) {
        aVar.Z(Float.isNaN(f10) ? -1 : Math.round(r.c(f10)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setElevation(com.facebook.react.views.drawer.a aVar, float f10) {
        aVar.setDrawerElevation(r.c(f10));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            aVar.W();
        } else if (i10 != 2) {
        } else {
            aVar.V();
        }
    }

    @w6.a(name = "drawerPosition")
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.X(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 != asInt && 8388613 != asInt) {
                throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + asInt);
            }
            aVar.X(asInt);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            aVar.V();
        } else if (str.equals("openDrawer")) {
            aVar.W();
        }
    }

    @Override // c7.b
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, Float f10) {
        aVar.Z(f10 == null ? -1 : Math.round(r.c(f10.floatValue())));
    }
}
