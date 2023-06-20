package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;

/* compiled from: BaseViewManagerDelegate.java */
/* loaded from: classes.dex */
public abstract class a<T extends View, U extends b<T>> implements a1<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final U f15748a;

    public a(U u10) {
        this.f15748a = u10;
    }

    @Override // com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c10 = 4;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 5;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 6;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c10 = 7;
                    break;
                }
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    c10 = 11;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c10 = 15;
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c10 = 16;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c10 = 17;
                    break;
                }
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c10 = 19;
                    break;
                }
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1865277756:
                if (str.equals("accessibilityLabelledBy")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    c10 = 26;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f15748a.setTranslateX(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 1:
                this.f15748a.setTranslateY(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 2:
                this.f15748a.setShadowColor(t10, obj != null ? ColorPropConverter.getColor(obj, t10.getContext()).intValue() : 0);
                return;
            case 3:
                this.f15748a.setOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 4:
                this.f15748a.setBorderTopLeftRadius(t10, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 5:
                this.f15748a.setScaleX(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 6:
                this.f15748a.setScaleY(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 7:
                this.f15748a.setTestId(t10, (String) obj);
                return;
            case '\b':
                this.f15748a.setZIndex(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case '\t':
                this.f15748a.setAccessibilityHint(t10, (String) obj);
                return;
            case '\n':
                this.f15748a.setAccessibilityRole(t10, (String) obj);
                return;
            case 11:
                this.f15748a.setRenderToHardwareTexture(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\f':
                this.f15748a.setRotation(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case '\r':
                this.f15748a.setElevation(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                return;
            case 14:
                this.f15748a.setAccessibilityLiveRegion(t10, (String) obj);
                return;
            case 15:
                this.f15748a.setBorderTopRightRadius(t10, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 16:
                this.f15748a.setBorderBottomLeftRadius(t10, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 17:
                this.f15748a.setBorderBottomRightRadius(t10, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 18:
                this.f15748a.setImportantForAccessibility(t10, (String) obj);
                return;
            case 19:
                this.f15748a.setTransform(t10, (ReadableArray) obj);
                return;
            case 20:
                this.f15748a.setAccessibilityLabel(t10, (String) obj);
                return;
            case 21:
                this.f15748a.setViewState(t10, (ReadableMap) obj);
                return;
            case 22:
                this.f15748a.setBackgroundColor(t10, obj != null ? ColorPropConverter.getColor(obj, t10.getContext()).intValue() : 0);
                return;
            case 23:
                this.f15748a.setBorderRadius(t10, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 24:
                this.f15748a.setAccessibilityActions(t10, (ReadableArray) obj);
                return;
            case 25:
                this.f15748a.setAccessibilityLabelledBy(t10, (Dynamic) obj);
                return;
            case 26:
                this.f15748a.setNativeId(t10, (String) obj);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a1
    public void b(T t10, String str, ReadableArray readableArray) {
    }
}
