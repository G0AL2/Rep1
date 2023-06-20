package u1;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;

/* compiled from: TargetChosenReceiver.java */
/* loaded from: classes.dex */
public class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f37342a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f37343b;

    /* renamed from: c  reason: collision with root package name */
    private static p f37344c;

    /* renamed from: d  reason: collision with root package name */
    private static Callback f37345d;

    /* renamed from: e  reason: collision with root package name */
    private static Callback f37346e;

    @TargetApi(22)
    public static IntentSender a(ReactContext reactContext) {
        synchronized (f37342a) {
            if (f37343b == null) {
                f37343b = reactContext.getPackageName() + "/" + p.class.getName() + "_ACTION";
            }
            Context applicationContext = reactContext.getApplicationContext();
            p pVar = f37344c;
            if (pVar != null) {
                applicationContext.unregisterReceiver(pVar);
            }
            p pVar2 = new p();
            f37344c = pVar2;
            applicationContext.registerReceiver(pVar2, new IntentFilter(f37343b));
        }
        Intent intent = new Intent(f37343b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), p.class);
        intent.putExtra("receiver_token", f37344c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, Build.VERSION.SDK_INT >= 23 ? 1409286144 : 1342177280).getIntentSender();
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static void c(Callback callback, Callback callback2) {
        f37345d = callback;
        f37346e = callback2;
    }

    public static void d(boolean z10, Object... objArr) {
        if (z10) {
            Callback callback = f37345d;
            if (callback != null) {
                callback.invoke(objArr);
            }
        } else {
            Callback callback2 = f37346e;
            if (callback2 != null) {
                callback2.invoke(objArr);
            }
        }
        f37345d = null;
        f37346e = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f37342a) {
            if (f37344c != this) {
                return;
            }
            context.getApplicationContext().unregisterReceiver(f37344c);
            f37344c = null;
            if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                if (componentName != null) {
                    d(true, Boolean.TRUE, componentName.flattenToString());
                } else {
                    d(true, Boolean.TRUE, "OK");
                }
            }
        }
    }
}
