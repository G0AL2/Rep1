package xa;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes3.dex */
public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    float f38773a = -1.0f;

    @Override // xa.d
    public void a(m mVar, float f10, float f11, float f12) {
        mVar.n(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        mVar.l((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
