package androidx.browser.customtabs;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    class a extends c {
        a(e eVar, a.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new a(this, b.a.X(iBinder), componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
