package b2;

/* compiled from: Marker.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f4803a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4804b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4805c;

    public h(String str, float f10, float f11) {
        this.f4803a = str;
        this.f4805c = f11;
        this.f4804b = f10;
    }

    public boolean a(String str) {
        if (this.f4803a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f4803a.endsWith("\r")) {
            String str2 = this.f4803a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
