package q2;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes.dex */
public class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private int f35793a;

    /* renamed from: b  reason: collision with root package name */
    private int f35794b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35795c;

    /* renamed from: d  reason: collision with root package name */
    private final float f35796d;

    public e() {
        this(IronSourceConstants.IS_INSTANCE_NOT_FOUND, 1, 1.0f);
    }

    @Override // q2.r
    public int a() {
        return this.f35794b;
    }

    @Override // q2.r
    public int b() {
        return this.f35793a;
    }

    @Override // q2.r
    public void c(u uVar) throws u {
        this.f35794b++;
        int i10 = this.f35793a;
        this.f35793a = i10 + ((int) (i10 * this.f35796d));
        if (!d()) {
            throw uVar;
        }
    }

    protected boolean d() {
        return this.f35794b <= this.f35795c;
    }

    public e(int i10, int i11, float f10) {
        this.f35793a = i10;
        this.f35795c = i11;
        this.f35796d = f10;
    }
}
