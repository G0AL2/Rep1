package l7;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: ClickInterceptorRelativeLayout.java */
/* loaded from: classes2.dex */
public class a extends RelativeLayout {
    public a(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
