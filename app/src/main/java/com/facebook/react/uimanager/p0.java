package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* compiled from: TransformHelper.java */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<double[]> f15921a = new a();

    /* compiled from: TransformHelper.java */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<double[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d10;
        boolean z10 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z10 = false;
            }
            d10 = Float.parseFloat(string);
        } else {
            d10 = readableMap.getDouble(str);
        }
        return z10 ? d10 : k.l(d10);
    }

    public static void b(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = f15921a.get();
        k.r(dArr);
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                dArr[i10] = readableArray.getDouble(i10);
            }
            return;
        }
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            String nextKey = map.keySetIterator().nextKey();
            k.r(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i12 = 0; i12 < 16; i12++) {
                    dArr2[i12] = array.getDouble(i12);
                }
            } else if ("perspective".equals(nextKey)) {
                k.a(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                k.b(dArr2, a(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                k.c(dArr2, a(map, nextKey));
            } else if (!"rotate".equals(nextKey) && !"rotateZ".equals(nextKey)) {
                if ("scale".equals(nextKey)) {
                    double d10 = map.getDouble(nextKey);
                    k.e(dArr2, d10);
                    k.f(dArr2, d10);
                } else if ("scaleX".equals(nextKey)) {
                    k.e(dArr2, map.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    k.f(dArr2, map.getDouble(nextKey));
                } else if ("translate".equals(nextKey)) {
                    ReadableArray array2 = map.getArray(nextKey);
                    k.j(dArr2, array2.getDouble(0), array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                } else if ("translateX".equals(nextKey)) {
                    k.i(dArr2, map.getDouble(nextKey), 0.0d);
                } else if ("translateY".equals(nextKey)) {
                    k.i(dArr2, 0.0d, map.getDouble(nextKey));
                } else if ("skewX".equals(nextKey)) {
                    k.g(dArr2, a(map, nextKey));
                } else if ("skewY".equals(nextKey)) {
                    k.h(dArr2, a(map, nextKey));
                } else {
                    throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                }
            } else {
                k.d(dArr2, a(map, nextKey));
            }
            k.p(dArr, dArr, dArr2);
        }
    }
}
