package m8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f34264a;

    public final void d(int i10) {
        this.f34264a = i10 | this.f34264a;
    }

    public void g() {
        this.f34264a = 0;
    }

    public final void h(int i10) {
        this.f34264a = (~i10) & this.f34264a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean i(int i10) {
        return (this.f34264a & i10) == i10;
    }

    public final boolean j() {
        return i(268435456);
    }

    public final boolean k() {
        return i(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean l() {
        return i(4);
    }

    public final boolean m() {
        return i(1);
    }

    public final void n(int i10) {
        this.f34264a = i10;
    }
}
