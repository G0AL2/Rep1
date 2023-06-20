package nd;

import android.view.MotionEvent;

/* compiled from: GestureUtils.java */
/* loaded from: classes3.dex */
public class f {
    public static float a(MotionEvent motionEvent, boolean z10) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z10) {
            float f10 = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i10 = 0;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != actionIndex) {
                    f10 += motionEvent.getX(i11) + rawX;
                    i10++;
                }
            }
            return f10 / i10;
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getX(pointerCount2) + rawX;
    }

    public static float b(MotionEvent motionEvent, boolean z10) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z10) {
            float f10 = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i10 = 0;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != actionIndex) {
                    f10 += motionEvent.getY(i11) + rawY;
                    i10++;
                }
            }
            return f10 / i10;
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getY(pointerCount2) + rawY;
    }
}
