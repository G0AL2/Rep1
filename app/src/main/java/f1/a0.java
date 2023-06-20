package f1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: classes.dex */
class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f29939a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(View view) {
        this.f29939a = view.getOverlay();
    }

    @Override // f1.b0
    public void a(Drawable drawable) {
        this.f29939a.add(drawable);
    }

    @Override // f1.b0
    public void b(Drawable drawable) {
        this.f29939a.remove(drawable);
    }
}
