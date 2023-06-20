package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.s;
import com.facebook.react.uimanager.t0;
import java.util.Map;

@o6.a(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewManager extends ReactClippingViewManager<g> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f16381a;

        a(ReactViewManager reactViewManager, g gVar) {
            this.f16381a = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.facebook.react.uimanager.events.d c10 = t0.c((ReactContext) this.f16381a.getContext(), this.f16381a.getId());
            if (c10 == null) {
                return;
            }
            c10.g(new h(t0.e(this.f16381a.getContext()), this.f16381a.getId()));
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16382a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f16382a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16382a[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16382a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void handleHotspotUpdate(g gVar, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 2) {
            gVar.drawableHotspotChanged(r.b(readableArray.getDouble(0)), r.b(readableArray.getDouble(1)));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
    }

    private void handleSetPressed(g gVar, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 1) {
            gVar.setPressed(readableArray.getBoolean(0));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return h6.e.e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(g gVar, int i10) {
        gVar.setNextFocusDownId(i10);
    }

    @w6.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(g gVar, int i10) {
        gVar.setNextFocusForwardId(i10);
    }

    @w6.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(g gVar, int i10) {
        gVar.setNextFocusLeftId(i10);
    }

    @w6.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(g gVar, int i10) {
        gVar.setNextFocusRightId(i10);
    }

    @w6.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(g gVar, int i10) {
        gVar.setNextFocusUpId(i10);
    }

    @w6.a(name = "accessible")
    public void setAccessible(g gVar, boolean z10) {
        gVar.setFocusable(z10);
    }

    @w6.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(g gVar, String str) {
        gVar.setBackfaceVisibility(str);
    }

    @w6.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(g gVar, int i10, Integer num) {
        gVar.t(SPACING_TYPES[i10], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(g gVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10) && f10 < 0.0f) {
            f10 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = r.c(f10);
        }
        if (i10 == 0) {
            gVar.setBorderRadius(f10);
        } else {
            gVar.u(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderStyle")
    public void setBorderStyle(g gVar, String str) {
        gVar.setBorderStyle(str);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(g gVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10) && f10 < 0.0f) {
            f10 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = r.c(f10);
        }
        gVar.v(SPACING_TYPES[i10], f10);
    }

    @w6.a(name = "collapsable")
    public void setCollapsable(g gVar, boolean z10) {
    }

    @w6.a(name = "focusable")
    public void setFocusable(g gVar, boolean z10) {
        if (z10) {
            gVar.setOnClickListener(new a(this, gVar));
            gVar.setFocusable(true);
            return;
        }
        gVar.setOnClickListener(null);
        gVar.setClickable(false);
    }

    @w6.a(name = "hitSlop")
    public void setHitSlop(g gVar, Dynamic dynamic) {
        int i10 = b.f16382a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            gVar.setHitSlopRect(null);
        } else if (i10 == 2) {
            ReadableMap asMap = dynamic.asMap();
            gVar.setHitSlopRect(new Rect(asMap.hasKey("left") ? (int) r.b(asMap.getDouble("left")) : 0, asMap.hasKey("top") ? (int) r.b(asMap.getDouble("top")) : 0, asMap.hasKey("right") ? (int) r.b(asMap.getDouble("right")) : 0, asMap.hasKey("bottom") ? (int) r.b(asMap.getDouble("bottom")) : 0));
        } else if (i10 == 3) {
            int b10 = (int) r.b(dynamic.asDouble());
            gVar.setHitSlopRect(new Rect(b10, b10, b10, b10));
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for 'hitSlop' value " + dynamic.getType());
        }
    }

    @w6.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(g gVar, ReadableMap readableMap) {
        gVar.setTranslucentBackgroundDrawable(readableMap == null ? null : d.a(gVar.getContext(), readableMap));
    }

    @w6.a(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(g gVar, ReadableMap readableMap) {
        gVar.setForeground(readableMap == null ? null : d.a(gVar.getContext(), readableMap));
    }

    @w6.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(g gVar, boolean z10) {
        gVar.setNeedsOffscreenAlphaCompositing(z10);
    }

    @w6.a(name = "overflow")
    public void setOverflow(g gVar, String str) {
        gVar.setOverflow(str);
    }

    @w6.a(name = "pointerEvents")
    public void setPointerEvents(g gVar, String str) {
        gVar.setPointerEvents(s.c(str));
    }

    @w6.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(g gVar, boolean z10) {
        if (z10) {
            gVar.setFocusable(true);
            gVar.setFocusableInTouchMode(true);
            gVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(n0 n0Var) {
        return new g(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setOpacity(g gVar, float f10) {
        gVar.setOpacityIfPossible(f10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setTransform(g gVar, ReadableArray readableArray) {
        super.setTransform((ReactViewManager) gVar, readableArray);
        gVar.s();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            handleHotspotUpdate(gVar, readableArray);
        } else if (i10 != 2) {
        } else {
            handleSetPressed(gVar, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(gVar, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(gVar, readableArray);
        }
    }
}
