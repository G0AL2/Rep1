package f1;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f30015a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(View view) {
        this.f30015a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f30015a.equals(this.f30015a);
    }

    public int hashCode() {
        return this.f30015a.hashCode();
    }
}
