package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import c7.c;
import c7.d;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import java.util.WeakHashMap;

@o6.a(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<a, b> implements d<a> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_ATTR = "typeAttr";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> mMeasuredStyles = new WeakHashMap<>();
    private final a1<a> mDelegate = new c(this);

    public static ProgressBar createProgressBar(Context context, int i10) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i10);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStyleFromString(String str) {
        if (str != null) {
            if (str.equals("Horizontal")) {
                return 16842872;
            }
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
        }
        throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a1<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, n nVar, float f11, n nVar2, float[] fArr) {
        Integer valueOf = Integer.valueOf(getStyleFromString(readableMap2.getString(PROP_STYLE)));
        Pair<Integer, Integer> pair = this.mMeasuredStyles.get(valueOf);
        if (pair == null) {
            ProgressBar createProgressBar = createProgressBar(context, valueOf.intValue());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            pair = Pair.create(Integer.valueOf(createProgressBar.getMeasuredWidth()), Integer.valueOf(createProgressBar.getMeasuredHeight()));
            this.mMeasuredStyles.put(valueOf, pair);
        }
        return o.a(r.a(((Integer) pair.first).intValue()), r.a(((Integer) pair.second).intValue()));
    }

    @Override // c7.d
    @w6.a(name = PROP_ATTR)
    public void setTypeAttr(a aVar, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.a();
    }

    @Override // c7.d
    @w6.a(name = PROP_ANIMATING)
    public void setAnimating(a aVar, boolean z10) {
        aVar.b(z10);
    }

    @Override // c7.d
    @w6.a(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        aVar.d(num);
    }

    @Override // c7.d
    @w6.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(a aVar, boolean z10) {
        aVar.e(z10);
    }

    @Override // c7.d
    @w6.a(name = "progress")
    public void setProgress(a aVar, double d10) {
        aVar.f(d10);
    }

    @Override // c7.d
    @w6.a(name = PROP_STYLE)
    public void setStyleAttr(a aVar, String str) {
        aVar.g(str);
    }

    @Override // c7.d
    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }
}
