package p1;

import android.app.Application;

/* compiled from: ProcessUtils.kt */
/* loaded from: classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35425a = new a();

    private a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        qe.k.e(processName, "getProcessName()");
        return processName;
    }
}
