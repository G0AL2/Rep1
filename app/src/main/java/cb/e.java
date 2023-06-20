package cb;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f5430a;

    public e(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        String valueOf = String.valueOf(sb2.toString());
        String valueOf2 = String.valueOf(str);
        this.f5430a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final int a(int i10, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i10)) {
            return Log.i("PlayCore", b(this.f5430a, str, objArr));
        }
        return 0;
    }

    private static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e10);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb2.append(str2);
                sb2.append(" [");
                sb2.append(join);
                sb2.append("]");
                str2 = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb3.append(str);
        sb3.append(" : ");
        sb3.append(str2);
        return sb3.toString();
    }

    public final void c(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void d(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", b(this.f5430a, str, objArr), th);
        }
    }

    public final void e(String str, Object... objArr) {
        a(6, str, objArr);
    }

    public final void f(String str, Object... objArr) {
        a(4, str, objArr);
    }

    public final void g(String str, Object... objArr) {
        a(5, str, objArr);
    }
}
