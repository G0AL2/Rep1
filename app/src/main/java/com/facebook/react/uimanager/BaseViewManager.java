package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends j> extends ViewManager<T, C> implements b<T> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    public static final Map<String, Integer> sStateDescription;
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static k.a sMatrixDecompositionContext = new k.a();
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(STATE_BUSY, Integer.valueOf(com.facebook.react.h.f15421n));
        hashMap.put(STATE_EXPANDED, Integer.valueOf(com.facebook.react.h.f15423p));
        hashMap.put("collapsed", Integer.valueOf(com.facebook.react.h.f15422o));
    }

    private void logUnsupportedPropertyWarning(String str) {
        z3.a.I("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(r.c(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(r.c(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 < -3.4028235E38f || f10 > Float.MAX_VALUE) {
            if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
                return -3.4028235E38f;
            }
            if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
                return Float.MAX_VALUE;
            }
            if (Float.isNaN(f10)) {
                return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            throw new IllegalStateException("Invalid float property value: " + f10);
        }
        return f10;
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.a();
        p0.b(readableArray, sTransformDecompositionArray);
        k.k(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(r.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15872d[0])));
        view.setTranslationY(r.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15872d[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15873e[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15873e[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15873e[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15870b[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f15870b[1]));
        double[] dArr = sMatrixDecompositionContext.f15869a;
        if (dArr.length > 2) {
            float f10 = (float) dArr[2];
            if (f10 == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = c.c().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t10) {
        t.o(t10);
    }

    private void updateViewContentDescription(T t10) {
        Dynamic dynamic;
        int i10;
        String str = (String) t10.getTag(com.facebook.react.g.f15398c);
        ReadableMap readableMap = (ReadableMap) t10.getTag(com.facebook.react.g.f15400e);
        String str2 = (String) t10.getTag(com.facebook.react.g.f15397b);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(com.facebook.react.g.f15401f);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(com.facebook.react.h.f15424q));
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(com.facebook.react.h.f15421n));
                } else if (nextKey.equals(STATE_EXPANDED) && dynamic2.getType() == ReadableType.Boolean) {
                    Context context = t10.getContext();
                    if (dynamic2.asBoolean()) {
                        i10 = com.facebook.react.h.f15423p;
                    } else {
                        i10 = com.facebook.react.h.f15422o;
                    }
                    arrayList.add(context.getString(i10));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t10.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.a().b("topAccessibilityAction", h6.e.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t10.setTag(com.facebook.react.g.f15396a, readableArray);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t10, String str) {
        t10.setTag(com.facebook.react.g.f15397b, str);
        updateViewContentDescription(t10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t10, String str) {
        t10.setTag(com.facebook.react.g.f15398c, str);
        updateViewContentDescription(t10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t10, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t10.setTag(com.facebook.react.g.f15402g, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t10.setTag(com.facebook.react.g.f15402g, dynamic.asArray().getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t10, String str) {
        if (str != null && !str.equals("none")) {
            if (str.equals("polite")) {
                androidx.core.view.z.s0(t10, 1);
                return;
            } else if (str.equals("assertive")) {
                androidx.core.view.z.s0(t10, 2);
                return;
            } else {
                return;
            }
        }
        androidx.core.view.z.s0(t10, 0);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t10, String str) {
        if (str == null) {
            return;
        }
        t10.setTag(com.facebook.react.g.f15399d, t.d.a(str));
    }

    @w6.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t10.setTag(com.facebook.react.g.f15401f, readableMap);
        if (readableMap.hasKey("text")) {
            updateViewContentDescription(t10);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t10, int i10) {
        t10.setBackgroundColor(i10);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "elevation")
    public void setElevation(T t10, float f10) {
        androidx.core.view.z.y0(t10, r.c(f10));
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t10, String str) {
        if (str != null && !str.equals("auto")) {
            if (str.equals("yes")) {
                androidx.core.view.z.A0(t10, 1);
                return;
            } else if (str.equals("no")) {
                androidx.core.view.z.A0(t10, 2);
                return;
            } else if (str.equals("no-hide-descendants")) {
                androidx.core.view.z.A0(t10, 4);
                return;
            } else {
                return;
            }
        }
        androidx.core.view.z.A0(t10, 0);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "nativeID")
    public void setNativeId(T t10, String str) {
        t10.setTag(com.facebook.react.g.f15407l, str);
        a7.a.c(t10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t10, float f10) {
        t10.setAlpha(f10);
    }

    @w6.a(name = "pointerenter")
    public void setPointerEnter(T t10, boolean z10) {
        t10.setTag(com.facebook.react.g.f15403h, Boolean.valueOf(z10));
    }

    @w6.a(name = "pointerleave")
    public void setPointerLeave(T t10, boolean z10) {
        t10.setTag(com.facebook.react.g.f15404i, Boolean.valueOf(z10));
    }

    @w6.a(name = "pointermove")
    public void setPointerMove(T t10, boolean z10) {
        t10.setTag(com.facebook.react.g.f15405j, Boolean.valueOf(z10));
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t10, boolean z10) {
        t10.setLayerType(z10 ? 2 : 0, null);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "rotation")
    @Deprecated
    public void setRotation(T t10, float f10) {
        t10.setRotation(f10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t10, float f10) {
        t10.setScaleX(f10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t10, float f10) {
        t10.setScaleY(f10);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "testID")
    public void setTestId(T t10, String str) {
        t10.setTag(com.facebook.react.g.f15406k, str);
        t10.setTag(str);
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "transform")
    public void setTransform(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t10);
        } else {
            setTransformProperty(t10, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateX")
    @Deprecated
    public void setTranslateX(T t10, float f10) {
        t10.setTranslationX(r.c(f10));
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateY")
    @Deprecated
    public void setTranslateY(T t10, float f10) {
        t10.setTranslationY(r.c(f10));
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "accessibilityState")
    public void setViewState(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("selected")) {
            boolean isSelected = t10.isSelected();
            boolean z10 = readableMap.getBoolean("selected");
            t10.setSelected(z10);
            if (t10.isAccessibilityFocused() && isSelected && !z10) {
                t10.announceForAccessibility(t10.getContext().getString(com.facebook.react.h.f15427t));
            }
        } else {
            t10.setSelected(false);
        }
        t10.setTag(com.facebook.react.g.f15400e, readableMap);
        t10.setEnabled(true);
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (!nextKey.equals(STATE_BUSY) && !nextKey.equals(STATE_EXPANDED) && (!nextKey.equals(STATE_CHECKED) || readableMap.getType(STATE_CHECKED) != ReadableType.String)) {
                if (t10.isAccessibilityFocused()) {
                    t10.sendAccessibilityEvent(1);
                }
            } else {
                updateViewContentDescription(t10);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.b
    @w6.a(name = "zIndex")
    public void setZIndex(T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof h0) {
            ((h0) parent).c();
        }
    }
}
