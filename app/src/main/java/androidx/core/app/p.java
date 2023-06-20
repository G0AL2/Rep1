package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class p implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f2599a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f2600b;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private p(Context context) {
        this.f2600b = context;
    }

    public static p d(Context context) {
        return new p(context);
    }

    public p a(Intent intent) {
        this.f2599a.add(intent);
        return this;
    }

    public p b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = g.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2600b.getPackageManager());
            }
            c(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public p c(ComponentName componentName) {
        int size = this.f2599a.size();
        try {
            Intent b10 = g.b(this.f2600b, componentName);
            while (b10 != null) {
                this.f2599a.add(size, b10);
                b10 = g.b(this.f2600b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (!this.f2599a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2599a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (androidx.core.content.b.j(this.f2600b, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f2600b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2599a.iterator();
    }
}
