package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.n0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fm.castbox.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReactSliderManager extends SimpleViewManager<com.reactnativecommunity.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RNCSlider";
    private static final int STYLE = 16842875;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new com.reactnativecommunity.slider.b(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).e(i10), z10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.c(true);
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new e(seekBar.getId(), aVar.e(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.c(false);
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new d(seekBar.getId(), aVar.e(seekBar.getProgress())));
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new com.reactnativecommunity.slider.b(seekBar.getId(), aVar.e(seekBar.getProgress()), false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends j implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f28320z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void q1() {
            T0(this);
        }

        @Override // com.facebook.yoga.m
        public long c(p pVar, float f10, n nVar, float f11, n nVar2) {
            if (!this.B) {
                com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(U(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f28320z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f28320z, this.A);
        }

        private b() {
            q1();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return h6.e.e("topSlidingComplete", h6.e.d("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", h6.e.d("registrationName", "onRNCSliderSlidingStart"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @w6.a(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(com.reactnativecommunity.slider.a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    @w6.a(name = "accessibilityUnits")
    public void setAccessibilityUnits(com.reactnativecommunity.slider.a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "enabled")
    public void setEnabled(com.reactnativecommunity.slider.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @w6.a(defaultBoolean = false, name = "inverted")
    public void setInverted(com.reactnativecommunity.slider.a aVar, boolean z10) {
        if (z10) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    @w6.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @w6.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.reactnativecommunity.slider.a aVar, double d10) {
        aVar.setMaxValue(d10);
    }

    @w6.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @w6.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.reactnativecommunity.slider.a aVar, double d10) {
        aVar.setMinValue(d10);
    }

    @w6.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.reactnativecommunity.slider.a aVar, double d10) {
        aVar.setStep(d10);
    }

    @w6.a(name = "thumbImage")
    public void setThumbImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    @w6.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        if (aVar.getThumb() != null) {
            if (num == null) {
                aVar.getThumb().clearColorFilter();
            } else {
                aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @w6.a(defaultDouble = 0.0d, name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    public void setValue(com.reactnativecommunity.slider.a aVar, double d10) {
        if (aVar.d()) {
            return;
        }
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d10);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
        if (!aVar.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        aVar.setupAccessibility((int) d10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.reactnativecommunity.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativecommunity.slider.a createViewInstance(n0 n0Var) {
        com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(n0Var, null, STYLE);
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setSplitTrack(false);
        }
        return aVar;
    }
}
