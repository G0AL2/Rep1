package oa;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f35165a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35166b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35167c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35168d;

    public a(Dialog dialog, Rect rect) {
        this.f35165a = dialog;
        this.f35166b = rect.left;
        this.f35167c = rect.top;
        this.f35168d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f35166b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f35167c + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f35168d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f35165a.onTouchEvent(obtain);
    }
}
