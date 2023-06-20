package i3;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoConfig.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Executor f31532a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Context f31533b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f31534c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f31535d = false;

    /* renamed from: e  reason: collision with root package name */
    private static i f31536e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f31537f = false;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Handler f31538g;

    public static Context a() {
        return f31533b;
    }

    public static void b(Context context, String str, Executor executor, Handler handler) {
        f31533b = context;
        f31532a = executor;
        f31534c = str;
        f31538g = handler;
    }

    public static void c(i iVar) {
        f31536e = iVar;
    }

    public static void d(boolean z10) {
        f31535d = z10;
    }

    public static String e() {
        if (TextUtils.isEmpty(f31534c)) {
            try {
                File file = new File(a().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f31534c = file.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f31534c;
    }

    public static Handler f() {
        if (f31538g == null) {
            synchronized (b.class) {
                if (f31538g == null) {
                    HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_video_handler_thread");
                    handlerThread.start();
                    f31538g = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f31538g;
    }

    public static boolean g() {
        return f31535d;
    }

    public static i h() {
        if (f31536e == null) {
            i.a aVar = new i.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f31536e = aVar.a(10000L, timeUnit).b(10000L, timeUnit).c(10000L, timeUnit).a();
        }
        return f31536e;
    }

    public static boolean i() {
        return f31537f;
    }
}
