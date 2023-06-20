package q4;

/* compiled from: RetryManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35910a;

    /* renamed from: b  reason: collision with root package name */
    private int f35911b;

    /* renamed from: c  reason: collision with root package name */
    private int f35912c;

    public d() {
        a();
    }

    public void a() {
        this.f35910a = false;
        this.f35911b = 4;
        c();
    }

    public void b() {
        this.f35912c++;
    }

    public void c() {
        this.f35912c = 0;
    }

    public void d(boolean z10) {
        this.f35910a = z10;
    }

    public boolean e() {
        return this.f35910a && this.f35912c < this.f35911b;
    }
}
