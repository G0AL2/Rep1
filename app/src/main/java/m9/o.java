package m9;

/* compiled from: UtcTimingElement.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f34417a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34418b;

    public o(String str, String str2) {
        this.f34417a = str;
        this.f34418b = str2;
    }

    public String toString() {
        String str = this.f34417a;
        String str2 = this.f34418b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        return sb2.toString();
    }
}
