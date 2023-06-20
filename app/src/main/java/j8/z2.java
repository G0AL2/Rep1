package j8;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: b  reason: collision with root package name */
    public static final z2 f32904b = new z2(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32905a;

    public z2(boolean z10) {
        this.f32905a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z2.class == obj.getClass() && this.f32905a == ((z2) obj).f32905a;
    }

    public int hashCode() {
        return !this.f32905a ? 1 : 0;
    }
}
