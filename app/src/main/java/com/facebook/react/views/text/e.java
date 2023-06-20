package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: FontMetricsUtil.java */
/* loaded from: classes.dex */
public class e {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        textPaint2.getTextBounds(RequestConfiguration.MAX_AD_CONTENT_RATING_T, 0, 1, new Rect());
        double height = (rect.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double height2 = (rect2.height() / 100.0f) / displayMetrics.density;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            layout.getLineBounds(i10, new Rect());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", layout.getLineLeft(i10) / displayMetrics.density);
            createMap.putDouble("y", rect3.top / displayMetrics.density);
            createMap.putDouble("width", layout.getLineWidth(i10) / displayMetrics.density);
            createMap.putDouble("height", rect3.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i10) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i10)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i10) / displayMetrics.density);
            createMap.putDouble("capHeight", height);
            createMap.putDouble("xHeight", height2);
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i10), layout.getLineEnd(i10)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
