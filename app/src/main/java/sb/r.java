package sb;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    private static final List f36958c = new ArrayList(Arrays.asList("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"));

    /* renamed from: d  reason: collision with root package name */
    private static final r f36959d = new r();

    /* renamed from: a  reason: collision with root package name */
    private Task f36960a;

    /* renamed from: b  reason: collision with root package name */
    private long f36961b = 0;

    private r() {
    }

    public static r b() {
        return f36959d;
    }

    private static final void e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : f36958c) {
            edit.remove(str);
        }
        edit.commit();
    }

    public final Task a() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.f36961b < 3600000) {
            return this.f36960a;
        }
        return null;
    }

    public final void c(Context context) {
        Preconditions.checkNotNull(context);
        e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f36961b = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.r.d(com.google.firebase.auth.FirebaseAuth):void");
    }
}
