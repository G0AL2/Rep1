package p3;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* compiled from: WeakSurfaceCallback.java */
/* loaded from: classes.dex */
public class b implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<SurfaceHolder.Callback> f35501a;

    public b(SurfaceHolder.Callback callback) {
        this.f35501a = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback a() {
        return this.f35501a.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        SurfaceHolder.Callback callback = this.f35501a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f35501a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f35501a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
