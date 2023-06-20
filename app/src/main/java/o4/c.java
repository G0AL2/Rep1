package o4;

/* compiled from: ImageOriginRequestListener.java */
/* loaded from: classes.dex */
public class c extends y5.a {

    /* renamed from: a  reason: collision with root package name */
    private String f34958a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34959b;

    public c(String str, b bVar) {
        this.f34959b = bVar;
        l(str);
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void i(String str, String str2, boolean z10) {
        b bVar = this.f34959b;
        if (bVar != null) {
            bVar.a(this.f34958a, d.a(str2), z10, str2);
        }
    }

    public void l(String str) {
        this.f34958a = str;
    }
}
