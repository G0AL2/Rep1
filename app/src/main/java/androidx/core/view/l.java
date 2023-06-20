package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat.java */
/* loaded from: classes.dex */
public final class l {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
