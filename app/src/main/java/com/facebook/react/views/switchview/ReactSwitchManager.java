package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import c7.g;
import c7.h;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fm.castbox.mediation.BuildConfig;

/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> implements h<com.facebook.react.views.switchview.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final a1<com.facebook.react.views.switchview.a> mDelegate = new g(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id2 = compoundButton.getId();
            t0.c(reactContext, id2).g(new com.facebook.react.views.switchview.b(t0.e(reactContext), id2, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends j implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f16181z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void q1() {
            T0(this);
        }

        @Override // com.facebook.yoga.m
        public long c(p pVar, float f10, n nVar, float f11, n nVar2) {
            if (!this.B) {
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(U());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f16181z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f16181z, this.A);
        }

        private b() {
            q1();
        }
    }

    private static void setValueInternal(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setOnCheckedChangeListener(null);
        aVar.t(z10);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a1<com.facebook.react.views.switchview.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, n nVar, float f11, n nVar2, float[] fArr) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(r.a(aVar.getMeasuredWidth()), r.a(aVar.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.switchview.a createViewInstance(n0 n0Var) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(n0Var);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.switchview.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z10 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z10 = true;
            }
            setValueInternal(aVar, z10);
        }
    }

    @Override // c7.h
    @w6.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setEnabled(!z10);
    }

    @Override // c7.h
    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "enabled")
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @Override // c7.h
    public void setNativeValue(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @Override // c7.h
    @w6.a(name = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }

    @Override // c7.h
    @w6.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.u(num);
    }

    @Override // c7.h
    @w6.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // c7.h
    @w6.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.x(num);
    }

    @Override // c7.h
    @w6.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.y(num);
    }

    @Override // c7.h
    @w6.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.v(num);
    }

    @Override // c7.h
    @w6.a(name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    public void setValue(com.facebook.react.views.switchview.a aVar, boolean z10) {
        setValueInternal(aVar, z10);
    }
}
