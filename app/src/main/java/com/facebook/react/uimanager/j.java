package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;

/* compiled from: LayoutShadowNode.java */
/* loaded from: classes.dex */
public class j extends e0 {

    /* renamed from: y  reason: collision with root package name */
    private final b f15865y = new b(null);

    /* compiled from: LayoutShadowNode.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15866a;

        static {
            int[] iArr = new int[com.facebook.yoga.u.values().length];
            f15866a = iArr;
            try {
                iArr[com.facebook.yoga.u.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15866a[com.facebook.yoga.u.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15866a[com.facebook.yoga.u.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15866a[com.facebook.yoga.u.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: LayoutShadowNode.java */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        float f15867a;

        /* renamed from: b  reason: collision with root package name */
        com.facebook.yoga.u f15868b;

        /* synthetic */ b(a aVar) {
            this();
        }

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f15868b = com.facebook.yoga.u.UNDEFINED;
                this.f15867a = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    this.f15868b = com.facebook.yoga.u.AUTO;
                    this.f15867a = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.f15868b = com.facebook.yoga.u.PERCENT;
                    this.f15867a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    throw new IllegalArgumentException("Unknown value: " + asString);
                }
            } else {
                this.f15868b = com.facebook.yoga.u.POINT;
                this.f15867a = r.b(dynamic.asDouble());
            }
        }

        private b() {
        }
    }

    private int p1(int i10) {
        if (s6.a.d().b(U())) {
            if (i10 != 0) {
                if (i10 != 2) {
                    return i10;
                }
                return 5;
            }
            return 4;
        }
        return i10;
    }

    @w6.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            C0(com.facebook.yoga.a.FLEX_START);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c10 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                C0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                C0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                C0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                C0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                C0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                C0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                C0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                C0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
        }
    }

    @w6.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            D0(com.facebook.yoga.a.STRETCH);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c10 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                D0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                D0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                D0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                D0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                D0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                D0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                D0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                D0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
        }
    }

    @w6.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            E0(com.facebook.yoga.a.AUTO);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c10 = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                E0(com.facebook.yoga.a.STRETCH);
                return;
            case 1:
                E0(com.facebook.yoga.a.BASELINE);
                return;
            case 2:
                E0(com.facebook.yoga.a.CENTER);
                return;
            case 3:
                E0(com.facebook.yoga.a.FLEX_START);
                return;
            case 4:
                E0(com.facebook.yoga.a.AUTO);
                return;
            case 5:
                E0(com.facebook.yoga.a.SPACE_BETWEEN);
                return;
            case 6:
                E0(com.facebook.yoga.a.FLEX_END);
                return;
            case 7:
                E0(com.facebook.yoga.a.SPACE_AROUND);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
        }
    }

    @w6.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        a1(f10);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i10, float f10) {
        if (R()) {
            return;
        }
        G0(p1(f1.f15852a[i10]), r.c(f10));
    }

    @w6.a(name = "collapsable")
    public void setCollapsable(boolean z10) {
    }

    @w6.a(name = "display")
    public void setDisplay(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            I0(com.facebook.yoga.i.FLEX);
        } else if (str.equals("flex")) {
            I0(com.facebook.yoga.i.FLEX);
        } else if (str.equals("none")) {
            I0(com.facebook.yoga.i.NONE);
        } else {
            throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.e0
    @w6.a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f10) {
        if (R()) {
            return;
        }
        super.setFlex(f10);
    }

    @w6.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            J0(this.f15865y.f15867a);
        } else if (i10 == 3) {
            K0();
        } else if (i10 == 4) {
            L0(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            M0(com.facebook.yoga.k.COLUMN);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c10 = 1;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                M0(com.facebook.yoga.k.ROW_REVERSE);
                return;
            case 1:
                M0(com.facebook.yoga.k.COLUMN);
                return;
            case 2:
                M0(com.facebook.yoga.k.ROW);
                return;
            case 3:
                M0(com.facebook.yoga.k.COLUMN_REVERSE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.e0
    @w6.a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f10) {
        if (R()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.e0
    @w6.a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f10) {
        if (R()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @w6.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            N0(com.facebook.yoga.w.NO_WRAP);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    c10 = 0;
                    break;
                }
                break;
            case -749527969:
                if (str.equals("wrap-reverse")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                N0(com.facebook.yoga.w.NO_WRAP);
                return;
            case 1:
                N0(com.facebook.yoga.w.WRAP_REVERSE);
                return;
            case 2:
                N0(com.facebook.yoga.w.WRAP);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
        }
    }

    @w6.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            h(this.f15865y.f15867a);
        } else if (i10 == 3) {
            b1();
        } else if (i10 == 4) {
            c1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            O0(com.facebook.yoga.l.FLEX_START);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c10 = 1;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                O0(com.facebook.yoga.l.CENTER);
                return;
            case 1:
                O0(com.facebook.yoga.l.FLEX_START);
                return;
            case 2:
                O0(com.facebook.yoga.l.SPACE_BETWEEN);
                return;
            case 3:
                O0(com.facebook.yoga.l.FLEX_END);
                return;
            case 4:
                O0(com.facebook.yoga.l.SPACE_AROUND);
                return;
            case 5:
                O0(com.facebook.yoga.l.SPACE_EVENLY);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
        }
    }

    @w6.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        if (R()) {
            return;
        }
        int p12 = p1(f1.f15853b[i10]);
        this.f15865y.a(dynamic);
        int i11 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            Q0(p12, this.f15865y.f15867a);
        } else if (i11 == 3) {
            R0(p12);
        } else if (i11 == 4) {
            S0(p12, this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            d1(this.f15865y.f15867a);
        } else if (i10 == 4) {
            e1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            f1(this.f15865y.f15867a);
        } else if (i10 == 4) {
            g1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            h1(this.f15865y.f15867a);
        } else if (i10 == 4) {
            i1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            j1(this.f15865y.f15867a);
        } else if (i10 == 4) {
            k1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "overflow")
    public void setOverflow(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            U0(com.facebook.yoga.s.VISIBLE);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    c10 = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c10 = 1;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                U0(com.facebook.yoga.s.HIDDEN);
                return;
            case 1:
                U0(com.facebook.yoga.s.SCROLL);
                return;
            case 2:
                U0(com.facebook.yoga.s.VISIBLE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
        }
    }

    @w6.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (R()) {
            return;
        }
        int p12 = p1(f1.f15853b[i10]);
        this.f15865y.a(dynamic);
        int i11 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            V0(p12, this.f15865y.f15867a);
        } else if (i11 == 4) {
            W0(p12, this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @w6.a(name = "position")
    public void setPosition(String str) {
        if (R()) {
            return;
        }
        if (str == null) {
            Z0(com.facebook.yoga.t.RELATIVE);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    c10 = 0;
                    break;
                }
                break;
            case -554435892:
                if (str.equals("relative")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1728122231:
                if (str.equals("absolute")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Z0(com.facebook.yoga.t.STATIC);
                return;
            case 1:
                Z0(com.facebook.yoga.t.RELATIVE);
                return;
            case 2:
                Z0(com.facebook.yoga.t.ABSOLUTE);
                return;
            default:
                throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
        }
    }

    @w6.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (R()) {
            return;
        }
        int p12 = p1(new int[]{4, 5, 0, 2, 1, 3}[i10]);
        this.f15865y.a(dynamic);
        int i11 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            X0(p12, this.f15865y.f15867a);
        } else if (i11 == 4) {
            Y0(p12, this.f15865y.f15867a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.e0
    @w6.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z10) {
        super.setShouldNotifyOnLayout(z10);
    }

    @w6.a(name = "pointerenter")
    public void setShouldNotifyPointerEnter(boolean z10) {
    }

    @w6.a(name = "pointerleave")
    public void setShouldNotifyPointerLeave(boolean z10) {
    }

    @w6.a(name = "pointermove")
    public void setShouldNotifyPointerMove(boolean z10) {
    }

    @w6.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (R()) {
            return;
        }
        this.f15865y.a(dynamic);
        int i10 = a.f15866a[this.f15865y.f15868b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            S(this.f15865y.f15867a);
        } else if (i10 == 3) {
            l1();
        } else if (i10 == 4) {
            m1(this.f15865y.f15867a);
        }
        dynamic.recycle();
    }
}
