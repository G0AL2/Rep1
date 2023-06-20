package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: ViewProps.java */
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f15852a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f15853b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f15854c = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(ReadableMap readableMap, String str) {
        char c10;
        ReadableType type;
        if (f15854c.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = readableMap.getString(str);
            return "auto".equals(string) || "box-none".equals(string);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return !readableMap.isNull("borderRightColor") && readableMap.getInt("borderRightColor") == 0;
            case 1:
                return readableMap.isNull("borderRightWidth") || readableMap.getDouble("borderRightWidth") == 0.0d;
            case 2:
                return !readableMap.isNull("borderTopColor") && readableMap.getInt("borderTopColor") == 0;
            case 3:
                return readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d;
            case 4:
                return !readableMap.isNull("borderBottomColor") && readableMap.getInt("borderBottomColor") == 0;
            case 5:
                return readableMap.isNull("borderBottomWidth") || readableMap.getDouble("borderBottomWidth") == 0.0d;
            case 6:
                return readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d;
            case 7:
                return !readableMap.isNull("borderLeftColor") && readableMap.getInt("borderLeftColor") == 0;
            case '\b':
                return readableMap.isNull("borderLeftWidth") || readableMap.getDouble("borderLeftWidth") == 0.0d;
            case '\t':
                return readableMap.isNull("overflow") || "visible".equals(readableMap.getString("overflow"));
            case '\n':
                return readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case 11:
                if (!readableMap.hasKey("backgroundColor") || (((type = readableMap.getType("backgroundColor")) != ReadableType.Number || readableMap.getInt("backgroundColor") == 0) && type == ReadableType.Null)) {
                    return !readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
                }
                return false;
            default:
                return false;
        }
    }
}
