package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<o, m> implements com.facebook.react.uimanager.g {
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected p mReactTextViewManagerCallback;

    private Object getReactTextUpdate(o oVar, f0 f0Var, ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer o10 = readableMapBuffer.o(0);
        ReadableMapBuffer o11 = readableMapBuffer.o(1);
        Spannable d10 = y.d(oVar.getContext(), o10, this.mReactTextViewManagerCallback);
        oVar.setSpanned(d10);
        return new n(d10, -1, false, t.m(f0Var, y.e(o10)), t.n(o11.q(2)), t.i(f0Var));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.e("topTextLayout", h6.e.d("registrationName", "onTextLayout"), "topInlineViewLayout", h6.e.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<m> getShadowNodeClass() {
        return m.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.n nVar, float f11, com.facebook.yoga.n nVar2, float[] fArr) {
        return x.h(context, readableMap, readableMap2, f10, nVar, f11, nVar2, this.mReactTextViewManagerCallback, fArr);
    }

    @Override // com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(n0 n0Var) {
        return new o(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(o oVar) {
        super.onAfterUpdateTransaction((ReactTextViewManager) oVar);
        oVar.l();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(o oVar, int i10, int i11, int i12, int i13) {
        oVar.setPadding(i10, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(o oVar, Object obj) {
        n nVar = (n) obj;
        if (nVar.b()) {
            v.g(nVar.k(), oVar);
        }
        oVar.setText(nVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(o oVar, f0 f0Var, m0 m0Var) {
        ReadableMapBuffer c10;
        if (m0Var == null) {
            return null;
        }
        if (ReactFeatureFlags.isMapBufferSerializationEnabled() && (c10 = m0Var.c()) != null) {
            return getReactTextUpdate(oVar, f0Var, c10);
        }
        ReadableNativeMap b10 = m0Var.b();
        if (b10 == null) {
            return null;
        }
        ReadableNativeMap map = b10.getMap("attributedString");
        ReadableNativeMap map2 = b10.getMap("paragraphAttributes");
        Spannable e10 = x.e(oVar.getContext(), map, this.mReactTextViewManagerCallback);
        oVar.setSpanned(e10);
        return new n(e10, b10.hasKey("mostRecentEventCount") ? b10.getInt("mostRecentEventCount") : -1, false, t.m(f0Var, x.f(map)), t.n(map2.getString("textBreakStrategy")), t.i(f0Var));
    }

    public m createShadowNodeInstance(p pVar) {
        return new m(pVar);
    }
}
