package q2;

import android.content.Intent;

/* compiled from: AuthFailureError.java */
/* loaded from: classes.dex */
public class a extends u {

    /* renamed from: a  reason: collision with root package name */
    private Intent f35775a;

    public a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f35775a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
