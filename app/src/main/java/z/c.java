package z;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<h0.d<Rect, Rect>> f39855a = new ThreadLocal<>();

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText(InneractiveMediationDefs.GENDER_MALE);
        float measureText3 = paint.measureText(str);
        float f10 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i10 = 0;
            while (i10 < length) {
                int charCount = Character.charCount(str.codePointAt(i10)) + i10;
                f10 += paint.measureText(str, i10, charCount);
                i10 = charCount;
            }
            if (measureText3 >= f10) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        h0.d<Rect, Rect> b10 = b();
        paint.getTextBounds("\udfffd", 0, 2, b10.f31049a);
        paint.getTextBounds(str, 0, length, b10.f31050b);
        return !b10.f31049a.equals(b10.f31050b);
    }

    private static h0.d<Rect, Rect> b() {
        ThreadLocal<h0.d<Rect, Rect>> threadLocal = f39855a;
        h0.d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            h0.d<Rect, Rect> dVar2 = new h0.d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        dVar.f31049a.setEmpty();
        dVar.f31050b.setEmpty();
        return dVar;
    }
}
