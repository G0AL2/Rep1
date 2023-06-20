package f2;

/* compiled from: FileExtension.java */
/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f30086a;

    c(String str) {
        this.f30086a = str;
    }

    public String f() {
        return ".temp" + this.f30086a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f30086a;
    }
}
