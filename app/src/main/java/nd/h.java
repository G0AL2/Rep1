package nd;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: NativeViewGestureHandler.java */
/* loaded from: classes3.dex */
public class h extends b<h> {
    private boolean B;
    private boolean C;

    public h() {
        L(true);
    }

    private static boolean W(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // nd.b
    protected void B() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        r().onTouchEvent(obtain);
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        View r10 = r();
        int p10 = p();
        if (motionEvent.getActionMasked() == 1) {
            r10.onTouchEvent(motionEvent);
            if ((p10 == 0 || p10 == 2) && r10.isPressed()) {
                a();
            }
            g();
        } else if (p10 != 0 && p10 != 2) {
            if (p10 == 4) {
                r10.onTouchEvent(motionEvent);
            }
        } else if (this.B) {
            W(r10, motionEvent);
            r10.onTouchEvent(motionEvent);
            a();
        } else if (W(r10, motionEvent)) {
            r10.onTouchEvent(motionEvent);
            a();
        } else if (p10 != 2) {
            c();
        }
    }

    @Override // nd.b
    public boolean N(b bVar) {
        return !this.C;
    }

    @Override // nd.b
    public boolean O(b bVar) {
        if (bVar instanceof h) {
            h hVar = (h) bVar;
            if (hVar.p() == 4 && hVar.C) {
                return false;
            }
        }
        boolean z10 = !this.C;
        int p10 = p();
        return !(p10 == 4 && bVar.p() == 4 && z10) && p10 == 4 && z10;
    }

    @Override // nd.b
    public boolean P(b bVar) {
        return super.P(bVar);
    }

    public h U(boolean z10) {
        this.C = z10;
        return this;
    }

    public h V(boolean z10) {
        this.B = z10;
        return this;
    }
}
