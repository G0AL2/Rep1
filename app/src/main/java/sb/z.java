package sb;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    private static final z f36974b = new z();

    /* renamed from: a  reason: collision with root package name */
    private final r f36975a;

    private z() {
        r b10 = r.b();
        o.a();
        this.f36975a = b10;
    }

    public static z b() {
        return f36974b;
    }

    public final Task a() {
        return this.f36975a.a();
    }

    public final void c(Context context) {
        this.f36975a.c(context);
    }

    public final void d(FirebaseAuth firebaseAuth) {
        this.f36975a.d(firebaseAuth);
    }

    public final void e(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public final void f(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.i().p());
        edit.commit();
    }
}
