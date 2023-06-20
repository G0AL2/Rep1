package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.z;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.s;
import com.facebook.react.views.scroll.a;
import com.facebook.yoga.g;
import fm.castbox.mediation.BuildConfig;
import g7.e;
import g7.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<e> implements a.InterfaceC0218a<e> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private g7.a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return h6.e.a().b(b.a(b.SCROLL), h6.e.d("registrationName", "onScroll")).b(b.a(b.BEGIN_DRAG), h6.e.d("registrationName", "onScrollBeginDrag")).b(b.a(b.END_DRAG), h6.e.d("registrationName", "onScrollEndDrag")).b(b.a(b.MOMENTUM_BEGIN), h6.e.d("registrationName", "onMomentumScrollBegin")).b(b.a(b.MOMENTUM_END), h6.e.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return a.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(e eVar, int i10, Integer num) {
        eVar.w(SPACING_TYPES[i10], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(e eVar, int i10, float f10) {
        if (!g.a(f10)) {
            f10 = r.c(f10);
        }
        if (i10 == 0) {
            eVar.setBorderRadius(f10);
        } else {
            eVar.x(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(e eVar, int i10, float f10) {
        if (!g.a(f10)) {
            f10 = r.c(f10);
        }
        eVar.y(SPACING_TYPES[i10], f10);
    }

    @w6.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i10) {
        eVar.setEndFillColor(i10);
    }

    @w6.a(customType = "Point", name = "contentOffset")
    public void setContentOffset(e eVar, ReadableMap readableMap) {
        if (readableMap != null) {
            eVar.scrollTo((int) r.b(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) r.b(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            eVar.scrollTo(0, 0);
        }
    }

    @w6.a(name = "decelerationRate")
    public void setDecelerationRate(e eVar, float f10) {
        eVar.setDecelerationRate(f10);
    }

    @w6.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(e eVar, boolean z10) {
        eVar.setDisableIntervalMomentum(z10);
    }

    @w6.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(e eVar, int i10) {
        if (i10 > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i10);
            return;
        }
        eVar.setVerticalFadingEdgeEnabled(false);
        eVar.setFadingEdgeLength(0);
    }

    @w6.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z10) {
        z.C0(eVar, z10);
    }

    @w6.a(name = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(f.l(str));
    }

    @w6.a(name = "overflow")
    public void setOverflow(e eVar, String str) {
        eVar.setOverflow(str);
    }

    @w6.a(name = "pagingEnabled")
    public void setPagingEnabled(e eVar, boolean z10) {
        eVar.setPagingEnabled(z10);
    }

    @w6.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(e eVar, boolean z10) {
        eVar.setScrollbarFadingEnabled(!z10);
    }

    @w6.a(name = "pointerEvents")
    public void setPointerEvents(e eVar, String str) {
        eVar.setPointerEvents(s.c(str));
    }

    @w6.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z10) {
        eVar.setRemoveClippedSubviews(z10);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z10) {
        eVar.setScrollEnabled(z10);
        eVar.setFocusable(z10);
    }

    @w6.a(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @w6.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z10) {
        eVar.setSendMomentumEvents(z10);
    }

    @w6.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(e eVar, boolean z10) {
        eVar.setVerticalScrollBarEnabled(z10);
    }

    @w6.a(name = "snapToAlignment")
    public void setSnapToAlignment(e eVar, String str) {
        eVar.setSnapToAlignment(f.m(str));
    }

    @w6.a(name = "snapToEnd")
    public void setSnapToEnd(e eVar, boolean z10) {
        eVar.setSnapToEnd(z10);
    }

    @w6.a(name = "snapToInterval")
    public void setSnapToInterval(e eVar, float f10) {
        eVar.setSnapInterval((int) (f10 * c.c().density));
    }

    @w6.a(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, ReadableArray readableArray) {
        if (readableArray == null) {
            eVar.setSnapOffsets(null);
            return;
        }
        DisplayMetrics c10 = c.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * c10.density)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @w6.a(name = "snapToStart")
    public void setSnapToStart(e eVar, boolean z10) {
        eVar.setSnapToStart(z10);
    }

    public ReactScrollViewManager(g7.a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(n0 n0Var) {
        return new e(n0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void flashScrollIndicators(e eVar) {
        eVar.n();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void scrollTo(e eVar, a.b bVar) {
        if (bVar.f16159c) {
            eVar.u(bVar.f16157a, bVar.f16158b);
        } else {
            eVar.scrollTo(bVar.f16157a, bVar.f16158b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void scrollToEnd(e eVar, a.c cVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + eVar.getPaddingBottom();
            if (cVar.f16160a) {
                eVar.u(eVar.getScrollX(), height);
                return;
            } else {
                eVar.scrollTo(eVar.getScrollX(), height);
                return;
            }
        }
        throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(e eVar, f0 f0Var, m0 m0Var) {
        eVar.getFabricViewStateManager().e(m0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i10, ReadableArray readableArray) {
        a.b(this, eVar, i10, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        a.c(this, eVar, str, readableArray);
    }
}
