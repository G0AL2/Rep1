package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.z;
import c7.k;
import c7.l;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.t0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fm.castbox.mediation.BuildConfig;
import h6.e;
import i0.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<com.facebook.react.views.slider.a> implements l<com.facebook.react.views.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;
    private final a1<com.facebook.react.views.slider.a> mDelegate = new k(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            d c10 = t0.c((ReactContext) seekBar.getContext(), seekBar.getId());
            if (c10 != null) {
                c10.g(new com.facebook.react.views.slider.b(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).b(i10), z10));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d c10 = t0.c((ReactContext) seekBar.getContext(), seekBar.getId());
            if (c10 != null) {
                c10.g(new com.facebook.react.views.slider.c(t0.f(seekBar), seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).b(seekBar.getProgress())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public class b extends t {
        protected b(ReactSliderManager reactSliderManager) {
        }

        private boolean r(int i10) {
            return i10 == c.a.f31494i.b() || i10 == c.a.f31495j.b() || i10 == c.a.f31501p.b();
        }

        @Override // com.facebook.react.uimanager.t, androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (r(i10)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean j10 = super.j(view, i10, bundle);
            if (r(i10)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends j implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f16168z;

        /* synthetic */ c(a aVar) {
            this();
        }

        private void q1() {
            T0(this);
        }

        @Override // com.facebook.yoga.m
        public long c(p pVar, float f10, n nVar, float f11, n nVar2) {
            if (!this.B) {
                com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(U(), null, ReactSliderManager.STYLE);
                aVar.a();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f16168z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f16168z, this.A);
        }

        private c() {
            q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a1<com.facebook.react.views.slider.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(e.a().b("topValueChange", e.d("phasedRegistrationNames", e.e("bubbled", "onValueChange", "captured", "onValueChangeCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(e.d("topSlidingComplete", e.d("registrationName", "onSlidingComplete")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, n nVar, float f11, n nVar2, float[] fArr) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(context, null, STYLE);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(r.a(aVar.getMeasuredWidth()), r.a(aVar.getMeasuredHeight()));
    }

    @Override // c7.l
    @w6.a(name = "disabled")
    public void setDisabled(com.facebook.react.views.slider.a aVar, boolean z10) {
    }

    @Override // c7.l
    @w6.a(customType = "ImageSource", name = "maximumTrackImage")
    public void setMaximumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // c7.l
    @w6.a(customType = "ImageSource", name = "minimumTrackImage")
    public void setMinimumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // c7.l
    @w6.a(customType = "ImageSource", name = "thumbImage")
    public void setThumbImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // c7.l
    @w6.a(customType = "ImageSource", name = "trackImage")
    public void setTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new c(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.slider.a createViewInstance(n0 n0Var) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(n0Var, null, STYLE);
        z.q0(aVar, new b(this));
        return aVar;
    }

    @Override // c7.l
    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "enabled")
    public void setEnabled(com.facebook.react.views.slider.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @Override // c7.l
    @w6.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // c7.l
    @w6.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.facebook.react.views.slider.a aVar, double d10) {
        aVar.setMaxValue(d10);
    }

    @Override // c7.l
    @w6.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // c7.l
    @w6.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.facebook.react.views.slider.a aVar, double d10) {
        aVar.setMinValue(d10);
    }

    @Override // c7.l
    @w6.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.facebook.react.views.slider.a aVar, double d10) {
        aVar.setStep(d10);
    }

    @Override // c7.l
    public void setTestID(com.facebook.react.views.slider.a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // c7.l
    @w6.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // c7.l
    @w6.a(defaultDouble = 0.0d, name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    public void setValue(com.facebook.react.views.slider.a aVar, double d10) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d10);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
