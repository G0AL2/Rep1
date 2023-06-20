package f1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: classes.dex */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f30069a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(ViewGroup viewGroup) {
        this.f30069a = viewGroup.getOverlay();
    }

    @Override // f1.b0
    public void a(Drawable drawable) {
        this.f30069a.add(drawable);
    }

    @Override // f1.b0
    public void b(Drawable drawable) {
        this.f30069a.remove(drawable);
    }

    @Override // f1.w
    public void c(View view) {
        this.f30069a.add(view);
    }

    @Override // f1.w
    public void d(View view) {
        this.f30069a.remove(view);
    }
}
