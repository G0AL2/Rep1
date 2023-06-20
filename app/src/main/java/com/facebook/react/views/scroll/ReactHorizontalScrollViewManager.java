package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import androidx.core.view.z;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
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
import g7.d;
import g7.f;
import java.util.ArrayList;

@o6.a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements a.InterfaceC0218a<d> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private g7.a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(d dVar, int i10, Integer num) {
        dVar.B(SPACING_TYPES[i10], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(d dVar, int i10, float f10) {
        if (!g.a(f10)) {
            f10 = r.c(f10);
        }
        if (i10 == 0) {
            dVar.setBorderRadius(f10);
        } else {
            dVar.C(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderStyle")
    public void setBorderStyle(d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(d dVar, int i10, float f10) {
        if (!g.a(f10)) {
            f10 = r.c(f10);
        }
        dVar.D(SPACING_TYPES[i10], f10);
    }

    @w6.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i10) {
        dVar.setEndFillColor(i10);
    }

    @w6.a(name = "contentOffset")
    public void setContentOffset(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.scrollTo((int) r.b(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) r.b(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            dVar.scrollTo(0, 0);
        }
    }

    @w6.a(name = "decelerationRate")
    public void setDecelerationRate(d dVar, float f10) {
        dVar.setDecelerationRate(f10);
    }

    @w6.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(d dVar, boolean z10) {
        dVar.setDisableIntervalMomentum(z10);
    }

    @w6.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(d dVar, int i10) {
        if (i10 > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
            dVar.setFadingEdgeLength(i10);
            return;
        }
        dVar.setHorizontalFadingEdgeEnabled(false);
        dVar.setFadingEdgeLength(0);
    }

    @w6.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z10) {
        z.C0(dVar, z10);
    }

    @w6.a(name = "overScrollMode")
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(f.l(str));
    }

    @w6.a(name = "overflow")
    public void setOverflow(d dVar, String str) {
        dVar.setOverflow(str);
    }

    @w6.a(name = "pagingEnabled")
    public void setPagingEnabled(d dVar, boolean z10) {
        dVar.setPagingEnabled(z10);
    }

    @w6.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(d dVar, boolean z10) {
        dVar.setScrollbarFadingEnabled(!z10);
    }

    @w6.a(name = "pointerEvents")
    public void setPointerEvents(d dVar, String str) {
        dVar.setPointerEvents(s.c(str));
    }

    @w6.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z10) {
        dVar.setRemoveClippedSubviews(z10);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z10) {
        dVar.setScrollEnabled(z10);
    }

    @w6.a(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @w6.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z10) {
        dVar.setSendMomentumEvents(z10);
    }

    @w6.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z10) {
        dVar.setHorizontalScrollBarEnabled(z10);
    }

    @w6.a(name = "snapToAlignment")
    public void setSnapToAlignment(d dVar, String str) {
        dVar.setSnapToAlignment(f.m(str));
    }

    @w6.a(name = "snapToEnd")
    public void setSnapToEnd(d dVar, boolean z10) {
        dVar.setSnapToEnd(z10);
    }

    @w6.a(name = "snapToInterval")
    public void setSnapToInterval(d dVar, float f10) {
        dVar.setSnapInterval((int) (f10 * c.c().density));
    }

    @w6.a(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, ReadableArray readableArray) {
        if (readableArray == null) {
            dVar.setSnapOffsets(null);
            return;
        }
        DisplayMetrics c10 = c.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * c10.density)));
        }
        dVar.setSnapOffsets(arrayList);
    }

    @w6.a(name = "snapToStart")
    public void setSnapToStart(d dVar, boolean z10) {
        dVar.setSnapToStart(z10);
    }

    public ReactHorizontalScrollViewManager(g7.a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void flashScrollIndicators(d dVar) {
        dVar.o();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void scrollTo(d dVar, a.b bVar) {
        if (bVar.f16159c) {
            dVar.z(bVar.f16157a, bVar.f16158b);
        } else {
            dVar.scrollTo(bVar.f16157a, bVar.f16158b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0218a
    public void scrollToEnd(d dVar, a.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.f16160a) {
            dVar.z(width, dVar.getScrollY());
        } else {
            dVar.scrollTo(width, dVar.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d dVar, f0 f0Var, m0 m0Var) {
        dVar.getFabricViewStateManager().e(m0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i10, ReadableArray readableArray) {
        a.b(this, dVar, i10, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        a.c(this, dVar, str, readableArray);
    }
}
