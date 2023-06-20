package com.amazon.device.ads;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DTBAdMRAIDBannerController extends DTBAdMRAIDController implements DTBMRAIDCloseButtonListener {
    private static final int ANIMATION_DURATION = 500;
    private static List<WeakReference<DTBAdMRAIDBannerController>> bannerControllers = new ArrayList();
    private static AtomicInteger indexDispencer = new AtomicInteger(100);
    private ObjectAnimator animater;
    private float animationProgress;
    DTBAdBannerListener bannerListener;
    private ViewGroup defaultParent;
    private AnimationPoint endAnimation;
    private ViewGroup expandedBackground;
    private int index;
    private int originalHeight;
    private ViewGroup.LayoutParams originalParams;
    private int originalWidth;
    private float originalX;
    private int originalXPos;
    private float originalY;
    private int originalYPos;
    private AnimationPoint startAnimation;

    /* loaded from: classes.dex */
    public class AnimationPoint {
        int height;
        int width;
        int xPos;
        int yPos;

        AnimationPoint(int i10, int i11, int i12, int i13) {
            DTBAdMRAIDBannerController.this = r1;
            this.xPos = i10;
            this.yPos = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    /* loaded from: classes.dex */
    public class BackgroundView extends LinearLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        BackgroundView(Context context) {
            super(context);
            DTBAdMRAIDBannerController.this = r1;
            setOrientation(1);
        }
    }

    /* loaded from: classes.dex */
    class ExpandedBannerListener implements DTBAdExpandedListener {
        ExpandedBannerListener() {
            DTBAdMRAIDBannerController.this = r1;
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onAdLoaded(DTBAdView dTBAdView) {
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.this);
        }
    }

    public DTBAdMRAIDBannerController(DTBAdView dTBAdView, DTBAdBannerListener dTBAdBannerListener) {
        super(dTBAdView);
        this.index = indexDispencer.incrementAndGet();
        this.bannerListener = dTBAdBannerListener;
        this.customButtonListener = this;
    }

    public static /* synthetic */ void e(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, Map map) {
        dTBAdMRAIDBannerController.lambda$expand$7(map);
    }

    private void executeOnePartExpand(Map<String, Object> map) {
        int i10;
        final boolean z10;
        int intValue;
        int intValue2;
        this.originalX = getAdView().getX();
        this.originalY = getAdView().getY();
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        if (rootView == null) {
            fireErrorEvent("expand", "rootview doesn't exist in one part expand");
            commandCompleted("expand");
            return;
        }
        int[] iArr = new int[2];
        getAdView().getLocationInWindow(iArr);
        this.defaultParent = (ViewGroup) getAdView().getParent();
        getAdView().setIgnoreDetachment();
        this.defaultParent.removeView(getAdView());
        int[] iArr2 = new int[2];
        rootView.getLocationInWindow(iArr2);
        int height = rootView.getHeight();
        final int width = rootView.getWidth();
        this.startAnimation = new AnimationPoint(iArr[0] - iArr2[0], iArr[1] - iArr2[1], getAdView().getWidth(), getAdView().getHeight());
        if (map.containsKey("position") && (map.get("position") instanceof Map)) {
            Map map2 = (Map) map.get("position");
            i10 = (!map2.containsKey("width") || (intValue2 = ((Integer) map2.get("width")).intValue()) <= 0) ? width : DTBAdUtil.sizeToDevicePixels(intValue2);
            if (map2.containsKey("height") && (intValue = ((Integer) map2.get("height")).intValue()) > 0) {
                height = DTBAdUtil.sizeToDevicePixels(intValue);
            }
            if (map2.containsKey("useCustomClose")) {
                z10 = ((Boolean) map2.get("useCustomClose")).booleanValue();
                BackgroundView backgroundView = new BackgroundView(getAdView().getContext());
                this.expandedBackground = backgroundView;
                backgroundView.setBackgroundColor(0);
                rootView.addView(backgroundView, -1, -1);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
                AnimationPoint animationPoint = this.startAnimation;
                marginLayoutParams.leftMargin = animationPoint.xPos;
                marginLayoutParams.topMargin = animationPoint.yPos;
                rootView.bringChildToFront(backgroundView);
                backgroundView.addView(getAdView(), marginLayoutParams);
                getAdView().setX(this.startAnimation.xPos);
                getAdView().setY(this.startAnimation.yPos);
                this.endAnimation = new AnimationPoint(0, 0, i10, height);
                setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(height));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
                this.animater = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.h
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DTBAdMRAIDBannerController.k(DTBAdMRAIDBannerController.this, width, z10, valueAnimator);
                    }
                });
                this.animater.setDuration(500L);
                this.animater.start();
            }
        } else {
            i10 = width;
        }
        z10 = false;
        BackgroundView backgroundView2 = new BackgroundView(getAdView().getContext());
        this.expandedBackground = backgroundView2;
        backgroundView2.setBackgroundColor(0);
        rootView.addView(backgroundView2, -1, -1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
        AnimationPoint animationPoint2 = this.startAnimation;
        marginLayoutParams2.leftMargin = animationPoint2.xPos;
        marginLayoutParams2.topMargin = animationPoint2.yPos;
        rootView.bringChildToFront(backgroundView2);
        backgroundView2.addView(getAdView(), marginLayoutParams2);
        getAdView().setX(this.startAnimation.xPos);
        getAdView().setY(this.startAnimation.yPos);
        this.endAnimation = new AnimationPoint(0, 0, i10, height);
        setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(height));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.k(DTBAdMRAIDBannerController.this, width, z10, valueAnimator);
            }
        });
        this.animater.setDuration(500L);
        this.animater.start();
    }

    private void executeTwoPartsExpand(Map<String, Object> map) {
        String str = (String) map.get(ImagesContract.URL);
        Activity activity = DTBAdUtil.getActivity(getAdView());
        Intent intent = new Intent(activity, DTBAdActivity.class);
        if (str != null) {
            intent.putExtra(ImagesContract.URL, str);
        }
        intent.putExtra("ad_state", "expanded");
        intent.putExtra("cntrl_index", this.index);
        intent.putExtra("two_part_expand", true);
        if (map.get(AdUnitActivity.EXTRA_ORIENTATION) != null) {
            intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, (Serializable) map.get(AdUnitActivity.EXTRA_ORIENTATION));
        }
        activity.startActivity(intent);
        commandCompleted("expand");
        setState(MraidStateType.EXPANDED);
        bannerControllers.add(new WeakReference<>(this));
    }

    public static /* synthetic */ void f(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, int i11, int i12, int i13, ValueAnimator valueAnimator) {
        dTBAdMRAIDBannerController.lambda$onResizeImpl$6(i10, i11, i12, i13, valueAnimator);
    }

    public static DTBAdMRAIDBannerController findControllerByIndex(int i10) {
        for (WeakReference<DTBAdMRAIDBannerController> weakReference : bannerControllers) {
            DTBAdMRAIDBannerController dTBAdMRAIDBannerController = weakReference.get();
            if (dTBAdMRAIDBannerController != null && dTBAdMRAIDBannerController.index == i10) {
                return dTBAdMRAIDBannerController;
            }
        }
        return null;
    }

    public static /* synthetic */ void g(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, View view) {
        dTBAdMRAIDBannerController.lambda$onAdClicked$14(view);
    }

    public static /* synthetic */ void h(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$updateResizedToDefaultListener$10();
    }

    public static /* synthetic */ void i(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$onAdLeftApplication$15();
    }

    private boolean isVisibleRecyclerOrListView(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        if (viewParent.toString().toLowerCase().contains("recyclerview") || viewParent.toString().toLowerCase().contains("listview")) {
            return true;
        }
        return isVisibleRecyclerOrListView(viewParent.getParent());
    }

    public static /* synthetic */ void j(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, boolean z10) {
        dTBAdMRAIDBannerController.lambda$moveResizedToDefault$0(i10, z10);
    }

    public static /* synthetic */ void k(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, boolean z10, ValueAnimator valueAnimator) {
        dTBAdMRAIDBannerController.lambda$executeOnePartExpand$8(i10, z10, valueAnimator);
    }

    public static /* synthetic */ void l(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$useCustomButtonUpdated$13();
    }

    public /* synthetic */ void lambda$executeOnePartExpand$8(int i10, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            addCloseIndicator(i10, 0, z10);
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
            setState(MraidStateType.EXPANDED);
            commandCompleted("expand");
            this.animater = null;
            getAdView().computeExposure(true);
        }
    }

    public /* synthetic */ void lambda$expand$7(Map map) {
        if (((String) map.get(ImagesContract.URL)) != null) {
            executeTwoPartsExpand(map);
        } else {
            executeOnePartExpand(map);
        }
    }

    public /* synthetic */ void lambda$moveExpandedToDefaultImpl$3(ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateExpandedToDefaultListener(viewGroup, z10);
        }
    }

    public /* synthetic */ void lambda$moveResizedToDefaultImpl$1(ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateResizedToDefaultListener(viewGroup, z10);
        }
    }

    public /* synthetic */ void lambda$onAdClicked$14(View view) {
        this.bannerListener.onAdClicked(view);
    }

    public /* synthetic */ void lambda$onAdLeftApplication$15() {
        this.bannerListener.onAdOpen(this.adView);
        this.bannerListener.onAdLeftApplication(this.adView);
    }

    public /* synthetic */ void lambda$onMRAIDUnload$4() {
        getAdView().loadUrl("about:blank");
        commandCompleted("unload");
    }

    public /* synthetic */ void lambda$onResizeImpl$6(int i10, int i11, int i12, int i13, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            addCloseIndicator(i12 + i10, i13);
            commandCompleted("resize");
            setState(MraidStateType.RESIZED);
            this.animater = null;
            getAdView().computeExposure(true);
        }
    }

    public /* synthetic */ void lambda$updateExpandedToDefaultListener$11() {
        getAdView().loadUrl("about:blank");
        commandCompleted("unload");
    }

    public /* synthetic */ void lambda$updateExpandedToDefaultListener$12() {
        getAdView().computeExposure(true);
    }

    public /* synthetic */ void lambda$updateResizedToDefaultListener$10() {
        getAdView().computeExposure(true);
    }

    public /* synthetic */ void lambda$updateResizedToDefaultListener$9() {
        getAdView().loadUrl("about:blank");
        commandCompleted("unload");
    }

    public /* synthetic */ void lambda$useCustomButtonUpdated$13() {
        this.closeIndicatorRegion.setVisibility(this.useCustomClose ? 4 : 0);
    }

    public static /* synthetic */ void m(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        dTBAdMRAIDBannerController.lambda$moveExpandedToDefaultImpl$3(viewGroup, z10, valueAnimator);
    }

    private void moveExpandedToDefault() {
        moveExpandedToDefault(ANIMATION_DURATION, false);
    }

    /* renamed from: moveExpandedToDefaultImpl */
    public void lambda$moveExpandedToDefault$2(int i10, final boolean z10) {
        ViewGroup viewGroup;
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        final ViewGroup viewGroup2 = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.m(DTBAdMRAIDBannerController.this, viewGroup2, z10, valueAnimator);
            }
        });
        this.animater.setDuration(i10);
        this.animater.start();
    }

    private void moveResizedToDefault() {
        moveResizedToDefault(ANIMATION_DURATION, false);
    }

    /* renamed from: moveResizedToDefaultImpl */
    public void lambda$moveResizedToDefault$0(int i10, final boolean z10) {
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        animationPoint.height = this.originalHeight;
        animationPoint.width = this.originalWidth;
        animationPoint.xPos = this.originalXPos;
        animationPoint.yPos = this.originalYPos;
        final ViewGroup viewGroup = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null) {
            viewGroup.removeView(linearLayout);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.t(DTBAdMRAIDBannerController.this, viewGroup, z10, valueAnimator);
            }
        });
        this.animater.setDuration(i10);
        this.animater.start();
    }

    public static /* synthetic */ void n(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$onMRAIDUnload$4();
    }

    public static /* synthetic */ void o(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$updateExpandedToDefaultListener$12();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* renamed from: onResizeImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$onResize$5(int r16, int r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDBannerController.lambda$onResize$5(int, int, int, int, boolean):void");
    }

    public static /* synthetic */ void p(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$updateExpandedToDefaultListener$11();
    }

    public static /* synthetic */ void q(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, int i11, int i12, int i13, boolean z10) {
        dTBAdMRAIDBannerController.lambda$onResize$5(i10, i11, i12, i13, z10);
    }

    public static /* synthetic */ void r(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, boolean z10) {
        dTBAdMRAIDBannerController.lambda$moveExpandedToDefault$2(i10, z10);
    }

    public static /* synthetic */ void s(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.lambda$updateResizedToDefaultListener$9();
    }

    public static /* synthetic */ void t(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        dTBAdMRAIDBannerController.lambda$moveResizedToDefaultImpl$1(viewGroup, z10, valueAnimator);
    }

    private Float updateAdViewLayout(ValueAnimator valueAnimator) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = getAdView().getLayoutParams();
        DTBAdView adView = getAdView();
        int i10 = this.startAnimation.xPos;
        adView.setX(i10 + ((this.endAnimation.xPos - i10) * f10.floatValue()));
        DTBAdView adView2 = getAdView();
        int i11 = this.startAnimation.yPos;
        adView2.setY(i11 + ((this.endAnimation.yPos - i11) * f10.floatValue()));
        int i12 = this.startAnimation.width;
        layoutParams.width = (int) (i12 + ((this.endAnimation.width - i12) * f10.floatValue()));
        int i13 = this.startAnimation.height;
        layoutParams.height = (int) (i13 + ((this.endAnimation.height - i13) * f10.floatValue()));
        getAdView().setLayoutParams(layoutParams);
        getAdView().invalidate();
        return f10;
    }

    private void updateExpandedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        ViewGroup viewGroup2 = this.expandedBackground;
        if (viewGroup2 != null) {
            ((ViewGroup) viewGroup2.getParent()).removeView(this.expandedBackground);
            this.expandedBackground = null;
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.height));
        }
        this.defaultParent.addView(getAdView(), this.originalParams);
        this.defaultParent.requestLayout();
        setCurrentPositionProperty();
        setState(MraidStateType.DEFAULT);
        commandCompleted("close");
        this.defaultParent = null;
        this.animater = null;
        if (z10) {
            new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.p
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.p(DTBAdMRAIDBannerController.this);
                }
            }, 500L);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.o
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.o(DTBAdMRAIDBannerController.this);
            }
        }, 100L);
    }

    private void updateResizedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        this.defaultParent.addView(getAdView(), this.originalParams);
        this.defaultParent.requestLayout();
        getAdView().invalidate();
        setCurrentPositionProperty();
        this.defaultParent = null;
        fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
        setState(MraidStateType.DEFAULT);
        this.animater = null;
        commandCompleted("close");
        if (z10) {
            new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.b
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.s(DTBAdMRAIDBannerController.this);
                }
            }, 500L);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.k
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.h(DTBAdMRAIDBannerController.this);
            }
        }, 100L);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void closeExpandedPartTwo() {
        setState(MraidStateType.DEFAULT);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void expand(final Map<String, Object> map) {
        if (!this.state.equals(MraidStateType.DEFAULT)) {
            fireErrorEvent("expand", "current state does not allow transition to expand");
            commandCompleted("expand");
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.e(DTBAdMRAIDBannerController.this, map);
            }
        });
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected String getPlacementType() {
        return "inline";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        this.bannerListener.onImpressionFired(this.adView);
        super.impressionFired();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        this.bannerListener.onAdClosed(this.adView);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        final DTBAdView dTBAdView = this.adView;
        if (this.bannerListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.g(DTBAdMRAIDBannerController.this, dTBAdView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.l
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.i(DTBAdMRAIDBannerController.this);
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdRemoved() {
        ViewGroup viewGroup;
        super.onAdRemoved();
        removeCloseIndicator();
        ObjectAnimator objectAnimator = this.animater;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        if (!isVisibleRecyclerOrListView(this.adView.getParent())) {
            this.adView.setVisibility(8);
        }
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            ViewParent parent = this.adView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.adView);
            }
        } else if (mraidStateType == MraidStateType.EXPANDED && (viewGroup = this.expandedBackground) != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.expandedBackground.getParent()).removeView(this.expandedBackground);
        }
    }

    protected boolean onBackPressed() {
        return false;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDClose() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault();
        } else if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault();
        } else if (mraidStateType == MraidStateType.DEFAULT) {
            setState(MraidStateType.HIDDEN);
            commandCompleted("close");
        } else {
            fireErrorEvent("close", "Command is not allowed in a given ad state:" + this.state.toString());
            commandCompleted("close");
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDUnload() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault(10, true);
        } else if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault(10, true);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.n
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.n(DTBAdMRAIDBannerController.this);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        try {
            if (!this.pageLoaded) {
                prepareMraid();
                this.bannerListener.onAdLoaded(getAdView());
            }
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
        this.originalParams = getAdView().getLayoutParams();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onResize(Map<String, Object> map) {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType != MraidStateType.DEFAULT && mraidStateType != MraidStateType.RESIZED) {
            fireErrorEvent("resize", "invalid current state");
            commandCompleted("resize");
            return;
        }
        try {
            final int intValue = map.containsKey("offsetX") ? ((Integer) map.get("offsetX")).intValue() : 0;
            final int intValue2 = map.containsKey("offsetY") ? ((Integer) map.get("offsetY")).intValue() : 0;
            final int intValue3 = ((Integer) map.get("width")).intValue();
            final int intValue4 = ((Integer) map.get("height")).intValue();
            final boolean booleanValue = ((Boolean) map.get("allowOffscreen")).booleanValue();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.q(DTBAdMRAIDBannerController.this, intValue, intValue2, intValue3, intValue4, booleanValue);
                }
            });
        } catch (Exception unused) {
            fireErrorEvent("resize", "invalid input parameters");
            commandCompleted("resize");
        }
    }

    void openExpanded() {
        setState(MraidStateType.EXPANDED);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void passLoadError() {
        this.bannerListener.onAdFailed(this.adView);
    }

    public void setAnimationProgress(float f10) {
        this.animationProgress = f10;
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        if (this.state != MraidStateType.EXPANDED || this.closeIndicatorRegion == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.m
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.l(DTBAdMRAIDBannerController.this);
            }
        });
    }

    private void moveExpandedToDefault(final int i10, final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.r(DTBAdMRAIDBannerController.this, i10, z10);
            }
        });
    }

    private void moveResizedToDefault(final int i10, final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.j(DTBAdMRAIDBannerController.this, i10, z10);
            }
        });
    }
}
