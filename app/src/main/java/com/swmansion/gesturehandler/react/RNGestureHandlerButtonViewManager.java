package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* loaded from: classes3.dex */
public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends ViewGroup {

        /* renamed from: j  reason: collision with root package name */
        static a f28409j;

        /* renamed from: a  reason: collision with root package name */
        int f28411a;

        /* renamed from: b  reason: collision with root package name */
        Integer f28412b;

        /* renamed from: c  reason: collision with root package name */
        Integer f28413c;

        /* renamed from: d  reason: collision with root package name */
        boolean f28414d;

        /* renamed from: e  reason: collision with root package name */
        boolean f28415e;

        /* renamed from: f  reason: collision with root package name */
        float f28416f;

        /* renamed from: g  reason: collision with root package name */
        boolean f28417g;

        /* renamed from: h  reason: collision with root package name */
        long f28418h;

        /* renamed from: i  reason: collision with root package name */
        static TypedValue f28408i = new TypedValue();

        /* renamed from: k  reason: collision with root package name */
        static View.OnClickListener f28410k = new View$OnClickListenerC0360a();

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class View$OnClickListenerC0360a implements View.OnClickListener {
            View$OnClickListenerC0360a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public a(Context context) {
            super(context);
            this.f28411a = 0;
            this.f28414d = false;
            this.f28415e = false;
            this.f28416f = 0.0f;
            this.f28417g = false;
            this.f28418h = 0L;
            setOnClickListener(f28410k);
            setClickable(true);
            setFocusable(true);
            this.f28417g = true;
        }

        private Drawable b(Drawable drawable) {
            Integer num;
            Integer num2 = this.f28412b;
            if (num2 != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num2.intValue()}));
            }
            if (Build.VERSION.SDK_INT >= 23 && (num = this.f28413c) != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) r.c(num.intValue()));
            }
            return drawable;
        }

        private Drawable c() {
            int i10 = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(d(getContext(), (!this.f28415e || i10 < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless"), f28408i, true);
            if (i10 >= 21) {
                return getResources().getDrawable(f28408i.resourceId, getContext().getTheme());
            }
            return getResources().getDrawable(f28408i.resourceId);
        }

        @TargetApi(21)
        private static int d(Context context, String str) {
            SoftAssertions.assertNotNull(str);
            if ("selectableItemBackground".equals(str)) {
                return 16843534;
            }
            if ("selectableItemBackgroundBorderless".equals(str)) {
                return 16843868;
            }
            return context.getResources().getIdentifier(str, "attr", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            if (this.f28417g) {
                this.f28417g = false;
                if (this.f28411a == 0) {
                    setBackground(null);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    setForeground(null);
                }
                if (this.f28414d && i10 >= 23) {
                    setForeground(b(c()));
                    int i11 = this.f28411a;
                    if (i11 != 0) {
                        setBackgroundColor(i11);
                    }
                } else if (this.f28411a == 0 && this.f28412b == null) {
                    setBackground(c());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.f28411a);
                    Drawable c10 = c();
                    float f10 = this.f28416f;
                    if (f10 != 0.0f) {
                        paintDrawable.setCornerRadius(f10);
                        if (i10 >= 21 && (c10 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f28416f);
                            ((RippleDrawable) c10).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    b(c10);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, c10}));
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f28409j;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        public void e(float f10) {
            this.f28416f = f10 * getResources().getDisplayMetrics().density;
            this.f28417g = true;
        }

        public void f(Integer num) {
            this.f28412b = num;
            this.f28417g = true;
        }

        public void g(Integer num) {
            this.f28413c = num;
            this.f28417g = true;
        }

        public void h(boolean z10) {
            this.f28415e = z10;
        }

        public void i(boolean z10) {
            this.f28414d = z10;
            this.f28417g = true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            long eventTime = motionEvent.getEventTime();
            long j10 = this.f28418h;
            if (j10 != eventTime || j10 == 0) {
                this.f28418h = eventTime;
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f28411a = i10;
            this.f28417g = true;
        }

        @Override // android.view.View
        public void setPressed(boolean z10) {
            if (z10 && f28409j == null) {
                f28409j = this;
            }
            if (!z10 || f28409j == this) {
                super.setPressed(z10);
            }
            if (z10 || f28409j != this) {
                return;
            }
            f28409j = null;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    @w6.a(name = "borderless")
    public void setBorderless(a aVar, boolean z10) {
        aVar.h(z10);
    }

    @w6.a(name = "enabled")
    public void setEnabled(a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @w6.a(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z10) {
        aVar.i(z10);
    }

    @w6.a(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        aVar.f(num);
    }

    @w6.a(name = "rippleRadius")
    public void setRippleRadius(a aVar, Integer num) {
        aVar.g(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.j();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @w6.a(name = "borderRadius")
    public void setBorderRadius(a aVar, float f10) {
        aVar.e(f10);
    }
}
